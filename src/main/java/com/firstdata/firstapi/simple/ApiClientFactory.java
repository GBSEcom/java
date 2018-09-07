package com.firstdata.firstapi.simple;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ApiClientFactory {

    public static ApiClientFactory create(final MerchantCredentials creds) {
        return new ApiClientFactory(creds);
    }

    private final MerchantCredentials creds;

    public AuthenticationApiClient authentication() {
        return AuthenticationApiClient.create(creds);
    }

    public PaymentApiClient payments() {
        return PaymentApiClient.create(creds);
    }

    public OrderApiClient orders() {
        return OrderApiClient.create(creds);
    }
}

