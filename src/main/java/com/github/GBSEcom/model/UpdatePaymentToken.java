/*
 * Payment Gateway API Specification.
 * The documentation here is designed to provide all of the technical guidance required to consume and integrate with our APIs for payment processing. To learn more about our APIs please visit https://docs.firstdata.com/org/gateway.
 *
 * The version of the OpenAPI document: 6.8.0.20190731.002
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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Use this model to Update payment token.
 */
@ApiModel(description = "Use this model to Update payment token.")

public class UpdatePaymentToken {
  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public static final String SERIALIZED_NAME_REUSABLE = "reusable";
  @SerializedName(SERIALIZED_NAME_REUSABLE)
  private Boolean reusable = true;

  public static final String SERIALIZED_NAME_DECLINE_DUPLICATES = "declineDuplicates";
  @SerializedName(SERIALIZED_NAME_DECLINE_DUPLICATES)
  private Boolean declineDuplicates = false;

  public static final String SERIALIZED_NAME_PAYMENT_CARD = "paymentCard";
  @SerializedName(SERIALIZED_NAME_PAYMENT_CARD)
  private PaymentCard paymentCard;


  public UpdatePaymentToken value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * Client-supplied payment token value.
   * @return value
  **/
  @ApiModelProperty(example = "234ljl124l12", required = true, value = "Client-supplied payment token value.")

  public String getValue() {
    return value;
  }



  public void setValue(String value) {
    this.value = value;
  }


  public UpdatePaymentToken reusable(Boolean reusable) {
    
    this.reusable = reusable;
    return this;
  }

   /**
   * If the token is reusable.
   * @return reusable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "If the token is reusable.")

  public Boolean getReusable() {
    return reusable;
  }



  public void setReusable(Boolean reusable) {
    this.reusable = reusable;
  }


  public UpdatePaymentToken declineDuplicates(Boolean declineDuplicates) {
    
    this.declineDuplicates = declineDuplicates;
    return this;
  }

   /**
   * Decline duplicate payment info if client token is supplied.
   * @return declineDuplicates
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "Decline duplicate payment info if client token is supplied.")

  public Boolean getDeclineDuplicates() {
    return declineDuplicates;
  }



  public void setDeclineDuplicates(Boolean declineDuplicates) {
    this.declineDuplicates = declineDuplicates;
  }


  public UpdatePaymentToken paymentCard(PaymentCard paymentCard) {
    
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
    UpdatePaymentToken updatePaymentToken = (UpdatePaymentToken) o;
    return Objects.equals(this.value, updatePaymentToken.value) &&
        Objects.equals(this.reusable, updatePaymentToken.reusable) &&
        Objects.equals(this.declineDuplicates, updatePaymentToken.declineDuplicates) &&
        Objects.equals(this.paymentCard, updatePaymentToken.paymentCard);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, reusable, declineDuplicates, paymentCard);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdatePaymentToken {\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    reusable: ").append(toIndentedString(reusable)).append("\n");
    sb.append("    declineDuplicates: ").append(toIndentedString(declineDuplicates)).append("\n");
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

