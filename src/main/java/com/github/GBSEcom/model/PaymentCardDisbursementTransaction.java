/*
 * Payment Gateway API Specification.
 * The documentation here is designed to provide all of the technical guidance required to consume and integrate with our APIs for payment processing. To learn more about our APIs please visit https://docs.firstdata.com/org/gateway.
 *
 * The version of the OpenAPI document: 21.4.0.20210824.002
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
import com.github.GBSEcom.model.CreatePaymentToken;
import com.github.GBSEcom.model.Disbursement;
import com.github.GBSEcom.model.Order;
import com.github.GBSEcom.model.PaymentCardDisbursementTransactionAllOf;
import com.github.GBSEcom.model.PaymentCardPaymentMethod;
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
 * Request to create disbursement transaction using a payment card.
 */
@ApiModel(description = "Request to create disbursement transaction using a payment card.")

public class PaymentCardDisbursementTransaction extends PrimaryTransaction {
  public static final String SERIALIZED_NAME_DISBURSEMENT = "disbursement";
  @SerializedName(SERIALIZED_NAME_DISBURSEMENT)
  private Disbursement disbursement;

  public static final String SERIALIZED_NAME_PAYMENT_METHOD = "paymentMethod";
  @SerializedName(SERIALIZED_NAME_PAYMENT_METHOD)
  private PaymentCardPaymentMethod paymentMethod = null;

  public static final String SERIALIZED_NAME_STORED_CREDENTIALS = "storedCredentials";
  @SerializedName(SERIALIZED_NAME_STORED_CREDENTIALS)
  private StoredCredential storedCredentials;

  public static final String SERIALIZED_NAME_CREATE_TOKEN = "createToken";
  @SerializedName(SERIALIZED_NAME_CREATE_TOKEN)
  private CreatePaymentToken createToken;


  public PaymentCardDisbursementTransaction disbursement(Disbursement disbursement) {
    
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


  public PaymentCardDisbursementTransaction paymentMethod(PaymentCardPaymentMethod paymentMethod) {
    
    this.paymentMethod = paymentMethod;
    return this;
  }

   /**
   * Get paymentMethod
   * @return paymentMethod
  **/
  @ApiModelProperty(required = true, value = "")

  public PaymentCardPaymentMethod getPaymentMethod() {
    return paymentMethod;
  }



  public void setPaymentMethod(PaymentCardPaymentMethod paymentMethod) {
    this.paymentMethod = paymentMethod;
  }


  public PaymentCardDisbursementTransaction storedCredentials(StoredCredential storedCredentials) {
    
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


  public PaymentCardDisbursementTransaction createToken(CreatePaymentToken createToken) {
    
    this.createToken = createToken;
    return this;
  }

   /**
   * Get createToken
   * @return createToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CreatePaymentToken getCreateToken() {
    return createToken;
  }



  public void setCreateToken(CreatePaymentToken createToken) {
    this.createToken = createToken;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentCardDisbursementTransaction paymentCardDisbursementTransaction = (PaymentCardDisbursementTransaction) o;
    return Objects.equals(this.disbursement, paymentCardDisbursementTransaction.disbursement) &&
        Objects.equals(this.paymentMethod, paymentCardDisbursementTransaction.paymentMethod) &&
        Objects.equals(this.storedCredentials, paymentCardDisbursementTransaction.storedCredentials) &&
        Objects.equals(this.createToken, paymentCardDisbursementTransaction.createToken) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(disbursement, paymentMethod, storedCredentials, createToken, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentCardDisbursementTransaction {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    disbursement: ").append(toIndentedString(disbursement)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    sb.append("    storedCredentials: ").append(toIndentedString(storedCredentials)).append("\n");
    sb.append("    createToken: ").append(toIndentedString(createToken)).append("\n");
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

