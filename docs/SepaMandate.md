
# SepaMandate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**reference** | **String** | Existing mandate reference managed by a merchant. Also known as the Mandate ID. |  [optional]
**url** | **String** | Valid URL pointing to the SEPA mandate (PDF / HTML format recommended) |  [optional]
**signatureDate** | [**LocalDate**](LocalDate.md) | Date of mandate signature |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | Sequence type of the mandate, defaults to &#39;SINGLE&#39; if not provided. |  [optional]


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
SINGLE | &quot;SINGLE&quot;
FIRST_COLLECTION | &quot;FIRST_COLLECTION&quot;
RECURRING_COLLECTION | &quot;RECURRING_COLLECTION&quot;
FINAL_COLLECTION | &quot;FINAL_COLLECTION&quot;



