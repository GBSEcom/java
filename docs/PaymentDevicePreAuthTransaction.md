
# PaymentDevicePreAuthTransaction

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**paymentMethod** | [**PaymentDevicePaymentMethod**](PaymentDevicePaymentMethod.md) |  | 
**createToken** | [**CreatePaymentToken**](CreatePaymentToken.md) |  |  [optional]
**settlementSplit** | [**List&lt;SubMerchantSplit&gt;**](SubMerchantSplit.md) | Settle with multiple sub-merchants, sale and preAuth only. |  [optional]
**storedCredentials** | [**StoredCredential**](StoredCredential.md) |  |  [optional]
**splitShipment** | [**SplitShipment**](SplitShipment.md) |  |  [optional]
**decrementalFlag** | **Boolean** | This flag can only be used in a preAuth transaction that updates the amount of a previous preAuth transaction to either increase the preAuth amount (DecrementalPreAuthFlag &#x3D; false) or decrease the preAuth amount (DecrementalPreAuthFlag &#x3D; true). |  [optional]



