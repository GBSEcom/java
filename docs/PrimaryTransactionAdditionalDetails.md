
# PrimaryTransactionAdditionalDetails

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**referenceNumber** | **String** | For FORCED_TICKET only. Stores the six digit reference number you have received as the result of a successful external authorization (e.g. by phone). The Gateway needs this number for uniquely mapping a ForcedTicket transaction to a previously performed external authorization.]  |  [optional]
**comments** | **String** | Comments for the payment |  [optional]
**dynamicMerchantName** | **String** | The name of sub-merchant for the payment facilitator |  [optional]
**invoiceNumber** | **String** | Invoice number |  [optional]
**purchaseOrderNumber** | **String** | Purchase order number |  [optional]
**recurringType** | **String** | Valid values are &#39;FIRST&#39;, &#39;REPEAT&#39; and &#39;STANDING_INSTRUCTION&#39;. |  [optional]
**installmentOptions** | [**InstallmentOptions**](InstallmentOptions.md) |  |  [optional]
**mcc** | **String** | Use this field to override merchant configured MCC value |  [optional]
**dcc** | [**Dcc**](Dcc.md) |  |  [optional]



