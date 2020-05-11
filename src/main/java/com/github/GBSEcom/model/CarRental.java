/*
 * Payment Gateway API Specification.
 * The documentation here is designed to provide all of the technical guidance required to consume and integrate with our APIs for payment processing. To learn more about our APIs please visit https://docs.firstdata.com/org/gateway.
 *
 * OpenAPI spec version: 6.10.1.20200226.002
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.github.GBSEcom.model;

import java.util.Objects;
import java.util.Arrays;
import com.github.GBSEcom.model.CarRentalExtraCharges;
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
 * Additional data specific to the car rental industry.
 */
@ApiModel(description = "Additional data specific to the car rental industry.")

public class CarRental {
  public static final String SERIALIZED_NAME_AGREEMENT_NUMBER = "agreementNumber";
  @SerializedName(SERIALIZED_NAME_AGREEMENT_NUMBER)
  private String agreementNumber;

  public static final String SERIALIZED_NAME_RENTER_NAME = "renterName";
  @SerializedName(SERIALIZED_NAME_RENTER_NAME)
  private String renterName;

  public static final String SERIALIZED_NAME_RETURN_CITY = "returnCity";
  @SerializedName(SERIALIZED_NAME_RETURN_CITY)
  private String returnCity;

  public static final String SERIALIZED_NAME_RETURN_DATE = "returnDate";
  @SerializedName(SERIALIZED_NAME_RETURN_DATE)
  private LocalDate returnDate;

  public static final String SERIALIZED_NAME_PICKUP_DATE = "pickupDate";
  @SerializedName(SERIALIZED_NAME_PICKUP_DATE)
  private LocalDate pickupDate;

  public static final String SERIALIZED_NAME_RENTAL_CLASS_ID = "rentalClassId";
  @SerializedName(SERIALIZED_NAME_RENTAL_CLASS_ID)
  private String rentalClassId;

  public static final String SERIALIZED_NAME_EXTRA_CHARGES = "extraCharges";
  @SerializedName(SERIALIZED_NAME_EXTRA_CHARGES)
  private List<CarRentalExtraCharges> extraCharges = null;

  public static final String SERIALIZED_NAME_NO_SHOW_INDICATOR = "noShowIndicator";
  @SerializedName(SERIALIZED_NAME_NO_SHOW_INDICATOR)
  private Boolean noShowIndicator;

  public CarRental agreementNumber(String agreementNumber) {
    this.agreementNumber = agreementNumber;
    return this;
  }

   /**
   * The car rental agreement number.
   * @return agreementNumber
  **/
  @ApiModelProperty(example = "100001145699", value = "The car rental agreement number.")
  public String getAgreementNumber() {
    return agreementNumber;
  }

  public void setAgreementNumber(String agreementNumber) {
    this.agreementNumber = agreementNumber;
  }

  public CarRental renterName(String renterName) {
    this.renterName = renterName;
    return this;
  }

   /**
   * The name of the person renting the car.
   * @return renterName
  **/
  @ApiModelProperty(example = "Frank Bisignano", value = "The name of the person renting the car.")
  public String getRenterName() {
    return renterName;
  }

  public void setRenterName(String renterName) {
    this.renterName = renterName;
  }

  public CarRental returnCity(String returnCity) {
    this.returnCity = returnCity;
    return this;
  }

   /**
   * The city where the rental ends and the car is returned.
   * @return returnCity
  **/
  @ApiModelProperty(example = "Atlanta", value = "The city where the rental ends and the car is returned.")
  public String getReturnCity() {
    return returnCity;
  }

  public void setReturnCity(String returnCity) {
    this.returnCity = returnCity;
  }

  public CarRental returnDate(LocalDate returnDate) {
    this.returnDate = returnDate;
    return this;
  }

   /**
   * The date the car rental ends and the car is returned.
   * @return returnDate
  **/
  @ApiModelProperty(value = "The date the car rental ends and the car is returned.")
  public LocalDate getReturnDate() {
    return returnDate;
  }

  public void setReturnDate(LocalDate returnDate) {
    this.returnDate = returnDate;
  }

  public CarRental pickupDate(LocalDate pickupDate) {
    this.pickupDate = pickupDate;
    return this;
  }

   /**
   * The date the car rental begins.
   * @return pickupDate
  **/
  @ApiModelProperty(value = "The date the car rental begins.")
  public LocalDate getPickupDate() {
    return pickupDate;
  }

  public void setPickupDate(LocalDate pickupDate) {
    this.pickupDate = pickupDate;
  }

  public CarRental rentalClassId(String rentalClassId) {
    this.rentalClassId = rentalClassId;
    return this;
  }

   /**
   * The classification of the rental car.
   * @return rentalClassId
  **/
  @ApiModelProperty(example = "ABCDEF", value = "The classification of the rental car.")
  public String getRentalClassId() {
    return rentalClassId;
  }

  public void setRentalClassId(String rentalClassId) {
    this.rentalClassId = rentalClassId;
  }

  public CarRental extraCharges(List<CarRentalExtraCharges> extraCharges) {
    this.extraCharges = extraCharges;
    return this;
  }

  public CarRental addExtraChargesItem(CarRentalExtraCharges extraChargesItem) {
    if (this.extraCharges == null) {
      this.extraCharges = new ArrayList<>();
    }
    this.extraCharges.add(extraChargesItem);
    return this;
  }

   /**
   * Array containing information about charges other than the rental rate.
   * @return extraCharges
  **/
  @ApiModelProperty(example = "[{\"chargeItem\":\"GAS\"},{\"chargeItem\":\"EXTRA_MILEAGE\"}]", value = "Array containing information about charges other than the rental rate.")
  public List<CarRentalExtraCharges> getExtraCharges() {
    return extraCharges;
  }

  public void setExtraCharges(List<CarRentalExtraCharges> extraCharges) {
    this.extraCharges = extraCharges;
  }

  public CarRental noShowIndicator(Boolean noShowIndicator) {
    this.noShowIndicator = noShowIndicator;
    return this;
  }

   /**
   * Indicates if the transaction is related to a no-show charge.
   * @return noShowIndicator
  **/
  @ApiModelProperty(value = "Indicates if the transaction is related to a no-show charge.")
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
    CarRental carRental = (CarRental) o;
    return Objects.equals(this.agreementNumber, carRental.agreementNumber) &&
        Objects.equals(this.renterName, carRental.renterName) &&
        Objects.equals(this.returnCity, carRental.returnCity) &&
        Objects.equals(this.returnDate, carRental.returnDate) &&
        Objects.equals(this.pickupDate, carRental.pickupDate) &&
        Objects.equals(this.rentalClassId, carRental.rentalClassId) &&
        Objects.equals(this.extraCharges, carRental.extraCharges) &&
        Objects.equals(this.noShowIndicator, carRental.noShowIndicator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agreementNumber, renterName, returnCity, returnDate, pickupDate, rentalClassId, extraCharges, noShowIndicator);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CarRental {\n");
    
    sb.append("    agreementNumber: ").append(toIndentedString(agreementNumber)).append("\n");
    sb.append("    renterName: ").append(toIndentedString(renterName)).append("\n");
    sb.append("    returnCity: ").append(toIndentedString(returnCity)).append("\n");
    sb.append("    returnDate: ").append(toIndentedString(returnDate)).append("\n");
    sb.append("    pickupDate: ").append(toIndentedString(pickupDate)).append("\n");
    sb.append("    rentalClassId: ").append(toIndentedString(rentalClassId)).append("\n");
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

