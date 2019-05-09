
# ScoreOnlyRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**merchantRef** | **String** | Merchant reference code. Used by FirstAPI and reflected in settlement records and Webhook notifications. Typically, the merchantRef field is the purchase order number or unique sequence value associated to a given transaction. |  [optional]
**transactionType** | [**TransactionTypeEnum**](#TransactionTypeEnum) | Type of transaction merchant wants to process. | 
**originalTransactionType** | [**OriginalTransactionTypeEnum**](#OriginalTransactionTypeEnum) | Defines the type of the original transaction that is being evaluated for the Fraud Score. | 
**originalTransactionId** | **String** | The unique ID of this transaction. Must be unique for the entire system (not just within a specific merchant or industry). Subsequent requests related to the same transaction must have the same transactionId (e.g. transaction/deposit or   transaction/authorization-reversal). This field is used formatching transactions with settlement and chargeback information. If there is no such ID available you may wish to compose one from fields available in both systems. Consider including backend, issuer, merchant id, date and time, amount, etc. as necessary. | 
**amount** | **String** | The amount processed for the original transaction. | 
**currencyCode** | **String** | The currency of the original transaction. | 
**customer** | [**Customer**](Customer.md) |  |  [optional]
**billingAddress** | [**BillingAddress**](BillingAddress.md) |  |  [optional]
**device** | [**Device**](Device.md) |  |  [optional]
**loyalty** | [**Loyalty**](Loyalty.md) |  |  [optional]
**payment** | [**Payment**](Payment.md) |  | 
**merchant** | [**Merchant**](Merchant.md) |  | 
**order** | [**FraudOrder**](FraudOrder.md) |  |  [optional]
**userDefined** | [**Object**](.md) | A JSON object that can carry any additional information that might be helpful for fraud detection. |  [optional]


<a name="TransactionTypeEnum"></a>
## Enum: TransactionTypeEnum
Name | Value
---- | -----
SCOREONLY | &quot;scoreOnly&quot;


<a name="OriginalTransactionTypeEnum"></a>
## Enum: OriginalTransactionTypeEnum
Name | Value
---- | -----
AUTHORIZATION | &quot;transaction/authorization&quot;
AUTHORIZATION_REVERSAL | &quot;transaction/authorization-reversal&quot;
DEPOSIT | &quot;transaction/deposit&quot;
DEPOSIT_REVERSAL | &quot;transaction/deposit-reversal&quot;
PURCHASE | &quot;transaction/purchase&quot;
PURCHASE_REVERSAL | &quot;transaction/purchase-reversal&quot;
REFUND_AUTHORIZATION | &quot;transaction/refund-authorization&quot;
REFUND_DEPOSIT | &quot;transaction/refund-deposit&quot;
VERIFICATION | &quot;transaction/verification&quot;
BALANCE_INQUIRY | &quot;transaction/balance-inquiry&quot;



