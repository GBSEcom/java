
# Airline

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**passengerName** | **String** | The passenger name associated with the transaction. |  [optional]
**ticketNumber** | **String** | The airline ticket number associated with the transaction. |  [optional]
**issuingCarrier** | **String** | The carrier that issued the ticket. |  [optional]
**carrierName** | **String** | The carrier associated with the transaction. |  [optional]
**travelAgencyIataCode** | **String** | The IATA code associated with the travel agency. |  [optional]
**travelAgencyName** | **String** | The business name of the travel agency. |  [optional]
**airlinePlanNumber** | **String** | The airline plan number associated with the transaction. |  [optional]
**airlineInvoiceNumber** | **String** | The invoice number used by the airline. |  [optional]
**reservationSystem** | [**ReservationSystemEnum**](#ReservationSystemEnum) | The reservation system used to create the ticket. |  [optional]
**restricted** | **Boolean** | If the transaction is associated with a restricted class fare. |  [optional]
**travelRoute** | [**List&lt;AirlineTravelRoute&gt;**](AirlineTravelRoute.md) | Array containing up to 4 items that describe the route associated with the transaction. |  [optional]
**relatedTicketNumber** | **String** | The number of any other tickets associated with the transaction ticket. |  [optional]
**ancillaryServiceCategory** | [**List&lt;AirlineAncillaryServiceCategory&gt;**](AirlineAncillaryServiceCategory.md) | Identify the purchase of ancillary goods or services with a false value. If this element is not provided, the transaction is assumed to be a purchase of an airline ticket. |  [optional]
**ticketPurchase** | **Boolean** | Identifies if the transaction is a ticket purchase. |  [optional]


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



