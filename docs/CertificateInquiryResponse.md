
# CertificateInquiryResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**clientRequestId** | **String** | Echoes back the value in the request header for tracking |  [optional]
**apiTraceId** | **String** | Request identifier in API, can be used to request logs from the support |  [optional]
**certificates** | [**List&lt;Certificate&gt;**](Certificate.md) |  |  [optional]
**requestStatus** | [**RequestStatusEnum**](#RequestStatusEnum) | Request status. If it&#39;s anything other than &#39;SUCCESS&#39;, please refer to 400s HTTP error codes or decline. See Error object for details. |  [optional]
**error** | [**Error**](Error.md) |  |  [optional]


<a name="RequestStatusEnum"></a>
## Enum: RequestStatusEnum
Name | Value
---- | -----
SUCCESS | &quot;SUCCESS&quot;
VALIDATION_FAILED | &quot;VALIDATION_FAILED&quot;
ERROR | &quot;ERROR&quot;



