/*
 * Payment Gateway API Specification.
 * The documentation here is designed to provide all of the technical guidance required to consume and integrate with our APIs for payment processing. To learn more about our APIs please visit https://docs.firstdata.com/org/gateway.
 *
 * The version of the OpenAPI document: 6.12.0.20200605.001
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
 * DccAllOf
 */

public class DccAllOf {
  public static final String SERIALIZED_NAME_DCC_APPLIED = "dccApplied";
  @SerializedName(SERIALIZED_NAME_DCC_APPLIED)
  private Boolean dccApplied;


  public DccAllOf dccApplied(Boolean dccApplied) {
    
    this.dccApplied = dccApplied;
    return this;
  }

   /**
   * Indicates whether customer agrees with rate to be used.
   * @return dccApplied
  **/
  @ApiModelProperty(example = "true", required = true, value = "Indicates whether customer agrees with rate to be used.")

  public Boolean getDccApplied() {
    return dccApplied;
  }



  public void setDccApplied(Boolean dccApplied) {
    this.dccApplied = dccApplied;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DccAllOf dccAllOf = (DccAllOf) o;
    return Objects.equals(this.dccApplied, dccAllOf.dccApplied);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dccApplied);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DccAllOf {\n");
    sb.append("    dccApplied: ").append(toIndentedString(dccApplied)).append("\n");
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
