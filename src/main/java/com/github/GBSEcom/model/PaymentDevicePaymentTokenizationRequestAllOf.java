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
import com.github.GBSEcom.model.PaymentDevice;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PaymentDevicePaymentTokenizationRequestAllOf
 */

public class PaymentDevicePaymentTokenizationRequestAllOf {
  public static final String SERIALIZED_NAME_PAYMENT_DEVICE = "paymentDevice";
  @SerializedName(SERIALIZED_NAME_PAYMENT_DEVICE)
  private PaymentDevice paymentDevice;


  public PaymentDevicePaymentTokenizationRequestAllOf paymentDevice(PaymentDevice paymentDevice) {
    
    this.paymentDevice = paymentDevice;
    return this;
  }

   /**
   * Get paymentDevice
   * @return paymentDevice
  **/
  @ApiModelProperty(required = true, value = "")

  public PaymentDevice getPaymentDevice() {
    return paymentDevice;
  }



  public void setPaymentDevice(PaymentDevice paymentDevice) {
    this.paymentDevice = paymentDevice;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentDevicePaymentTokenizationRequestAllOf paymentDevicePaymentTokenizationRequestAllOf = (PaymentDevicePaymentTokenizationRequestAllOf) o;
    return Objects.equals(this.paymentDevice, paymentDevicePaymentTokenizationRequestAllOf.paymentDevice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentDevice);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentDevicePaymentTokenizationRequestAllOf {\n");
    sb.append("    paymentDevice: ").append(toIndentedString(paymentDevice)).append("\n");
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

