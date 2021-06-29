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


package com.github.GBSEcom.model;

import com.github.GBSEcom.model.AccountUpdaterResponse;
import com.github.GBSEcom.model.AchResponse;
import com.github.GBSEcom.model.AdditionalTransactionDetails;
import com.github.GBSEcom.model.Amount;
import com.github.GBSEcom.model.CurrencyConversionResponse;
import com.github.GBSEcom.model.Error;
import com.github.GBSEcom.model.PaymentMethodDetails;
import com.github.GBSEcom.model.PaymentStepRequest;
import com.github.GBSEcom.model.PaymentTokenDetails;
import com.github.GBSEcom.model.ProcessorData;
import com.github.GBSEcom.model.ResponseType;
import com.github.GBSEcom.model.Secure3DAuthenticationResponse;
import com.github.GBSEcom.model.Secure3dResponse;
import com.github.GBSEcom.model.StandinResponseDetails;
import com.github.GBSEcom.model.TransactionOrigin;
import com.github.GBSEcom.model.TransactionResponse;
import com.github.GBSEcom.model.TransactionType;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


/**
 * Model tests for TransactionErrorResponse
 */
public class TransactionErrorResponseTest {
    private final TransactionErrorResponse model = new TransactionErrorResponse();

    /**
     * Model tests for TransactionErrorResponse
     */
    @Test
    public void testTransactionErrorResponse() {
        // TODO: test TransactionErrorResponse
    }

    /**
     * Test the property 'clientRequestId'
     */
    @Test
    public void clientRequestIdTest() {
        // TODO: test clientRequestId
    }

    /**
     * Test the property 'apiTraceId'
     */
    @Test
    public void apiTraceIdTest() {
        // TODO: test apiTraceId
    }

    /**
     * Test the property 'responseType'
     */
    @Test
    public void responseTypeTest() {
        // TODO: test responseType
    }

    /**
     * Test the property 'ipgTransactionId'
     */
    @Test
    public void ipgTransactionIdTest() {
        // TODO: test ipgTransactionId
    }

    /**
     * Test the property 'orderId'
     */
    @Test
    public void orderIdTest() {
        // TODO: test orderId
    }

    /**
     * Test the property 'transactionType'
     */
    @Test
    public void transactionTypeTest() {
        // TODO: test transactionType
    }

    /**
     * Test the property 'paymentToken'
     */
    @Test
    public void paymentTokenTest() {
        // TODO: test paymentToken
    }

    /**
     * Test the property 'transactionOrigin'
     */
    @Test
    public void transactionOriginTest() {
        // TODO: test transactionOrigin
    }

    /**
     * Test the property 'paymentMethodDetails'
     */
    @Test
    public void paymentMethodDetailsTest() {
        // TODO: test paymentMethodDetails
    }

    /**
     * Test the property 'country'
     */
    @Test
    public void countryTest() {
        // TODO: test country
    }

    /**
     * Test the property 'terminalId'
     */
    @Test
    public void terminalIdTest() {
        // TODO: test terminalId
    }

    /**
     * Test the property 'merchantId'
     */
    @Test
    public void merchantIdTest() {
        // TODO: test merchantId
    }

    /**
     * Test the property 'merchantTransactionId'
     */
    @Test
    public void merchantTransactionIdTest() {
        // TODO: test merchantTransactionId
    }

    /**
     * Test the property 'transactionTime'
     */
    @Test
    public void transactionTimeTest() {
        // TODO: test transactionTime
    }

    /**
     * Test the property 'approvedAmount'
     */
    @Test
    public void approvedAmountTest() {
        // TODO: test approvedAmount
    }

    /**
     * Test the property 'transactionStatus'
     */
    @Test
    public void transactionStatusTest() {
        // TODO: test transactionStatus
    }

    /**
     * Test the property 'transactionState'
     */
    @Test
    public void transactionStateTest() {
        // TODO: test transactionState
    }

    /**
     * Test the property 'paymentAccountReferenceNumber'
     */
    @Test
    public void paymentAccountReferenceNumberTest() {
        // TODO: test paymentAccountReferenceNumber
    }

    /**
     * Test the property 'secure3dResponse'
     */
    @Test
    public void secure3dResponseTest() {
        // TODO: test secure3dResponse
    }

    /**
     * Test the property 'standinResponseDetails'
     */
    @Test
    public void standinResponseDetailsTest() {
        // TODO: test standinResponseDetails
    }

    /**
     * Test the property 'redirectURL'
     */
    @Test
    public void redirectURLTest() {
        // TODO: test redirectURL
    }

    /**
     * Test the property 'authenticationResponse'
     */
    @Test
    public void authenticationResponseTest() {
        // TODO: test authenticationResponse
    }

    /**
     * Test the property 'schemeTransactionId'
     */
    @Test
    public void schemeTransactionIdTest() {
        // TODO: test schemeTransactionId
    }

    /**
     * Test the property 'processor'
     */
    @Test
    public void processorTest() {
        // TODO: test processor
    }

    /**
     * Test the property 'additionalDetails'
     */
    @Test
    public void additionalDetailsTest() {
        // TODO: test additionalDetails
    }

    /**
     * Test the property 'accountUpdaterResponse'
     */
    @Test
    public void accountUpdaterResponseTest() {
        // TODO: test accountUpdaterResponse
    }

    /**
     * Test the property 'achResponse'
     */
    @Test
    public void achResponseTest() {
        // TODO: test achResponse
    }

    /**
     * Test the property 'currencyConversionResponse'
     */
    @Test
    public void currencyConversionResponseTest() {
        // TODO: test currencyConversionResponse
    }

    /**
     * Test the property 'steps'
     */
    @Test
    public void stepsTest() {
        // TODO: test steps
    }

    /**
     * Test the property 'error'
     */
    @Test
    public void errorTest() {
        // TODO: test error
    }

}
