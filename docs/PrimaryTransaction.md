

# PrimaryTransaction

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**requestType** | **String** | Object name of the primary transaction request. | 
**transactionAmount** | [**Amount**](Amount.md) |  | 
**storeId** | **String** | An optional outlet ID for clients that support multiple stores in the same app. |  [optional]
**merchantTransactionId** | **String** | The unique merchant transaction ID from the request header, if supplied. |  [optional]
**transactionOrigin** | [**TransactionOrigin**](TransactionOrigin.md) |  |  [optional]
**order** | [**Order**](Order.md) |  |  [optional]
**ipgTransactionId** | **Long** | The IPG transactionId to reference a payerauth for example. |  [optional]
**allowPartialApproval** | **Boolean** | Indicates if the particular transaction is a partial approval transaction, if supplied. |  [optional]



