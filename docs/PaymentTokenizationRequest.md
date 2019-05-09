
# PaymentTokenizationRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**TypeEnum**](#TypeEnum) | Use this to indicate the type of tokenization source | 
**paymentCard** | [**PaymentCard**](PaymentCard.md) |  |  [optional]
**referencedOrder** | [**ReferencedOrder**](ReferencedOrder.md) |  |  [optional]
**billingAddress** | [**Address**](Address.md) |  |  [optional]


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
PAYMENT_CARD | &quot;PAYMENT_CARD&quot;
EXISTING_ORDER | &quot;EXISTING_ORDER&quot;



