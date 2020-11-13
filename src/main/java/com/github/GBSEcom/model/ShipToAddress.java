/*
 * Payment Gateway API Specification.
 * The documentation here is designed to provide all of the technical guidance required to consume and integrate with our APIs for payment processing. To learn more about our APIs please visit https://docs.firstdata.com/org/gateway.
 *
 * The version of the OpenAPI document: 6.14.0.20201015.001
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
 * The address where the items in this order should be shipped to.
 */
@ApiModel(description = "The address where the items in this order should be shipped to.")

public class ShipToAddress {
  public static final String SERIALIZED_NAME_PHONE = "phone";
  @SerializedName(SERIALIZED_NAME_PHONE)
  private String phone;

  public static final String SERIALIZED_NAME_ADDRESS1 = "address1";
  @SerializedName(SERIALIZED_NAME_ADDRESS1)
  private String address1;

  public static final String SERIALIZED_NAME_ADDRESS2 = "address2";
  @SerializedName(SERIALIZED_NAME_ADDRESS2)
  private String address2;

  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private String city;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private String state;

  public static final String SERIALIZED_NAME_ZIP = "zip";
  @SerializedName(SERIALIZED_NAME_ZIP)
  private String zip;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;


  public ShipToAddress phone(String phone) {
    
    this.phone = phone;
    return this;
  }

   /**
   * Free-form phone number associated with the ship-to address.
   * @return phone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123-123-1234", value = "Free-form phone number associated with the ship-to address.")

  public String getPhone() {
    return phone;
  }



  public void setPhone(String phone) {
    this.phone = phone;
  }


  public ShipToAddress address1(String address1) {
    
    this.address1 = address1;
    return this;
  }

   /**
   * First line of street address.
   * @return address1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123 Second Ave.", value = "First line of street address.")

  public String getAddress1() {
    return address1;
  }



  public void setAddress1(String address1) {
    this.address1 = address1;
  }


  public ShipToAddress address2(String address2) {
    
    this.address2 = address2;
    return this;
  }

   /**
   * Second line of street address.
   * @return address2
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Apt #42", value = "Second line of street address.")

  public String getAddress2() {
    return address2;
  }



  public void setAddress2(String address2) {
    this.address2 = address2;
  }


  public ShipToAddress city(String city) {
    
    this.city = city;
    return this;
  }

   /**
   * City.
   * @return city
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Atlanta", value = "City.")

  public String getCity() {
    return city;
  }



  public void setCity(String city) {
    this.city = city;
  }


  public ShipToAddress state(String state) {
    
    this.state = state;
    return this;
  }

   /**
   * State or province.
   * @return state
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "GA", value = "State or province.")

  public String getState() {
    return state;
  }



  public void setState(String state) {
    this.state = state;
  }


  public ShipToAddress zip(String zip) {
    
    this.zip = zip;
    return this;
  }

   /**
   * Postal Code, free form.
   * @return zip
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "30024", value = "Postal Code, free form.")

  public String getZip() {
    return zip;
  }



  public void setZip(String zip) {
    this.zip = zip;
  }


  public ShipToAddress country(String country) {
    
    this.country = country;
    return this;
  }

   /**
   * Country.
   * @return country
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "US", value = "Country.")

  public String getCountry() {
    return country;
  }



  public void setCountry(String country) {
    this.country = country;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShipToAddress shipToAddress = (ShipToAddress) o;
    return Objects.equals(this.phone, shipToAddress.phone) &&
        Objects.equals(this.address1, shipToAddress.address1) &&
        Objects.equals(this.address2, shipToAddress.address2) &&
        Objects.equals(this.city, shipToAddress.city) &&
        Objects.equals(this.state, shipToAddress.state) &&
        Objects.equals(this.zip, shipToAddress.zip) &&
        Objects.equals(this.country, shipToAddress.country);
  }

  @Override
  public int hashCode() {
    return Objects.hash(phone, address1, address2, city, state, zip, country);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShipToAddress {\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    address1: ").append(toIndentedString(address1)).append("\n");
    sb.append("    address2: ").append(toIndentedString(address2)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    zip: ").append(toIndentedString(zip)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
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

