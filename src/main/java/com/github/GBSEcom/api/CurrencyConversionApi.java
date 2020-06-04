/*
 * Payment Gateway API Specification.
 * The documentation here is designed to provide all of the technical guidance required to consume and integrate with our APIs for payment processing. To learn more about our APIs please visit https://docs.firstdata.com/org/gateway.
 *
 * The version of the OpenAPI document: 6.11.0.20200423.001
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.github.GBSEcom.api;

import com.github.GBSEcom.client.ApiCallback;
import com.github.GBSEcom.client.ApiClient;
import com.github.GBSEcom.client.ApiException;
import com.github.GBSEcom.client.ApiResponse;
import com.github.GBSEcom.client.Configuration;
import com.github.GBSEcom.client.Pair;
import com.github.GBSEcom.client.ProgressRequestBody;
import com.github.GBSEcom.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.github.GBSEcom.model.ErrorResponse;
import com.github.GBSEcom.model.ExchangeRateRequest;
import com.github.GBSEcom.model.ExchangeRateResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CurrencyConversionApi {
    private ApiClient localVarApiClient;

    public CurrencyConversionApi() {
        this(Configuration.getDefaultApiClient());
    }

    public CurrencyConversionApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for getExchangeRate
     * @param contentType Content type. (required)
     * @param clientRequestId A client-generated ID for request tracking and signature creation, unique per request.  This is also used for idempotency control. We recommend 128-bit UUID format. (required)
     * @param apiKey Key given to merchant after boarding associating their requests with the appropriate app in Apigee. (required)
     * @param timestamp Epoch timestamp in milliseconds in the request from a client system. Used for Message Signature generation and time limit (5 mins). (required)
     * @param exchangeRateRequest Accepted request types: DCCExchangeRateRequest and DynamicPricingExchangeRateRequest. (required)
     * @param messageSignature Used to ensure the request has not been tampered with during transmission. The Message-Signature is the Base64 encoded HMAC hash (SHA256 algorithm with the API Secret as the key.) For more information, refer to the supporting documentation on the Developer Portal. (optional)
     * @param region Indicates the region where the client wants the transaction to be processed. This will override the default processing region identified for the client. Available options are argentina, brazil, germany, india and northamerica. Region specific store setup and APIGEE boarding is required in order to use an alternate region for processing. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     *
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success response. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The request cannot be validated. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> The request cannot be authenticated or was submitted with the wrong credentials. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> The request was unauthorized. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The requested resource doesn&#39;t exist. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> An unexpected internal server error occurred. </td><td>  -  </td></tr>
        <tr><td> 502 </td><td> There was a problem communicating with the endpoint. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getExchangeRateCall(String contentType, String clientRequestId, String apiKey, Long timestamp, ExchangeRateRequest exchangeRateRequest, String messageSignature, String region, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = exchangeRateRequest;

        // create path and map variables
        String localVarPath = "/exchange-rates";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (contentType != null) {
            localVarHeaderParams.put("Content-Type", localVarApiClient.parameterToString(contentType));
        }

        if (clientRequestId != null) {
            localVarHeaderParams.put("Client-Request-Id", localVarApiClient.parameterToString(clientRequestId));
        }

        if (apiKey != null) {
            localVarHeaderParams.put("Api-Key", localVarApiClient.parameterToString(apiKey));
        }

        if (timestamp != null) {
            localVarHeaderParams.put("Timestamp", localVarApiClient.parameterToString(timestamp));
        }

        if (messageSignature != null) {
            localVarHeaderParams.put("Message-Signature", localVarApiClient.parameterToString(messageSignature));
        }

        if (region != null) {
            localVarHeaderParams.put("Region", localVarApiClient.parameterToString(region));
        }

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getExchangeRateValidateBeforeCall(String contentType, String clientRequestId, String apiKey, Long timestamp, ExchangeRateRequest exchangeRateRequest, String messageSignature, String region, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'contentType' is set
        if (contentType == null) {
            throw new ApiException("Missing the required parameter 'contentType' when calling getExchangeRate(Async)");
        }
        
        // verify the required parameter 'clientRequestId' is set
        if (clientRequestId == null) {
            throw new ApiException("Missing the required parameter 'clientRequestId' when calling getExchangeRate(Async)");
        }
        
        // verify the required parameter 'apiKey' is set
        if (apiKey == null) {
            throw new ApiException("Missing the required parameter 'apiKey' when calling getExchangeRate(Async)");
        }
        
        // verify the required parameter 'timestamp' is set
        if (timestamp == null) {
            throw new ApiException("Missing the required parameter 'timestamp' when calling getExchangeRate(Async)");
        }
        
        // verify the required parameter 'exchangeRateRequest' is set
        if (exchangeRateRequest == null) {
            throw new ApiException("Missing the required parameter 'exchangeRateRequest' when calling getExchangeRate(Async)");
        }
        

        okhttp3.Call localVarCall = getExchangeRateCall(contentType, clientRequestId, apiKey, timestamp, exchangeRateRequest, messageSignature, region, _callback);
        return localVarCall;

    }

    /**
     * Generate dynamic currency conversion transactions.
     * Sale, return and lookup exchange rate with dynamic currency conversion option.
     * @param contentType Content type. (required)
     * @param clientRequestId A client-generated ID for request tracking and signature creation, unique per request.  This is also used for idempotency control. We recommend 128-bit UUID format. (required)
     * @param apiKey Key given to merchant after boarding associating their requests with the appropriate app in Apigee. (required)
     * @param timestamp Epoch timestamp in milliseconds in the request from a client system. Used for Message Signature generation and time limit (5 mins). (required)
     * @param exchangeRateRequest Accepted request types: DCCExchangeRateRequest and DynamicPricingExchangeRateRequest. (required)
     * @param messageSignature Used to ensure the request has not been tampered with during transmission. The Message-Signature is the Base64 encoded HMAC hash (SHA256 algorithm with the API Secret as the key.) For more information, refer to the supporting documentation on the Developer Portal. (optional)
     * @param region Indicates the region where the client wants the transaction to be processed. This will override the default processing region identified for the client. Available options are argentina, brazil, germany, india and northamerica. Region specific store setup and APIGEE boarding is required in order to use an alternate region for processing. (optional)
     * @return ExchangeRateResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     *
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success response. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The request cannot be validated. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> The request cannot be authenticated or was submitted with the wrong credentials. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> The request was unauthorized. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The requested resource doesn&#39;t exist. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> An unexpected internal server error occurred. </td><td>  -  </td></tr>
        <tr><td> 502 </td><td> There was a problem communicating with the endpoint. </td><td>  -  </td></tr>
     </table>
     */
    public ExchangeRateResponse getExchangeRate(String contentType, String clientRequestId, String apiKey, Long timestamp, ExchangeRateRequest exchangeRateRequest, String messageSignature, String region) throws ApiException {
        ApiResponse<ExchangeRateResponse> localVarResp = getExchangeRateWithHttpInfo(contentType, clientRequestId, apiKey, timestamp, exchangeRateRequest, messageSignature, region);
        return localVarResp.getData();
    }

    /**
     * Generate dynamic currency conversion transactions.
     * Sale, return and lookup exchange rate with dynamic currency conversion option.
     * @param contentType Content type. (required)
     * @param clientRequestId A client-generated ID for request tracking and signature creation, unique per request.  This is also used for idempotency control. We recommend 128-bit UUID format. (required)
     * @param apiKey Key given to merchant after boarding associating their requests with the appropriate app in Apigee. (required)
     * @param timestamp Epoch timestamp in milliseconds in the request from a client system. Used for Message Signature generation and time limit (5 mins). (required)
     * @param exchangeRateRequest Accepted request types: DCCExchangeRateRequest and DynamicPricingExchangeRateRequest. (required)
     * @param messageSignature Used to ensure the request has not been tampered with during transmission. The Message-Signature is the Base64 encoded HMAC hash (SHA256 algorithm with the API Secret as the key.) For more information, refer to the supporting documentation on the Developer Portal. (optional)
     * @param region Indicates the region where the client wants the transaction to be processed. This will override the default processing region identified for the client. Available options are argentina, brazil, germany, india and northamerica. Region specific store setup and APIGEE boarding is required in order to use an alternate region for processing. (optional)
     * @return ApiResponse&lt;ExchangeRateResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     *
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success response. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The request cannot be validated. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> The request cannot be authenticated or was submitted with the wrong credentials. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> The request was unauthorized. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The requested resource doesn&#39;t exist. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> An unexpected internal server error occurred. </td><td>  -  </td></tr>
        <tr><td> 502 </td><td> There was a problem communicating with the endpoint. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ExchangeRateResponse> getExchangeRateWithHttpInfo(String contentType, String clientRequestId, String apiKey, Long timestamp, ExchangeRateRequest exchangeRateRequest, String messageSignature, String region) throws ApiException {
        okhttp3.Call localVarCall = getExchangeRateValidateBeforeCall(contentType, clientRequestId, apiKey, timestamp, exchangeRateRequest, messageSignature, region, null);
        Type localVarReturnType = new TypeToken<ExchangeRateResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Generate dynamic currency conversion transactions. (asynchronously)
     * Sale, return and lookup exchange rate with dynamic currency conversion option.
     * @param contentType Content type. (required)
     * @param clientRequestId A client-generated ID for request tracking and signature creation, unique per request.  This is also used for idempotency control. We recommend 128-bit UUID format. (required)
     * @param apiKey Key given to merchant after boarding associating their requests with the appropriate app in Apigee. (required)
     * @param timestamp Epoch timestamp in milliseconds in the request from a client system. Used for Message Signature generation and time limit (5 mins). (required)
     * @param exchangeRateRequest Accepted request types: DCCExchangeRateRequest and DynamicPricingExchangeRateRequest. (required)
     * @param messageSignature Used to ensure the request has not been tampered with during transmission. The Message-Signature is the Base64 encoded HMAC hash (SHA256 algorithm with the API Secret as the key.) For more information, refer to the supporting documentation on the Developer Portal. (optional)
     * @param region Indicates the region where the client wants the transaction to be processed. This will override the default processing region identified for the client. Available options are argentina, brazil, germany, india and northamerica. Region specific store setup and APIGEE boarding is required in order to use an alternate region for processing. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     *
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success response. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The request cannot be validated. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> The request cannot be authenticated or was submitted with the wrong credentials. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> The request was unauthorized. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The requested resource doesn&#39;t exist. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> An unexpected internal server error occurred. </td><td>  -  </td></tr>
        <tr><td> 502 </td><td> There was a problem communicating with the endpoint. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getExchangeRateAsync(String contentType, String clientRequestId, String apiKey, Long timestamp, ExchangeRateRequest exchangeRateRequest, String messageSignature, String region, final ApiCallback<ExchangeRateResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getExchangeRateValidateBeforeCall(contentType, clientRequestId, apiKey, timestamp, exchangeRateRequest, messageSignature, region, _callback);
        Type localVarReturnType = new TypeToken<ExchangeRateResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
