# OrderApi

All URIs are relative to *https://cert.api.firstdata.com/gateway/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**orderInquiry**](OrderApi.md#orderInquiry) | **GET** /orders/{order-id} | Retrieve the state of an order.
[**submitSecondaryTransactionFromOrder**](OrderApi.md#submitSecondaryTransactionFromOrder) | **POST** /orders/{order-id} | Perform return or postAuth secondary transactions.


<a name="orderInquiry"></a>
# **orderInquiry**
> OrderResponse orderInquiry(contentType, clientRequestId, apiKey, timestamp, orderId, messageSignature, region, storeId)

Retrieve the state of an order.

Use this query to get the current state of an existing order.

### Example
```java
// Import classes:
import com.github.GBSEcom.client.ApiClient;
import com.github.GBSEcom.client.ApiException;
import com.github.GBSEcom.client.Configuration;
import com.github.GBSEcom.client.models.*;
import com.github.GBSEcom.api.OrderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://cert.api.firstdata.com/gateway/v2");

    OrderApi apiInstance = new OrderApi(defaultClient);
    String contentType = "application/json"; // String | Content type.
    String clientRequestId = "clientRequestId_example"; // String | A client-generated ID for request tracking and signature creation, unique per request.  This is also used for idempotency control. We recommend 128-bit UUID format.
    String apiKey = "apiKey_example"; // String | Key given to merchant after boarding associating their requests with the appropriate app in Apigee.
    Long timestamp = 56L; // Long | Epoch timestamp in milliseconds in the request from a client system. Used for Message Signature generation and time limit (5 mins).
    String orderId = "orderId_example"; // String | Gateway order identifier as returned in the parameter orderId.
    String messageSignature = "messageSignature_example"; // String | Used to ensure the request has not been tampered with during transmission. The Message-Signature is the Base64 encoded HMAC hash (SHA256 algorithm with the API Secret as the key.) For more information, refer to the supporting documentation on the Developer Portal.
    String region = "region_example"; // String | Indicates the region where the client wants the transaction to be processed. This will override the default processing region identified for the client. Available options are argentina, brazil, germany, india and northamerica. Region specific store setup and APIGEE boarding is required in order to use an alternate region for processing.
    String storeId = "storeId_example"; // String | An optional outlet ID for clients that support multiple stores in the same developer app.
    try {
      OrderResponse result = apiInstance.orderInquiry(contentType, clientRequestId, apiKey, timestamp, orderId, messageSignature, region, storeId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#orderInquiry");
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

[**OrderResponse**](OrderResponse.md)

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
**401** | The request cannot be authenticated or was submitted with the wrong credentials. |  -  |
**403** | The request was unauthorized. |  -  |
**404** | The requested resource doesn&#39;t exist. |  -  |
**500** | An unexpected internal server error occurred. |  -  |
**502** | There was a problem communicating with the endpoint. |  -  |

<a name="submitSecondaryTransactionFromOrder"></a>
# **submitSecondaryTransactionFromOrder**
> TransactionResponse submitSecondaryTransactionFromOrder(contentType, clientRequestId, apiKey, timestamp, orderId, secondaryTransaction, messageSignature, region)

Perform return or postAuth secondary transactions.

Use this to perform a postAuth or return secondary transaction using order ID. Partial postAuths and returns are allowed.

### Example
```java
// Import classes:
import com.github.GBSEcom.client.ApiClient;
import com.github.GBSEcom.client.ApiException;
import com.github.GBSEcom.client.Configuration;
import com.github.GBSEcom.client.models.*;
import com.github.GBSEcom.api.OrderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://cert.api.firstdata.com/gateway/v2");

    OrderApi apiInstance = new OrderApi(defaultClient);
    String contentType = "application/json"; // String | Content type.
    String clientRequestId = "clientRequestId_example"; // String | A client-generated ID for request tracking and signature creation, unique per request.  This is also used for idempotency control. We recommend 128-bit UUID format.
    String apiKey = "apiKey_example"; // String | Key given to merchant after boarding associating their requests with the appropriate app in Apigee.
    Long timestamp = 56L; // Long | Epoch timestamp in milliseconds in the request from a client system. Used for Message Signature generation and time limit (5 mins).
    String orderId = "orderId_example"; // String | Gateway order identifier as returned in the parameter orderId.
    SecondaryTransaction secondaryTransaction = new SecondaryTransaction(); // SecondaryTransaction | Accepted request types: PostAuthTransaction, VoidTransaction, VoidPreAuthTransactions, ReturnTransaction, AchPostAuthTransaction, AchVoidTransaction and AchReturnTransaction.
    String messageSignature = "messageSignature_example"; // String | Used to ensure the request has not been tampered with during transmission. The Message-Signature is the Base64 encoded HMAC hash (SHA256 algorithm with the API Secret as the key.) For more information, refer to the supporting documentation on the Developer Portal.
    String region = "region_example"; // String | Indicates the region where the client wants the transaction to be processed. This will override the default processing region identified for the client. Available options are argentina, brazil, germany, india and northamerica. Region specific store setup and APIGEE boarding is required in order to use an alternate region for processing.
    try {
      TransactionResponse result = apiInstance.submitSecondaryTransactionFromOrder(contentType, clientRequestId, apiKey, timestamp, orderId, secondaryTransaction, messageSignature, region);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#submitSecondaryTransactionFromOrder");
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
 **secondaryTransaction** | [**SecondaryTransaction**](SecondaryTransaction.md)| Accepted request types: PostAuthTransaction, VoidTransaction, VoidPreAuthTransactions, ReturnTransaction, AchPostAuthTransaction, AchVoidTransaction and AchReturnTransaction. |
 **messageSignature** | **String**| Used to ensure the request has not been tampered with during transmission. The Message-Signature is the Base64 encoded HMAC hash (SHA256 algorithm with the API Secret as the key.) For more information, refer to the supporting documentation on the Developer Portal. | [optional]
 **region** | **String**| Indicates the region where the client wants the transaction to be processed. This will override the default processing region identified for the client. Available options are argentina, brazil, germany, india and northamerica. Region specific store setup and APIGEE boarding is required in order to use an alternate region for processing. | [optional]

### Return type

[**TransactionResponse**](TransactionResponse.md)

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
**409** | The attempted action is not valid according to gateway rules. For example, the merchant is not set-up or the order already exists. |  -  |
**422** | The processor declined the transaction. |  -  |
**500** | An unexpected internal server error occurred. |  -  |
**502** | There was a problem communicating with the endpoint. |  -  |

