# PaymentTokenApi

All URIs are relative to *https://cert.api.firstdata.com/gateway*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createPaymentToken**](PaymentTokenApi.md#createPaymentToken) | **POST** /v1/payment-tokens | Create a payment token from a payment card.
[**deletePaymentToken**](PaymentTokenApi.md#deletePaymentToken) | **DELETE** /v1/payment-tokens/{token-id} | Delete a payment token.


<a name="createPaymentToken"></a>
# **createPaymentToken**
> PaymentTokenizationResponse createPaymentToken(contentType, clientRequestId, apiKey, timestamp, paymentTokenizationRequest, messageSignature, authorization, region)

Create a payment token from a payment card.

Use this to create a payment token from a payment card.

### Example
```java
// Import classes:
//import com.github.GBSEcom.client.ApiException;
//import com.github.GBSEcom.api.PaymentTokenApi;


PaymentTokenApi apiInstance = new PaymentTokenApi();
String contentType = "application/json"; // String | content type
String clientRequestId = "clientRequestId_example"; // String | A client-generated ID for request tracking and signature creation, unique per request.  This is also used for idempotency control. We recommend 128-bit UUID format.
String apiKey = "apiKey_example"; // String | 
Long timestamp = 56L; // Long | Epoch timestamp in milliseconds in the request from a client system. Used for Message Signature generation and time limit (5 mins).
PaymentTokenizationRequest paymentTokenizationRequest = new PaymentTokenizationRequest(); // PaymentTokenizationRequest | 
String messageSignature = "messageSignature_example"; // String | Used to ensure the request has not been tampered with during transmission. The Message-Signature is the Base64 encoded HMAC hash (SHA256  algorithm with the API Secret as the key.) For more information, refer to the supporting documentation on the Developer Portal.
String authorization = "authorization_example"; // String | The access token previously generated with the access-tokens call. Use the format 'Bearer {access-token}'.
String region = "region_example"; // String | The region where client wants to process the transaction
try {
    PaymentTokenizationResponse result = apiInstance.createPaymentToken(contentType, clientRequestId, apiKey, timestamp, paymentTokenizationRequest, messageSignature, authorization, region);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentTokenApi#createPaymentToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **String**| content type | [default to application/json] [enum: application/json]
 **clientRequestId** | **String**| A client-generated ID for request tracking and signature creation, unique per request.  This is also used for idempotency control. We recommend 128-bit UUID format. |
 **apiKey** | **String**|  |
 **timestamp** | **Long**| Epoch timestamp in milliseconds in the request from a client system. Used for Message Signature generation and time limit (5 mins). |
 **paymentTokenizationRequest** | [**PaymentTokenizationRequest**](PaymentTokenizationRequest.md)|  |
 **messageSignature** | **String**| Used to ensure the request has not been tampered with during transmission. The Message-Signature is the Base64 encoded HMAC hash (SHA256  algorithm with the API Secret as the key.) For more information, refer to the supporting documentation on the Developer Portal. | [optional]
 **authorization** | **String**| The access token previously generated with the access-tokens call. Use the format &#39;Bearer {access-token}&#39;. | [optional]
 **region** | **String**| The region where client wants to process the transaction | [optional]

### Return type

[**PaymentTokenizationResponse**](PaymentTokenizationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deletePaymentToken"></a>
# **deletePaymentToken**
> PaymentTokenizationResponse deletePaymentToken(contentType, clientRequestId, apiKey, timestamp, tokenId, messageSignature, authorization, region, storeId)

Delete a payment token.

Use this to delete a payment token.

### Example
```java
// Import classes:
//import com.github.GBSEcom.client.ApiException;
//import com.github.GBSEcom.api.PaymentTokenApi;


PaymentTokenApi apiInstance = new PaymentTokenApi();
String contentType = "application/json"; // String | content type
String clientRequestId = "clientRequestId_example"; // String | A client-generated ID for request tracking and signature creation, unique per request.  This is also used for idempotency control. We recommend 128-bit UUID format.
String apiKey = "apiKey_example"; // String | 
Long timestamp = 56L; // Long | Epoch timestamp in milliseconds in the request from a client system. Used for Message Signature generation and time limit (5 mins).
String tokenId = "tokenId_example"; // String | Identifies a payment token
String messageSignature = "messageSignature_example"; // String | Used to ensure the request has not been tampered with during transmission. The Message-Signature is the Base64 encoded HMAC hash (SHA256  algorithm with the API Secret as the key.) For more information, refer to the supporting documentation on the Developer Portal.
String authorization = "authorization_example"; // String | The access token previously generated with the access-tokens call. Use the format 'Bearer {access-token}'.
String region = "region_example"; // String | The region where client wants to process the transaction
String storeId = "storeId_example"; // String | 
try {
    PaymentTokenizationResponse result = apiInstance.deletePaymentToken(contentType, clientRequestId, apiKey, timestamp, tokenId, messageSignature, authorization, region, storeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentTokenApi#deletePaymentToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **String**| content type | [default to application/json] [enum: application/json]
 **clientRequestId** | **String**| A client-generated ID for request tracking and signature creation, unique per request.  This is also used for idempotency control. We recommend 128-bit UUID format. |
 **apiKey** | **String**|  |
 **timestamp** | **Long**| Epoch timestamp in milliseconds in the request from a client system. Used for Message Signature generation and time limit (5 mins). |
 **tokenId** | **String**| Identifies a payment token |
 **messageSignature** | **String**| Used to ensure the request has not been tampered with during transmission. The Message-Signature is the Base64 encoded HMAC hash (SHA256  algorithm with the API Secret as the key.) For more information, refer to the supporting documentation on the Developer Portal. | [optional]
 **authorization** | **String**| The access token previously generated with the access-tokens call. Use the format &#39;Bearer {access-token}&#39;. | [optional]
 **region** | **String**| The region where client wants to process the transaction | [optional]
 **storeId** | **String**|  | [optional]

### Return type

[**PaymentTokenizationResponse**](PaymentTokenizationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

