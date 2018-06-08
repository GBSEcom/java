# PaymentApi

All URIs are relative to *https://api.payeezy.com/globalApi/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**postAuthTransaction**](PaymentApi.md#postAuthTransaction) | **POST** /payments/{transaction-id}/postauth | Postauth transaction
[**refundTransaction**](PaymentApi.md#refundTransaction) | **POST** /payments/{transaction-id}/return | Return/Refund transaction
[**voidTransaction**](PaymentApi.md#voidTransaction) | **POST** /payments/{transaction-id}/void | Void transaction
[**createTransaction**](PaymentApi.md#createTransaction) | **POST** /payments | Primary transaction creation


<a name="postAuthTransaction"></a>
# **postAuthTransaction**
> CertificateCreationResponse postAuthTransaction(transactionId, payload)

Postauth transaction

Use this to capture/complete a preauth transaction. Partial postauths are allowed.

### Example
```java
// Import classes:
//import com.firstdata.apiclient.ApiException;
//import com.firstdata.apiclient.api.PaymentApi;

String apiSecret = "apiSecret_example";

// Developer App API key.
// This is used for API authentication. Keys are provided at the time of merchant boarding.
String apiKey = "apiKey_example";

PaymentApi apiInstance = new PaymentApi(apiSecret, apiKey);

// String | Identifies the primary transaction
String transactionId = "transactionId_example";

SecondaryTransaction payload = new SecondaryTransaction();

try {
    CertificateCreationResponse result = apiInstance.postAuthTransaction(transactionId, payload);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentApi#postAuthTransaction");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transactionId** | **String**| Identifies the primary transaction |
 **payload** | [**SecondaryTransaction**](SecondaryTransaction.md)|  |

### Return type

[**CertificateCreationResponse**](CertificateCreationResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="refundTransaction"></a>
# **refundTransaction**
> TransactionResponse refundTransaction(transactionId, payload)

Return/Refund transaction

Use this for returns and partial returns.

### Example
```java
// Import classes:
//import com.firstdata.apiclient.ApiException;
//import com.firstdata.apiclient.api.PaymentApi;

String apiSecret = "apiSecret_example";

// Developer App API key. This is used for API authentication. Keys are provided at the time of merchant boarding.
String apiKey = "apiKey_example";

PaymentApi apiInstance = new PaymentApi(apiSecret, apiKey);

// Identifies the primary transaction
String transactionId = "transactionId_example";

// SecondaryTransaction
SecondaryTransaction payload = new SecondaryTransaction();

try {
    TransactionResponse result = apiInstance.refundTransaction(transactionId, payload);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentApi#refundTransaction");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transactionId** | **String**| Identifies the primary transaction |
 **payload** | [**SecondaryTransaction**](SecondaryTransaction.md)|  |

### Return type

[**TransactionResponse**](TransactionResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="voidTransaction"></a>
# **voidTransaction**
> TransactionResponse voidTransaction(transactionId)

Void transaction

This is used to reverse a financial transaction such as Postauth, Return, Preauth, or Sale.

### Example
```java
// Import classes:
//import com.firstdata.apiclient.ApiException;
//import com.firstdata.apiclient.api.PaymentApi;

String apiSecret = "apiSecret_example";

// Developer App API key. This is used for API authentication. Keys are provided at the time of merchant boarding.
String apiKey = "apiKey_example";

PaymentApi apiInstance = new PaymentApi(apiSecret, apiKey);

// Identifies the primary transaction
String transactionId = "transactionId_example";

try {
    TransactionResponse result = apiInstance.voidTransaction(transactionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentApi#voidTransaction");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transactionId** | **String**| Identifies the primary transaction |

### Return type

[**TransactionResponse**](TransactionResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createTransaction"></a>
# **createTransaction**
> TransactionResponse createTransaction(payload)

Primary transaction creation

Use this to originate a financial transaction, like a sale, authorization, or credit.

### Example
```java
// Import classes:
//import com.firstdata.apiclient.ApiException;
//import com.firstdata.apiclient.api.PaymentApi;

String apiSecret = "apiSecret_example";

// Developer App API key. This is used for API authentication. Keys are provided at the time of merchant boarding.
String apiKey = "apiKey_example";

PaymentApi apiInstance = new PaymentApi(apiSecret, apiKey);

// PrimaryTransaction | Primary Transaction request
PrimaryTransaction payload = new PrimaryTransaction();

try {
    TransactionResponse result = apiInstance.createTransaction(payload);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentApi#createTransaction");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**PrimaryTransaction**](PrimaryTransaction.md)| Primary Transaction request |

### Return type

[**TransactionResponse**](TransactionResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

