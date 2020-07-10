
# StoreUrlConfiguration

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | An optional outlet id for clients that support multiple stores in the same developer app. | 
**transactionNotificationUrl** | **String** | Transaction notification URL for Connect. |  [optional]
**recurringTransactionNotificationUrl** | **String** | Recurring transaction notification URL for recurring payments. |  [optional]
**responseSuccessUrl** | **String** | Response success URL for Connect. |  [optional]
**responseFailureUrl** | **String** | Response failure URL for Connect. |  [optional]
**skipResultPageForSuccess** | **Boolean** | Skip connect result page when transaction is approved. |  [optional]
**skipResultPageForFailure** | **Boolean** | Skip connect result page when transaction is not approved. |  [optional]
**overwriteUrlAllowed** | **Boolean** | Overwrite URLs in database by those from request. |  [optional]



