

# CardInfoLookupResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**clientRequestId** | **String** | Echoes back the value in the request header for tracking. |  [optional]
**apiTraceId** | **String** | Request identifier in API, can be used to request logs from the support team. |  [optional]
**responseType** | [**ResponseType**](ResponseType.md) |  |  [optional]
**cardDetails** | [**List&lt;CardInfo&gt;**](CardInfo.md) | One or more card information retrieved based on BIN. |  [optional]
**requestStatus** | [**RequestStatusEnum**](#RequestStatusEnum) | Request status. |  [optional]



## Enum: RequestStatusEnum

Name | Value
---- | -----
SUCCESS | &quot;SUCCESS&quot;
LIST_EMPTY | &quot;LIST_EMPTY&quot;



