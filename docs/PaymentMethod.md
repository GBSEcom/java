
# PaymentMethod

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**TypeEnum**](#TypeEnum) | Type of payment method. PayPal can only do &#39;Credit&#39; as primary transactions with Order. Email is mandatory. PayPal secondary transactions are processed as any other secondary transactions.  | 
**paymentCard** | [**PaymentCard**](PaymentCard.md) |  |  [optional]
**sepaDirectDebit** | [**SepaDirectDebit**](SepaDirectDebit.md) |  |  [optional]
**applePay** | [**ApplePay**](ApplePay.md) |  |  [optional]


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
PAYMENT_CARD | &quot;PAYMENT_CARD&quot;
SEPA_DIRECT_DEBIT | &quot;SEPA_DIRECT_DEBIT&quot;



