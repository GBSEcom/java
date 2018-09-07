# OrderApi

All URIs are relative to *https://cert.api.firstdata.com/gateway*

Method | HTTP request | Description
------------- | ------------- | -------------
[**performPaymentPostAuthorisation**](OrderApiClient.md#performPaymentPostAuthorisation) | **POST** /v1/orders/{order-id}/postauth | Use this to capture/complete a transaction. Partial postauths are allowed.
[**returnTransaction**](OrderApiClient.md#returnTransaction) | **POST** /v1/orders/{order-id}/return | Use this to return/refund on the order. Partial returns are allowed.


<a name="performPaymentPostAuthorisation"></a>
# **performPaymentPostAuthorisation**
> TransactionResponse performPaymentPostAuthorisation(orderId, payload, storeId)

Use this to capture/complete a transaction. Partial postauths are allowed.

This can be used for postauth and partial postauths.

### Example
```java
MerchantCredentials creds = MerchantCredentials.of("apiSecret", "apiKey");
OrderApiClient client = OrderApiClient.create(creds);

// String | Gateway order identifier as returned in the parameter orderId
String orderId = "orderId_example";

// SecondaryTransaction |
SecondaryTransaction payload = new SecondaryTransaction();
// ... initialize payload ...

// String | an optional outlet id for clients that support multiple store in the same developer app
String storeId = "storeId_example";

try {
    TransactionResponse result = client.performPaymentPostAuthorisation(orderId, payload, storeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApiClient#performPaymentPostAuthorisation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **String**| Gateway order identifier as returned in the parameter orderId |
 **payload** | [**SecondaryTransaction**](SecondaryTransaction.md)|  |
 **storeId** | **String**| an optional outlet id for clients that support multiple store in the same developer app | [optional]

### Return type

[**TransactionResponse**](TransactionResponse.md)

<a name="returnTransaction"></a>
# **returnTransaction**
> TransactionResponse returnTransaction(orderId, payload, storeId)

Use this to return/refund on the order. Partial returns are allowed.

This can be used for Returns and Partial Returns.

### Example
```java
MerchantCredentials creds = MerchantCredentials.of("apiSecret", "apiKey");
OrderApiClient client = OrderApiClient.create(creds);

// String | Gateway order identifier as returned in the parameter orderId
String orderId = "orderId_example";

// SecondaryTransaction | 
SecondaryTransaction payload = new SecondaryTransaction();
// ... initialize payload ...

// String | an optional outlet id for clients that support multiple store in the same developer app
String storeId = "storeId_example";

try {
    TransactionResponse result = client.returnTransaction(orderId, payload, storeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApiClient#returnTransaction");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **String**| Gateway order identifier as returned in the parameter orderId |
 **payload** | [**SecondaryTransaction**](SecondaryTransaction.md)|  |
 **storeId** | **String**| an optional outlet id for clients that support multiple store in the same developer app | [optional]

### Return type

[**TransactionResponse**](TransactionResponse.md)

