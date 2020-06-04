

# OrderResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**clientRequestId** | **String** | Echoes back the value in the request header for tracking. |  [optional]
**apiTraceId** | **String** | Request identifier in API, can be used to request logs from the support team. |  [optional]
**responseType** | [**ResponseType**](ResponseType.md) |  |  [optional]
**orderId** | **String** | Client order ID if supplied by client, otherwise the order ID. |  [optional]
**billing** | [**Billing**](Billing.md) |  |  [optional]
**shipping** | [**Shipping**](Shipping.md) |  |  [optional]
**transactions** | [**List&lt;TransactionResponse&gt;**](TransactionResponse.md) | Required for some payment methods (for example, Klarna). |  [optional]
**additionalDetails** | [**AdditionalDetails**](AdditionalDetails.md) |  |  [optional]



