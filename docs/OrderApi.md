# OrderApi

All URIs are relative to *https://cert.api.firstdata.com/gateway*

Method | HTTP request | Description
------------- | ------------- | -------------
[**orderInquiry**](OrderApi.md#orderInquiry) | **GET** /v1/orders/{order-id} | Retrieve the state of an order
[**orderPostAuth**](OrderApi.md#orderPostAuth) | **POST** /v1/orders/{order-id}/postauth | Capture/complete an already existing order.
[**orderReturnTransaction**](OrderApi.md#orderReturnTransaction) | **POST** /v1/orders/{order-id}/return | Return/refund an order.


<a name="orderInquiry"></a>
# **orderInquiry**
> OrderResponse orderInquiry(contentType, clientRequestId, apiKey, timestamp, orderId, messageSignature, region, storeId)

Retrieve the state of an order

Use this query to get the current state of an existing order.

### Example
```java
// Import classes:
//import com.github.GBSEcom.client.ApiException;
//import com.github.GBSEcom.api.OrderApi;


OrderApi apiInstance = new OrderApi();
String contentType = "application/json"; // String | content type
String clientRequestId = "clientRequestId_example"; // String | A client-generated ID for request tracking and signature creation, unique per request.  This is also used for idempotency control. We recommend 128-bit UUID format.
String apiKey = "apiKey_example"; // String | 
Long timestamp = 56L; // Long | Epoch timestamp in milliseconds in the request from a client system. Used for Message Signature generation and time limit (5 mins).
String orderId = "orderId_example"; // String | Gateway order identifier as returned in the parameter orderId
String messageSignature = "messageSignature_example"; // String | Used to ensure the request has not been tampered with during transmission. The Message-Signature is the Base64 encoded HMAC hash (SHA256  algorithm with the API Secret as the key.) For more information, refer to the supporting documentation on the Developer Portal.
String region = "region_example"; // String | The region where client wants to process the transaction
String storeId = "storeId_example"; // String | An optional outlet ID for clients that support multiple stores in the same developer app
try {
    OrderResponse result = apiInstance.orderInquiry(contentType, clientRequestId, apiKey, timestamp, orderId, messageSignature, region, storeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#orderInquiry");
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
 **orderId** | **String**| Gateway order identifier as returned in the parameter orderId |
 **messageSignature** | **String**| Used to ensure the request has not been tampered with during transmission. The Message-Signature is the Base64 encoded HMAC hash (SHA256  algorithm with the API Secret as the key.) For more information, refer to the supporting documentation on the Developer Portal. | [optional]
 **region** | **String**| The region where client wants to process the transaction | [optional]
 **storeId** | **String**| An optional outlet ID for clients that support multiple stores in the same developer app | [optional]

### Return type

[**OrderResponse**](OrderResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="orderPostAuth"></a>
# **orderPostAuth**
> TransactionResponse orderPostAuth(contentType, clientRequestId, apiKey, timestamp, orderId, secondaryTransaction, messageSignature, region, storeId)

Capture/complete an already existing order.

Use this to capture/complete an order. Postauths and partial postauths are allowed.

### Example
```java
// Import classes:
//import com.github.GBSEcom.client.ApiException;
//import com.github.GBSEcom.api.OrderApi;


OrderApi apiInstance = new OrderApi();
String contentType = "application/json"; // String | content type
String clientRequestId = "clientRequestId_example"; // String | A client-generated ID for request tracking and signature creation, unique per request.  This is also used for idempotency control. We recommend 128-bit UUID format.
String apiKey = "apiKey_example"; // String | 
Long timestamp = 56L; // Long | Epoch timestamp in milliseconds in the request from a client system. Used for Message Signature generation and time limit (5 mins).
String orderId = "orderId_example"; // String | Gateway order identifier as returned in the parameter orderId
SecondaryTransaction secondaryTransaction = new SecondaryTransaction(); // SecondaryTransaction | 
String messageSignature = "messageSignature_example"; // String | Used to ensure the request has not been tampered with during transmission. The Message-Signature is the Base64 encoded HMAC hash (SHA256  algorithm with the API Secret as the key.) For more information, refer to the supporting documentation on the Developer Portal.
String region = "region_example"; // String | The region where client wants to process the transaction
String storeId = "storeId_example"; // String | An optional outlet ID for clients that support multiple stores in the same developer app
try {
    TransactionResponse result = apiInstance.orderPostAuth(contentType, clientRequestId, apiKey, timestamp, orderId, secondaryTransaction, messageSignature, region, storeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#orderPostAuth");
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
 **orderId** | **String**| Gateway order identifier as returned in the parameter orderId |
 **secondaryTransaction** | [**SecondaryTransaction**](SecondaryTransaction.md)|  |
 **messageSignature** | **String**| Used to ensure the request has not been tampered with during transmission. The Message-Signature is the Base64 encoded HMAC hash (SHA256  algorithm with the API Secret as the key.) For more information, refer to the supporting documentation on the Developer Portal. | [optional]
 **region** | **String**| The region where client wants to process the transaction | [optional]
 **storeId** | **String**| An optional outlet ID for clients that support multiple stores in the same developer app | [optional]

### Return type

[**TransactionResponse**](TransactionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="orderReturnTransaction"></a>
# **orderReturnTransaction**
> TransactionResponse orderReturnTransaction(contentType, clientRequestId, apiKey, timestamp, orderId, secondaryTransaction, messageSignature, region, storeId)

Return/refund an order.

Use this for Returns of an existing order. Partial Returns are allowed.

### Example
```java
// Import classes:
//import com.github.GBSEcom.client.ApiException;
//import com.github.GBSEcom.api.OrderApi;


OrderApi apiInstance = new OrderApi();
String contentType = "application/json"; // String | content type
String clientRequestId = "clientRequestId_example"; // String | A client-generated ID for request tracking and signature creation, unique per request.  This is also used for idempotency control. We recommend 128-bit UUID format.
String apiKey = "apiKey_example"; // String | 
Long timestamp = 56L; // Long | Epoch timestamp in milliseconds in the request from a client system. Used for Message Signature generation and time limit (5 mins).
String orderId = "orderId_example"; // String | Gateway order identifier as returned in the parameter orderId
SecondaryTransaction secondaryTransaction = new SecondaryTransaction(); // SecondaryTransaction | 
String messageSignature = "messageSignature_example"; // String | Used to ensure the request has not been tampered with during transmission. The Message-Signature is the Base64 encoded HMAC hash (SHA256  algorithm with the API Secret as the key.) For more information, refer to the supporting documentation on the Developer Portal.
String region = "region_example"; // String | The region where client wants to process the transaction
String storeId = "storeId_example"; // String | An optional outlet ID for clients that support multiple stores in the same developer app
try {
    TransactionResponse result = apiInstance.orderReturnTransaction(contentType, clientRequestId, apiKey, timestamp, orderId, secondaryTransaction, messageSignature, region, storeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#orderReturnTransaction");
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
 **orderId** | **String**| Gateway order identifier as returned in the parameter orderId |
 **secondaryTransaction** | [**SecondaryTransaction**](SecondaryTransaction.md)|  |
 **messageSignature** | **String**| Used to ensure the request has not been tampered with during transmission. The Message-Signature is the Base64 encoded HMAC hash (SHA256  algorithm with the API Secret as the key.) For more information, refer to the supporting documentation on the Developer Portal. | [optional]
 **region** | **String**| The region where client wants to process the transaction | [optional]
 **storeId** | **String**| An optional outlet ID for clients that support multiple stores in the same developer app | [optional]

### Return type

[**TransactionResponse**](TransactionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

