package com.firstdata.firstapi.simple;

import com.firstdata.firstapi.api.AuthenticationApi;
import com.firstdata.firstapi.api.OrderApi;
import com.firstdata.firstapi.api.PaymentApi;
import com.firstdata.firstapi.client.Configuration;
import com.firstdata.firstapi.model.AccessTokenResponse;
import com.firstdata.firstapi.model.PrimaryTransaction;
import com.firstdata.firstapi.model.SecondaryTransaction;
import com.firstdata.firstapi.model.TransactionResponse;
import com.firstdata.firstapi.util.MessageSignature;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.UUID;

public class ApiClientImpl implements ApiClient {

	public static ApiClientImpl create(final MerchantCredentials creds) {
		final com.firstdata.firstapi.client.ApiClient client = Configuration.getDefaultApiClient();
		return new ApiClientImpl(new AuthenticationApi(client), new PaymentApi(client), new OrderApi(client), creds);
	}

	private static final String CONTENT_TYPE = "application/json";

	private final AuthenticationApi authenticationApi;
	private final PaymentApi paymentApi;
	private final OrderApi orderApi;

	private final String apiSecret;
	private final String apiKey;

	private ApiClientImpl (final AuthenticationApi authApi, final PaymentApi paymentApi, final OrderApi orderApi, final MerchantCredentials creds) {
		authenticationApi = authApi;
		this.paymentApi = paymentApi;
		this.orderApi = orderApi;
		apiSecret = creds.getApiSecret();
		apiKey = creds.getApiKey();
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
		final Long timestamp = ApiClientImpl.timestamp();
		final String clientRequestId = ApiClientImpl.clientRequestId();
		final String messageSignature = messageSignature(clientRequestId, timestamp);
		return authenticationApi.v1AuthenticationAccessTokensPost(ApiClientImpl.CONTENT_TYPE, clientRequestId, apiKey, timestamp, messageSignature);
	}

	@Override
	public TransactionResponse performPaymentPostAuthorizationByTransaction (final String transactionId, final SecondaryTransaction payload) {
		return performPaymentPostAuthorizationByTransaction(transactionId, payload, null);
	}

	@Override
	public TransactionResponse performPaymentPostAuthorizationByTransaction (final String transactionId, final SecondaryTransaction payload, final String storeId) {
		final Long timestamp = ApiClientImpl.timestamp();
		final String clientRequestId = ApiClientImpl.clientRequestId();
		final String messageSignature = messageSignature(clientRequestId, timestamp, payload);
		return paymentApi.performPaymentPostAuthorisation(ApiClientImpl.CONTENT_TYPE, clientRequestId, apiKey, timestamp, messageSignature, transactionId, payload, storeId);
	}

	@Override
	public TransactionResponse primaryPaymentTransaction (final PrimaryTransaction payload) {
		final Long timestamp = ApiClientImpl.timestamp();
		final String clientRequestId = ApiClientImpl.clientRequestId();
		final String messageSignature = messageSignature(clientRequestId, timestamp, payload);
		return paymentApi.primaryPaymentTransaction(ApiClientImpl.CONTENT_TYPE, clientRequestId, apiKey, timestamp, messageSignature, payload);
	}

	@Override
	public TransactionResponse returnTransaction (final String transactionId, final SecondaryTransaction payload) {
		return returnTransaction(transactionId, payload, null);
	}

	@Override
	public TransactionResponse returnTransaction (final String transactionId, final SecondaryTransaction payload, final String storeId) {
		final Long timestamp = ApiClientImpl.timestamp();
		final String clientRequestId = ApiClientImpl.clientRequestId();
		final String messageSignature = messageSignature(clientRequestId, timestamp, payload);
		return paymentApi.returnTransaction(ApiClientImpl.CONTENT_TYPE, clientRequestId, apiKey, timestamp, messageSignature, transactionId, payload, storeId);
	}

	@Override
	public TransactionResponse transactionInquiry (final String transactionId) {
		return transactionInquiry(transactionId, null);
	}

	@Override
	public TransactionResponse transactionInquiry (final String transactionId, final String storeId) {
		final Long timestamp = ApiClientImpl.timestamp();
		final String clientRequestId = ApiClientImpl.clientRequestId();
		final String messageSignature = messageSignature(clientRequestId, timestamp);
		return paymentApi.transactionInquiry(ApiClientImpl.CONTENT_TYPE, clientRequestId, apiKey, timestamp, messageSignature, transactionId, storeId);
	}

	@Override
	public TransactionResponse voidTransaction (final String transactionId) {
		return voidTransaction(transactionId, null);
	}

	@Override
	public TransactionResponse voidTransaction (final String transactionId, final String storeId) {
		final Long timestamp = ApiClientImpl.timestamp();
		final String clientRequestId = ApiClientImpl.clientRequestId();
		final String messageSignature = messageSignature(clientRequestId, timestamp);
		return paymentApi.voidTransaction(ApiClientImpl.CONTENT_TYPE, clientRequestId, apiKey, timestamp, messageSignature, transactionId, storeId);
	}

	@Override
	public TransactionResponse performPaymentPostAuthorizationByOrder (final String orderId, final SecondaryTransaction payload) {
		return performPaymentPostAuthorizationByOrder(orderId, payload, null);
	}

	@Override
	public TransactionResponse performPaymentPostAuthorizationByOrder (final String orderId, final SecondaryTransaction payload, final String storeId) {
		final Long timestamp = ApiClientImpl.timestamp();
		final String clientRequestId = ApiClientImpl.clientRequestId();
		final String messageSignature = messageSignature(clientRequestId, timestamp, payload);
		return orderApi.performPaymentPostAuthorisation(ApiClientImpl.CONTENT_TYPE, clientRequestId, apiKey, timestamp, messageSignature, orderId, payload, storeId);
	}

	@Override
	public TransactionResponse returnTransactionByOrder (final String orderId, final SecondaryTransaction payload) {
		return returnTransactionByOrder(orderId, payload, null);
	}

	@Override
	public TransactionResponse returnTransactionByOrder (final String orderId, final SecondaryTransaction payload, final String storeId) {
		final Long timestamp = ApiClientImpl.timestamp();
		final String clientRequestId = ApiClientImpl.clientRequestId();
		final String messageSignature = messageSignature(clientRequestId, timestamp, payload);
		return orderApi.returnTransaction(ApiClientImpl.CONTENT_TYPE, clientRequestId, apiKey, timestamp, messageSignature, orderId, payload, storeId);
	}

	private static String clientRequestId() {
		return UUID.randomUUID().toString();
	}

	private static Long timestamp() {
		return ZonedDateTime.now(ZoneId.of("GMT"))
			.toEpochSecond() * 1000L;
	}

	private String messageSignature(final String clientRequestId, final Long timestamp) {
		return MessageSignature.of(apiKey, clientRequestId, timestamp, "")
			.hash(apiSecret);
	}

	private String messageSignature(final String clientRequestId, final Long timestamp, final String payload) {
		return MessageSignature.of(apiKey, clientRequestId, timestamp, payload)
			.hash(apiSecret);
	}

	private String messageSignature(final String clientRequestId, final Long timestamp, final Object payload) {
		return MessageSignature.of(apiKey, clientRequestId, timestamp, serialize(payload))
			.hash(apiSecret);
	}

	private String serialize(final Object payload) {
		return orderApi.getApiClient()
			.serialize(payload, ApiClientImpl.CONTENT_TYPE)
			.toString();
	}
}
