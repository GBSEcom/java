# PaymentTokenApi

All URIs are relative to *https://cert.api.firstdata.com/gateway/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createPaymentToken**](PaymentTokenApi.md#createPaymentToken) | **POST** /payment-tokens | Create a payment token from a payment card.
[**deletePaymentToken**](PaymentTokenApi.md#deletePaymentToken) | **DELETE** /payment-tokens/{token-id} | Delete a payment token.
[**getPaymentTokenDetails**](PaymentTokenApi.md#getPaymentTokenDetails) | **GET** /payment-tokens/{token-id} | Get payment card details associated with token.
[**updatePaymentToken**](PaymentTokenApi.md#updatePaymentToken) | **PATCH** /payment-tokens | Update one or more payment tokens.


<a name="createPaymentToken"></a>
# **createPaymentToken**
> PaymentTokenizationResponse createPaymentToken(contentType, clientRequestId, apiKey, timestamp, paymentTokenizationRequest, messageSignature, authorization, region)

Create a payment token from a payment card.

Use this to create a payment token from a payment card.

### Example
```java
// Import classes:
import com.github.GBSEcom.client.ApiClient;
import com.github.GBSEcom.client.ApiException;
import com.github.GBSEcom.client.Configuration;
import com.github.GBSEcom.client.models.*;
import com.github.GBSEcom.api.PaymentTokenApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://cert.api.firstdata.com/gateway/v2");

    PaymentTokenApi apiInstance = new PaymentTokenApi(defaultClient);
    String contentType = "application/json"; // String | Content type.
    String clientRequestId = "clientRequestId_example"; // String | A client-generated ID for request tracking and signature creation, unique per request.  This is also used for idempotency control. We recommend 128-bit UUID format.
    String apiKey = "apiKey_example"; // String | Key given to merchant after boarding associating their requests with the appropriate app in Apigee.
    Long timestamp = 56L; // Long | Epoch timestamp in milliseconds in the request from a client system. Used for Message Signature generation and time limit (5 mins).
    PaymentTokenizationRequest paymentTokenizationRequest = new PaymentTokenizationRequest(); // PaymentTokenizationRequest | Accepted request types: PaymentCardPaymentTokenizationRequest, PaymentDevicePaymentTokenizationRequest, and ReferencedOrderPaymentTokenizationRequest.
    String messageSignature = "messageSignature_example"; // String | Used to ensure the request has not been tampered with during transmission. The Message-Signature is the Base64 encoded HMAC hash (SHA256 algorithm with the API Secret as the key.) For more information, refer to the supporting documentation on the Developer Portal.
    String authorization = "authorization_example"; // String | The access token previously generated with the access-tokens call. Use the format 'Bearer {access-token}'.
    String region = "region_example"; // String | Indicates the region where the client wants the transaction to be processed. This will override the default processing region identified for the client. Available options are argentina, brazil, germany, india and northamerica. Region specific store setup and APIGEE boarding is required in order to use an alternate region for processing.
    try {
      PaymentTokenizationResponse result = apiInstance.createPaymentToken(contentType, clientRequestId, apiKey, timestamp, paymentTokenizationRequest, messageSignature, authorization, region);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentTokenApi#createPaymentToken");
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
 **paymentTokenizationRequest** | [**PaymentTokenizationRequest**](PaymentTokenizationRequest.md)| Accepted request types: PaymentCardPaymentTokenizationRequest, PaymentDevicePaymentTokenizationRequest, and ReferencedOrderPaymentTokenizationRequest. |
 **messageSignature** | **String**| Used to ensure the request has not been tampered with during transmission. The Message-Signature is the Base64 encoded HMAC hash (SHA256 algorithm with the API Secret as the key.) For more information, refer to the supporting documentation on the Developer Portal. | [optional]
 **authorization** | **String**| The access token previously generated with the access-tokens call. Use the format &#39;Bearer {access-token}&#39;. | [optional]
 **region** | **String**| Indicates the region where the client wants the transaction to be processed. This will override the default processing region identified for the client. Available options are argentina, brazil, germany, india and northamerica. Region specific store setup and APIGEE boarding is required in order to use an alternate region for processing. | [optional]

### Return type

[**PaymentTokenizationResponse**](PaymentTokenizationResponse.md)

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
**401** | The request was unauthorized. |  -  |
**404** | The requested resource doesn&#39;t exist. |  -  |
**409** | The attempted action is not valid according to gateway rules. For example, when the gateway is too busy then the transaction is not processed. |  -  |
**422** | The processor declined the transaction. |  -  |
**500** | An unexpected internal server error occurred. |  -  |

<a name="deletePaymentToken"></a>
# **deletePaymentToken**
> PaymentTokenizationResponse deletePaymentToken(contentType, clientRequestId, apiKey, timestamp, tokenId, messageSignature, authorization, region, storeId)

Delete a payment token.

Use this to delete a payment token.

### Example
```java
// Import classes:
import com.github.GBSEcom.client.ApiClient;
import com.github.GBSEcom.client.ApiException;
import com.github.GBSEcom.client.Configuration;
import com.github.GBSEcom.client.models.*;
import com.github.GBSEcom.api.PaymentTokenApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://cert.api.firstdata.com/gateway/v2");

    PaymentTokenApi apiInstance = new PaymentTokenApi(defaultClient);
    String contentType = "application/json"; // String | Content type.
    String clientRequestId = "clientRequestId_example"; // String | A client-generated ID for request tracking and signature creation, unique per request.  This is also used for idempotency control. We recommend 128-bit UUID format.
    String apiKey = "apiKey_example"; // String | Key given to merchant after boarding associating their requests with the appropriate app in Apigee.
    Long timestamp = 56L; // Long | Epoch timestamp in milliseconds in the request from a client system. Used for Message Signature generation and time limit (5 mins).
    String tokenId = "tokenId_example"; // String | Identifies a payment token.
    String messageSignature = "messageSignature_example"; // String | Used to ensure the request has not been tampered with during transmission. The Message-Signature is the Base64 encoded HMAC hash (SHA256 algorithm with the API Secret as the key.) For more information, refer to the supporting documentation on the Developer Portal.
    String authorization = "authorization_example"; // String | The access token previously generated with the access-tokens call. Use the format 'Bearer {access-token}'.
    String region = "region_example"; // String | Indicates the region where the client wants the transaction to be processed. This will override the default processing region identified for the client. Available options are argentina, brazil, germany, india and northamerica. Region specific store setup and APIGEE boarding is required in order to use an alternate region for processing.
    String storeId = "storeId_example"; // String | 
    try {
      PaymentTokenizationResponse result = apiInstance.deletePaymentToken(contentType, clientRequestId, apiKey, timestamp, tokenId, messageSignature, authorization, region, storeId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentTokenApi#deletePaymentToken");
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
 **tokenId** | **String**| Identifies a payment token. |
 **messageSignature** | **String**| Used to ensure the request has not been tampered with during transmission. The Message-Signature is the Base64 encoded HMAC hash (SHA256 algorithm with the API Secret as the key.) For more information, refer to the supporting documentation on the Developer Portal. | [optional]
 **authorization** | **String**| The access token previously generated with the access-tokens call. Use the format &#39;Bearer {access-token}&#39;. | [optional]
 **region** | **String**| Indicates the region where the client wants the transaction to be processed. This will override the default processing region identified for the client. Available options are argentina, brazil, germany, india and northamerica. Region specific store setup and APIGEE boarding is required in order to use an alternate region for processing. | [optional]
 **storeId** | **String**|  | [optional]

### Return type

[**PaymentTokenizationResponse**](PaymentTokenizationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success response. |  -  |
**400** | The request cannot be validated. |  -  |
**401** | The request was unauthorized. |  -  |
**404** | The requested resource doesn&#39;t exist. |  -  |
**500** | An unexpected internal server error occurred. |  -  |

<a name="getPaymentTokenDetails"></a>
# **getPaymentTokenDetails**
> PaymentTokenizationResponse getPaymentTokenDetails(contentType, clientRequestId, apiKey, timestamp, tokenId, messageSignature, authorization, region, storeId)

Get payment card details associated with token.

Get payment card details associated with token.

### Example
```java
// Import classes:
import com.github.GBSEcom.client.ApiClient;
import com.github.GBSEcom.client.ApiException;
import com.github.GBSEcom.client.Configuration;
import com.github.GBSEcom.client.models.*;
import com.github.GBSEcom.api.PaymentTokenApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://cert.api.firstdata.com/gateway/v2");

    PaymentTokenApi apiInstance = new PaymentTokenApi(defaultClient);
    String contentType = "application/json"; // String | Content type.
    String clientRequestId = "clientRequestId_example"; // String | A client-generated ID for request tracking and signature creation, unique per request.  This is also used for idempotency control. We recommend 128-bit UUID format.
    String apiKey = "apiKey_example"; // String | Key given to merchant after boarding associating their requests with the appropriate app in Apigee.
    Long timestamp = 56L; // Long | Epoch timestamp in milliseconds in the request from a client system. Used for Message Signature generation and time limit (5 mins).
    String tokenId = "tokenId_example"; // String | Identifies a payment token.
    String messageSignature = "messageSignature_example"; // String | Used to ensure the request has not been tampered with during transmission. The Message-Signature is the Base64 encoded HMAC hash (SHA256 algorithm with the API Secret as the key.) For more information, refer to the supporting documentation on the Developer Portal.
    String authorization = "authorization_example"; // String | The access token previously generated with the access-tokens call. Use the format 'Bearer {access-token}'.
    String region = "region_example"; // String | Indicates the region where the client wants the transaction to be processed. This will override the default processing region identified for the client. Available options are argentina, brazil, germany, india and northamerica. Region specific store setup and APIGEE boarding is required in order to use an alternate region for processing.
    String storeId = "storeId_example"; // String | 
    try {
      PaymentTokenizationResponse result = apiInstance.getPaymentTokenDetails(contentType, clientRequestId, apiKey, timestamp, tokenId, messageSignature, authorization, region, storeId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentTokenApi#getPaymentTokenDetails");
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
 **tokenId** | **String**| Identifies a payment token. |
 **messageSignature** | **String**| Used to ensure the request has not been tampered with during transmission. The Message-Signature is the Base64 encoded HMAC hash (SHA256 algorithm with the API Secret as the key.) For more information, refer to the supporting documentation on the Developer Portal. | [optional]
 **authorization** | **String**| The access token previously generated with the access-tokens call. Use the format &#39;Bearer {access-token}&#39;. | [optional]
 **region** | **String**| Indicates the region where the client wants the transaction to be processed. This will override the default processing region identified for the client. Available options are argentina, brazil, germany, india and northamerica. Region specific store setup and APIGEE boarding is required in order to use an alternate region for processing. | [optional]
 **storeId** | **String**|  | [optional]

### Return type

[**PaymentTokenizationResponse**](PaymentTokenizationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success response. |  -  |
**400** | The request cannot be validated. |  -  |
**401** | The request was unauthorized. |  -  |
**404** | The requested resource doesn&#39;t exist. |  -  |
**500** | An unexpected internal server error occurred. |  -  |

<a name="updatePaymentToken"></a>
# **updatePaymentToken**
> PaymentTokenUpdateResponse updatePaymentToken(contentType, clientRequestId, apiKey, timestamp, paymentCardPaymentTokenUpdateRequest, messageSignature, authorization, region)

Update one or more payment tokens.

Use this update one or more payment tokens.

### Example
```java
// Import classes:
import com.github.GBSEcom.client.ApiClient;
import com.github.GBSEcom.client.ApiException;
import com.github.GBSEcom.client.Configuration;
import com.github.GBSEcom.client.models.*;
import com.github.GBSEcom.api.PaymentTokenApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://cert.api.firstdata.com/gateway/v2");

    PaymentTokenApi apiInstance = new PaymentTokenApi(defaultClient);
    String contentType = "application/json"; // String | Content type.
    String clientRequestId = "clientRequestId_example"; // String | A client-generated ID for request tracking and signature creation, unique per request.  This is also used for idempotency control. We recommend 128-bit UUID format.
    String apiKey = "apiKey_example"; // String | Key given to merchant after boarding associating their requests with the appropriate app in Apigee.
    Long timestamp = 56L; // Long | Epoch timestamp in milliseconds in the request from a client system. Used for Message Signature generation and time limit (5 mins).
    PaymentCardPaymentTokenUpdateRequest paymentCardPaymentTokenUpdateRequest = new PaymentCardPaymentTokenUpdateRequest(); // PaymentCardPaymentTokenUpdateRequest | Accepted request type: PaymentCardPaymentTokenUpdateRequest.
    String messageSignature = "messageSignature_example"; // String | Used to ensure the request has not been tampered with during transmission. The Message-Signature is the Base64 encoded HMAC hash (SHA256 algorithm with the API Secret as the key.) For more information, refer to the supporting documentation on the Developer Portal.
    String authorization = "authorization_example"; // String | The access token previously generated with the access-tokens call. Use the format 'Bearer {access-token}'.
    String region = "region_example"; // String | Indicates the region where the client wants the transaction to be processed. This will override the default processing region identified for the client. Available options are argentina, brazil, germany, india and northamerica. Region specific store setup and APIGEE boarding is required in order to use an alternate region for processing.
    try {
      PaymentTokenUpdateResponse result = apiInstance.updatePaymentToken(contentType, clientRequestId, apiKey, timestamp, paymentCardPaymentTokenUpdateRequest, messageSignature, authorization, region);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentTokenApi#updatePaymentToken");
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
 **paymentCardPaymentTokenUpdateRequest** | [**PaymentCardPaymentTokenUpdateRequest**](PaymentCardPaymentTokenUpdateRequest.md)| Accepted request type: PaymentCardPaymentTokenUpdateRequest. |
 **messageSignature** | **String**| Used to ensure the request has not been tampered with during transmission. The Message-Signature is the Base64 encoded HMAC hash (SHA256 algorithm with the API Secret as the key.) For more information, refer to the supporting documentation on the Developer Portal. | [optional]
 **authorization** | **String**| The access token previously generated with the access-tokens call. Use the format &#39;Bearer {access-token}&#39;. | [optional]
 **region** | **String**| Indicates the region where the client wants the transaction to be processed. This will override the default processing region identified for the client. Available options are argentina, brazil, germany, india and northamerica. Region specific store setup and APIGEE boarding is required in order to use an alternate region for processing. | [optional]

### Return type

[**PaymentTokenUpdateResponse**](PaymentTokenUpdateResponse.md)

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
**401** | The request was unauthorized. |  -  |
**404** | The requested resource doesn&#39;t exist. |  -  |
**409** | The attempted action is not valid according to gateway rules. For example, when the gateway is too busy then the transaction is not processed. |  -  |
**422** | The processor declined the transaction. |  -  |
**500** | An unexpected internal server error occurred. |  -  |

