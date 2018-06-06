
# Airline

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**passengerName** | **String** |  |  [optional]
**ticketNumber** | **String** |  |  [optional]
**issuingCarrier** | **String** |  |  [optional]
**carrierName** | **String** |  |  [optional]
**travelAgencyIataCode** | **String** |  |  [optional]
**travelAgencyName** | **String** |  |  [optional]
**airlinePlanNumber** | **String** |  |  [optional]
**airlineInvoiceNumber** | **String** |  |  [optional]
**reservationSystem** | [**ReservationSystemEnum**](#ReservationSystemEnum) |  |  [optional]
**restricted** | **Boolean** |  |  [optional]
**travelRoute** | [**List&lt;AirlineTravelRoute&gt;**](AirlineTravelRoute.md) |  |  [optional]
**relatedTicketNumber** | **String** |  |  [optional]
**ancillaryServiceCategory** | [**List&lt;AirlineAncillaryServiceCategory&gt;**](AirlineAncillaryServiceCategory.md) | Identify purchase of ancillary goods or services with false value. If the element is not given, the transaction is assumed to be a purchase of airline ticket. |  [optional]
**ticketPurchase** | **Boolean** |  |  [optional]


<a name="ReservationSystemEnum"></a>
## Enum: ReservationSystemEnum
Name | Value
---- | -----
START | &quot;START&quot;
TWA | &quot;TWA&quot;
DELTA | &quot;DELTA&quot;
SABRE | &quot;SABRE&quot;
COVIA_APOLLO | &quot;COVIA_APOLLO&quot;
DR_BLANK | &quot;DR_BLANK&quot;
DER | &quot;DER&quot;
TUI | &quot;TUI&quot;



