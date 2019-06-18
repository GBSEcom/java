# CardInfoLookupApi

All URIs are relative to *https://cert.api.firstdata.com/gateway/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cardInfoLookup**](CardInfoLookupApi.md#cardInfoLookup) | **POST** /card-information | Card information lookup.


<a name="cardInfoLookup"></a>
# **cardInfoLookup**
> CardInfoLookupResponse cardInfoLookup(contentType, clientRequestId, apiKey, timestamp, cardInfoLookupRequest, messageSignature, region)

Card information lookup.

Use this to look up card related information such as issuer country, card function and card brand.

### Example
```java
// Import classes:
//import com.firstdata.firstapi.client.ApiException;
//import com.firstdata.firstapi.api.CardInfoLookupApi;


CardInfoLookupApi apiInstance = new CardInfoLookupApi();
String contentType = "application/json"; // String | Content type.
String clientRequestId = "clientRequestId_example"; // String | A client-generated ID for request tracking and signature creation, unique per request.  This is also used for idempotency control. We recommend 128-bit UUID format.
String apiKey = "apiKey_example"; // String | Key given to merchant after boarding associating their requests with the appropriate app in Apigee.
Long timestamp = 56L; // Long | Epoch timestamp in milliseconds in the request from a client system. Used for Message Signature generation and time limit (5 mins).
CardInfoLookupRequest cardInfoLookupRequest = new CardInfoLookupRequest(); // CardInfoLookupRequest | Accepted request type: CardInfoLookupRequest.
String messageSignature = "messageSignature_example"; // String | Used to ensure the request has not been tampered with during transmission. The Message-Signature is the Base64 encoded HMAC hash (SHA256 algorithm with the API Secret as the key.) For more information, refer to the supporting documentation on the Developer Portal.
String region = "region_example"; // String | Indicates the region where the client wants the transaction to be processed. This will override the default processing region identified for the client. Available options are argentina, brazil, germany, india and northamerica. Region specific store setup and APIGEE boarding is required in order to use an alternate region for processing.
try {
    CardInfoLookupResponse result = apiInstance.cardInfoLookup(contentType, clientRequestId, apiKey, timestamp, cardInfoLookupRequest, messageSignature, region);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardInfoLookupApi#cardInfoLookup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **String**| Content type. | [default to application/json] [enum: application/json]
 **clientRequestId** | **String**| A client-generated ID for request tracking and signature creation, unique per request.  This is also used for idempotency control. We recommend 128-bit UUID format. |
 **apiKey** | **String**| Key given to merchant after boarding associating their requests with the appropriate app in Apigee. |
 **timestamp** | **Long**| Epoch timestamp in milliseconds in the request from a client system. Used for Message Signature generation and time limit (5 mins). |
 **cardInfoLookupRequest** | [**CardInfoLookupRequest**](CardInfoLookupRequest.md)| Accepted request type: CardInfoLookupRequest. |
 **messageSignature** | **String**| Used to ensure the request has not been tampered with during transmission. The Message-Signature is the Base64 encoded HMAC hash (SHA256 algorithm with the API Secret as the key.) For more information, refer to the supporting documentation on the Developer Portal. | [optional]
 **region** | **String**| Indicates the region where the client wants the transaction to be processed. This will override the default processing region identified for the client. Available options are argentina, brazil, germany, india and northamerica. Region specific store setup and APIGEE boarding is required in order to use an alternate region for processing. | [optional]

### Return type

[**CardInfoLookupResponse**](CardInfoLookupResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

