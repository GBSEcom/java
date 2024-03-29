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
import com.github.GBSEcom.model.Amount;
import com.github.GBSEcom.model.Billing;
import com.github.GBSEcom.model.ClientLocale;
import com.github.GBSEcom.model.Frequency;
import com.github.GBSEcom.model.PaymentSchedulesRequest;
import com.github.GBSEcom.model.ReferencedOrderPaymentSchedulesRequestAllOf;
import com.github.GBSEcom.model.Shipping;
import com.github.GBSEcom.model.TransactionOrigin;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.LocalDate;

/**
 * Request to create a new payment schedule using a referenced order ID.
 */
@ApiModel(description = "Request to create a new payment schedule using a referenced order ID.")

public class ReferencedOrderPaymentSchedulesRequest extends PaymentSchedulesRequest {
  public static final String SERIALIZED_NAME_REFERENCED_ORDER_ID = "referencedOrderId";
  @SerializedName(SERIALIZED_NAME_REFERENCED_ORDER_ID)
  private String referencedOrderId;


  public ReferencedOrderPaymentSchedulesRequest referencedOrderId(String referencedOrderId) {
    
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
    ReferencedOrderPaymentSchedulesRequest referencedOrderPaymentSchedulesRequest = (ReferencedOrderPaymentSchedulesRequest) o;
    return Objects.equals(this.referencedOrderId, referencedOrderPaymentSchedulesRequest.referencedOrderId) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(referencedOrderId, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReferencedOrderPaymentSchedulesRequest {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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

