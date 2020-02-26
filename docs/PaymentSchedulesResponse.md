
# PaymentSchedulesResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**requestStatus** | [**RequestStatusEnum**](#RequestStatusEnum) | Result of requested operation. If it&#39;s anything other than &#39;SUCCESS&#39;, please refer to 400s HTTP error codes or decline. See Error object for details. |  [optional]
**orderId** | **String** | Client order ID if supplied by client, otherwise the order ID. |  [optional]
**transactionResponse** | [**TransactionResponse**](TransactionResponse.md) |  |  [optional]


<a name="RequestStatusEnum"></a>
## Enum: RequestStatusEnum
Name | Value
---- | -----
SUCCESS | &quot;SUCCESS&quot;
VALIDATION_FAILED | &quot;VALIDATION_FAILED&quot;
PROCESSING_FAILED | &quot;PROCESSING_FAILED&quot;
FAILURE | &quot;FAILURE&quot;
DECLINED | &quot;DECLINED&quot;



