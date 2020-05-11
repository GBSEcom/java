
# Secure3D21AuthenticationRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**termURL** | **String** | The result of the authentication will be sent to this URL. If not provided, a term URL will be dynamically generated. |  [optional]
**methodNotificationURL** | **String** | The 3DS method iframe and transaction ID will be sent here. |  [optional]
**challengeIndicator** | [**ChallengeIndicatorEnum**](#ChallengeIndicatorEnum) | Indicates whether or not a challenge should be performed. 01 &#x3D; No preference (You have no preference whether a challenge should be performed. This is the default value) 02 &#x3D; No challenge requested (You prefer that no challenge should be performed) 03 &#x3D; Challenge requested: 3DS Requestor Preference (You prefer that a challenge should be performed) 04 &#x3D; Challenge requested: Mandate (There are local or regional mandates that mean that a challenge must be performed)  |  [optional]
**challengeWindowSize** | [**ChallengeWindowSizeEnum**](#ChallengeWindowSizeEnum) | Defines the size of the challenge window displayed to customers during authentication. 01 &#x3D; 250 x 400 02 &#x3D; 390 x 400 03 &#x3D; 500 x 600 04 &#x3D; 600 x 400 05 &#x3D; Full screen  |  [optional]


<a name="ChallengeIndicatorEnum"></a>
## Enum: ChallengeIndicatorEnum
Name | Value
---- | -----
_01 | &quot;01&quot;
_02 | &quot;02&quot;
_03 | &quot;03&quot;
_04 | &quot;04&quot;


<a name="ChallengeWindowSizeEnum"></a>
## Enum: ChallengeWindowSizeEnum
Name | Value
---- | -----
_01 | &quot;01&quot;
_02 | &quot;02&quot;
_03 | &quot;03&quot;
_04 | &quot;04&quot;
_05 | &quot;05&quot;



