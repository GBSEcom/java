package com.github.GBSEcom.simple;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.binary.Hex;
import org.apache.commons.codec.digest.HmacAlgorithms;
import org.apache.commons.codec.digest.HmacUtils;
import java.util.Optional;

public class Hmac {
	private final HmacUtils hmacHelper;
	private final Hex hexHelper;

	public Hmac(final String secretKey) {
		hmacHelper = new HmacUtils(HmacAlgorithms.HMAC_SHA_256, secretKey);
		hexHelper = new Hex();
	}

	public String sign(final String msg) {
		return Optional.of(msg)
			.map(hmacHelper::hmac)
			.map(hexHelper::encode)
			.map(Base64::encodeBase64String)
			.get();
	}
}
