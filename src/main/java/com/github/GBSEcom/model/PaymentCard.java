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
import com.github.GBSEcom.model.CardFunction;
import com.github.GBSEcom.model.Expiration;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Payment card model.
 */
@ApiModel(description = "Payment card model.")

public class PaymentCard {
  public static final String SERIALIZED_NAME_NUMBER = "number";
  @SerializedName(SERIALIZED_NAME_NUMBER)
  private String number;

  public static final String SERIALIZED_NAME_EXPIRY_DATE = "expiryDate";
  @SerializedName(SERIALIZED_NAME_EXPIRY_DATE)
  private Expiration expiryDate;

  public static final String SERIALIZED_NAME_SECURITY_CODE = "securityCode";
  @SerializedName(SERIALIZED_NAME_SECURITY_CODE)
  private String securityCode;

  public static final String SERIALIZED_NAME_CARD_FUNCTION = "cardFunction";
  @SerializedName(SERIALIZED_NAME_CARD_FUNCTION)
  private CardFunction cardFunction;

  public static final String SERIALIZED_NAME_CARDHOLDER_NAME = "cardholderName";
  @SerializedName(SERIALIZED_NAME_CARDHOLDER_NAME)
  private String cardholderName;

  public static final String SERIALIZED_NAME_BIN = "bin";
  @SerializedName(SERIALIZED_NAME_BIN)
  private String bin;

  public static final String SERIALIZED_NAME_LAST4 = "last4";
  @SerializedName(SERIALIZED_NAME_LAST4)
  private String last4;

  public static final String SERIALIZED_NAME_BRAND = "brand";
  @SerializedName(SERIALIZED_NAME_BRAND)
  private String brand;


  public PaymentCard number(String number) {
    
    this.number = number;
    return this;
  }

   /**
   * Payment card number.
   * @return number
  **/
  @ApiModelProperty(example = "5424180279791732", required = true, value = "Payment card number.")

  public String getNumber() {
    return number;
  }



  public void setNumber(String number) {
    this.number = number;
  }


  public PaymentCard expiryDate(Expiration expiryDate) {
    
    this.expiryDate = expiryDate;
    return this;
  }

   /**
   * Get expiryDate
   * @return expiryDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Expiration getExpiryDate() {
    return expiryDate;
  }



  public void setExpiryDate(Expiration expiryDate) {
    this.expiryDate = expiryDate;
  }


  public PaymentCard securityCode(String securityCode) {
    
    this.securityCode = securityCode;
    return this;
  }

   /**
   * Card verification value/number.
   * @return securityCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "977", value = "Card verification value/number.")

  public String getSecurityCode() {
    return securityCode;
  }



  public void setSecurityCode(String securityCode) {
    this.securityCode = securityCode;
  }


  public PaymentCard cardFunction(CardFunction cardFunction) {
    
    this.cardFunction = cardFunction;
    return this;
  }

   /**
   * Get cardFunction
   * @return cardFunction
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CardFunction getCardFunction() {
    return cardFunction;
  }



  public void setCardFunction(CardFunction cardFunction) {
    this.cardFunction = cardFunction;
  }


  public PaymentCard cardholderName(String cardholderName) {
    
    this.cardholderName = cardholderName;
    return this;
  }

   /**
   * Name of the cardholder.
   * @return cardholderName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "John Doe", value = "Name of the cardholder.")

  public String getCardholderName() {
    return cardholderName;
  }



  public void setCardholderName(String cardholderName) {
    this.cardholderName = cardholderName;
  }


  public PaymentCard bin(String bin) {
    
    this.bin = bin;
    return this;
  }

   /**
   * The payment card BIN.
   * @return bin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "403587", value = "The payment card BIN.")

  public String getBin() {
    return bin;
  }



  public void setBin(String bin) {
    this.bin = bin;
  }


  public PaymentCard last4(String last4) {
    
    this.last4 = last4;
    return this;
  }

   /**
   * The last 4 numbers of a payment card.
   * @return last4
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "4977", value = "The last 4 numbers of a payment card.")

  public String getLast4() {
    return last4;
  }



  public void setLast4(String last4) {
    this.last4 = last4;
  }


  public PaymentCard brand(String brand) {
    
    this.brand = brand;
    return this;
  }

   /**
   * Required only if using dual branded card.
   * @return brand
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "VISA", value = "Required only if using dual branded card.")

  public String getBrand() {
    return brand;
  }



  public void setBrand(String brand) {
    this.brand = brand;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentCard paymentCard = (PaymentCard) o;
    return Objects.equals(this.number, paymentCard.number) &&
        Objects.equals(this.expiryDate, paymentCard.expiryDate) &&
        Objects.equals(this.securityCode, paymentCard.securityCode) &&
        Objects.equals(this.cardFunction, paymentCard.cardFunction) &&
        Objects.equals(this.cardholderName, paymentCard.cardholderName) &&
        Objects.equals(this.bin, paymentCard.bin) &&
        Objects.equals(this.last4, paymentCard.last4) &&
        Objects.equals(this.brand, paymentCard.brand);
  }

  @Override
  public int hashCode() {
    return Objects.hash(number, expiryDate, securityCode, cardFunction, cardholderName, bin, last4, brand);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentCard {\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    expiryDate: ").append(toIndentedString(expiryDate)).append("\n");
    sb.append("    securityCode: ").append(toIndentedString(securityCode)).append("\n");
    sb.append("    cardFunction: ").append(toIndentedString(cardFunction)).append("\n");
    sb.append("    cardholderName: ").append(toIndentedString(cardholderName)).append("\n");
    sb.append("    bin: ").append(toIndentedString(bin)).append("\n");
    sb.append("    last4: ").append(toIndentedString(last4)).append("\n");
    sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
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

