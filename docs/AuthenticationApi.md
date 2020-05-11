# AuthenticationApi

All URIs are relative to *https://cert.api.firstdata.com/gateway/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**authenticationAccessTokensPost**](AuthenticationApi.md#authenticationAccessTokensPost) | **POST** /authentication/access-tokens | Generate an access token for user authentication.


<a name="authenticationAccessTokensPost"></a>
# **authenticationAccessTokensPost**
> AccessTokenResponse authenticationAccessTokensPost(contentType, clientRequestId, apiKey, timestamp, accessTokenRequest, messageSignature)

Generate an access token for user authentication.

This is the access token generation call for authorizing subsequent financial transactions. A valid access token is required for web client requests.

### Example
```java
// Import classes:
//import com.github.GBSEcom.client.ApiException;
//import com.github.GBSEcom.api.AuthenticationApi;


AuthenticationApi apiInstance = new AuthenticationApi();
String contentType = "application/json"; // String | Content type.
String clientRequestId = "clientRequestId_example"; // String | A client-generated ID for request tracking and signature creation, unique per request.  This is also used for idempotency control. We recommend 128-bit UUID format.
String apiKey = "apiKey_example"; // String | Key given to merchant after boarding associating their requests with the appropriate app in Apigee.
Long timestamp = 56L; // Long | Epoch timestamp in milliseconds in the request from a client system. Used for Message Signature generation and time limit (5 mins).
AccessTokenRequest accessTokenRequest = new AccessTokenRequest(); // AccessTokenRequest | Access token request
String messageSignature = "messageSignature_example"; // String | Used to ensure the request has not been tampered with during transmission. The Message-Signature is the Base64 encoded HMAC hash (SHA256 algorithm with the API Secret as the key.) For more information, refer to the supporting documentation on the Developer Portal.
try {
    AccessTokenResponse result = apiInstance.authenticationAccessTokensPost(contentType, clientRequestId, apiKey, timestamp, accessTokenRequest, messageSignature);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenticationApi#authenticationAccessTokensPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **String**| Content type. | [default to application/json] [enum: application/json]
 **clientRequestId** | **String**| A client-generated ID for request tracking and signature creation, unique per request.  This is also used for idempotency control. We recommend 128-bit UUID format. |
 **apiKey** | **String**| Key given to merchant after boarding associating their requests with the appropriate app in Apigee. |
 **timestamp** | **Long**| Epoch timestamp in milliseconds in the request from a client system. Used for Message Signature generation and time limit (5 mins). |
 **accessTokenRequest** | [**AccessTokenRequest**](AccessTokenRequest.md)| Access token request |
 **messageSignature** | **String**| Used to ensure the request has not been tampered with during transmission. The Message-Signature is the Base64 encoded HMAC hash (SHA256 algorithm with the API Secret as the key.) For more information, refer to the supporting documentation on the Developer Portal. | [optional]

### Return type

[**AccessTokenResponse**](AccessTokenResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

