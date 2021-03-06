

# PaymentRegistration

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**merchantRef** | **String** | Merchant reference code. Used by FirstAPI and reflected in settlement records and webhook notifications. Typically, the merchantRef field is the purchase order number or unique sequence value associated to a given transaction. |  [optional]
**transactionType** | **String** | Type of transaction merchant wants to process. | 
**customer** | [**Customer**](Customer.md) |  | 
**merchant** | [**Merchant**](Merchant.md) |  | 
**device** | [**FraudRegistrationDevice**](FraudRegistrationDevice.md) |  |  [optional]
**userDefined** | [**Object**](.md) | A JSON object that can carry any additional information that might be helpful for fraud detection. |  [optional]
**originalTransactionType** | **String** | Defines the type of the original transaction that is being evaluated for the Fraud Score. | 
**issuerResponse** | [**IssuerResponse**](IssuerResponse.md) |  |  [optional]
**verificationAvs** | [**VerificationAvs**](VerificationAvs.md) |  |  [optional]
**verification3ds** | [**Verification3ds**](Verification3ds.md) |  |  [optional]
**verificationCvv** | [**VerificationCvv**](VerificationCvv.md) |  |  [optional]
**registrationMethod** | [**RegistrationMethod**](RegistrationMethod.md) |  | 



