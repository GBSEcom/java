# PaymentApiClient

All URIs are relative to *https://cert.api.firstdata.com/gateway*

Method | HTTP request | Description
------------- | ------------- | -------------
[**performPaymentPostAuthorisation**](PaymentApiClient.md#performPaymentPostAuthorisation) | **POST** /v1/payments/{transaction-id}/postauth | Use this to capture/complete a transaction. Partial postauths are allowed.
[**primaryPaymentTransaction**](PaymentApiClient.md#primaryPaymentTransaction) | **POST** /v1/payments | Generate a primary transaction
[**returnTransaction**](PaymentApiClient.md#returnTransaction) | **POST** /v1/payments/{transaction-id}/return | Return/refund a transaction.
[**transactionInquiry**](PaymentApiClient.md#transactionInquiry) | **GET** /v1/payments/{transaction-id} | Retrieve the state of a transaction
[**voidTransaction**](PaymentApiClient.md#voidTransaction) | **POST** /v1/payments/{transaction-id}/void | Reverse a previous action on an existing transaction


<a name="performPaymentPostAuthorisation"></a>
# **performPaymentPostAuthorisation**
> TransactionResponse performPaymentPostAuthorisation(transactionId, payload, storeId)

Use this to capture/complete a transaction. Partial postauths are allowed.

This can be used for postauth and partial postauths.

### Example
```java
MerchantCredentials creds = MerchantCredentials.of("apiSecret", "apiKey");
PaymentApiClient client = PaymentApiClient.create(creds);

// String | Gateway transaction identifier as returned in the parameter ipgTransactionId
String transactionId = "transactionId_example";

// SecondaryTransaction |
SecondaryTransaction payload = new SecondaryTransaction();
// ... initialize payload ...

// String | an optional outlet id for clients that support multiple store in the same developer app
String storeId = "storeId_example";

try {
    TransactionResponse result = client.performPaymentPostAuthorization(transactionId, payload, storeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentApiClient#performPaymentPostAuthorisation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transactionId** | **String**| Gateway transaction identifier as returned in the parameter ipgTransactionId |
 **payload** | [**SecondaryTransaction**](SecondaryTransaction.md)|  |
 **storeId** | **String**| an optional outlet id for clients that support multiple store in the same developer app | [optional]

### Return type

[**TransactionResponse**](TransactionResponse.md)

<a name="primaryPaymentTransaction"></a>
# **primaryPaymentTransaction**
> TransactionResponse primaryPaymentTransaction(payload)

Generate a primary transaction

Use this to originate a financial transaction, like a sale, preauthorization, or credit.

### Example
```java
MerchantCredentials creds = MerchantCredentials.of("apiSecret", "apiKey");
PaymentApiClient client = PaymentApiClient.create(creds);

// PrimaryTransaction | Primary Transaction request
PrimaryTransaction payload = new PrimaryTransaction();
// ... initialize payload ...

try {
    TransactionResponse result = client.primaryPaymentTransaction(payload);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentApiClient#primaryPaymentTransaction");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**PrimaryTransaction**](PrimaryTransaction.md)| Primary Transaction request |

### Return type

[**TransactionResponse**](TransactionResponse.md)

<a name="returnTransaction"></a>
# **returnTransaction**
> TransactionResponse returnTransaction(contentType, clientRequestId, apiKey, timestamp, messageSignature, transactionId, payload, storeId)

Return/refund a transaction.

Use this to return/refund an existing transaction.  Partial returns are allowed.

### Example
```java
MerchantCredentials creds = MerchantCredentials.of("apiSecret", "apiKey");
PaymentApiClient client = PaymentApiClient.create(creds);

// String | Gateway transaction identifier as returned in the parameter ipgTransactionId
String transactionId = "transactionId_example";

// SecondaryTransaction |
SecondaryTransaction payload = new SecondaryTransaction();
// ... initialize payload ...

// String | an optional outlet id for clients that support multiple store in the same developer app
String storeId = "storeId_example";

try {
    TransactionResponse result = client.returnTransaction(transactionId, payload, storeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentApiClient#returnTransaction");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transactionId** | **String**| Gateway transaction identifier as returned in the parameter ipgTransactionId |
 **payload** | [**SecondaryTransaction**](SecondaryTransaction.md)|  |
 **storeId** | **String**| an optional outlet id for clients that support multiple store in the same developer app | [optional]

### Return type

[**TransactionResponse**](TransactionResponse.md)

<a name="transactionInquiry"></a>
# **transactionInquiry**
> TransactionResponse transactionInquiry(transactionId, storeId)

Retrieve the state of a transaction

Use this query to get the current state of an existing transaction.

### Example
```java
MerchantCredentials creds = MerchantCredentials.of("apiSecret", "apiKey");
PaymentApiClient client = PaymentApiClient.create(creds);

// String | Gateway transaction identifier as returned in the parameter ipgTransactionId
String transactionId = "transactionId_example";

// String | an optional outlet id for clients that support multiple store in the same developer app
String storeId = "storeId_example";

try {
    TransactionResponse result = client.transactionInquiry(transactionId, storeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentApiClient#transactionInquiry");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transactionId** | **String**| Gateway transaction identifier as returned in the parameter ipgTransactionId |
 **storeId** | **String**| an optional outlet id for clients that support multiple store in the same developer app | [optional]

### Return type

[**TransactionResponse**](TransactionResponse.md)

<a name="voidTransaction"></a>
# **voidTransaction**
> TransactionResponse voidTransaction(transactionId, storeId)

Reverse a previous action on an existing transaction

Use this to reverse a postauth/completion, credit, preauth, or sale.

### Example
```java
MerchantCredentials creds = MerchantCredentials.of("apiSecret", "apiKey");
PaymentApiClient client = PaymentApiClient.create(creds);

// String | Gateway transaction identifier as returned in the parameter ipgTransactionId
String transactionId = "transactionId_example";

// String | an optional outlet id for clients that support multiple store in the same developer app
String storeId = "storeId_example";

try {
    TransactionResponse result = apiInstance.voidTransaction(transactionId, storeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentApiClient#voidTransaction");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transactionId** | **String**| Gateway transaction identifier as returned in the parameter ipgTransactionId |
 **storeId** | **String**| an optional outlet id for clients that support multiple store in the same developer app | [optional]

### Return type

[**TransactionResponse**](TransactionResponse.md)

