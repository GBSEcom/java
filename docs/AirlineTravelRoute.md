

# AirlineTravelRoute

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**departureDate** | [**LocalDate**](LocalDate.md) | Date of departure. |  [optional]
**origin** | **String** | The IATA code for the departure airport. |  [optional]
**destination** | **String** | The IATA code for the destination. airport. |  [optional]
**carrierCode** | **String** | The IATA code for the carrier. |  [optional]
**serviceClass** | **String** | The airline code for the service class of the ticket. |  [optional]
**stopoverType** | [**StopoverTypeEnum**](#StopoverTypeEnum) | Indicates whether the route is direct. |  [optional]
**fareBasisCode** | **String** | The airline fare basis code. |  [optional]
**departureTax** | [**BigDecimal**](BigDecimal.md) | Fee charged by a country when a person leaves the country. |  [optional]
**flightNumber** | **String** | The airline flight number associated with the ticket. |  [optional]



## Enum: StopoverTypeEnum

Name | Value
---- | -----
DIRECT | &quot;DIRECT&quot;
STOPOVER | &quot;STOPOVER&quot;



