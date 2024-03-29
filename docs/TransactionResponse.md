

# TransactionResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**clientRequestId** | **String** | Echoes back the value in the request header for tracking. |  [optional]
**apiTraceId** | **String** | Request identifier in API, can be used to request logs from the support team. |  [optional]
**responseType** | [**ResponseType**](ResponseType.md) |  |  [optional]
**ipgTransactionId** | **String** | The response transaction ID. |  [optional]
**orderId** | **String** | Note - Client Order ID if supplied by client. If not supplied by client, IPG will generate. The first 12 alphanumeric digits are passed down to Fiserv Enterprise reporting tool, Clientline and Data File Manager (DFM). |  [optional]
**transactionType** | [**TransactionType**](TransactionType.md) |  |  [optional]
**paymentToken** | [**PaymentTokenDetails**](PaymentTokenDetails.md) |  |  [optional]
**transactionOrigin** | [**TransactionOrigin**](TransactionOrigin.md) |  |  [optional]
**paymentMethodDetails** | [**PaymentMethodDetails**](PaymentMethodDetails.md) |  |  [optional]
**country** | **String** | Country of the card issuer. |  [optional]
**terminalId** | **String** | The terminal that is processing the transaction. |  [optional]
**merchantId** | **String** | The unique (on Acquirer level) mechant ID. Usually this value has been chosen from the merchant itself and will be used in communication with the endpoint. |  [optional]
**merchantTransactionId** | **String** | The unique merchant transaction ID from the request header, if supplied. |  [optional]
**transactionTime** | **Long** | The transaction time in seconds since epoch. |  [optional]
**approvedAmount** | [**Amount**](Amount.md) |  |  [optional]
**transactionStatus** | [**TransactionStatusEnum**](#TransactionStatusEnum) | Represents the status of a transaction immediately following the original processing request. This value is not stored for the transaction and is only available in the response when the transaction is processed. TransactionStatus is not returned on either the transaction inquiry or on the order inquiry. |  [optional]
**transactionState** | [**TransactionStateEnum**](#TransactionStateEnum) | Shows the state of the current transaction. |  [optional]
**paymentAccountReferenceNumber** | **String** | Payment Account Reference Number from response, if supplied. |  [optional]
**secure3dResponse** | [**Secure3dResponse**](Secure3dResponse.md) |  |  [optional]
**standinResponseDetails** | [**StandinResponseDetails**](StandinResponseDetails.md) |  |  [optional]
**redirectURL** | **String** | The endpoint redirection URL. |  [optional]
**authenticationResponse** | [**Secure3DAuthenticationResponse**](Secure3DAuthenticationResponse.md) |  |  [optional]
**schemeTransactionId** | **String** | The transaction ID received from schemes for the initial transaction of card on file flows. |  [optional]
**processor** | [**ProcessorData**](ProcessorData.md) |  |  [optional]
**additionalDetails** | [**AdditionalTransactionDetails**](AdditionalTransactionDetails.md) |  |  [optional]
**accountUpdaterResponse** | [**AccountUpdaterResponse**](AccountUpdaterResponse.md) |  |  [optional]
**achResponse** | [**AchResponse**](AchResponse.md) |  |  [optional]
**currencyConversionResponse** | [**CurrencyConversionResponse**](CurrencyConversionResponse.md) |  |  [optional]
**steps** | [**List&lt;PaymentStepRequest&gt;**](PaymentStepRequest.md) | Steps to be performed by the payer. |  [optional]



## Enum: TransactionStatusEnum

Name | Value
---- | -----
APPROVED | &quot;APPROVED&quot;
WAITING | &quot;WAITING&quot;
PARTIAL | &quot;PARTIAL&quot;
VALIDATION_FAILED | &quot;VALIDATION_FAILED&quot;
PROCESSING_FAILED | &quot;PROCESSING_FAILED&quot;
DECLINED | &quot;DECLINED&quot;



## Enum: TransactionStateEnum

Name | Value
---- | -----
AUTHORIZED | &quot;AUTHORIZED&quot;
CAPTURED | &quot;CAPTURED&quot;
DECLINED | &quot;DECLINED&quot;
CHECKED | &quot;CHECKED&quot;
COMPLETED_GET | &quot;COMPLETED_GET&quot;
INITIALIZED | &quot;INITIALIZED&quot;
PENDING | &quot;PENDING&quot;
READY | &quot;READY&quot;
TEMPLATE | &quot;TEMPLATE&quot;
SETTLED | &quot;SETTLED&quot;
VOIDED | &quot;VOIDED&quot;
WAITING | &quot;WAITING&quot;



