# OrderApi

All URIs are relative to *https://prod.api.firstdata.com/gateway*

Method | HTTP request | Description
------------- | ------------- | -------------
[**performPaymentPostAuthorisation**](OrderApi.md#performPaymentPostAuthorisation) | **POST** /v1/orders/{order-id}/postauth | Use this to capture/complete a transaction. Partial postauths are allowed.
[**returnTransaction**](OrderApi.md#returnTransaction) | **POST** /v1/orders/{order-id}/return | Use this to return/refund on the order. Partial returns are allowed.


<a name="performPaymentPostAuthorisation"></a>
# **performPaymentPostAuthorisation**
> TransactionResponse performPaymentPostAuthorisation(contentType, clientRequestId, apiKey, timestamp, messageSignature, orderId, payload, storeId)

Use this to capture/complete a transaction. Partial postauths are allowed.

This can be used for postauth and partial postauths.

### Example
```java
// Import classes:
//import com.github.GBSEcom.client.ApiException;
//import com.github.GBSEcom.api.OrderApi;


OrderApi apiInstance = new OrderApi();
String contentType = "application/json"; // String | content type
String clientRequestId = "clientRequestId_example"; // String | A client-generated ID for request tracking and signature creation, unique per request.  This is also used for idempotency control. We recommend 128-bit UUID format.
String apiKey = "apiKey_example"; // String | 
Long timestamp = 789L; // Long | Epoch timestamp in milliseconds in the request from a client system. Used for Message Signature generation and time limit (5 mins).
String messageSignature = "messageSignature_example"; // String | Used to ensure the request has not been tampered with during transmission. The Message-Signature is the Base64 encoded HMAC hash (SHA256  algorithm with the API Secret as the key.) For more information, refer to the supporting documentation on the Developer Portal.
String orderId = "orderId_example"; // String | Gateway order identifier as returned in the parameter orderId
SecondaryTransaction payload = new SecondaryTransaction(); // SecondaryTransaction | 
String storeId = "storeId_example"; // String | an optional outlet id for clients that support multiple store in the same developer app
try {
    TransactionResponse result = apiInstance.performPaymentPostAuthorisation(contentType, clientRequestId, apiKey, timestamp, messageSignature, orderId, payload, storeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#performPaymentPostAuthorisation");
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
 **messageSignature** | **String**| Used to ensure the request has not been tampered with during transmission. The Message-Signature is the Base64 encoded HMAC hash (SHA256  algorithm with the API Secret as the key.) For more information, refer to the supporting documentation on the Developer Portal. |
 **orderId** | **String**| Gateway order identifier as returned in the parameter orderId |
 **payload** | [**SecondaryTransaction**](SecondaryTransaction.md)|  |
 **storeId** | **String**| an optional outlet id for clients that support multiple store in the same developer app | [optional]

### Return type

[**TransactionResponse**](TransactionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="returnTransaction"></a>
# **returnTransaction**
> TransactionResponse returnTransaction(contentType, clientRequestId, apiKey, timestamp, messageSignature, orderId, payload, storeId)

Use this to return/refund on the order. Partial returns are allowed.

This can be used for Returns and Partial Returns.

### Example
```java
// Import classes:
//import com.github.GBSEcom.client.ApiException;
//import com.github.GBSEcom.api.OrderApi;


OrderApi apiInstance = new OrderApi();
String contentType = "application/json"; // String | content type
String clientRequestId = "clientRequestId_example"; // String | A client-generated ID for request tracking and signature creation, unique per request.  This is also used for idempotency control. We recommend 128-bit UUID format.
String apiKey = "apiKey_example"; // String | 
Long timestamp = 789L; // Long | Epoch timestamp in milliseconds in the request from a client system. Used for Message Signature generation and time limit (5 mins).
String messageSignature = "messageSignature_example"; // String | Used to ensure the request has not been tampered with during transmission. The Message-Signature is the Base64 encoded HMAC hash (SHA256  algorithm with the API Secret as the key.) For more information, refer to the supporting documentation on the Developer Portal.
String orderId = "orderId_example"; // String | Gateway order identifier as returned in the parameter orderId
SecondaryTransaction payload = new SecondaryTransaction(); // SecondaryTransaction | 
String storeId = "storeId_example"; // String | an optional outlet id for clients that support multiple store in the same developer app
try {
    TransactionResponse result = apiInstance.returnTransaction(contentType, clientRequestId, apiKey, timestamp, messageSignature, orderId, payload, storeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#returnTransaction");
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
 **messageSignature** | **String**| Used to ensure the request has not been tampered with during transmission. The Message-Signature is the Base64 encoded HMAC hash (SHA256  algorithm with the API Secret as the key.) For more information, refer to the supporting documentation on the Developer Portal. |
 **orderId** | **String**| Gateway order identifier as returned in the parameter orderId |
 **payload** | [**SecondaryTransaction**](SecondaryTransaction.md)|  |
 **storeId** | **String**| an optional outlet id for clients that support multiple store in the same developer app | [optional]

### Return type

[**TransactionResponse**](TransactionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

