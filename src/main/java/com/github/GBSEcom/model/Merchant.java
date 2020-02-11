/*
 * Payment Gateway API Specification.
 * The documentation here is designed to provide all of the technical guidance required to consume and integrate with our APIs for payment processing. To learn more about our APIs please visit https://docs.firstdata.com/org/gateway.
 *
 * OpenAPI spec version: 6.9.1.20191223.002
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.github.GBSEcom.model;

import java.util.Objects;
import java.util.Arrays;
import com.github.GBSEcom.model.Location;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * The merchant where this transaction occurred.
 */
@ApiModel(description = "The merchant where this transaction occurred.")

public class Merchant {
  public static final String SERIALIZED_NAME_MCC = "mcc";
  @SerializedName(SERIALIZED_NAME_MCC)
  private String mcc;

  public static final String SERIALIZED_NAME_MERCHANT_UNIQUE_ID = "merchantUniqueId";
  @SerializedName(SERIALIZED_NAME_MERCHANT_UNIQUE_ID)
  private String merchantUniqueId;

  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private Location location = null;

  public static final String SERIALIZED_NAME_USER_DEFINED = "userDefined";
  @SerializedName(SERIALIZED_NAME_USER_DEFINED)
  private Object userDefined = null;

  public Merchant mcc(String mcc) {
    this.mcc = mcc;
    return this;
  }

   /**
   * The 4-digit Merchant Category Code. The merchant might be associated with multiple MCCs. In that case the MCC provided here will be the one that better describes the current transaction.
   * @return mcc
  **/
  @ApiModelProperty(example = "7311", value = "The 4-digit Merchant Category Code. The merchant might be associated with multiple MCCs. In that case the MCC provided here will be the one that better describes the current transaction.")
  public String getMcc() {
    return mcc;
  }

  public void setMcc(String mcc) {
    this.mcc = mcc;
  }

  public Merchant merchantUniqueId(String merchantUniqueId) {
    this.merchantUniqueId = merchantUniqueId;
    return this;
  }

   /**
   * The unique ID of this merchant. Must be unique for the entire system (not just within a specific industry).
   * @return merchantUniqueId
  **/
  @ApiModelProperty(example = "9a0f5fe8-f907-4b06-88e9-8dd5141cbf44", required = true, value = "The unique ID of this merchant. Must be unique for the entire system (not just within a specific industry).")
  public String getMerchantUniqueId() {
    return merchantUniqueId;
  }

  public void setMerchantUniqueId(String merchantUniqueId) {
    this.merchantUniqueId = merchantUniqueId;
  }

  public Merchant location(Location location) {
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @ApiModelProperty(value = "")
  public Location getLocation() {
    return location;
  }

  public void setLocation(Location location) {
    this.location = location;
  }

  public Merchant userDefined(Object userDefined) {
    this.userDefined = userDefined;
    return this;
  }

   /**
   * A JSON object that can carry any additional information about the merchant that might be helpful for fraud detection.
   * @return userDefined
  **/
  @ApiModelProperty(example = "{\"highFraudVolume\":true}", value = "A JSON object that can carry any additional information about the merchant that might be helpful for fraud detection.")
  public Object getUserDefined() {
    return userDefined;
  }

  public void setUserDefined(Object userDefined) {
    this.userDefined = userDefined;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Merchant merchant = (Merchant) o;
    return Objects.equals(this.mcc, merchant.mcc) &&
        Objects.equals(this.merchantUniqueId, merchant.merchantUniqueId) &&
        Objects.equals(this.location, merchant.location) &&
        Objects.equals(this.userDefined, merchant.userDefined);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mcc, merchantUniqueId, location, userDefined);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Merchant {\n");
    
    sb.append("    mcc: ").append(toIndentedString(mcc)).append("\n");
    sb.append("    merchantUniqueId: ").append(toIndentedString(merchantUniqueId)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    userDefined: ").append(toIndentedString(userDefined)).append("\n");
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

