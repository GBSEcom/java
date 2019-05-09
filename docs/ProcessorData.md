
# ProcessorData

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**referenceNumber** | **String** |  |  [optional]
**authorizationCode** | **String** |  |  [optional]
**responseCode** | **String** |  |  [optional]
**associationResponseCode** | **String** |  |  [optional]
**responseMessage** | **String** |  |  [optional]
**avsResponse** | [**AVSResponse**](AVSResponse.md) |  |  [optional]
**securityCodeResponse** | [**SecurityCodeResponseEnum**](#SecurityCodeResponseEnum) |  |  [optional]


<a name="SecurityCodeResponseEnum"></a>
## Enum: SecurityCodeResponseEnum
Name | Value
---- | -----
MATCHED | &quot;MATCHED&quot;
NOT_MATCHED | &quot;NOT_MATCHED&quot;
NOT_PROCESSED | &quot;NOT_PROCESSED&quot;
NOT_PRESENT | &quot;NOT_PRESENT&quot;
NOT_CERTIFIED | &quot;NOT_CERTIFIED&quot;



