

# StandInDetails

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**standInType** | [**StandInTypeEnum**](#StandInTypeEnum) | Indicates standin instruction type. | 
**numberOfDebits** | **String** | Indicates number of standin instruction debits.Possible values can be two digit number or UN (Until it is cancelled) or ND (Not defined). | 
**siValidated** | **Boolean** | Indicates standin instruction validation flag, it can be true or false. \&quot;false\&quot; - Not validated, \&quot;true\&quot; - Validated. | 
**maximumTransactionAmount** | [**BigDecimal**](BigDecimal.md) | Maximum debit amount per standin instruction transaction. | 
**siHubId** | **String** | Unique identifier for standin instruction. | 
**frequency** | [**FrequencyEnum**](#FrequencyEnum) | Indicates frequency of the standin instruction debit. | 



## Enum: StandInTypeEnum

Name | Value
---- | -----
FIXED_AMOUNT | &quot;FIXED_AMOUNT&quot;
MAXIMUM_AMOUNT | &quot;MAXIMUM_AMOUNT&quot;



## Enum: FrequencyEnum

Name | Value
---- | -----
WEEKLY | &quot;WEEKLY&quot;
FORTNIGHTLY | &quot;FORTNIGHTLY&quot;
MONTHLY | &quot;MONTHLY&quot;
QUARTERLY | &quot;QUARTERLY&quot;
HALFYEARLY | &quot;HALFYEARLY&quot;
YEARLY | &quot;YEARLY&quot;
UNSCHEDULED | &quot;UNSCHEDULED&quot;



