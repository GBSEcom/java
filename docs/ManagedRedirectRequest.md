

# ManagedRedirectRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**transactionAmount** | [**Amount**](Amount.md) |  | 
**storeId** | **String** | An optional Outlet ID for clients that support multiple stores in the same developer app. |  [optional]
**merchantTransactionId** | **String** | The unique merchant transaction ID from the request, if supplied. |  [optional]
**transactionType** | [**ManagedRedirectTransactionType**](ManagedRedirectTransactionType.md) |  | 
**order** | [**Order**](Order.md) |  |  [optional]
**redirectAttributes** | [**RedirectAttributes**](RedirectAttributes.md) |  |  [optional]
**paymentMethod** | [**Object**](.md) | Various payment methods the Gateway supports. Abstract class, do not use this class directly, use one of its children. | 



