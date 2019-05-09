# PaymentSchedulesApi

All URIs are relative to *https://cert.api.firstdata.com/gateway*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelPaymentSchedule**](PaymentSchedulesApi.md#cancelPaymentSchedule) | **DELETE** /v1/payment-schedules/{order-id} | Cancel a gateway payment schedule.
[**createPaymentSchedule**](PaymentSchedulesApi.md#createPaymentSchedule) | **POST** /v1/payment-schedules | Use this to create a gateway payment schedule.
[**inquiryPaymentSchedule**](PaymentSchedulesApi.md#inquiryPaymentSchedule) | **GET** /v1/payment-schedules/{order-id} | View a gateway payment schedule.
[**updatePaymentSchedule**](PaymentSchedulesApi.md#updatePaymentSchedule) | **PATCH** /v1/payment-schedules/{order-id} | Update a gateway payment schedule.


<a name="cancelPaymentSchedule"></a>
# **cancelPaymentSchedule**
> PaymentSchedulesResponse cancelPaymentSchedule(contentType, clientRequestId, apiKey, timestamp, orderId, messageSignature, region, storeId)

Cancel a gateway payment schedule.

Use this to cancel an existing gateway payment schedule.

### Example
```java
// Import classes:
//import com.github.GBSEcom.client.ApiException;
//import com.github.GBSEcom.api.PaymentSchedulesApi;


PaymentSchedulesApi apiInstance = new PaymentSchedulesApi();
String contentType = "application/json"; // String | content type
String clientRequestId = "clientRequestId_example"; // String | A client-generated ID for request tracking and signature creation, unique per request.  This is also used for idempotency control. We recommend 128-bit UUID format.
String apiKey = "apiKey_example"; // String | 
Long timestamp = 56L; // Long | Epoch timestamp in milliseconds in the request from a client system. Used for Message Signature generation and time limit (5 mins).
String orderId = "orderId_example"; // String | Gateway order identifier as returned in the parameter orderId
String messageSignature = "messageSignature_example"; // String | Used to ensure the request has not been tampered with during transmission. The Message-Signature is the Base64 encoded HMAC hash (SHA256  algorithm with the API Secret as the key.) For more information, refer to the supporting documentation on the Developer Portal.
String region = "region_example"; // String | The region where client wants to process the transaction
String storeId = "storeId_example"; // String | An optional outlet ID for clients that support multiple stores in the same developer app
try {
    PaymentSchedulesResponse result = apiInstance.cancelPaymentSchedule(contentType, clientRequestId, apiKey, timestamp, orderId, messageSignature, region, storeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentSchedulesApi#cancelPaymentSchedule");
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

[**PaymentSchedulesResponse**](PaymentSchedulesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createPaymentSchedule"></a>
# **createPaymentSchedule**
> PaymentSchedulesResponse createPaymentSchedule(contentType, clientRequestId, apiKey, timestamp, paymentSchedulesRequest, messageSignature, region)

Use this to create a gateway payment schedule.

This can be used to create a gateway payment schedule.

### Example
```java
// Import classes:
//import com.github.GBSEcom.client.ApiException;
//import com.github.GBSEcom.api.PaymentSchedulesApi;


PaymentSchedulesApi apiInstance = new PaymentSchedulesApi();
String contentType = "application/json"; // String | content type
String clientRequestId = "clientRequestId_example"; // String | A client-generated ID for request tracking and signature creation, unique per request.  This is also used for idempotency control. We recommend 128-bit UUID format.
String apiKey = "apiKey_example"; // String | 
Long timestamp = 56L; // Long | Epoch timestamp in milliseconds in the request from a client system. Used for Message Signature generation and time limit (5 mins).
PaymentSchedulesRequest paymentSchedulesRequest = new PaymentSchedulesRequest(); // PaymentSchedulesRequest | 
String messageSignature = "messageSignature_example"; // String | Used to ensure the request has not been tampered with during transmission. The Message-Signature is the Base64 encoded HMAC hash (SHA256  algorithm with the API Secret as the key.) For more information, refer to the supporting documentation on the Developer Portal.
String region = "region_example"; // String | The region where client wants to process the transaction
try {
    PaymentSchedulesResponse result = apiInstance.createPaymentSchedule(contentType, clientRequestId, apiKey, timestamp, paymentSchedulesRequest, messageSignature, region);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentSchedulesApi#createPaymentSchedule");
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
 **paymentSchedulesRequest** | [**PaymentSchedulesRequest**](PaymentSchedulesRequest.md)|  |
 **messageSignature** | **String**| Used to ensure the request has not been tampered with during transmission. The Message-Signature is the Base64 encoded HMAC hash (SHA256  algorithm with the API Secret as the key.) For more information, refer to the supporting documentation on the Developer Portal. | [optional]
 **region** | **String**| The region where client wants to process the transaction | [optional]

### Return type

[**PaymentSchedulesResponse**](PaymentSchedulesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="inquiryPaymentSchedule"></a>
# **inquiryPaymentSchedule**
> RecurringPaymentDetailsResponse inquiryPaymentSchedule(contentType, clientRequestId, apiKey, timestamp, orderId, messageSignature, region, storeId)

View a gateway payment schedule.

This can be used to view an existing gateway payment schedule.

### Example
```java
// Import classes:
//import com.github.GBSEcom.client.ApiException;
//import com.github.GBSEcom.api.PaymentSchedulesApi;


PaymentSchedulesApi apiInstance = new PaymentSchedulesApi();
String contentType = "application/json"; // String | content type
String clientRequestId = "clientRequestId_example"; // String | A client-generated ID for request tracking and signature creation, unique per request.  This is also used for idempotency control. We recommend 128-bit UUID format.
String apiKey = "apiKey_example"; // String | 
Long timestamp = 56L; // Long | Epoch timestamp in milliseconds in the request from a client system. Used for Message Signature generation and time limit (5 mins).
String orderId = "orderId_example"; // String | Gateway order identifier as returned in the parameter orderId
String messageSignature = "messageSignature_example"; // String | Used to ensure the request has not been tampered with during transmission. The Message-Signature is the Base64 encoded HMAC hash (SHA256  algorithm with the API Secret as the key.) For more information, refer to the supporting documentation on the Developer Portal.
String region = "region_example"; // String | The region where client wants to process the transaction
String storeId = "storeId_example"; // String | An optional outlet ID for clients that support multiple stores in the same developer app
try {
    RecurringPaymentDetailsResponse result = apiInstance.inquiryPaymentSchedule(contentType, clientRequestId, apiKey, timestamp, orderId, messageSignature, region, storeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentSchedulesApi#inquiryPaymentSchedule");
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

[**RecurringPaymentDetailsResponse**](RecurringPaymentDetailsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updatePaymentSchedule"></a>
# **updatePaymentSchedule**
> PaymentSchedulesResponse updatePaymentSchedule(contentType, clientRequestId, apiKey, timestamp, orderId, paymentSchedulesRequest, messageSignature, region, storeId)

Update a gateway payment schedule.

This can be used to update a gateway payment schedule.

### Example
```java
// Import classes:
//import com.github.GBSEcom.client.ApiException;
//import com.github.GBSEcom.api.PaymentSchedulesApi;


PaymentSchedulesApi apiInstance = new PaymentSchedulesApi();
String contentType = "application/json"; // String | content type
String clientRequestId = "clientRequestId_example"; // String | A client-generated ID for request tracking and signature creation, unique per request.  This is also used for idempotency control. We recommend 128-bit UUID format.
String apiKey = "apiKey_example"; // String | 
Long timestamp = 56L; // Long | Epoch timestamp in milliseconds in the request from a client system. Used for Message Signature generation and time limit (5 mins).
String orderId = "orderId_example"; // String | Gateway order identifier as returned in the parameter orderId
PaymentSchedulesRequest paymentSchedulesRequest = new PaymentSchedulesRequest(); // PaymentSchedulesRequest | 
String messageSignature = "messageSignature_example"; // String | Used to ensure the request has not been tampered with during transmission. The Message-Signature is the Base64 encoded HMAC hash (SHA256  algorithm with the API Secret as the key.) For more information, refer to the supporting documentation on the Developer Portal.
String region = "region_example"; // String | The region where client wants to process the transaction
String storeId = "storeId_example"; // String | An optional outlet ID for clients that support multiple stores in the same developer app
try {
    PaymentSchedulesResponse result = apiInstance.updatePaymentSchedule(contentType, clientRequestId, apiKey, timestamp, orderId, paymentSchedulesRequest, messageSignature, region, storeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentSchedulesApi#updatePaymentSchedule");
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
 **paymentSchedulesRequest** | [**PaymentSchedulesRequest**](PaymentSchedulesRequest.md)|  |
 **messageSignature** | **String**| Used to ensure the request has not been tampered with during transmission. The Message-Signature is the Base64 encoded HMAC hash (SHA256  algorithm with the API Secret as the key.) For more information, refer to the supporting documentation on the Developer Portal. | [optional]
 **region** | **String**| The region where client wants to process the transaction | [optional]
 **storeId** | **String**| An optional outlet ID for clients that support multiple stores in the same developer app | [optional]

### Return type

[**PaymentSchedulesResponse**](PaymentSchedulesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

