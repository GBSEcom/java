
# SepaMandate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**reference** | **String** | Existing mandate reference, managed by merchant. Must match [A-Za-z0-9:?/+(),. -]{1,35} and not start with two slashes (“//”). Also known as the Mandate ID | 
**url** | **String** | Valid URL pointing to the SEPA mandate (PDF / HTML format recommended) | 
**signatureDate** | [**LocalDate**](LocalDate.md) | Date of mandate signature. | 
**type** | [**TypeEnum**](#TypeEnum) | Sequence type of the direct debit. This defaults to &#39;SINGLE&#39; if not provided. | 


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
SINGLE | &quot;SINGLE&quot;
FIRST_COLLECTION | &quot;FIRST_COLLECTION&quot;
RECURRING_COLLECTION | &quot;RECURRING_COLLECTION&quot;
FINAL_COLLECTION | &quot;FINAL_COLLECTION&quot;



