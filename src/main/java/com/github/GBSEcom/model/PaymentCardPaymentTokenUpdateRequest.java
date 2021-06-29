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
import com.github.GBSEcom.model.UpdatePaymentToken;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Request to update payment token for one or more cards.
 */
@ApiModel(description = "Request to update payment token for one or more cards.")


public class PaymentCardPaymentTokenUpdateRequest {
  public static final String SERIALIZED_NAME_REQUEST_TYPE = "requestType";
  @SerializedName(SERIALIZED_NAME_REQUEST_TYPE)
  private String requestType;

  public static final String SERIALIZED_NAME_STORE_ID = "storeId";
  @SerializedName(SERIALIZED_NAME_STORE_ID)
  private String storeId;

  public static final String SERIALIZED_NAME_PAYMENT_TOKENS = "paymentTokens";
  @SerializedName(SERIALIZED_NAME_PAYMENT_TOKENS)
  private List<UpdatePaymentToken> paymentTokens = new ArrayList<>();

  public PaymentCardPaymentTokenUpdateRequest() {
    this.requestType = this.getClass().getSimpleName();
  }

  public PaymentCardPaymentTokenUpdateRequest requestType(String requestType) {
    
    this.requestType = requestType;
    return this;
  }

   /**
   * Object name of tokenization request.
   * @return requestType
  **/
  @ApiModelProperty(example = "PaymentCardPaymentTokenUpdateRequest", required = true, value = "Object name of tokenization request.")

  public String getRequestType() {
    return requestType;
  }



  public void setRequestType(String requestType) {
    this.requestType = requestType;
  }


  public PaymentCardPaymentTokenUpdateRequest storeId(String storeId) {
    
    this.storeId = storeId;
    return this;
  }

   /**
   * An optional outlet ID for clients that support multiple stores in the same app.
   * @return storeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "12345500000", value = "An optional outlet ID for clients that support multiple stores in the same app.")

  public String getStoreId() {
    return storeId;
  }



  public void setStoreId(String storeId) {
    this.storeId = storeId;
  }


  public PaymentCardPaymentTokenUpdateRequest paymentTokens(List<UpdatePaymentToken> paymentTokens) {
    
    this.paymentTokens = paymentTokens;
    return this;
  }

  public PaymentCardPaymentTokenUpdateRequest addPaymentTokensItem(UpdatePaymentToken paymentTokensItem) {
    this.paymentTokens.add(paymentTokensItem);
    return this;
  }

   /**
   * List of payment tokens to be updated in the request.
   * @return paymentTokens
  **/
  @ApiModelProperty(required = true, value = "List of payment tokens to be updated in the request.")

  public List<UpdatePaymentToken> getPaymentTokens() {
    return paymentTokens;
  }



  public void setPaymentTokens(List<UpdatePaymentToken> paymentTokens) {
    this.paymentTokens = paymentTokens;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentCardPaymentTokenUpdateRequest paymentCardPaymentTokenUpdateRequest = (PaymentCardPaymentTokenUpdateRequest) o;
    return Objects.equals(this.requestType, paymentCardPaymentTokenUpdateRequest.requestType) &&
        Objects.equals(this.storeId, paymentCardPaymentTokenUpdateRequest.storeId) &&
        Objects.equals(this.paymentTokens, paymentCardPaymentTokenUpdateRequest.paymentTokens);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestType, storeId, paymentTokens);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentCardPaymentTokenUpdateRequest {\n");
    sb.append("    requestType: ").append(toIndentedString(requestType)).append("\n");
    sb.append("    storeId: ").append(toIndentedString(storeId)).append("\n");
    sb.append("    paymentTokens: ").append(toIndentedString(paymentTokens)).append("\n");
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

