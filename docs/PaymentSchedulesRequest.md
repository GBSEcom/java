

# PaymentSchedulesRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**requestType** | **String** | Object name of the payment schedules request. | 
**storeId** | **String** | Store ID number. |  [optional]
**startDate** | [**LocalDate**](LocalDate.md) | Date of mandate signature. | 
**numberOfPayments** | **Integer** | Number of times the recurring payment will process. |  [optional]
**maximumFailures** | **Integer** | Number of failures that can be encountered before re-tries cease. |  [optional]
**invoiceNumber** | **String** | Invoice number. |  [optional]
**purchaseOrderNumber** | **String** | Purchase order number. |  [optional]
**transactionOrigin** | [**TransactionOrigin**](TransactionOrigin.md) |  |  [optional]
**dynamicMerchantName** | **String** | Dynamic merchant name for the cardholder&#39;s statement. |  [optional]
**frequency** | [**Frequency**](Frequency.md) |  | 
**transactionAmount** | [**Amount**](Amount.md) |  | 
**clientLocale** | [**ClientLocale**](ClientLocale.md) |  |  [optional]
**orderId** | **String** | Note - Client Order ID if supplied by client. If not supplied by client, IPG will generate. The first 12 alphanumeric digits are passed down to Fiserv Enterprise reporting tool, Clientline and Data File Manager (DFM). |  [optional]
**billing** | [**Billing**](Billing.md) |  |  [optional]
**shipping** | [**Shipping**](Shipping.md) |  |  [optional]
**comments** | **String** | User supplied comments. |  [optional]



