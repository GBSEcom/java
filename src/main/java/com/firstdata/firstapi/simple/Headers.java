package com.firstdata.firstapi.simple;

import com.firstdata.firstapi.client.JSON;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.binary.Hex;
import org.apache.commons.codec.digest.HmacAlgorithms;
import org.apache.commons.codec.digest.HmacUtils;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.UUID;

@AllArgsConstructor
@Getter
public class Headers {
	public static String genClientRequestId() {
		return UUID.randomUUID().toString();
	}

	public static Long genTimestamp() {
		return ZonedDateTime.now(ZoneId.of("GMT"))
			.toEpochSecond() * 1000L;
	}

	public static String genMessageSignature(final String secret, final String msg) {
		final HmacUtils hmacHelper = new HmacUtils(HmacAlgorithms.HMAC_SHA_256, secret);
		final Hex hexHelper = new Hex();

		final byte[] raw = hmacHelper.hmac(msg);
		final byte[] hex = hexHelper.encode(raw);
		return Base64.encodeBase64String(hex);
	}

	public static <T> String serialize(final T payload) {
		return new JSON().serialize(payload);
	}

	public static <T> Headers from(final MerchantCredentials creds, final T payload) {
		return Headers.from(creds, Headers.serialize(payload));
	}

	public static Headers from(final MerchantCredentials creds, final String payload) {
		final String apiKey = creds.getApiKey();
		final String clientRequestId = Headers.genClientRequestId();
		final Long timestamp = Headers.genTimestamp();
		final String message = apiKey + clientRequestId + timestamp + payload;
		final String messageSignature = Headers.genMessageSignature(creds.getApiSecret(), message);
		return new Headers(ApiClientImpl.CONTENT_TYPE, clientRequestId, apiKey, timestamp, messageSignature);
	}

	private final String contentType;
	private final String clientRequestId;
	private final String apiKey;
	private final Long timestamp;
	private final String messageSignature;
}
