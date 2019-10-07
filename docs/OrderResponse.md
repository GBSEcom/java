
# OrderResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**orderId** | **String** | Client order ID if supplied by client, otherwise the order ID. |  [optional]
**billing** | [**Billing**](Billing.md) |  |  [optional]
**shipping** | [**Shipping**](Shipping.md) |  |  [optional]
**transactions** | [**List&lt;TransactionResponse&gt;**](TransactionResponse.md) | Required for some payment methods (for example, Klarna). |  [optional]
**additionalDetails** | [**AdditionalDetails**](AdditionalDetails.md) |  |  [optional]



