

# SepaMandate

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**reference** | **String** | Existing mandate reference, managed by merchant. Must match [A-Za-z0-9:?/+(),. -]{1,35} and not start with two slashes (\&quot;//\&quot;). Also known as the mandate ID. | 
**url** | **String** | Valid URL pointing to the SEPA mandate (PDF / HTML format recommended). When your store is enabled for SEPA Direct Debit as part of the Local Payments offering, this field allows you to transmit a valid URL of SEPA Direct Debit mandate to enable the Risk and Compliance department to access the details. Please note that it is mandatory to submit a mandateReference and a mandateDate together with a mandateUrl in case you manage SEPA Direct Debit mandates on your side in the combination with the Local Payments offering. |  [optional]
**signatureDate** | [**LocalDate**](LocalDate.md) | Date of mandate signature. | 
**type** | [**TypeEnum**](#TypeEnum) | Sequence type of the direct debit. This defaults to &#39;SINGLE&#39; if not provided. | 



## Enum: TypeEnum

Name | Value
---- | -----
SINGLE | &quot;SINGLE&quot;
FIRST_COLLECTION | &quot;FIRST_COLLECTION&quot;
RECURRING_COLLECTION | &quot;RECURRING_COLLECTION&quot;
FINAL_COLLECTION | &quot;FINAL_COLLECTION&quot;



