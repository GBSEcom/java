

# ScoreOnlyResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**correlationId** | **String** | Unique trace ID for issue triage. |  [optional]
**transactionStatus** | [**TransactionStatusEnum**](#TransactionStatusEnum) | Please refer to \&quot;Errors Section\&quot; for more info. |  [optional]
**validationStatus** | **String** | If status returned is \&quot;failure\&quot;, input validation errors occurred. Please refer to the \&quot;Errors Section\&quot; for more info. Valid values are &#39;success&#39; and &#39;failure&#39;. |  [optional]
**transactionType** | **String** | The transactionType provided in request. |  [optional]
**fraudScore** | [**ScoreOnlyResponseFraudScore**](ScoreOnlyResponseFraudScore.md) |  |  [optional]



## Enum: TransactionStatusEnum

Name | Value
---- | -----
SCORED_SUCCESSFULLY | &quot;Scored Successfully&quot;
NOT_PROCESSED | &quot;Not Processed&quot;



