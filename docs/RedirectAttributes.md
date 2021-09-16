

# RedirectAttributes

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**challengeIndicator** | [**ChallengeIndicatorEnum**](#ChallengeIndicatorEnum) | Indicates whether or not a challenge should be performed. 01 &#x3D; No preference (You have no preference whether a challenge should be performed. This is the default value) 02 &#x3D; No challenge requested (You prefer that no challenge should be performed) 03 &#x3D; Challenge requested: 3DS Requestor Preference (You prefer that a challenge should be performed) 04 &#x3D; Challenge requested: Mandate (There are local or regional mandates that mean that a challenge must be performed)  |  [optional]
**authenticateTransaction** | **Boolean** | If 3D secure should be applied. |  [optional]
**threeDSEmvCoMessageCategory** | [**ThreeDSEmvCoMessageCategoryEnum**](#ThreeDSEmvCoMessageCategoryEnum) | EmvCo Messag Category |  [optional]
**browserJavaScriptEnabled** | **Boolean** | Browser Java Script Enabled flag |  [optional]
**override3dsCountryExclusion** | **Boolean** | Override 3ds Country Exclusion flag |  [optional]
**threeDSTransactionType** | [**ThreeDSTransactionTypeEnum**](#ThreeDSTransactionTypeEnum) | Secure 3D Transaction Type |  [optional]
**skipTRA** | **Boolean** | skip TRA exemption for the transaction |  [optional]
**fullBypass** | **Boolean** | Full by pass flag |  [optional]
**mobileMode** | **Boolean** | Mobile mode flag |  [optional]
**paymentMode** | [**PaymentModeEnum**](#PaymentModeEnum) | Payment Mode |  [optional]
**language** | **String** | Language used by client. |  [optional]



## Enum: ChallengeIndicatorEnum

Name | Value
---- | -----
_01 | &quot;01&quot;
_02 | &quot;02&quot;
_03 | &quot;03&quot;
_04 | &quot;04&quot;



## Enum: ThreeDSEmvCoMessageCategoryEnum

Name | Value
---- | -----
_01 | &quot;01&quot;
_02 | &quot;02&quot;
_80 | &quot;80&quot;



## Enum: ThreeDSTransactionTypeEnum

Name | Value
---- | -----
_01 | &quot;01&quot;
_03 | &quot;03&quot;
_10 | &quot;10&quot;
_11 | &quot;11&quot;
_28 | &quot;28&quot;



## Enum: PaymentModeEnum

Name | Value
---- | -----
FULLPAY | &quot;FULLPAY&quot;
PAYONLY | &quot;PAYONLY&quot;
PAYPLUS | &quot;PAYPLUS&quot;



