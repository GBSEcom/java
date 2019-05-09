
# PaymentTokenizationResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**requestStatus** | [**RequestStatusEnum**](#RequestStatusEnum) | The status of the request |  [optional]
**requestTime** | **String** | Time of the request |  [optional]
**avsResponse** | [**AVSResponse**](AVSResponse.md) |  |  [optional]
**securityCodeResponse** | **String** | Optional security code check response |  [optional]
**brand** | **String** | Card brand |  [optional]
**country** | **String** | Country of the card issued |  [optional]
**paymentToken** | [**PaymentTokenization**](PaymentTokenization.md) |  |  [optional]
**paymentCard** | [**PaymentCard**](PaymentCard.md) |  |  [optional]


<a name="RequestStatusEnum"></a>
## Enum: RequestStatusEnum
Name | Value
---- | -----
DELETED | &quot;DELETED&quot;
FAILED | &quot;FAILED&quot;
SUCCESS | &quot;SUCCESS&quot;
APPROVED | &quot;APPROVED&quot;
WAITING | &quot;WAITING&quot;
VALIDATION_FAILED | &quot;VALIDATION_FAILED&quot;
DECLINED | &quot;DECLINED&quot;



