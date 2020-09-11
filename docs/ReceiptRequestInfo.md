

# ReceiptRequestInfo

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**TypeEnum**](#TypeEnum) | Defines the consumer of the receipt (e.g. cardholder, merchant). | 
**locale** | **String** | The locale of the receipt. The format has to be a well-formed BCP 47 language tag. |  [optional]
**linewidth** | **Integer** | The line width of the receipt. Default will be 32 characters. |  [optional]



## Enum: TypeEnum

Name | Value
---- | -----
CARDHOLDER | &quot;cardholder&quot;
MERCHANT | &quot;merchant&quot;



