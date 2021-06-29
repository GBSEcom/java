/*
 * Payment Gateway API Specification.
 * The documentation here is designed to provide all of the technical guidance required to consume and integrate with our APIs for payment processing. To learn more about our APIs please visit https://docs.firstdata.com/org/gateway.
 *
 * The version of the OpenAPI document: 21.3.0.20210608.001
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.github.GBSEcom.api;

import com.github.GBSEcom.client.ApiException;
import com.github.GBSEcom.model.ErrorResponse;
import com.github.GBSEcom.model.PaymentUrlDetailResponse;
import com.github.GBSEcom.model.PaymentUrlRequest;
import com.github.GBSEcom.model.PaymentUrlResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PaymentUrlApi
 */
@Ignore
public class PaymentUrlApiTest {

    private final PaymentUrlApi api = new PaymentUrlApi();

    
    /**
     * Create a payment URL.
     *
     * Use this to generate an embedding payment link.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createPaymentUrlTest() throws ApiException {
        String contentType = null;
        String clientRequestId = null;
        String apiKey = null;
        Long timestamp = null;
        PaymentUrlRequest paymentUrlRequest = null;
        String messageSignature = null;
        String region = null;
        PaymentUrlResponse response = api.createPaymentUrl(contentType, clientRequestId, apiKey, timestamp, paymentUrlRequest, messageSignature, region);

        // TODO: test validations
    }
    
    /**
     * Delete a payment URL.
     *
     * Use this to delete an embedding payment link.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deletePaymentUrlTest() throws ApiException {
        String contentType = null;
        String clientRequestId = null;
        String apiKey = null;
        Long timestamp = null;
        String messageSignature = null;
        String region = null;
        String storeId = null;
        String transactionId = null;
        String orderId = null;
        String paymentUrlId = null;
        String transactionTime = null;
        PaymentUrlResponse response = api.deletePaymentUrl(contentType, clientRequestId, apiKey, timestamp, messageSignature, region, storeId, transactionId, orderId, paymentUrlId, transactionTime);

        // TODO: test validations
    }
    
    /**
     * Retrieve the state of payment URL.
     *
     * Use this query to get the current state of an existing paymentURL.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void paymentUrlDetailTest() throws ApiException {
        String contentType = null;
        String clientRequestId = null;
        String apiKey = null;
        Long timestamp = null;
        String fromDate = null;
        String toDate = null;
        String messageSignature = null;
        String region = null;
        String storeId = null;
        String orderId = null;
        String merchantTransactionId = null;
        String status = null;
        PaymentUrlDetailResponse response = api.paymentUrlDetail(contentType, clientRequestId, apiKey, timestamp, fromDate, toDate, messageSignature, region, storeId, orderId, merchantTransactionId, status);

        // TODO: test validations
    }
    
}
