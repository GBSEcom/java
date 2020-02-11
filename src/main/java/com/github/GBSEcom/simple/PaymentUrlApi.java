package com.github.GBSEcom.simple;

import com.github.GBSEcom.client.ApiException;
import com.github.GBSEcom.model.PaymentUrlRequest;
import com.github.GBSEcom.model.PaymentUrlResponse;
import com.github.GBSEcom.model.PaymentUrlDetailResponse;


public interface PaymentUrlApi {
	PaymentUrlResponse createPaymentUrl(PaymentUrlRequest payload, String region);
	PaymentUrlResponse createPaymentUrl(PaymentUrlRequest payload);

	PaymentUrlResponse deletePaymentUrl(String region, String storeId, String transactionId, String orderId, String paymentUrlId, String transactionTime);
	PaymentUrlResponse deletePaymentUrl(String transactionId, String orderId, String paymentUrlId, String transactionTime);

	PaymentUrlDetailResponse paymentUrlDetail(String fromDate, String toDate, String region, String storeId, String orderId, String merchantTransactionId, String status);
	PaymentUrlDetailResponse paymentUrlDetail(String fromDate, String toDate, String orderId, String merchantTransactionId, String status);
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

	public PaymentUrlResponse deletePaymentUrl(final String region,final String storeId,final String transactionId,final String orderId,final String paymentUrlId,final String transactionTime) throws ApiException{
		final ClientHeaders headers = genHeaders();
		return getClient().deletePaymentUrl(
			headers.getContentType(),
			headers.getClientRequestId(),
			headers.getApiKey(),
			headers.getTimestamp(),
			headers.getMessageSignature(),
			region,
			storeId,
			transactionId,
			orderId,
			paymentUrlId,
			transactionTime
			);

	}

	public PaymentUrlResponse deletePaymentUrl(final String transactionId,final String orderId,final String paymentUrlId,final String transactionTime ) throws ApiException{
		return deletePaymentUrl(getDefaultRegion(),getDefaultStoreId(),transactionId,orderId,paymentUrlId,transactionTime);
	}

	public PaymentUrlDetailResponse paymentUrlDetail(final String fromDate,final String toDate,final String region,final String storeId,final String orderId,final String merchantTransactionId,final String status) throws ApiException{
		final ClientHeaders headers = genHeaders();
		return getClient().paymentUrlDetail(
			headers.getContentType(),
			headers.getClientRequestId(),
			headers.getApiKey(),
			headers.getTimestamp(),
			fromDate,
			toDate,
			headers.getMessageSignature(),
			region,
			storeId,
			orderId,
			merchantTransactionId,
			status
		);
	}

	public PaymentUrlDetailResponse paymentUrlDetail(final String fromDate,final String toDate,final String orderId,final String merchantTransactionId,final String status) throws ApiException{
		return paymentUrlDetail(fromDate,toDate,getDefaultRegion(),getDefaultStoreId(),orderId,merchantTransactionId,status);
	}

}
