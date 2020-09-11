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
import com.github.GBSEcom.model.AccountInfoLookupRequest;
import com.github.GBSEcom.model.PaymentTokenInfoLookupRequestAllOf;
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
 * Used to request card information associated with a payment token.
 */
@ApiModel(description = "Used to request card information associated with a payment token.")

public class PaymentTokenInfoLookupRequest extends AccountInfoLookupRequest {
  public static final String SERIALIZED_NAME_PAYMENT_TOKEN = "paymentToken";
  @SerializedName(SERIALIZED_NAME_PAYMENT_TOKEN)
  private UsePaymentToken paymentToken;


  public PaymentTokenInfoLookupRequest paymentToken(UsePaymentToken paymentToken) {
    
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentTokenInfoLookupRequest paymentTokenInfoLookupRequest = (PaymentTokenInfoLookupRequest) o;
    return Objects.equals(this.paymentToken, paymentTokenInfoLookupRequest.paymentToken) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentToken, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentTokenInfoLookupRequest {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    paymentToken: ").append(toIndentedString(paymentToken)).append("\n");
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

