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
import com.github.GBSEcom.model.Amount;
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
 * PostAuthTransactionAllOf
 */

public class PostAuthTransactionAllOf {
  public static final String SERIALIZED_NAME_TRANSACTION_AMOUNT = "transactionAmount";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_AMOUNT)
  private Amount transactionAmount;

  public static final String SERIALIZED_NAME_TRANSACTION_ORIGIN = "transactionOrigin";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_ORIGIN)
  private TransactionOrigin transactionOrigin;

  public static final String SERIALIZED_NAME_SPLIT_SHIPMENT = "splitShipment";
  @SerializedName(SERIALIZED_NAME_SPLIT_SHIPMENT)
  private SplitShipment splitShipment;

  public static final String SERIALIZED_NAME_SOFT_DESCRIPTOR = "softDescriptor";
  @SerializedName(SERIALIZED_NAME_SOFT_DESCRIPTOR)
  private SoftDescriptor softDescriptor;


  public PostAuthTransactionAllOf transactionAmount(Amount transactionAmount) {
    
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


  public PostAuthTransactionAllOf transactionOrigin(TransactionOrigin transactionOrigin) {
    
    this.transactionOrigin = transactionOrigin;
    return this;
  }

   /**
   * Get transactionOrigin
   * @return transactionOrigin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TransactionOrigin getTransactionOrigin() {
    return transactionOrigin;
  }



  public void setTransactionOrigin(TransactionOrigin transactionOrigin) {
    this.transactionOrigin = transactionOrigin;
  }


  public PostAuthTransactionAllOf splitShipment(SplitShipment splitShipment) {
    
    this.splitShipment = splitShipment;
    return this;
  }

   /**
   * Get splitShipment
   * @return splitShipment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SplitShipment getSplitShipment() {
    return splitShipment;
  }



  public void setSplitShipment(SplitShipment splitShipment) {
    this.splitShipment = splitShipment;
  }


  public PostAuthTransactionAllOf softDescriptor(SoftDescriptor softDescriptor) {
    
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostAuthTransactionAllOf postAuthTransactionAllOf = (PostAuthTransactionAllOf) o;
    return Objects.equals(this.transactionAmount, postAuthTransactionAllOf.transactionAmount) &&
        Objects.equals(this.transactionOrigin, postAuthTransactionAllOf.transactionOrigin) &&
        Objects.equals(this.splitShipment, postAuthTransactionAllOf.splitShipment) &&
        Objects.equals(this.softDescriptor, postAuthTransactionAllOf.softDescriptor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionAmount, transactionOrigin, splitShipment, softDescriptor);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostAuthTransactionAllOf {\n");
    sb.append("    transactionAmount: ").append(toIndentedString(transactionAmount)).append("\n");
    sb.append("    transactionOrigin: ").append(toIndentedString(transactionOrigin)).append("\n");
    sb.append("    splitShipment: ").append(toIndentedString(splitShipment)).append("\n");
    sb.append("    softDescriptor: ").append(toIndentedString(softDescriptor)).append("\n");
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

