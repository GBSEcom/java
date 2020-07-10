
# InitiateClearingResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**requestStatus** | [**RequestStatusEnum**](#RequestStatusEnum) | Request status. If it is anything other than &#39;SUCCESS&#39;, please refer to 400s HTTP error codes or decline. See Error object for details. |  [optional]
**clearingDetails** | [**ClearingDetails**](ClearingDetails.md) |  |  [optional]
**endpointResponses** | [**List&lt;EndpointResponse&gt;**](EndpointResponse.md) | The array holds response information of the involved endpoints. |  [optional]


<a name="RequestStatusEnum"></a>
## Enum: RequestStatusEnum
Name | Value
---- | -----
SUCCESS | &quot;SUCCESS&quot;
PROCESSING_FAILED | &quot;PROCESSING_FAILED&quot;
FAILURE | &quot;FAILURE&quot;



