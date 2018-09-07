package com.firstdata.firstapi.util;

import lombok.AllArgsConstructor;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;

@AllArgsConstructor
public class MessageSignature {
	private final String apiKey;
	private final String clientRequestId;
	private final Long timestamp;
	private final String body;

	public static MessageSignature of(final String apiKey, final String clientRequestId, final Long timestamp) {
		return new MessageSignature(apiKey, clientRequestId, timestamp, "");
	}

	public static MessageSignature of(final String apiKey, final String clientRequestId, final Long timestamp, final String body) {
		return new MessageSignature(apiKey, clientRequestId, timestamp, body);
	}

	public static byte[] hmac(final String algorithm, final byte[] secret, final byte[] msg) {
		final Key signingKey = new SecretKeySpec(secret, algorithm);
		final Mac digest;

		try {
			digest = Mac.getInstance(algorithm);
			digest.init(signingKey);
		} catch (NoSuchAlgorithmException | InvalidKeyException e) {
			throw new RuntimeException("Error computing HMAC", e);
		}

		return digest.doFinal();
	}

	@Override
	public String toString () {
		return apiKey + clientRequestId + timestamp + body;
	}

	public String hash(final String apiSecret) {
		final byte[] data = MessageSignature.hmac("HmacSHA256", apiSecret.getBytes(), toString().getBytes());
		return new String(data);
	}
}
