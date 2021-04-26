

# PaymentSchedulesResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**clientRequestId** | **String** | Echoes back the value in the request header for tracking. |  [optional]
**apiTraceId** | **String** | Request identifier in API, can be used to request logs from the support team. |  [optional]
**responseType** | [**ResponseType**](ResponseType.md) |  |  [optional]
**requestStatus** | [**RequestStatusEnum**](#RequestStatusEnum) | Result of requested operation. If it&#39;s anything other than &#39;SUCCESS&#39;, please refer to 400s HTTP error codes or decline. See Error object for details. |  [optional]
**orderId** | **String** | Note - Client Order ID if supplied by client. If not supplied by client, IPG will generate. The first 12 alphanumeric digits are passed down to Fiserv Enterprise reporting tool, Clientline and Data File Manager (DFM). |  [optional]
**transactionResponse** | [**TransactionResponse**](TransactionResponse.md) |  |  [optional]



## Enum: RequestStatusEnum

Name | Value
---- | -----
SUCCESS | &quot;SUCCESS&quot;
VALIDATION_FAILED | &quot;VALIDATION_FAILED&quot;
PROCESSING_FAILED | &quot;PROCESSING_FAILED&quot;
FAILURE | &quot;FAILURE&quot;
DECLINED | &quot;DECLINED&quot;



