package com.firstdata.firstapi.simple;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.val;

@AllArgsConstructor
@Getter
public class ClientContext {

	private final com.firstdata.firstapi.client.ApiClient client;

	private final MerchantCredentials credentials;

	public static ClientContext create(final MerchantCredentials creds) {
		val apiClient = new com.firstdata.firstapi.client.ApiClient();
		return new ClientContext(apiClient, creds);
	}
}
