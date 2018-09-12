
# AirlineTravelRoute

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**departureDate** | [**LocalDate**](LocalDate.md) | Date of departure |  [optional]
**origin** | **String** |  |  [optional]
**destination** | **String** |  |  [optional]
**carrierCode** | **String** |  |  [optional]
**serviceClass** | **String** |  |  [optional]
**stopoverType** | [**StopoverTypeEnum**](#StopoverTypeEnum) |  |  [optional]
**fareBasisCode** | **String** |  |  [optional]
**departureTax** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**flightNumber** | **String** |  |  [optional]


<a name="StopoverTypeEnum"></a>
## Enum: StopoverTypeEnum
Name | Value
---- | -----
DIRECT | &quot;DIRECT&quot;
STOPOVER | &quot;STOPOVER&quot;



