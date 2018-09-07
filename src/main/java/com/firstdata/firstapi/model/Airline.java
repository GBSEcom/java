/*
 * Payment Gateway API Specification
 * Payment Gateway API for payment processing. 
 *
 * OpenAPI spec version: 0.0.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.firstdata.firstapi.model;

import java.util.Objects;
import com.firstdata.firstapi.model.AirlineAncillaryServiceCategory;
import com.firstdata.firstapi.model.AirlineTravelRoute;
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
 * Additional data specific to the airline industry
 */
@ApiModel(description = "Additional data specific to the airline industry")

public class Airline {
  @SerializedName("passengerName")
  private String passengerName = null;

  @SerializedName("ticketNumber")
  private String ticketNumber = null;

  @SerializedName("issuingCarrier")
  private String issuingCarrier = null;

  @SerializedName("carrierName")
  private String carrierName = null;

  @SerializedName("travelAgencyIataCode")
  private String travelAgencyIataCode = null;

  @SerializedName("travelAgencyName")
  private String travelAgencyName = null;

  @SerializedName("airlinePlanNumber")
  private String airlinePlanNumber = null;

  @SerializedName("airlineInvoiceNumber")
  private String airlineInvoiceNumber = null;

  /**
   * Gets or Sets reservationSystem
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

    public static ReservationSystemEnum fromValue(String text) {
      for (ReservationSystemEnum b : ReservationSystemEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ReservationSystemEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ReservationSystemEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ReservationSystemEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ReservationSystemEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("reservationSystem")
  private ReservationSystemEnum reservationSystem = null;

  @SerializedName("restricted")
  private Boolean restricted = null;

  @SerializedName("travelRoute")
  private List<AirlineTravelRoute> travelRoute = null;

  @SerializedName("relatedTicketNumber")
  private String relatedTicketNumber = null;

  @SerializedName("ancillaryServiceCategory")
  private List<AirlineAncillaryServiceCategory> ancillaryServiceCategory = null;

  @SerializedName("ticketPurchase")
  private Boolean ticketPurchase = null;

  public Airline passengerName(String passengerName) {
    this.passengerName = passengerName;
    return this;
  }

   /**
   * Get passengerName
   * @return passengerName
  **/
  @ApiModelProperty(value = "")
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
   * Get ticketNumber
   * @return ticketNumber
  **/
  @ApiModelProperty(value = "")
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
   * Get issuingCarrier
   * @return issuingCarrier
  **/
  @ApiModelProperty(value = "")
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
   * Get carrierName
   * @return carrierName
  **/
  @ApiModelProperty(value = "")
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
   * Get travelAgencyIataCode
   * @return travelAgencyIataCode
  **/
  @ApiModelProperty(value = "")
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
   * Get travelAgencyName
   * @return travelAgencyName
  **/
  @ApiModelProperty(value = "")
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
   * Get airlinePlanNumber
   * @return airlinePlanNumber
  **/
  @ApiModelProperty(value = "")
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
   * Get airlineInvoiceNumber
   * @return airlineInvoiceNumber
  **/
  @ApiModelProperty(value = "")
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
   * Get reservationSystem
   * @return reservationSystem
  **/
  @ApiModelProperty(value = "")
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
   * Get restricted
   * @return restricted
  **/
  @ApiModelProperty(value = "")
  public Boolean isRestricted() {
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
   * Get travelRoute
   * @return travelRoute
  **/
  @ApiModelProperty(value = "")
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
   * Get relatedTicketNumber
   * @return relatedTicketNumber
  **/
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(value = "Identify the purchase of ancillary goods or services with a false value. If this element is not provided, the transaction is assumed to be a purchase of an airline ticket.")
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
   * Get ticketPurchase
   * @return ticketPurchase
  **/
  @ApiModelProperty(value = "")
  public Boolean isTicketPurchase() {
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
