# CurrencyConversionApi

All URIs are relative to *https://cert.api.firstdata.com/gateway*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getExchangeRate**](CurrencyConversionApi.md#getExchangeRate) | **POST** /v1/exchange-rates | Generate dynamic currency conversion transactions


<a name="getExchangeRate"></a>
# **getExchangeRate**
> ExchangeRateResponse getExchangeRate(contentType, clientRequestId, apiKey, timestamp, exchangeRateRequest, messageSignature, region)

Generate dynamic currency conversion transactions

Sale, return and lookup exchange rate with dynamic currency conversion option

### Example
```java
// Import classes:
//import com.github.GBSEcom.client.ApiException;
//import com.github.GBSEcom.api.CurrencyConversionApi;


CurrencyConversionApi apiInstance = new CurrencyConversionApi();
String contentType = "application/json"; // String | content type
String clientRequestId = "clientRequestId_example"; // String | A client-generated ID for request tracking and signature creation, unique per request.  This is also used for idempotency control. We recommend 128-bit UUID format.
String apiKey = "apiKey_example"; // String | 
Long timestamp = 56L; // Long | Epoch timestamp in milliseconds in the request from a client system. Used for Message Signature generation and time limit (5 mins).
ExchangeRateRequest exchangeRateRequest = new ExchangeRateRequest(); // ExchangeRateRequest | 
String messageSignature = "messageSignature_example"; // String | Used to ensure the request has not been tampered with during transmission. The Message-Signature is the Base64 encoded HMAC hash (SHA256  algorithm with the API Secret as the key.) For more information, refer to the supporting documentation on the Developer Portal.
String region = "region_example"; // String | The region where client wants to process the transaction
try {
    ExchangeRateResponse result = apiInstance.getExchangeRate(contentType, clientRequestId, apiKey, timestamp, exchangeRateRequest, messageSignature, region);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CurrencyConversionApi#getExchangeRate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **String**| content type | [default to application/json] [enum: application/json]
 **clientRequestId** | **String**| A client-generated ID for request tracking and signature creation, unique per request.  This is also used for idempotency control. We recommend 128-bit UUID format. |
 **apiKey** | **String**|  |
 **timestamp** | **Long**| Epoch timestamp in milliseconds in the request from a client system. Used for Message Signature generation and time limit (5 mins). |
 **exchangeRateRequest** | [**ExchangeRateRequest**](ExchangeRateRequest.md)|  |
 **messageSignature** | **String**| Used to ensure the request has not been tampered with during transmission. The Message-Signature is the Base64 encoded HMAC hash (SHA256  algorithm with the API Secret as the key.) For more information, refer to the supporting documentation on the Developer Portal. | [optional]
 **region** | **String**| The region where client wants to process the transaction | [optional]

### Return type

[**ExchangeRateResponse**](ExchangeRateResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

