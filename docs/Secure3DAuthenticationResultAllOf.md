

# Secure3DAuthenticationResultAllOf

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cavv** | **String** | The Cardholder Authentication Verification Value (CAVV) is a cryptographic value derived by the issuer during payment authentication that can provide evidence of the results of payment authentication during an online purchase. |  [optional]
**xid** | **String** | The transaction identifier (XID) is a unique tracking number set by the merchant. |  [optional]
**dsTransactionId** | **String** | The response transaction UUID from the DS (directory server) |  [optional]
**authenticationResponse** | [**AuthenticationResponseEnum**](#AuthenticationResponseEnum) | The result of authentication attempt returned by the 3D Secure authentication process (ARes). |  [optional]
**transactionStatus** | [**TransactionStatusEnum**](#TransactionStatusEnum) | The transaction status as returned by the 3D Secure authentication process. (CRes) |  [optional]
**messageCategory** | [**MessageCategoryEnum**](#MessageCategoryEnum) | Indicates the message category of 3d secure authentication version 2.X. 01 &#x3D; Payment Authentication 02 &#x3D; Non-Payment Authentication 80 &#x3D; Mastercard Data Only  |  [optional]



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



## Enum: MessageCategoryEnum

Name | Value
---- | -----
_01 | &quot;01&quot;
_02 | &quot;02&quot;
_80 | &quot;80&quot;



