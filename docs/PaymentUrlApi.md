# PaymentUrlApi

All URIs are relative to *https://cert.api.firstdata.com/gateway*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createPaymentUrl**](PaymentUrlApi.md#createPaymentUrl) | **POST** /v1/payment-url | Create a payment URL.


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
String contentType = "application/json"; // String | content type
String clientRequestId = "clientRequestId_example"; // String | A client-generated ID for request tracking and signature creation, unique per request.  This is also used for idempotency control. We recommend 128-bit UUID format.
String apiKey = "apiKey_example"; // String | 
Long timestamp = 56L; // Long | Epoch timestamp in milliseconds in the request from a client system. Used for Message Signature generation and time limit (5 mins).
PaymentUrlRequest paymentUrlRequest = new PaymentUrlRequest(); // PaymentUrlRequest | 
String messageSignature = "messageSignature_example"; // String | Used to ensure the request has not been tampered with during transmission. The Message-Signature is the Base64 encoded HMAC hash (SHA256  algorithm with the API Secret as the key.) For more information, refer to the supporting documentation on the Developer Portal.
String region = "region_example"; // String | The region where client wants to process the transaction
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
 **contentType** | **String**| content type | [default to application/json] [enum: application/json]
 **clientRequestId** | **String**| A client-generated ID for request tracking and signature creation, unique per request.  This is also used for idempotency control. We recommend 128-bit UUID format. |
 **apiKey** | **String**|  |
 **timestamp** | **Long**| Epoch timestamp in milliseconds in the request from a client system. Used for Message Signature generation and time limit (5 mins). |
 **paymentUrlRequest** | [**PaymentUrlRequest**](PaymentUrlRequest.md)|  |
 **messageSignature** | **String**| Used to ensure the request has not been tampered with during transmission. The Message-Signature is the Base64 encoded HMAC hash (SHA256  algorithm with the API Secret as the key.) For more information, refer to the supporting documentation on the Developer Portal. | [optional]
 **region** | **String**| The region where client wants to process the transaction | [optional]

### Return type

[**PaymentUrlResponse**](PaymentUrlResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

