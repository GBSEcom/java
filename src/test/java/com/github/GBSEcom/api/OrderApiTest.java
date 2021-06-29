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
     * Retrieve the state of an order.
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
     * Perform return or postAuth secondary transactions.
     *
     * Use this to perform a postAuth or return secondary transaction using order ID. Partial postAuths and returns are allowed.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void submitSecondaryTransactionFromOrderTest() throws ApiException {
        String contentType = null;
        String clientRequestId = null;
        String apiKey = null;
        Long timestamp = null;
        String orderId = null;
        SecondaryTransaction secondaryTransaction = null;
        String messageSignature = null;
        String region = null;
        TransactionResponse response = api.submitSecondaryTransactionFromOrder(contentType, clientRequestId, apiKey, timestamp, orderId, secondaryTransaction, messageSignature, region);

        // TODO: test validations
    }
    
}
