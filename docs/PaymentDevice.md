
# PaymentDevice

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**deviceType** | [**DeviceTypeEnum**](#DeviceTypeEnum) | The data format. | 
**data** | **String** | Data from device containing, at a minimum, a transaction-unique key serial number (KSN) and track 2 card data. | 
**securityCode** | **String** | Card verification value/number. |  [optional]
**cardholderName** | **String** | Name of cardholder. |  [optional]
**cardFunction** | [**CardFunction**](CardFunction.md) |  |  [optional]
**brand** | **String** | The card brand. |  [optional]


<a name="DeviceTypeEnum"></a>
## Enum: DeviceTypeEnum
Name | Value
---- | -----
SWIPE | &quot;SWIPE&quot;



