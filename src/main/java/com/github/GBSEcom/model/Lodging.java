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
import com.github.GBSEcom.model.LodgingExtraCharges;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Additional data specific to the lodging/hotel industry.
 */
@ApiModel(description = "Additional data specific to the lodging/hotel industry.")

public class Lodging {
  public static final String SERIALIZED_NAME_ARRIVAL_DATE = "arrivalDate";
  @SerializedName(SERIALIZED_NAME_ARRIVAL_DATE)
  private LocalDate arrivalDate;

  public static final String SERIALIZED_NAME_DEPARTURE_DATE = "departureDate";
  @SerializedName(SERIALIZED_NAME_DEPARTURE_DATE)
  private LocalDate departureDate;

  public static final String SERIALIZED_NAME_FOLIO_NUMBER = "folioNumber";
  @SerializedName(SERIALIZED_NAME_FOLIO_NUMBER)
  private String folioNumber;

  public static final String SERIALIZED_NAME_EXTRA_CHARGES = "extraCharges";
  @SerializedName(SERIALIZED_NAME_EXTRA_CHARGES)
  private List<LodgingExtraCharges> extraCharges = null;

  public static final String SERIALIZED_NAME_NO_SHOW_INDICATOR = "noShowIndicator";
  @SerializedName(SERIALIZED_NAME_NO_SHOW_INDICATOR)
  private Boolean noShowIndicator;


  public Lodging arrivalDate(LocalDate arrivalDate) {
    
    this.arrivalDate = arrivalDate;
    return this;
  }

   /**
   * Date of arrival.
   * @return arrivalDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Fri May 14 20:00:00 EDT 2010", value = "Date of arrival.")

  public LocalDate getArrivalDate() {
    return arrivalDate;
  }



  public void setArrivalDate(LocalDate arrivalDate) {
    this.arrivalDate = arrivalDate;
  }


  public Lodging departureDate(LocalDate departureDate) {
    
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


  public Lodging folioNumber(String folioNumber) {
    
    this.folioNumber = folioNumber;
    return this;
  }

   /**
   * Portfolio number.
   * @return folioNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "12200054891", value = "Portfolio number.")

  public String getFolioNumber() {
    return folioNumber;
  }



  public void setFolioNumber(String folioNumber) {
    this.folioNumber = folioNumber;
  }


  public Lodging extraCharges(List<LodgingExtraCharges> extraCharges) {
    
    this.extraCharges = extraCharges;
    return this;
  }

  public Lodging addExtraChargesItem(LodgingExtraCharges extraChargesItem) {
    if (this.extraCharges == null) {
      this.extraCharges = new ArrayList<>();
    }
    this.extraCharges.add(extraChargesItem);
    return this;
  }

   /**
   * Information about charges other than base lodging.
   * @return extraCharges
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[{\"chargeItem\":\"MINI_BAR\"},{\"chargeItem\":\"OTHER\"}]", value = "Information about charges other than base lodging.")

  public List<LodgingExtraCharges> getExtraCharges() {
    return extraCharges;
  }



  public void setExtraCharges(List<LodgingExtraCharges> extraCharges) {
    this.extraCharges = extraCharges;
  }


  public Lodging noShowIndicator(Boolean noShowIndicator) {
    
    this.noShowIndicator = noShowIndicator;
    return this;
  }

   /**
   * Indicates if the transaction is associated with a delayed or no-show penalty.
   * @return noShowIndicator
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "Indicates if the transaction is associated with a delayed or no-show penalty.")

  public Boolean getNoShowIndicator() {
    return noShowIndicator;
  }



  public void setNoShowIndicator(Boolean noShowIndicator) {
    this.noShowIndicator = noShowIndicator;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Lodging lodging = (Lodging) o;
    return Objects.equals(this.arrivalDate, lodging.arrivalDate) &&
        Objects.equals(this.departureDate, lodging.departureDate) &&
        Objects.equals(this.folioNumber, lodging.folioNumber) &&
        Objects.equals(this.extraCharges, lodging.extraCharges) &&
        Objects.equals(this.noShowIndicator, lodging.noShowIndicator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(arrivalDate, departureDate, folioNumber, extraCharges, noShowIndicator);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Lodging {\n");
    sb.append("    arrivalDate: ").append(toIndentedString(arrivalDate)).append("\n");
    sb.append("    departureDate: ").append(toIndentedString(departureDate)).append("\n");
    sb.append("    folioNumber: ").append(toIndentedString(folioNumber)).append("\n");
    sb.append("    extraCharges: ").append(toIndentedString(extraCharges)).append("\n");
    sb.append("    noShowIndicator: ").append(toIndentedString(noShowIndicator)).append("\n");
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

