/*
 * Payment Gateway API Specification.
 * Payment Gateway API for payment processing. Version 6.4.0.20181018.001 
 *
 * OpenAPI spec version: 6.4.0.20181018.001
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.github.GBSEcom.api;

import com.github.GBSEcom.client.ApiException;
import com.github.GBSEcom.model.ErrorResponse;
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
