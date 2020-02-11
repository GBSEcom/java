# First Data Gateway

Payment Gateway API Specification.
- API version: 1.5.0

Payment Gateway API for payment processing. Version 1.5.0

## Requirements

Building the API client library requires:
1. Java 1.8+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.github.GBSEcom</groupId>
  <artifactId>first-data-gateway</artifactId>
  <version>1.5.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.github.GBSEcom.client:first-data-gateway:1.5.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/first-data-gateway-1.5.0.jar`
* `build/libs/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
import com.github.GBSEcom.simple.*;
import com.github.GBSEcom.model.*;

import java.io.File;
import java.util.*;

public class AuthenticationApiExample {

    public static void main(String[] args) {

        final String basePath = "https://cert.api.firstdata.com/gateway/v2";
        final String apiSecret = "apiSecret";
        final String apiKey = "apiKey";

        final MerchantCredentials creds = MerchantCredentials.of(apiSecret, apiKey);
        final ClientContext context = ClientContextImpl.create(creds, basePath);
        final ClientFactory factory = context.getFactory();
        final AuthenticationApi api = factory.getAuthenticationApi();

        try {
            final AccessTokenResponse result = api.getAccessToken();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthenticationApi#getAccessToken");
            e.printStackTrace();
        }
    }
}
```


## API Endpoints

All URIs are by default relative to *https://cert.api.firstdata.com/gateway*

Interface | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AuthenticationApi* | **getAccessToken** | **POST** /v2/authentication/access-tokens | Generate an access token for user authentication.
*CardInfoLookupApi* | **cardInfoLookup** | **POST** /v2/card-information | Card information lookUp
*CardVerificationApi* | **verifyCard** | **POST** /v2/card-verification | Verify a payment card.
*CurrencyConversionApi* | **getExchangeRate** | **POST** /v2/exchange-rates | Generate dynamic currency conversion transactions
*FraudDetectApi* | **scoreOnly** | **POST** /v2/fraud/score-only | Score a transaction for fraud.
*FraudDetectApi* | **clientRegistration** | **POST** /v2/fraud/client-registration | Client Registration for fraud detect.
*FraudDetectApi* | **paymentRegistration** | **POST** /v2/fraud/payment-registration | Payment Registration for fraud detect.
*OrderApi* | **orderInquiry** | **GET** /v2/orders/{order-id} | Retrieve the state of an order
*OrderApi* | **orderPostAuth** | **POST** /v2/orders/{order-id}/postauth | Capture/complete an already existing order.
*OrderApi* | **orderReturnTransaction** | **POST** /v2/orders/{order-id}/return | Return/refund an order.
*PaymentApi* | **finalizeSecureTransaction** | **PATCH** /v2/payments/{transaction-id} | Update a 3DSecure or UnionPay payment and continue processing.
*PaymentApi* | **performPaymentPostAuthorisation** | **POST** /v2/payments/{transaction-id}/postauth | Capture/complete a transaction.
*PaymentApi* | **primaryPaymentTransaction** | **POST** /v2/payments | Generate a primary transaction.
*PaymentApi* | **returnTransaction** | **POST** /v2/payments/{transaction-id}/return | Return/refund a transaction.
*PaymentApi* | **transactionInquiry** | **GET** /v2/payments/{transaction-id} | Retrieve the state of a transaction.
*PaymentApi* | **voidTransaction** | **POST** /v2/payments/{transaction-id}/void | Reverse a previous action on an existing transaction.
*PaymentSchedulesApi* | **cancelPaymentSchedule** | **DELETE** /v2/payment-schedules/{order-id} | Cancel a gateway payment schedule.
*PaymentSchedulesApi* | **createPaymentSchedule** | **POST** /v2/payment-schedules | Use this to create a gateway payment schedule.
*PaymentSchedulesApi* | **inquiryPaymentSchedule** | **GET** /v2/payment-schedules/{order-id} | View a gateway payment schedule.
*PaymentSchedulesApi* | **updatePaymentSchedule** | **PATCH** /v2/payment-schedules/{order-id} | Update a gateway payment schedule.
*PaymentTokenApi* | **createPaymentToken** | **POST** /v2/payment-tokens | Create a payment token from a payment card.
*PaymentTokenApi* | **deletePaymentToken** | **DELETE** /v2/payment-tokens/{token-id} | Delete a payment token.
*PaymentUrlApi* | **createPaymentUrl** | **POST** /v2/payment-url | Create a payment URL.
*PaymentUrlApi* | **deletePaymentUrl** | **DELETE** /v2/payment-url | Delete a payment URL.
*PaymentUrlApi* | **paymentUrlDetail** | **GET** /v2/payment-url | Retrive the state of a payment URL.
for store.



## Code Overview


### MerchantCredentials

```java
package com.github.GBSEcom.simple;

public class MerchantCredentials {
  public static MerchantCredentials of(String apiSecret, String apiKey);
}
```


### ClientContext (implemented by ClientContextImpl)

```java
package com.github.GBSEcom.simple;
import com.github.GBSEcom.client.ApiClient;

public interface ClientContext {
  ClientFactory getFactory();
}
```

#### ClientContext factory methods

```java
package com.github.GBSEcom.simple;

public class ClientContextImpl implements ClientContext {

  // default base path is https://cert.api.firstdata.com/gateway
  // stored at ClientContextImpl.DEFAULT_BASE_PATH

  public static ClientContext create(MerchantCredentials creds, String apiBasePath, String defaultRegion, String defaultStoreId);
  public static ClientContext create(MerchantCredentials creds, String apiBasePath);
  public static ClientContext create(MerchantCredentials creds);
}
```


### ClientFactory

```java
package com.github.GBSEcom.simple;

public interface ClientFactory {
  AuthenticationApi getAuthenticationApi();
  CardInfoLookupApi getCardInfoLookupApi();
  CardVerificationApi getCardVerificationApi();
  CurrencyConversionApi getCurrencyConversionApi();
  FraudDetectApi getFraudDetectApi();
  OrderApi getOrderApi();
  PaymentApi getPaymentApi();
  PaymentSchedulesApi getPaymentSchedulesApi();
  PaymentTokenApi getPaymentTokenApi();
  PaymentUrlApi getPaymentUrlApi();
}
```


### AuthenticationApi

```java
package com.github.GBSEcom.simple;
import com.github.GBSEcom.model.AccessTokenResponse;

public interface AuthenticationApi {
  AccessTokenResponse getAccessToken();
}
```


### CardInfoLookupApi

```java
package com.github.GBSEcom.simple;
import com.github.GBSEcom.model.CardInfoLookupRequest;
import com.github.GBSEcom.model.CardInfoLookupResponse;

public interface CardInfoLookupApi {
  CardInfoLookupResponse cardInfoLookup(CardInfoLookupRequest payload, String region);
  CardInfoLookupResponse cardInfoLookup(CardInfoLookupRequest payload);
}
```


### CardVerificationApi

```java
package com.github.GBSEcom.simple;
import com.github.GBSEcom.model.CardVerificationRequest;
import com.github.GBSEcom.model.TransactionResponse;

public interface CardVerificationApi {
  TransactionResponse verifyCard(CardVerificationRequest payload, String region);
  TransactionResponse verifyCard(CardVerificationRequest payload);
}
```


### CurrencyConversionApi

```java
package com.github.GBSEcom.simple;
import com.github.GBSEcom.model.ExchangeRateRequest;
import com.github.GBSEcom.model.ExchangeRateResponse;

public interface CurrencyConversionApi {
  ExchangeRateResponse getExchangeRate(ExchangeRateRequest payload, String region);
  ExchangeRateResponse getExchangeRate(ExchangeRateRequest payload);
}
```


### FraudDetectApi

```java
package com.github.GBSEcom.simple;
import com.github.GBSEcom.model.ScoreOnlyRequest;
import com.github.GBSEcom.model.ScoreOnlyResponse;

public interface FraudDetectApi {
  ScoreOnlyResponse scoreOnly(ScoreOnlyRequest payload, String region);
  ScoreOnlyResponse scoreOnly(ScoreOnlyRequest payload);

  FraudRegistrationResponse fraudClientRegistrationPost(ClientRegistration payload,String region);
  FraudRegistrationResponse fraudClientRegistrationPost(ClientRegistration payload);

  FraudRegistrationResponse fraudPaymentRegistrationPost(PaymentRegistration payload,String region);
  FraudRegistrationResponse fraudPaymentRegistrationPost(PaymentRegistration payload);
}
```


### OrderApi

```java
package com.github.GBSEcom.simple;
import com.github.GBSEcom.model.OrderResponse;
import com.github.GBSEcom.model.SecondaryTransaction;
import com.github.GBSEcom.model.TransactionResponse;

public interface OrderApi {
  OrderResponse orderInquiry(String orderId, String region, String storeId);
  OrderResponse orderInquiry(String orderId);

  TransactionResponse orderPostAuth(String orderId, SecondaryTransaction payload, String region, String storeId);
  TransactionResponse orderPostAuth(String orderId, SecondaryTransaction payload);

  TransactionResponse orderReturnTransaction(String orderId, SecondaryTransaction payload, String region, String storeId);
  TransactionResponse orderReturnTransaction(String orderId, SecondaryTransaction payload);
}
```


### PaymentApi

```java
package com.github.GBSEcom.simple;
import com.github.GBSEcom.model.AuthenticationResponseVerificationRequest;
import com.github.GBSEcom.model.PrimaryTransaction;
import com.github.GBSEcom.model.SecondaryTransaction;
import com.github.GBSEcom.model.TransactionResponse;

public interface PaymentApi {
  TransactionResponse finalizeSecureTransaction(String transactionId, AuthenticationResponseVerificationRequest payload, String region);
  TransactionResponse finalizeSecureTransaction(String transactionId, AuthenticationResponseVerificationRequest payload);

  TransactionResponse performPaymentPostAuthorisation(String transactionId, SecondaryTransaction payload, String region, String storeId);
  TransactionResponse performPaymentPostAuthorisation(String transactionId, SecondaryTransaction payload);

  TransactionResponse primaryPaymentTransaction(PrimaryTransaction payload, String region);
  TransactionResponse primaryPaymentTransaction(PrimaryTransaction payload);

  TransactionResponse returnTransaction(String transactionId, SecondaryTransaction payload, String region, String storeId);
  TransactionResponse returnTransaction(String transactionId, SecondaryTransaction payload);

  TransactionResponse transactionInquiry(String transactionId, String region, String storeId);
  TransactionResponse transactionInquiry(String transactionId);

  TransactionResponse voidTransaction(String transactionId, String region, String storeId);
  TransactionResponse voidTransaction(String transactionId);
}
```


### PaymentSchedulesApi

```java
package com.github.GBSEcom.simple;
import com.github.GBSEcom.model.PaymentSchedulesRequest;
import com.github.GBSEcom.model.PaymentSchedulesResponse;
import com.github.GBSEcom.model.RecurringPaymentDetailsResponse;

public interface PaymentSchedulesApi {
  PaymentSchedulesResponse cancelPaymentSchedule(String orderId, String region, String storeId);
  PaymentSchedulesResponse cancelPaymentSchedule(String orderId);

  PaymentSchedulesResponse createPaymentSchedule(PaymentSchedulesRequest payload, String region);
  PaymentSchedulesResponse createPaymentSchedule(PaymentSchedulesRequest payload);

  RecurringPaymentDetailsResponse inquiryPaymentSchedule(String orderId, String region, String storeId);
  RecurringPaymentDetailsResponse inquiryPaymentSchedule(String orderId);

  PaymentSchedulesResponse updatePaymentSchedule(String orderId, PaymentSchedulesRequest payload, String region, String storeId);
  PaymentSchedulesResponse updatePaymentSchedule(String orderId, PaymentSchedulesRequest payload);
}
```


### PaymentTokenApi

```java
package com.github.GBSEcom.simple;
import com.github.GBSEcom.model.PaymentTokenizationRequest;
import com.github.GBSEcom.model.PaymentTokenizationResponse;

public interface PaymentTokenApi {
  PaymentTokenizationResponse createPaymentToken(PaymentTokenizationRequest payload, String authorization, String region);
  PaymentTokenizationResponse createPaymentToken(PaymentTokenizationRequest payload, String authorization);
  PaymentTokenizationResponse createPaymentToken(PaymentTokenizationRequest payload);

  PaymentTokenizationResponse deletePaymentToken(String tokenId, String authorization, String region, String storeId);
  PaymentTokenizationResponse deletePaymentToken(String tokenId, String authorization);
  PaymentTokenizationResponse deletePaymentToken(String tokenId);
}
```


### PaymentUrlApi

```java
package com.github.GBSEcom.simple;
import com.github.GBSEcom.model.PaymentUrlRequest;
import com.github.GBSEcom.model.PaymentUrlResponse;

public interface PaymentUrlApi {
  PaymentUrlResponse createPaymentUrl(PaymentUrlRequest payload, String region);
  PaymentUrlResponse createPaymentUrl(PaymentUrlRequest payload);

  PaymentUrlResponse deletePaymentUrl(String transactionId,String orderId,String paymentUrlId,String transactionTime,String region,String storeId);
  PaymentUrlResponse deletePaymentUrl(String transactionId,String orderId,String paymentUrlId,String transactionTime);

  PaymentUrlDetailResponse paymentUrlDetail(String fromDate,String toDate,String orderId,String merchantTransactionId,String status,String region,String storeId);
  PaymentUrlDetailResponse paymentUrlDetail(String fromDate,String toDate,String orderId,String merchantTransactionId,String status);
}
```


## Documentation for Models

 Refer to the docs section. 


