/*
 * Payment Gateway API Specification.
 * The documentation here is designed to provide all of the technical guidance required to consume and integrate with our APIs for payment processing. To learn more about our APIs please visit https://docs.firstdata.com/org/gateway.
 *
 * The version of the OpenAPI document: 21.5.0.20211029.001
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.github.GBSEcom.model;

import java.util.Objects;
import java.util.Arrays;
import com.github.GBSEcom.model.AirlineAncillaryServiceCategory;
import com.github.GBSEcom.model.AirlineTravelRoute;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Additional data specific to the airline industry.
 */
@ApiModel(description = "Additional data specific to the airline industry.")

public class Airline {
  public static final String SERIALIZED_NAME_PASSENGER_NAME = "passengerName";
  @SerializedName(SERIALIZED_NAME_PASSENGER_NAME)
  private String passengerName;

  public static final String SERIALIZED_NAME_TICKET_NUMBER = "ticketNumber";
  @SerializedName(SERIALIZED_NAME_TICKET_NUMBER)
  private String ticketNumber;

  public static final String SERIALIZED_NAME_ISSUING_CARRIER = "issuingCarrier";
  @SerializedName(SERIALIZED_NAME_ISSUING_CARRIER)
  private String issuingCarrier;

  public static final String SERIALIZED_NAME_CARRIER_NAME = "carrierName";
  @SerializedName(SERIALIZED_NAME_CARRIER_NAME)
  private String carrierName;

  public static final String SERIALIZED_NAME_TRAVEL_AGENCY_IATA_CODE = "travelAgencyIataCode";
  @SerializedName(SERIALIZED_NAME_TRAVEL_AGENCY_IATA_CODE)
  private String travelAgencyIataCode;

  public static final String SERIALIZED_NAME_TRAVEL_AGENCY_NAME = "travelAgencyName";
  @SerializedName(SERIALIZED_NAME_TRAVEL_AGENCY_NAME)
  private String travelAgencyName;

  public static final String SERIALIZED_NAME_AIRLINE_PLAN_NUMBER = "airlinePlanNumber";
  @SerializedName(SERIALIZED_NAME_AIRLINE_PLAN_NUMBER)
  private String airlinePlanNumber;

  public static final String SERIALIZED_NAME_AIRLINE_INVOICE_NUMBER = "airlineInvoiceNumber";
  @SerializedName(SERIALIZED_NAME_AIRLINE_INVOICE_NUMBER)
  private String airlineInvoiceNumber;

  /**
   * The reservation system used to create the ticket.
   */
  @JsonAdapter(ReservationSystemEnum.Adapter.class)
  public enum ReservationSystemEnum {
    START("START"),
    
    TWA("TWA"),
    
    DELTA("DELTA"),
    
    SABRE("SABRE"),
    
    COVIA_APOLLO("COVIA_APOLLO"),
    
    DR_BLANK("DR_BLANK"),
    
    DER("DER"),
    
    TUI("TUI");

    private String value;

    ReservationSystemEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ReservationSystemEnum fromValue(String value) {
      for (ReservationSystemEnum b : ReservationSystemEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ReservationSystemEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ReservationSystemEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ReservationSystemEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ReservationSystemEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_RESERVATION_SYSTEM = "reservationSystem";
  @SerializedName(SERIALIZED_NAME_RESERVATION_SYSTEM)
  private ReservationSystemEnum reservationSystem;

  public static final String SERIALIZED_NAME_RESTRICTED = "restricted";
  @SerializedName(SERIALIZED_NAME_RESTRICTED)
  private Boolean restricted;

  public static final String SERIALIZED_NAME_TRAVEL_ROUTE = "travelRoute";
  @SerializedName(SERIALIZED_NAME_TRAVEL_ROUTE)
  private List<AirlineTravelRoute> travelRoute = null;

  public static final String SERIALIZED_NAME_RELATED_TICKET_NUMBER = "relatedTicketNumber";
  @SerializedName(SERIALIZED_NAME_RELATED_TICKET_NUMBER)
  private String relatedTicketNumber;

  public static final String SERIALIZED_NAME_ANCILLARY_SERVICE_CATEGORY = "ancillaryServiceCategory";
  @SerializedName(SERIALIZED_NAME_ANCILLARY_SERVICE_CATEGORY)
  private List<AirlineAncillaryServiceCategory> ancillaryServiceCategory = null;

  public static final String SERIALIZED_NAME_TICKET_PURCHASE = "ticketPurchase";
  @SerializedName(SERIALIZED_NAME_TICKET_PURCHASE)
  private Boolean ticketPurchase;


  public Airline passengerName(String passengerName) {
    
    this.passengerName = passengerName;
    return this;
  }

   /**
   * The passenger name associated with the transaction.
   * @return passengerName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Jeff Yabuki", value = "The passenger name associated with the transaction.")

  public String getPassengerName() {
    return passengerName;
  }



  public void setPassengerName(String passengerName) {
    this.passengerName = passengerName;
  }


  public Airline ticketNumber(String ticketNumber) {
    
    this.ticketNumber = ticketNumber;
    return this;
  }

   /**
   * The airline ticket number associated with the transaction.
   * @return ticketNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "52300448", value = "The airline ticket number associated with the transaction.")

  public String getTicketNumber() {
    return ticketNumber;
  }



  public void setTicketNumber(String ticketNumber) {
    this.ticketNumber = ticketNumber;
  }


  public Airline issuingCarrier(String issuingCarrier) {
    
    this.issuingCarrier = issuingCarrier;
    return this;
  }

   /**
   * The carrier that issued the ticket.
   * @return issuingCarrier
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Frontier Airlines", value = "The carrier that issued the ticket.")

  public String getIssuingCarrier() {
    return issuingCarrier;
  }



  public void setIssuingCarrier(String issuingCarrier) {
    this.issuingCarrier = issuingCarrier;
  }


  public Airline carrierName(String carrierName) {
    
    this.carrierName = carrierName;
    return this;
  }

   /**
   * The carrier associated with the transaction.
   * @return carrierName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Delta Air Lines", value = "The carrier associated with the transaction.")

  public String getCarrierName() {
    return carrierName;
  }



  public void setCarrierName(String carrierName) {
    this.carrierName = carrierName;
  }


  public Airline travelAgencyIataCode(String travelAgencyIataCode) {
    
    this.travelAgencyIataCode = travelAgencyIataCode;
    return this;
  }

   /**
   * The IATA code associated with the travel agency.
   * @return travelAgencyIataCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10584410", value = "The IATA code associated with the travel agency.")

  public String getTravelAgencyIataCode() {
    return travelAgencyIataCode;
  }



  public void setTravelAgencyIataCode(String travelAgencyIataCode) {
    this.travelAgencyIataCode = travelAgencyIataCode;
  }


  public Airline travelAgencyName(String travelAgencyName) {
    
    this.travelAgencyName = travelAgencyName;
    return this;
  }

   /**
   * The business name of the travel agency.
   * @return travelAgencyName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "A Travis Gent LLC", value = "The business name of the travel agency.")

  public String getTravelAgencyName() {
    return travelAgencyName;
  }



  public void setTravelAgencyName(String travelAgencyName) {
    this.travelAgencyName = travelAgencyName;
  }


  public Airline airlinePlanNumber(String airlinePlanNumber) {
    
    this.airlinePlanNumber = airlinePlanNumber;
    return this;
  }

   /**
   * The airline plan number associated with the transaction.
   * @return airlinePlanNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "11", value = "The airline plan number associated with the transaction.")

  public String getAirlinePlanNumber() {
    return airlinePlanNumber;
  }



  public void setAirlinePlanNumber(String airlinePlanNumber) {
    this.airlinePlanNumber = airlinePlanNumber;
  }


  public Airline airlineInvoiceNumber(String airlineInvoiceNumber) {
    
    this.airlineInvoiceNumber = airlineInvoiceNumber;
    return this;
  }

   /**
   * The invoice number used by the airline.
   * @return airlineInvoiceNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "664422", value = "The invoice number used by the airline.")

  public String getAirlineInvoiceNumber() {
    return airlineInvoiceNumber;
  }



  public void setAirlineInvoiceNumber(String airlineInvoiceNumber) {
    this.airlineInvoiceNumber = airlineInvoiceNumber;
  }


  public Airline reservationSystem(ReservationSystemEnum reservationSystem) {
    
    this.reservationSystem = reservationSystem;
    return this;
  }

   /**
   * The reservation system used to create the ticket.
   * @return reservationSystem
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "DELTA", value = "The reservation system used to create the ticket.")

  public ReservationSystemEnum getReservationSystem() {
    return reservationSystem;
  }



  public void setReservationSystem(ReservationSystemEnum reservationSystem) {
    this.reservationSystem = reservationSystem;
  }


  public Airline restricted(Boolean restricted) {
    
    this.restricted = restricted;
    return this;
  }

   /**
   * If the transaction is associated with a restricted class fare.
   * @return restricted
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "If the transaction is associated with a restricted class fare.")

  public Boolean getRestricted() {
    return restricted;
  }



  public void setRestricted(Boolean restricted) {
    this.restricted = restricted;
  }


  public Airline travelRoute(List<AirlineTravelRoute> travelRoute) {
    
    this.travelRoute = travelRoute;
    return this;
  }

  public Airline addTravelRouteItem(AirlineTravelRoute travelRouteItem) {
    if (this.travelRoute == null) {
      this.travelRoute = new ArrayList<>();
    }
    this.travelRoute.add(travelRouteItem);
    return this;
  }

   /**
   * Array containing up to 4 items that describe the route associated with the transaction.
   * @return travelRoute
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[{\"departureDate\":\"2018-01-28\",\"origin\":\"MIA\",\"destination\":\"ATL\",\"carrierCode\":\"DL\",\"serviceClass\":\"J\",\"stopoverType\":\"DIRECT\",\"fareBasisCode\":\"F\",\"departureTax\":75,\"flightNumber\":\"765599\"}]", value = "Array containing up to 4 items that describe the route associated with the transaction.")

  public List<AirlineTravelRoute> getTravelRoute() {
    return travelRoute;
  }



  public void setTravelRoute(List<AirlineTravelRoute> travelRoute) {
    this.travelRoute = travelRoute;
  }


  public Airline relatedTicketNumber(String relatedTicketNumber) {
    
    this.relatedTicketNumber = relatedTicketNumber;
    return this;
  }

   /**
   * The number of any other tickets associated with the transaction ticket.
   * @return relatedTicketNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "11223344556", value = "The number of any other tickets associated with the transaction ticket.")

  public String getRelatedTicketNumber() {
    return relatedTicketNumber;
  }



  public void setRelatedTicketNumber(String relatedTicketNumber) {
    this.relatedTicketNumber = relatedTicketNumber;
  }


  public Airline ancillaryServiceCategory(List<AirlineAncillaryServiceCategory> ancillaryServiceCategory) {
    
    this.ancillaryServiceCategory = ancillaryServiceCategory;
    return this;
  }

  public Airline addAncillaryServiceCategoryItem(AirlineAncillaryServiceCategory ancillaryServiceCategoryItem) {
    if (this.ancillaryServiceCategory == null) {
      this.ancillaryServiceCategory = new ArrayList<>();
    }
    this.ancillaryServiceCategory.add(ancillaryServiceCategoryItem);
    return this;
  }

   /**
   * Identify the purchase of ancillary goods or services with a false value. If this element is not provided, the transaction is assumed to be a purchase of an airline ticket.
   * @return ancillaryServiceCategory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[{\"serviceCategory\":\"BAGGAGE_FEE\"},{\"serviceCategory\":\"CARBON_OFFSET\"}]", value = "Identify the purchase of ancillary goods or services with a false value. If this element is not provided, the transaction is assumed to be a purchase of an airline ticket.")

  public List<AirlineAncillaryServiceCategory> getAncillaryServiceCategory() {
    return ancillaryServiceCategory;
  }



  public void setAncillaryServiceCategory(List<AirlineAncillaryServiceCategory> ancillaryServiceCategory) {
    this.ancillaryServiceCategory = ancillaryServiceCategory;
  }


  public Airline ticketPurchase(Boolean ticketPurchase) {
    
    this.ticketPurchase = ticketPurchase;
    return this;
  }

   /**
   * Identifies if the transaction is a ticket purchase.
   * @return ticketPurchase
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Identifies if the transaction is a ticket purchase.")

  public Boolean getTicketPurchase() {
    return ticketPurchase;
  }



  public void setTicketPurchase(Boolean ticketPurchase) {
    this.ticketPurchase = ticketPurchase;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Airline airline = (Airline) o;
    return Objects.equals(this.passengerName, airline.passengerName) &&
        Objects.equals(this.ticketNumber, airline.ticketNumber) &&
        Objects.equals(this.issuingCarrier, airline.issuingCarrier) &&
        Objects.equals(this.carrierName, airline.carrierName) &&
        Objects.equals(this.travelAgencyIataCode, airline.travelAgencyIataCode) &&
        Objects.equals(this.travelAgencyName, airline.travelAgencyName) &&
        Objects.equals(this.airlinePlanNumber, airline.airlinePlanNumber) &&
        Objects.equals(this.airlineInvoiceNumber, airline.airlineInvoiceNumber) &&
        Objects.equals(this.reservationSystem, airline.reservationSystem) &&
        Objects.equals(this.restricted, airline.restricted) &&
        Objects.equals(this.travelRoute, airline.travelRoute) &&
        Objects.equals(this.relatedTicketNumber, airline.relatedTicketNumber) &&
        Objects.equals(this.ancillaryServiceCategory, airline.ancillaryServiceCategory) &&
        Objects.equals(this.ticketPurchase, airline.ticketPurchase);
  }

  @Override
  public int hashCode() {
    return Objects.hash(passengerName, ticketNumber, issuingCarrier, carrierName, travelAgencyIataCode, travelAgencyName, airlinePlanNumber, airlineInvoiceNumber, reservationSystem, restricted, travelRoute, relatedTicketNumber, ancillaryServiceCategory, ticketPurchase);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Airline {\n");
    sb.append("    passengerName: ").append(toIndentedString(passengerName)).append("\n");
    sb.append("    ticketNumber: ").append(toIndentedString(ticketNumber)).append("\n");
    sb.append("    issuingCarrier: ").append(toIndentedString(issuingCarrier)).append("\n");
    sb.append("    carrierName: ").append(toIndentedString(carrierName)).append("\n");
    sb.append("    travelAgencyIataCode: ").append(toIndentedString(travelAgencyIataCode)).append("\n");
    sb.append("    travelAgencyName: ").append(toIndentedString(travelAgencyName)).append("\n");
    sb.append("    airlinePlanNumber: ").append(toIndentedString(airlinePlanNumber)).append("\n");
    sb.append("    airlineInvoiceNumber: ").append(toIndentedString(airlineInvoiceNumber)).append("\n");
    sb.append("    reservationSystem: ").append(toIndentedString(reservationSystem)).append("\n");
    sb.append("    restricted: ").append(toIndentedString(restricted)).append("\n");
    sb.append("    travelRoute: ").append(toIndentedString(travelRoute)).append("\n");
    sb.append("    relatedTicketNumber: ").append(toIndentedString(relatedTicketNumber)).append("\n");
    sb.append("    ancillaryServiceCategory: ").append(toIndentedString(ancillaryServiceCategory)).append("\n");
    sb.append("    ticketPurchase: ").append(toIndentedString(ticketPurchase)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

