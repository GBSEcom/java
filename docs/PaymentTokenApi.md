# PaymentTokenApi

All URIs are relative to *https://cert.api.firstdata.com/gateway/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createPaymentToken**](PaymentTokenApi.md#createPaymentToken) | **POST** /payment-tokens | Create a payment token from a payment card.
[**deletePaymentToken**](PaymentTokenApi.md#deletePaymentToken) | **DELETE** /payment-tokens/{token-id} | Delete a payment token.


<a name="createPaymentToken"></a>
# **createPaymentToken**
> PaymentTokenizationResponse createPaymentToken(contentType, clientRequestId, apiKey, timestamp, paymentTokenizationRequest, messageSignature, authorization, region)

Create a payment token from a payment card.

Use this to create a payment token from a payment card.

### Example
```java
// Import classes:
//import com.firstdata.firstapi.client.ApiException;
//import com.firstdata.firstapi.api.PaymentTokenApi;


PaymentTokenApi apiInstance = new PaymentTokenApi();
String contentType = "application/json"; // String | Content type.
String clientRequestId = "clientRequestId_example"; // String | A client-generated ID for request tracking and signature creation, unique per request.  This is also used for idempotency control. We recommend 128-bit UUID format.
String apiKey = "apiKey_example"; // String | Key given to merchant after boarding associating their requests with the appropriate app in Apigee.
Long timestamp = 56L; // Long | Epoch timestamp in milliseconds in the request from a client system. Used for Message Signature generation and time limit (5 mins).
PaymentTokenizationRequest paymentTokenizationRequest = new PaymentTokenizationRequest(); // PaymentTokenizationRequest | Accepted request types: PaymentCardPaymentTokenizationRequest and ReferencedOrderPaymentTokenizationRequest.
String messageSignature = "messageSignature_example"; // String | Used to ensure the request has not been tampered with during transmission. The Message-Signature is the Base64 encoded HMAC hash (SHA256 algorithm with the API Secret as the key.) For more information, refer to the supporting documentation on the Developer Portal.
String authorization = "authorization_example"; // String | The access token previously generated with the access-tokens call. Use the format 'Bearer {access-token}'.
String region = "region_example"; // String | Indicates the region where the client wants the transaction to be processed. This will override the default processing region identified for the client. Available options are argentina, brazil, germany, india and northamerica. Region specific store setup and APIGEE boarding is required in order to use an alternate region for processing.
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
 **contentType** | **String**| Content type. | [default to application/json] [enum: application/json]
 **clientRequestId** | **String**| A client-generated ID for request tracking and signature creation, unique per request.  This is also used for idempotency control. We recommend 128-bit UUID format. |
 **apiKey** | **String**| Key given to merchant after boarding associating their requests with the appropriate app in Apigee. |
 **timestamp** | **Long**| Epoch timestamp in milliseconds in the request from a client system. Used for Message Signature generation and time limit (5 mins). |
 **paymentTokenizationRequest** | [**PaymentTokenizationRequest**](PaymentTokenizationRequest.md)| Accepted request types: PaymentCardPaymentTokenizationRequest and ReferencedOrderPaymentTokenizationRequest. |
 **messageSignature** | **String**| Used to ensure the request has not been tampered with during transmission. The Message-Signature is the Base64 encoded HMAC hash (SHA256 algorithm with the API Secret as the key.) For more information, refer to the supporting documentation on the Developer Portal. | [optional]
 **authorization** | **String**| The access token previously generated with the access-tokens call. Use the format &#39;Bearer {access-token}&#39;. | [optional]
 **region** | **String**| Indicates the region where the client wants the transaction to be processed. This will override the default processing region identified for the client. Available options are argentina, brazil, germany, india and northamerica. Region specific store setup and APIGEE boarding is required in order to use an alternate region for processing. | [optional]

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
//import com.firstdata.firstapi.client.ApiException;
//import com.firstdata.firstapi.api.PaymentTokenApi;


PaymentTokenApi apiInstance = new PaymentTokenApi();
String contentType = "application/json"; // String | Content type.
String clientRequestId = "clientRequestId_example"; // String | A client-generated ID for request tracking and signature creation, unique per request.  This is also used for idempotency control. We recommend 128-bit UUID format.
String apiKey = "apiKey_example"; // String | Key given to merchant after boarding associating their requests with the appropriate app in Apigee.
Long timestamp = 56L; // Long | Epoch timestamp in milliseconds in the request from a client system. Used for Message Signature generation and time limit (5 mins).
String tokenId = "tokenId_example"; // String | Identifies a payment token.
String messageSignature = "messageSignature_example"; // String | Used to ensure the request has not been tampered with during transmission. The Message-Signature is the Base64 encoded HMAC hash (SHA256 algorithm with the API Secret as the key.) For more information, refer to the supporting documentation on the Developer Portal.
String authorization = "authorization_example"; // String | The access token previously generated with the access-tokens call. Use the format 'Bearer {access-token}'.
String region = "region_example"; // String | Indicates the region where the client wants the transaction to be processed. This will override the default processing region identified for the client. Available options are argentina, brazil, germany, india and northamerica. Region specific store setup and APIGEE boarding is required in order to use an alternate region for processing.
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
 **contentType** | **String**| Content type. | [default to application/json] [enum: application/json]
 **clientRequestId** | **String**| A client-generated ID for request tracking and signature creation, unique per request.  This is also used for idempotency control. We recommend 128-bit UUID format. |
 **apiKey** | **String**| Key given to merchant after boarding associating their requests with the appropriate app in Apigee. |
 **timestamp** | **Long**| Epoch timestamp in milliseconds in the request from a client system. Used for Message Signature generation and time limit (5 mins). |
 **tokenId** | **String**| Identifies a payment token. |
 **messageSignature** | **String**| Used to ensure the request has not been tampered with during transmission. The Message-Signature is the Base64 encoded HMAC hash (SHA256 algorithm with the API Secret as the key.) For more information, refer to the supporting documentation on the Developer Portal. | [optional]
 **authorization** | **String**| The access token previously generated with the access-tokens call. Use the format &#39;Bearer {access-token}&#39;. | [optional]
 **region** | **String**| Indicates the region where the client wants the transaction to be processed. This will override the default processing region identified for the client. Available options are argentina, brazil, germany, india and northamerica. Region specific store setup and APIGEE boarding is required in order to use an alternate region for processing. | [optional]
 **storeId** | **String**|  | [optional]

### Return type

[**PaymentTokenizationResponse**](PaymentTokenizationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

