
# EncryptedApplePayHeader

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**applicationDataHash** | **String** | Merchant supplied information about the payment request. Contains Base64-encoded SHA256 hash of the applicationData property of the original PKPaymentRequest. Note - applicationData from PaymentData of PKPaymentToken Refer to Apple Pay documentation. |  [optional]
**ephemeralPublicKey** | **String** | Temporary key for generating shared secret from a device. | 
**publicKeyHash** | **String** | Hash of the X.509 encoded public key bytes of the merchant’s certificate. | 
**transactionId** | **String** | Transaction identifier, generated on the device. | 



