/*
 * Payment Gateway API Specification.
 * The documentation here is designed to provide all of the technical guidance required to consume and integrate with our APIs for payment processing. To learn more about our APIs please visit https://docs.firstdata.com/org/gateway.
 *
 * OpenAPI spec version: 6.10.1.20200226.002
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
 * A JSON object that holds info about the payment registration card.
 */
@ApiModel(description = "A JSON object that holds info about the payment registration card.")

public class FraudRegistrationCard {
  public static final String SERIALIZED_NAME_CARDHOLDER_NAME = "cardholderName";
  @SerializedName(SERIALIZED_NAME_CARDHOLDER_NAME)
  private String cardholderName;

  public static final String SERIALIZED_NAME_CARD_NUMBER = "cardNumber";
  @SerializedName(SERIALIZED_NAME_CARD_NUMBER)
  private String cardNumber;

  public static final String SERIALIZED_NAME_EXP_DATE = "expDate";
  @SerializedName(SERIALIZED_NAME_EXP_DATE)
  private String expDate;

  public static final String SERIALIZED_NAME_CVV_PRESENT = "cvvPresent";
  @SerializedName(SERIALIZED_NAME_CVV_PRESENT)
  private String cvvPresent;

  public static final String SERIALIZED_NAME_ISSUER = "issuer";
  @SerializedName(SERIALIZED_NAME_ISSUER)
  private String issuer;

  public static final String SERIALIZED_NAME_CARD_REISSUED_NUMBER = "cardReissuedNumber";
  @SerializedName(SERIALIZED_NAME_CARD_REISSUED_NUMBER)
  private String cardReissuedNumber;

  public FraudRegistrationCard cardholderName(String cardholderName) {
    this.cardholderName = cardholderName;
    return this;
  }

   /**
   * The cardholder name as it appears on the card.
   * @return cardholderName
  **/
  @ApiModelProperty(example = "John F. Doe", value = "The cardholder name as it appears on the card.")
  public String getCardholderName() {
    return cardholderName;
  }

  public void setCardholderName(String cardholderName) {
    this.cardholderName = cardholderName;
  }

  public FraudRegistrationCard cardNumber(String cardNumber) {
    this.cardNumber = cardNumber;
    return this;
  }

   /**
   * Use this field to send clear PAN or tokens other than TransArmor Token.
   * @return cardNumber
  **/
  @ApiModelProperty(example = "5424180279791732", value = "Use this field to send clear PAN or tokens other than TransArmor Token.")
  public String getCardNumber() {
    return cardNumber;
  }

  public void setCardNumber(String cardNumber) {
    this.cardNumber = cardNumber;
  }

  public FraudRegistrationCard expDate(String expDate) {
    this.expDate = expDate;
    return this;
  }

   /**
   * Payment method expiration date. Format is MMYYYY.
   * @return expDate
  **/
  @ApiModelProperty(example = "122028", value = "Payment method expiration date. Format is MMYYYY.")
  public String getExpDate() {
    return expDate;
  }

  public void setExpDate(String expDate) {
    this.expDate = expDate;
  }

  public FraudRegistrationCard cvvPresent(String cvvPresent) {
    this.cvvPresent = cvvPresent;
    return this;
  }

   /**
   * CVV present indicator.
   * @return cvvPresent
  **/
  @ApiModelProperty(example = "Y", value = "CVV present indicator.")
  public String getCvvPresent() {
    return cvvPresent;
  }

  public void setCvvPresent(String cvvPresent) {
    this.cvvPresent = cvvPresent;
  }

  public FraudRegistrationCard issuer(String issuer) {
    this.issuer = issuer;
    return this;
  }

   /**
   * The company (usually a bank) that issued the card.
   * @return issuer
  **/
  @ApiModelProperty(example = "Bank of America", value = "The company (usually a bank) that issued the card.")
  public String getIssuer() {
    return issuer;
  }

  public void setIssuer(String issuer) {
    this.issuer = issuer;
  }

  public FraudRegistrationCard cardReissuedNumber(String cardReissuedNumber) {
    this.cardReissuedNumber = cardReissuedNumber;
    return this;
  }

   /**
   * A number that distinguishes between two plastic cards with the same card number in the event of the card being re-issued.
   * @return cardReissuedNumber
  **/
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
    FraudRegistrationCard fraudRegistrationCard = (FraudRegistrationCard) o;
    return Objects.equals(this.cardholderName, fraudRegistrationCard.cardholderName) &&
        Objects.equals(this.cardNumber, fraudRegistrationCard.cardNumber) &&
        Objects.equals(this.expDate, fraudRegistrationCard.expDate) &&
        Objects.equals(this.cvvPresent, fraudRegistrationCard.cvvPresent) &&
        Objects.equals(this.issuer, fraudRegistrationCard.issuer) &&
        Objects.equals(this.cardReissuedNumber, fraudRegistrationCard.cardReissuedNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cardholderName, cardNumber, expDate, cvvPresent, issuer, cardReissuedNumber);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FraudRegistrationCard {\n");
    
    sb.append("    cardholderName: ").append(toIndentedString(cardholderName)).append("\n");
    sb.append("    cardNumber: ").append(toIndentedString(cardNumber)).append("\n");
    sb.append("    expDate: ").append(toIndentedString(expDate)).append("\n");
    sb.append("    cvvPresent: ").append(toIndentedString(cvvPresent)).append("\n");
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

