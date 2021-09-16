/*
 * Payment Gateway API Specification.
 * The documentation here is designed to provide all of the technical guidance required to consume and integrate with our APIs for payment processing. To learn more about our APIs please visit https://docs.firstdata.com/org/gateway.
 *
 * The version of the OpenAPI document: 21.4.0.20210824.002
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.github.GBSEcom.model;

import java.util.Objects;
import java.util.Arrays;
import com.github.GBSEcom.model.PaymentFacilitator;
import com.github.GBSEcom.model.UsePaymentToken;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PaymentTokenPaymentMethodAllOf
 */

public class PaymentTokenPaymentMethodAllOf {
  public static final String SERIALIZED_NAME_PAYMENT_TOKEN = "paymentToken";
  @SerializedName(SERIALIZED_NAME_PAYMENT_TOKEN)
  private UsePaymentToken paymentToken;

  public static final String SERIALIZED_NAME_PAYMENT_FACILITATOR = "paymentFacilitator";
  @SerializedName(SERIALIZED_NAME_PAYMENT_FACILITATOR)
  private PaymentFacilitator paymentFacilitator;


  public PaymentTokenPaymentMethodAllOf paymentToken(UsePaymentToken paymentToken) {
    
    this.paymentToken = paymentToken;
    return this;
  }

   /**
   * Get paymentToken
   * @return paymentToken
  **/
  @ApiModelProperty(required = true, value = "")

  public UsePaymentToken getPaymentToken() {
    return paymentToken;
  }



  public void setPaymentToken(UsePaymentToken paymentToken) {
    this.paymentToken = paymentToken;
  }


  public PaymentTokenPaymentMethodAllOf paymentFacilitator(PaymentFacilitator paymentFacilitator) {
    
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
    PaymentTokenPaymentMethodAllOf paymentTokenPaymentMethodAllOf = (PaymentTokenPaymentMethodAllOf) o;
    return Objects.equals(this.paymentToken, paymentTokenPaymentMethodAllOf.paymentToken) &&
        Objects.equals(this.paymentFacilitator, paymentTokenPaymentMethodAllOf.paymentFacilitator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentToken, paymentFacilitator);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentTokenPaymentMethodAllOf {\n");
    sb.append("    paymentToken: ").append(toIndentedString(paymentToken)).append("\n");
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

