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
import com.github.GBSEcom.model.PayPal;
import com.github.GBSEcom.model.PayPalPaymentMethodAllOf;
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
 * Payment method containing PayPal information.
 */
@ApiModel(description = "Payment method containing PayPal information.")

public class PayPalPaymentMethod {
  public static final String SERIALIZED_NAME_PAY_PAL = "payPal";
  @SerializedName(SERIALIZED_NAME_PAY_PAL)
  private PayPal payPal;


  public PayPalPaymentMethod payPal(PayPal payPal) {
    
    this.payPal = payPal;
    return this;
  }

   /**
   * Get payPal
   * @return payPal
  **/
  @ApiModelProperty(required = true, value = "")

  public PayPal getPayPal() {
    return payPal;
  }



  public void setPayPal(PayPal payPal) {
    this.payPal = payPal;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayPalPaymentMethod payPalPaymentMethod = (PayPalPaymentMethod) o;
    return Objects.equals(this.payPal, payPalPaymentMethod.payPal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payPal);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayPalPaymentMethod {\n");
    sb.append("    payPal: ").append(toIndentedString(payPal)).append("\n");
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

