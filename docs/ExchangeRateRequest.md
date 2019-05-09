
# ExchangeRateRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**TypeEnum**](#TypeEnum) | Type of exchange rate inquiry. Valid values are &#39;DCC&#39; and &#39;DYNAMIC_PRICING&#39;. | 
**storeId** | **String** | An optional Outlet ID for clients that support multiple stores in the same app. |  [optional]
**bin** | **String** | A bank identification number (BIN) of the card to be used for DCC. |  [optional]
**baseAmount** | [**BigDecimal**](BigDecimal.md) | The original amount of the merchant currency for calculation. | 
**foreignCurrency** | **String** | The currency code to convert for Dynamic Pricing. |  [optional]


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
DCC | &quot;DCC&quot;
DYNAMIC_PRICING | &quot;DYNAMIC_PRICING&quot;



