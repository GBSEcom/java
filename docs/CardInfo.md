
# CardInfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**brand** | **String** | The card brand. |  [optional]
**brandProductId** | **String** | The product ID of the brand. |  [optional]
**cardFunction** | [**CardFunctionEnum**](#CardFunctionEnum) | The functions of the card. Possible values are credit, debit, prepaid, voucher and undefined. |  [optional]
**commercialCard** | [**CommercialCardEnum**](#CommercialCardEnum) | Indicates whether it is a corporate or non corporate card |  [optional]
**issuerCountry** | **String** | The country of the issuer. |  [optional]
**issuerName** | **String** | The name of the issuer. |  [optional]


<a name="CardFunctionEnum"></a>
## Enum: CardFunctionEnum
Name | Value
---- | -----
CREDIT | &quot;credit&quot;
DEBIT | &quot;debit&quot;
PREPAID | &quot;prepaid&quot;
VOUCHER | &quot;voucher&quot;
UNDEFINED | &quot;undefined&quot;


<a name="CommercialCardEnum"></a>
## Enum: CommercialCardEnum
Name | Value
---- | -----
CORPORATE | &quot;CORPORATE&quot;
NON_CORPORATE | &quot;NON_CORPORATE&quot;



