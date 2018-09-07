package com.firstdata.firstapi.simple;

import com.firstdata.firstapi.api.PaymentApi;
import com.firstdata.firstapi.client.ApiClient;
import com.firstdata.firstapi.model.PrimaryTransaction;
import com.firstdata.firstapi.model.SecondaryTransaction;
import com.firstdata.firstapi.model.TransactionResponse;

public class PaymentApiClient extends BaseApiClient<PaymentApi> {

	public static PaymentApiClient create(final MerchantCredentials creds) {
		return new PaymentApiClient(new PaymentApi(), creds);
	}

	public PaymentApiClient(final PaymentApi api, final MerchantCredentials creds) {
		super(api, creds);
	}

    public TransactionResponse performPaymentPostAuthorization(final String transactionId, final SecondaryTransaction payload) {
        return performPaymentPostAuthorization(transactionId, payload, null);
    }

	public TransactionResponse performPaymentPostAuthorization(final String transactionId, final SecondaryTransaction payload, final String storeId) {
		final Long timestamp = timestamp();
		final String clientRequestId = clientRequestId();
		final String messageSignature = messageSignature(clientRequestId, timestamp, payload);
		return getApi().performPaymentPostAuthorisation(CONTENT_TYPE, clientRequestId, getApiKey(), timestamp, messageSignature, transactionId, payload, storeId);
	}

	public TransactionResponse primaryPaymentTransaction(final PrimaryTransaction payload) {
		final Long timestamp = timestamp();
		final String clientRequestId = clientRequestId();
		final String messageSignature = messageSignature(clientRequestId, timestamp, payload);
		return getApi().primaryPaymentTransaction(CONTENT_TYPE, clientRequestId, getApiKey(), timestamp, messageSignature, payload);
	}

    public TransactionResponse returnTransaction(final String transactionId, final SecondaryTransaction payload) {
        return returnTransaction(transactionId, payload, null);
    }

	public TransactionResponse returnTransaction(final String transactionId, final SecondaryTransaction payload, final String storeId) {
		final Long timestamp = timestamp();
		final String clientRequestId = clientRequestId();
		final String messageSignature = messageSignature(clientRequestId, timestamp, payload);
		return getApi().returnTransaction(CONTENT_TYPE, clientRequestId, getApiKey(), timestamp, messageSignature, transactionId, payload, storeId);
	}

    public TransactionResponse transactionInquiry(final String transactionId) {
        return transactionInquiry(transactionId, null);
    }

	public TransactionResponse transactionInquiry(final String transactionId, final String storeId) {
		final Long timestamp = timestamp();
		final String clientRequestId = clientRequestId();
		final String messageSignature = messageSignature(clientRequestId, timestamp);
		return getApi().transactionInquiry(CONTENT_TYPE, clientRequestId, getApiKey(), timestamp, messageSignature, transactionId, storeId);
	}

    public TransactionResponse voidTransaction(final String transactionId) {
        return voidTransaction(transactionId, null);
    }

	public TransactionResponse voidTransaction(final String transactionId, final String storeId) {
		final Long timestamp = timestamp();
		final String clientRequestId = clientRequestId();
		final String messageSignature = messageSignature(clientRequestId, timestamp);
		return getApi().voidTransaction(CONTENT_TYPE, clientRequestId, getApiKey(), timestamp, messageSignature, transactionId, storeId);
	}

	@Override
	protected ApiClient getInternalClient() {
		return getApi().getApiClient();
	}
}
