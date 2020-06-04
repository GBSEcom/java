package com.github.GBSEcom.simple;

import com.github.GBSEcom.client.ApiException;
import com.github.GBSEcom.model.CardInfoLookupRequest;
import com.github.GBSEcom.model.AccountInfoLookupRequest;
import com.github.GBSEcom.model.CardInfoLookupResponse;

public interface InformationLookupApi {
	CardInfoLookupResponse cardInfoLookup(CardInfoLookupRequest payload, String region);
	CardInfoLookupResponse cardInfoLookup(CardInfoLookupRequest payload);
	CardInfoLookupResponse acctInfoLookup(AccountInfoLookupRequest payload, String region);
	CardInfoLookupResponse acctInfoLookup(AccountInfoLookupRequest payload);
}

class InformationLookupApiImpl extends ApiWrapper<com.github.GBSEcom.api.InformationLookupApi> implements InformationLookupApi {
	public InformationLookupApiImpl(final ClientContext context) {
		super(context, com.github.GBSEcom.api.InformationLookupApi::new);
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


	public CardInfoLookupResponse acctInfoLookup(final AccountInfoLookupRequest payload, final String region) throws ApiException {
	final ClientHeaders headers = genHeaders(payload);
	return getClient().lookupAccount(
			headers.getContentType(),
			headers.getClientRequestId(),
			headers.getApiKey(),
			headers.getTimestamp(),
			payload,
			headers.getMessageSignature(),
			region
		);
	}

	public CardInfoLookupResponse acctInfoLookup(final AccountInfoLookupRequest payload) throws ApiException {
		return acctInfoLookup(payload, getDefaultRegion());
	}
}
