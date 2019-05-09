package com.github.GBSEcom.simple;

import com.github.GBSEcom.client.ApiException;
import com.github.GBSEcom.model.OrderResponse;
import com.github.GBSEcom.model.SecondaryTransaction;
import com.github.GBSEcom.model.TransactionResponse;

public interface OrderApi {
	OrderResponse orderInquiry(String orderId, String region, String storeId);
	OrderResponse orderInquiry(String orderId);

	TransactionResponse orderPostAuth(String orderId, SecondaryTransaction payload, String region, String storeId);
	TransactionResponse orderPostAuth(String orderId, SecondaryTransaction payload);

	TransactionResponse orderReturnTransaction(String orderId, SecondaryTransaction payload, String region, String storeId);
	TransactionResponse orderReturnTransaction(String orderId, SecondaryTransaction payload);
}

class OrderApiImpl extends ApiWrapper<com.github.GBSEcom.api.OrderApi> implements OrderApi {
	public OrderApiImpl(final ClientContext context) {
		super(context, com.github.GBSEcom.api.OrderApi::new);
	}

	public OrderResponse orderInquiry(final String orderId, final String region, final String storeId) throws ApiException {
		final ClientHeaders headers = genHeaders();
		return getClient().orderInquiry(
			headers.getContentType(),
			headers.getClientRequestId(),
			headers.getApiKey(),
			headers.getTimestamp(),
			orderId,
			headers.getMessageSignature(),
			region,
			storeId
		);
	}

	public OrderResponse orderInquiry(final String orderId) throws ApiException {
		return orderInquiry(orderId, getDefaultRegion(), getDefaultStoreId());
	}

	public TransactionResponse orderPostAuth(final String orderId, final SecondaryTransaction payload, final String region, final String storeId) throws ApiException {
		final ClientHeaders headers = genHeaders(payload);
		return getClient().orderPostAuth(
			headers.getContentType(),
			headers.getClientRequestId(),
			headers.getApiKey(),
			headers.getTimestamp(),
			orderId,
			payload,
			headers.getMessageSignature(),
			region,
			storeId
		);
	}

	public TransactionResponse orderPostAuth(final String orderId, final SecondaryTransaction payload) throws ApiException {
		return orderPostAuth(orderId, payload, getDefaultRegion(), getDefaultStoreId());
	}

	public TransactionResponse orderReturnTransaction(final String orderId, final SecondaryTransaction payload, final String region, final String storeId) throws ApiException {
		final ClientHeaders headers = genHeaders(payload);
		return getClient().orderReturnTransaction(
			headers.getContentType(),
			headers.getClientRequestId(),
			headers.getApiKey(),
			headers.getTimestamp(),
			orderId,
			payload,
			headers.getMessageSignature(),
			region,
			storeId
		);
	}

	public TransactionResponse orderReturnTransaction(final String orderId, final SecondaryTransaction payload) throws ApiException {
		return orderReturnTransaction(orderId, payload, getDefaultRegion(), getDefaultStoreId());
	}
}
