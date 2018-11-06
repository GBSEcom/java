# FirstApiClient

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) or Gradle to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>com.github.GBSEcom</groupId>
    <artifactId>first-data-gateway</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.github.GBSEcom:first-data-gateway:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/first-data-gateway-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.github.GBSEcom.models.AccessTokenResponse;
import com.github.GBSEcom.client.ApiException;

// the 'simple' package contains the more user-friendly api (recommended)
import com.github.GBSEcom.simple.MerchantCredentials;
import com.github.GBSEcom.simple.ApiClientImpl;
import com.github.GBSEcom.simple.ApiClient;

import java.io.File;
import java.util.*;

public class ApiExample {

    public static void main(String[] args) {
        MerchantCredentials creds = MerchantCredentials.of("apiSecret", "apiKey");
        ApiClient api = ApiClientImpl.create(creds);

        try {
            AccessTokenResponse result = api.requestAccessToken();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ApiClient#requestAccessToken");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://cert.api.firstdata.com/gateway*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ApiClient* | [**requestAccessToken**](docs/ApiClient.md#requestAccessToken) | **POST** /v1/authentication/access-tokens | Generate an access token for user authentication
*ApiClient* | [**performPaymentPostAuthorisationByOrder**](docs/ApiClient.md#performPaymentPostAuthorisationByOrder) | **POST** /v1/orders/{order-id}/postauth | Use this to capture/complete a transaction. Partial postauths are allowed.
*ApiClient* | [**returnTransactionByOrder**](docs/ApiClient.md#returnTransactionByOrder) | **POST** /v1/orders/{order-id}/return | Use this to return/refund on the order. Partial returns are allowed.
*ApiClient* | [**performPaymentPostAuthorisationByTransaction**](docs/ApiClient.md#performPaymentPostAuthorisationByTransaction) | **POST** /v1/payments/{transaction-id}/postauth | Use this to capture/complete a transaction. Partial postauths are allowed.
*ApiClient* | [**primaryPaymentTransaction**](docs/ApiClient.md#primaryPaymentTransaction) | **POST** /v1/payments | Generate a primary transaction
*ApiClient* | [**returnTransaction**](docs/ApiClient.md#returnTransaction) | **POST** /v1/payments/{transaction-id}/return | Return/refund a transaction.
*ApiClient* | [**transactionInquiry**](docs/ApiClient.md#transactionInquiry) | **GET** /v1/payments/{transaction-id} | Retrieve the state of a transaction
*ApiClient* | [**voidTransaction**](docs/ApiClient.md#voidTransaction) | **POST** /v1/payments/{transaction-id}/void | Reverse a previous action on an existing transaction


## Documentation for Models

 - [AccessTokenResponse](docs/AccessTokenResponse.md)
 - [Address](docs/Address.md)
 - [Airline](docs/Airline.md)
 - [AirlineAncillaryServiceCategory](docs/AirlineAncillaryServiceCategory.md)
 - [AirlineTravelRoute](docs/AirlineTravelRoute.md)
 - [Amount](docs/Amount.md)
 - [AmountComponents](docs/AmountComponents.md)
 - [AuthenticationResponseVerification](docs/AuthenticationResponseVerification.md)
 - [BasketItem](docs/BasketItem.md)
 - [Billing](docs/Billing.md)
 - [CarRental](docs/CarRental.md)
 - [CarRentalExtraCharges](docs/CarRentalExtraCharges.md)
 - [CardVerificationsTransaction](docs/CardVerificationsTransaction.md)
 - [ClientLocale](docs/ClientLocale.md)
 - [Contact](docs/Contact.md)
 - [Error](docs/Error.md)
 - [ErrorDetails](docs/ErrorDetails.md)
 - [ErrorResponse](docs/ErrorResponse.md)
 - [Expiration](docs/Expiration.md)
 - [Frequency](docs/Frequency.md)
 - [IndustrySpecificExtensions](docs/IndustrySpecificExtensions.md)
 - [InstallmentOptions](docs/InstallmentOptions.md)
 - [Lodging](docs/Lodging.md)
 - [LodgingExtraCharges](docs/LodgingExtraCharges.md)
 - [Order](docs/Order.md)
 - [PayPal](docs/PayPal.md)
 - [PaymentCard](docs/PaymentCard.md)
 - [PaymentCardAuthenticationRequest](docs/PaymentCardAuthenticationRequest.md)
 - [PaymentCardAuthenticationResult](docs/PaymentCardAuthenticationResult.md)
 - [PaymentMethod](docs/PaymentMethod.md)
 - [PaymentSchedulesRequest](docs/PaymentSchedulesRequest.md)
 - [PaymentSchedulesResponse](docs/PaymentSchedulesResponse.md)
 - [PaymentUrlRequest](docs/PaymentUrlRequest.md)
 - [PaymentUrlResponse](docs/PaymentUrlResponse.md)
 - [PrimaryTransaction](docs/PrimaryTransaction.md)
 - [PrimaryTransactionAdditionalDetails](docs/PrimaryTransactionAdditionalDetails.md)
 - [ProcessorData](docs/ProcessorData.md)
 - [ResponseType](docs/ResponseType.md)
 - [SecondaryTransaction](docs/SecondaryTransaction.md)
 - [Sepa](docs/Sepa.md)
 - [SepaMandate](docs/SepaMandate.md)
 - [Shipping](docs/Shipping.md)
 - [SplitShipment](docs/SplitShipment.md)
 - [StoredCredential](docs/StoredCredential.md)
 - [TransactionResponse](docs/TransactionResponse.md)
 - [TransactionResponseAuthenticationRedirect](docs/TransactionResponseAuthenticationRedirect.md)
 - [TransactionResponseAuthenticationRedirectParams](docs/TransactionResponseAuthenticationRedirectParams.md)
 - [TransactionType](docs/TransactionType.md)
 - [TransactionErrorResponse](docs/TransactionErrorResponse.md)

## Recommendation

It's recommended to create an instance of `ApiClientImpl` per thread in a multithreaded environment to avoid any potential issues.

