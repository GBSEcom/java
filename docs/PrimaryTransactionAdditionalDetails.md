
# PrimaryTransactionAdditionalDetails

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**referenceNumber** | **String** | For FORCED_TICKET only. This stores the six-digit reference number clients receive as the result of a successful external authorization (e.g. by phone). The Gateway needs this number for uniquely mapping a ForcedTicket transaction to a previously performed external authorization.  |  [optional]
**comments** | **String** |  |  [optional]
**dynamicMerchantName** | **String** |  |  [optional]
**invoiceNumber** | **String** |  |  [optional]
**purchaseOrderNumber** | **String** |  |  [optional]
**recurringType** | [**RecurringTypeEnum**](#RecurringTypeEnum) |  |  [optional]


<a name="RecurringTypeEnum"></a>
## Enum: RecurringTypeEnum
Name | Value
---- | -----
FIRST | &quot;FIRST&quot;
REPEAT | &quot;REPEAT&quot;
STANDING | &quot;STANDING&quot;



