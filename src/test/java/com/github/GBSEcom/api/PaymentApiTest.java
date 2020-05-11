/*
 * Payment Gateway API Specification.
 * The documentation here is designed to provide all of the technical guidance required to consume and integrate with our APIs for payment processing. To learn more about our APIs please visit https://docs.firstdata.com/org/gateway.
 *
 * OpenAPI spec version: 6.10.1.20200226.002
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.github.GBSEcom.api;

import com.github.GBSEcom.client.ApiException;
import com.github.GBSEcom.model.AuthenticationUpdateRequest;
import com.github.GBSEcom.model.ErrorResponse;
import com.github.GBSEcom.model.PrimaryTransaction;
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
 * API tests for PaymentApi
 */
@Ignore
public class PaymentApiTest {

    private final PaymentApi api = new PaymentApi();

    
    /**
     * Update a 3DSecure or UnionPay payment and continue processing.
     *
     * Use this to handle a 3DSecure redirect response or UnionPay authentication, updating the transaction and continuing processing.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void finalizeSecureTransactionTest() throws ApiException {
        String contentType = null;
        String clientRequestId = null;
        String apiKey = null;
        Long timestamp = null;
        String transactionId = null;
        AuthenticationUpdateRequest authenticationUpdateRequest = null;
        String messageSignature = null;
        String region = null;
        TransactionResponse response = api.finalizeSecureTransaction(contentType, clientRequestId, apiKey, timestamp, transactionId, authenticationUpdateRequest, messageSignature, region);

        // TODO: test validations
    }
    
    /**
     * Generate a primary transaction.
     *
     * Use this to originate a financial transaction like a sale, preauthorization, or credit.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void submitPrimaryTransactionTest() throws ApiException {
        String contentType = null;
        String clientRequestId = null;
        String apiKey = null;
        Long timestamp = null;
        PrimaryTransaction primaryTransaction = null;
        String messageSignature = null;
        String region = null;
        TransactionResponse response = api.submitPrimaryTransaction(contentType, clientRequestId, apiKey, timestamp, primaryTransaction, messageSignature, region);

        // TODO: test validations
    }
    
    /**
     * Perform a secondary transaction.
     *
     * Use this to perform a void, postAuth or return secondary transaction. Partial postAuths and returns are allowed.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void submitSecondaryTransactionTest() throws ApiException {
        String contentType = null;
        String clientRequestId = null;
        String apiKey = null;
        Long timestamp = null;
        String transactionId = null;
        SecondaryTransaction secondaryTransaction = null;
        String messageSignature = null;
        String region = null;
        String storeId = null;
        TransactionResponse response = api.submitSecondaryTransaction(contentType, clientRequestId, apiKey, timestamp, transactionId, secondaryTransaction, messageSignature, region, storeId);

        // TODO: test validations
    }
    
    /**
     * Retrieve the state of a transaction.
     *
     * Use this query to get the current state of an existing transaction.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void transactionInquiryTest() throws ApiException {
        String contentType = null;
        String clientRequestId = null;
        String apiKey = null;
        Long timestamp = null;
        String transactionId = null;
        String messageSignature = null;
        String region = null;
        String storeId = null;
        TransactionResponse response = api.transactionInquiry(contentType, clientRequestId, apiKey, timestamp, transactionId, messageSignature, region, storeId);

        // TODO: test validations
    }
    
}
