

# EncryptedApplePay

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**data** | **String** | The encrypted wallet payload. | 
**header** | [**EncryptedApplePayHeader**](EncryptedApplePayHeader.md) |  | 
**signature** | **String** | Signature of the payment and header data. | 
**version** | [**VersionEnum**](#VersionEnum) | Version information about the payment token. |  [optional]
**applicationData** | **String** | Base64-encoded value of PKPaymentRequest. Required only if applicationDataHash is present. |  [optional]
**merchantId** | **String** | The merchant ID assigned by the wallet provider. | 



## Enum: VersionEnum

Name | Value
---- | -----
EC_V1 | &quot;EC_v1&quot;



