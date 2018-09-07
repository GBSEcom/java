package com.firstdata.firstapi.simple;

import com.firstdata.firstapi.client.ApiClient;
import com.firstdata.firstapi.util.MessageSignature;
import lombok.AccessLevel;
import lombok.Getter;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.UUID;

@Getter(AccessLevel.PROTECTED)
abstract class BaseApiClient<T>  {

	public static final String CONTENT_TYPE = "application/json";

	private final T api;
	private final String apiSecret;
	private final String apiKey;

	protected abstract ApiClient getInternalClient();

	protected BaseApiClient(final T api, final MerchantCredentials creds) {
		this.api = api;
		this.apiSecret = creds.getApiSecret();
		this.apiKey = creds.getApiKey();
	}

	protected String clientRequestId() {
		return UUID.randomUUID().toString();
	}

	protected Long timestamp() {
		return ZonedDateTime.now(ZoneId.of("GMT"))
			.toEpochSecond() * 1000L;
	}

	protected String messageSignature(final String clientRequestId, final Long timestamp) {
		return MessageSignature.of(apiKey, clientRequestId, timestamp, "")
			.hash(apiSecret);
	}

	protected String messageSignature(final String clientRequestId, final Long timestamp, final String payload) {
		return MessageSignature.of(apiKey, clientRequestId, timestamp, payload)
			.hash(apiSecret);
	}

	protected String messageSignature(final String clientRequestId, final Long timestamp, final Object payload) {
		return MessageSignature.of(apiKey, clientRequestId, timestamp, serialize(payload))
			.hash(apiSecret);
	}

	protected String serialize(final Object payload) {
		return getInternalClient()
			.serialize(payload, CONTENT_TYPE)
			.toString();
	}
}
