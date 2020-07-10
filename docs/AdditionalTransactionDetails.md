
# AdditionalTransactionDetails

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**comments** | **String** | Comment for the payment. |  [optional]
**invoiceNumber** | **String** | Invoice number. |  [optional]
**purchaseOrderNumber** | **String** | Purchase order number. |  [optional]
**disbursementTransType** | [**DisbursementTransTypeEnum**](#DisbursementTransTypeEnum) | The type of debit disbursement transaction. |  [optional]
**walletProvider** | [**WalletProviderEnum**](#WalletProviderEnum) | The wallet provider type. |  [optional]


<a name="DisbursementTransTypeEnum"></a>
## Enum: DisbursementTransTypeEnum
Name | Value
---- | -----
FUNDING | &quot;FUNDING&quot;
DISBURSEMENT | &quot;DISBURSEMENT&quot;


<a name="WalletProviderEnum"></a>
## Enum: WalletProviderEnum
Name | Value
---- | -----
GOOGLE_PAY | &quot;GOOGLE_PAY&quot;
APPLE_PAY | &quot;APPLE_PAY&quot;
SAMSUNG_PAY | &quot;SAMSUNG_PAY&quot;
MASTERPASS | &quot;MASTERPASS&quot;



