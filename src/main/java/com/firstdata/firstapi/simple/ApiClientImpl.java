package com.firstdata.firstapi.simple;

import com.firstdata.firstapi.api.AuthenticationApi;
import com.firstdata.firstapi.api.OrderApi;
import com.firstdata.firstapi.api.PaymentApi;
import com.firstdata.firstapi.client.Configuration;
import com.firstdata.firstapi.model.AccessTokenResponse;
import com.firstdata.firstapi.model.PrimaryTransaction;
import com.firstdata.firstapi.model.SecondaryTransaction;
import com.firstdata.firstapi.model.TransactionResponse;

public class ApiClientImpl implements ApiClient {

	public static ApiClientImpl create(final MerchantCredentials creds) {
		final com.firstdata.firstapi.client.ApiClient client = Configuration.getDefaultApiClient();
		return new ApiClientImpl(new AuthenticationApi(client), new PaymentApi(client), new OrderApi(client), creds);
	}

	static final String CONTENT_TYPE = "application/json";

	private final AuthenticationApi authenticationApi;
	private final PaymentApi paymentApi;
	private final OrderApi orderApi;

	private final MerchantCredentials creds;

	private ApiClientImpl (
		final AuthenticationApi authApi,
		final PaymentApi paymentApi,
		final OrderApi orderApi,
		final MerchantCredentials creds
	) {
		authenticationApi = authApi;
		this.paymentApi = paymentApi;
		this.orderApi = orderApi;
		this.creds = creds;
	}

	public ApiClientImpl(final ClientContext context) {
		this(
			new AuthenticationApi(context.getClient()),
			new PaymentApi(context.getClient()),
			new OrderApi(context.getClient()),
			context.getCredentials()
		);
	}

	@Override
	public AccessTokenResponse requestAccessToken () {
		final Headers headers = headers();
		return authenticationApi.v1AuthenticationAccessTokensPost(
			headers.getContentType(),
			headers.getClientRequestId(),
			headers.getApiKey(),
			headers.getTimestamp(),
			headers.getMessageSignature()
		);
	}

	@Override
	public TransactionResponse performPaymentPostAuthorizationByTransaction (final String transactionId, final SecondaryTransaction payload) {
		return performPaymentPostAuthorizationByTransaction(transactionId, payload, null);
	}

	@Override
	public TransactionResponse performPaymentPostAuthorizationByTransaction (final String transactionId, final SecondaryTransaction payload, final String storeId) {
		final Headers headers = headers(payload);
		return paymentApi.performPaymentPostAuthorisation(
			ApiClientImpl.CONTENT_TYPE,
			headers.getClientRequestId(),
			headers.getApiKey(),
			headers.getTimestamp(),
			headers.getMessageSignature(),
			transactionId,
			payload,
			storeId
		);
	}

	@Override
	public TransactionResponse primaryPaymentTransaction (final PrimaryTransaction payload) {
		final Headers headers = headers(payload);
		return paymentApi.primaryPaymentTransaction(
			ApiClientImpl.CONTENT_TYPE,
			headers.getClientRequestId(),
			headers.getApiKey(),
			headers.getTimestamp(),
			headers.getMessageSignature(),
			payload
		);
	}

	@Override
	public TransactionResponse returnTransaction (final String transactionId, final SecondaryTransaction payload) {
		return returnTransaction(transactionId, payload, null);
	}

	@Override
	public TransactionResponse returnTransaction (final String transactionId, final SecondaryTransaction payload, final String storeId) {
		final Headers headers = headers(payload);
		return paymentApi.returnTransaction(
			ApiClientImpl.CONTENT_TYPE,
			headers.getClientRequestId(),
			headers.getApiKey(),
			headers.getTimestamp(),
			headers.getMessageSignature(),
			transactionId,
			payload,
			storeId
		);
	}

	@Override
	public TransactionResponse transactionInquiry (final String transactionId) {
		return transactionInquiry(transactionId, null);
	}

	@Override
	public TransactionResponse transactionInquiry (final String transactionId, final String storeId) {
		final Headers headers = headers();
		return paymentApi.transactionInquiry(
			ApiClientImpl.CONTENT_TYPE,
			headers.getClientRequestId(),
			headers.getApiKey(),
			headers.getTimestamp(),
			headers.getMessageSignature(),
			transactionId,
			storeId
		);
	}

	@Override
	public TransactionResponse voidTransaction (final String transactionId) {
		return voidTransaction(transactionId, null);
	}

	@Override
	public TransactionResponse voidTransaction (final String transactionId, final String storeId) {
		final Headers headers = headers();
		return paymentApi.voidTransaction(
			ApiClientImpl.CONTENT_TYPE,
			headers.getClientRequestId(),
			headers.getApiKey(),
			headers.getTimestamp(),
			headers.getMessageSignature(),
			transactionId,
			storeId
		);
	}

	@Override
	public TransactionResponse performPaymentPostAuthorizationByOrder (final String orderId, final SecondaryTransaction payload) {
		return performPaymentPostAuthorizationByOrder(orderId, payload, null);
	}

	@Override
	public TransactionResponse performPaymentPostAuthorizationByOrder (final String orderId, final SecondaryTransaction payload, final String storeId) {
		final Headers headers = headers(payload);
		return orderApi.performPaymentPostAuthorisation(
			ApiClientImpl.CONTENT_TYPE,
			headers.getClientRequestId(),
			headers.getApiKey(),
			headers.getTimestamp(),
			headers.getMessageSignature(),
			orderId,
			payload,
			storeId
		);
	}

	@Override
	public TransactionResponse returnTransactionByOrder (final String orderId, final SecondaryTransaction payload) {
		return returnTransactionByOrder(orderId, payload, null);
	}

	@Override
	public TransactionResponse returnTransactionByOrder (final String orderId, final SecondaryTransaction payload, final String storeId) {
		final Headers headers = headers(payload);
		return orderApi.returnTransaction(
			ApiClientImpl.CONTENT_TYPE,
			headers.getClientRequestId(),
			headers.getApiKey(),
			headers.getTimestamp(),
			headers.getMessageSignature(),
			orderId,
			payload,
			storeId
		);
	}

	private Headers headers() {
		return Headers.from(creds, "");
	}

	private <T> Headers headers(final T payload) {
		return Headers.from(creds, payload);
	}
}
