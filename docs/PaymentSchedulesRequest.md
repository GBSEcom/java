
# PaymentSchedulesRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**storeId** | **String** | Store ID number. |  [optional]
**referenceOrderId** | **String** | Order ID used to create recurring payment from existing transaction. |  [optional]
**startDate** | [**LocalDate**](LocalDate.md) | Date of mandate signature. |  [optional]
**numberOfPayments** | **Integer** | Number of times the recurring payment will process. |  [optional]
**maximumFailures** | **Integer** | Number of failures that can be encountered before re-tries cease. |  [optional]
**invoiceNumber** | **String** | Invoice number. |  [optional]
**poNumber** | **String** | Purchase order number. |  [optional]
**transactionOrigin** | [**TransactionOriginEnum**](#TransactionOriginEnum) | The source of the transaction. The possible values are ECI (if the order was received via email or Internet), MOTO (mail order / telephone order) and RETAIL (face to face). |  [optional]
**dynamicMerchantName** | **String** | Dynamic merchant name for the cardholder‘s statement. |  [optional]
**frequency** | [**Frequency**](Frequency.md) |  |  [optional]
**paymentMethod** | [**PaymentMethod**](PaymentMethod.md) |  |  [optional]
**amount** | [**Amount**](Amount.md) |  |  [optional]
**clientLocale** | [**ClientLocale**](ClientLocale.md) |  |  [optional]
**orderId** | **String** | Client Order ID if supplied by client. |  [optional]


<a name="TransactionOriginEnum"></a>
## Enum: TransactionOriginEnum
Name | Value
---- | -----
ECI | &quot;ECI&quot;
MOTO | &quot;MOTO&quot;
RETAIL | &quot;RETAIL&quot;



