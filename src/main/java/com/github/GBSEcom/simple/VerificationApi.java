package com.github.GBSEcom.simple;

import com.github.GBSEcom.client.ApiException;
import com.github.GBSEcom.model.CardVerificationRequest;
import com.github.GBSEcom.model.AccountVerificationRequest;
import com.github.GBSEcom.model.TransactionResponse;

public interface VerificationApi {
	TransactionResponse verifyCard(CardVerificationRequest payload, String region);
	TransactionResponse verifyCard(CardVerificationRequest payload);
	TransactionResponse verifyAcct(AccountVerificationRequest payload, String region);
	TransactionResponse verifyAcct(AccountVerificationRequest payload);
}

class VerificationApiImpl extends ApiWrapper<com.github.GBSEcom.api.VerificationApi> implements VerificationApi {
	public VerificationApiImpl(final ClientContext context) {
		super(context, com.github.GBSEcom.api.VerificationApi::new);
	}

	public TransactionResponse verifyCard(final CardVerificationRequest payload, final String region) throws ApiException {
		final ClientHeaders headers = genHeaders(payload);
		return getClient().verifyCard(
			headers.getContentType(),
			headers.getClientRequestId(),
			headers.getApiKey(),
			headers.getTimestamp(),
			payload,
			headers.getMessageSignature(),
			region
		);
	}

	public TransactionResponse verifyCard(final CardVerificationRequest payload) throws ApiException {
		return verifyCard(payload, getDefaultRegion());
	}

	public TransactionResponse verifyAcct(final AccountVerificationRequest payload, final String region) throws ApiException {
		final ClientHeaders headers = genHeaders(payload);
		return getClient().verifyAccount(
			headers.getContentType(),
			headers.getClientRequestId(),
			headers.getApiKey(),
			headers.getTimestamp(),
			payload,
			headers.getMessageSignature(),
			region
		);
	}

	public TransactionResponse verifyAcct(final AccountVerificationRequest payload) throws ApiException {
		return verifyAcct(payload, getDefaultRegion());
	}
}
