

# PaymentTokenUpdateResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**clientRequestId** | **String** | Echoes back the value in the request header for tracking. |  [optional]
**apiTraceId** | **String** | Request identifier in API, can be used to request logs from the support team. |  [optional]
**responseType** | [**ResponseType**](ResponseType.md) |  |  [optional]
**requestStatus** | [**RequestStatusEnum**](#RequestStatusEnum) | The status of the request. |  [optional]
**requestTime** | **Long** | Time of the request. |  [optional]
**errors** | [**List&lt;Error&gt;**](Error.md) |  |  [optional]



## Enum: RequestStatusEnum

Name | Value
---- | -----
FAILED | &quot;FAILED&quot;
SUCCESS | &quot;SUCCESS&quot;
PARTIAL_SUCCESS | &quot;PARTIAL_SUCCESS&quot;



