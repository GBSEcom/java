
# PaymentSchedulesRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**storeId** | **String** | Store ID number. |  [optional]
**referencedOrderId** | **String** | Order ID used to create recurring payment from existing transaction. |  [optional]
**startDate** | [**LocalDate**](LocalDate.md) | Date of mandate signature. |  [optional]
**numberOfPayments** | **Integer** | Number of times the recurring pament will process. |  [optional]
**maximumFailures** | **Integer** | Number of failures that can be encountered before re-tries cease. |  [optional]
**invoiceNumber** | **String** | Invoice number. |  [optional]
**purchaseOrderNumber** | **String** | Purchase order number. |  [optional]
**transactionOrigin** | [**TransactionOrigin**](TransactionOrigin.md) |  |  [optional]
**dynamicMerchantName** | **String** | Dynamic merchant name for the cardholder&#39;s statement. |  [optional]
**frequency** | [**Frequency**](Frequency.md) |  |  [optional]
**paymentMethod** | [**PaymentMethod**](PaymentMethod.md) |  |  [optional]
**amount** | [**Amount**](Amount.md) |  |  [optional]
**clientLocale** | [**ClientLocale**](ClientLocale.md) |  |  [optional]
**orderId** | **String** | Client order ID if supplied by client. |  [optional]
**billing** | [**Billing**](Billing.md) |  |  [optional]
**shipping** | [**Shipping**](Shipping.md) |  |  [optional]
**comments** | **String** | User supplied comments. |  [optional]



