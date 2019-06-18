/*
 * Payment Gateway API Specification.
 * The documentation here is designed to provide all of the technical guidance required to consume and integrate with our APIs for payment processing. To learn more about our APIs please visit https://docs.firstdata.com/org/gateway.
 *
 * OpenAPI spec version: 6.6.0.20190329.001
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.github.GBSEcom.api;

import com.github.GBSEcom.client.ApiException;
import com.github.GBSEcom.model.ErrorResponse;
import com.github.GBSEcom.model.ExchangeRateRequest;
import com.github.GBSEcom.model.ExchangeRateResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CurrencyConversionApi
 */
@Ignore
public class CurrencyConversionApiTest {

    private final CurrencyConversionApi api = new CurrencyConversionApi();

    
    /**
     * Generate dynamic currency conversion transactions.
     *
     * Sale, return and lookup exchange rate with dynamic currency conversion option.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getExchangeRateTest() throws ApiException {
        String contentType = null;
        String clientRequestId = null;
        String apiKey = null;
        Long timestamp = null;
        ExchangeRateRequest exchangeRateRequest = null;
        String messageSignature = null;
        String region = null;
        ExchangeRateResponse response = api.getExchangeRate(contentType, clientRequestId, apiKey, timestamp, exchangeRateRequest, messageSignature, region);

        // TODO: test validations
    }
    
}
