/*
 * Payment Gateway API Specification.
 * The documentation here is designed to provide all of the technical guidance required to consume and integrate with our APIs for payment processing. To learn more about our APIs please visit https://docs.firstdata.com/org/gateway.
 *
 * The version of the OpenAPI document: 6.14.0.20201015.001
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.github.GBSEcom.api;

import com.github.GBSEcom.client.ApiException;
import com.github.GBSEcom.model.ClientRegistration;
import com.github.GBSEcom.model.FraudRegistrationResponse;
import com.github.GBSEcom.model.PaymentRegistration;
import com.github.GBSEcom.model.ScoreOnlyRequest;
import com.github.GBSEcom.model.ScoreOnlyResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for FraudDetectApi
 */
@Ignore
public class FraudDetectApiTest {

    private final FraudDetectApi api = new FraudDetectApi();

    
    /**
     * Client registration for fraud detect transaction.
     *
     * Use this to register client for fraud detect transaction.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void fraudClientRegistrationPostTest() throws ApiException {
        String contentType = null;
        String clientRequestId = null;
        String apiKey = null;
        Long timestamp = null;
        ClientRegistration clientRegistration = null;
        String messageSignature = null;
        String region = null;
        FraudRegistrationResponse response = api.fraudClientRegistrationPost(contentType, clientRequestId, apiKey, timestamp, clientRegistration, messageSignature, region);

        // TODO: test validations
    }
    
    /**
     * Payment registration for fraud detect transaction.
     *
     * Use this to register payment for fraud detect transaction.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void fraudPaymentRegistrationPostTest() throws ApiException {
        String contentType = null;
        String clientRequestId = null;
        String apiKey = null;
        Long timestamp = null;
        PaymentRegistration paymentRegistration = null;
        String messageSignature = null;
        String region = null;
        FraudRegistrationResponse response = api.fraudPaymentRegistrationPost(contentType, clientRequestId, apiKey, timestamp, paymentRegistration, messageSignature, region);

        // TODO: test validations
    }
    
    /**
     * Score a transaction for fraud.
     *
     * Use this to obtain a fraud score for a transaction.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void scoreOnlyTest() throws ApiException {
        String contentType = null;
        String clientRequestId = null;
        String apiKey = null;
        Long timestamp = null;
        ScoreOnlyRequest scoreOnlyRequest = null;
        String messageSignature = null;
        String region = null;
        ScoreOnlyResponse response = api.scoreOnly(contentType, clientRequestId, apiKey, timestamp, scoreOnlyRequest, messageSignature, region);

        // TODO: test validations
    }
    
}
