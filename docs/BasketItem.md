

# BasketItem

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | A unique ID associated with the product. |  [optional]
**description** | **String** | A name or short description of the product. |  [optional]
**subTotal** | [**BigDecimal**](BigDecimal.md) | Subtotal amount. |  [optional]
**valueAddedTax** | [**BigDecimal**](BigDecimal.md) | Value added tax amount. |  [optional]
**localTax** | [**BigDecimal**](BigDecimal.md) | Local tax amount. |  [optional]
**deliveryAmount** | [**BigDecimal**](BigDecimal.md) | Delivery amount. |  [optional]
**chargeTotal** | [**BigDecimal**](BigDecimal.md) | Charge Total amount. |  [optional]
**currency** | **String** | The currency of the original transaction. |  [optional]
**quantity** | **Long** | The unit in which the product is sold (e.g. litre, kilogram, etc). Leave empty if the product is sold as a complete unit. |  [optional]
**category** | **String** | Category of the product. |  [optional]
**detailedCategory** | **String** | Detailed Category of the product. |  [optional]
**options** | [**List&lt;Option&gt;**](Option.md) | Option details |  [optional]



