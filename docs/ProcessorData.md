
# ProcessorData

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**referenceNumber** | **String** | Reference transaction ID. |  [optional]
**authorizationCode** | **String** | Code returned to confirm transaction. |  [optional]
**responseCode** | **String** | Response code from endpoints. |  [optional]
**network** | **String** | Network used for transaction. |  [optional]
**associationResponseCode** | **String** | Raw response code from issuer. |  [optional]
**responseMessage** | **String** | Message returned from endpoints. |  [optional]
**avsResponse** | [**AVSResponse**](AVSResponse.md) |  |  [optional]
**securityCodeResponse** | [**SecurityCodeResponseEnum**](#SecurityCodeResponseEnum) | Code returned for CVV. |  [optional]
**merchantAdviceCodeIndicator** | **String** | Code to map merchant advice code to ISO specification. |  [optional]


<a name="SecurityCodeResponseEnum"></a>
## Enum: SecurityCodeResponseEnum
Name | Value
---- | -----
MATCHED | &quot;MATCHED&quot;
NOT_MATCHED | &quot;NOT_MATCHED&quot;
NOT_PROCESSED | &quot;NOT_PROCESSED&quot;
NOT_PRESENT | &quot;NOT_PRESENT&quot;
NOT_CERTIFIED | &quot;NOT_CERTIFIED&quot;



