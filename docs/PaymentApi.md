# PaymentApi

All URIs are relative to *https://cert.api.firstdata.com/gateway*

Method | HTTP request | Description
------------- | ------------- | -------------
[**finalizeSecureTransaction**](PaymentApi.md#finalizeSecureTransaction) | **PATCH** /v1/payments/{transaction-id} | Update a 3DSecure or UnionPay payment and continue processing.
[**performPaymentPostAuthorisation**](PaymentApi.md#performPaymentPostAuthorisation) | **POST** /v1/payments/{transaction-id}/postauth | Capture/complete a transaction.
[**primaryPaymentTransaction**](PaymentApi.md#primaryPaymentTransaction) | **POST** /v1/payments | Generate a primary transaction.
[**returnTransaction**](PaymentApi.md#returnTransaction) | **POST** /v1/payments/{transaction-id}/return | Return/refund a transaction.
[**transactionInquiry**](PaymentApi.md#transactionInquiry) | **GET** /v1/payments/{transaction-id} | Retrieve the state of a transaction.
[**voidTransaction**](PaymentApi.md#voidTransaction) | **POST** /v1/payments/{transaction-id}/void | Reverse a previous action on an existing transaction.


<a name="finalizeSecureTransaction"></a>
# **finalizeSecureTransaction**
> TransactionResponse finalizeSecureTransaction(contentType, clientRequestId, apiKey, timestamp, transactionId, authenticationResponseVerificationRequest, messageSignature, region)

Update a 3DSecure or UnionPay payment and continue processing.

Use this to handle a 3DSecure redirect response or UnionPay authentication, updating the transaction and continuing processing.

### Example
```java
// Import classes:
//import com.github.GBSEcom.client.ApiException;
//import com.github.GBSEcom.api.PaymentApi;


PaymentApi apiInstance = new PaymentApi();
String contentType = "application/json"; // String | content type
String clientRequestId = "clientRequestId_example"; // String | A client-generated ID for request tracking and signature creation, unique per request.  This is also used for idempotency control. We recommend 128-bit UUID format.
String apiKey = "apiKey_example"; // String | 
Long timestamp = 56L; // Long | Epoch timestamp in milliseconds in the request from a client system. Used for Message Signature generation and time limit (5 mins).
String transactionId = "transactionId_example"; // String | Gateway transaction identifier as returned in the parameter ipgTransactionId
AuthenticationResponseVerificationRequest authenticationResponseVerificationRequest = new AuthenticationResponseVerificationRequest(); // AuthenticationResponseVerificationRequest | 
String messageSignature = "messageSignature_example"; // String | Used to ensure the request has not been tampered with during transmission. The Message-Signature is the Base64 encoded HMAC hash (SHA256  algorithm with the API Secret as the key.) For more information, refer to the supporting documentation on the Developer Portal.
String region = "region_example"; // String | The region where client wants to process the transaction
try {
    TransactionResponse result = apiInstance.finalizeSecureTransaction(contentType, clientRequestId, apiKey, timestamp, transactionId, authenticationResponseVerificationRequest, messageSignature, region);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentApi#finalizeSecureTransaction");
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
 **transactionId** | **String**| Gateway transaction identifier as returned in the parameter ipgTransactionId |
 **authenticationResponseVerificationRequest** | [**AuthenticationResponseVerificationRequest**](AuthenticationResponseVerificationRequest.md)|  |
 **messageSignature** | **String**| Used to ensure the request has not been tampered with during transmission. The Message-Signature is the Base64 encoded HMAC hash (SHA256  algorithm with the API Secret as the key.) For more information, refer to the supporting documentation on the Developer Portal. | [optional]
 **region** | **String**| The region where client wants to process the transaction | [optional]

### Return type

[**TransactionResponse**](TransactionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="performPaymentPostAuthorisation"></a>
# **performPaymentPostAuthorisation**
> TransactionResponse performPaymentPostAuthorisation(contentType, clientRequestId, apiKey, timestamp, transactionId, secondaryTransaction, messageSignature, region, storeId)

Capture/complete a transaction.

Used to capture/complete an existing transaction. Partial postauths are allowed.

### Example
```java
// Import classes:
//import com.github.GBSEcom.client.ApiException;
//import com.github.GBSEcom.api.PaymentApi;


PaymentApi apiInstance = new PaymentApi();
String contentType = "application/json"; // String | content type
String clientRequestId = "clientRequestId_example"; // String | A client-generated ID for request tracking and signature creation, unique per request.  This is also used for idempotency control. We recommend 128-bit UUID format.
String apiKey = "apiKey_example"; // String | 
Long timestamp = 56L; // Long | Epoch timestamp in milliseconds in the request from a client system. Used for Message Signature generation and time limit (5 mins).
String transactionId = "transactionId_example"; // String | Gateway transaction identifier as returned in the parameter ipgTransactionId
SecondaryTransaction secondaryTransaction = new SecondaryTransaction(); // SecondaryTransaction | 
String messageSignature = "messageSignature_example"; // String | Used to ensure the request has not been tampered with during transmission. The Message-Signature is the Base64 encoded HMAC hash (SHA256  algorithm with the API Secret as the key.) For more information, refer to the supporting documentation on the Developer Portal.
String region = "region_example"; // String | The region where client wants to process the transaction
String storeId = "storeId_example"; // String | An optional outlet ID for clients that support multiple stores in the same developer app
try {
    TransactionResponse result = apiInstance.performPaymentPostAuthorisation(contentType, clientRequestId, apiKey, timestamp, transactionId, secondaryTransaction, messageSignature, region, storeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentApi#performPaymentPostAuthorisation");
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
 **transactionId** | **String**| Gateway transaction identifier as returned in the parameter ipgTransactionId |
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

<a name="primaryPaymentTransaction"></a>
# **primaryPaymentTransaction**
> TransactionResponse primaryPaymentTransaction(contentType, clientRequestId, apiKey, timestamp, primaryTransaction, messageSignature, region)

Generate a primary transaction.

Use this to originate a financial transaction, like a sale, preauthorization, or credit.

### Example
```java
// Import classes:
//import com.github.GBSEcom.client.ApiException;
//import com.github.GBSEcom.api.PaymentApi;


PaymentApi apiInstance = new PaymentApi();
String contentType = "application/json"; // String | content type
String clientRequestId = "clientRequestId_example"; // String | A client-generated ID for request tracking and signature creation, unique per request.  This is also used for idempotency control. We recommend 128-bit UUID format.
String apiKey = "apiKey_example"; // String | 
Long timestamp = 56L; // Long | Epoch timestamp in milliseconds in the request from a client system. Used for Message Signature generation and time limit (5 mins).
PrimaryTransaction primaryTransaction = new PrimaryTransaction(); // PrimaryTransaction | Primary Transaction request
String messageSignature = "messageSignature_example"; // String | Used to ensure the request has not been tampered with during transmission. The Message-Signature is the Base64 encoded HMAC hash (SHA256  algorithm with the API Secret as the key.) For more information, refer to the supporting documentation on the Developer Portal.
String region = "region_example"; // String | The region where client wants to process the transaction
try {
    TransactionResponse result = apiInstance.primaryPaymentTransaction(contentType, clientRequestId, apiKey, timestamp, primaryTransaction, messageSignature, region);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentApi#primaryPaymentTransaction");
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
 **primaryTransaction** | [**PrimaryTransaction**](PrimaryTransaction.md)| Primary Transaction request |
 **messageSignature** | **String**| Used to ensure the request has not been tampered with during transmission. The Message-Signature is the Base64 encoded HMAC hash (SHA256  algorithm with the API Secret as the key.) For more information, refer to the supporting documentation on the Developer Portal. | [optional]
 **region** | **String**| The region where client wants to process the transaction | [optional]

### Return type

[**TransactionResponse**](TransactionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="returnTransaction"></a>
# **returnTransaction**
> TransactionResponse returnTransaction(contentType, clientRequestId, apiKey, timestamp, transactionId, secondaryTransaction, messageSignature, region, storeId)

Return/refund a transaction.

Use this to return/refund an existing transaction.  Partial returns are allowed.

### Example
```java
// Import classes:
//import com.github.GBSEcom.client.ApiException;
//import com.github.GBSEcom.api.PaymentApi;


PaymentApi apiInstance = new PaymentApi();
String contentType = "application/json"; // String | content type
String clientRequestId = "clientRequestId_example"; // String | A client-generated ID for request tracking and signature creation, unique per request.  This is also used for idempotency control. We recommend 128-bit UUID format.
String apiKey = "apiKey_example"; // String | 
Long timestamp = 56L; // Long | Epoch timestamp in milliseconds in the request from a client system. Used for Message Signature generation and time limit (5 mins).
String transactionId = "transactionId_example"; // String | Gateway transaction identifier as returned in the parameter ipgTransactionId
SecondaryTransaction secondaryTransaction = new SecondaryTransaction(); // SecondaryTransaction | 
String messageSignature = "messageSignature_example"; // String | Used to ensure the request has not been tampered with during transmission. The Message-Signature is the Base64 encoded HMAC hash (SHA256  algorithm with the API Secret as the key.) For more information, refer to the supporting documentation on the Developer Portal.
String region = "region_example"; // String | The region where client wants to process the transaction
String storeId = "storeId_example"; // String | An optional outlet ID for clients that support multiple stores in the same developer app
try {
    TransactionResponse result = apiInstance.returnTransaction(contentType, clientRequestId, apiKey, timestamp, transactionId, secondaryTransaction, messageSignature, region, storeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentApi#returnTransaction");
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
 **transactionId** | **String**| Gateway transaction identifier as returned in the parameter ipgTransactionId |
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
String contentType = "application/json"; // String | content type
String clientRequestId = "clientRequestId_example"; // String | A client-generated ID for request tracking and signature creation, unique per request.  This is also used for idempotency control. We recommend 128-bit UUID format.
String apiKey = "apiKey_example"; // String | 
Long timestamp = 56L; // Long | Epoch timestamp in milliseconds in the request from a client system. Used for Message Signature generation and time limit (5 mins).
String transactionId = "transactionId_example"; // String | Gateway transaction identifier as returned in the parameter ipgTransactionId
String messageSignature = "messageSignature_example"; // String | Used to ensure the request has not been tampered with during transmission. The Message-Signature is the Base64 encoded HMAC hash (SHA256  algorithm with the API Secret as the key.) For more information, refer to the supporting documentation on the Developer Portal.
String region = "region_example"; // String | The region where client wants to process the transaction
String storeId = "storeId_example"; // String | An optional outlet ID for clients that support multiple stores in the same developer app
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
 **contentType** | **String**| content type | [default to application/json] [enum: application/json]
 **clientRequestId** | **String**| A client-generated ID for request tracking and signature creation, unique per request.  This is also used for idempotency control. We recommend 128-bit UUID format. |
 **apiKey** | **String**|  |
 **timestamp** | **Long**| Epoch timestamp in milliseconds in the request from a client system. Used for Message Signature generation and time limit (5 mins). |
 **transactionId** | **String**| Gateway transaction identifier as returned in the parameter ipgTransactionId |
 **messageSignature** | **String**| Used to ensure the request has not been tampered with during transmission. The Message-Signature is the Base64 encoded HMAC hash (SHA256  algorithm with the API Secret as the key.) For more information, refer to the supporting documentation on the Developer Portal. | [optional]
 **region** | **String**| The region where client wants to process the transaction | [optional]
 **storeId** | **String**| An optional outlet ID for clients that support multiple stores in the same developer app | [optional]

### Return type

[**TransactionResponse**](TransactionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="voidTransaction"></a>
# **voidTransaction**
> TransactionResponse voidTransaction(contentType, clientRequestId, apiKey, timestamp, transactionId, messageSignature, region, storeId)

Reverse a previous action on an existing transaction.

Use this to reverse a postauth/completion, credit, preauth, or sale.

### Example
```java
// Import classes:
//import com.github.GBSEcom.client.ApiException;
//import com.github.GBSEcom.api.PaymentApi;


PaymentApi apiInstance = new PaymentApi();
String contentType = "application/json"; // String | content type
String clientRequestId = "clientRequestId_example"; // String | A client-generated ID for request tracking and signature creation, unique per request.  This is also used for idempotency control. We recommend 128-bit UUID format.
String apiKey = "apiKey_example"; // String | 
Long timestamp = 56L; // Long | Epoch timestamp in milliseconds in the request from a client system. Used for Message Signature generation and time limit (5 mins).
String transactionId = "transactionId_example"; // String | Gateway transaction identifier as returned in the parameter ipgTransactionId
String messageSignature = "messageSignature_example"; // String | Used to ensure the request has not been tampered with during transmission. The Message-Signature is the Base64 encoded HMAC hash (SHA256  algorithm with the API Secret as the key.) For more information, refer to the supporting documentation on the Developer Portal.
String region = "region_example"; // String | The region where client wants to process the transaction
String storeId = "storeId_example"; // String | An optional outlet ID for clients that support multiple stores in the same developer app
try {
    TransactionResponse result = apiInstance.voidTransaction(contentType, clientRequestId, apiKey, timestamp, transactionId, messageSignature, region, storeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentApi#voidTransaction");
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
 **transactionId** | **String**| Gateway transaction identifier as returned in the parameter ipgTransactionId |
 **messageSignature** | **String**| Used to ensure the request has not been tampered with during transmission. The Message-Signature is the Base64 encoded HMAC hash (SHA256  algorithm with the API Secret as the key.) For more information, refer to the supporting documentation on the Developer Portal. | [optional]
 **region** | **String**| The region where client wants to process the transaction | [optional]
 **storeId** | **String**| An optional outlet ID for clients that support multiple stores in the same developer app | [optional]

### Return type

[**TransactionResponse**](TransactionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

