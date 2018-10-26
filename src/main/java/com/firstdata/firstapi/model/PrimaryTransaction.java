/*
 * Payment Gateway API Specification
 * Payment Gateway API for payment processing. 
 *
 * OpenAPI spec version: 0.0.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.firstdata.firstapi.model;

import java.util.Objects;
import com.firstdata.firstapi.model.Amount;
import com.firstdata.firstapi.model.BasketItem;
import com.firstdata.firstapi.model.IndustrySpecificExtensions;
import com.firstdata.firstapi.model.Order;
import com.firstdata.firstapi.model.PaymentMethod;
import com.firstdata.firstapi.model.PrimaryTransactionAdditionalDetails;
import com.firstdata.firstapi.model.SplitShipment;
import com.firstdata.firstapi.model.StoredCredential;
import com.firstdata.firstapi.model.TransactionType;
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
 * Model for primary financial transactions
 */
@ApiModel(description = "Model for primary financial transactions")

public class PrimaryTransaction {
  @SerializedName("transactionType")
  private TransactionType transactionType = null;

  @SerializedName("storeId")
  private String storeId = null;

  @SerializedName("clientTransactionId")
  private String clientTransactionId = null;

  @SerializedName("amount")
  private Amount amount = null;

  @SerializedName("paymentMethod")
  private PaymentMethod paymentMethod = null;

  @SerializedName("order")
  private Order order = null;

  @SerializedName("basketItems")
  private List<BasketItem> basketItems = null;

  @SerializedName("splitShipment")
  private SplitShipment splitShipment = null;

  @SerializedName("additionalDetails")
  private PrimaryTransactionAdditionalDetails additionalDetails = null;

  @SerializedName("industrySpecificExtensions")
  private IndustrySpecificExtensions industrySpecificExtensions = null;

  @SerializedName("storedCredentials")
  private StoredCredential storedCredentials = null;

  public PrimaryTransaction transactionType(TransactionType transactionType) {
    this.transactionType = transactionType;
    return this;
  }

   /**
   * Get transactionType
   * @return transactionType
  **/
  @ApiModelProperty(required = true, value = "")
  public TransactionType getTransactionType() {
    return transactionType;
  }

  public void setTransactionType(TransactionType transactionType) {
    this.transactionType = transactionType;
  }

  public PrimaryTransaction storeId(String storeId) {
    this.storeId = storeId;
    return this;
  }

   /**
   * An optional Outlet ID for clients that support multiple stores in the same app.
   * @return storeId
  **/
  @ApiModelProperty(example = "12345500000", value = "An optional Outlet ID for clients that support multiple stores in the same app.")
  public String getStoreId() {
    return storeId;
  }

  public void setStoreId(String storeId) {
    this.storeId = storeId;
  }

  public PrimaryTransaction clientTransactionId(String clientTransactionId) {
    this.clientTransactionId = clientTransactionId;
    return this;
  }

   /**
   * The unique client Transaction ID from the Request header, if supplied.
   * @return clientTransactionId
  **/
  @ApiModelProperty(example = "30dd879c-ee2f-11db-8314-0800200c9a66", value = "The unique client Transaction ID from the Request header, if supplied.")
  public String getClientTransactionId() {
    return clientTransactionId;
  }

  public void setClientTransactionId(String clientTransactionId) {
    this.clientTransactionId = clientTransactionId;
  }

  public PrimaryTransaction amount(Amount amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(required = true, value = "")
  public Amount getAmount() {
    return amount;
  }

  public void setAmount(Amount amount) {
    this.amount = amount;
  }

  public PrimaryTransaction paymentMethod(PaymentMethod paymentMethod) {
    this.paymentMethod = paymentMethod;
    return this;
  }

   /**
   * Get paymentMethod
   * @return paymentMethod
  **/
  @ApiModelProperty(required = true, value = "")
  public PaymentMethod getPaymentMethod() {
    return paymentMethod;
  }

  public void setPaymentMethod(PaymentMethod paymentMethod) {
    this.paymentMethod = paymentMethod;
  }

  public PrimaryTransaction order(Order order) {
    this.order = order;
    return this;
  }

   /**
   * Get order
   * @return order
  **/
  @ApiModelProperty(value = "")
  public Order getOrder() {
    return order;
  }

  public void setOrder(Order order) {
    this.order = order;
  }

  public PrimaryTransaction basketItems(List<BasketItem> basketItems) {
    this.basketItems = basketItems;
    return this;
  }

  public PrimaryTransaction addBasketItemsItem(BasketItem basketItemsItem) {
    if (this.basketItems == null) {
      this.basketItems = new ArrayList<>();
    }
    this.basketItems.add(basketItemsItem);
    return this;
  }

   /**
   * Required for some payment methods (for example, Klarna)
   * @return basketItems
  **/
  @ApiModelProperty(value = "Required for some payment methods (for example, Klarna)")
  public List<BasketItem> getBasketItems() {
    return basketItems;
  }

  public void setBasketItems(List<BasketItem> basketItems) {
    this.basketItems = basketItems;
  }

  public PrimaryTransaction splitShipment(SplitShipment splitShipment) {
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

  public PrimaryTransaction additionalDetails(PrimaryTransactionAdditionalDetails additionalDetails) {
    this.additionalDetails = additionalDetails;
    return this;
  }

   /**
   * Get additionalDetails
   * @return additionalDetails
  **/
  @ApiModelProperty(value = "")
  public PrimaryTransactionAdditionalDetails getAdditionalDetails() {
    return additionalDetails;
  }

  public void setAdditionalDetails(PrimaryTransactionAdditionalDetails additionalDetails) {
    this.additionalDetails = additionalDetails;
  }

  public PrimaryTransaction industrySpecificExtensions(IndustrySpecificExtensions industrySpecificExtensions) {
    this.industrySpecificExtensions = industrySpecificExtensions;
    return this;
  }

   /**
   * Get industrySpecificExtensions
   * @return industrySpecificExtensions
  **/
  @ApiModelProperty(value = "")
  public IndustrySpecificExtensions getIndustrySpecificExtensions() {
    return industrySpecificExtensions;
  }

  public void setIndustrySpecificExtensions(IndustrySpecificExtensions industrySpecificExtensions) {
    this.industrySpecificExtensions = industrySpecificExtensions;
  }

  public PrimaryTransaction storedCredentials(StoredCredential storedCredentials) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PrimaryTransaction primaryTransaction = (PrimaryTransaction) o;
    return Objects.equals(this.transactionType, primaryTransaction.transactionType) &&
        Objects.equals(this.storeId, primaryTransaction.storeId) &&
        Objects.equals(this.clientTransactionId, primaryTransaction.clientTransactionId) &&
        Objects.equals(this.amount, primaryTransaction.amount) &&
        Objects.equals(this.paymentMethod, primaryTransaction.paymentMethod) &&
        Objects.equals(this.order, primaryTransaction.order) &&
        Objects.equals(this.basketItems, primaryTransaction.basketItems) &&
        Objects.equals(this.splitShipment, primaryTransaction.splitShipment) &&
        Objects.equals(this.additionalDetails, primaryTransaction.additionalDetails) &&
        Objects.equals(this.industrySpecificExtensions, primaryTransaction.industrySpecificExtensions) &&
        Objects.equals(this.storedCredentials, primaryTransaction.storedCredentials);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionType, storeId, clientTransactionId, amount, paymentMethod, order, basketItems, splitShipment, additionalDetails, industrySpecificExtensions, storedCredentials);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrimaryTransaction {\n");
    
    sb.append("    transactionType: ").append(toIndentedString(transactionType)).append("\n");
    sb.append("    storeId: ").append(toIndentedString(storeId)).append("\n");
    sb.append("    clientTransactionId: ").append(toIndentedString(clientTransactionId)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    basketItems: ").append(toIndentedString(basketItems)).append("\n");
    sb.append("    splitShipment: ").append(toIndentedString(splitShipment)).append("\n");
    sb.append("    additionalDetails: ").append(toIndentedString(additionalDetails)).append("\n");
    sb.append("    industrySpecificExtensions: ").append(toIndentedString(industrySpecificExtensions)).append("\n");
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

