/*
 * Payment Gateway API Specification.
 * The documentation here is designed to provide all of the technical guidance required to consume and integrate with our APIs for payment processing. To learn more about our APIs please visit https://docs.firstdata.com/org/gateway.
 *
 * The version of the OpenAPI document: 21.1.0.20210122.001
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
import com.github.GBSEcom.model.Disbursement;
import com.github.GBSEcom.model.Order;
import com.github.GBSEcom.model.PaymentTokenDisbursementTransactionAllOf;
import com.github.GBSEcom.model.PaymentTokenPaymentMethod;
import com.github.GBSEcom.model.PrimaryTransaction;
import com.github.GBSEcom.model.StoredCredential;
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
 * Request to create disbursement transaction using a payment token.
 */
@ApiModel(description = "Request to create disbursement transaction using a payment token.")

public class PaymentTokenDisbursementTransaction extends PrimaryTransaction {
  public static final String SERIALIZED_NAME_DISBURSEMENT = "disbursement";
  @SerializedName(SERIALIZED_NAME_DISBURSEMENT)
  private Disbursement disbursement;

  public static final String SERIALIZED_NAME_PAYMENT_METHOD = "paymentMethod";
  @SerializedName(SERIALIZED_NAME_PAYMENT_METHOD)
  private PaymentTokenPaymentMethod paymentMethod = null;

  public static final String SERIALIZED_NAME_STORED_CREDENTIALS = "storedCredentials";
  @SerializedName(SERIALIZED_NAME_STORED_CREDENTIALS)
  private StoredCredential storedCredentials;


  public PaymentTokenDisbursementTransaction disbursement(Disbursement disbursement) {
    
    this.disbursement = disbursement;
    return this;
  }

   /**
   * Get disbursement
   * @return disbursement
  **/
  @ApiModelProperty(required = true, value = "")

  public Disbursement getDisbursement() {
    return disbursement;
  }



  public void setDisbursement(Disbursement disbursement) {
    this.disbursement = disbursement;
  }


  public PaymentTokenDisbursementTransaction paymentMethod(PaymentTokenPaymentMethod paymentMethod) {
    
    this.paymentMethod = paymentMethod;
    return this;
  }

   /**
   * Get paymentMethod
   * @return paymentMethod
  **/
  @ApiModelProperty(required = true, value = "")

  public PaymentTokenPaymentMethod getPaymentMethod() {
    return paymentMethod;
  }



  public void setPaymentMethod(PaymentTokenPaymentMethod paymentMethod) {
    this.paymentMethod = paymentMethod;
  }


  public PaymentTokenDisbursementTransaction storedCredentials(StoredCredential storedCredentials) {
    
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
    PaymentTokenDisbursementTransaction paymentTokenDisbursementTransaction = (PaymentTokenDisbursementTransaction) o;
    return Objects.equals(this.disbursement, paymentTokenDisbursementTransaction.disbursement) &&
        Objects.equals(this.paymentMethod, paymentTokenDisbursementTransaction.paymentMethod) &&
        Objects.equals(this.storedCredentials, paymentTokenDisbursementTransaction.storedCredentials) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(disbursement, paymentMethod, storedCredentials, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentTokenDisbursementTransaction {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    disbursement: ").append(toIndentedString(disbursement)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
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

