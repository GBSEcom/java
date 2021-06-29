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
import com.github.GBSEcom.model.OrderResponse;
import com.github.GBSEcom.model.SecondaryTransaction;
import com.github.GBSEcom.model.TransactionErrorResponse;
import com.github.GBSEcom.model.TransactionResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderApi {
    private ApiClient localVarApiClient;

    public OrderApi() {
        this(Configuration.getDefaultApiClient());
    }

    public OrderApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for orderInquiry
     * @param contentType Content type. (required)
     * @param clientRequestId A client-generated ID for request tracking and signature creation, unique per request.  This is also used for idempotency control. We recommend 128-bit UUID format. (required)
     * @param apiKey Key given to merchant after boarding associating their requests with the appropriate app in Apigee. (required)
     * @param timestamp Epoch timestamp in milliseconds in the request from a client system. Used for Message Signature generation and time limit (5 mins). (required)
     * @param orderId Gateway order identifier as returned in the parameter orderId. (required)
     * @param messageSignature Used to ensure the request has not been tampered with during transmission. The Message-Signature is the Base64 encoded HMAC hash (SHA256 algorithm with the API Secret as the key.) For more information, refer to the supporting documentation on the Developer Portal. (optional)
     * @param region Indicates the region where the client wants the transaction to be processed. This will override the default processing region identified for the client. Available options are argentina, brazil, germany, india and northamerica. Region specific store setup and APIGEE boarding is required in order to use an alternate region for processing. (optional)
     * @param storeId An optional outlet ID for clients that support multiple stores in the same developer app. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
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
    public okhttp3.Call orderInquiryCall(String contentType, String clientRequestId, String apiKey, Long timestamp, String orderId, String messageSignature, String region, String storeId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/orders/{order-id}"
            .replaceAll("\\{" + "order-id" + "\\}", localVarApiClient.escapeString(orderId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (storeId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("storeId", storeId));
        }

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
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call orderInquiryValidateBeforeCall(String contentType, String clientRequestId, String apiKey, Long timestamp, String orderId, String messageSignature, String region, String storeId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'contentType' is set
        if (contentType == null) {
            throw new ApiException("Missing the required parameter 'contentType' when calling orderInquiry(Async)");
        }
        
        // verify the required parameter 'clientRequestId' is set
        if (clientRequestId == null) {
            throw new ApiException("Missing the required parameter 'clientRequestId' when calling orderInquiry(Async)");
        }
        
        // verify the required parameter 'apiKey' is set
        if (apiKey == null) {
            throw new ApiException("Missing the required parameter 'apiKey' when calling orderInquiry(Async)");
        }
        
        // verify the required parameter 'timestamp' is set
        if (timestamp == null) {
            throw new ApiException("Missing the required parameter 'timestamp' when calling orderInquiry(Async)");
        }
        
        // verify the required parameter 'orderId' is set
        if (orderId == null) {
            throw new ApiException("Missing the required parameter 'orderId' when calling orderInquiry(Async)");
        }
        

        okhttp3.Call localVarCall = orderInquiryCall(contentType, clientRequestId, apiKey, timestamp, orderId, messageSignature, region, storeId, _callback);
        return localVarCall;

    }

    /**
     * Retrieve the state of an order.
     * Use this query to get the current state of an existing order.
     * @param contentType Content type. (required)
     * @param clientRequestId A client-generated ID for request tracking and signature creation, unique per request.  This is also used for idempotency control. We recommend 128-bit UUID format. (required)
     * @param apiKey Key given to merchant after boarding associating their requests with the appropriate app in Apigee. (required)
     * @param timestamp Epoch timestamp in milliseconds in the request from a client system. Used for Message Signature generation and time limit (5 mins). (required)
     * @param orderId Gateway order identifier as returned in the parameter orderId. (required)
     * @param messageSignature Used to ensure the request has not been tampered with during transmission. The Message-Signature is the Base64 encoded HMAC hash (SHA256 algorithm with the API Secret as the key.) For more information, refer to the supporting documentation on the Developer Portal. (optional)
     * @param region Indicates the region where the client wants the transaction to be processed. This will override the default processing region identified for the client. Available options are argentina, brazil, germany, india and northamerica. Region specific store setup and APIGEE boarding is required in order to use an alternate region for processing. (optional)
     * @param storeId An optional outlet ID for clients that support multiple stores in the same developer app. (optional)
     * @return OrderResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
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
    public OrderResponse orderInquiry(String contentType, String clientRequestId, String apiKey, Long timestamp, String orderId, String messageSignature, String region, String storeId) throws ApiException {
        ApiResponse<OrderResponse> localVarResp = orderInquiryWithHttpInfo(contentType, clientRequestId, apiKey, timestamp, orderId, messageSignature, region, storeId);
        return localVarResp.getData();
    }

    /**
     * Retrieve the state of an order.
     * Use this query to get the current state of an existing order.
     * @param contentType Content type. (required)
     * @param clientRequestId A client-generated ID for request tracking and signature creation, unique per request.  This is also used for idempotency control. We recommend 128-bit UUID format. (required)
     * @param apiKey Key given to merchant after boarding associating their requests with the appropriate app in Apigee. (required)
     * @param timestamp Epoch timestamp in milliseconds in the request from a client system. Used for Message Signature generation and time limit (5 mins). (required)
     * @param orderId Gateway order identifier as returned in the parameter orderId. (required)
     * @param messageSignature Used to ensure the request has not been tampered with during transmission. The Message-Signature is the Base64 encoded HMAC hash (SHA256 algorithm with the API Secret as the key.) For more information, refer to the supporting documentation on the Developer Portal. (optional)
     * @param region Indicates the region where the client wants the transaction to be processed. This will override the default processing region identified for the client. Available options are argentina, brazil, germany, india and northamerica. Region specific store setup and APIGEE boarding is required in order to use an alternate region for processing. (optional)
     * @param storeId An optional outlet ID for clients that support multiple stores in the same developer app. (optional)
     * @return ApiResponse&lt;OrderResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
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
    public ApiResponse<OrderResponse> orderInquiryWithHttpInfo(String contentType, String clientRequestId, String apiKey, Long timestamp, String orderId, String messageSignature, String region, String storeId) throws ApiException {
        okhttp3.Call localVarCall = orderInquiryValidateBeforeCall(contentType, clientRequestId, apiKey, timestamp, orderId, messageSignature, region, storeId, null);
        Type localVarReturnType = new TypeToken<OrderResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Retrieve the state of an order. (asynchronously)
     * Use this query to get the current state of an existing order.
     * @param contentType Content type. (required)
     * @param clientRequestId A client-generated ID for request tracking and signature creation, unique per request.  This is also used for idempotency control. We recommend 128-bit UUID format. (required)
     * @param apiKey Key given to merchant after boarding associating their requests with the appropriate app in Apigee. (required)
     * @param timestamp Epoch timestamp in milliseconds in the request from a client system. Used for Message Signature generation and time limit (5 mins). (required)
     * @param orderId Gateway order identifier as returned in the parameter orderId. (required)
     * @param messageSignature Used to ensure the request has not been tampered with during transmission. The Message-Signature is the Base64 encoded HMAC hash (SHA256 algorithm with the API Secret as the key.) For more information, refer to the supporting documentation on the Developer Portal. (optional)
     * @param region Indicates the region where the client wants the transaction to be processed. This will override the default processing region identified for the client. Available options are argentina, brazil, germany, india and northamerica. Region specific store setup and APIGEE boarding is required in order to use an alternate region for processing. (optional)
     * @param storeId An optional outlet ID for clients that support multiple stores in the same developer app. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
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
    public okhttp3.Call orderInquiryAsync(String contentType, String clientRequestId, String apiKey, Long timestamp, String orderId, String messageSignature, String region, String storeId, final ApiCallback<OrderResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = orderInquiryValidateBeforeCall(contentType, clientRequestId, apiKey, timestamp, orderId, messageSignature, region, storeId, _callback);
        Type localVarReturnType = new TypeToken<OrderResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for submitSecondaryTransactionFromOrder
     * @param contentType Content type. (required)
     * @param clientRequestId A client-generated ID for request tracking and signature creation, unique per request.  This is also used for idempotency control. We recommend 128-bit UUID format. (required)
     * @param apiKey Key given to merchant after boarding associating their requests with the appropriate app in Apigee. (required)
     * @param timestamp Epoch timestamp in milliseconds in the request from a client system. Used for Message Signature generation and time limit (5 mins). (required)
     * @param orderId Gateway order identifier as returned in the parameter orderId. (required)
     * @param secondaryTransaction Accepted request types: PostAuthTransaction, VoidTransaction, VoidPreAuthTransactions, ReturnTransaction, AchPostAuthTransaction, AchVoidTransaction, AchReturnTransaction and PreAuthSecondaryTransaction. (required)
     * @param messageSignature Used to ensure the request has not been tampered with during transmission. The Message-Signature is the Base64 encoded HMAC hash (SHA256 algorithm with the API Secret as the key.) For more information, refer to the supporting documentation on the Developer Portal. (optional)
     * @param region Indicates the region where the client wants the transaction to be processed. This will override the default processing region identified for the client. Available options are argentina, brazil, germany, india and northamerica. Region specific store setup and APIGEE boarding is required in order to use an alternate region for processing. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success response. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The request cannot be validated. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> The request cannot be authenticated or was submitted with the wrong credentials. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> The request was unauthorized. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The requested resource doesn&#39;t exist. </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> The attempted action is not valid according to gateway rules. For example, the merchant is not set-up or the order already exists. </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> The processor declined the transaction. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> An unexpected internal server error occurred. </td><td>  -  </td></tr>
        <tr><td> 502 </td><td> There was a problem communicating with the endpoint. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call submitSecondaryTransactionFromOrderCall(String contentType, String clientRequestId, String apiKey, Long timestamp, String orderId, SecondaryTransaction secondaryTransaction, String messageSignature, String region, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = secondaryTransaction;

        // create path and map variables
        String localVarPath = "/orders/{order-id}"
            .replaceAll("\\{" + "order-id" + "\\}", localVarApiClient.escapeString(orderId.toString()));

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
    private okhttp3.Call submitSecondaryTransactionFromOrderValidateBeforeCall(String contentType, String clientRequestId, String apiKey, Long timestamp, String orderId, SecondaryTransaction secondaryTransaction, String messageSignature, String region, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'contentType' is set
        if (contentType == null) {
            throw new ApiException("Missing the required parameter 'contentType' when calling submitSecondaryTransactionFromOrder(Async)");
        }
        
        // verify the required parameter 'clientRequestId' is set
        if (clientRequestId == null) {
            throw new ApiException("Missing the required parameter 'clientRequestId' when calling submitSecondaryTransactionFromOrder(Async)");
        }
        
        // verify the required parameter 'apiKey' is set
        if (apiKey == null) {
            throw new ApiException("Missing the required parameter 'apiKey' when calling submitSecondaryTransactionFromOrder(Async)");
        }
        
        // verify the required parameter 'timestamp' is set
        if (timestamp == null) {
            throw new ApiException("Missing the required parameter 'timestamp' when calling submitSecondaryTransactionFromOrder(Async)");
        }
        
        // verify the required parameter 'orderId' is set
        if (orderId == null) {
            throw new ApiException("Missing the required parameter 'orderId' when calling submitSecondaryTransactionFromOrder(Async)");
        }
        
        // verify the required parameter 'secondaryTransaction' is set
        if (secondaryTransaction == null) {
            throw new ApiException("Missing the required parameter 'secondaryTransaction' when calling submitSecondaryTransactionFromOrder(Async)");
        }
        

        okhttp3.Call localVarCall = submitSecondaryTransactionFromOrderCall(contentType, clientRequestId, apiKey, timestamp, orderId, secondaryTransaction, messageSignature, region, _callback);
        return localVarCall;

    }

    /**
     * Perform return or postAuth secondary transactions.
     * Use this to perform a postAuth or return secondary transaction using order ID. Partial postAuths and returns are allowed.
     * @param contentType Content type. (required)
     * @param clientRequestId A client-generated ID for request tracking and signature creation, unique per request.  This is also used for idempotency control. We recommend 128-bit UUID format. (required)
     * @param apiKey Key given to merchant after boarding associating their requests with the appropriate app in Apigee. (required)
     * @param timestamp Epoch timestamp in milliseconds in the request from a client system. Used for Message Signature generation and time limit (5 mins). (required)
     * @param orderId Gateway order identifier as returned in the parameter orderId. (required)
     * @param secondaryTransaction Accepted request types: PostAuthTransaction, VoidTransaction, VoidPreAuthTransactions, ReturnTransaction, AchPostAuthTransaction, AchVoidTransaction, AchReturnTransaction and PreAuthSecondaryTransaction. (required)
     * @param messageSignature Used to ensure the request has not been tampered with during transmission. The Message-Signature is the Base64 encoded HMAC hash (SHA256 algorithm with the API Secret as the key.) For more information, refer to the supporting documentation on the Developer Portal. (optional)
     * @param region Indicates the region where the client wants the transaction to be processed. This will override the default processing region identified for the client. Available options are argentina, brazil, germany, india and northamerica. Region specific store setup and APIGEE boarding is required in order to use an alternate region for processing. (optional)
     * @return TransactionResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success response. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The request cannot be validated. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> The request cannot be authenticated or was submitted with the wrong credentials. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> The request was unauthorized. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The requested resource doesn&#39;t exist. </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> The attempted action is not valid according to gateway rules. For example, the merchant is not set-up or the order already exists. </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> The processor declined the transaction. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> An unexpected internal server error occurred. </td><td>  -  </td></tr>
        <tr><td> 502 </td><td> There was a problem communicating with the endpoint. </td><td>  -  </td></tr>
     </table>
     */
    public TransactionResponse submitSecondaryTransactionFromOrder(String contentType, String clientRequestId, String apiKey, Long timestamp, String orderId, SecondaryTransaction secondaryTransaction, String messageSignature, String region) throws ApiException {
        ApiResponse<TransactionResponse> localVarResp = submitSecondaryTransactionFromOrderWithHttpInfo(contentType, clientRequestId, apiKey, timestamp, orderId, secondaryTransaction, messageSignature, region);
        return localVarResp.getData();
    }

    /**
     * Perform return or postAuth secondary transactions.
     * Use this to perform a postAuth or return secondary transaction using order ID. Partial postAuths and returns are allowed.
     * @param contentType Content type. (required)
     * @param clientRequestId A client-generated ID for request tracking and signature creation, unique per request.  This is also used for idempotency control. We recommend 128-bit UUID format. (required)
     * @param apiKey Key given to merchant after boarding associating their requests with the appropriate app in Apigee. (required)
     * @param timestamp Epoch timestamp in milliseconds in the request from a client system. Used for Message Signature generation and time limit (5 mins). (required)
     * @param orderId Gateway order identifier as returned in the parameter orderId. (required)
     * @param secondaryTransaction Accepted request types: PostAuthTransaction, VoidTransaction, VoidPreAuthTransactions, ReturnTransaction, AchPostAuthTransaction, AchVoidTransaction, AchReturnTransaction and PreAuthSecondaryTransaction. (required)
     * @param messageSignature Used to ensure the request has not been tampered with during transmission. The Message-Signature is the Base64 encoded HMAC hash (SHA256 algorithm with the API Secret as the key.) For more information, refer to the supporting documentation on the Developer Portal. (optional)
     * @param region Indicates the region where the client wants the transaction to be processed. This will override the default processing region identified for the client. Available options are argentina, brazil, germany, india and northamerica. Region specific store setup and APIGEE boarding is required in order to use an alternate region for processing. (optional)
     * @return ApiResponse&lt;TransactionResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success response. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The request cannot be validated. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> The request cannot be authenticated or was submitted with the wrong credentials. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> The request was unauthorized. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The requested resource doesn&#39;t exist. </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> The attempted action is not valid according to gateway rules. For example, the merchant is not set-up or the order already exists. </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> The processor declined the transaction. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> An unexpected internal server error occurred. </td><td>  -  </td></tr>
        <tr><td> 502 </td><td> There was a problem communicating with the endpoint. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<TransactionResponse> submitSecondaryTransactionFromOrderWithHttpInfo(String contentType, String clientRequestId, String apiKey, Long timestamp, String orderId, SecondaryTransaction secondaryTransaction, String messageSignature, String region) throws ApiException {
        okhttp3.Call localVarCall = submitSecondaryTransactionFromOrderValidateBeforeCall(contentType, clientRequestId, apiKey, timestamp, orderId, secondaryTransaction, messageSignature, region, null);
        Type localVarReturnType = new TypeToken<TransactionResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Perform return or postAuth secondary transactions. (asynchronously)
     * Use this to perform a postAuth or return secondary transaction using order ID. Partial postAuths and returns are allowed.
     * @param contentType Content type. (required)
     * @param clientRequestId A client-generated ID for request tracking and signature creation, unique per request.  This is also used for idempotency control. We recommend 128-bit UUID format. (required)
     * @param apiKey Key given to merchant after boarding associating their requests with the appropriate app in Apigee. (required)
     * @param timestamp Epoch timestamp in milliseconds in the request from a client system. Used for Message Signature generation and time limit (5 mins). (required)
     * @param orderId Gateway order identifier as returned in the parameter orderId. (required)
     * @param secondaryTransaction Accepted request types: PostAuthTransaction, VoidTransaction, VoidPreAuthTransactions, ReturnTransaction, AchPostAuthTransaction, AchVoidTransaction, AchReturnTransaction and PreAuthSecondaryTransaction. (required)
     * @param messageSignature Used to ensure the request has not been tampered with during transmission. The Message-Signature is the Base64 encoded HMAC hash (SHA256 algorithm with the API Secret as the key.) For more information, refer to the supporting documentation on the Developer Portal. (optional)
     * @param region Indicates the region where the client wants the transaction to be processed. This will override the default processing region identified for the client. Available options are argentina, brazil, germany, india and northamerica. Region specific store setup and APIGEE boarding is required in order to use an alternate region for processing. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success response. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The request cannot be validated. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> The request cannot be authenticated or was submitted with the wrong credentials. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> The request was unauthorized. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The requested resource doesn&#39;t exist. </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> The attempted action is not valid according to gateway rules. For example, the merchant is not set-up or the order already exists. </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> The processor declined the transaction. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> An unexpected internal server error occurred. </td><td>  -  </td></tr>
        <tr><td> 502 </td><td> There was a problem communicating with the endpoint. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call submitSecondaryTransactionFromOrderAsync(String contentType, String clientRequestId, String apiKey, Long timestamp, String orderId, SecondaryTransaction secondaryTransaction, String messageSignature, String region, final ApiCallback<TransactionResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = submitSecondaryTransactionFromOrderValidateBeforeCall(contentType, clientRequestId, apiKey, timestamp, orderId, secondaryTransaction, messageSignature, region, _callback);
        Type localVarReturnType = new TypeToken<TransactionResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
