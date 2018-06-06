
# TransactionResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**clientRequestId** | **String** | Value echoed from the request header |  [optional]
**apiTraceId** | **String** | Echoes back the value in the request header |  [optional]
**ipgTransactionId** | **String** | The Gateway generated Transaction ID |  [optional]
**orderId** | **String** | Client Order ID if supplied by a client; otherwise the Order ID |  [optional]
**transactionType** | **String** | Transaction type |  [optional]
**authorizationCode** | **String** | The processor approval code for compliance |  [optional]
**avsResponse** | [**TransactionResponseAvsResponse**](TransactionResponseAvsResponse.md) |  |  [optional]
**cardCodeValueResponse** | [**CardCodeValueResponseEnum**](#CardCodeValueResponseEnum) | The processor card code validation response. |  [optional]
**brand** | **String** | Card brand of the payment instrument |  [optional]
**country** | **String** | Country of the card issuer |  [optional]
**terminalId** | **String** | The terminal that is processing the transaction |  [optional]
**clientTransactionId** | **String** | The unique client Transaction ID from the Request header, if supplied |  [optional]
**transactionTime** | **Long** | The transaction time in seconds since epoch |  [optional]
**approvedAmount** | [**Amount**](Amount.md) |  |  [optional]
**transactionStatus** | [**TransactionStatusEnum**](#TransactionStatusEnum) | APPROVED/WAITING are returned by endpoints. VALIDATION_FAILED/DECLINED are errors. See Error objects for details. |  [optional]
**authenticationRedirect** | [**TransactionResponseAuthenticationRedirect**](TransactionResponseAuthenticationRedirect.md) |  |  [optional]
**error** | [**Error**](Error.md) |  |  [optional]


<a name="CardCodeValueResponseEnum"></a>
## Enum: CardCodeValueResponseEnum
Name | Value
---- | -----
MATCHED | &quot;MATCHED&quot;
NOT_MATCHED | &quot;NOT_MATCHED&quot;
NOT_PROCESSED | &quot;NOT_PROCESSED&quot;
NOT_PRESENT | &quot;NOT_PRESENT&quot;
NOT_CERTIFIED | &quot;NOT_CERTIFIED&quot;
NO_RESPONSE | &quot;NO_RESPONSE&quot;
NOT_SENT | &quot;NOT_SENT&quot;


<a name="TransactionStatusEnum"></a>
## Enum: TransactionStatusEnum
Name | Value
---- | -----
APPROVED | &quot;APPROVED&quot;
WAITING | &quot;WAITING&quot;
VALIDATION_FAILED | &quot;VALIDATION_FAILED&quot;
DECLINED | &quot;DECLINED&quot;



