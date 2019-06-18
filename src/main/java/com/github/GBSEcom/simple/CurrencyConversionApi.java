package com.github.GBSEcom.simple;

import com.github.GBSEcom.client.ApiException;
import com.github.GBSEcom.model.ExchangeRateRequest;
import com.github.GBSEcom.model.ExchangeRateResponse;

public interface CurrencyConversionApi {
	ExchangeRateResponse getExchangeRate(ExchangeRateRequest payload, String region);
	ExchangeRateResponse getExchangeRate(ExchangeRateRequest payload);
}

class CurrencyConversionApiImpl extends ApiWrapper<com.github.GBSEcom.api.CurrencyConversionApi> implements CurrencyConversionApi {
	public CurrencyConversionApiImpl(final ClientContext context) {
		super(context, com.github.GBSEcom.api.CurrencyConversionApi::new);
	}

	public ExchangeRateResponse getExchangeRate(final ExchangeRateRequest payload, final String region) throws ApiException {
		final ClientHeaders headers = genHeaders(payload);
		return getClient().getExchangeRate(
			headers.getContentType(),
			headers.getClientRequestId(),
			headers.getApiKey(),
			headers.getTimestamp(),
			payload,
			headers.getMessageSignature(),
			region
		);
	}

	public ExchangeRateResponse getExchangeRate(final ExchangeRateRequest payload) throws ApiException {
		return getExchangeRate(payload, getDefaultRegion());
	}
}
