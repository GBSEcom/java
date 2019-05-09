/*
 * Payment Gateway API Specification.
 * Payment Gateway API for payment processing. Version 6.4.0.20181018.001 
 *
 * OpenAPI spec version: 6.4.0.20181018.001
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
 * Split-shipment related information, in order to reuse the same authorization
 */
@ApiModel(description = "Split-shipment related information, in order to reuse the same authorization")

public class SplitShipment {
  public static final String SERIALIZED_NAME_TOTAL_COUNT = "totalCount";
  @SerializedName(SERIALIZED_NAME_TOTAL_COUNT)
  private Integer totalCount;

  public static final String SERIALIZED_NAME_FINAL_SHIPMENT = "finalShipment";
  @SerializedName(SERIALIZED_NAME_FINAL_SHIPMENT)
  private Boolean finalShipment = false;

  public SplitShipment totalCount(Integer totalCount) {
    this.totalCount = totalCount;
    return this;
  }

   /**
   * Total count of the shipment, can be set at preauth or the first postauth.
   * @return totalCount
  **/
  @ApiModelProperty(example = "5", value = "Total count of the shipment, can be set at preauth or the first postauth.")
  public Integer getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(Integer totalCount) {
    this.totalCount = totalCount;
  }

  public SplitShipment finalShipment(Boolean finalShipment) {
    this.finalShipment = finalShipment;
    return this;
  }

   /**
   * Indicates whether the transaction is the final shipment
   * @return finalShipment
  **/
  @ApiModelProperty(value = "Indicates whether the transaction is the final shipment")
  public Boolean getFinalShipment() {
    return finalShipment;
  }

  public void setFinalShipment(Boolean finalShipment) {
    this.finalShipment = finalShipment;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SplitShipment splitShipment = (SplitShipment) o;
    return Objects.equals(this.totalCount, splitShipment.totalCount) &&
        Objects.equals(this.finalShipment, splitShipment.finalShipment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalCount, finalShipment);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SplitShipment {\n");
    
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("    finalShipment: ").append(toIndentedString(finalShipment)).append("\n");
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

