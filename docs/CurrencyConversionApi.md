# CurrencyConversionApi

All URIs are relative to *https://cert.api.firstdata.com/gateway/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getExchangeRate**](CurrencyConversionApi.md#getExchangeRate) | **POST** /exchange-rates | Generate dynamic currency conversion transactions.


<a name="getExchangeRate"></a>
# **getExchangeRate**
> ExchangeRateResponse getExchangeRate(contentType, clientRequestId, apiKey, timestamp, exchangeRateRequest, messageSignature, region)

Generate dynamic currency conversion transactions.

Sale, return and lookup exchange rate with dynamic currency conversion option.

### Example
```java
// Import classes:
import com.github.GBSEcom.client.ApiClient;
import com.github.GBSEcom.client.ApiException;
import com.github.GBSEcom.client.Configuration;
import com.github.GBSEcom.client.models.*;
import com.github.GBSEcom.api.CurrencyConversionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://cert.api.firstdata.com/gateway/v2");

    CurrencyConversionApi apiInstance = new CurrencyConversionApi(defaultClient);
    String contentType = "application/json"; // String | Content type.
    String clientRequestId = "clientRequestId_example"; // String | A client-generated ID for request tracking and signature creation, unique per request.  This is also used for idempotency control. We recommend 128-bit UUID format.
    String apiKey = "apiKey_example"; // String | Key given to merchant after boarding associating their requests with the appropriate app in Apigee.
    Long timestamp = 56L; // Long | Epoch timestamp in milliseconds in the request from a client system. Used for Message Signature generation and time limit (5 mins).
    ExchangeRateRequest exchangeRateRequest = new ExchangeRateRequest(); // ExchangeRateRequest | Accepted request types: DCCExchangeRateRequest and DynamicPricingExchangeRateRequest.
    String messageSignature = "messageSignature_example"; // String | Used to ensure the request has not been tampered with during transmission. The Message-Signature is the Base64 encoded HMAC hash (SHA256 algorithm with the API Secret as the key.) For more information, refer to the supporting documentation on the Developer Portal.
    String region = "region_example"; // String | Indicates the region where the client wants the transaction to be processed. This will override the default processing region identified for the client. Available options are argentina, brazil, germany, india and northamerica. Region specific store setup and APIGEE boarding is required in order to use an alternate region for processing.
    try {
      ExchangeRateResponse result = apiInstance.getExchangeRate(contentType, clientRequestId, apiKey, timestamp, exchangeRateRequest, messageSignature, region);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CurrencyConversionApi#getExchangeRate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **String**| Content type. | [default to application/json] [enum: application/json]
 **clientRequestId** | **String**| A client-generated ID for request tracking and signature creation, unique per request.  This is also used for idempotency control. We recommend 128-bit UUID format. |
 **apiKey** | **String**| Key given to merchant after boarding associating their requests with the appropriate app in Apigee. |
 **timestamp** | **Long**| Epoch timestamp in milliseconds in the request from a client system. Used for Message Signature generation and time limit (5 mins). |
 **exchangeRateRequest** | [**ExchangeRateRequest**](ExchangeRateRequest.md)| Accepted request types: DCCExchangeRateRequest and DynamicPricingExchangeRateRequest. |
 **messageSignature** | **String**| Used to ensure the request has not been tampered with during transmission. The Message-Signature is the Base64 encoded HMAC hash (SHA256 algorithm with the API Secret as the key.) For more information, refer to the supporting documentation on the Developer Portal. | [optional]
 **region** | **String**| Indicates the region where the client wants the transaction to be processed. This will override the default processing region identified for the client. Available options are argentina, brazil, germany, india and northamerica. Region specific store setup and APIGEE boarding is required in order to use an alternate region for processing. | [optional]

### Return type

[**ExchangeRateResponse**](ExchangeRateResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success response. |  -  |
**400** | The request cannot be validated. |  -  |
**401** | The request cannot be authenticated or was submitted with the wrong credentials. |  -  |
**403** | The request was unauthorized. |  -  |
**404** | The requested resource doesn&#39;t exist. |  -  |
**500** | An unexpected internal server error occurred. |  -  |
**502** | There was a problem communicating with the endpoint. |  -  |

