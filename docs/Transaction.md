
# Transaction

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**transactionState** | [**TransactionStateEnum**](#TransactionStateEnum) | The state of the transaction. |  [optional]
**ipgTransactionId** | **String** | The transaction ID. |  [optional]
**orderId** | **String** | Client order ID if supplied by client. |  [optional]
**transactionType** | [**TransactionType**](TransactionType.md) |  |  [optional]
**paymentMethodDetails** | [**PaymentMethodDetails**](PaymentMethodDetails.md) |  |  [optional]
**transactionAmount** | [**Amount**](Amount.md) |  |  [optional]
**submissionComponent** | [**SubmissionComponentEnum**](#SubmissionComponentEnum) | The submission component. |  [optional]
**payerSecurityLevel** | **String** | The payer security level. |  [optional]
**transactionTime** | **Long** | The transaction time in seconds since epoch. |  [optional]
**storeId** | **String** | Store ID number. |  [optional]
**userId** | **String** | The user ID. |  [optional]
**processor** | [**ProcessorData**](ProcessorData.md) |  |  [optional]


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


<a name="SubmissionComponentEnum"></a>
## Enum: SubmissionComponentEnum
Name | Value
---- | -----
API | &quot;API&quot;
BUS | &quot;BUS&quot;
CONNECT | &quot;CONNECT&quot;
CORE | &quot;CORE&quot;
EPAS | &quot;EPAS&quot;
MCS | &quot;MCS&quot;
RESTAPI | &quot;RESTAPI&quot;
SWITCH | &quot;SWITCH&quot;
VT | &quot;VT&quot;



