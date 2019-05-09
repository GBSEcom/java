package com.github.GBSEcom.simple;

import com.github.GBSEcom.client.ApiException;
import com.github.GBSEcom.model.AccessTokenResponse;

public interface AuthenticationApi {
	AccessTokenResponse getAccessToken();
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
	public AccessTokenResponse getAccessToken() throws ApiException {
		final ClientHeaders headers = genHeaders();
		return getClient().v1AuthenticationAccessTokensPost(
			headers.getContentType(),
			headers.getClientRequestId(),
			headers.getApiKey(),
			headers.getTimestamp(),
			headers.getMessageSignature()
		);
	}
}
