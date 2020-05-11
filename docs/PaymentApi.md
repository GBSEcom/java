# PaymentApi

All URIs are relative to *https://cert.api.firstdata.com/gateway/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**finalizeSecureTransaction**](PaymentApi.md#finalizeSecureTransaction) | **PATCH** /payments/{transaction-id} | Update a 3DSecure or UnionPay payment and continue processing.
[**submitPrimaryTransaction**](PaymentApi.md#submitPrimaryTransaction) | **POST** /payments | Generate a primary transaction.
[**submitSecondaryTransaction**](PaymentApi.md#submitSecondaryTransaction) | **POST** /payments/{transaction-id} | Perform a secondary transaction.
[**transactionInquiry**](PaymentApi.md#transactionInquiry) | **GET** /payments/{transaction-id} | Retrieve the state of a transaction.


<a name="finalizeSecureTransaction"></a>
# **finalizeSecureTransaction**
> TransactionResponse finalizeSecureTransaction(contentType, clientRequestId, apiKey, timestamp, transactionId, authenticationUpdateRequest, messageSignature, region)

Update a 3DSecure or UnionPay payment and continue processing.

Use this to handle a 3DSecure redirect response or UnionPay authentication, updating the transaction and continuing processing.

### Example
```java
// Import classes:
//import com.github.GBSEcom.client.ApiException;
//import com.github.GBSEcom.api.PaymentApi;


PaymentApi apiInstance = new PaymentApi();
String contentType = "application/json"; // String | Content type.
String clientRequestId = "clientRequestId_example"; // String | A client-generated ID for request tracking and signature creation, unique per request.  This is also used for idempotency control. We recommend 128-bit UUID format.
String apiKey = "apiKey_example"; // String | Key given to merchant after boarding associating their requests with the appropriate app in Apigee.
Long timestamp = 56L; // Long | Epoch timestamp in milliseconds in the request from a client system. Used for Message Signature generation and time limit (5 mins).
String transactionId = "transactionId_example"; // String | Gateway transaction identifier as returned in the parameter ipgTransactionId.
AuthenticationUpdateRequest authenticationUpdateRequest = new AuthenticationUpdateRequest(); // AuthenticationUpdateRequest | Accepted request types: Secure3D10AuthenticationUpdateRequest, Secure3D21AuthenticationUpdateRequest, and UnionPayAuthenticationUpdateRequest.
String messageSignature = "messageSignature_example"; // String | Used to ensure the request has not been tampered with during transmission. The Message-Signature is the Base64 encoded HMAC hash (SHA256 algorithm with the API Secret as the key.) For more information, refer to the supporting documentation on the Developer Portal.
String region = "region_example"; // String | Indicates the region where the client wants the transaction to be processed. This will override the default processing region identified for the client. Available options are argentina, brazil, germany, india and northamerica. Region specific store setup and APIGEE boarding is required in order to use an alternate region for processing.
try {
    TransactionResponse result = apiInstance.finalizeSecureTransaction(contentType, clientRequestId, apiKey, timestamp, transactionId, authenticationUpdateRequest, messageSignature, region);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentApi#finalizeSecureTransaction");
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
 **transactionId** | **String**| Gateway transaction identifier as returned in the parameter ipgTransactionId. |
 **authenticationUpdateRequest** | [**AuthenticationUpdateRequest**](AuthenticationUpdateRequest.md)| Accepted request types: Secure3D10AuthenticationUpdateRequest, Secure3D21AuthenticationUpdateRequest, and UnionPayAuthenticationUpdateRequest. |
 **messageSignature** | **String**| Used to ensure the request has not been tampered with during transmission. The Message-Signature is the Base64 encoded HMAC hash (SHA256 algorithm with the API Secret as the key.) For more information, refer to the supporting documentation on the Developer Portal. | [optional]
 **region** | **String**| Indicates the region where the client wants the transaction to be processed. This will override the default processing region identified for the client. Available options are argentina, brazil, germany, india and northamerica. Region specific store setup and APIGEE boarding is required in order to use an alternate region for processing. | [optional]

### Return type

[**TransactionResponse**](TransactionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="submitPrimaryTransaction"></a>
# **submitPrimaryTransaction**
> TransactionResponse submitPrimaryTransaction(contentType, clientRequestId, apiKey, timestamp, primaryTransaction, messageSignature, region)

Generate a primary transaction.

Use this to originate a financial transaction like a sale, preauthorization, or credit.

### Example
```java
// Import classes:
//import com.github.GBSEcom.client.ApiException;
//import com.github.GBSEcom.api.PaymentApi;


PaymentApi apiInstance = new PaymentApi();
String contentType = "application/json"; // String | Content type.
String clientRequestId = "clientRequestId_example"; // String | A client-generated ID for request tracking and signature creation, unique per request.  This is also used for idempotency control. We recommend 128-bit UUID format.
String apiKey = "apiKey_example"; // String | Key given to merchant after boarding associating their requests with the appropriate app in Apigee.
Long timestamp = 56L; // Long | Epoch timestamp in milliseconds in the request from a client system. Used for Message Signature generation and time limit (5 mins).
PrimaryTransaction primaryTransaction = new PrimaryTransaction(); // PrimaryTransaction | Accepted request types: AliPaySaleTransaction, ChinaPnRSaleTransaction, PaymentCardCreditTransaction, PaymentCardForcedTicketTransaction, PaymentCardSaleTransaction, PaymentCardPreAuthTransaction, PaymentCardPayerAuthTransaction, PaymentCardDisbursementTransaction, PaymentTokenCreditTransaction, PaymentTokenPreAuthTransaction, PaymentTokenSaleTransaction, PaymentTokenDisbursementTransaction, PaypalCreditTransaction, SepaSaleTransaction, WalletSaleTransaction, and WalletPreAuthTransaction, PaymentDeviceSaleTransaction, PaymentDevicePreAuthTransaction, PaymentDeviceCreditTransaction, PaymentDeviceDisbursementTransaction.
String messageSignature = "messageSignature_example"; // String | Used to ensure the request has not been tampered with during transmission. The Message-Signature is the Base64 encoded HMAC hash (SHA256 algorithm with the API Secret as the key.) For more information, refer to the supporting documentation on the Developer Portal.
String region = "region_example"; // String | Indicates the region where the client wants the transaction to be processed. This will override the default processing region identified for the client. Available options are argentina, brazil, germany, india and northamerica. Region specific store setup and APIGEE boarding is required in order to use an alternate region for processing.
try {
    TransactionResponse result = apiInstance.submitPrimaryTransaction(contentType, clientRequestId, apiKey, timestamp, primaryTransaction, messageSignature, region);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentApi#submitPrimaryTransaction");
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
 **primaryTransaction** | [**PrimaryTransaction**](PrimaryTransaction.md)| Accepted request types: AliPaySaleTransaction, ChinaPnRSaleTransaction, PaymentCardCreditTransaction, PaymentCardForcedTicketTransaction, PaymentCardSaleTransaction, PaymentCardPreAuthTransaction, PaymentCardPayerAuthTransaction, PaymentCardDisbursementTransaction, PaymentTokenCreditTransaction, PaymentTokenPreAuthTransaction, PaymentTokenSaleTransaction, PaymentTokenDisbursementTransaction, PaypalCreditTransaction, SepaSaleTransaction, WalletSaleTransaction, and WalletPreAuthTransaction, PaymentDeviceSaleTransaction, PaymentDevicePreAuthTransaction, PaymentDeviceCreditTransaction, PaymentDeviceDisbursementTransaction. |
 **messageSignature** | **String**| Used to ensure the request has not been tampered with during transmission. The Message-Signature is the Base64 encoded HMAC hash (SHA256 algorithm with the API Secret as the key.) For more information, refer to the supporting documentation on the Developer Portal. | [optional]
 **region** | **String**| Indicates the region where the client wants the transaction to be processed. This will override the default processing region identified for the client. Available options are argentina, brazil, germany, india and northamerica. Region specific store setup and APIGEE boarding is required in order to use an alternate region for processing. | [optional]

### Return type

[**TransactionResponse**](TransactionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="submitSecondaryTransaction"></a>
# **submitSecondaryTransaction**
> TransactionResponse submitSecondaryTransaction(contentType, clientRequestId, apiKey, timestamp, transactionId, secondaryTransaction, messageSignature, region, storeId)

Perform a secondary transaction.

Use this to perform a void, postAuth or return secondary transaction. Partial postAuths and returns are allowed.

### Example
```java
// Import classes:
//import com.github.GBSEcom.client.ApiException;
//import com.github.GBSEcom.api.PaymentApi;


PaymentApi apiInstance = new PaymentApi();
String contentType = "application/json"; // String | Content type.
String clientRequestId = "clientRequestId_example"; // String | A client-generated ID for request tracking and signature creation, unique per request.  This is also used for idempotency control. We recommend 128-bit UUID format.
String apiKey = "apiKey_example"; // String | Key given to merchant after boarding associating their requests with the appropriate app in Apigee.
Long timestamp = 56L; // Long | Epoch timestamp in milliseconds in the request from a client system. Used for Message Signature generation and time limit (5 mins).
String transactionId = "transactionId_example"; // String | Gateway transaction identifier as returned in the parameter ipgTransactionId.
SecondaryTransaction secondaryTransaction = new SecondaryTransaction(); // SecondaryTransaction | Accepted request types: PostAuthTransaction, VoidTransaction, and ReturnTransaction.
String messageSignature = "messageSignature_example"; // String | Used to ensure the request has not been tampered with during transmission. The Message-Signature is the Base64 encoded HMAC hash (SHA256 algorithm with the API Secret as the key.) For more information, refer to the supporting documentation on the Developer Portal.
String region = "region_example"; // String | Indicates the region where the client wants the transaction to be processed. This will override the default processing region identified for the client. Available options are argentina, brazil, germany, india and northamerica. Region specific store setup and APIGEE boarding is required in order to use an alternate region for processing.
String storeId = "storeId_example"; // String | An optional outlet ID for clients that support multiple stores in the same developer app.
try {
    TransactionResponse result = apiInstance.submitSecondaryTransaction(contentType, clientRequestId, apiKey, timestamp, transactionId, secondaryTransaction, messageSignature, region, storeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentApi#submitSecondaryTransaction");
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
 **transactionId** | **String**| Gateway transaction identifier as returned in the parameter ipgTransactionId. |
 **secondaryTransaction** | [**SecondaryTransaction**](SecondaryTransaction.md)| Accepted request types: PostAuthTransaction, VoidTransaction, and ReturnTransaction. |
 **messageSignature** | **String**| Used to ensure the request has not been tampered with during transmission. The Message-Signature is the Base64 encoded HMAC hash (SHA256 algorithm with the API Secret as the key.) For more information, refer to the supporting documentation on the Developer Portal. | [optional]
 **region** | **String**| Indicates the region where the client wants the transaction to be processed. This will override the default processing region identified for the client. Available options are argentina, brazil, germany, india and northamerica. Region specific store setup and APIGEE boarding is required in order to use an alternate region for processing. | [optional]
 **storeId** | **String**| An optional outlet ID for clients that support multiple stores in the same developer app. | [optional]

### Return type

[**TransactionResponse**](TransactionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="transactionInquiry"></a>
# **transactionInquiry**
> TransactionResponse transactionInquiry(contentType, clientRequestId, apiKey, timestamp, transactionId, messageSignature, region, storeId)

Retrieve the state of a transaction.

Use this query to get the current state of an existing transaction.

### Example
```java
// Import classes:
//import com.github.GBSEcom.client.ApiException;
//import com.github.GBSEcom.api.PaymentApi;


PaymentApi apiInstance = new PaymentApi();
String contentType = "application/json"; // String | Content type.
String clientRequestId = "clientRequestId_example"; // String | A client-generated ID for request tracking and signature creation, unique per request.  This is also used for idempotency control. We recommend 128-bit UUID format.
String apiKey = "apiKey_example"; // String | Key given to merchant after boarding associating their requests with the appropriate app in Apigee.
Long timestamp = 56L; // Long | Epoch timestamp in milliseconds in the request from a client system. Used for Message Signature generation and time limit (5 mins).
String transactionId = "transactionId_example"; // String | Gateway transaction identifier as returned in the parameter ipgTransactionId.
String messageSignature = "messageSignature_example"; // String | Used to ensure the request has not been tampered with during transmission. The Message-Signature is the Base64 encoded HMAC hash (SHA256 algorithm with the API Secret as the key.) For more information, refer to the supporting documentation on the Developer Portal.
String region = "region_example"; // String | Indicates the region where the client wants the transaction to be processed. This will override the default processing region identified for the client. Available options are argentina, brazil, germany, india and northamerica. Region specific store setup and APIGEE boarding is required in order to use an alternate region for processing.
String storeId = "storeId_example"; // String | An optional outlet ID for clients that support multiple stores in the same developer app.
try {
    TransactionResponse result = apiInstance.transactionInquiry(contentType, clientRequestId, apiKey, timestamp, transactionId, messageSignature, region, storeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentApi#transactionInquiry");
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
 **transactionId** | **String**| Gateway transaction identifier as returned in the parameter ipgTransactionId. |
 **messageSignature** | **String**| Used to ensure the request has not been tampered with during transmission. The Message-Signature is the Base64 encoded HMAC hash (SHA256 algorithm with the API Secret as the key.) For more information, refer to the supporting documentation on the Developer Portal. | [optional]
 **region** | **String**| Indicates the region where the client wants the transaction to be processed. This will override the default processing region identified for the client. Available options are argentina, brazil, germany, india and northamerica. Region specific store setup and APIGEE boarding is required in order to use an alternate region for processing. | [optional]
 **storeId** | **String**| An optional outlet ID for clients that support multiple stores in the same developer app. | [optional]

### Return type

[**TransactionResponse**](TransactionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

