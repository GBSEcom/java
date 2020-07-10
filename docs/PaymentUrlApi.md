# PaymentUrlApi

All URIs are relative to *https://cert.api.firstdata.com/gateway/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createPaymentUrl**](PaymentUrlApi.md#createPaymentUrl) | **POST** /payment-url | Create a payment URL.
[**deletePaymentUrl**](PaymentUrlApi.md#deletePaymentUrl) | **DELETE** /payment-url | Delete a payment URL.
[**paymentUrlDetail**](PaymentUrlApi.md#paymentUrlDetail) | **GET** /payment-url | Retrieve the state of payment URL.


<a name="createPaymentUrl"></a>
# **createPaymentUrl**
> PaymentUrlResponse createPaymentUrl(contentType, clientRequestId, apiKey, timestamp, paymentUrlRequest, messageSignature, region)

Create a payment URL.

Use this to generate an embedding payment link.

### Example
```java
// Import classes:
//import com.github.GBSEcom.client.ApiException;
//import com.github.GBSEcom.api.PaymentUrlApi;


PaymentUrlApi apiInstance = new PaymentUrlApi();
String contentType = "application/json"; // String | Content type.
String clientRequestId = "clientRequestId_example"; // String | A client-generated ID for request tracking and signature creation, unique per request.  This is also used for idempotency control. We recommend 128-bit UUID format.
String apiKey = "apiKey_example"; // String | Key given to merchant after boarding associating their requests with the appropriate app in Apigee.
Long timestamp = 56L; // Long | Epoch timestamp in milliseconds in the request from a client system. Used for Message Signature generation and time limit (5 mins).
PaymentUrlRequest paymentUrlRequest = new PaymentUrlRequest(); // PaymentUrlRequest | Accepted request type: PaymentUrlRequest.
String messageSignature = "messageSignature_example"; // String | Used to ensure the request has not been tampered with during transmission. The Message-Signature is the Base64 encoded HMAC hash (SHA256 algorithm with the API Secret as the key.) For more information, refer to the supporting documentation on the Developer Portal.
String region = "region_example"; // String | Indicates the region where the client wants the transaction to be processed. This will override the default processing region identified for the client. Available options are argentina, brazil, germany, india and northamerica. Region specific store setup and APIGEE boarding is required in order to use an alternate region for processing.
try {
    PaymentUrlResponse result = apiInstance.createPaymentUrl(contentType, clientRequestId, apiKey, timestamp, paymentUrlRequest, messageSignature, region);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentUrlApi#createPaymentUrl");
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
 **paymentUrlRequest** | [**PaymentUrlRequest**](PaymentUrlRequest.md)| Accepted request type: PaymentUrlRequest. |
 **messageSignature** | **String**| Used to ensure the request has not been tampered with during transmission. The Message-Signature is the Base64 encoded HMAC hash (SHA256 algorithm with the API Secret as the key.) For more information, refer to the supporting documentation on the Developer Portal. | [optional]
 **region** | **String**| Indicates the region where the client wants the transaction to be processed. This will override the default processing region identified for the client. Available options are argentina, brazil, germany, india and northamerica. Region specific store setup and APIGEE boarding is required in order to use an alternate region for processing. | [optional]

### Return type

[**PaymentUrlResponse**](PaymentUrlResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deletePaymentUrl"></a>
# **deletePaymentUrl**
> PaymentUrlResponse deletePaymentUrl(contentType, clientRequestId, apiKey, timestamp, messageSignature, region, storeId, transactionId, orderId, paymentUrlId, transactionTime)

Delete a payment URL.

Use this to delete an embedding payment link.

### Example
```java
// Import classes:
//import com.github.GBSEcom.client.ApiException;
//import com.github.GBSEcom.api.PaymentUrlApi;


PaymentUrlApi apiInstance = new PaymentUrlApi();
String contentType = "application/json"; // String | Content type.
String clientRequestId = "clientRequestId_example"; // String | A client-generated ID for request tracking and signature creation, unique per request.  This is also used for idempotency control. We recommend 128-bit UUID format.
String apiKey = "apiKey_example"; // String | Key given to merchant after boarding associating their requests with the appropriate app in Apigee.
Long timestamp = 56L; // Long | Epoch timestamp in milliseconds in the request from a client system. Used for Message Signature generation and time limit (5 mins).
String messageSignature = "messageSignature_example"; // String | Used to ensure the request has not been tampered with during transmission. The Message-Signature is the Base64 encoded HMAC hash (SHA256 algorithm with the API Secret as the key.) For more information, refer to the supporting documentation on the Developer Portal.
String region = "region_example"; // String | Indicates the region where the client wants the transaction to be processed. This will override the default processing region identified for the client. Available options are argentina, brazil, germany, india and northamerica. Region specific store setup and APIGEE boarding is required in order to use an alternate region for processing.
String storeId = "storeId_example"; // String | An optional outlet ID for clients that support multiple stores in the same developer app.
String transactionId = "transactionId_example"; // String | Gateway transaction identifier as returned in the parameter ipgTransactionId or merchantTransactionId.
String orderId = "orderId_example"; // String | Gateway order identifier as returned in the parameter orderId.
String paymentUrlId = "paymentUrlId_example"; // String | The ID code from the payment URL.
String transactionTime = "transactionTime_example"; // String | The transaction time in seconds since epoch.
try {
    PaymentUrlResponse result = apiInstance.deletePaymentUrl(contentType, clientRequestId, apiKey, timestamp, messageSignature, region, storeId, transactionId, orderId, paymentUrlId, transactionTime);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentUrlApi#deletePaymentUrl");
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
 **messageSignature** | **String**| Used to ensure the request has not been tampered with during transmission. The Message-Signature is the Base64 encoded HMAC hash (SHA256 algorithm with the API Secret as the key.) For more information, refer to the supporting documentation on the Developer Portal. | [optional]
 **region** | **String**| Indicates the region where the client wants the transaction to be processed. This will override the default processing region identified for the client. Available options are argentina, brazil, germany, india and northamerica. Region specific store setup and APIGEE boarding is required in order to use an alternate region for processing. | [optional]
 **storeId** | **String**| An optional outlet ID for clients that support multiple stores in the same developer app. | [optional]
 **transactionId** | **String**| Gateway transaction identifier as returned in the parameter ipgTransactionId or merchantTransactionId. | [optional]
 **orderId** | **String**| Gateway order identifier as returned in the parameter orderId. | [optional]
 **paymentUrlId** | **String**| The ID code from the payment URL. | [optional]
 **transactionTime** | **String**| The transaction time in seconds since epoch. | [optional]

### Return type

[**PaymentUrlResponse**](PaymentUrlResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="paymentUrlDetail"></a>
# **paymentUrlDetail**
> PaymentUrlDetailResponse paymentUrlDetail(contentType, clientRequestId, apiKey, timestamp, fromDate, toDate, messageSignature, region, storeId, orderId, merchantTransactionId, status)

Retrieve the state of payment URL.

Use this query to get the current state of an existing paymentURL.

### Example
```java
// Import classes:
//import com.github.GBSEcom.client.ApiException;
//import com.github.GBSEcom.api.PaymentUrlApi;


PaymentUrlApi apiInstance = new PaymentUrlApi();
String contentType = "application/json"; // String | Content type.
String clientRequestId = "clientRequestId_example"; // String | A client-generated ID for request tracking and signature creation, unique per request.  This is also used for idempotency control. We recommend 128-bit UUID format.
String apiKey = "apiKey_example"; // String | Key given to merchant after boarding associating their requests with the appropriate app in Apigee.
Long timestamp = 56L; // Long | Epoch timestamp in milliseconds in the request from a client system. Used for Message Signature generation and time limit (5 mins).
String fromDate = "fromDate_example"; // String | The start date for payment URL in seconds since epoch.
String toDate = "toDate_example"; // String | The end date for payment URL search query in seconds since epoch.
String messageSignature = "messageSignature_example"; // String | Used to ensure the request has not been tampered with during transmission. The Message-Signature is the Base64 encoded HMAC hash (SHA256 algorithm with the API Secret as the key.) For more information, refer to the supporting documentation on the Developer Portal.
String region = "region_example"; // String | Indicates the region where the client wants the transaction to be processed. This will override the default processing region identified for the client. Available options are argentina, brazil, germany, india and northamerica. Region specific store setup and APIGEE boarding is required in order to use an alternate region for processing.
String storeId = "storeId_example"; // String | An optional outlet ID for clients that support multiple stores in the same developer app.
String orderId = "orderId_example"; // String | Gateway order identifier as returned in the parameter orderId.
String merchantTransactionId = "merchantTransactionId_example"; // String | Gateway merchant identifier as returned in the parameter merchantTransactionId.
String status = "status_example"; // String | The status of payment URL.
try {
    PaymentUrlDetailResponse result = apiInstance.paymentUrlDetail(contentType, clientRequestId, apiKey, timestamp, fromDate, toDate, messageSignature, region, storeId, orderId, merchantTransactionId, status);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentUrlApi#paymentUrlDetail");
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
 **fromDate** | **String**| The start date for payment URL in seconds since epoch. |
 **toDate** | **String**| The end date for payment URL search query in seconds since epoch. |
 **messageSignature** | **String**| Used to ensure the request has not been tampered with during transmission. The Message-Signature is the Base64 encoded HMAC hash (SHA256 algorithm with the API Secret as the key.) For more information, refer to the supporting documentation on the Developer Portal. | [optional]
 **region** | **String**| Indicates the region where the client wants the transaction to be processed. This will override the default processing region identified for the client. Available options are argentina, brazil, germany, india and northamerica. Region specific store setup and APIGEE boarding is required in order to use an alternate region for processing. | [optional]
 **storeId** | **String**| An optional outlet ID for clients that support multiple stores in the same developer app. | [optional]
 **orderId** | **String**| Gateway order identifier as returned in the parameter orderId. | [optional]
 **merchantTransactionId** | **String**| Gateway merchant identifier as returned in the parameter merchantTransactionId. | [optional]
 **status** | **String**| The status of payment URL. | [optional]

### Return type

[**PaymentUrlDetailResponse**](PaymentUrlDetailResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

