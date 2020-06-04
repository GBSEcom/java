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
import com.github.GBSEcom.model.AliPay;
import com.github.GBSEcom.model.AliPayPaymentMethodAllOf;
import com.github.GBSEcom.model.PaymentMethod;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Payment method containing AliPay information.
 */
@ApiModel(description = "Payment method containing AliPay information.")

public class AliPayPaymentMethod {
  public static final String SERIALIZED_NAME_ALI_PAY = "aliPay";
  @SerializedName(SERIALIZED_NAME_ALI_PAY)
  private AliPay aliPay;


  public AliPayPaymentMethod aliPay(AliPay aliPay) {
    
    this.aliPay = aliPay;
    return this;
  }

   /**
   * Get aliPay
   * @return aliPay
  **/
  @ApiModelProperty(required = true, value = "")

  public AliPay getAliPay() {
    return aliPay;
  }



  public void setAliPay(AliPay aliPay) {
    this.aliPay = aliPay;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AliPayPaymentMethod aliPayPaymentMethod = (AliPayPaymentMethod) o;
    return Objects.equals(this.aliPay, aliPayPaymentMethod.aliPay);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aliPay);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AliPayPaymentMethod {\n");
    sb.append("    aliPay: ").append(toIndentedString(aliPay)).append("\n");
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

