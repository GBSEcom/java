/*
 * Payment Gateway API Specification.
 * The documentation here is designed to provide all of the technical guidance required to consume and integrate with our APIs for payment processing. To learn more about our APIs please visit https://docs.firstdata.com/org/gateway.
 *
 * The version of the OpenAPI document: 21.3.0.20210608.001
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
 * Request to look up card-related information such as issuer country, card function and card brand.
 */
@ApiModel(description = "Request to look up card-related information such as issuer country, card function and card brand.")

public class CardInfoLookupRequest {
  public static final String SERIALIZED_NAME_STORE_ID = "storeId";
  @SerializedName(SERIALIZED_NAME_STORE_ID)
  private String storeId;

  public static final String SERIALIZED_NAME_PAYMENT_CARD = "paymentCard";
  @SerializedName(SERIALIZED_NAME_PAYMENT_CARD)
  private PaymentCard paymentCard;


  public CardInfoLookupRequest storeId(String storeId) {
    
    this.storeId = storeId;
    return this;
  }

   /**
   * An optional outlet id for clients that support multiple stores in the same developer app.
   * @return storeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "12345500000", value = "An optional outlet id for clients that support multiple stores in the same developer app.")

  public String getStoreId() {
    return storeId;
  }



  public void setStoreId(String storeId) {
    this.storeId = storeId;
  }


  public CardInfoLookupRequest paymentCard(PaymentCard paymentCard) {
    
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
    CardInfoLookupRequest cardInfoLookupRequest = (CardInfoLookupRequest) o;
    return Objects.equals(this.storeId, cardInfoLookupRequest.storeId) &&
        Objects.equals(this.paymentCard, cardInfoLookupRequest.paymentCard);
  }

  @Override
  public int hashCode() {
    return Objects.hash(storeId, paymentCard);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardInfoLookupRequest {\n");
    sb.append("    storeId: ").append(toIndentedString(storeId)).append("\n");
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

