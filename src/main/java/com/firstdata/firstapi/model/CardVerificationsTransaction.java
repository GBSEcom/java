/*
 * Payment Gateway API Specification
 * Payment Gateway API for payment processing. 
 *
 * OpenAPI spec version: 0.0.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.firstdata.firstapi.model;

import java.util.Objects;
import com.firstdata.firstapi.model.PaymentMethod;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Model for card verifcation transactions
 */
@ApiModel(description = "Model for card verifcation transactions")

public class CardVerificationsTransaction {
  @SerializedName("storeId")
  private String storeId = null;

  @SerializedName("paymentMethod")
  private PaymentMethod paymentMethod = null;

  public CardVerificationsTransaction storeId(String storeId) {
    this.storeId = storeId;
    return this;
  }

   /**
   * Optional Outlet ID for clients that support multiple store in the same app
   * @return storeId
  **/
  @ApiModelProperty(example = "12345500000", value = "Optional Outlet ID for clients that support multiple store in the same app")
  public String getStoreId() {
    return storeId;
  }

  public void setStoreId(String storeId) {
    this.storeId = storeId;
  }

  public CardVerificationsTransaction paymentMethod(PaymentMethod paymentMethod) {
    this.paymentMethod = paymentMethod;
    return this;
  }

   /**
   * Get paymentMethod
   * @return paymentMethod
  **/
  @ApiModelProperty(required = true, value = "")
  public PaymentMethod getPaymentMethod() {
    return paymentMethod;
  }

  public void setPaymentMethod(PaymentMethod paymentMethod) {
    this.paymentMethod = paymentMethod;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CardVerificationsTransaction cardVerificationsTransaction = (CardVerificationsTransaction) o;
    return Objects.equals(this.storeId, cardVerificationsTransaction.storeId) &&
        Objects.equals(this.paymentMethod, cardVerificationsTransaction.paymentMethod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(storeId, paymentMethod);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardVerificationsTransaction {\n");
    
    sb.append("    storeId: ").append(toIndentedString(storeId)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
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

