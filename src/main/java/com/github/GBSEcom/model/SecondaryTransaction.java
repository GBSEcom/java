/*
 * Payment Gateway API Specification.
 * Payment Gateway API for payment processing. Version 6.4.0.20181018.001 
 *
 * OpenAPI spec version: 6.4.0.20181018.001
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
import com.github.GBSEcom.model.SecondaryTransactionAdditionalDetails;
import com.github.GBSEcom.model.SoftDescriptor;
import com.github.GBSEcom.model.SplitShipment;
import com.github.GBSEcom.model.TransactionOrigin;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Model for secondary financial transactions
 */
@ApiModel(description = "Model for secondary financial transactions")

public class SecondaryTransaction {
  public static final String SERIALIZED_NAME_TRANSACTION_ORIGIN = "transactionOrigin";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_ORIGIN)
  private TransactionOrigin transactionOrigin = null;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Amount amount = null;

  public static final String SERIALIZED_NAME_SPLIT_SHIPMENT = "splitShipment";
  @SerializedName(SERIALIZED_NAME_SPLIT_SHIPMENT)
  private SplitShipment splitShipment = null;

  public static final String SERIALIZED_NAME_SOFT_DESCRIPTOR = "softDescriptor";
  @SerializedName(SERIALIZED_NAME_SOFT_DESCRIPTOR)
  private SoftDescriptor softDescriptor = null;

  public static final String SERIALIZED_NAME_ADDITIONAL_DETAILS = "additionalDetails";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_DETAILS)
  private SecondaryTransactionAdditionalDetails additionalDetails = null;

  public SecondaryTransaction transactionOrigin(TransactionOrigin transactionOrigin) {
    this.transactionOrigin = transactionOrigin;
    return this;
  }

   /**
   * Get transactionOrigin
   * @return transactionOrigin
  **/
  @ApiModelProperty(value = "")
  public TransactionOrigin getTransactionOrigin() {
    return transactionOrigin;
  }

  public void setTransactionOrigin(TransactionOrigin transactionOrigin) {
    this.transactionOrigin = transactionOrigin;
  }

  public SecondaryTransaction amount(Amount amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(value = "")
  public Amount getAmount() {
    return amount;
  }

  public void setAmount(Amount amount) {
    this.amount = amount;
  }

  public SecondaryTransaction splitShipment(SplitShipment splitShipment) {
    this.splitShipment = splitShipment;
    return this;
  }

   /**
   * Get splitShipment
   * @return splitShipment
  **/
  @ApiModelProperty(value = "")
  public SplitShipment getSplitShipment() {
    return splitShipment;
  }

  public void setSplitShipment(SplitShipment splitShipment) {
    this.splitShipment = splitShipment;
  }

  public SecondaryTransaction softDescriptor(SoftDescriptor softDescriptor) {
    this.softDescriptor = softDescriptor;
    return this;
  }

   /**
   * Get softDescriptor
   * @return softDescriptor
  **/
  @ApiModelProperty(value = "")
  public SoftDescriptor getSoftDescriptor() {
    return softDescriptor;
  }

  public void setSoftDescriptor(SoftDescriptor softDescriptor) {
    this.softDescriptor = softDescriptor;
  }

  public SecondaryTransaction additionalDetails(SecondaryTransactionAdditionalDetails additionalDetails) {
    this.additionalDetails = additionalDetails;
    return this;
  }

   /**
   * Get additionalDetails
   * @return additionalDetails
  **/
  @ApiModelProperty(value = "")
  public SecondaryTransactionAdditionalDetails getAdditionalDetails() {
    return additionalDetails;
  }

  public void setAdditionalDetails(SecondaryTransactionAdditionalDetails additionalDetails) {
    this.additionalDetails = additionalDetails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecondaryTransaction secondaryTransaction = (SecondaryTransaction) o;
    return Objects.equals(this.transactionOrigin, secondaryTransaction.transactionOrigin) &&
        Objects.equals(this.amount, secondaryTransaction.amount) &&
        Objects.equals(this.splitShipment, secondaryTransaction.splitShipment) &&
        Objects.equals(this.softDescriptor, secondaryTransaction.softDescriptor) &&
        Objects.equals(this.additionalDetails, secondaryTransaction.additionalDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionOrigin, amount, splitShipment, softDescriptor, additionalDetails);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecondaryTransaction {\n");
    
    sb.append("    transactionOrigin: ").append(toIndentedString(transactionOrigin)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    splitShipment: ").append(toIndentedString(splitShipment)).append("\n");
    sb.append("    softDescriptor: ").append(toIndentedString(softDescriptor)).append("\n");
    sb.append("    additionalDetails: ").append(toIndentedString(additionalDetails)).append("\n");
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

