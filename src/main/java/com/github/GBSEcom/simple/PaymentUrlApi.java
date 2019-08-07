package com.github.GBSEcom.simple;

import com.github.GBSEcom.client.ApiException;
import com.github.GBSEcom.model.PaymentUrlRequest;
import com.github.GBSEcom.model.PaymentUrlResponse;

public interface PaymentUrlApi {
	PaymentUrlResponse createPaymentUrl(PaymentUrlRequest payload, String region);
	PaymentUrlResponse createPaymentUrl(PaymentUrlRequest payload);

}

class PaymentUrlApiImpl extends ApiWrapper<com.github.GBSEcom.api.PaymentUrlApi> implements PaymentUrlApi {
	public PaymentUrlApiImpl(final ClientContext context) {
		super(context, com.github.GBSEcom.api.PaymentUrlApi::new);
	}

	public PaymentUrlResponse createPaymentUrl(final PaymentUrlRequest payload, final String region) throws ApiException {
		final ClientHeaders headers = genHeaders(payload);
		return getClient().createPaymentUrl(
			headers.getContentType(),
			headers.getClientRequestId(),
			headers.getApiKey(),
			headers.getTimestamp(),
			payload,
			headers.getMessageSignature(),
			region
		);
	}

	public PaymentUrlResponse createPaymentUrl(final PaymentUrlRequest payload) throws ApiException {
		return createPaymentUrl(payload, getDefaultRegion());
	}
}
