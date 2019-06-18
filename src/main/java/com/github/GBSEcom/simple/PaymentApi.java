package com.github.GBSEcom.simple;

import com.github.GBSEcom.client.ApiException;
import com.github.GBSEcom.model.AuthenticationVerificationRequest;
import com.github.GBSEcom.model.PrimaryTransaction;
import com.github.GBSEcom.model.SecondaryTransaction;
import com.github.GBSEcom.model.TransactionResponse;

public interface PaymentApi {
	TransactionResponse finalizeSecureTransaction(String transactionId, AuthenticationVerificationRequest payload, String region);
	TransactionResponse finalizeSecureTransaction(String transactionId, AuthenticationVerificationRequest payload);

	TransactionResponse submitPrimaryTransaction(PrimaryTransaction payload, String region);
	TransactionResponse submitPrimaryTransaction(PrimaryTransaction payload);

	TransactionResponse submitSecondaryTransaction(String transactionId, SecondaryTransaction payload, String region, String storeId);
	TransactionResponse submitSecondaryTransaction(String transactionId, SecondaryTransaction payload);

	TransactionResponse transactionInquiry(String transactionId, String region, String storeId);
	TransactionResponse transactionInquiry(String transactionId);
}

class PaymentApiImpl extends ApiWrapper<com.github.GBSEcom.api.PaymentApi> implements PaymentApi {
	public PaymentApiImpl(final ClientContext context) {
		super(context, com.github.GBSEcom.api.PaymentApi::new);
	}

	public TransactionResponse finalizeSecureTransaction(final String transactionId, final AuthenticationVerificationRequest payload, final String region) throws ApiException {
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

	public TransactionResponse finalizeSecureTransaction(final String transactionId, final AuthenticationVerificationRequest payload) throws ApiException {
		return finalizeSecureTransaction(transactionId, payload, getDefaultRegion());
	}
	public TransactionResponse submitPrimaryTransaction(final PrimaryTransaction payload, final String region) throws ApiException {
		final ClientHeaders headers = genHeaders(payload);
		return getClient().submitPrimaryTransaction(
			headers.getContentType(),
			headers.getClientRequestId(),
			headers.getApiKey(),
			headers.getTimestamp(),
			payload,
			headers.getMessageSignature(),
			region
		);
	}

	public TransactionResponse submitPrimaryTransaction(final PrimaryTransaction payload) throws ApiException {
		return submitPrimaryTransaction(payload, getDefaultRegion());
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

	public TransactionResponse submitSecondaryTransaction(final String transactionId, final SecondaryTransaction payload, final String region, final String storeId) throws ApiException {
		final ClientHeaders headers = genHeaders(payload);
		return getClient().submitSecondaryTransaction(
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

	public TransactionResponse submitSecondaryTransaction(final String transactionId, final SecondaryTransaction payload) throws ApiException {
		return submitSecondaryTransaction(transactionId, payload, getDefaultRegion(), getDefaultStoreId());
	}

	

}
