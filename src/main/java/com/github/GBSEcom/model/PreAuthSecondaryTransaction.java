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
import com.github.GBSEcom.model.Amount;
import com.github.GBSEcom.model.Order;
import com.github.GBSEcom.model.PreAuthSecondaryTransactionAllOf;
import com.github.GBSEcom.model.SecondaryTransaction;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Request to perform pre-auth incremental secondary transaction without providing credit card information.
 */
@ApiModel(description = "Request to perform pre-auth incremental secondary transaction without providing credit card information.")

public class PreAuthSecondaryTransaction extends SecondaryTransaction {
  public static final String SERIALIZED_NAME_TRANSACTION_AMOUNT = "transactionAmount";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_AMOUNT)
  private Amount transactionAmount;

  public static final String SERIALIZED_NAME_DECREMENTAL_FLAG = "decrementalFlag";
  @SerializedName(SERIALIZED_NAME_DECREMENTAL_FLAG)
  private Boolean decrementalFlag = false;


  public PreAuthSecondaryTransaction transactionAmount(Amount transactionAmount) {
    
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


  public PreAuthSecondaryTransaction decrementalFlag(Boolean decrementalFlag) {
    
    this.decrementalFlag = decrementalFlag;
    return this;
  }

   /**
   * This flag can only be used in a preAuth transaction that updates the amount of a previous preAuth transaction to either increase the preAuth amount (DecrementalPreAuthFlag &#x3D; false) or decrease the preAuth amount (DecrementalPreAuthFlag &#x3D; true).
   * @return decrementalFlag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "This flag can only be used in a preAuth transaction that updates the amount of a previous preAuth transaction to either increase the preAuth amount (DecrementalPreAuthFlag = false) or decrease the preAuth amount (DecrementalPreAuthFlag = true).")

  public Boolean getDecrementalFlag() {
    return decrementalFlag;
  }



  public void setDecrementalFlag(Boolean decrementalFlag) {
    this.decrementalFlag = decrementalFlag;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PreAuthSecondaryTransaction preAuthSecondaryTransaction = (PreAuthSecondaryTransaction) o;
    return Objects.equals(this.transactionAmount, preAuthSecondaryTransaction.transactionAmount) &&
        Objects.equals(this.decrementalFlag, preAuthSecondaryTransaction.decrementalFlag) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionAmount, decrementalFlag, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PreAuthSecondaryTransaction {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    transactionAmount: ").append(toIndentedString(transactionAmount)).append("\n");
    sb.append("    decrementalFlag: ").append(toIndentedString(decrementalFlag)).append("\n");
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

