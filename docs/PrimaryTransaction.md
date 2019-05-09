
# PrimaryTransaction

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**transactionType** | [**TransactionType**](TransactionType.md) |  | 
**storeId** | **String** | An optional outlet ID for clients that support multiple stores in the same app. |  [optional]
**merchantTransactionId** | **String** | The unique merchant transaction ID from the Request header, if supplied. |  [optional]
**transactionOrigin** | [**TransactionOrigin**](TransactionOrigin.md) |  |  [optional]
**amount** | [**Amount**](Amount.md) |  | 
**paymentMethod** | [**PaymentMethod**](PaymentMethod.md) |  | 
**order** | [**Order**](Order.md) |  |  [optional]
**basketItems** | [**List&lt;BasketItem&gt;**](BasketItem.md) | Required for some payment methods (for example, Klarna) |  [optional]
**splitShipment** | [**SplitShipment**](SplitShipment.md) |  |  [optional]
**additionalDetails** | [**PrimaryTransactionAdditionalDetails**](PrimaryTransactionAdditionalDetails.md) |  |  [optional]
**industrySpecificExtensions** | [**IndustrySpecificExtensions**](IndustrySpecificExtensions.md) |  |  [optional]
**storedCredentials** | [**StoredCredential**](StoredCredential.md) |  |  [optional]
**purchaseCard** | [**PurchaseCards**](PurchaseCards.md) |  |  [optional]
**paymentFacilitator** | [**PaymentFacilitator**](PaymentFacilitator.md) |  |  [optional]
**softDescriptor** | [**SoftDescriptor**](SoftDescriptor.md) |  |  [optional]



