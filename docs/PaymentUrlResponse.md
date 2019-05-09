
# PaymentUrlResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**requestStatus** | [**RequestStatusEnum**](#RequestStatusEnum) | Request status. If it is anything other than &#39;SUCCESS&#39;, please refer to 400s HTTP error codes or decline. See Error object for details. |  [optional]
**orderId** | **String** | Client Order ID if supplied by client, otherwise the Order ID. |  [optional]
**paymentUrl** | **String** | URL for embedded payment link |  [optional]
**transactionId** | **String** | ID code from the transaction. |  [optional]


<a name="RequestStatusEnum"></a>
## Enum: RequestStatusEnum
Name | Value
---- | -----
SUCCESS | &quot;SUCCESS&quot;
VALIDATION_FAILED | &quot;VALIDATION_FAILED&quot;
PROCESSING_FAILED | &quot;PROCESSING_FAILED&quot;
FAILURE | &quot;FAILURE&quot;



