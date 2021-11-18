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
import com.github.GBSEcom.model.StoredCredential;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Decrypted Google Pay payload.
 */
@ApiModel(description = "Decrypted Google Pay payload.")

public class DecryptedGooglePay {
  public static final String SERIALIZED_NAME_ACCOUNT_NUMBER = "accountNumber";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_NUMBER)
  private String accountNumber;

  public static final String SERIALIZED_NAME_EXPIRATION = "expiration";
  @SerializedName(SERIALIZED_NAME_EXPIRATION)
  private String expiration;

  public static final String SERIALIZED_NAME_CARDHOLDER_NAME = "cardholderName";
  @SerializedName(SERIALIZED_NAME_CARDHOLDER_NAME)
  private String cardholderName;

  public static final String SERIALIZED_NAME_BRAND = "brand";
  @SerializedName(SERIALIZED_NAME_BRAND)
  private String brand;

  public static final String SERIALIZED_NAME_CRYPTOGRAM = "cryptogram";
  @SerializedName(SERIALIZED_NAME_CRYPTOGRAM)
  private String cryptogram;

  public static final String SERIALIZED_NAME_ECI_INDICATOR = "eciIndicator";
  @SerializedName(SERIALIZED_NAME_ECI_INDICATOR)
  private String eciIndicator;

  public static final String SERIALIZED_NAME_STORED_CREDENTIALS = "storedCredentials";
  @SerializedName(SERIALIZED_NAME_STORED_CREDENTIALS)
  private StoredCredential storedCredentials;


  public DecryptedGooglePay accountNumber(String accountNumber) {
    
    this.accountNumber = accountNumber;
    return this;
  }

   /**
   * Payment card number.
   * @return accountNumber
  **/
  @ApiModelProperty(example = "4111111111111111", required = true, value = "Payment card number.")

  public String getAccountNumber() {
    return accountNumber;
  }



  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }


  public DecryptedGooglePay expiration(String expiration) {
    
    this.expiration = expiration;
    return this;
  }

   /**
   * Card expiration date in MMYYYY format.
   * @return expiration
  **/
  @ApiModelProperty(example = "012040", required = true, value = "Card expiration date in MMYYYY format.")

  public String getExpiration() {
    return expiration;
  }



  public void setExpiration(String expiration) {
    this.expiration = expiration;
  }


  public DecryptedGooglePay cardholderName(String cardholderName) {
    
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


  public DecryptedGooglePay brand(String brand) {
    
    this.brand = brand;
    return this;
  }

   /**
   * Card brand.
   * @return brand
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "VISA", value = "Card brand.")

  public String getBrand() {
    return brand;
  }



  public void setBrand(String brand) {
    this.brand = brand;
  }


  public DecryptedGooglePay cryptogram(String cryptogram) {
    
    this.cryptogram = cryptogram;
    return this;
  }

   /**
   * The wallet cryptogram from the decrypted data.
   * @return cryptogram
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "BB81SRsADvooHCUcDogjMAACAAA=", value = "The wallet cryptogram from the decrypted data.")

  public String getCryptogram() {
    return cryptogram;
  }



  public void setCryptogram(String cryptogram) {
    this.cryptogram = cryptogram;
  }


  public DecryptedGooglePay eciIndicator(String eciIndicator) {
    
    this.eciIndicator = eciIndicator;
    return this;
  }

   /**
   * The ECI indicator from the decrypted data.
   * @return eciIndicator
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "05", value = "The ECI indicator from the decrypted data.")

  public String getEciIndicator() {
    return eciIndicator;
  }



  public void setEciIndicator(String eciIndicator) {
    this.eciIndicator = eciIndicator;
  }


  public DecryptedGooglePay storedCredentials(StoredCredential storedCredentials) {
    
    this.storedCredentials = storedCredentials;
    return this;
  }

   /**
   * Get storedCredentials
   * @return storedCredentials
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public StoredCredential getStoredCredentials() {
    return storedCredentials;
  }



  public void setStoredCredentials(StoredCredential storedCredentials) {
    this.storedCredentials = storedCredentials;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DecryptedGooglePay decryptedGooglePay = (DecryptedGooglePay) o;
    return Objects.equals(this.accountNumber, decryptedGooglePay.accountNumber) &&
        Objects.equals(this.expiration, decryptedGooglePay.expiration) &&
        Objects.equals(this.cardholderName, decryptedGooglePay.cardholderName) &&
        Objects.equals(this.brand, decryptedGooglePay.brand) &&
        Objects.equals(this.cryptogram, decryptedGooglePay.cryptogram) &&
        Objects.equals(this.eciIndicator, decryptedGooglePay.eciIndicator) &&
        Objects.equals(this.storedCredentials, decryptedGooglePay.storedCredentials);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountNumber, expiration, cardholderName, brand, cryptogram, eciIndicator, storedCredentials);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DecryptedGooglePay {\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    expiration: ").append(toIndentedString(expiration)).append("\n");
    sb.append("    cardholderName: ").append(toIndentedString(cardholderName)).append("\n");
    sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
    sb.append("    cryptogram: ").append(toIndentedString(cryptogram)).append("\n");
    sb.append("    eciIndicator: ").append(toIndentedString(eciIndicator)).append("\n");
    sb.append("    storedCredentials: ").append(toIndentedString(storedCredentials)).append("\n");
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

