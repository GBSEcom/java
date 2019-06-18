
# OrderResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**orderId** | **String** | Client order ID if supplied by client, otherwise the order ID. |  [optional]
**transactionTime** | **Long** | The transaction time in seconds since epoch. |  [optional]
**billing** | [**Billing**](Billing.md) |  |  [optional]
**shipping** | [**Shipping**](Shipping.md) |  |  [optional]
**mandate** | [**SepaMandate**](SepaMandate.md) |  |  [optional]
**transactions** | [**List&lt;Transaction&gt;**](Transaction.md) | Required for some payment methods (for example, Klarna). |  [optional]
**processor** | [**ProcessorData**](ProcessorData.md) |  |  [optional]


