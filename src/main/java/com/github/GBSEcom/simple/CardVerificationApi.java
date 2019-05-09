package com.github.GBSEcom.simple;

import com.github.GBSEcom.client.ApiException;
import com.github.GBSEcom.model.CardVerificationRequest;
import com.github.GBSEcom.model.TransactionResponse;

public interface CardVerificationApi {
	TransactionResponse verifyCard(CardVerificationRequest payload, String region);
	TransactionResponse verifyCard(CardVerificationRequest payload);
}

class CardVerificationApiImpl extends ApiWrapper<com.github.GBSEcom.api.CardVerificationApi> implements CardVerificationApi {
	public CardVerificationApiImpl(final ClientContext context) {
		super(context, com.github.GBSEcom.api.CardVerificationApi::new);
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
}
