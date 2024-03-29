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
 * Provides shared fields for all PrimaryTransaction request types. Abstract class, do not use this class directly, use one of its children.
 */
@ApiModel(description = "Provides shared fields for all PrimaryTransaction request types. Abstract class, do not use this class directly, use one of its children.")


public class PrimaryTransaction {
  public static final String SERIALIZED_NAME_REQUEST_TYPE = "requestType";
  @SerializedName(SERIALIZED_NAME_REQUEST_TYPE)
  private String requestType;

  public static final String SERIALIZED_NAME_TRANSACTION_AMOUNT = "transactionAmount";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_AMOUNT)
  private Amount transactionAmount;

  public static final String SERIALIZED_NAME_STORE_ID = "storeId";
  @SerializedName(SERIALIZED_NAME_STORE_ID)
  private String storeId;

  public static final String SERIALIZED_NAME_MERCHANT_TRANSACTION_ID = "merchantTransactionId";
  @SerializedName(SERIALIZED_NAME_MERCHANT_TRANSACTION_ID)
  private String merchantTransactionId;

  public static final String SERIALIZED_NAME_TRANSACTION_ORIGIN = "transactionOrigin";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_ORIGIN)
  private TransactionOrigin transactionOrigin;

  public static final String SERIALIZED_NAME_ORDER = "order";
  @SerializedName(SERIALIZED_NAME_ORDER)
  private Order order;

  public static final String SERIALIZED_NAME_IPG_TRANSACTION_ID = "ipgTransactionId";
  @SerializedName(SERIALIZED_NAME_IPG_TRANSACTION_ID)
  private Long ipgTransactionId;

  public static final String SERIALIZED_NAME_ALLOW_PARTIAL_APPROVAL = "allowPartialApproval";
  @SerializedName(SERIALIZED_NAME_ALLOW_PARTIAL_APPROVAL)
  private Boolean allowPartialApproval;

  public PrimaryTransaction() {
    this.requestType = this.getClass().getSimpleName();
  }

  public PrimaryTransaction requestType(String requestType) {
    
    this.requestType = requestType;
    return this;
  }

   /**
   * Object name of the primary transaction request.
   * @return requestType
  **/
  @ApiModelProperty(example = "PaymentCardCreditTransaction", required = true, value = "Object name of the primary transaction request.")

  public String getRequestType() {
    return requestType;
  }



  public void setRequestType(String requestType) {
    this.requestType = requestType;
  }


  public PrimaryTransaction transactionAmount(Amount transactionAmount) {
    
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


  public PrimaryTransaction storeId(String storeId) {
    
    this.storeId = storeId;
    return this;
  }

   /**
   * An optional outlet ID for clients that support multiple stores in the same app.
   * @return storeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "12345500000", value = "An optional outlet ID for clients that support multiple stores in the same app.")

  public String getStoreId() {
    return storeId;
  }



  public void setStoreId(String storeId) {
    this.storeId = storeId;
  }


  public PrimaryTransaction merchantTransactionId(String merchantTransactionId) {
    
    this.merchantTransactionId = merchantTransactionId;
    return this;
  }

   /**
   * The unique merchant transaction ID from the request header, if supplied.
   * @return merchantTransactionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "30dd879c-ee2f-11db-8314-0800200c9a66", value = "The unique merchant transaction ID from the request header, if supplied.")

  public String getMerchantTransactionId() {
    return merchantTransactionId;
  }



  public void setMerchantTransactionId(String merchantTransactionId) {
    this.merchantTransactionId = merchantTransactionId;
  }


  public PrimaryTransaction transactionOrigin(TransactionOrigin transactionOrigin) {
    
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


  public PrimaryTransaction order(Order order) {
    
    this.order = order;
    return this;
  }

   /**
   * Get order
   * @return order
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Order getOrder() {
    return order;
  }



  public void setOrder(Order order) {
    this.order = order;
  }


  public PrimaryTransaction ipgTransactionId(Long ipgTransactionId) {
    
    this.ipgTransactionId = ipgTransactionId;
    return this;
  }

   /**
   * The IPG transactionId to reference a payerauth for example.
   * @return ipgTransactionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "8154886515", value = "The IPG transactionId to reference a payerauth for example.")

  public Long getIpgTransactionId() {
    return ipgTransactionId;
  }



  public void setIpgTransactionId(Long ipgTransactionId) {
    this.ipgTransactionId = ipgTransactionId;
  }


  public PrimaryTransaction allowPartialApproval(Boolean allowPartialApproval) {
    
    this.allowPartialApproval = allowPartialApproval;
    return this;
  }

   /**
   * Indicates if the particular transaction is a partial approval transaction, if supplied.
   * @return allowPartialApproval
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Indicates if the particular transaction is a partial approval transaction, if supplied.")

  public Boolean getAllowPartialApproval() {
    return allowPartialApproval;
  }



  public void setAllowPartialApproval(Boolean allowPartialApproval) {
    this.allowPartialApproval = allowPartialApproval;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PrimaryTransaction primaryTransaction = (PrimaryTransaction) o;
    return Objects.equals(this.requestType, primaryTransaction.requestType) &&
        Objects.equals(this.transactionAmount, primaryTransaction.transactionAmount) &&
        Objects.equals(this.storeId, primaryTransaction.storeId) &&
        Objects.equals(this.merchantTransactionId, primaryTransaction.merchantTransactionId) &&
        Objects.equals(this.transactionOrigin, primaryTransaction.transactionOrigin) &&
        Objects.equals(this.order, primaryTransaction.order) &&
        Objects.equals(this.ipgTransactionId, primaryTransaction.ipgTransactionId) &&
        Objects.equals(this.allowPartialApproval, primaryTransaction.allowPartialApproval);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestType, transactionAmount, storeId, merchantTransactionId, transactionOrigin, order, ipgTransactionId, allowPartialApproval);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrimaryTransaction {\n");
    sb.append("    requestType: ").append(toIndentedString(requestType)).append("\n");
    sb.append("    transactionAmount: ").append(toIndentedString(transactionAmount)).append("\n");
    sb.append("    storeId: ").append(toIndentedString(storeId)).append("\n");
    sb.append("    merchantTransactionId: ").append(toIndentedString(merchantTransactionId)).append("\n");
    sb.append("    transactionOrigin: ").append(toIndentedString(transactionOrigin)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    ipgTransactionId: ").append(toIndentedString(ipgTransactionId)).append("\n");
    sb.append("    allowPartialApproval: ").append(toIndentedString(allowPartialApproval)).append("\n");
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

