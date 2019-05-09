
# ScoreOnlyResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**apiTraceId** | **String** | Unique trace ID for issue triage |  [optional]
**transactionStatus** | [**TransactionStatusEnum**](#TransactionStatusEnum) | Please refer to \&quot;Errors Section\&quot; for more info. |  [optional]
**validationStatus** | **String** | If status returned is \&quot;failure\&quot;, input validation errors occurred. Please refer to the \&quot;Errors Section\&quot; for more info. |  [optional]
**transactionType** | **String** | The transactionType provided in request. |  [optional]
**fraudScore** | [**ScoreOnlyResponseFraudScore**](ScoreOnlyResponseFraudScore.md) |  |  [optional]
**recommendedDecision** | **String** |  |  [optional]


<a name="TransactionStatusEnum"></a>
## Enum: TransactionStatusEnum
Name | Value
---- | -----
SCORED_SUCCESSFULLY | &quot;Scored successfully&quot;
NOT_PROCESSED | &quot;Not Processed&quot;



