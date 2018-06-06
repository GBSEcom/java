
# PrimaryTransaction

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**transactionType** | [**TransactionTypeEnum**](#TransactionTypeEnum) | The type of the transaction performed. | 
**storeId** | **String** | An optional outlet ID for clients that support multiple store in the same developer app. |  [optional]
**clientTransactionId** | **String** | The unique client Transaction ID from the request header, if supplied. |  [optional]
**amount** | [**Amount**](Amount.md) |  | 
**paymentMethod** | [**PaymentMethod**](PaymentMethod.md) |  | 
**order** | [**Order**](Order.md) |  |  [optional]
**basketItems** | [**List&lt;BasketItem&gt;**](BasketItem.md) | Required for some payment methods (e.g. Klarna) |  [optional]
**splitShipment** | [**SplitShipment**](SplitShipment.md) |  |  [optional]
**transactionOrigin** | [**TransactionOriginEnum**](#TransactionOriginEnum) | The origin of the transaction |  [optional]
**additionalDetails** | [**PrimaryTransactionAdditionalDetails**](PrimaryTransactionAdditionalDetails.md) |  |  [optional]
**industrySpecificExtensions** | [**IndustrySpecificExtensions**](IndustrySpecificExtensions.md) |  |  [optional]


<a name="TransactionTypeEnum"></a>
## Enum: TransactionTypeEnum
Name | Value
---- | -----
SALE | &quot;SALE&quot;
PRE_AUTH | &quot;PRE_AUTH&quot;
CREDIT | &quot;CREDIT&quot;
FORCED_TICKET | &quot;FORCED_TICKET&quot;


<a name="TransactionOriginEnum"></a>
## Enum: TransactionOriginEnum
Name | Value
---- | -----
ECOM | &quot;ECOM&quot;
MOTO | &quot;MOTO&quot;
RETAIL | &quot;RETAIL&quot;



