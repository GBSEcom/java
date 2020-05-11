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
import com.github.GBSEcom.model.Amount;
import com.github.GBSEcom.model.AuthenticationRequest;
import com.github.GBSEcom.model.AuthenticationResult;
import com.github.GBSEcom.model.Order;
import com.github.GBSEcom.model.PaymentTokenPaymentMethod;
import com.github.GBSEcom.model.PrimaryTransaction;
import com.github.GBSEcom.model.SplitShipment;
import com.github.GBSEcom.model.StoredCredential;
import com.github.GBSEcom.model.SubMerchantSplit;
import com.github.GBSEcom.model.TransactionOrigin;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Request to create pre-auth transaction using payment token.
 */
@ApiModel(description = "Request to create pre-auth transaction using payment token.")

public class PaymentTokenPreAuthTransaction extends PrimaryTransaction {
  public static final String SERIALIZED_NAME_PAYMENT_METHOD = "paymentMethod";
  @SerializedName(SERIALIZED_NAME_PAYMENT_METHOD)
  private PaymentTokenPaymentMethod paymentMethod = null;

  public static final String SERIALIZED_NAME_STORED_CREDENTIALS = "storedCredentials";
  @SerializedName(SERIALIZED_NAME_STORED_CREDENTIALS)
  private StoredCredential storedCredentials = null;

  public static final String SERIALIZED_NAME_SPLIT_SHIPMENT = "splitShipment";
  @SerializedName(SERIALIZED_NAME_SPLIT_SHIPMENT)
  private SplitShipment splitShipment = null;

  public static final String SERIALIZED_NAME_SETTLEMENT_SPLIT = "settlementSplit";
  @SerializedName(SERIALIZED_NAME_SETTLEMENT_SPLIT)
  private List<SubMerchantSplit> settlementSplit = null;

  public static final String SERIALIZED_NAME_AUTHENTICATION_REQUEST = "authenticationRequest";
  @SerializedName(SERIALIZED_NAME_AUTHENTICATION_REQUEST)
  private AuthenticationRequest authenticationRequest = null;

  public static final String SERIALIZED_NAME_AUTHENTICATION_RESULT = "authenticationResult";
  @SerializedName(SERIALIZED_NAME_AUTHENTICATION_RESULT)
  private AuthenticationResult authenticationResult = null;

  public PaymentTokenPreAuthTransaction paymentMethod(PaymentTokenPaymentMethod paymentMethod) {
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

  public PaymentTokenPreAuthTransaction storedCredentials(StoredCredential storedCredentials) {
    this.storedCredentials = storedCredentials;
    return this;
  }

   /**
   * Get storedCredentials
   * @return storedCredentials
  **/
  @ApiModelProperty(value = "")
  public StoredCredential getStoredCredentials() {
    return storedCredentials;
  }

  public void setStoredCredentials(StoredCredential storedCredentials) {
    this.storedCredentials = storedCredentials;
  }

  public PaymentTokenPreAuthTransaction splitShipment(SplitShipment splitShipment) {
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

  public PaymentTokenPreAuthTransaction settlementSplit(List<SubMerchantSplit> settlementSplit) {
    this.settlementSplit = settlementSplit;
    return this;
  }

  public PaymentTokenPreAuthTransaction addSettlementSplitItem(SubMerchantSplit settlementSplitItem) {
    if (this.settlementSplit == null) {
      this.settlementSplit = new ArrayList<>();
    }
    this.settlementSplit.add(settlementSplitItem);
    return this;
  }

   /**
   * Settle with multiple sub-merchants, sale and preAuth only.
   * @return settlementSplit
  **/
  @ApiModelProperty(example = "[{\"merchantID\":\"100000001\",\"amount\":25.06},{\"merchantID\":\"100000002\",\"amount\":15.07}]", value = "Settle with multiple sub-merchants, sale and preAuth only.")
  public List<SubMerchantSplit> getSettlementSplit() {
    return settlementSplit;
  }

  public void setSettlementSplit(List<SubMerchantSplit> settlementSplit) {
    this.settlementSplit = settlementSplit;
  }

  public PaymentTokenPreAuthTransaction authenticationRequest(AuthenticationRequest authenticationRequest) {
    this.authenticationRequest = authenticationRequest;
    return this;
  }

   /**
   * Get authenticationRequest
   * @return authenticationRequest
  **/
  @ApiModelProperty(value = "")
  public AuthenticationRequest getAuthenticationRequest() {
    return authenticationRequest;
  }

  public void setAuthenticationRequest(AuthenticationRequest authenticationRequest) {
    this.authenticationRequest = authenticationRequest;
  }

  public PaymentTokenPreAuthTransaction authenticationResult(AuthenticationResult authenticationResult) {
    this.authenticationResult = authenticationResult;
    return this;
  }

   /**
   * Get authenticationResult
   * @return authenticationResult
  **/
  @ApiModelProperty(value = "")
  public AuthenticationResult getAuthenticationResult() {
    return authenticationResult;
  }

  public void setAuthenticationResult(AuthenticationResult authenticationResult) {
    this.authenticationResult = authenticationResult;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentTokenPreAuthTransaction paymentTokenPreAuthTransaction = (PaymentTokenPreAuthTransaction) o;
    return Objects.equals(this.paymentMethod, paymentTokenPreAuthTransaction.paymentMethod) &&
        Objects.equals(this.storedCredentials, paymentTokenPreAuthTransaction.storedCredentials) &&
        Objects.equals(this.splitShipment, paymentTokenPreAuthTransaction.splitShipment) &&
        Objects.equals(this.settlementSplit, paymentTokenPreAuthTransaction.settlementSplit) &&
        Objects.equals(this.authenticationRequest, paymentTokenPreAuthTransaction.authenticationRequest) &&
        Objects.equals(this.authenticationResult, paymentTokenPreAuthTransaction.authenticationResult) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentMethod, storedCredentials, splitShipment, settlementSplit, authenticationRequest, authenticationResult, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentTokenPreAuthTransaction {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    sb.append("    storedCredentials: ").append(toIndentedString(storedCredentials)).append("\n");
    sb.append("    splitShipment: ").append(toIndentedString(splitShipment)).append("\n");
    sb.append("    settlementSplit: ").append(toIndentedString(settlementSplit)).append("\n");
    sb.append("    authenticationRequest: ").append(toIndentedString(authenticationRequest)).append("\n");
    sb.append("    authenticationResult: ").append(toIndentedString(authenticationResult)).append("\n");
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

