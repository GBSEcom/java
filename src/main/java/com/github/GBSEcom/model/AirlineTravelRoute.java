/*
 * Payment Gateway API Specification.
 * The documentation here is designed to provide all of the technical guidance required to consume and integrate with our APIs for payment processing. To learn more about our APIs please visit https://docs.firstdata.com/org/gateway.
 *
 * The version of the OpenAPI document: 21.3.0.20210608.001
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.github.GBSEcom.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * Additional information about the route.
 */
@ApiModel(description = "Additional information about the route.")

public class AirlineTravelRoute {
  public static final String SERIALIZED_NAME_DEPARTURE_DATE = "departureDate";
  @SerializedName(SERIALIZED_NAME_DEPARTURE_DATE)
  private LocalDate departureDate;

  public static final String SERIALIZED_NAME_ORIGIN = "origin";
  @SerializedName(SERIALIZED_NAME_ORIGIN)
  private String origin;

  public static final String SERIALIZED_NAME_DESTINATION = "destination";
  @SerializedName(SERIALIZED_NAME_DESTINATION)
  private String destination;

  public static final String SERIALIZED_NAME_CARRIER_CODE = "carrierCode";
  @SerializedName(SERIALIZED_NAME_CARRIER_CODE)
  private String carrierCode;

  public static final String SERIALIZED_NAME_SERVICE_CLASS = "serviceClass";
  @SerializedName(SERIALIZED_NAME_SERVICE_CLASS)
  private String serviceClass;

  /**
   * Indicates whether the route is direct.
   */
  @JsonAdapter(StopoverTypeEnum.Adapter.class)
  public enum StopoverTypeEnum {
    DIRECT("DIRECT"),
    
    STOPOVER("STOPOVER");

    private String value;

    StopoverTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StopoverTypeEnum fromValue(String value) {
      for (StopoverTypeEnum b : StopoverTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StopoverTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StopoverTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StopoverTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StopoverTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STOPOVER_TYPE = "stopoverType";
  @SerializedName(SERIALIZED_NAME_STOPOVER_TYPE)
  private StopoverTypeEnum stopoverType;

  public static final String SERIALIZED_NAME_FARE_BASIS_CODE = "fareBasisCode";
  @SerializedName(SERIALIZED_NAME_FARE_BASIS_CODE)
  private String fareBasisCode;

  public static final String SERIALIZED_NAME_DEPARTURE_TAX = "departureTax";
  @SerializedName(SERIALIZED_NAME_DEPARTURE_TAX)
  private BigDecimal departureTax;

  public static final String SERIALIZED_NAME_FLIGHT_NUMBER = "flightNumber";
  @SerializedName(SERIALIZED_NAME_FLIGHT_NUMBER)
  private String flightNumber;


  public AirlineTravelRoute departureDate(LocalDate departureDate) {
    
    this.departureDate = departureDate;
    return this;
  }

   /**
   * Date of departure.
   * @return departureDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Sat Jan 27 19:00:00 EST 2018", value = "Date of departure.")

  public LocalDate getDepartureDate() {
    return departureDate;
  }



  public void setDepartureDate(LocalDate departureDate) {
    this.departureDate = departureDate;
  }


  public AirlineTravelRoute origin(String origin) {
    
    this.origin = origin;
    return this;
  }

   /**
   * The IATA code for the departure airport.
   * @return origin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "MIA", value = "The IATA code for the departure airport.")

  public String getOrigin() {
    return origin;
  }



  public void setOrigin(String origin) {
    this.origin = origin;
  }


  public AirlineTravelRoute destination(String destination) {
    
    this.destination = destination;
    return this;
  }

   /**
   * The IATA code for the destination. airport.
   * @return destination
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ATL", value = "The IATA code for the destination. airport.")

  public String getDestination() {
    return destination;
  }



  public void setDestination(String destination) {
    this.destination = destination;
  }


  public AirlineTravelRoute carrierCode(String carrierCode) {
    
    this.carrierCode = carrierCode;
    return this;
  }

   /**
   * The IATA code for the carrier.
   * @return carrierCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "DL", value = "The IATA code for the carrier.")

  public String getCarrierCode() {
    return carrierCode;
  }



  public void setCarrierCode(String carrierCode) {
    this.carrierCode = carrierCode;
  }


  public AirlineTravelRoute serviceClass(String serviceClass) {
    
    this.serviceClass = serviceClass;
    return this;
  }

   /**
   * The airline code for the service class of the ticket.
   * @return serviceClass
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "J", value = "The airline code for the service class of the ticket.")

  public String getServiceClass() {
    return serviceClass;
  }



  public void setServiceClass(String serviceClass) {
    this.serviceClass = serviceClass;
  }


  public AirlineTravelRoute stopoverType(StopoverTypeEnum stopoverType) {
    
    this.stopoverType = stopoverType;
    return this;
  }

   /**
   * Indicates whether the route is direct.
   * @return stopoverType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "DIRECT", value = "Indicates whether the route is direct.")

  public StopoverTypeEnum getStopoverType() {
    return stopoverType;
  }



  public void setStopoverType(StopoverTypeEnum stopoverType) {
    this.stopoverType = stopoverType;
  }


  public AirlineTravelRoute fareBasisCode(String fareBasisCode) {
    
    this.fareBasisCode = fareBasisCode;
    return this;
  }

   /**
   * The airline fare basis code.
   * @return fareBasisCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "F", value = "The airline fare basis code.")

  public String getFareBasisCode() {
    return fareBasisCode;
  }



  public void setFareBasisCode(String fareBasisCode) {
    this.fareBasisCode = fareBasisCode;
  }


  public AirlineTravelRoute departureTax(BigDecimal departureTax) {
    
    this.departureTax = departureTax;
    return this;
  }

   /**
   * Fee charged by a country when a person leaves the country.
   * maximum: 999999999999
   * @return departureTax
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "75", value = "Fee charged by a country when a person leaves the country.")

  public BigDecimal getDepartureTax() {
    return departureTax;
  }



  public void setDepartureTax(BigDecimal departureTax) {
    this.departureTax = departureTax;
  }


  public AirlineTravelRoute flightNumber(String flightNumber) {
    
    this.flightNumber = flightNumber;
    return this;
  }

   /**
   * The airline flight number associated with the ticket.
   * @return flightNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "765599", value = "The airline flight number associated with the ticket.")

  public String getFlightNumber() {
    return flightNumber;
  }



  public void setFlightNumber(String flightNumber) {
    this.flightNumber = flightNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AirlineTravelRoute airlineTravelRoute = (AirlineTravelRoute) o;
    return Objects.equals(this.departureDate, airlineTravelRoute.departureDate) &&
        Objects.equals(this.origin, airlineTravelRoute.origin) &&
        Objects.equals(this.destination, airlineTravelRoute.destination) &&
        Objects.equals(this.carrierCode, airlineTravelRoute.carrierCode) &&
        Objects.equals(this.serviceClass, airlineTravelRoute.serviceClass) &&
        Objects.equals(this.stopoverType, airlineTravelRoute.stopoverType) &&
        Objects.equals(this.fareBasisCode, airlineTravelRoute.fareBasisCode) &&
        Objects.equals(this.departureTax, airlineTravelRoute.departureTax) &&
        Objects.equals(this.flightNumber, airlineTravelRoute.flightNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(departureDate, origin, destination, carrierCode, serviceClass, stopoverType, fareBasisCode, departureTax, flightNumber);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AirlineTravelRoute {\n");
    sb.append("    departureDate: ").append(toIndentedString(departureDate)).append("\n");
    sb.append("    origin: ").append(toIndentedString(origin)).append("\n");
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    carrierCode: ").append(toIndentedString(carrierCode)).append("\n");
    sb.append("    serviceClass: ").append(toIndentedString(serviceClass)).append("\n");
    sb.append("    stopoverType: ").append(toIndentedString(stopoverType)).append("\n");
    sb.append("    fareBasisCode: ").append(toIndentedString(fareBasisCode)).append("\n");
    sb.append("    departureTax: ").append(toIndentedString(departureTax)).append("\n");
    sb.append("    flightNumber: ").append(toIndentedString(flightNumber)).append("\n");
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

