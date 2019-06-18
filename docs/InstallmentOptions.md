
# InstallmentOptions

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**numberOfInstallments** | **Integer** | Number of installments for a sale transaction if the customer pays the total amount in multiple transactions. |  [optional]
**installmentsInterest** | **Boolean** | Indicates whether the installment interest amount has been applied. |  [optional]
**installmentDelayMonths** | **Integer** | The number of months the first installment payment will be delayed. |  [optional]
**recurringType** | [**RecurringTypeEnum**](#RecurringTypeEnum) | The type of recurring payment. |  [optional]
**merchantAdviceCodeSupported** | **Boolean** | Indicates if the merchant supports merchant advice code (MAC) in order to receive table 55 code for a declined recurring transaction. |  [optional]


<a name="RecurringTypeEnum"></a>
## Enum: RecurringTypeEnum
Name | Value
---- | -----
FIRST | &quot;FIRST&quot;
REPEAT | &quot;REPEAT&quot;
STANDING_INSTRUCTION | &quot;STANDING_INSTRUCTION&quot;



