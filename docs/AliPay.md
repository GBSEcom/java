
# AliPay

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**paymentDataType** | [**PaymentDataTypeEnum**](#PaymentDataTypeEnum) | Use this to indicate the type of machine-readable payment data for scanning. | 
**paymentData** | **String** | Use this to send payment-related information, such as customer identity ID. | 
**orderTitle** | **String** | Use this to send an order title that shows up in the statement. | 
**orderDetails** | **String** | Use this to send order details that show up in the statement. | 


<a name="PaymentDataTypeEnum"></a>
## Enum: PaymentDataTypeEnum
Name | Value
---- | -----
BARCODE | &quot;BARCODE&quot;
QRCODE | &quot;QRCODE&quot;



