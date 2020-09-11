

# Secure3D21AuthenticationResultAllOf

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cavv** | **String** | The Cardholder Authentication Verification Value (CAVV) is a cryptographic value derived by the issuer during payment authentication that can provide evidence of the results of payment authentication during an online purchase. |  [optional]
**xid** | **String** | The transaction identifier (XID) is a unique tracking number set by the merchant. |  [optional]
**transactionId** | **String** | The response transaction UUID. Only applicable to MasterCard. |  [optional]
**authenticationResponse** | [**AuthenticationResponseEnum**](#AuthenticationResponseEnum) | The result of authentication attempt returned by the 3D Secure authentication process (PaRes). |  [optional]
**transactionStatus** | [**TransactionStatusEnum**](#TransactionStatusEnum) | The transaction status as returned by the 3D Secure authentication process. |  [optional]



## Enum: AuthenticationResponseEnum

Name | Value
---- | -----
A | &quot;A&quot;
N | &quot;N&quot;
U | &quot;U&quot;
Y | &quot;Y&quot;
C | &quot;C&quot;
R | &quot;R&quot;



## Enum: TransactionStatusEnum

Name | Value
---- | -----
A | &quot;A&quot;
N | &quot;N&quot;
U | &quot;U&quot;
Y | &quot;Y&quot;
C | &quot;C&quot;
R | &quot;R&quot;



