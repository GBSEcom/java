# PaymentSchedulesApi

All URIs are relative to *https://cert.api.firstdata.com/gateway/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelPaymentSchedule**](PaymentSchedulesApi.md#cancelPaymentSchedule) | **DELETE** /payment-schedules/{order-id} | Cancel a gateway payment schedule.
[**createPaymentSchedule**](PaymentSchedulesApi.md#createPaymentSchedule) | **POST** /payment-schedules | Create gateway payment schedule.
[**inquiryPaymentSchedule**](PaymentSchedulesApi.md#inquiryPaymentSchedule) | **GET** /payment-schedules/{order-id} | View a gateway payment schedule.
[**updatePaymentSchedule**](PaymentSchedulesApi.md#updatePaymentSchedule) | **PATCH** /payment-schedules/{order-id} | Update a gateway payment schedule.


<a name="cancelPaymentSchedule"></a>
# **cancelPaymentSchedule**
> PaymentSchedulesResponse cancelPaymentSchedule(contentType, clientRequestId, apiKey, timestamp, orderId, messageSignature, region, storeId)

Cancel a gateway payment schedule.

Use this to cancel an existing gateway payment schedule.

### Example
```java
// Import classes:
import com.github.GBSEcom.client.ApiClient;
import com.github.GBSEcom.client.ApiException;
import com.github.GBSEcom.client.Configuration;
import com.github.GBSEcom.client.models.*;
import com.github.GBSEcom.api.PaymentSchedulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://cert.api.firstdata.com/gateway/v2");

    PaymentSchedulesApi apiInstance = new PaymentSchedulesApi(defaultClient);
    String contentType = "application/json"; // String | Content type.
    String clientRequestId = "clientRequestId_example"; // String | A client-generated ID for request tracking and signature creation, unique per request.  This is also used for idempotency control. We recommend 128-bit UUID format.
    String apiKey = "apiKey_example"; // String | Key given to merchant after boarding associating their requests with the appropriate app in Apigee.
    Long timestamp = 56L; // Long | Epoch timestamp in milliseconds in the request from a client system. Used for Message Signature generation and time limit (5 mins).
    String orderId = "orderId_example"; // String | Gateway order identifier as returned in the parameter orderId.
    String messageSignature = "messageSignature_example"; // String | Used to ensure the request has not been tampered with during transmission. The Message-Signature is the Base64 encoded HMAC hash (SHA256 algorithm with the API Secret as the key.) For more information, refer to the supporting documentation on the Developer Portal.
    String region = "region_example"; // String | Indicates the region where the client wants the transaction to be processed. This will override the default processing region identified for the client. Available options are argentina, brazil, germany, india and northamerica. Region specific store setup and APIGEE boarding is required in order to use an alternate region for processing.
    String storeId = "storeId_example"; // String | An optional outlet ID for clients that support multiple stores in the same developer app.
    try {
      PaymentSchedulesResponse result = apiInstance.cancelPaymentSchedule(contentType, clientRequestId, apiKey, timestamp, orderId, messageSignature, region, storeId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentSchedulesApi#cancelPaymentSchedule");
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
 **orderId** | **String**| Gateway order identifier as returned in the parameter orderId. |
 **messageSignature** | **String**| Used to ensure the request has not been tampered with during transmission. The Message-Signature is the Base64 encoded HMAC hash (SHA256 algorithm with the API Secret as the key.) For more information, refer to the supporting documentation on the Developer Portal. | [optional]
 **region** | **String**| Indicates the region where the client wants the transaction to be processed. This will override the default processing region identified for the client. Available options are argentina, brazil, germany, india and northamerica. Region specific store setup and APIGEE boarding is required in order to use an alternate region for processing. | [optional]
 **storeId** | **String**| An optional outlet ID for clients that support multiple stores in the same developer app. | [optional]

### Return type

[**PaymentSchedulesResponse**](PaymentSchedulesResponse.md)

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
**409** | There was a problem communicating with the endpoint. |  -  |
**415** | Format that is not supported by the server for the HTTP method. |  -  |
**422** | There was a problem communicating with the endpoint. |  -  |
**500** | An unexpected internal server error occurred. |  -  |

<a name="createPaymentSchedule"></a>
# **createPaymentSchedule**
> PaymentSchedulesResponse createPaymentSchedule(contentType, clientRequestId, apiKey, timestamp, paymentSchedulesRequest, messageSignature, region)

Create gateway payment schedule.

Use this to create a gateway payment schedule.

### Example
```java
// Import classes:
import com.github.GBSEcom.client.ApiClient;
import com.github.GBSEcom.client.ApiException;
import com.github.GBSEcom.client.Configuration;
import com.github.GBSEcom.client.models.*;
import com.github.GBSEcom.api.PaymentSchedulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://cert.api.firstdata.com/gateway/v2");

    PaymentSchedulesApi apiInstance = new PaymentSchedulesApi(defaultClient);
    String contentType = "application/json"; // String | Content type.
    String clientRequestId = "clientRequestId_example"; // String | A client-generated ID for request tracking and signature creation, unique per request.  This is also used for idempotency control. We recommend 128-bit UUID format.
    String apiKey = "apiKey_example"; // String | Key given to merchant after boarding associating their requests with the appropriate app in Apigee.
    Long timestamp = 56L; // Long | Epoch timestamp in milliseconds in the request from a client system. Used for Message Signature generation and time limit (5 mins).
    PaymentSchedulesRequest paymentSchedulesRequest = new PaymentSchedulesRequest(); // PaymentSchedulesRequest | Accepted request types: PaymentMethodPaymentSchedulesRequest and ReferencedOrderPaymentSchedulesRequest.
    String messageSignature = "messageSignature_example"; // String | Used to ensure the request has not been tampered with during transmission. The Message-Signature is the Base64 encoded HMAC hash (SHA256 algorithm with the API Secret as the key.) For more information, refer to the supporting documentation on the Developer Portal.
    String region = "region_example"; // String | Indicates the region where the client wants the transaction to be processed. This will override the default processing region identified for the client. Available options are argentina, brazil, germany, india and northamerica. Region specific store setup and APIGEE boarding is required in order to use an alternate region for processing.
    try {
      PaymentSchedulesResponse result = apiInstance.createPaymentSchedule(contentType, clientRequestId, apiKey, timestamp, paymentSchedulesRequest, messageSignature, region);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentSchedulesApi#createPaymentSchedule");
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
 **paymentSchedulesRequest** | [**PaymentSchedulesRequest**](PaymentSchedulesRequest.md)| Accepted request types: PaymentMethodPaymentSchedulesRequest and ReferencedOrderPaymentSchedulesRequest. |
 **messageSignature** | **String**| Used to ensure the request has not been tampered with during transmission. The Message-Signature is the Base64 encoded HMAC hash (SHA256 algorithm with the API Secret as the key.) For more information, refer to the supporting documentation on the Developer Portal. | [optional]
 **region** | **String**| Indicates the region where the client wants the transaction to be processed. This will override the default processing region identified for the client. Available options are argentina, brazil, germany, india and northamerica. Region specific store setup and APIGEE boarding is required in order to use an alternate region for processing. | [optional]

### Return type

[**PaymentSchedulesResponse**](PaymentSchedulesResponse.md)

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
**409** | The attempted action is not valid according to gateway rules. |  -  |
**415** | Format that is not supported by the server for the HTTP method. |  -  |
**422** | The endpoint declined the transaction. |  -  |
**500** | An unexpected internal server error occurred. |  -  |

<a name="inquiryPaymentSchedule"></a>
# **inquiryPaymentSchedule**
> RecurringPaymentDetailsResponse inquiryPaymentSchedule(contentType, clientRequestId, apiKey, timestamp, orderId, messageSignature, region, storeId)

View a gateway payment schedule.

Use this to view an existing gateway payment schedule.

### Example
```java
// Import classes:
import com.github.GBSEcom.client.ApiClient;
import com.github.GBSEcom.client.ApiException;
import com.github.GBSEcom.client.Configuration;
import com.github.GBSEcom.client.models.*;
import com.github.GBSEcom.api.PaymentSchedulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://cert.api.firstdata.com/gateway/v2");

    PaymentSchedulesApi apiInstance = new PaymentSchedulesApi(defaultClient);
    String contentType = "application/json"; // String | Content type.
    String clientRequestId = "clientRequestId_example"; // String | A client-generated ID for request tracking and signature creation, unique per request.  This is also used for idempotency control. We recommend 128-bit UUID format.
    String apiKey = "apiKey_example"; // String | Key given to merchant after boarding associating their requests with the appropriate app in Apigee.
    Long timestamp = 56L; // Long | Epoch timestamp in milliseconds in the request from a client system. Used for Message Signature generation and time limit (5 mins).
    String orderId = "orderId_example"; // String | Gateway order identifier as returned in the parameter orderId.
    String messageSignature = "messageSignature_example"; // String | Used to ensure the request has not been tampered with during transmission. The Message-Signature is the Base64 encoded HMAC hash (SHA256 algorithm with the API Secret as the key.) For more information, refer to the supporting documentation on the Developer Portal.
    String region = "region_example"; // String | Indicates the region where the client wants the transaction to be processed. This will override the default processing region identified for the client. Available options are argentina, brazil, germany, india and northamerica. Region specific store setup and APIGEE boarding is required in order to use an alternate region for processing.
    String storeId = "storeId_example"; // String | An optional outlet ID for clients that support multiple stores in the same developer app.
    try {
      RecurringPaymentDetailsResponse result = apiInstance.inquiryPaymentSchedule(contentType, clientRequestId, apiKey, timestamp, orderId, messageSignature, region, storeId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentSchedulesApi#inquiryPaymentSchedule");
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
 **orderId** | **String**| Gateway order identifier as returned in the parameter orderId. |
 **messageSignature** | **String**| Used to ensure the request has not been tampered with during transmission. The Message-Signature is the Base64 encoded HMAC hash (SHA256 algorithm with the API Secret as the key.) For more information, refer to the supporting documentation on the Developer Portal. | [optional]
 **region** | **String**| Indicates the region where the client wants the transaction to be processed. This will override the default processing region identified for the client. Available options are argentina, brazil, germany, india and northamerica. Region specific store setup and APIGEE boarding is required in order to use an alternate region for processing. | [optional]
 **storeId** | **String**| An optional outlet ID for clients that support multiple stores in the same developer app. | [optional]

### Return type

[**RecurringPaymentDetailsResponse**](RecurringPaymentDetailsResponse.md)

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
**415** | Format that is not supported by the server for the HTTP method. |  -  |
**500** | An unexpected internal server error occurred. |  -  |

<a name="updatePaymentSchedule"></a>
# **updatePaymentSchedule**
> PaymentSchedulesResponse updatePaymentSchedule(contentType, clientRequestId, apiKey, timestamp, orderId, paymentSchedulesRequest, messageSignature, region)

Update a gateway payment schedule.

Use this to update a gateway payment schedule.

### Example
```java
// Import classes:
import com.github.GBSEcom.client.ApiClient;
import com.github.GBSEcom.client.ApiException;
import com.github.GBSEcom.client.Configuration;
import com.github.GBSEcom.client.models.*;
import com.github.GBSEcom.api.PaymentSchedulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://cert.api.firstdata.com/gateway/v2");

    PaymentSchedulesApi apiInstance = new PaymentSchedulesApi(defaultClient);
    String contentType = "application/json"; // String | Content type.
    String clientRequestId = "clientRequestId_example"; // String | A client-generated ID for request tracking and signature creation, unique per request.  This is also used for idempotency control. We recommend 128-bit UUID format.
    String apiKey = "apiKey_example"; // String | Key given to merchant after boarding associating their requests with the appropriate app in Apigee.
    Long timestamp = 56L; // Long | Epoch timestamp in milliseconds in the request from a client system. Used for Message Signature generation and time limit (5 mins).
    String orderId = "orderId_example"; // String | Gateway order identifier as returned in the parameter orderId.
    PaymentSchedulesRequest paymentSchedulesRequest = new PaymentSchedulesRequest(); // PaymentSchedulesRequest | Accepted request types: PaymentMethodPaymentSchedulesRequest and ReferencedOrderPaymentSchedulesRequest.
    String messageSignature = "messageSignature_example"; // String | Used to ensure the request has not been tampered with during transmission. The Message-Signature is the Base64 encoded HMAC hash (SHA256 algorithm with the API Secret as the key.) For more information, refer to the supporting documentation on the Developer Portal.
    String region = "region_example"; // String | Indicates the region where the client wants the transaction to be processed. This will override the default processing region identified for the client. Available options are argentina, brazil, germany, india and northamerica. Region specific store setup and APIGEE boarding is required in order to use an alternate region for processing.
    try {
      PaymentSchedulesResponse result = apiInstance.updatePaymentSchedule(contentType, clientRequestId, apiKey, timestamp, orderId, paymentSchedulesRequest, messageSignature, region);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentSchedulesApi#updatePaymentSchedule");
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
 **orderId** | **String**| Gateway order identifier as returned in the parameter orderId. |
 **paymentSchedulesRequest** | [**PaymentSchedulesRequest**](PaymentSchedulesRequest.md)| Accepted request types: PaymentMethodPaymentSchedulesRequest and ReferencedOrderPaymentSchedulesRequest. |
 **messageSignature** | **String**| Used to ensure the request has not been tampered with during transmission. The Message-Signature is the Base64 encoded HMAC hash (SHA256 algorithm with the API Secret as the key.) For more information, refer to the supporting documentation on the Developer Portal. | [optional]
 **region** | **String**| Indicates the region where the client wants the transaction to be processed. This will override the default processing region identified for the client. Available options are argentina, brazil, germany, india and northamerica. Region specific store setup and APIGEE boarding is required in order to use an alternate region for processing. | [optional]

### Return type

[**PaymentSchedulesResponse**](PaymentSchedulesResponse.md)

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
**409** | There was a problem communicating with the endpoint. |  -  |
**422** | There was a problem communicating with the endpoint. |  -  |
**500** | An unexpected internal server error occurred. |  -  |

