

# GenerateCertificateResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**clientRequestId** | **String** | Echoes back the value in the request header for tracking. |  [optional]
**apiTraceId** | **String** | Request identifier in API, can be used to request logs from the support team. |  [optional]
**responseType** | [**ResponseType**](ResponseType.md) |  |  [optional]
**zipFile** | **String** | Zip file containing new private key and signed certificate in PKCS#12 and JKS format, encoded in Base64. | 
**privateKeyPassword** | **String** | Password for PKCS#12 / Private Key Password. | 



