package com.github.GBSEcom.simple;

import com.github.GBSEcom.client.ApiException;
import com.github.GBSEcom.model.PaymentTokenizationRequest;
import com.github.GBSEcom.model.PaymentTokenizationResponse;
import com.github.GBSEcom.model.PaymentCardPaymentTokenUpdateRequest;
import com.github.GBSEcom.model.PaymentTokenUpdateResponse;

public interface PaymentTokenApi {
	PaymentTokenizationResponse createPaymentToken(PaymentTokenizationRequest payload, String authorization, String region);
	PaymentTokenizationResponse createPaymentToken(PaymentTokenizationRequest payload, String authorization);
	PaymentTokenizationResponse createPaymentToken(PaymentTokenizationRequest payload);

	PaymentTokenUpdateResponse updatePaymentToken(PaymentCardPaymentTokenUpdateRequest payload, String authorization, String region);
	PaymentTokenUpdateResponse updatePaymentToken(PaymentCardPaymentTokenUpdateRequest payload, String authorization);
	PaymentTokenUpdateResponse updatePaymentToken(PaymentCardPaymentTokenUpdateRequest payload);

	PaymentTokenizationResponse deletePaymentToken(String tokenId, String authorization, String region, String storeId);
	PaymentTokenizationResponse deletePaymentToken(String tokenId, String authorization);
	PaymentTokenizationResponse deletePaymentToken(String tokenId);

	PaymentTokenizationResponse getPaymentTokenDetails(String tokenId, String authorization, String region, String storeId);
	PaymentTokenizationResponse getPaymentTokenDetails(String tokenId, String authorization);
	PaymentTokenizationResponse getPaymentTokenDetails(String tokenId);
}

class PaymentTokenApiImpl extends ApiWrapper<com.github.GBSEcom.api.PaymentTokenApi> implements PaymentTokenApi {
	public PaymentTokenApiImpl(final ClientContext context) {
		super(context, com.github.GBSEcom.api.PaymentTokenApi::new);
	}

	public PaymentTokenizationResponse createPaymentToken(final PaymentTokenizationRequest payload, final String authorization, final String region) throws ApiException {
		final ClientHeaders headers = genHeaders(payload);
		String messageSignature = null;
		if (authorization == null) {
			messageSignature = headers.getMessageSignature();
		}
		return getClient().createPaymentToken(
			headers.getContentType(),
			headers.getClientRequestId(),
			headers.getApiKey(),
			headers.getTimestamp(),
			payload,
			messageSignature,
			authorization,
			region
		);
	}

	public PaymentTokenizationResponse createPaymentToken(final PaymentTokenizationRequest payload, final String authorization) throws ApiException {
		return createPaymentToken(payload, authorization, getDefaultRegion());
	}

	public PaymentTokenizationResponse createPaymentToken(final PaymentTokenizationRequest payload) throws ApiException {
		return createPaymentToken(payload, null);
	}

	public PaymentTokenUpdateResponse updatePaymentToken(final PaymentCardPaymentTokenUpdateRequest payload, final String authorization, final String region) throws ApiException {
		final ClientHeaders headers = genHeaders(payload);
		String messageSignature = null;
		if (authorization == null) {
			messageSignature = headers.getMessageSignature();
		}
		return getClient().updatePaymentToken(
			headers.getContentType(),
			headers.getClientRequestId(),
			headers.getApiKey(),
			headers.getTimestamp(),
			payload,
			messageSignature,
			authorization,
			region
		);
	}

	public PaymentTokenUpdateResponse updatePaymentToken(final PaymentCardPaymentTokenUpdateRequest payload, final String authorization) throws ApiException {
		return updatePaymentToken(payload, authorization, getDefaultRegion());
	}

	public PaymentTokenUpdateResponse updatePaymentToken(final PaymentCardPaymentTokenUpdateRequest payload) throws ApiException {
		return updatePaymentToken(payload, null);
	}

	public PaymentTokenizationResponse deletePaymentToken(final String tokenId, final String authorization, final String region, final String storeId) throws ApiException {
		final ClientHeaders headers = genHeaders();
		String messageSignature = null;
		if (authorization == null) {
			messageSignature = headers.getMessageSignature();
		}
		return getClient().deletePaymentToken(
			headers.getContentType(),
			headers.getClientRequestId(),
			headers.getApiKey(),
			headers.getTimestamp(),
			tokenId,
			messageSignature,
			authorization,
			region,
			storeId
			);
	}

	public PaymentTokenizationResponse deletePaymentToken(final String tokenId, final String authorization) throws ApiException {
		return deletePaymentToken(tokenId, authorization, getDefaultRegion(), getDefaultStoreId());
	}

	public PaymentTokenizationResponse deletePaymentToken(final String tokenId) throws ApiException {
		return deletePaymentToken(tokenId, null);
	}

	public PaymentTokenizationResponse getPaymentTokenDetails(final String tokenId,final String authorization,final String region,final String storeId) throws ApiException {
		final ClientHeaders headers = genHeaders();
		String messageSignature = null;
		if(authorization == null) {
			messageSignature = headers.getMessageSignature();
		}
		return getClient().getPaymentTokenDetails(
			headers.getContentType(),
			headers.getClientRequestId(),
			headers.getApiKey(),
			headers.getTimestamp(),
			tokenId,
			messageSignature,
			authorization,
			region,
			storeId
			);
	}
	
	public PaymentTokenizationResponse getPaymentTokenDetails(final String tokenId,final String authorization) throws ApiException{
		return getPaymentTokenDetails(tokenId, authorization, getDefaultRegion(), getDefaultStoreId());
	}

	public PaymentTokenizationResponse getPaymentTokenDetails(final String tokenId) throws ApiException{
		return getPaymentTokenDetails(tokenId,null);
	}

}
