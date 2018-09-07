package com.firstdata.firstapi.simple;

import com.firstdata.firstapi.api.OrderApi;
import com.firstdata.firstapi.client.ApiClient;
import com.firstdata.firstapi.model.SecondaryTransaction;
import com.firstdata.firstapi.model.TransactionResponse;

public class OrderApiClient extends BaseApiClient<OrderApi> {

	public static OrderApiClient create(final MerchantCredentials creds) {
		return new OrderApiClient(new OrderApi(), creds);
	}

	public OrderApiClient(final OrderApi api, final MerchantCredentials creds) {
		super(api, creds);
	}

    public TransactionResponse performPaymentPostAuthorization(final String orderId, final SecondaryTransaction payload) {
      return performPaymentPostAuthorization(orderId, payload, null);
    }

	public TransactionResponse performPaymentPostAuthorization(final String orderId, final SecondaryTransaction payload, final String storeId) {
		final Long timestamp = timestamp();
		final String clientRequestId = clientRequestId();
		final String messageSignature = messageSignature(clientRequestId, timestamp, payload);
		return getApi().performPaymentPostAuthorisation(CONTENT_TYPE, clientRequestId, getApiKey(), timestamp, messageSignature, orderId, payload, storeId);
	}

    public TransactionResponse returnTransaction(final String orderId, final SecondaryTransaction payload) {
        return returnTransaction(orderId, payload, null);
    }

	public TransactionResponse returnTransaction(final String orderId, final SecondaryTransaction payload, final String storeId) {
		final Long timestamp = timestamp();
		final String clientRequestId = clientRequestId();
		final String messageSignature = messageSignature(clientRequestId, timestamp, payload);
		return getApi().returnTransaction(CONTENT_TYPE, clientRequestId, getApiKey(), timestamp, messageSignature, orderId, payload, storeId);
	}

	@Override
	protected ApiClient getInternalClient () {
		return getApi().getApiClient();
	}
}
