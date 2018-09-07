
# TransactionErrorResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**responseType** | [**ResponseType**](ResponseType.md) | The schema type returned in the response. |  [optional]
**clientRequestId** | **String** | Echoes back the value in the Request header |  [optional]
**apiTraceId** | **String** | Echoes back the value in the Request header |  [optional]
**ipgTransactionId** | **String** | The Response Transaction ID |  [optional]
**orderId** | **String** | Client Order ID if supplied by client, otherwise the Order ID |  [optional]
**transactionType** | [**TransactionType**](TransactionType.md) |  |  [optional]
**authorizationCode** | **String** | The processor approval code for compliance. |  [optional]
**avsResponse** | **String** | The processor address validation response for compliance. |  [optional]
**securityCodeResponse** | **String** | The processor card verification validation response for compliance. |  [optional]
**brand** | **String** | Card brand of the payment instrument |  [optional]
**country** | **String** | Country of the card issuer |  [optional]
**terminalId** | **String** | The terminal that is processing the transaction |  [optional]
**clientTransactionId** | **String** | The unique client Transaction ID from the Request header, if supplied |  [optional]
**transactionTime** | **Long** | The transaction time in seconds since Epoch |  [optional]
**approvedAmount** | [**Amount**](Amount.md) |  |  [optional]
**transactionStatus** | [**TransactionStatusEnum**](#TransactionStatusEnum) | The status of the transaction. APPROVED/WAITING are returned by the endpoints.  VALIDATION_FAILED/DECLINED are errors. See ErrorResponse object for details. |  [optional]
**transactionState** | [**TransactionStateEnum**](#TransactionStateEnum) | The state of the transaction. |  [optional]
**authenticationRedirect** | [**TransactionResponseAuthenticationRedirect**](TransactionResponseAuthenticationRedirect.md) |  |  [optional]
**schemeTransactionId** | **String** | The transaction id received from schemes for the initial transaction, returned for the transactions marked as \&quot;FIRST\&quot; |  [optional]
**processor** | [**ProcessorData**](ProcessorData.md) |  |  [optional]
**error** | [**Error**](Error.md) |  |  [optional]


<a name="TransactionStatusEnum"></a>
## Enum: TransactionStatusEnum
Name | Value
---- | -----
APPROVED | &quot;APPROVED&quot;
WAITING | &quot;WAITING&quot;
VALIDATION_FAILED | &quot;VALIDATION_FAILED&quot;
DECLINED | &quot;DECLINED&quot;


<a name="TransactionStateEnum"></a>
## Enum: TransactionStateEnum
Name | Value
---- | -----
AUTHORIZED | &quot;AUTHORIZED&quot;
CAPTURED | &quot;CAPTURED&quot;
COMPLETED_GET | &quot;COMPLETED_GET&quot;
DECLINED | &quot;DECLINED&quot;
CHECKED | &quot;CHECKED&quot;
INITIALIZED | &quot;INITIALIZED&quot;
PENDING_AUTHORIZATION | &quot;PENDING_AUTHORIZATION&quot;
PENDING_AUTOVOID | &quot;PENDING_AUTOVOID&quot;
PENDING_CAPTURE | &quot;PENDING_CAPTURE&quot;
PENDING_CREDIT | &quot;PENDING_CREDIT&quot;
PENDING_GIROPAY_INIT | &quot;PENDING_GIROPAY_INIT&quot;
PENDING_IDEAL_INIT | &quot;PENDING_IDEAL_INIT&quot;
PENDING_INIT | &quot;PENDING_INIT&quot;
PENDING_READY | &quot;PENDING_READY&quot;
PENDING_RETURN | &quot;PENDING_RETURN&quot;
PENDING_SETTLEMENT | &quot;PENDING_SETTLEMENT&quot;
PENDING_SOFORT_INIT | &quot;PENDING_SOFORT_INIT&quot;
PENDING_VOID | &quot;PENDING_VOID&quot;
READY | &quot;READY&quot;
SETTLED | &quot;SETTLED&quot;
VOIDED | &quot;VOIDED&quot;
WAITING | &quot;WAITING&quot;
WAITING_AUTHENTICATION | &quot;WAITING_AUTHENTICATION&quot;
WAITING_3D_SECURE | &quot;WAITING_3D_SECURE&quot;
WAITING_CLICK_AND_BUY | &quot;WAITING_CLICK_AND_BUY&quot;
WAITING_GIROPAY | &quot;WAITING_GIROPAY&quot;
WAITING_IDEAL | &quot;WAITING_IDEAL&quot;
WAITING_KLARNA | &quot;WAITING_KLARNA&quot;
WAITING_PAYPAL | &quot;WAITING_PAYPAL&quot;
WAITING_PAYPAL_EVENT | &quot;WAITING_PAYPAL_EVENT&quot;
WAITING_PPRO_LONG_WAITING | &quot;WAITING_PPRO_LONG_WAITING&quot;
WAITING_SOFORT | &quot;WAITING_SOFORT&quot;
WAITING_T_PAY | &quot;WAITING_T_PAY&quot;
WAITING_ALIPAY_PAYSECURE | &quot;WAITING_ALIPAY_PAYSECURE&quot;



