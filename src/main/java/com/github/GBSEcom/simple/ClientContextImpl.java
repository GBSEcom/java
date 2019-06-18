package com.github.GBSEcom.simple;

import com.github.GBSEcom.client.ApiClient;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ClientContextImpl implements ClientContext {

	static final String DEFAULT_BASE_PATH = "https://cert.api.firstdata.com/gateway/v2";

	public static ClientContext create(final MerchantCredentials creds, final String apiBasePath, final String defaultRegion, final String defaultStoreId) {
		final ClientFactoryImpl factory = new ClientFactoryImpl(null);
		final ClientContext context = new ClientContextImpl(
			factory,
			new ApiClient(),
			creds,
			defaultRegion,
			defaultStoreId
		);
		factory.setContext(context);
		context.setApiBasePath(apiBasePath);
		return context;
	}

	public static ClientContext create(final MerchantCredentials creds, final String apiBasePath) {
		return ClientContextImpl.create(creds, apiBasePath, null, null);
	}

	public static ClientContext create(final MerchantCredentials creds) {
		return ClientContextImpl.create(creds, ClientContextImpl.DEFAULT_BASE_PATH);
	}

	private final ClientFactory factory;

	private final ApiClient client;

	private final MerchantCredentials credentials;

	private final String defaultRegion;

	private final String defaultStoreId;

	public void setApiBasePath(final String basePath) {
		client.setBasePath(basePath);
	}

	public ClientHeaders genHeaders() {
		return ClientHeadersImpl.from(getCredentials());
	}

	public <T> ClientHeaders genHeaders(final T payload) {
		return ClientHeadersImpl.from(getCredentials(), payload);
	}

}
