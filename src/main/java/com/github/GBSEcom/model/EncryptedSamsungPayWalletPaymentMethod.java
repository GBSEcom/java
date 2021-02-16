/*
 * Payment Gateway API Specification.
 * The documentation here is designed to provide all of the technical guidance required to consume and integrate with our APIs for payment processing. To learn more about our APIs please visit https://docs.firstdata.com/org/gateway.
 *
 * The version of the OpenAPI document: 21.1.0.20210122.001
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.github.GBSEcom.model;

import java.util.Objects;
import java.util.Arrays;
import com.github.GBSEcom.model.EncryptedSamsungPay;
import com.github.GBSEcom.model.EncryptedSamsungPayWalletPaymentMethodAllOf;
import com.github.GBSEcom.model.WalletPaymentMethod;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Wallet payment method containing encrypted Samsung Pay information.
 */
@ApiModel(description = "Wallet payment method containing encrypted Samsung Pay information.")

public class EncryptedSamsungPayWalletPaymentMethod extends WalletPaymentMethod {
  public static final String SERIALIZED_NAME_ENCRYPTED_SAMSUNG_PAY = "encryptedSamsungPay";
  @SerializedName(SERIALIZED_NAME_ENCRYPTED_SAMSUNG_PAY)
  private EncryptedSamsungPay encryptedSamsungPay;


  public EncryptedSamsungPayWalletPaymentMethod encryptedSamsungPay(EncryptedSamsungPay encryptedSamsungPay) {
    
    this.encryptedSamsungPay = encryptedSamsungPay;
    return this;
  }

   /**
   * Get encryptedSamsungPay
   * @return encryptedSamsungPay
  **/
  @ApiModelProperty(required = true, value = "")

  public EncryptedSamsungPay getEncryptedSamsungPay() {
    return encryptedSamsungPay;
  }



  public void setEncryptedSamsungPay(EncryptedSamsungPay encryptedSamsungPay) {
    this.encryptedSamsungPay = encryptedSamsungPay;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EncryptedSamsungPayWalletPaymentMethod encryptedSamsungPayWalletPaymentMethod = (EncryptedSamsungPayWalletPaymentMethod) o;
    return Objects.equals(this.encryptedSamsungPay, encryptedSamsungPayWalletPaymentMethod.encryptedSamsungPay) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(encryptedSamsungPay, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EncryptedSamsungPayWalletPaymentMethod {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    encryptedSamsungPay: ").append(toIndentedString(encryptedSamsungPay)).append("\n");
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

