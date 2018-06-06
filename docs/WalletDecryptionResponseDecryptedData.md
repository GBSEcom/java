
# WalletDecryptionResponseDecryptedData

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**transactionAmount** | [**Amount**](Amount.md) |  |  [optional]
**paymentCard** | [**PaymentCard**](PaymentCard.md) |  |  [optional]
**requestStatus** | [**RequestStatusEnum**](#RequestStatusEnum) | Transaction status. If it&#39;s anything other than &#39;APPROVED&#39;, please refer to 400s HTTP error codes or decline. See Error object for details. |  [optional]


<a name="RequestStatusEnum"></a>
## Enum: RequestStatusEnum
Name | Value
---- | -----
SUCCESS | &quot;SUCCESS&quot;
VALIDATION_FAILED | &quot;VALIDATION_FAILED&quot;
ERROR | &quot;ERROR&quot;



