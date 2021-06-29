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

import com.github.GBSEcom.model.Amount;
import com.github.GBSEcom.model.AuthenticationRequest;
import com.github.GBSEcom.model.AuthenticationResult;
import com.github.GBSEcom.model.Order;
import com.github.GBSEcom.model.PaymentTokenPaymentMethod;
import com.github.GBSEcom.model.PaymentTokenPreAuthTransactionAllOf;
import com.github.GBSEcom.model.PrimaryTransaction;
import com.github.GBSEcom.model.SplitShipment;
import com.github.GBSEcom.model.StoredCredential;
import com.github.GBSEcom.model.SubMerchantSplit;
import com.github.GBSEcom.model.TransactionOrigin;
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
 * Model tests for PaymentTokenPreAuthTransaction
 */
public class PaymentTokenPreAuthTransactionTest {
    private final PaymentTokenPreAuthTransaction model = new PaymentTokenPreAuthTransaction();

    /**
     * Model tests for PaymentTokenPreAuthTransaction
     */
    @Test
    public void testPaymentTokenPreAuthTransaction() {
        // TODO: test PaymentTokenPreAuthTransaction
    }

    /**
     * Test the property 'requestType'
     */
    @Test
    public void requestTypeTest() {
        // TODO: test requestType
    }

    /**
     * Test the property 'transactionAmount'
     */
    @Test
    public void transactionAmountTest() {
        // TODO: test transactionAmount
    }

    /**
     * Test the property 'storeId'
     */
    @Test
    public void storeIdTest() {
        // TODO: test storeId
    }

    /**
     * Test the property 'merchantTransactionId'
     */
    @Test
    public void merchantTransactionIdTest() {
        // TODO: test merchantTransactionId
    }

    /**
     * Test the property 'transactionOrigin'
     */
    @Test
    public void transactionOriginTest() {
        // TODO: test transactionOrigin
    }

    /**
     * Test the property 'order'
     */
    @Test
    public void orderTest() {
        // TODO: test order
    }

    /**
     * Test the property 'allowPartialApproval'
     */
    @Test
    public void allowPartialApprovalTest() {
        // TODO: test allowPartialApproval
    }

    /**
     * Test the property 'paymentMethod'
     */
    @Test
    public void paymentMethodTest() {
        // TODO: test paymentMethod
    }

    /**
     * Test the property 'storedCredentials'
     */
    @Test
    public void storedCredentialsTest() {
        // TODO: test storedCredentials
    }

    /**
     * Test the property 'splitShipment'
     */
    @Test
    public void splitShipmentTest() {
        // TODO: test splitShipment
    }

    /**
     * Test the property 'settlementSplit'
     */
    @Test
    public void settlementSplitTest() {
        // TODO: test settlementSplit
    }

    /**
     * Test the property 'authenticationRequest'
     */
    @Test
    public void authenticationRequestTest() {
        // TODO: test authenticationRequest
    }

    /**
     * Test the property 'authenticationResult'
     */
    @Test
    public void authenticationResultTest() {
        // TODO: test authenticationResult
    }

    /**
     * Test the property 'decrementalFlag'
     */
    @Test
    public void decrementalFlagTest() {
        // TODO: test decrementalFlag
    }

}
