
# Payment

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**paymentType** | [**PaymentTypeEnum**](#PaymentTypeEnum) | Defines the type of the payment. | 
**method** | [**Method**](Method.md) |  | 
**pinPresent** | **Boolean** | Indicates if the cards Personal Identification Number was supplied. | 
**entryMethod** | [**EntryMethodEnum**](#EntryMethodEnum) | The method in which the card information entered the system. | 
**issuerResponse** | [**IssuerResponse**](IssuerResponse.md) |  |  [optional]
**issuerApprovedAmount** | **String** | The actual approved amount. This field should be filled in when the message has already passed through the issuer (e.g. post-authorization). For transaction/authorization this amount refers to the amount that was locked on the card-holders account. |  [optional]
**issuerCardBalance** | **String** | The payment methods account balance if available. This field should be filled in when the message has already passed through the issuer (e.g. post-authorization). |  [optional]
**verificationAvs** | [**VerificationAvs**](VerificationAvs.md) |  |  [optional]
**verification3ds** | [**Verification3ds**](Verification3ds.md) |  |  [optional]
**verificationCvv** | [**VerificationCvv**](VerificationCvv.md) |  |  [optional]
**userDefined** | [**Object**](.md) | A JSON object that carries any additional information that might be helpful for fraud detection. |  [optional]


<a name="PaymentTypeEnum"></a>
## Enum: PaymentTypeEnum
Name | Value
---- | -----
CARD | &quot;payment/card&quot;
WALLET | &quot;payment/wallet&quot;


<a name="EntryMethodEnum"></a>
## Enum: EntryMethodEnum
Name | Value
---- | -----
MANUAL | &quot;manual&quot;
STRIPE | &quot;stripe&quot;
OCR | &quot;ocr&quot;
EMV | &quot;emv&quot;
NFC | &quot;nfc&quot;
REMOTE | &quot;remote&quot;
PIN_PRESENT | &quot;pin_present&quot;



