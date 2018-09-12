# ApiClient

All URIs are relative to *https://cert.api.firstdata.com/gateway*

Method | HTTP request | Description
------------- | ------------- | -------------
[**requestAccessToken**](ApiClient.md#requestAccessToken) | **POST** /v1/authentication/access-tokens | Generate an access token for user authentication
[**performPaymentPostAuthorisationByOrder**](ApiClient.md#performPaymentPostAuthorisationByOrder) | **POST** /v1/orders/{order-id}/postauth | Use this to capture/complete a transaction. Partial postauths are allowed.
[**returnTransactionByOrder**](ApiClient.md#returnTransactionByOrder) | **POST** /v1/orders/{order-id}/return | Use this to return/refund on the order. Partial returns are allowed.
[**performPaymentPostAuthorisationByTransaction**](ApiClient.md#performPaymentPostAuthorisationByTransaction) | **POST** /v1/payments/{transaction-id}/postauth | Use this to capture/complete a transaction. Partial postauths are allowed.
[**primaryPaymentTransaction**](ApiClient.md#primaryPaymentTransaction) | **POST** /v1/payments | Generate a primary transaction
[**returnTransaction**](ApiClient.md#returnTransaction) | **POST** /v1/payments/{transaction-id}/return | Return/refund a transaction.
[**transactionInquiry**](ApiClient.md#transactionInquiry) | **GET** /v1/payments/{transaction-id} | Retrieve the state of a transaction
[**voidTransaction**](ApiClient.md#voidTransaction) | **POST** /v1/payments/{transaction-id}/void | Reverse a previous action on an existing transaction


<a name="requestAccessToken"></a>
# **requestAccessToken**
> AccessTokenResponse requestAccessToken()

Generate an access token for user authentication

This is the access token generation call for authorizing subsequent financial transactions. A valid access token is required for web client requests. 

### Return type

[**AccessTokenResponse**](AccessTokenResponse.md)

<a name="performPaymentPostAuthorisationByOrder"></a>
# **performPaymentPostAuthorisationByOrder**
> TransactionResponse performPaymentPostAuthorisationByOrder(orderId, payload, storeId)

Use this to capture/complete a transaction. Partial postauths are allowed.

This can be used for postauth and partial postauths.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **String**| Gateway order identifier as returned in the parameter orderId |
 **payload** | [**SecondaryTransaction**](SecondaryTransaction.md)|  |
 **storeId** | **String**| an optional outlet id for clients that support multiple store in the same developer app | [optional]

### Return type

[**TransactionResponse**](TransactionResponse.md)

<a name="returnTransactionByOrder"></a>
# **returnTransaction**
> TransactionResponse returnTransactionByOrder(orderId, payload, storeId)

Use this to return/refund on the order. Partial returns are allowed.

This can be used for Returns and Partial Returns.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **String**| Gateway order identifier as returned in the parameter orderId |
 **payload** | [**SecondaryTransaction**](SecondaryTransaction.md)|  |
 **storeId** | **String**| an optional outlet id for clients that support multiple store in the same developer app | [optional]

### Return type

[**TransactionResponse**](TransactionResponse.md)

<a name="performPaymentPostAuthorisationByTransaction"></a>
# **performPaymentPostAuthorisationByTransaction**
> TransactionResponse performPaymentPostAuthorisationByTransaction(transactionId, payload, storeId)

Use this to capture/complete a transaction. Partial postauths are allowed.

This can be used for postauth and partial postauths.

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

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transactionId** | **String**| Gateway transaction identifier as returned in the parameter ipgTransactionId |
 **storeId** | **String**| an optional outlet id for clients that support multiple store in the same developer app | [optional]

### Return type

[**TransactionResponse**](TransactionResponse.md)

