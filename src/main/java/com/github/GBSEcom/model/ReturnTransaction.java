/*
 * Payment Gateway API Specification.
 * The documentation here is designed to provide all of the technical guidance required to consume and integrate with our APIs for payment processing. To learn more about our APIs please visit https://docs.firstdata.com/org/gateway.
 *
 * The version of the OpenAPI document: 21.2.0.20210406.001
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.github.GBSEcom.model;

import java.util.Objects;
import java.util.Arrays;
import com.github.GBSEcom.model.Amount;
import com.github.GBSEcom.model.CurrencyConversion;
import com.github.GBSEcom.model.Order;
import com.github.GBSEcom.model.ReturnTransactionAllOf;
import com.github.GBSEcom.model.SecondaryTransaction;
import com.github.GBSEcom.model.SoftDescriptor;
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
 * Request to perform return transaction.
 */
@ApiModel(description = "Request to perform return transaction.")

public class ReturnTransaction extends SecondaryTransaction {
  public static final String SERIALIZED_NAME_TRANSACTION_AMOUNT = "transactionAmount";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_AMOUNT)
  private Amount transactionAmount;

  public static final String SERIALIZED_NAME_SOFT_DESCRIPTOR = "softDescriptor";
  @SerializedName(SERIALIZED_NAME_SOFT_DESCRIPTOR)
  private SoftDescriptor softDescriptor;

  public static final String SERIALIZED_NAME_STORED_CREDENTIALS = "storedCredentials";
  @SerializedName(SERIALIZED_NAME_STORED_CREDENTIALS)
  private StoredCredential storedCredentials;

  public static final String SERIALIZED_NAME_CURRENCY_CONVERSION = "currencyConversion";
  @SerializedName(SERIALIZED_NAME_CURRENCY_CONVERSION)
  private CurrencyConversion currencyConversion;


  public ReturnTransaction transactionAmount(Amount transactionAmount) {
    
    this.transactionAmount = transactionAmount;
    return this;
  }

   /**
   * Get transactionAmount
   * @return transactionAmount
  **/
  @ApiModelProperty(required = true, value = "")

  public Amount getTransactionAmount() {
    return transactionAmount;
  }



  public void setTransactionAmount(Amount transactionAmount) {
    this.transactionAmount = transactionAmount;
  }


  public ReturnTransaction softDescriptor(SoftDescriptor softDescriptor) {
    
    this.softDescriptor = softDescriptor;
    return this;
  }

   /**
   * Get softDescriptor
   * @return softDescriptor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SoftDescriptor getSoftDescriptor() {
    return softDescriptor;
  }



  public void setSoftDescriptor(SoftDescriptor softDescriptor) {
    this.softDescriptor = softDescriptor;
  }


  public ReturnTransaction storedCredentials(StoredCredential storedCredentials) {
    
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


  public ReturnTransaction currencyConversion(CurrencyConversion currencyConversion) {
    
    this.currencyConversion = currencyConversion;
    return this;
  }

   /**
   * Get currencyConversion
   * @return currencyConversion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CurrencyConversion getCurrencyConversion() {
    return currencyConversion;
  }



  public void setCurrencyConversion(CurrencyConversion currencyConversion) {
    this.currencyConversion = currencyConversion;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReturnTransaction returnTransaction = (ReturnTransaction) o;
    return Objects.equals(this.transactionAmount, returnTransaction.transactionAmount) &&
        Objects.equals(this.softDescriptor, returnTransaction.softDescriptor) &&
        Objects.equals(this.storedCredentials, returnTransaction.storedCredentials) &&
        Objects.equals(this.currencyConversion, returnTransaction.currencyConversion) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionAmount, softDescriptor, storedCredentials, currencyConversion, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReturnTransaction {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    transactionAmount: ").append(toIndentedString(transactionAmount)).append("\n");
    sb.append("    softDescriptor: ").append(toIndentedString(softDescriptor)).append("\n");
    sb.append("    storedCredentials: ").append(toIndentedString(storedCredentials)).append("\n");
    sb.append("    currencyConversion: ").append(toIndentedString(currencyConversion)).append("\n");
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

