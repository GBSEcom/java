package com.firstdata.apiclient;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Base64;
import java.util.UUID;

public final class RequestUtil {
    public static Long timestamp() {
        return ZonedDateTime.now(ZoneId.of("GMT"))
                .toEpochSecond() * 1000L;
    }

    public static String messageSignature(final String apiSecret, final String apiKey, final String clientRequestId, final Long timestamp) {
        final String msg = apiKey + clientRequestId + timestamp;
        final byte[] digest = hmac("HmacSHA256", apiSecret.getBytes(), msg.getBytes());
        return Base64
                .getEncoder()
                .encodeToString(digest);
    }

    public static String uuid() {
        return UUID.randomUUID().toString();
    }

    public static byte[] hmac(final String algorithm, final byte[] secret, final byte[] msg) {
        final Key signingKey = new SecretKeySpec(secret, algorithm);
        final Mac digest;

        try {
            digest = Mac.getInstance(algorithm);
            digest.init(signingKey);
        } catch (NoSuchAlgorithmException | InvalidKeyException e) {
            throw new IllegalStateException("algorithm \"" + algorithm + "\" not supported by underlying implementation.");
        }

        return digest.doFinal(msg);
    }
}
