

# PaymentUrlRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**storeId** | **String** | An optional Outlet ID for clients that support multiple stores in the same developer app. |  [optional]
**clientLocale** | [**ClientLocale**](ClientLocale.md) |  |  [optional]
**transactionAmount** | [**Amount**](Amount.md) |  | 
**transactionType** | [**TransactionType**](TransactionType.md) |  | 
**orderId** | **String** | Note - Client Order ID if supplied by client. If not supplied by client, IPG will generate. The first 12 alphanumeric digits are passed down to Fiserv Enterprise reporting tool, Clientline and Data File Manager (DFM). |  [optional]
**billing** | [**Billing**](Billing.md) |  |  [optional]
**shipping** | [**Shipping**](Shipping.md) |  |  [optional]
**transactionNotificationURL** | **String** | URL for notifying merchant of payment result. |  [optional]
**expiration** | **Long** | Time until payment URL expires. |  [optional]
**authenticateTransaction** | **Boolean** | If 3D secure should be applied. |  [optional]
**dynamicMerchantName** | **String** | Dynamic merchant name for the cardholder&#39;s statement. |  [optional]
**invoiceNumber** | **String** | Invoice number. |  [optional]
**purchaseOrderNumber** | **String** | Purchase order number. |  [optional]
**hostedPaymentPageText** | **String** | The text to be displayed to the payer on the hosted payment page. |  [optional]
**ip** | **String** | IPv4 or IPv6 network address. |  [optional]
**revolvingOptions** | [**RevolvingOptions**](RevolvingOptions.md) |  |  [optional]
**installmentOptions** | [**InstallmentOptions**](InstallmentOptions.md) |  |  [optional]
**basket** | [**Basket**](Basket.md) |  |  [optional]



