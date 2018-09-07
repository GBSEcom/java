# AuthenticationApi

All URIs are relative to *https://cert.api.firstdata.com/gateway*

Method | HTTP request | Description
------------- | ------------- | -------------
[**requestAccessToken**](AuthenticationApiClient.md#requestAccessToken) | **POST** /v1/authentication/access-tokens | Generate an access token for user authentication


<a name="requestAccessToken"></a>
# **requestAccessToken**
> AccessTokenResponse requestAccessToken()

Generate an access token for user authentication

This is the access token generation call for authorizing subsequent financial transactions. A valid access token is required for web client requests. 

### Example
```java
MerchantCredentials creds = MerchantCredentials.of("apiSecret", "apiKey");
AuthenticationApiClient client = AuthenticationApiClient.create(creds)

try {
    AccessTokenResponse result = client.requestAccessToken();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception while calling AuthenticationApiClient#requestAccessToken");
    e.printStackTrace();
}
```

### Return type

[**AccessTokenResponse**](AccessTokenResponse.md)

