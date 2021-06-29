

# AdditionalDetails

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**comments** | **String** | Comments for the payment. |  [optional]
**invoiceNumber** | **String** | Invoice number. |  [optional]
**purchaseOrderNumber** | **String** | Purchase order number. |  [optional]
**operatorId** | **String** | The operator ID. |  [optional]
**salesSystemId** | **String** | The sales system ID. |  [optional]
**ipgDeferredAuth** | **Boolean** | Indicates if the particular transaction is a deferred authorization. |  [optional]
**highRiskPurchaseIndicator** | **Boolean** | this is highRiskPurchaseIndicator. |  [optional]
**receipts** | [**List&lt;ReceiptRequestInfo&gt;**](ReceiptRequestInfo.md) | Provides request information that is necessary to generate receipts. |  [optional]
**scaExemptionType** | [**ScaExemptionTypeEnum**](#ScaExemptionTypeEnum) | Strong customer authentication exemption type indicator. |  [optional]
**scaVisaMerchantID** | **String** | Eight-character Visa merchant identifier (VMID) assigned by Visa, required for trusted merchant and delegated authentication. |  [optional]
**businessApplicationIdentifier** | [**BusinessApplicationIdentifierEnum**](#BusinessApplicationIdentifierEnum) | Indicates the indended use of the Account Funding Transaction. For Visa Only. |  [optional]



## Enum: ScaExemptionTypeEnum

Name | Value
---- | -----
LOW_VALUE_EXEMPTION | &quot;Low Value Exemption&quot;
TRA_EXEMPTION | &quot;TRA Exemption&quot;
TRUSTED_MERCHANT_EXEMPTION | &quot;Trusted Merchant Exemption&quot;
SCP_EXEMPTION | &quot;SCP Exemption&quot;
DELEGATED_AUTHENTICATION | &quot;Delegated Authentication&quot;



## Enum: BusinessApplicationIdentifierEnum

Name | Value
---- | -----
BANK_INITIATED_TRANSFER | &quot;BANK_INITIATED_TRANSFER&quot;
WALLET_TRANSFER | &quot;WALLET_TRANSFER&quot;
ACCOUNT_TO_ACCOUNT | &quot;ACCOUNT_TO_ACCOUNT&quot;
TOP_OFF | &quot;TOP_OFF&quot;
FUND_TRANSFER | &quot;FUND_TRANSFER&quot;
ZERO_DOLLAR_AUTHORIZATION | &quot;ZERO_DOLLAR_AUTHORIZATION&quot;



