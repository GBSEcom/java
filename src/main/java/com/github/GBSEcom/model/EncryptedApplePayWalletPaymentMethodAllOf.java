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
import com.github.GBSEcom.model.EncryptedApplePay;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * EncryptedApplePayWalletPaymentMethodAllOf
 */

public class EncryptedApplePayWalletPaymentMethodAllOf {
  public static final String SERIALIZED_NAME_ENCRYPTED_APPLE_PAY = "encryptedApplePay";
  @SerializedName(SERIALIZED_NAME_ENCRYPTED_APPLE_PAY)
  private EncryptedApplePay encryptedApplePay;


  public EncryptedApplePayWalletPaymentMethodAllOf encryptedApplePay(EncryptedApplePay encryptedApplePay) {
    
    this.encryptedApplePay = encryptedApplePay;
    return this;
  }

   /**
   * Get encryptedApplePay
   * @return encryptedApplePay
  **/
  @ApiModelProperty(required = true, value = "")

  public EncryptedApplePay getEncryptedApplePay() {
    return encryptedApplePay;
  }



  public void setEncryptedApplePay(EncryptedApplePay encryptedApplePay) {
    this.encryptedApplePay = encryptedApplePay;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EncryptedApplePayWalletPaymentMethodAllOf encryptedApplePayWalletPaymentMethodAllOf = (EncryptedApplePayWalletPaymentMethodAllOf) o;
    return Objects.equals(this.encryptedApplePay, encryptedApplePayWalletPaymentMethodAllOf.encryptedApplePay);
  }

  @Override
  public int hashCode() {
    return Objects.hash(encryptedApplePay);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EncryptedApplePayWalletPaymentMethodAllOf {\n");
    sb.append("    encryptedApplePay: ").append(toIndentedString(encryptedApplePay)).append("\n");
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

