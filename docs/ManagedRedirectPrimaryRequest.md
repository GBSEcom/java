

# ManagedRedirectPrimaryRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**requestType** | **String** | Object name of the primary transaction request. | 
**transactionAmount** | [**Amount**](Amount.md) |  | 
**storeId** | **String** | An optional Outlet ID for clients that support multiple stores in the same developer app. |  [optional]
**merchantTransactionId** | **String** | The unique merchant transaction ID from the request, if supplied. |  [optional]
**transactionType** | [**ManagedRedirectTransactionType**](ManagedRedirectTransactionType.md) |  |  [optional]
**order** | [**Order**](Order.md) |  |  [optional]
**redirectAttributes** | [**RedirectAttributes**](RedirectAttributes.md) |  |  [optional]



