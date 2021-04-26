/*
 * Payment Gateway API Specification.
 * The documentation here is designed to provide all of the technical guidance required to consume and integrate with our APIs for payment processing. To learn more about our APIs please visit https://docs.firstdata.com/org/gateway.
 *
 * The version of the OpenAPI document: 21.2.0.20210406.001
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


import com.github.GBSEcom.model.AccessTokenRequest;
import com.github.GBSEcom.model.AccessTokenResponse;
import com.github.GBSEcom.model.ErrorResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AuthenticationApi {
    private ApiClient localVarApiClient;

    public AuthenticationApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AuthenticationApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for authenticationAccessTokensPost
     * @param contentType Content type. (required)
     * @param clientRequestId A client-generated ID for request tracking and signature creation, unique per request.  This is also used for idempotency control. We recommend 128-bit UUID format. (required)
     * @param apiKey Key given to merchant after boarding associating their requests with the appropriate app in Apigee. (required)
     * @param timestamp Epoch timestamp in milliseconds in the request from a client system. Used for Message Signature generation and time limit (5 mins). (required)
     * @param accessTokenRequest Access token request (required)
     * @param messageSignature Used to ensure the request has not been tampered with during transmission. The Message-Signature is the Base64 encoded HMAC hash (SHA256 algorithm with the API Secret as the key.) For more information, refer to the supporting documentation on the Developer Portal. (optional)
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
        <tr><td> 415 </td><td> Format that is not supported by the server for the HTTP method. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> An unexpected internal server error occurred. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call authenticationAccessTokensPostCall(String contentType, String clientRequestId, String apiKey, Long timestamp, AccessTokenRequest accessTokenRequest, String messageSignature, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = accessTokenRequest;

        // create path and map variables
        String localVarPath = "/authentication/access-tokens";

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
    private okhttp3.Call authenticationAccessTokensPostValidateBeforeCall(String contentType, String clientRequestId, String apiKey, Long timestamp, AccessTokenRequest accessTokenRequest, String messageSignature, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'contentType' is set
        if (contentType == null) {
            throw new ApiException("Missing the required parameter 'contentType' when calling authenticationAccessTokensPost(Async)");
        }
        
        // verify the required parameter 'clientRequestId' is set
        if (clientRequestId == null) {
            throw new ApiException("Missing the required parameter 'clientRequestId' when calling authenticationAccessTokensPost(Async)");
        }
        
        // verify the required parameter 'apiKey' is set
        if (apiKey == null) {
            throw new ApiException("Missing the required parameter 'apiKey' when calling authenticationAccessTokensPost(Async)");
        }
        
        // verify the required parameter 'timestamp' is set
        if (timestamp == null) {
            throw new ApiException("Missing the required parameter 'timestamp' when calling authenticationAccessTokensPost(Async)");
        }
        
        // verify the required parameter 'accessTokenRequest' is set
        if (accessTokenRequest == null) {
            throw new ApiException("Missing the required parameter 'accessTokenRequest' when calling authenticationAccessTokensPost(Async)");
        }
        

        okhttp3.Call localVarCall = authenticationAccessTokensPostCall(contentType, clientRequestId, apiKey, timestamp, accessTokenRequest, messageSignature, _callback);
        return localVarCall;

    }

    /**
     * Generate an access token for user authentication.
     * This is the access token generation call for authorizing subsequent financial transactions. A valid access token is required for web client requests.
     * @param contentType Content type. (required)
     * @param clientRequestId A client-generated ID for request tracking and signature creation, unique per request.  This is also used for idempotency control. We recommend 128-bit UUID format. (required)
     * @param apiKey Key given to merchant after boarding associating their requests with the appropriate app in Apigee. (required)
     * @param timestamp Epoch timestamp in milliseconds in the request from a client system. Used for Message Signature generation and time limit (5 mins). (required)
     * @param accessTokenRequest Access token request (required)
     * @param messageSignature Used to ensure the request has not been tampered with during transmission. The Message-Signature is the Base64 encoded HMAC hash (SHA256 algorithm with the API Secret as the key.) For more information, refer to the supporting documentation on the Developer Portal. (optional)
     * @return AccessTokenResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success response. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The request cannot be validated. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> The request cannot be authenticated or was submitted with the wrong credentials. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> The request was unauthorized. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The requested resource doesn&#39;t exist. </td><td>  -  </td></tr>
        <tr><td> 415 </td><td> Format that is not supported by the server for the HTTP method. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> An unexpected internal server error occurred. </td><td>  -  </td></tr>
     </table>
     */
    public AccessTokenResponse authenticationAccessTokensPost(String contentType, String clientRequestId, String apiKey, Long timestamp, AccessTokenRequest accessTokenRequest, String messageSignature) throws ApiException {
        ApiResponse<AccessTokenResponse> localVarResp = authenticationAccessTokensPostWithHttpInfo(contentType, clientRequestId, apiKey, timestamp, accessTokenRequest, messageSignature);
        return localVarResp.getData();
    }

    /**
     * Generate an access token for user authentication.
     * This is the access token generation call for authorizing subsequent financial transactions. A valid access token is required for web client requests.
     * @param contentType Content type. (required)
     * @param clientRequestId A client-generated ID for request tracking and signature creation, unique per request.  This is also used for idempotency control. We recommend 128-bit UUID format. (required)
     * @param apiKey Key given to merchant after boarding associating their requests with the appropriate app in Apigee. (required)
     * @param timestamp Epoch timestamp in milliseconds in the request from a client system. Used for Message Signature generation and time limit (5 mins). (required)
     * @param accessTokenRequest Access token request (required)
     * @param messageSignature Used to ensure the request has not been tampered with during transmission. The Message-Signature is the Base64 encoded HMAC hash (SHA256 algorithm with the API Secret as the key.) For more information, refer to the supporting documentation on the Developer Portal. (optional)
     * @return ApiResponse&lt;AccessTokenResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success response. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The request cannot be validated. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> The request cannot be authenticated or was submitted with the wrong credentials. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> The request was unauthorized. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The requested resource doesn&#39;t exist. </td><td>  -  </td></tr>
        <tr><td> 415 </td><td> Format that is not supported by the server for the HTTP method. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> An unexpected internal server error occurred. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AccessTokenResponse> authenticationAccessTokensPostWithHttpInfo(String contentType, String clientRequestId, String apiKey, Long timestamp, AccessTokenRequest accessTokenRequest, String messageSignature) throws ApiException {
        okhttp3.Call localVarCall = authenticationAccessTokensPostValidateBeforeCall(contentType, clientRequestId, apiKey, timestamp, accessTokenRequest, messageSignature, null);
        Type localVarReturnType = new TypeToken<AccessTokenResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Generate an access token for user authentication. (asynchronously)
     * This is the access token generation call for authorizing subsequent financial transactions. A valid access token is required for web client requests.
     * @param contentType Content type. (required)
     * @param clientRequestId A client-generated ID for request tracking and signature creation, unique per request.  This is also used for idempotency control. We recommend 128-bit UUID format. (required)
     * @param apiKey Key given to merchant after boarding associating their requests with the appropriate app in Apigee. (required)
     * @param timestamp Epoch timestamp in milliseconds in the request from a client system. Used for Message Signature generation and time limit (5 mins). (required)
     * @param accessTokenRequest Access token request (required)
     * @param messageSignature Used to ensure the request has not been tampered with during transmission. The Message-Signature is the Base64 encoded HMAC hash (SHA256 algorithm with the API Secret as the key.) For more information, refer to the supporting documentation on the Developer Portal. (optional)
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
        <tr><td> 415 </td><td> Format that is not supported by the server for the HTTP method. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> An unexpected internal server error occurred. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call authenticationAccessTokensPostAsync(String contentType, String clientRequestId, String apiKey, Long timestamp, AccessTokenRequest accessTokenRequest, String messageSignature, final ApiCallback<AccessTokenResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = authenticationAccessTokensPostValidateBeforeCall(contentType, clientRequestId, apiKey, timestamp, accessTokenRequest, messageSignature, _callback);
        Type localVarReturnType = new TypeToken<AccessTokenResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
