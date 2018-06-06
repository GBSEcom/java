
# ApplePay

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**signature** | **String** | Signature of the payment and header data. |  [optional]
**header** | [**ApplePayHeader**](ApplePayHeader.md) |  |  [optional]
**data** | **String** | The main payload of encrypted payment data | 
**version** | [**VersionEnum**](#VersionEnum) | Version information about the payment token |  [optional]
**appId** | **String** | Merchant identifier for app registration at digital Wallet Providers |  [optional]


<a name="VersionEnum"></a>
## Enum: VersionEnum
Name | Value
---- | -----
EC_V1 | &quot;EC_v1&quot;



