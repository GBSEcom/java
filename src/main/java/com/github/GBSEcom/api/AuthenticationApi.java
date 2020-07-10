/*
 * Payment Gateway API Specification.
 * The documentation here is designed to provide all of the technical guidance required to consume and integrate with our APIs for payment processing. To learn more about our APIs please visit https://docs.firstdata.com/org/gateway.
 *
 * OpenAPI spec version: 6.12.0.20200605.001
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
    private ApiClient apiClient;

    public AuthenticationApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AuthenticationApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for authenticationAccessTokensPost
     * @param contentType Content type. (required)
     * @param clientRequestId A client-generated ID for request tracking and signature creation, unique per request.  This is also used for idempotency control. We recommend 128-bit UUID format. (required)
     * @param apiKey Key given to merchant after boarding associating their requests with the appropriate app in Apigee. (required)
     * @param timestamp Epoch timestamp in milliseconds in the request from a client system. Used for Message Signature generation and time limit (5 mins). (required)
     * @param accessTokenRequest Access token request (required)
     * @param messageSignature Used to ensure the request has not been tampered with during transmission. The Message-Signature is the Base64 encoded HMAC hash (SHA256 algorithm with the API Secret as the key.) For more information, refer to the supporting documentation on the Developer Portal. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call authenticationAccessTokensPostCall(String contentType, String clientRequestId, String apiKey, Long timestamp, AccessTokenRequest accessTokenRequest, String messageSignature, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = accessTokenRequest;

        // create path and map variables
        String localVarPath = "/authentication/access-tokens";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (contentType != null) {
            localVarHeaderParams.put("Content-Type", apiClient.parameterToString(contentType));
        }

        if (clientRequestId != null) {
            localVarHeaderParams.put("Client-Request-Id", apiClient.parameterToString(clientRequestId));
        }

        if (apiKey != null) {
            localVarHeaderParams.put("Api-Key", apiClient.parameterToString(apiKey));
        }

        if (timestamp != null) {
            localVarHeaderParams.put("Timestamp", apiClient.parameterToString(timestamp));
        }

        if (messageSignature != null) {
            localVarHeaderParams.put("Message-Signature", apiClient.parameterToString(messageSignature));
        }

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if (progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call authenticationAccessTokensPostValidateBeforeCall(String contentType, String clientRequestId, String apiKey, Long timestamp, AccessTokenRequest accessTokenRequest, String messageSignature, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
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
        

        com.squareup.okhttp.Call call = authenticationAccessTokensPostCall(contentType, clientRequestId, apiKey, timestamp, accessTokenRequest, messageSignature, progressListener, progressRequestListener);
        return call;

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
     */
    public AccessTokenResponse authenticationAccessTokensPost(String contentType, String clientRequestId, String apiKey, Long timestamp, AccessTokenRequest accessTokenRequest, String messageSignature) throws ApiException {
        ApiResponse<AccessTokenResponse> resp = authenticationAccessTokensPostWithHttpInfo(contentType, clientRequestId, apiKey, timestamp, accessTokenRequest, messageSignature);
        return resp.getData();
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
     */
    public ApiResponse<AccessTokenResponse> authenticationAccessTokensPostWithHttpInfo(String contentType, String clientRequestId, String apiKey, Long timestamp, AccessTokenRequest accessTokenRequest, String messageSignature) throws ApiException {
        com.squareup.okhttp.Call call = authenticationAccessTokensPostValidateBeforeCall(contentType, clientRequestId, apiKey, timestamp, accessTokenRequest, messageSignature, null, null);
        Type localVarReturnType = new TypeToken<AccessTokenResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
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
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call authenticationAccessTokensPostAsync(String contentType, String clientRequestId, String apiKey, Long timestamp, AccessTokenRequest accessTokenRequest, String messageSignature, final ApiCallback<AccessTokenResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = authenticationAccessTokensPostValidateBeforeCall(contentType, clientRequestId, apiKey, timestamp, accessTokenRequest, messageSignature, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AccessTokenResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
