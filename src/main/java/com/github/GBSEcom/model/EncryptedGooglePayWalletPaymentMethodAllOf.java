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
import com.github.GBSEcom.model.EncryptedGooglePay;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * EncryptedGooglePayWalletPaymentMethodAllOf
 */

public class EncryptedGooglePayWalletPaymentMethodAllOf {
  public static final String SERIALIZED_NAME_ENCRYPTED_GOOGLE_PAY = "encryptedGooglePay";
  @SerializedName(SERIALIZED_NAME_ENCRYPTED_GOOGLE_PAY)
  private EncryptedGooglePay encryptedGooglePay;


  public EncryptedGooglePayWalletPaymentMethodAllOf encryptedGooglePay(EncryptedGooglePay encryptedGooglePay) {
    
    this.encryptedGooglePay = encryptedGooglePay;
    return this;
  }

   /**
   * Get encryptedGooglePay
   * @return encryptedGooglePay
  **/
  @ApiModelProperty(required = true, value = "")

  public EncryptedGooglePay getEncryptedGooglePay() {
    return encryptedGooglePay;
  }



  public void setEncryptedGooglePay(EncryptedGooglePay encryptedGooglePay) {
    this.encryptedGooglePay = encryptedGooglePay;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EncryptedGooglePayWalletPaymentMethodAllOf encryptedGooglePayWalletPaymentMethodAllOf = (EncryptedGooglePayWalletPaymentMethodAllOf) o;
    return Objects.equals(this.encryptedGooglePay, encryptedGooglePayWalletPaymentMethodAllOf.encryptedGooglePay);
  }

  @Override
  public int hashCode() {
    return Objects.hash(encryptedGooglePay);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EncryptedGooglePayWalletPaymentMethodAllOf {\n");
    sb.append("    encryptedGooglePay: ").append(toIndentedString(encryptedGooglePay)).append("\n");
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

