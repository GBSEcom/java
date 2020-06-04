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
import com.github.GBSEcom.model.AchPostAuthTransactionAllOf;
import com.github.GBSEcom.model.Amount;
import com.github.GBSEcom.model.Order;
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
 * Request to perform ACH TeleCheck return transaction. Note - If the ACH transaction to be refunded has not yet been sent to Telecheck, the original transaction will be automatically voided instead.
 */
@ApiModel(description = "Request to perform ACH TeleCheck return transaction. Note - If the ACH transaction to be refunded has not yet been sent to Telecheck, the original transaction will be automatically voided instead.")

public class AchReturnTransaction extends SecondaryTransaction {
  public static final String SERIALIZED_NAME_TRANSACTION_AMOUNT = "transactionAmount";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_AMOUNT)
  private Amount transactionAmount;


  public AchReturnTransaction transactionAmount(Amount transactionAmount) {
    
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AchReturnTransaction achReturnTransaction = (AchReturnTransaction) o;
    return Objects.equals(this.transactionAmount, achReturnTransaction.transactionAmount) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionAmount, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AchReturnTransaction {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    transactionAmount: ").append(toIndentedString(transactionAmount)).append("\n");
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

