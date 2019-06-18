# FraudDetectApi

All URIs are relative to *https://cert.api.firstdata.com/gateway/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**scoreOnly**](FraudDetectApi.md#scoreOnly) | **POST** /fraud/score-only | Score a transaction for fraud.


<a name="scoreOnly"></a>
# **scoreOnly**
> ScoreOnlyResponse scoreOnly(contentType, clientRequestId, apiKey, timestamp, scoreOnlyRequest, messageSignature, region)

Score a transaction for fraud.

Use this to obtain a fraud score for a transaction.

### Example
```java
// Import classes:
//import com.github.GBSEcom.client.ApiException;
//import com.github.GBSEcom.api.FraudDetectApi;


FraudDetectApi apiInstance = new FraudDetectApi();
String contentType = "application/json"; // String | Content type.
String clientRequestId = "clientRequestId_example"; // String | A client-generated ID for request tracking and signature creation, unique per request.  This is also used for idempotency control. We recommend 128-bit UUID format.
String apiKey = "apiKey_example"; // String | Key given to merchant after boarding associating their requests with the appropriate app in Apigee.
Long timestamp = 56L; // Long | Epoch timestamp in milliseconds in the request from a client system. Used for Message Signature generation and time limit (5 mins).
ScoreOnlyRequest scoreOnlyRequest = new ScoreOnlyRequest(); // ScoreOnlyRequest | Accepted request type: ScoreOnlyRequest.
String messageSignature = "messageSignature_example"; // String | Used to ensure the request has not been tampered with during transmission. The Message-Signature is the Base64 encoded HMAC hash (SHA256 algorithm with the API Secret as the key.) For more information, refer to the supporting documentation on the Developer Portal.
String region = "region_example"; // String | Indicates the region where the client wants the transaction to be processed. This will override the default processing region identified for the client. Available options are argentina, brazil, germany, india and northamerica. Region specific store setup and APIGEE boarding is required in order to use an alternate region for processing.
try {
    ScoreOnlyResponse result = apiInstance.scoreOnly(contentType, clientRequestId, apiKey, timestamp, scoreOnlyRequest, messageSignature, region);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FraudDetectApi#scoreOnly");
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
 **scoreOnlyRequest** | [**ScoreOnlyRequest**](ScoreOnlyRequest.md)| Accepted request type: ScoreOnlyRequest. |
 **messageSignature** | **String**| Used to ensure the request has not been tampered with during transmission. The Message-Signature is the Base64 encoded HMAC hash (SHA256 algorithm with the API Secret as the key.) For more information, refer to the supporting documentation on the Developer Portal. | [optional]
 **region** | **String**| Indicates the region where the client wants the transaction to be processed. This will override the default processing region identified for the client. Available options are argentina, brazil, germany, india and northamerica. Region specific store setup and APIGEE boarding is required in order to use an alternate region for processing. | [optional]

### Return type

[**ScoreOnlyResponse**](ScoreOnlyResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

