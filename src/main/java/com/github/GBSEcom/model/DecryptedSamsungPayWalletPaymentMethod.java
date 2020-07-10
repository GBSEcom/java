/*
 * Payment Gateway API Specification.
 * The documentation here is designed to provide all of the technical guidance required to consume and integrate with our APIs for payment processing. To learn more about our APIs please visit https://docs.firstdata.com/org/gateway.
 *
 * The version of the OpenAPI document: 6.12.0.20200605.001
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.github.GBSEcom.model;

import java.util.Objects;
import java.util.Arrays;
import com.github.GBSEcom.model.DecryptedSamsungPay;
import com.github.GBSEcom.model.DecryptedSamsungPayWalletPaymentMethodAllOf;
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
 * Wallet payment method containing decrypted Samsung Pay information.
 */
@ApiModel(description = "Wallet payment method containing decrypted Samsung Pay information.")

public class DecryptedSamsungPayWalletPaymentMethod extends WalletPaymentMethod {
  public static final String SERIALIZED_NAME_DECRYPTED_SAMSUNG_PAY = "decryptedSamsungPay";
  @SerializedName(SERIALIZED_NAME_DECRYPTED_SAMSUNG_PAY)
  private DecryptedSamsungPay decryptedSamsungPay;


  public DecryptedSamsungPayWalletPaymentMethod decryptedSamsungPay(DecryptedSamsungPay decryptedSamsungPay) {
    
    this.decryptedSamsungPay = decryptedSamsungPay;
    return this;
  }

   /**
   * Get decryptedSamsungPay
   * @return decryptedSamsungPay
  **/
  @ApiModelProperty(required = true, value = "")

  public DecryptedSamsungPay getDecryptedSamsungPay() {
    return decryptedSamsungPay;
  }



  public void setDecryptedSamsungPay(DecryptedSamsungPay decryptedSamsungPay) {
    this.decryptedSamsungPay = decryptedSamsungPay;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DecryptedSamsungPayWalletPaymentMethod decryptedSamsungPayWalletPaymentMethod = (DecryptedSamsungPayWalletPaymentMethod) o;
    return Objects.equals(this.decryptedSamsungPay, decryptedSamsungPayWalletPaymentMethod.decryptedSamsungPay) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(decryptedSamsungPay, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DecryptedSamsungPayWalletPaymentMethod {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    decryptedSamsungPay: ").append(toIndentedString(decryptedSamsungPay)).append("\n");
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

