/*
 * Payment Gateway API Specification.
 * The documentation here is designed to provide all of the technical guidance required to consume and integrate with our APIs for payment processing. To learn more about our APIs please visit https://docs.firstdata.com/org/gateway.
 *
 * The version of the OpenAPI document: 6.13.0.20200810.001
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
 * ReferencedOrderPaymentSchedulesRequestAllOf
 */

public class ReferencedOrderPaymentSchedulesRequestAllOf {
  public static final String SERIALIZED_NAME_REFERENCED_ORDER_ID = "referencedOrderId";
  @SerializedName(SERIALIZED_NAME_REFERENCED_ORDER_ID)
  private String referencedOrderId;


  public ReferencedOrderPaymentSchedulesRequestAllOf referencedOrderId(String referencedOrderId) {
    
    this.referencedOrderId = referencedOrderId;
    return this;
  }

   /**
   * Order ID used to create recurring payment from existing transaction.
   * @return referencedOrderId
  **/
  @ApiModelProperty(example = "R-f9c2c198-b7cc-491a-a711-93d22fd0e589", required = true, value = "Order ID used to create recurring payment from existing transaction.")

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
    ReferencedOrderPaymentSchedulesRequestAllOf referencedOrderPaymentSchedulesRequestAllOf = (ReferencedOrderPaymentSchedulesRequestAllOf) o;
    return Objects.equals(this.referencedOrderId, referencedOrderPaymentSchedulesRequestAllOf.referencedOrderId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(referencedOrderId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReferencedOrderPaymentSchedulesRequestAllOf {\n");
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

