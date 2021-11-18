

# Secure3DAuthenticationRequestAllOf

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**termURL** | **String** | The result of the authentication will be sent to this URL. If not provided, a term URL will be dynamically generated. Note this must be a valid URL (special characters should be URL-encoded). | 
**methodNotificationURL** | **String** | The 3DS method iframe and transaction ID will be sent here. Note this must be a valid URL (special characters should be URL-encoded). | 
**challengeIndicator** | [**ChallengeIndicatorEnum**](#ChallengeIndicatorEnum) | Indicates whether or not a challenge should be performed. 01 &#x3D; No preference (You have no preference whether a challenge should be performed. This is the default value) 02 &#x3D; No challenge requested (You prefer that no challenge should be performed) 03 &#x3D; Challenge requested: 3DS Requestor Preference (You prefer that a challenge should be performed) 04 &#x3D; Challenge requested: Mandate (There are local or regional mandates that mean that a challenge must be performed) The following are applicable only for 3DS 2.2 protocol. 05 &#x3D; No challenge requested (transactional risk analysis is already performed) 06 &#x3D; No challenge requested (Data share only) 07 &#x3D; No challenge requested (strong consumer authentication is already performed) 08 &#x3D; No challenge requested (utilise whitelist exemption if no challenge required) 09 &#x3D; Challenge requested (whitelist prompt requested if challenge required)  |  [optional]
**messageCategory** | [**MessageCategoryEnum**](#MessageCategoryEnum) | Indicates the message category of 3d secure authentication version 2.X. 01 &#x3D; Payment Authentication 02 &#x3D; Non-Payment Authentication 80 &#x3D; Mastercard Data Only  |  [optional]
**challengeWindowSize** | [**ChallengeWindowSizeEnum**](#ChallengeWindowSizeEnum) | Defines the size of the challenge window displayed to customers during authentication. 01 &#x3D; 250 x 400 02 &#x3D; 390 x 400 03 &#x3D; 500 x 600 04 &#x3D; 600 x 400 05 &#x3D; Full screen  |  [optional]
**browserJavaScriptEnabled** | **Boolean** | Indicates if the browser issuing the request is capable of performing JavaScript. |  [optional]
**secure3DDeviceChannel** | [**Secure3DDeviceChannelEnum**](#Secure3DDeviceChannelEnum) | 02 &#x3D; BRW 03 &#x3D; 3RI  |  [optional]
**secure3DThreeRIIndicator** | [**Secure3DThreeRIIndicatorEnum**](#Secure3DThreeRIIndicatorEnum) | 01 &#x3D; Recurring transaction 02 &#x3D; Instalment transaction 03 &#x3D; Add card 04 &#x3D; Maintain card information 05 &#x3D; Account verification 06 &#x3D; Split/delayed shipment 07 &#x3D; Top-up 08 &#x3D; Mail Order 09 &#x3D; Telephone Order 10 &#x3D; Whitelist status check 11 &#x3D; Other payment  |  [optional]
**authenticationIndicator** | [**AuthenticationIndicatorEnum**](#AuthenticationIndicatorEnum) | Provides additional information to the ACS to determine the best approach for handling an authentication request. 01 &#x3D; Payment transaction 02 &#x3D; Recurring transaction 03 &#x3D; Installment transaction 04 &#x3D; Add card 05 &#x3D; Maintain card 06 &#x3D; Card holder verification as part of EMV token ID and Value  |  [optional]
**recurringExpiry** | **String** | Date after which no further authorisations shall be performed. |  [optional]
**recurringFrequency** | **Integer** | Indicates the minimum number of days between authorisations. |  [optional]



## Enum: ChallengeIndicatorEnum

Name | Value
---- | -----
_01 | &quot;01&quot;
_02 | &quot;02&quot;
_03 | &quot;03&quot;
_04 | &quot;04&quot;
_05 | &quot;05&quot;
_06 | &quot;06&quot;
_07 | &quot;07&quot;
_08 | &quot;08&quot;
_09 | &quot;09&quot;



## Enum: MessageCategoryEnum

Name | Value
---- | -----
_01 | &quot;01&quot;
_02 | &quot;02&quot;
_80 | &quot;80&quot;



## Enum: ChallengeWindowSizeEnum

Name | Value
---- | -----
_01 | &quot;01&quot;
_02 | &quot;02&quot;
_03 | &quot;03&quot;
_04 | &quot;04&quot;
_05 | &quot;05&quot;



## Enum: Secure3DDeviceChannelEnum

Name | Value
---- | -----
_02 | &quot;02&quot;
_03 | &quot;03&quot;



## Enum: Secure3DThreeRIIndicatorEnum

Name | Value
---- | -----
_01 | &quot;01&quot;
_02 | &quot;02&quot;
_03 | &quot;03&quot;
_04 | &quot;04&quot;
_05 | &quot;05&quot;
_06 | &quot;06&quot;
_07 | &quot;07&quot;
_08 | &quot;08&quot;
_09 | &quot;09&quot;
_10 | &quot;10&quot;
_11 | &quot;11&quot;



## Enum: AuthenticationIndicatorEnum

Name | Value
---- | -----
_01 | &quot;01&quot;
_02 | &quot;02&quot;
_03 | &quot;03&quot;
_04 | &quot;04&quot;
_05 | &quot;05&quot;
_06 | &quot;06&quot;



