# FraudDetectApi

All URIs are relative to *https://cert.api.firstdata.com/gateway/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**fraudClientRegistrationPost**](FraudDetectApi.md#fraudClientRegistrationPost) | **POST** /fraud/client-registration | Client registration for fraud detect transaction.
[**fraudPaymentRegistrationPost**](FraudDetectApi.md#fraudPaymentRegistrationPost) | **POST** /fraud/payment-registration | Payment registration for fraud detect transaction.
[**scoreOnly**](FraudDetectApi.md#scoreOnly) | **POST** /fraud/score-only | Score a transaction for fraud.


<a name="fraudClientRegistrationPost"></a>
# **fraudClientRegistrationPost**
> FraudRegistrationResponse fraudClientRegistrationPost(contentType, clientRequestId, apiKey, timestamp, clientRegistration, messageSignature, region)

Client registration for fraud detect transaction.

Use this to register client for fraud detect transaction.

### Example
```java
// Import classes:
import com.github.GBSEcom.client.ApiClient;
import com.github.GBSEcom.client.ApiException;
import com.github.GBSEcom.client.Configuration;
import com.github.GBSEcom.client.models.*;
import com.github.GBSEcom.api.FraudDetectApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://cert.api.firstdata.com/gateway/v2");

    FraudDetectApi apiInstance = new FraudDetectApi(defaultClient);
    String contentType = "application/json"; // String | Content type.
    String clientRequestId = "clientRequestId_example"; // String | A client-generated ID for request tracking and signature creation, unique per request.  This is also used for idempotency control. We recommend 128-bit UUID format.
    String apiKey = "apiKey_example"; // String | Key given to merchant after boarding associating their requests with the appropriate app in Apigee.
    Long timestamp = 56L; // Long | Epoch timestamp in milliseconds in the request from a client system. Used for Message Signature generation and time limit (5 mins).
    ClientRegistration clientRegistration = new ClientRegistration(); // ClientRegistration | 
    String messageSignature = "messageSignature_example"; // String | Used to ensure the request has not been tampered with during transmission. The Message-Signature is the Base64 encoded HMAC hash (SHA256 algorithm with the API Secret as the key.) For more information, refer to the supporting documentation on the Developer Portal.
    String region = "region_example"; // String | Indicates the region where the client wants the transaction to be processed. This will override the default processing region identified for the client. Available options are argentina, brazil, germany, india and northamerica. Region specific store setup and APIGEE boarding is required in order to use an alternate region for processing.
    try {
      FraudRegistrationResponse result = apiInstance.fraudClientRegistrationPost(contentType, clientRequestId, apiKey, timestamp, clientRegistration, messageSignature, region);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FraudDetectApi#fraudClientRegistrationPost");
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
 **clientRegistration** | [**ClientRegistration**](ClientRegistration.md)|  |
 **messageSignature** | **String**| Used to ensure the request has not been tampered with during transmission. The Message-Signature is the Base64 encoded HMAC hash (SHA256 algorithm with the API Secret as the key.) For more information, refer to the supporting documentation on the Developer Portal. | [optional]
 **region** | **String**| Indicates the region where the client wants the transaction to be processed. This will override the default processing region identified for the client. Available options are argentina, brazil, germany, india and northamerica. Region specific store setup and APIGEE boarding is required in order to use an alternate region for processing. | [optional]

### Return type

[**FraudRegistrationResponse**](FraudRegistrationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success response. |  -  |
**400** | Error response. |  -  |

<a name="fraudPaymentRegistrationPost"></a>
# **fraudPaymentRegistrationPost**
> FraudRegistrationResponse fraudPaymentRegistrationPost(contentType, clientRequestId, apiKey, timestamp, paymentRegistration, messageSignature, region)

Payment registration for fraud detect transaction.

Use this to register payment for fraud detect transaction.

### Example
```java
// Import classes:
import com.github.GBSEcom.client.ApiClient;
import com.github.GBSEcom.client.ApiException;
import com.github.GBSEcom.client.Configuration;
import com.github.GBSEcom.client.models.*;
import com.github.GBSEcom.api.FraudDetectApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://cert.api.firstdata.com/gateway/v2");

    FraudDetectApi apiInstance = new FraudDetectApi(defaultClient);
    String contentType = "application/json"; // String | Content type.
    String clientRequestId = "clientRequestId_example"; // String | A client-generated ID for request tracking and signature creation, unique per request.  This is also used for idempotency control. We recommend 128-bit UUID format.
    String apiKey = "apiKey_example"; // String | Key given to merchant after boarding associating their requests with the appropriate app in Apigee.
    Long timestamp = 56L; // Long | Epoch timestamp in milliseconds in the request from a client system. Used for Message Signature generation and time limit (5 mins).
    PaymentRegistration paymentRegistration = new PaymentRegistration(); // PaymentRegistration | 
    String messageSignature = "messageSignature_example"; // String | Used to ensure the request has not been tampered with during transmission. The Message-Signature is the Base64 encoded HMAC hash (SHA256 algorithm with the API Secret as the key.) For more information, refer to the supporting documentation on the Developer Portal.
    String region = "region_example"; // String | Indicates the region where the client wants the transaction to be processed. This will override the default processing region identified for the client. Available options are argentina, brazil, germany, india and northamerica. Region specific store setup and APIGEE boarding is required in order to use an alternate region for processing.
    try {
      FraudRegistrationResponse result = apiInstance.fraudPaymentRegistrationPost(contentType, clientRequestId, apiKey, timestamp, paymentRegistration, messageSignature, region);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FraudDetectApi#fraudPaymentRegistrationPost");
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
 **paymentRegistration** | [**PaymentRegistration**](PaymentRegistration.md)|  |
 **messageSignature** | **String**| Used to ensure the request has not been tampered with during transmission. The Message-Signature is the Base64 encoded HMAC hash (SHA256 algorithm with the API Secret as the key.) For more information, refer to the supporting documentation on the Developer Portal. | [optional]
 **region** | **String**| Indicates the region where the client wants the transaction to be processed. This will override the default processing region identified for the client. Available options are argentina, brazil, germany, india and northamerica. Region specific store setup and APIGEE boarding is required in order to use an alternate region for processing. | [optional]

### Return type

[**FraudRegistrationResponse**](FraudRegistrationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success response. |  -  |
**400** | Error response. |  -  |

<a name="scoreOnly"></a>
# **scoreOnly**
> ScoreOnlyResponse scoreOnly(contentType, clientRequestId, apiKey, timestamp, scoreOnlyRequest, messageSignature, region)

Score a transaction for fraud.

Use this to obtain a fraud score for a transaction.

### Example
```java
// Import classes:
import com.github.GBSEcom.client.ApiClient;
import com.github.GBSEcom.client.ApiException;
import com.github.GBSEcom.client.Configuration;
import com.github.GBSEcom.client.models.*;
import com.github.GBSEcom.api.FraudDetectApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://cert.api.firstdata.com/gateway/v2");

    FraudDetectApi apiInstance = new FraudDetectApi(defaultClient);
    String contentType = "application/json"; // String | Content type.
    String clientRequestId = "clientRequestId_example"; // String | A client-generated ID for request tracking and signature creation, unique per request.  This is also used for idempotency control. We recommend 128-bit UUID format.
    String apiKey = "apiKey_example"; // String | Key given to merchant after boarding associating their requests with the appropriate app in Apigee.
    Long timestamp = 56L; // Long | Epoch timestamp in milliseconds in the request from a client system. Used for Message Signature generation and time limit (5 mins).
    ScoreOnlyRequest scoreOnlyRequest = new ScoreOnlyRequest(); // ScoreOnlyRequest | Accepted request type: ScoreOnlyRequest.
    String messageSignature = "messageSignature_example"; // String | Used to ensure the request has not been tampered with during transmission. The Message-Signature is the Base64 encoded HMAC hash (SHA256 algorithm with the API Secret as the key.) For more information, refer to the supporting documentation on the Developer Portal.
    String region = "region_example"; // String | Indicates the region where the client wants the transaction to be processed. This will override the default processing region identified for the client. Available options are argentina, brazil, germany, india and northamerica. Region specific store setup and APIGEE boarding is required in order to use an alternate region for processing.
    try {
      ScoreOnlyResponse result = apiInstance.scoreOnly(contentType, clientRequestId, apiKey, timestamp, scoreOnlyRequest, messageSignature, region);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FraudDetectApi#scoreOnly");
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
 **scoreOnlyRequest** | [**ScoreOnlyRequest**](ScoreOnlyRequest.md)| Accepted request type: ScoreOnlyRequest. |
 **messageSignature** | **String**| Used to ensure the request has not been tampered with during transmission. The Message-Signature is the Base64 encoded HMAC hash (SHA256 algorithm with the API Secret as the key.) For more information, refer to the supporting documentation on the Developer Portal. | [optional]
 **region** | **String**| Indicates the region where the client wants the transaction to be processed. This will override the default processing region identified for the client. Available options are argentina, brazil, germany, india and northamerica. Region specific store setup and APIGEE boarding is required in order to use an alternate region for processing. | [optional]

### Return type

[**ScoreOnlyResponse**](ScoreOnlyResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success response. |  -  |
**400** | Error response. |  -  |

