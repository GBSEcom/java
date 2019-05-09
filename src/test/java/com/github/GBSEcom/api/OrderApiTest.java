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
import com.github.GBSEcom.model.OrderResponse;
import com.github.GBSEcom.model.SecondaryTransaction;
import com.github.GBSEcom.model.TransactionErrorResponse;
import com.github.GBSEcom.model.TransactionResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for OrderApi
 */
@Ignore
public class OrderApiTest {

    private final OrderApi api = new OrderApi();

    
    /**
     * Retrieve the state of an order
     *
     * Use this query to get the current state of an existing order.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void orderInquiryTest() throws ApiException {
        String contentType = null;
        String clientRequestId = null;
        String apiKey = null;
        Long timestamp = null;
        String orderId = null;
        String messageSignature = null;
        String region = null;
        String storeId = null;
        OrderResponse response = api.orderInquiry(contentType, clientRequestId, apiKey, timestamp, orderId, messageSignature, region, storeId);

        // TODO: test validations
    }
    
    /**
     * Capture/complete an already existing order.
     *
     * Use this to capture/complete an order. Postauths and partial postauths are allowed.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void orderPostAuthTest() throws ApiException {
        String contentType = null;
        String clientRequestId = null;
        String apiKey = null;
        Long timestamp = null;
        String orderId = null;
        SecondaryTransaction secondaryTransaction = null;
        String messageSignature = null;
        String region = null;
        String storeId = null;
        TransactionResponse response = api.orderPostAuth(contentType, clientRequestId, apiKey, timestamp, orderId, secondaryTransaction, messageSignature, region, storeId);

        // TODO: test validations
    }
    
    /**
     * Return/refund an order.
     *
     * Use this for Returns of an existing order. Partial Returns are allowed.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void orderReturnTransactionTest() throws ApiException {
        String contentType = null;
        String clientRequestId = null;
        String apiKey = null;
        Long timestamp = null;
        String orderId = null;
        SecondaryTransaction secondaryTransaction = null;
        String messageSignature = null;
        String region = null;
        String storeId = null;
        TransactionResponse response = api.orderReturnTransaction(contentType, clientRequestId, apiKey, timestamp, orderId, secondaryTransaction, messageSignature, region, storeId);

        // TODO: test validations
    }
    
}
