

# PaymentTokenizationResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**clientRequestId** | **String** | Echoes back the value in the request header for tracking. |  [optional]
**apiTraceId** | **String** | Request identifier in API, can be used to request logs from the support team. |  [optional]
**responseType** | [**ResponseType**](ResponseType.md) |  |  [optional]
**requestStatus** | [**RequestStatusEnum**](#RequestStatusEnum) | The status of the request. |  [optional]
**requestTime** | **Long** | Time of the request. |  [optional]
**brand** | **String** | Card brand. |  [optional]
**country** | **String** | Country of the card issued. |  [optional]
**paymentToken** | [**PaymentTokenDetails**](PaymentTokenDetails.md) |  |  [optional]
**paymentCard** | [**PaymentCard**](PaymentCard.md) |  |  [optional]
**processor** | [**ProcessorData**](ProcessorData.md) |  |  [optional]
**orderId** | **String** | Note - Client Order ID if supplied by client. If not supplied by client, IPG will generate. The first 12 alphanumeric digits are passed down to Fiserv Enterprise reporting tool, Clientline and Data File Manager (DFM). |  [optional]
**ipgTransactionId** | **String** | The response transaction ID. |  [optional]
**merchantTransactionId** | **String** | The unique merchant transaction ID from the request header, if supplied. |  [optional]
**additionalResponseData** | [**AdditionalResponseData**](AdditionalResponseData.md) |  |  [optional]



## Enum: RequestStatusEnum

Name | Value
---- | -----
DELETED | &quot;DELETED&quot;
FAILED | &quot;FAILED&quot;
SUCCESS | &quot;SUCCESS&quot;
APPROVED | &quot;APPROVED&quot;
WAITING | &quot;WAITING&quot;
VALIDATION_FAILED | &quot;VALIDATION_FAILED&quot;
DECLINED | &quot;DECLINED&quot;



