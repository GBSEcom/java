

# EncryptedGooglePay

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**data** | [**EncryptedGooglePayData**](EncryptedGooglePayData.md) |  | 
**signature** | **String** | Signature for verifying that the message comes from Google. The signature is created using ECDSA. | 
**version** | **String** | Identifies under which encryption/signing scheme this message has been created. In this way, the protocol can evolve over time if needed. For Google Payments transactions, this should be set to ECv1. | 



