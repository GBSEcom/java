

# Receipt

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**TypeEnum**](#TypeEnum) | Defines the consumer of the receipt (e.g. cardholder, merchant). | 
**data** | [**List&lt;ReceiptLine&gt;**](ReceiptLine.md) | Array of formatted lines that represents the actual receipt data, that can be printed out. | 



## Enum: TypeEnum

Name | Value
---- | -----
CARDHOLDER | &quot;cardholder&quot;
MERCHANT | &quot;merchant&quot;



