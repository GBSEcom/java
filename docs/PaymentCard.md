
# PaymentCard

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**number** | **String** | Payment card number, including credit/debit card number or digital PAN | 
**expiryDate** | [**Expiration**](Expiration.md) |  |  [optional]
**cardCodeValue** | **String** | CVV or CCV value |  [optional]
**cardFunction** | [**CardFunctionEnum**](#CardFunctionEnum) |  |  [optional]
**cardholderName** | **String** |  |  [optional]
**authenticationRequest** | [**PaymentCardAuthenticationRequest**](PaymentCardAuthenticationRequest.md) |  |  [optional]
**brand** | **String** | Optional, required only if using dual-branded card |  [optional]
**authenticationResult** | [**AuthenticationResult**](AuthenticationResult.md) |  |  [optional]
**enableTokenization** | **Boolean** | Whether the Gateway shall tokenize the card while performing payment transaction |  [optional]


<a name="CardFunctionEnum"></a>
## Enum: CardFunctionEnum
Name | Value
---- | -----
CREDIT | &quot;CREDIT&quot;
DEBIT | &quot;DEBIT&quot;



