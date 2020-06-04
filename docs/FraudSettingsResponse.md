

# FraudSettingsResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**clientRequestId** | **String** | Echoes back the value in the request header for tracking. |  [optional]
**apiTraceId** | **String** | Request identifier in API, can be used to request logs from the support team. |  [optional]
**responseType** | [**ResponseType**](ResponseType.md) |  |  [optional]
**storeId** | **String** | The outlet ID. |  [optional]
**blockedCardNumbers** | [**List&lt;BlockedCardNumber&gt;**](BlockedCardNumber.md) | List of blocked card numbers. |  [optional]
**blockedNames** | **List&lt;String&gt;** | List of blocked fraud names. |  [optional]
**blockedDomainNames** | **List&lt;String&gt;** | List of blocked fraud domain names. |  [optional]
**blockedIpOrClassCAddresses** | **List&lt;String&gt;** | List of blocked fraud IP address/Class C. |  [optional]
**maximumPurchaseAmount** | [**List&lt;MaximumPurchaseAmount&gt;**](MaximumPurchaseAmount.md) | Maximum purchase amount limit. |  [optional]
**lockoutTime** | [**LockoutTime**](LockoutTime.md) |  |  [optional]
**countryProfile** | **String** | Country profile. |  [optional]



