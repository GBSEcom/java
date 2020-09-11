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

import com.github.GBSEcom.model.BasicResponse;
import com.github.GBSEcom.model.BlockedCardNumber;
import com.github.GBSEcom.model.LockoutTime;
import com.github.GBSEcom.model.MaximumPurchaseAmount;
import com.github.GBSEcom.model.ResponseType;
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
 * Model tests for FraudSettingsResponse
 */
public class FraudSettingsResponseTest {
    private final FraudSettingsResponse model = new FraudSettingsResponse();

    /**
     * Model tests for FraudSettingsResponse
     */
    @Test
    public void testFraudSettingsResponse() {
        // TODO: test FraudSettingsResponse
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
     * Test the property 'storeId'
     */
    @Test
    public void storeIdTest() {
        // TODO: test storeId
    }

    /**
     * Test the property 'blockedCardNumbers'
     */
    @Test
    public void blockedCardNumbersTest() {
        // TODO: test blockedCardNumbers
    }

    /**
     * Test the property 'blockedNames'
     */
    @Test
    public void blockedNamesTest() {
        // TODO: test blockedNames
    }

    /**
     * Test the property 'blockedDomainNames'
     */
    @Test
    public void blockedDomainNamesTest() {
        // TODO: test blockedDomainNames
    }

    /**
     * Test the property 'blockedIpOrClassCAddresses'
     */
    @Test
    public void blockedIpOrClassCAddressesTest() {
        // TODO: test blockedIpOrClassCAddresses
    }

    /**
     * Test the property 'maximumPurchaseAmount'
     */
    @Test
    public void maximumPurchaseAmountTest() {
        // TODO: test maximumPurchaseAmount
    }

    /**
     * Test the property 'lockoutTime'
     */
    @Test
    public void lockoutTimeTest() {
        // TODO: test lockoutTime
    }

    /**
     * Test the property 'countryProfile'
     */
    @Test
    public void countryProfileTest() {
        // TODO: test countryProfile
    }

}
