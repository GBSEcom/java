

# SharedSecretConfigurationResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**clientRequestId** | **String** | Echoes back the value in the request header for tracking. |  [optional]
**apiTraceId** | **String** | Request identifier in API, can be used to request logs from the support team. |  [optional]
**responseType** | [**ResponseType**](ResponseType.md) |  |  [optional]
**storeId** | **String** | An optional outlet ID for clients that support multiple stores in the same developer app. |  [optional]
**sharedSecret** | **String** | Shared secret/password for Connect. |  [optional]
**responseMessage** | **String** | The message/status received after updating shared secret service config. |  [optional]
**responseTimestamp** | **Long** | Response timestamp. |  [optional]



