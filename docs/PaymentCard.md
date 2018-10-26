
# PaymentCard

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**number** | **String** | Payment card number | 
**expiryDate** | [**Expiration**](Expiration.md) |  |  [optional]
**securityCode** | **String** | CVV |  [optional]
**cardFunction** | [**CardFunctionEnum**](#CardFunctionEnum) |  |  [optional]
**cardholderName** | **String** |  |  [optional]
**authenticationRequest** | [**PaymentCardAuthenticationRequest**](PaymentCardAuthenticationRequest.md) |  |  [optional]
**authenticationResult** | [**PaymentCardAuthenticationResult**](PaymentCardAuthenticationResult.md) |  |  [optional]
**brand** | **String** | Optional, required only if using dual branded card |  [optional]


<a name="CardFunctionEnum"></a>
## Enum: CardFunctionEnum
Name | Value
---- | -----
CREDIT | &quot;CREDIT&quot;
DEBIT | &quot;DEBIT&quot;



