
# TransactionResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ipgTransactionId** | **String** | The Response Transaction ID |  [optional]
**orderId** | **String** | Client Order ID if supplied by client, otherwise the Order ID |  [optional]
**transactionType** | [**TransactionType**](TransactionType.md) |  |  [optional]
**paymentToken** | [**PaymentTokenization**](PaymentTokenization.md) |  |  [optional]
**transactionOrigin** | [**TransactionOrigin**](TransactionOrigin.md) |  |  [optional]
**paymentMethod** | [**PaymentMethod**](PaymentMethod.md) |  |  [optional]
**country** | **String** | Country of the card issuer |  [optional]
**terminalId** | **String** | The terminal that is processing the transaction |  [optional]
**merchantTransactionId** | **String** | The unique merchant Transaction ID from the Request header, if supplied |  [optional]
**transactionTime** | **Long** | The transaction time in seconds since Epoch |  [optional]
**approvedAmount** | [**Amount**](Amount.md) |  |  [optional]
**transactionStatus** | [**TransactionStatusEnum**](#TransactionStatusEnum) | The status of the transaction. APPROVED/WAITING are returned by the endpoints.  VALIDATION_FAILED/DECLINED are errors. See ErrorResponse object for details. |  [optional]
**transactionState** | [**TransactionStateEnum**](#TransactionStateEnum) | The state of the transaction. |  [optional]
**secure3dResponse** | [**Secure3dResponse**](Secure3dResponse.md) |  |  [optional]
**redirectURL** | **String** | The endpoint redirection URL. |  [optional]
**authenticationRedirect** | **Object** |  |  [optional]
**schemeTransactionId** | **String** | The transaction ID received from schemes for the initial transaction of card on file flows. |  [optional]
**processor** | [**ProcessorData**](ProcessorData.md) |  |  [optional]
**additionalDetails** | [**AdditionalTransactionDetails**](AdditionalTransactionDetails.md) |  |  [optional]


<a name="TransactionStatusEnum"></a>
## Enum: TransactionStatusEnum
Name | Value
---- | -----
APPROVED | &quot;APPROVED&quot;
WAITING | &quot;WAITING&quot;
VALIDATION_FAILED | &quot;VALIDATION_FAILED&quot;
PROCESSING_FAILED | &quot;PROCESSING_FAILED&quot;
DECLINED | &quot;DECLINED&quot;


<a name="TransactionStateEnum"></a>
## Enum: TransactionStateEnum
Name | Value
---- | -----
AUTHORIZED | &quot;AUTHORIZED&quot;
CAPTURED | &quot;CAPTURED&quot;
DECLINED | &quot;DECLINED&quot;
CHECKED | &quot;CHECKED&quot;
INITIALIZED | &quot;INITIALIZED&quot;
PENDING | &quot;PENDING&quot;
READY | &quot;READY&quot;
SETTLED | &quot;SETTLED&quot;
VOIDED | &quot;VOIDED&quot;
WAITING | &quot;WAITING&quot;



