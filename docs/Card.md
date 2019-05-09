
# Card

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**taToken** | **String** | TransArmor Token value. Either the ta token fields or card number field must contain a value. |  [optional]
**taTokenKey** | **String** | TransArmor Token Key to identify the merchant. |  [optional]
**cardholderName** | **String** | The cardholder name as it appears on the card. |  [optional]
**cardNumber** | **String** | Use this field to send Clear PAN or tokens other than TransArmor Token. |  [optional]
**expDate** | **String** | Payment method expiration date. Format is MMCCYY. |  [optional]
**cvv** | **String** | CVV Present indicator. |  [optional]
**issuer** | **String** | The company (usually a bank) that issued the card. |  [optional]
**cardReissuedNumber** | **String** | A number that distinguishes between two plastic cards with the same card number in the event of the card being re-issued). |  [optional]



