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
import com.github.GBSEcom.model.CreatePaymentToken;
import com.github.GBSEcom.model.Order;
import com.github.GBSEcom.model.PaymentDevicePaymentMethod;
import com.github.GBSEcom.model.PaymentDevicePreAuthTransactionAllOf;
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
 * Request to create pre-auth transaction using decrypted card details from payment device. The transaction origin will be fixed as PHONE when data is manually entered into the device and as RETAIL when data is entered into the device via swipe.
 */
@ApiModel(description = "Request to create pre-auth transaction using decrypted card details from payment device. The transaction origin will be fixed as PHONE when data is manually entered into the device and as RETAIL when data is entered into the device via swipe.")

public class PaymentDevicePreAuthTransaction extends PrimaryTransaction {
  public static final String SERIALIZED_NAME_PAYMENT_METHOD = "paymentMethod";
  @SerializedName(SERIALIZED_NAME_PAYMENT_METHOD)
  private PaymentDevicePaymentMethod paymentMethod = null;

  public static final String SERIALIZED_NAME_CREATE_TOKEN = "createToken";
  @SerializedName(SERIALIZED_NAME_CREATE_TOKEN)
  private CreatePaymentToken createToken;

  public static final String SERIALIZED_NAME_SETTLEMENT_SPLIT = "settlementSplit";
  @SerializedName(SERIALIZED_NAME_SETTLEMENT_SPLIT)
  private List<SubMerchantSplit> settlementSplit = null;

  public static final String SERIALIZED_NAME_STORED_CREDENTIALS = "storedCredentials";
  @SerializedName(SERIALIZED_NAME_STORED_CREDENTIALS)
  private StoredCredential storedCredentials;

  public static final String SERIALIZED_NAME_SPLIT_SHIPMENT = "splitShipment";
  @SerializedName(SERIALIZED_NAME_SPLIT_SHIPMENT)
  private SplitShipment splitShipment;

  public static final String SERIALIZED_NAME_DECREMENTAL_FLAG = "decrementalFlag";
  @SerializedName(SERIALIZED_NAME_DECREMENTAL_FLAG)
  private Boolean decrementalFlag = false;


  public PaymentDevicePreAuthTransaction paymentMethod(PaymentDevicePaymentMethod paymentMethod) {
    
    this.paymentMethod = paymentMethod;
    return this;
  }

   /**
   * Get paymentMethod
   * @return paymentMethod
  **/
  @ApiModelProperty(required = true, value = "")

  public PaymentDevicePaymentMethod getPaymentMethod() {
    return paymentMethod;
  }



  public void setPaymentMethod(PaymentDevicePaymentMethod paymentMethod) {
    this.paymentMethod = paymentMethod;
  }


  public PaymentDevicePreAuthTransaction createToken(CreatePaymentToken createToken) {
    
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


  public PaymentDevicePreAuthTransaction settlementSplit(List<SubMerchantSplit> settlementSplit) {
    
    this.settlementSplit = settlementSplit;
    return this;
  }

  public PaymentDevicePreAuthTransaction addSettlementSplitItem(SubMerchantSplit settlementSplitItem) {
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
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[{\"merchantID\":\"100000001\",\"amount\":25.06},{\"merchantID\":\"100000002\",\"amount\":15.07}]", value = "Settle with multiple sub-merchants, sale and preAuth only.")

  public List<SubMerchantSplit> getSettlementSplit() {
    return settlementSplit;
  }



  public void setSettlementSplit(List<SubMerchantSplit> settlementSplit) {
    this.settlementSplit = settlementSplit;
  }


  public PaymentDevicePreAuthTransaction storedCredentials(StoredCredential storedCredentials) {
    
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


  public PaymentDevicePreAuthTransaction splitShipment(SplitShipment splitShipment) {
    
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


  public PaymentDevicePreAuthTransaction decrementalFlag(Boolean decrementalFlag) {
    
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
    PaymentDevicePreAuthTransaction paymentDevicePreAuthTransaction = (PaymentDevicePreAuthTransaction) o;
    return Objects.equals(this.paymentMethod, paymentDevicePreAuthTransaction.paymentMethod) &&
        Objects.equals(this.createToken, paymentDevicePreAuthTransaction.createToken) &&
        Objects.equals(this.settlementSplit, paymentDevicePreAuthTransaction.settlementSplit) &&
        Objects.equals(this.storedCredentials, paymentDevicePreAuthTransaction.storedCredentials) &&
        Objects.equals(this.splitShipment, paymentDevicePreAuthTransaction.splitShipment) &&
        Objects.equals(this.decrementalFlag, paymentDevicePreAuthTransaction.decrementalFlag) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentMethod, createToken, settlementSplit, storedCredentials, splitShipment, decrementalFlag, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentDevicePreAuthTransaction {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    sb.append("    createToken: ").append(toIndentedString(createToken)).append("\n");
    sb.append("    settlementSplit: ").append(toIndentedString(settlementSplit)).append("\n");
    sb.append("    storedCredentials: ").append(toIndentedString(storedCredentials)).append("\n");
    sb.append("    splitShipment: ").append(toIndentedString(splitShipment)).append("\n");
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

