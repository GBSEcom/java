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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Receiver information for a funding transaction.
 */
@ApiModel(description = "Receiver information for a funding transaction.")

public class ReceiverInfo {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_STREET_ADDRESS = "streetAddress";
  @SerializedName(SERIALIZED_NAME_STREET_ADDRESS)
  private String streetAddress;

  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private String city;

  public static final String SERIALIZED_NAME_STATE_CODE = "stateCode";
  @SerializedName(SERIALIZED_NAME_STATE_CODE)
  private String stateCode;

  public static final String SERIALIZED_NAME_COUNTRY_CODE = "countryCode";
  @SerializedName(SERIALIZED_NAME_COUNTRY_CODE)
  private String countryCode;

  public static final String SERIALIZED_NAME_POSTAL_CODE = "postalCode";
  @SerializedName(SERIALIZED_NAME_POSTAL_CODE)
  private String postalCode;

  public static final String SERIALIZED_NAME_PHONE_NUMBER = "phoneNumber";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBER)
  private String phoneNumber;

  public static final String SERIALIZED_NAME_REFERENCE_NUMBER = "referenceNumber";
  @SerializedName(SERIALIZED_NAME_REFERENCE_NUMBER)
  private String referenceNumber;

  public static final String SERIALIZED_NAME_ACCOUNT_NUMBER = "accountNumber";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_NUMBER)
  private String accountNumber;

  public ReceiverInfo name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Receiver name.
   * @return name
  **/
  @ApiModelProperty(example = "George Washington", required = true, value = "Receiver name.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ReceiverInfo streetAddress(String streetAddress) {
    this.streetAddress = streetAddress;
    return this;
  }

   /**
   * Receiver street address.
   * @return streetAddress
  **/
  @ApiModelProperty(example = "5565 Glenridge Connector", required = true, value = "Receiver street address.")
  public String getStreetAddress() {
    return streetAddress;
  }

  public void setStreetAddress(String streetAddress) {
    this.streetAddress = streetAddress;
  }

  public ReceiverInfo city(String city) {
    this.city = city;
    return this;
  }

   /**
   * Receiver city.
   * @return city
  **/
  @ApiModelProperty(example = "Atlanta", required = true, value = "Receiver city.")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public ReceiverInfo stateCode(String stateCode) {
    this.stateCode = stateCode;
    return this;
  }

   /**
   * Receiver state.
   * @return stateCode
  **/
  @ApiModelProperty(example = "GA", required = true, value = "Receiver state.")
  public String getStateCode() {
    return stateCode;
  }

  public void setStateCode(String stateCode) {
    this.stateCode = stateCode;
  }

  public ReceiverInfo countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

   /**
   * Receiver country code.
   * @return countryCode
  **/
  @ApiModelProperty(example = "US", required = true, value = "Receiver country code.")
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public ReceiverInfo postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

   /**
   * Receiver postal code.
   * @return postalCode
  **/
  @ApiModelProperty(example = "30342", required = true, value = "Receiver postal code.")
  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public ReceiverInfo phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * Receiver phone number.
   * @return phoneNumber
  **/
  @ApiModelProperty(example = "4044040740", required = true, value = "Receiver phone number.")
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public ReceiverInfo referenceNumber(String referenceNumber) {
    this.referenceNumber = referenceNumber;
    return this;
  }

   /**
   * Receiver reference number.
   * @return referenceNumber
  **/
  @ApiModelProperty(example = "123456", required = true, value = "Receiver reference number.")
  public String getReferenceNumber() {
    return referenceNumber;
  }

  public void setReferenceNumber(String referenceNumber) {
    this.referenceNumber = referenceNumber;
  }

  public ReceiverInfo accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

   /**
   * Receiver account number.
   * @return accountNumber
  **/
  @ApiModelProperty(example = "135246", value = "Receiver account number.")
  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReceiverInfo receiverInfo = (ReceiverInfo) o;
    return Objects.equals(this.name, receiverInfo.name) &&
        Objects.equals(this.streetAddress, receiverInfo.streetAddress) &&
        Objects.equals(this.city, receiverInfo.city) &&
        Objects.equals(this.stateCode, receiverInfo.stateCode) &&
        Objects.equals(this.countryCode, receiverInfo.countryCode) &&
        Objects.equals(this.postalCode, receiverInfo.postalCode) &&
        Objects.equals(this.phoneNumber, receiverInfo.phoneNumber) &&
        Objects.equals(this.referenceNumber, receiverInfo.referenceNumber) &&
        Objects.equals(this.accountNumber, receiverInfo.accountNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, streetAddress, city, stateCode, countryCode, postalCode, phoneNumber, referenceNumber, accountNumber);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReceiverInfo {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    streetAddress: ").append(toIndentedString(streetAddress)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    stateCode: ").append(toIndentedString(stateCode)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    referenceNumber: ").append(toIndentedString(referenceNumber)).append("\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
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

