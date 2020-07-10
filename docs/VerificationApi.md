# VerificationApi

All URIs are relative to *https://cert.api.firstdata.com/gateway/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**verifyAccount**](VerificationApi.md#verifyAccount) | **POST** /account-verification | Verify a payment card or payment token.
[**verifyCard**](VerificationApi.md#verifyCard) | **POST** /card-verification | Verify a payment card.


<a name="verifyAccount"></a>
# **verifyAccount**
> TransactionResponse verifyAccount(contentType, clientRequestId, apiKey, timestamp, accountVerificationRequest, messageSignature, region)

Verify a payment card or payment token.

Use this to perform an account verification for a payment card or payment token.

### Example
```java
// Import classes:
//import com.github.GBSEcom.client.ApiException;
//import com.github.GBSEcom.api.VerificationApi;


VerificationApi apiInstance = new VerificationApi();
String contentType = "application/json"; // String | Content type.
String clientRequestId = "clientRequestId_example"; // String | A client-generated ID for request tracking and signature creation, unique per request.  This is also used for idempotency control. We recommend 128-bit UUID format.
String apiKey = "apiKey_example"; // String | Key given to merchant after boarding associating their requests with the appropriate app in Apigee.
Long timestamp = 56L; // Long | Epoch timestamp in milliseconds in the request from a client system. Used for Message Signature generation and time limit (5 mins).
AccountVerificationRequest accountVerificationRequest = new AccountVerificationRequest(); // AccountVerificationRequest | Accepted request type: PaymentCardVerificationRequest and PaymentTokenVerificationRequest.
String messageSignature = "messageSignature_example"; // String | Used to ensure the request has not been tampered with during transmission. The Message-Signature is the Base64 encoded HMAC hash (SHA256 algorithm with the API Secret as the key.) For more information, refer to the supporting documentation on the Developer Portal.
String region = "region_example"; // String | Indicates the region where the client wants the transaction to be processed. This will override the default processing region identified for the client. Available options are argentina, brazil, germany, india and northamerica. Region specific store setup and APIGEE boarding is required in order to use an alternate region for processing.
try {
    TransactionResponse result = apiInstance.verifyAccount(contentType, clientRequestId, apiKey, timestamp, accountVerificationRequest, messageSignature, region);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VerificationApi#verifyAccount");
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
 **accountVerificationRequest** | [**AccountVerificationRequest**](AccountVerificationRequest.md)| Accepted request type: PaymentCardVerificationRequest and PaymentTokenVerificationRequest. |
 **messageSignature** | **String**| Used to ensure the request has not been tampered with during transmission. The Message-Signature is the Base64 encoded HMAC hash (SHA256 algorithm with the API Secret as the key.) For more information, refer to the supporting documentation on the Developer Portal. | [optional]
 **region** | **String**| Indicates the region where the client wants the transaction to be processed. This will override the default processing region identified for the client. Available options are argentina, brazil, germany, india and northamerica. Region specific store setup and APIGEE boarding is required in order to use an alternate region for processing. | [optional]

### Return type

[**TransactionResponse**](TransactionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="verifyCard"></a>
# **verifyCard**
> TransactionResponse verifyCard(contentType, clientRequestId, apiKey, timestamp, cardVerificationRequest, messageSignature, region)

Verify a payment card.

Use this to perform card verification for a payment card. Use the account-verification endpoint instead for this request.

### Example
```java
// Import classes:
//import com.github.GBSEcom.client.ApiException;
//import com.github.GBSEcom.api.VerificationApi;


VerificationApi apiInstance = new VerificationApi();
String contentType = "application/json"; // String | Content type.
String clientRequestId = "clientRequestId_example"; // String | A client-generated ID for request tracking and signature creation, unique per request.  This is also used for idempotency control. We recommend 128-bit UUID format.
String apiKey = "apiKey_example"; // String | Key given to merchant after boarding associating their requests with the appropriate app in Apigee.
Long timestamp = 56L; // Long | Epoch timestamp in milliseconds in the request from a client system. Used for Message Signature generation and time limit (5 mins).
CardVerificationRequest cardVerificationRequest = new CardVerificationRequest(); // CardVerificationRequest | Accepted request type: CardVerificationRequest.
String messageSignature = "messageSignature_example"; // String | Used to ensure the request has not been tampered with during transmission. The Message-Signature is the Base64 encoded HMAC hash (SHA256 algorithm with the API Secret as the key.) For more information, refer to the supporting documentation on the Developer Portal.
String region = "region_example"; // String | Indicates the region where the client wants the transaction to be processed. This will override the default processing region identified for the client. Available options are argentina, brazil, germany, india and northamerica. Region specific store setup and APIGEE boarding is required in order to use an alternate region for processing.
try {
    TransactionResponse result = apiInstance.verifyCard(contentType, clientRequestId, apiKey, timestamp, cardVerificationRequest, messageSignature, region);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VerificationApi#verifyCard");
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
 **cardVerificationRequest** | [**CardVerificationRequest**](CardVerificationRequest.md)| Accepted request type: CardVerificationRequest. |
 **messageSignature** | **String**| Used to ensure the request has not been tampered with during transmission. The Message-Signature is the Base64 encoded HMAC hash (SHA256 algorithm with the API Secret as the key.) For more information, refer to the supporting documentation on the Developer Portal. | [optional]
 **region** | **String**| Indicates the region where the client wants the transaction to be processed. This will override the default processing region identified for the client. Available options are argentina, brazil, germany, india and northamerica. Region specific store setup and APIGEE boarding is required in order to use an alternate region for processing. | [optional]

### Return type

[**TransactionResponse**](TransactionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

