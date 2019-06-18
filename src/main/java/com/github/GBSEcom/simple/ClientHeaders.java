package com.github.GBSEcom.simple;

import com.github.GBSEcom.client.JSON;
import lombok.Getter;
import java.util.Optional;
import java.util.UUID;

interface ClientHeaders {
	String getContentType();
	String getClientRequestId();
	String getApiKey();
	Long getTimestamp();
	String getMessageSignature();
}

class ClientHeadersImpl<T> implements ClientHeaders {

	public static <T> ClientHeaders from(final MerchantCredentials creds, final T payload) {
		final String uuid = UUID.randomUUID().toString();
		return new ClientHeadersImpl(creds, uuid, payload);
	}

	public static ClientHeaders from(final MerchantCredentials creds) {
		return ClientHeadersImpl.from(creds, null);
	}

	public ClientHeadersImpl(final MerchantCredentials merchCreds, final String uuid, final T payloadObj) {
		creds = merchCreds;
		clientRequestId = uuid;
		payload = payloadObj;
	}

	public ClientHeadersImpl(final MerchantCredentials merchCreds, final String uuid) {
		this(merchCreds, uuid, null);
	}

	@Getter
	private final String contentType = "application/json";

	@Getter
	private final String clientRequestId;

	private final MerchantCredentials creds;

	private T payload;

	private Long timestamp;

	private String messageSignature;

	public String getApiKey() {
		return creds.getApiKey();
	}

	public Long getTimestamp() {
		if (timestamp == null) {
			timestamp = Timestamp.now().toMilliseconds();
		}
		return timestamp;
	}

	public String getMessageSignature() {
		if (messageSignature == null) {
			messageSignature = signMsg(getMsgToSign());
		}
		return messageSignature;
	}

	private String getPayload() {
		return Optional.ofNullable(payload)
			.map(p -> new JSON().serialize(p))
			.orElse("");
	}

	private String signMsg(final String msg) {
		final Hmac hmac = new Hmac(creds.getApiSecret());
		return hmac.sign(msg);
	}

	private String getMsgToSign() {
		return creds.getApiKey() +
			clientRequestId +
			getTimestamp() +
			getPayload();
	}
}
