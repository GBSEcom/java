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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * ResponseAmountComponentsAllOf
 */

public class ResponseAmountComponentsAllOf {
  public static final String SERIALIZED_NAME_CONVENIENCE_FEE = "convenienceFee";
  @SerializedName(SERIALIZED_NAME_CONVENIENCE_FEE)
  private BigDecimal convenienceFee;


  public ResponseAmountComponentsAllOf convenienceFee(BigDecimal convenienceFee) {
    
    this.convenienceFee = convenienceFee;
    return this;
  }

   /**
   * Amount added for proccessing or handling fees.
   * @return convenienceFee
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2.0", value = "Amount added for proccessing or handling fees.")

  public BigDecimal getConvenienceFee() {
    return convenienceFee;
  }



  public void setConvenienceFee(BigDecimal convenienceFee) {
    this.convenienceFee = convenienceFee;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseAmountComponentsAllOf responseAmountComponentsAllOf = (ResponseAmountComponentsAllOf) o;
    return Objects.equals(this.convenienceFee, responseAmountComponentsAllOf.convenienceFee);
  }

  @Override
  public int hashCode() {
    return Objects.hash(convenienceFee);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseAmountComponentsAllOf {\n");
    sb.append("    convenienceFee: ").append(toIndentedString(convenienceFee)).append("\n");
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

