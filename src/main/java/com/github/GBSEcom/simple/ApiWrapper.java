package com.github.GBSEcom.simple;

import com.github.GBSEcom.client.ApiClient;

import java.util.function.Function;

class ApiWrapper<T> {

	private final T client;

	private final ClientContext context;

	protected ApiWrapper (final ClientContext clientContext, final Function<ApiClient, T> apiConstructor) {
		context = clientContext;
		client = apiConstructor.apply(context.getClient());
	}

	protected T getClient() {
		return client;
	}

	protected ClientHeaders genHeaders() {
		return context.genHeaders();
	}

	protected <P> ClientHeaders genHeaders(final P payload) {
		return context.genHeaders(payload);
	}

	protected String getDefaultRegion() {
		return context.getDefaultRegion();
	}

	protected String getDefaultStoreId() {
		return context.getDefaultStoreId();
	}
}
