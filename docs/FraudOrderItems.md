
# FraudOrderItems

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | A unique ID associated with the product. Must be unique within the merchant&#39;s system. |  [optional]
**name** | **String** | A name or short description of the product. |  [optional]
**quantity** | **String** | The unit in which the product is sold (e.g. litre, kilogram, etc). Leave empty if the product is sold as a complete unit. |  [optional]
**unit** | [**BigDecimal**](BigDecimal.md) | The number of units sold. Set to 1 if there is only one unit of the item. Leave empty if the quantity is unknown at the time of the request. |  [optional]
**unitPrice** | **String** | The price per unit. |  [optional]
**categories** | **String** | The categories that this product belongs to. |  [optional]
**detailsUrl** | **String** | The URL to the merchant&#39;s management system, for reporting and analysis. |  [optional]
**userDefined** | [**Object**](.md) | A JSON object that can carry any additional information about the order that might be helpful for fraud detection. |  [optional]



