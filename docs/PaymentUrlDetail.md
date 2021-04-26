

# PaymentUrlDetail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**paymentUrl** | **String** | URL for embedded payment link. |  [optional]
**merchantTransactionId** | **String** | The unique merchant transaction ID from the request, if supplied. |  [optional]
**orderId** | **String** | Note - Client Order ID if supplied by client. If not supplied by client, IPG will generate. The first 12 alphanumeric digits are passed down to Fiserv Enterprise reporting tool, Clientline and Data File Manager (DFM). |  [optional]
**requestTime** | **Long** | The transaction time in seconds since epoch. |  [optional]
**status** | [**PaymentUrlStatus**](PaymentUrlStatus.md) |  |  [optional]



