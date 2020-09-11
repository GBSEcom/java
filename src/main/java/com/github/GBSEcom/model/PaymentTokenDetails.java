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
import com.github.GBSEcom.model.CreatePaymentToken;
import com.github.GBSEcom.model.PaymentTokenDetailsAllOf;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Response details for payment token creation.
 */
@ApiModel(description = "Response details for payment token creation.")

public class PaymentTokenDetails {
  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public static final String SERIALIZED_NAME_REUSABLE = "reusable";
  @SerializedName(SERIALIZED_NAME_REUSABLE)
  private Boolean reusable = true;

  public static final String SERIALIZED_NAME_DECLINE_DUPLICATES = "declineDuplicates";
  @SerializedName(SERIALIZED_NAME_DECLINE_DUPLICATES)
  private Boolean declineDuplicates = false;

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


  public PaymentTokenDetails value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * Client-supplied payment token value. Only applicable for DataVault tokenization scheme.
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "234ljl124l12", value = "Client-supplied payment token value. Only applicable for DataVault tokenization scheme.")

  public String getValue() {
    return value;
  }



  public void setValue(String value) {
    this.value = value;
  }


  public PaymentTokenDetails reusable(Boolean reusable) {
    
    this.reusable = reusable;
    return this;
  }

   /**
   * If the token is reusable.
   * @return reusable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "If the token is reusable.")

  public Boolean getReusable() {
    return reusable;
  }



  public void setReusable(Boolean reusable) {
    this.reusable = reusable;
  }


  public PaymentTokenDetails declineDuplicates(Boolean declineDuplicates) {
    
    this.declineDuplicates = declineDuplicates;
    return this;
  }

   /**
   * Decline duplicate payment info if client token is supplied.
   * @return declineDuplicates
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "Decline duplicate payment info if client token is supplied.")

  public Boolean getDeclineDuplicates() {
    return declineDuplicates;
  }



  public void setDeclineDuplicates(Boolean declineDuplicates) {
    this.declineDuplicates = declineDuplicates;
  }


  public PaymentTokenDetails last4(String last4) {
    
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


  public PaymentTokenDetails brand(String brand) {
    
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


  public PaymentTokenDetails accountVerification(Boolean accountVerification) {
    
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


  public PaymentTokenDetails type(String type) {
    
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
    PaymentTokenDetails paymentTokenDetails = (PaymentTokenDetails) o;
    return Objects.equals(this.value, paymentTokenDetails.value) &&
        Objects.equals(this.reusable, paymentTokenDetails.reusable) &&
        Objects.equals(this.declineDuplicates, paymentTokenDetails.declineDuplicates) &&
        Objects.equals(this.last4, paymentTokenDetails.last4) &&
        Objects.equals(this.brand, paymentTokenDetails.brand) &&
        Objects.equals(this.accountVerification, paymentTokenDetails.accountVerification) &&
        Objects.equals(this.type, paymentTokenDetails.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, reusable, declineDuplicates, last4, brand, accountVerification, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentTokenDetails {\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    reusable: ").append(toIndentedString(reusable)).append("\n");
    sb.append("    declineDuplicates: ").append(toIndentedString(declineDuplicates)).append("\n");
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

