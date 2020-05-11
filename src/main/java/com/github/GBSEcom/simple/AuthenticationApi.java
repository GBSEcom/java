package com.github.GBSEcom.simple;

import com.github.GBSEcom.client.ApiException;
import com.github.GBSEcom.model.AccessTokenResponse;
import com.github.GBSEcom.model.AccessTokenRequest;

public interface AuthenticationApi {
	AccessTokenResponse getAccessToken(AccessTokenRequest accessTokenRequest);

	
}

class AuthenticationApiImpl extends ApiWrapper<com.github.GBSEcom.api.AuthenticationApi> implements AuthenticationApi {

	public AuthenticationApiImpl(final ClientContext context) {
		super(context, com.github.GBSEcom.api.AuthenticationApi::new);
	}

	/**
	 * Generate an access token for user authentication.
	 * This is the access token generation call for authorizing subsequent financial transactions. A valid access token is required for web client requests.
	 * @return AccessTokenResponse
	 * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
	 */
	public AccessTokenResponse getAccessToken(final AccessTokenRequest accessTokenRequest) throws ApiException {
		final ClientHeaders headers = genHeaders(accessTokenRequest);
		return getClient().authenticationAccessTokensPost(
			headers.getContentType(),
			headers.getClientRequestId(),
			headers.getApiKey(),
			headers.getTimestamp(),
			accessTokenRequest,
			headers.getMessageSignature()
		);
	}
}
