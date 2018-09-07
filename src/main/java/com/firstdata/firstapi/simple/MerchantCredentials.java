package com.firstdata.firstapi.simple;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class MerchantCredentials {

    public static MerchantCredentials of(final String apiSecret, final String apiKey) {
        return new MerchantCredentials(apiSecret, apiKey);
    }

    private final String apiSecret;
    private final String apiKey;
}
