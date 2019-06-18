
# Secure3dAuthenticationResult

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**verificationResponse** | [**VerificationResponseEnum**](#VerificationResponseEnum) | Card enrollment result from the Verification Response (VeRes). |  [optional]
**authenticationAttemptResult** | [**AuthenticationAttemptResultEnum**](#AuthenticationAttemptResultEnum) | Result of authentication attempt from Payer Authentication Response (PaRes). |  [optional]
**authenticationValue** | **String** | The Cardholder Authentication Verification Value (CAVV) is a cryptographic value derived by the issuer during payment authentication that can provide evidence of the results of payment authentication during an online purchase. |  [optional]
**xid** | **String** | The transaction identifier (XID) is a unique tracking number set by the merchant. |  [optional]


<a name="VerificationResponseEnum"></a>
## Enum: VerificationResponseEnum
Name | Value
---- | -----
Y | &quot;Y&quot;
N | &quot;N&quot;
U | &quot;U&quot;


<a name="AuthenticationAttemptResultEnum"></a>
## Enum: AuthenticationAttemptResultEnum
Name | Value
---- | -----
Y | &quot;Y&quot;
N | &quot;N&quot;
U | &quot;U&quot;
A | &quot;A&quot;



