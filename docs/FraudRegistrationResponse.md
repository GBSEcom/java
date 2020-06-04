

# FraudRegistrationResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**correlationId** | **String** | The value used to track the transaction. |  [optional]
**transactionStatus** | [**TransactionStatusEnum**](#TransactionStatusEnum) | Status of the transaction. Valid values are &#39;Not Processed&#39; and &#39;Scored successfully&#39; |  [optional]
**validationStatus** | **String** | If status returned is \&quot;failure\&quot;, input validation errors occurred. Please refer to the \&quot;Errors Section\&quot; for more info. Valid values are &#39;success&#39; and &#39;failed&#39;. |  [optional]
**transactionType** | **String** | The transactionType provided in request. |  [optional]
**fraudScore** | [**FraudScore**](FraudScore.md) |  |  [optional]
**error** | [**FraudRegistrationError**](FraudRegistrationError.md) |  |  [optional]



## Enum: TransactionStatusEnum

Name | Value
---- | -----
SCORED_SUCCESSFULLY | &quot;Scored successfully&quot;
NOT_PROCESSED | &quot;Not Processed&quot;



