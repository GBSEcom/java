
# PaymentUrlResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**clientRequestId** | **String** | Echoes back the value in the Request header for tracking. | 
**apiTraceId** | **String** | Request identifier in API, can be used to request logs from the support. | 
**requestStatus** | [**RequestStatusEnum**](#RequestStatusEnum) | Request status. If it&#39;s anything other than &#39;SUCCESS&#39;, please refer to 400s HTTP error codes or decline. See Error object for details. | 
**orderId** | **String** | Client Order ID if supplied by client, otherwise the Order ID. |  [optional]
**paymentUrl** | **String** |  |  [optional]
**transactionId** | **String** | ID code from the transaction. |  [optional]


<a name="RequestStatusEnum"></a>
## Enum: RequestStatusEnum
Name | Value
---- | -----
SUCCESS | &quot;SUCCESS&quot;
VALIDATION_FAILED | &quot;VALIDATION_FAILED&quot;
PROCESSING_FAILED | &quot;PROCESSING_FAILED&quot;
FAILURE | &quot;FAILURE&quot;



