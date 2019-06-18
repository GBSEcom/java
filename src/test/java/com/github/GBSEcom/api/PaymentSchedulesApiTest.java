/*
 * Payment Gateway API Specification.
 * The documentation here is designed to provide all of the technical guidance required to consume and integrate with our APIs for payment processing. To learn more about our APIs please visit https://docs.firstdata.com/org/gateway.
 *
 * OpenAPI spec version: 6.6.0.20190329.001
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.github.GBSEcom.api;

import com.github.GBSEcom.client.ApiException;
import com.github.GBSEcom.model.ErrorResponse;
import com.github.GBSEcom.model.PaymentSchedulesErrorResponse;
import com.github.GBSEcom.model.PaymentSchedulesRequest;
import com.github.GBSEcom.model.PaymentSchedulesResponse;
import com.github.GBSEcom.model.RecurringPaymentDetailsResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PaymentSchedulesApi
 */
@Ignore
public class PaymentSchedulesApiTest {

    private final PaymentSchedulesApi api = new PaymentSchedulesApi();

    
    /**
     * Cancel a gateway payment schedule.
     *
     * Use this to cancel an existing gateway payment schedule.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cancelPaymentScheduleTest() throws ApiException {
        String contentType = null;
        String clientRequestId = null;
        String apiKey = null;
        Long timestamp = null;
        String orderId = null;
        String messageSignature = null;
        String region = null;
        String storeId = null;
        PaymentSchedulesResponse response = api.cancelPaymentSchedule(contentType, clientRequestId, apiKey, timestamp, orderId, messageSignature, region, storeId);

        // TODO: test validations
    }
    
    /**
     * Create gateway payment schedule.
     *
     * Use this to create a gateway payment schedule.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createPaymentScheduleTest() throws ApiException {
        String contentType = null;
        String clientRequestId = null;
        String apiKey = null;
        Long timestamp = null;
        PaymentSchedulesRequest paymentSchedulesRequest = null;
        String messageSignature = null;
        String region = null;
        PaymentSchedulesResponse response = api.createPaymentSchedule(contentType, clientRequestId, apiKey, timestamp, paymentSchedulesRequest, messageSignature, region);

        // TODO: test validations
    }
    
    /**
     * View a gateway payment schedule.
     *
     * Use this to view an existing gateway payment schedule.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void inquiryPaymentScheduleTest() throws ApiException {
        String contentType = null;
        String clientRequestId = null;
        String apiKey = null;
        Long timestamp = null;
        String orderId = null;
        String messageSignature = null;
        String region = null;
        String storeId = null;
        RecurringPaymentDetailsResponse response = api.inquiryPaymentSchedule(contentType, clientRequestId, apiKey, timestamp, orderId, messageSignature, region, storeId);

        // TODO: test validations
    }
    
    /**
     * Update a gateway payment schedule.
     *
     * Use this to update a gateway payment schedule.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updatePaymentScheduleTest() throws ApiException {
        String contentType = null;
        String clientRequestId = null;
        String apiKey = null;
        Long timestamp = null;
        String orderId = null;
        PaymentSchedulesRequest paymentSchedulesRequest = null;
        String messageSignature = null;
        String region = null;
        String storeId = null;
        PaymentSchedulesResponse response = api.updatePaymentSchedule(contentType, clientRequestId, apiKey, timestamp, orderId, paymentSchedulesRequest, messageSignature, region, storeId);

        // TODO: test validations
    }
    
}
