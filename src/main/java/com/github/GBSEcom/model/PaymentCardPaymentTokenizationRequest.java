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
import com.github.GBSEcom.model.AdditionalDetails;
import com.github.GBSEcom.model.Address;
import com.github.GBSEcom.model.CreatePaymentToken;
import com.github.GBSEcom.model.PaymentCard;
import com.github.GBSEcom.model.PaymentCardPaymentTokenizationRequestAllOf;
import com.github.GBSEcom.model.PaymentTokenizationRequest;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Used to generate payment tokens during payment.
 */
@ApiModel(description = "Used to generate payment tokens during payment.")

public class PaymentCardPaymentTokenizationRequest extends PaymentTokenizationRequest {
  public static final String SERIALIZED_NAME_PAYMENT_CARD = "paymentCard";
  @SerializedName(SERIALIZED_NAME_PAYMENT_CARD)
  private PaymentCard paymentCard;


  public PaymentCardPaymentTokenizationRequest paymentCard(PaymentCard paymentCard) {
    
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentCardPaymentTokenizationRequest paymentCardPaymentTokenizationRequest = (PaymentCardPaymentTokenizationRequest) o;
    return Objects.equals(this.paymentCard, paymentCardPaymentTokenizationRequest.paymentCard) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentCard, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentCardPaymentTokenizationRequest {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    paymentCard: ").append(toIndentedString(paymentCard)).append("\n");
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

