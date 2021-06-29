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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PaymentTokenDetailsAllOf
 */

public class PaymentTokenDetailsAllOf {
  public static final String SERIALIZED_NAME_LAST4 = "last4";
  @SerializedName(SERIALIZED_NAME_LAST4)
  private String last4;

  public static final String SERIALIZED_NAME_BRAND = "brand";
  @SerializedName(SERIALIZED_NAME_BRAND)
  private String brand;

  public static final String SERIALIZED_NAME_ACCOUNT_VERIFICATION = "accountVerification";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_VERIFICATION)
  private Boolean accountVerification;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;


  public PaymentTokenDetailsAllOf last4(String last4) {
    
    this.last4 = last4;
    return this;
  }

   /**
   * The last 4 numbers of a payment card.
   * @return last4
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "4997", value = "The last 4 numbers of a payment card.")

  public String getLast4() {
    return last4;
  }



  public void setLast4(String last4) {
    this.last4 = last4;
  }


  public PaymentTokenDetailsAllOf brand(String brand) {
    
    this.brand = brand;
    return this;
  }

   /**
   * Card brand, only for tokenization with payment.
   * @return brand
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "VISA", value = "Card brand, only for tokenization with payment.")

  public String getBrand() {
    return brand;
  }



  public void setBrand(String brand) {
    this.brand = brand;
  }


  public PaymentTokenDetailsAllOf accountVerification(Boolean accountVerification) {
    
    this.accountVerification = accountVerification;
    return this;
  }

   /**
   * If the account the token was created from has been verified.
   * @return accountVerification
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "If the account the token was created from has been verified.")

  public Boolean getAccountVerification() {
    return accountVerification;
  }



  public void setAccountVerification(Boolean accountVerification) {
    this.accountVerification = accountVerification;
  }


  public PaymentTokenDetailsAllOf type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Inidcates the type of tokenization source.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "PAYMENT_CARD", value = "Inidcates the type of tokenization source.")

  public String getType() {
    return type;
  }



  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentTokenDetailsAllOf paymentTokenDetailsAllOf = (PaymentTokenDetailsAllOf) o;
    return Objects.equals(this.last4, paymentTokenDetailsAllOf.last4) &&
        Objects.equals(this.brand, paymentTokenDetailsAllOf.brand) &&
        Objects.equals(this.accountVerification, paymentTokenDetailsAllOf.accountVerification) &&
        Objects.equals(this.type, paymentTokenDetailsAllOf.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(last4, brand, accountVerification, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentTokenDetailsAllOf {\n");
    sb.append("    last4: ").append(toIndentedString(last4)).append("\n");
    sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
    sb.append("    accountVerification: ").append(toIndentedString(accountVerification)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

