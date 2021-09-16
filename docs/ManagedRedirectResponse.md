

# ManagedRedirectResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**clientRequestId** | **String** | Echoes back the value in the request header for tracking. |  [optional]
**apiTraceId** | **String** | Request identifier in API, can be used to request logs from the support team. |  [optional]
**responseType** | [**ResponseType**](ResponseType.md) |  |  [optional]
**requestStatus** | [**RequestStatusEnum**](#RequestStatusEnum) | The status of the request. |  [optional]
**orderId** | **String** | Note - Client Order ID if supplied by client which should not contain any special characters or spaces. If not supplied by client, IPG will generate. The first 12 alphanumeric digits are passed down to Fiserv Enterprise reporting tool, Clientline and Data File Manager (DFM). |  [optional]
**redirectURL** | **String** | URL for embedded payment link. |  [optional]
**transactionId** | **String** | ID code from the transaction. |  [optional]



## Enum: RequestStatusEnum

Name | Value
---- | -----
SUCCESS | &quot;SUCCESS&quot;
VALIDATION_FAILED | &quot;VALIDATION_FAILED&quot;
PROCESSING_FAILED | &quot;PROCESSING_FAILED&quot;
FAILURE | &quot;FAILURE&quot;



