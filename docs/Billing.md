
# Billing

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Billing name |  [optional]
**customerId** | **String** | Customer ID for billing purpose |  [optional]
**personalNumber** | **String** | Personal number for the customer |  [optional]
**birthDate** | [**LocalDate**](LocalDate.md) | Customer birth date |  [optional]
**gender** | [**GenderEnum**](#GenderEnum) | Customer gender |  [optional]
**contact** | [**Contact**](Contact.md) |  |  [optional]
**address** | [**Address**](Address.md) |  |  [optional]


<a name="GenderEnum"></a>
## Enum: GenderEnum
Name | Value
---- | -----
MALE | &quot;MALE&quot;
FEMALE | &quot;FEMALE&quot;
UNKNOWN | &quot;UNKNOWN&quot;



