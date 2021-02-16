/*
 * Payment Gateway API Specification.
 * The documentation here is designed to provide all of the technical guidance required to consume and integrate with our APIs for payment processing. To learn more about our APIs please visit https://docs.firstdata.com/org/gateway.
 *
 * The version of the OpenAPI document: 21.1.0.20210122.001
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
 * ReferencedOrderPaymentTokenizationRequestAllOf
 */

public class ReferencedOrderPaymentTokenizationRequestAllOf {
  public static final String SERIALIZED_NAME_REFERENCED_ORDER_ID = "referencedOrderId";
  @SerializedName(SERIALIZED_NAME_REFERENCED_ORDER_ID)
  private String referencedOrderId;


  public ReferencedOrderPaymentTokenizationRequestAllOf referencedOrderId(String referencedOrderId) {
    
    this.referencedOrderId = referencedOrderId;
    return this;
  }

   /**
   * Retrieves the payment instrument information from an existing order.
   * @return referencedOrderId
  **/
  @ApiModelProperty(example = "R-f9c2c198-b7cc-491a-a711-93d22fd0e589", required = true, value = "Retrieves the payment instrument information from an existing order.")

  public String getReferencedOrderId() {
    return referencedOrderId;
  }



  public void setReferencedOrderId(String referencedOrderId) {
    this.referencedOrderId = referencedOrderId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReferencedOrderPaymentTokenizationRequestAllOf referencedOrderPaymentTokenizationRequestAllOf = (ReferencedOrderPaymentTokenizationRequestAllOf) o;
    return Objects.equals(this.referencedOrderId, referencedOrderPaymentTokenizationRequestAllOf.referencedOrderId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(referencedOrderId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReferencedOrderPaymentTokenizationRequestAllOf {\n");
    sb.append("    referencedOrderId: ").append(toIndentedString(referencedOrderId)).append("\n");
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

