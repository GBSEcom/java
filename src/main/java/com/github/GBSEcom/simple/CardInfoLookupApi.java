package com.github.GBSEcom.simple;

import com.github.GBSEcom.client.ApiException;
import com.github.GBSEcom.model.CardInfoLookupRequest;
import com.github.GBSEcom.model.CardInfoLookupResponse;

public interface CardInfoLookupApi {
	CardInfoLookupResponse cardInfoLookup(CardInfoLookupRequest payload, String region);
	CardInfoLookupResponse cardInfoLookup(CardInfoLookupRequest payload);
}

class CardInfoLookupApiImpl extends ApiWrapper<com.github.GBSEcom.api.CardInfoLookupApi> implements CardInfoLookupApi {
	public CardInfoLookupApiImpl(final ClientContext context) {
		super(context, com.github.GBSEcom.api.CardInfoLookupApi::new);
	}

	/**
	 * Card information lookUp
	 * Use this to look up card related information such as issuer country, card function and card brand.
	 * @param payload Card information lookup payload. (required)
	 * @param region The region where client wants to process the transaction (optional)
	 * @return CardInfoLookupResponse
	 * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
	 */
	public CardInfoLookupResponse cardInfoLookup(final CardInfoLookupRequest payload, final String region) throws ApiException {
		final ClientHeaders headers = genHeaders(payload);
		return getClient().cardInfoLookup(
				headers.getContentType(),
				headers.getClientRequestId(),
				headers.getApiKey(),
				headers.getTimestamp(),
				payload,
				headers.getMessageSignature(),
				region
			);
	}

	/**
	 * Card information lookUp
	 * Use this to look up card related information such as issuer country, card function and card brand.
	 * @param payload Card information lookup payload. (required)
	 * @return CardInfoLookupResponse
	 * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
	 */
	public CardInfoLookupResponse cardInfoLookup(final CardInfoLookupRequest payload) throws ApiException {
		return cardInfoLookup(payload, getDefaultRegion());
	}
}
