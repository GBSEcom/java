
# PaymentMethod

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**TypeEnum**](#TypeEnum) | The type of payment method. Note that PayPal can only process a &#39;CREDIT&#39; transaction. Note that for requests we are now supporting only PAYMENT_CARD, SEPA, PAYPAL, ALIPAY. All this types are supported for response. | 
**paymentCard** | [**PaymentCard**](PaymentCard.md) |  |  [optional]
**paymentToken** | [**PaymentTokenization**](PaymentTokenization.md) |  |  [optional]
**sepa** | [**Sepa**](Sepa.md) |  |  [optional]
**payPal** | [**PayPal**](PayPal.md) |  |  [optional]
**aliPay** | [**AliPay**](AliPay.md) |  |  [optional]
**chinaDomestic** | [**ChinaDomestic**](ChinaDomestic.md) |  |  [optional]


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
ALIPAY | &quot;ALIPAY&quot;
ALIPAY_PAYSECURE_US | &quot;ALIPAY_PAYSECURE_US&quot;
ALIPAY_DOMESTIC | &quot;ALIPAY_DOMESTIC&quot;
APM | &quot;APM&quot;
CUP_DOMESTIC | &quot;CUP_DOMESTIC&quot;
DEBITDE | &quot;DEBITDE&quot;
EMI | &quot;EMI&quot;
GIROPAY | &quot;GIROPAY&quot;
IDEAL | &quot;IDEAL&quot;
INDIAWALLET | &quot;INDIAWALLET&quot;
KLARNA | &quot;KLARNA&quot;
NETBANKING | &quot;NETBANKING&quot;
PAYMENT_CARD | &quot;PAYMENT_CARD&quot;
PAYMENT_TOKEN | &quot;PAYMENT_TOKEN&quot;
PAYPAL | &quot;PAYPAL&quot;
SEPA | &quot;SEPA&quot;
SOFORT | &quot;SOFORT&quot;
WALLET | &quot;WALLET&quot;
WECHAT_DOMESTIC | &quot;WECHAT_DOMESTIC&quot;



