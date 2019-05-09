
# RecurringPaymentDetails

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**storeId** | **String** | Store ID number. |  [optional]
**purchaseOrderNumber** | **String** | Purchase order number. |  [optional]
**invoiceNumber** | **String** | Invoice number. |  [optional]
**creationDate** | **String** | Date recurring payment was created. |  [optional]
**startDate** | **String** | Date of mandate signature. |  [optional]
**nextAttemptDate** | **String** | Date of next transaction process attempt. |  [optional]
**amount** | [**Amount**](Amount.md) |  |  [optional]
**paymentMethod** | [**PaymentMethod**](PaymentMethod.md) |  |  [optional]
**frequency** | [**Frequency**](Frequency.md) |  |  [optional]
**numberOfPayments** | **Integer** | Number of times the recurring payment will process. |  [optional]
**runCount** | **Integer** | Times the recurring payment has already run. |  [optional]
**state** | [**StateEnum**](#StateEnum) | State of the recurring payment. |  [optional]
**comments** | **String** | User supplied comments. |  [optional]


<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
INSTALLED | &quot;Installed&quot;
INACTIVATED | &quot;Inactivated&quot;
CANCELLED | &quot;Cancelled&quot;



