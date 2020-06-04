/*
 * Payment Gateway API Specification.
 * The documentation here is designed to provide all of the technical guidance required to consume and integrate with our APIs for payment processing. To learn more about our APIs please visit https://docs.firstdata.com/org/gateway.
 *
 * The version of the OpenAPI document: 6.8.0.20190731.002
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
 * Properties for the payment method.
 */
@ApiModel(description = "Properties for the payment method.")

public class Card {
  public static final String SERIALIZED_NAME_TA_TOKEN = "taToken";
  @SerializedName(SERIALIZED_NAME_TA_TOKEN)
  private String taToken;

  public static final String SERIALIZED_NAME_TA_TOKEN_KEY = "taTokenKey";
  @SerializedName(SERIALIZED_NAME_TA_TOKEN_KEY)
  private String taTokenKey;

  public static final String SERIALIZED_NAME_CARDHOLDER_NAME = "cardholderName";
  @SerializedName(SERIALIZED_NAME_CARDHOLDER_NAME)
  private String cardholderName;

  public static final String SERIALIZED_NAME_CARD_NUMBER = "cardNumber";
  @SerializedName(SERIALIZED_NAME_CARD_NUMBER)
  private String cardNumber;

  public static final String SERIALIZED_NAME_EXP_DATE = "expDate";
  @SerializedName(SERIALIZED_NAME_EXP_DATE)
  private String expDate;

  public static final String SERIALIZED_NAME_CVV = "cvv";
  @SerializedName(SERIALIZED_NAME_CVV)
  private String cvv;

  public static final String SERIALIZED_NAME_ISSUER = "issuer";
  @SerializedName(SERIALIZED_NAME_ISSUER)
  private String issuer;

  public static final String SERIALIZED_NAME_CARD_REISSUED_NUMBER = "cardReissuedNumber";
  @SerializedName(SERIALIZED_NAME_CARD_REISSUED_NUMBER)
  private String cardReissuedNumber;


  public Card taToken(String taToken) {
    
    this.taToken = taToken;
    return this;
  }

   /**
   * TransArmor token value. Either the token fields or card number field must contain a value.
   * @return taToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "7591787425749818", value = "TransArmor token value. Either the token fields or card number field must contain a value.")

  public String getTaToken() {
    return taToken;
  }



  public void setTaToken(String taToken) {
    this.taToken = taToken;
  }


  public Card taTokenKey(String taTokenKey) {
    
    this.taTokenKey = taTokenKey;
    return this;
  }

   /**
   * TransArmor token key to identify the merchant.
   * @return taTokenKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ab56", value = "TransArmor token key to identify the merchant.")

  public String getTaTokenKey() {
    return taTokenKey;
  }



  public void setTaTokenKey(String taTokenKey) {
    this.taTokenKey = taTokenKey;
  }


  public Card cardholderName(String cardholderName) {
    
    this.cardholderName = cardholderName;
    return this;
  }

   /**
   * The cardholder name as it appears on the card.
   * @return cardholderName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "John F. Doe", value = "The cardholder name as it appears on the card.")

  public String getCardholderName() {
    return cardholderName;
  }



  public void setCardholderName(String cardholderName) {
    this.cardholderName = cardholderName;
  }


  public Card cardNumber(String cardNumber) {
    
    this.cardNumber = cardNumber;
    return this;
  }

   /**
   * Use this field to send clear PAN or tokens other than TransArmor Token.
   * @return cardNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "5424180279791732", value = "Use this field to send clear PAN or tokens other than TransArmor Token.")

  public String getCardNumber() {
    return cardNumber;
  }



  public void setCardNumber(String cardNumber) {
    this.cardNumber = cardNumber;
  }


  public Card expDate(String expDate) {
    
    this.expDate = expDate;
    return this;
  }

   /**
   * Payment method expiration date. Format is MMYYYY.
   * @return expDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "122028", value = "Payment method expiration date. Format is MMYYYY.")

  public String getExpDate() {
    return expDate;
  }



  public void setExpDate(String expDate) {
    this.expDate = expDate;
  }


  public Card cvv(String cvv) {
    
    this.cvv = cvv;
    return this;
  }

   /**
   * CVV present indicator.
   * @return cvv
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Y", value = "CVV present indicator.")

  public String getCvv() {
    return cvv;
  }



  public void setCvv(String cvv) {
    this.cvv = cvv;
  }


  public Card issuer(String issuer) {
    
    this.issuer = issuer;
    return this;
  }

   /**
   * The company (usually a bank) that issued the card.
   * @return issuer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Bank of America", value = "The company (usually a bank) that issued the card.")

  public String getIssuer() {
    return issuer;
  }



  public void setIssuer(String issuer) {
    this.issuer = issuer;
  }


  public Card cardReissuedNumber(String cardReissuedNumber) {
    
    this.cardReissuedNumber = cardReissuedNumber;
    return this;
  }

   /**
   * A number that distinguishes between two plastic cards with the same card number in the event of the card being re-issued.
   * @return cardReissuedNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2", value = "A number that distinguishes between two plastic cards with the same card number in the event of the card being re-issued.")

  public String getCardReissuedNumber() {
    return cardReissuedNumber;
  }



  public void setCardReissuedNumber(String cardReissuedNumber) {
    this.cardReissuedNumber = cardReissuedNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Card card = (Card) o;
    return Objects.equals(this.taToken, card.taToken) &&
        Objects.equals(this.taTokenKey, card.taTokenKey) &&
        Objects.equals(this.cardholderName, card.cardholderName) &&
        Objects.equals(this.cardNumber, card.cardNumber) &&
        Objects.equals(this.expDate, card.expDate) &&
        Objects.equals(this.cvv, card.cvv) &&
        Objects.equals(this.issuer, card.issuer) &&
        Objects.equals(this.cardReissuedNumber, card.cardReissuedNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(taToken, taTokenKey, cardholderName, cardNumber, expDate, cvv, issuer, cardReissuedNumber);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Card {\n");
    sb.append("    taToken: ").append(toIndentedString(taToken)).append("\n");
    sb.append("    taTokenKey: ").append(toIndentedString(taTokenKey)).append("\n");
    sb.append("    cardholderName: ").append(toIndentedString(cardholderName)).append("\n");
    sb.append("    cardNumber: ").append(toIndentedString(cardNumber)).append("\n");
    sb.append("    expDate: ").append(toIndentedString(expDate)).append("\n");
    sb.append("    cvv: ").append(toIndentedString(cvv)).append("\n");
    sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
    sb.append("    cardReissuedNumber: ").append(toIndentedString(cardReissuedNumber)).append("\n");
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

