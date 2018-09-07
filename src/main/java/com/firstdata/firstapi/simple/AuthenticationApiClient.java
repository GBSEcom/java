package com.firstdata.firstapi.simple;

import com.firstdata.firstapi.api.AuthenticationApi;
import com.firstdata.firstapi.client.ApiClient;
import com.firstdata.firstapi.model.AccessTokenResponse;

public class AuthenticationApiClient extends BaseApiClient<AuthenticationApi> {

	public static AuthenticationApiClient create(final MerchantCredentials creds) {
		return new AuthenticationApiClient(new AuthenticationApi(), creds);
	}

	public AuthenticationApiClient(final AuthenticationApi api, final MerchantCredentials creds) {
		super(api, creds);
	}

	public AccessTokenResponse requestAccessToken() {
		final Long timestamp = timestamp();
		final String clientRequestId = clientRequestId();
		final String messageSignature = messageSignature(clientRequestId, timestamp);
		return getApi().v1AuthenticationAccessTokensPost(CONTENT_TYPE, clientRequestId, getApiKey(), timestamp, messageSignature);
	}

	@Override
	protected ApiClient getInternalClient () {
		return getApi().getApiClient();
	}
}
