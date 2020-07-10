
# PaymentTokenizationRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**requestType** | **String** | Object name of tokenization request. | 
**storeId** | **String** | An optional outlet ID for clients that support multiple stores in the same app. |  [optional]
**billingAddress** | [**Address**](Address.md) |  |  [optional]
**createToken** | [**CreatePaymentToken**](CreatePaymentToken.md) |  | 
**accountVerification** | **Boolean** | If the account should be verified prior to token creation. |  [optional]
**additionalDetails** | [**AdditionalDetails**](AdditionalDetails.md) |  |  [optional]



