
# PaymentCard

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**number** | **String** | Payment card number |  [optional]
**expiryDate** | [**Expiration**](Expiration.md) |  |  [optional]
**securityCode** | **String** | Card Verification Value/Number |  [optional]
**paymentTokenization** | [**PaymentTokenization**](PaymentTokenization.md) |  |  [optional]
**cardFunction** | **String** | Card function. Optional, valid values are CREDIT or DEBIT. |  [optional]
**cardholderName** | **String** | Name of the cardholder on the card |  [optional]
**authenticationRequest** | [**AuthenticationRequest**](AuthenticationRequest.md) |  |  [optional]
**authenticationResult** | [**PaymentCardAuthenticationResult**](PaymentCardAuthenticationResult.md) |  |  [optional]
**bin** | **String** | The payment card BIN |  [optional]
**last4** | **String** | The last 4 payment card numbers |  [optional]
**brand** | **String** | Optional, required only if using dual branded card |  [optional]
**issuingCountry** | **String** | The issuing country |  [optional]



