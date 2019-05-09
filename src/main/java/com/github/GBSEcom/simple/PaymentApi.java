package com.github.GBSEcom.simple;

import com.github.GBSEcom.client.ApiException;
import com.github.GBSEcom.model.AuthenticationResponseVerificationRequest;
import com.github.GBSEcom.model.PrimaryTransaction;
import com.github.GBSEcom.model.SecondaryTransaction;
import com.github.GBSEcom.model.TransactionResponse;

public interface PaymentApi {
	TransactionResponse finalizeSecureTransaction(String transactionId, AuthenticationResponseVerificationRequest payload, String region);
	TransactionResponse finalizeSecureTransaction(String transactionId, AuthenticationResponseVerificationRequest payload);

	TransactionResponse performPaymentPostAuthorisation(String transactionId, SecondaryTransaction payload, String region, String storeId);
	TransactionResponse performPaymentPostAuthorisation(String transactionId, SecondaryTransaction payload);

	TransactionResponse primaryPaymentTransaction(PrimaryTransaction payload, String region);
	TransactionResponse primaryPaymentTransaction(PrimaryTransaction payload);

	TransactionResponse returnTransaction(String transactionId, SecondaryTransaction payload, String region, String storeId);
	TransactionResponse returnTransaction(String transactionId, SecondaryTransaction payload);

	TransactionResponse transactionInquiry(String transactionId, String region, String storeId);
	TransactionResponse transactionInquiry(String transactionId);

	TransactionResponse voidTransaction(String transactionId, String region, String storeId);
	TransactionResponse voidTransaction(String transactionId);
}

class PaymentApiImpl extends ApiWrapper<com.github.GBSEcom.api.PaymentApi> implements PaymentApi {
	public PaymentApiImpl(final ClientContext context) {
		super(context, com.github.GBSEcom.api.PaymentApi::new);
	}

	public TransactionResponse finalizeSecureTransaction(final String transactionId, final AuthenticationResponseVerificationRequest payload, final String region) throws ApiException {
		final ClientHeaders headers = genHeaders(payload);
		return getClient().finalizeSecureTransaction(
			headers.getContentType(),
			headers.getClientRequestId(),
			headers.getApiKey(),
			headers.getTimestamp(),
			transactionId,
			payload,
			headers.getMessageSignature(),
			region
		);
	}

	public TransactionResponse finalizeSecureTransaction(final String transactionId, final AuthenticationResponseVerificationRequest payload) throws ApiException {
		return finalizeSecureTransaction(transactionId, payload, getDefaultRegion());
	}

	public TransactionResponse performPaymentPostAuthorisation(final String transactionId, final SecondaryTransaction payload, final String region, final String storeId) throws ApiException {
		final ClientHeaders headers = genHeaders(payload);
		return getClient().performPaymentPostAuthorisation(
			headers.getContentType(),
			headers.getClientRequestId(),
			headers.getApiKey(),
			headers.getTimestamp(),
			transactionId,
			payload,
			headers.getMessageSignature(),
			region,
			storeId
		);
	}

	public TransactionResponse performPaymentPostAuthorisation(final String transactionId, final SecondaryTransaction payload) throws ApiException {
		return performPaymentPostAuthorisation(transactionId, payload, getDefaultRegion(), getDefaultStoreId());
	}

	public TransactionResponse primaryPaymentTransaction(final PrimaryTransaction payload, final String region) throws ApiException {
		final ClientHeaders headers = genHeaders(payload);
		return getClient().primaryPaymentTransaction(
			headers.getContentType(),
			headers.getClientRequestId(),
			headers.getApiKey(),
			headers.getTimestamp(),
			payload,
			headers.getMessageSignature(),
			region
		);
	}

	public TransactionResponse primaryPaymentTransaction(final PrimaryTransaction payload) throws ApiException {
		return primaryPaymentTransaction(payload, getDefaultRegion());
	}

	public TransactionResponse returnTransaction(final String transactionId, final SecondaryTransaction payload, final String region, final String storeId) throws ApiException {
		final ClientHeaders headers = genHeaders(payload);
		return getClient().returnTransaction(
			headers.getContentType(),
			headers.getClientRequestId(),
			headers.getApiKey(),
			headers.getTimestamp(),
			transactionId,
			payload,
			headers.getMessageSignature(),
			region,
			storeId
		);
	}

	public TransactionResponse returnTransaction(final String transactionId, final SecondaryTransaction payload) throws ApiException {
		return returnTransaction(transactionId, payload, getDefaultRegion(), getDefaultStoreId());
	}

	public TransactionResponse transactionInquiry(final String transactionId, final String region, final String storeId) throws ApiException {
		final ClientHeaders headers = genHeaders();
		return getClient().transactionInquiry(
			headers.getContentType(),
			headers.getClientRequestId(),
			headers.getApiKey(),
			headers.getTimestamp(),
			transactionId,
			headers.getMessageSignature(),
			region,
			storeId
		);
	}

	public TransactionResponse transactionInquiry(final String transactionId) throws ApiException {
		return transactionInquiry(transactionId, getDefaultRegion(), getDefaultStoreId());
	}

	public TransactionResponse voidTransaction(final String transactionId, final String region, final String storeId) throws ApiException {
		final ClientHeaders headers = genHeaders();
		return getClient().voidTransaction(
			headers.getContentType(),
			headers.getClientRequestId(),
			headers.getApiKey(),
			headers.getTimestamp(),
			transactionId,
			headers.getMessageSignature(),
			region,
			storeId
		);
	}

	public TransactionResponse voidTransaction(final String transactionId) throws ApiException {
		return voidTransaction(transactionId, getDefaultRegion(), getDefaultStoreId());
	}
}
