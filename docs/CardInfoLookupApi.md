# CardInfoLookupApi

All URIs are relative to *https://cert.api.firstdata.com/gateway*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cardInfoLookup**](CardInfoLookupApi.md#cardInfoLookup) | **POST** /v1/card-information | Card information lookUp


<a name="cardInfoLookup"></a>
# **cardInfoLookup**
> CardInfoLookupResponse cardInfoLookup(contentType, clientRequestId, apiKey, timestamp, cardInfoLookupRequest, messageSignature, region)

Card information lookUp

Use this to look up card related information such as issuer country, card function and card brand.

### Example
```java
// Import classes:
//import com.github.GBSEcom.client.ApiException;
//import com.github.GBSEcom.api.CardInfoLookupApi;


CardInfoLookupApi apiInstance = new CardInfoLookupApi();
String contentType = "application/json"; // String | content type
String clientRequestId = "clientRequestId_example"; // String | A client-generated ID for request tracking and signature creation, unique per request.  This is also used for idempotency control. We recommend 128-bit UUID format.
String apiKey = "apiKey_example"; // String | 
Long timestamp = 56L; // Long | Epoch timestamp in milliseconds in the request from a client system. Used for Message Signature generation and time limit (5 mins).
CardInfoLookupRequest cardInfoLookupRequest = new CardInfoLookupRequest(); // CardInfoLookupRequest | Card information lookup payload.
String messageSignature = "messageSignature_example"; // String | Used to ensure the request has not been tampered with during transmission. The Message-Signature is the Base64 encoded HMAC hash (SHA256  algorithm with the API Secret as the key.) For more information, refer to the supporting documentation on the Developer Portal.
String region = "region_example"; // String | The region where client wants to process the transaction
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
 **contentType** | **String**| content type | [default to application/json] [enum: application/json]
 **clientRequestId** | **String**| A client-generated ID for request tracking and signature creation, unique per request.  This is also used for idempotency control. We recommend 128-bit UUID format. |
 **apiKey** | **String**|  |
 **timestamp** | **Long**| Epoch timestamp in milliseconds in the request from a client system. Used for Message Signature generation and time limit (5 mins). |
 **cardInfoLookupRequest** | [**CardInfoLookupRequest**](CardInfoLookupRequest.md)| Card information lookup payload. |
 **messageSignature** | **String**| Used to ensure the request has not been tampered with during transmission. The Message-Signature is the Base64 encoded HMAC hash (SHA256  algorithm with the API Secret as the key.) For more information, refer to the supporting documentation on the Developer Portal. | [optional]
 **region** | **String**| The region where client wants to process the transaction | [optional]

### Return type

[**CardInfoLookupResponse**](CardInfoLookupResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

