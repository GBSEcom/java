package com.github.GBSEcom.simple;

import com.github.GBSEcom.client.ApiClient;

public interface ClientContext {
	ApiClient getClient();
	ClientFactory getFactory();
	MerchantCredentials getCredentials();
	String getDefaultRegion();
	String getDefaultStoreId();
	ClientHeaders genHeaders();
	<T> ClientHeaders genHeaders(T payload);
	void setApiBasePath(String basePath);
}

