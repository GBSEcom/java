

# PaymentUrlErrorResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**clientRequestId** | **String** | Echoes back the value in the request header for tracking. |  [optional]
**apiTraceId** | **String** | Request identifier in API, can be used to request logs from the support team. |  [optional]
**responseType** | [**ResponseType**](ResponseType.md) |  |  [optional]
**requestStatus** | [**RequestStatusEnum**](#RequestStatusEnum) | Request status. If it is anything other than &#39;SUCCESS&#39;, please refer to 400s HTTP error codes or decline. See Error object for details. |  [optional]
**orderId** | **String** | Client order ID if supplied by client, otherwise the order ID. |  [optional]
**paymentUrl** | **String** | URL for embedded payment link. |  [optional]
**transactionId** | **String** | ID code from the transaction. |  [optional]
**error** | [**Error**](Error.md) |  |  [optional]



## Enum: RequestStatusEnum

Name | Value
---- | -----
SUCCESS | &quot;SUCCESS&quot;
VALIDATION_FAILED | &quot;VALIDATION_FAILED&quot;
PROCESSING_FAILED | &quot;PROCESSING_FAILED&quot;
FAILURE | &quot;FAILURE&quot;



