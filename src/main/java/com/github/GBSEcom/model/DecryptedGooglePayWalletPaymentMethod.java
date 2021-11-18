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
import com.github.GBSEcom.model.DecryptedGooglePay;
import com.github.GBSEcom.model.DecryptedGooglePayWalletPaymentMethodAllOf;
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
 * Wallet payment method containing decrypted Google Pay information.
 */
@ApiModel(description = "Wallet payment method containing decrypted Google Pay information.")

public class DecryptedGooglePayWalletPaymentMethod extends WalletPaymentMethod {
  public static final String SERIALIZED_NAME_DECRYPTED_GOOGLE_PAY = "decryptedGooglePay";
  @SerializedName(SERIALIZED_NAME_DECRYPTED_GOOGLE_PAY)
  private DecryptedGooglePay decryptedGooglePay;


  public DecryptedGooglePayWalletPaymentMethod decryptedGooglePay(DecryptedGooglePay decryptedGooglePay) {
    
    this.decryptedGooglePay = decryptedGooglePay;
    return this;
  }

   /**
   * Get decryptedGooglePay
   * @return decryptedGooglePay
  **/
  @ApiModelProperty(required = true, value = "")

  public DecryptedGooglePay getDecryptedGooglePay() {
    return decryptedGooglePay;
  }



  public void setDecryptedGooglePay(DecryptedGooglePay decryptedGooglePay) {
    this.decryptedGooglePay = decryptedGooglePay;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DecryptedGooglePayWalletPaymentMethod decryptedGooglePayWalletPaymentMethod = (DecryptedGooglePayWalletPaymentMethod) o;
    return Objects.equals(this.decryptedGooglePay, decryptedGooglePayWalletPaymentMethod.decryptedGooglePay) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(decryptedGooglePay, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DecryptedGooglePayWalletPaymentMethod {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    decryptedGooglePay: ").append(toIndentedString(decryptedGooglePay)).append("\n");
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

