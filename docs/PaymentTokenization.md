
# PaymentTokenization

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**TypeEnum**](#TypeEnum) |  |  [optional]
**value** | **String** | Client supplied Payment Token value |  [optional]
**reusable** | **Boolean** | One time or reusable token |  [optional]
**declineDuplicates** | **Boolean** | Decline duplicate payment info if client token is supplied |  [optional]
**last4** | **String** | The last 4 payment card numbers |  [optional]
**brand** | **String** | Only for tokenization with payment |  [optional]
**country** | **String** | Only for tokenization with payment |  [optional]
**accountVerification** | **Boolean** |  |  [optional]
**securityCode** | **String** | Card Verification Value/Number |  [optional]


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
PAYMENT_CARD | &quot;PAYMENT_CARD&quot;



