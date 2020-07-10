
# RegistrationMethod

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**methodType** | [**MethodTypeEnum**](#MethodTypeEnum) | Unique ID for the payment method type. | 
**methodId** | **String** | The unique ID of this payment method if it was previously registered with a registration/method or if it is currently being registered. Must be unique for the entire system (not just within a specific merchant or industry). Mandatory if being used inside a registration/method. |  [optional]
**userDefined** | [**Object**](.md) | A JSON object that carries any additional information that might be helpful for fraud detection. |  [optional]
**billingPhoneNumber** | **String** | The address that should be used to send billing information for this payment method. |  [optional]
**methodAlias** | **String** | The address that should be used to send billing information for this payment method. |  [optional]
**card** | [**FraudRegistrationCard**](FraudRegistrationCard.md) |  | 
**methodAddress** | [**FraudAddress**](FraudAddress.md) |  |  [optional]


<a name="MethodTypeEnum"></a>
## Enum: MethodTypeEnum
Name | Value
---- | -----
CARD | &quot;method/card&quot;
WALLET | &quot;method/wallet&quot;



