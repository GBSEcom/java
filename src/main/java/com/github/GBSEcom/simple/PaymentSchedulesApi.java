package com.github.GBSEcom.simple;

import com.github.GBSEcom.client.ApiException;
import com.github.GBSEcom.model.PaymentSchedulesRequest;
import com.github.GBSEcom.model.PaymentSchedulesResponse;
import com.github.GBSEcom.model.RecurringPaymentDetailsResponse;

public interface PaymentSchedulesApi {
	PaymentSchedulesResponse cancelPaymentSchedule(String orderId, String region, String storeId);
	PaymentSchedulesResponse cancelPaymentSchedule(String orderId);

	PaymentSchedulesResponse createPaymentSchedule(PaymentSchedulesRequest payload, String region);
	PaymentSchedulesResponse createPaymentSchedule(PaymentSchedulesRequest payload);

	RecurringPaymentDetailsResponse inquiryPaymentSchedule(String orderId, String region, String storeId);
	RecurringPaymentDetailsResponse inquiryPaymentSchedule(String orderId);

	PaymentSchedulesResponse updatePaymentSchedule(String orderId, PaymentSchedulesRequest payload, String region);
	PaymentSchedulesResponse updatePaymentSchedule(String orderId, PaymentSchedulesRequest payload);
}

class PaymentSchedulesApiImpl extends ApiWrapper<com.github.GBSEcom.api.PaymentSchedulesApi> implements PaymentSchedulesApi {
	public PaymentSchedulesApiImpl(final ClientContext context) {
		super(context, com.github.GBSEcom.api.PaymentSchedulesApi::new);
	}

	public PaymentSchedulesResponse cancelPaymentSchedule(final String orderId, final String region, final String storeId) throws ApiException {
		final ClientHeaders headers = genHeaders();
		return getClient().cancelPaymentSchedule(
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

	public PaymentSchedulesResponse cancelPaymentSchedule(final String orderId) throws ApiException {
		return cancelPaymentSchedule(orderId, getDefaultRegion(), getDefaultStoreId());
	}

	public PaymentSchedulesResponse createPaymentSchedule(final PaymentSchedulesRequest payload, final String region) throws ApiException {
		final ClientHeaders headers = genHeaders(payload);
		return getClient().createPaymentSchedule(
			headers.getContentType(),
			headers.getClientRequestId(),
			headers.getApiKey(),
			headers.getTimestamp(),
			payload,
			headers.getMessageSignature(),
			region
		);
	}

	public PaymentSchedulesResponse createPaymentSchedule(final PaymentSchedulesRequest payload) throws ApiException {
		return createPaymentSchedule(payload, getDefaultRegion());
	}

	public RecurringPaymentDetailsResponse inquiryPaymentSchedule(final String orderId, final String region, final String storeId) throws ApiException {
		final ClientHeaders headers = genHeaders();
		return getClient().inquiryPaymentSchedule(
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

	public RecurringPaymentDetailsResponse inquiryPaymentSchedule(final String orderId) throws ApiException {
		return inquiryPaymentSchedule(orderId, getDefaultRegion(), getDefaultStoreId());
	}

	public PaymentSchedulesResponse updatePaymentSchedule(final String orderId, final PaymentSchedulesRequest payload, final String region) throws ApiException {
		final ClientHeaders headers = genHeaders(payload);
		return getClient().updatePaymentSchedule(
			headers.getContentType(),
			headers.getClientRequestId(),
			headers.getApiKey(),
			headers.getTimestamp(),
			orderId,
			payload,
			headers.getMessageSignature(),
			region
		);
	}

	public PaymentSchedulesResponse updatePaymentSchedule(final String orderId, final PaymentSchedulesRequest payload) throws ApiException {
		return updatePaymentSchedule(orderId, payload, getDefaultRegion());
	}
}
