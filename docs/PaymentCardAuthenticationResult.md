
# PaymentCardAuthenticationResult

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**TypeEnum**](#TypeEnum) | Type of authentication result. For example, 3-D Secure. |  [optional]
**verificationResponse** | [**VerificationResponseEnum**](#VerificationResponseEnum) | Card enrollment result from the Verification Response (VeRes) |  [optional]
**payerAuthenticationResponse** | [**PayerAuthenticationResponseEnum**](#PayerAuthenticationResponseEnum) | Payer authentication result from Payment Authentication Response (PaRes) |  [optional]
**authenticationValue** | **String** | Cardholder Authentication Verification Value (CAVV) |  [optional]
**xid** | **String** | Authentication ID |  [optional]


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
_3D | &quot;SECURE_3D&quot;


<a name="VerificationResponseEnum"></a>
## Enum: VerificationResponseEnum
Name | Value
---- | -----
Y | &quot;Y&quot;
N | &quot;N&quot;
U | &quot;U&quot;


<a name="PayerAuthenticationResponseEnum"></a>
## Enum: PayerAuthenticationResponseEnum
Name | Value
---- | -----
Y | &quot;Y&quot;
N | &quot;N&quot;
U | &quot;U&quot;
A | &quot;A&quot;



