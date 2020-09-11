/*
 * Payment Gateway API Specification.
 * The documentation here is designed to provide all of the technical guidance required to consume and integrate with our APIs for payment processing. To learn more about our APIs please visit https://docs.firstdata.com/org/gateway.
 *
 * The version of the OpenAPI document: 6.13.0.20200810.001
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.github.GBSEcom.model;

import com.github.GBSEcom.model.Customer;
import com.github.GBSEcom.model.FraudRegistration;
import com.github.GBSEcom.model.FraudRegistrationDevice;
import com.github.GBSEcom.model.IssuerResponse;
import com.github.GBSEcom.model.Merchant;
import com.github.GBSEcom.model.RegistrationMethod;
import com.github.GBSEcom.model.Verification3ds;
import com.github.GBSEcom.model.VerificationAvs;
import com.github.GBSEcom.model.VerificationCvv;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


/**
 * Model tests for PaymentRegistration
 */
public class PaymentRegistrationTest {
    private final PaymentRegistration model = new PaymentRegistration();

    /**
     * Model tests for PaymentRegistration
     */
    @Test
    public void testPaymentRegistration() {
        // TODO: test PaymentRegistration
    }

    /**
     * Test the property 'merchantRef'
     */
    @Test
    public void merchantRefTest() {
        // TODO: test merchantRef
    }

    /**
     * Test the property 'transactionType'
     */
    @Test
    public void transactionTypeTest() {
        // TODO: test transactionType
    }

    /**
     * Test the property 'customer'
     */
    @Test
    public void customerTest() {
        // TODO: test customer
    }

    /**
     * Test the property 'merchant'
     */
    @Test
    public void merchantTest() {
        // TODO: test merchant
    }

    /**
     * Test the property 'device'
     */
    @Test
    public void deviceTest() {
        // TODO: test device
    }

    /**
     * Test the property 'userDefined'
     */
    @Test
    public void userDefinedTest() {
        // TODO: test userDefined
    }

    /**
     * Test the property 'originalTransactionType'
     */
    @Test
    public void originalTransactionTypeTest() {
        // TODO: test originalTransactionType
    }

    /**
     * Test the property 'issuerResponse'
     */
    @Test
    public void issuerResponseTest() {
        // TODO: test issuerResponse
    }

    /**
     * Test the property 'verificationAvs'
     */
    @Test
    public void verificationAvsTest() {
        // TODO: test verificationAvs
    }

    /**
     * Test the property 'verification3ds'
     */
    @Test
    public void verification3dsTest() {
        // TODO: test verification3ds
    }

    /**
     * Test the property 'verificationCvv'
     */
    @Test
    public void verificationCvvTest() {
        // TODO: test verificationCvv
    }

    /**
     * Test the property 'registrationMethod'
     */
    @Test
    public void registrationMethodTest() {
        // TODO: test registrationMethod
    }

}
