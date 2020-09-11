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
import com.github.GBSEcom.model.PaymentCard;
import com.github.GBSEcom.model.PaymentFacilitator;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PaymentCardPaymentMethodAllOf
 */

public class PaymentCardPaymentMethodAllOf {
  public static final String SERIALIZED_NAME_PAYMENT_CARD = "paymentCard";
  @SerializedName(SERIALIZED_NAME_PAYMENT_CARD)
  private PaymentCard paymentCard;

  public static final String SERIALIZED_NAME_PAYMENT_FACILITATOR = "paymentFacilitator";
  @SerializedName(SERIALIZED_NAME_PAYMENT_FACILITATOR)
  private PaymentFacilitator paymentFacilitator;


  public PaymentCardPaymentMethodAllOf paymentCard(PaymentCard paymentCard) {
    
    this.paymentCard = paymentCard;
    return this;
  }

   /**
   * Get paymentCard
   * @return paymentCard
  **/
  @ApiModelProperty(required = true, value = "")

  public PaymentCard getPaymentCard() {
    return paymentCard;
  }



  public void setPaymentCard(PaymentCard paymentCard) {
    this.paymentCard = paymentCard;
  }


  public PaymentCardPaymentMethodAllOf paymentFacilitator(PaymentFacilitator paymentFacilitator) {
    
    this.paymentFacilitator = paymentFacilitator;
    return this;
  }

   /**
   * Get paymentFacilitator
   * @return paymentFacilitator
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PaymentFacilitator getPaymentFacilitator() {
    return paymentFacilitator;
  }



  public void setPaymentFacilitator(PaymentFacilitator paymentFacilitator) {
    this.paymentFacilitator = paymentFacilitator;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentCardPaymentMethodAllOf paymentCardPaymentMethodAllOf = (PaymentCardPaymentMethodAllOf) o;
    return Objects.equals(this.paymentCard, paymentCardPaymentMethodAllOf.paymentCard) &&
        Objects.equals(this.paymentFacilitator, paymentCardPaymentMethodAllOf.paymentFacilitator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentCard, paymentFacilitator);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentCardPaymentMethodAllOf {\n");
    sb.append("    paymentCard: ").append(toIndentedString(paymentCard)).append("\n");
    sb.append("    paymentFacilitator: ").append(toIndentedString(paymentFacilitator)).append("\n");
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

