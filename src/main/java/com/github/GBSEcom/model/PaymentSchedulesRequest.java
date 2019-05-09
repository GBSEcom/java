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
import com.github.GBSEcom.model.Billing;
import com.github.GBSEcom.model.ClientLocale;
import com.github.GBSEcom.model.Frequency;
import com.github.GBSEcom.model.PaymentMethod;
import com.github.GBSEcom.model.Shipping;
import com.github.GBSEcom.model.TransactionOrigin;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.LocalDate;

/**
 * Request to create a gateway schedule.
 */
@ApiModel(description = "Request to create a gateway schedule.")

public class PaymentSchedulesRequest {
  public static final String SERIALIZED_NAME_STORE_ID = "storeId";
  @SerializedName(SERIALIZED_NAME_STORE_ID)
  private String storeId;

  public static final String SERIALIZED_NAME_REFERENCED_ORDER_ID = "referencedOrderId";
  @SerializedName(SERIALIZED_NAME_REFERENCED_ORDER_ID)
  private String referencedOrderId;

  public static final String SERIALIZED_NAME_START_DATE = "startDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private LocalDate startDate;

  public static final String SERIALIZED_NAME_NUMBER_OF_PAYMENTS = "numberOfPayments";
  @SerializedName(SERIALIZED_NAME_NUMBER_OF_PAYMENTS)
  private Integer numberOfPayments;

  public static final String SERIALIZED_NAME_MAXIMUM_FAILURES = "maximumFailures";
  @SerializedName(SERIALIZED_NAME_MAXIMUM_FAILURES)
  private Integer maximumFailures;

  public static final String SERIALIZED_NAME_INVOICE_NUMBER = "invoiceNumber";
  @SerializedName(SERIALIZED_NAME_INVOICE_NUMBER)
  private String invoiceNumber;

  public static final String SERIALIZED_NAME_PURCHASE_ORDER_NUMBER = "purchaseOrderNumber";
  @SerializedName(SERIALIZED_NAME_PURCHASE_ORDER_NUMBER)
  private String purchaseOrderNumber;

  public static final String SERIALIZED_NAME_TRANSACTION_ORIGIN = "transactionOrigin";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_ORIGIN)
  private TransactionOrigin transactionOrigin = null;

  public static final String SERIALIZED_NAME_DYNAMIC_MERCHANT_NAME = "dynamicMerchantName";
  @SerializedName(SERIALIZED_NAME_DYNAMIC_MERCHANT_NAME)
  private String dynamicMerchantName;

  public static final String SERIALIZED_NAME_FREQUENCY = "frequency";
  @SerializedName(SERIALIZED_NAME_FREQUENCY)
  private Frequency frequency = null;

  public static final String SERIALIZED_NAME_PAYMENT_METHOD = "paymentMethod";
  @SerializedName(SERIALIZED_NAME_PAYMENT_METHOD)
  private PaymentMethod paymentMethod = null;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Amount amount = null;

  public static final String SERIALIZED_NAME_CLIENT_LOCALE = "clientLocale";
  @SerializedName(SERIALIZED_NAME_CLIENT_LOCALE)
  private ClientLocale clientLocale = null;

  public static final String SERIALIZED_NAME_ORDER_ID = "orderId";
  @SerializedName(SERIALIZED_NAME_ORDER_ID)
  private String orderId;

  public static final String SERIALIZED_NAME_BILLING = "billing";
  @SerializedName(SERIALIZED_NAME_BILLING)
  private Billing billing = null;

  public static final String SERIALIZED_NAME_SHIPPING = "shipping";
  @SerializedName(SERIALIZED_NAME_SHIPPING)
  private Shipping shipping = null;

  public static final String SERIALIZED_NAME_COMMENTS = "comments";
  @SerializedName(SERIALIZED_NAME_COMMENTS)
  private String comments;

  public PaymentSchedulesRequest storeId(String storeId) {
    this.storeId = storeId;
    return this;
  }

   /**
   * Store ID number.
   * @return storeId
  **/
  @ApiModelProperty(example = "1109959991", value = "Store ID number.")
  public String getStoreId() {
    return storeId;
  }

  public void setStoreId(String storeId) {
    this.storeId = storeId;
  }

  public PaymentSchedulesRequest referencedOrderId(String referencedOrderId) {
    this.referencedOrderId = referencedOrderId;
    return this;
  }

   /**
   * Order ID used to create recurring payment from existing transaction.
   * @return referencedOrderId
  **/
  @ApiModelProperty(example = "R-f9c2c198-b7cc-491a-a711-93d22fd0e589", value = "Order ID used to create recurring payment from existing transaction.")
  public String getReferencedOrderId() {
    return referencedOrderId;
  }

  public void setReferencedOrderId(String referencedOrderId) {
    this.referencedOrderId = referencedOrderId;
  }

  public PaymentSchedulesRequest startDate(LocalDate startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Date of mandate signature.
   * @return startDate
  **/
  @ApiModelProperty(value = "Date of mandate signature.")
  public LocalDate getStartDate() {
    return startDate;
  }

  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }

  public PaymentSchedulesRequest numberOfPayments(Integer numberOfPayments) {
    this.numberOfPayments = numberOfPayments;
    return this;
  }

   /**
   * Number of times the recurring pament will process.
   * minimum: 1
   * maximum: 999
   * @return numberOfPayments
  **/
  @ApiModelProperty(example = "10", value = "Number of times the recurring pament will process.")
  public Integer getNumberOfPayments() {
    return numberOfPayments;
  }

  public void setNumberOfPayments(Integer numberOfPayments) {
    this.numberOfPayments = numberOfPayments;
  }

  public PaymentSchedulesRequest maximumFailures(Integer maximumFailures) {
    this.maximumFailures = maximumFailures;
    return this;
  }

   /**
   * Number of failures that can be encountered before re-tries cease.
   * minimum: 1
   * maximum: 999
   * @return maximumFailures
  **/
  @ApiModelProperty(example = "1", value = "Number of failures that can be encountered before re-tries cease.")
  public Integer getMaximumFailures() {
    return maximumFailures;
  }

  public void setMaximumFailures(Integer maximumFailures) {
    this.maximumFailures = maximumFailures;
  }

  public PaymentSchedulesRequest invoiceNumber(String invoiceNumber) {
    this.invoiceNumber = invoiceNumber;
    return this;
  }

   /**
   * Invoice number.
   * @return invoiceNumber
  **/
  @ApiModelProperty(example = "96126098", value = "Invoice number.")
  public String getInvoiceNumber() {
    return invoiceNumber;
  }

  public void setInvoiceNumber(String invoiceNumber) {
    this.invoiceNumber = invoiceNumber;
  }

  public PaymentSchedulesRequest purchaseOrderNumber(String purchaseOrderNumber) {
    this.purchaseOrderNumber = purchaseOrderNumber;
    return this;
  }

   /**
   * Purchase order number.
   * @return purchaseOrderNumber
  **/
  @ApiModelProperty(example = "123055342", value = "Purchase order number.")
  public String getPurchaseOrderNumber() {
    return purchaseOrderNumber;
  }

  public void setPurchaseOrderNumber(String purchaseOrderNumber) {
    this.purchaseOrderNumber = purchaseOrderNumber;
  }

  public PaymentSchedulesRequest transactionOrigin(TransactionOrigin transactionOrigin) {
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

  public PaymentSchedulesRequest dynamicMerchantName(String dynamicMerchantName) {
    this.dynamicMerchantName = dynamicMerchantName;
    return this;
  }

   /**
   * Dynamic merchant name for the cardholder&#39;s statement.
   * @return dynamicMerchantName
  **/
  @ApiModelProperty(example = "MyWebsite", value = "Dynamic merchant name for the cardholder's statement.")
  public String getDynamicMerchantName() {
    return dynamicMerchantName;
  }

  public void setDynamicMerchantName(String dynamicMerchantName) {
    this.dynamicMerchantName = dynamicMerchantName;
  }

  public PaymentSchedulesRequest frequency(Frequency frequency) {
    this.frequency = frequency;
    return this;
  }

   /**
   * Get frequency
   * @return frequency
  **/
  @ApiModelProperty(value = "")
  public Frequency getFrequency() {
    return frequency;
  }

  public void setFrequency(Frequency frequency) {
    this.frequency = frequency;
  }

  public PaymentSchedulesRequest paymentMethod(PaymentMethod paymentMethod) {
    this.paymentMethod = paymentMethod;
    return this;
  }

   /**
   * Get paymentMethod
   * @return paymentMethod
  **/
  @ApiModelProperty(value = "")
  public PaymentMethod getPaymentMethod() {
    return paymentMethod;
  }

  public void setPaymentMethod(PaymentMethod paymentMethod) {
    this.paymentMethod = paymentMethod;
  }

  public PaymentSchedulesRequest amount(Amount amount) {
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

  public PaymentSchedulesRequest clientLocale(ClientLocale clientLocale) {
    this.clientLocale = clientLocale;
    return this;
  }

   /**
   * Get clientLocale
   * @return clientLocale
  **/
  @ApiModelProperty(value = "")
  public ClientLocale getClientLocale() {
    return clientLocale;
  }

  public void setClientLocale(ClientLocale clientLocale) {
    this.clientLocale = clientLocale;
  }

  public PaymentSchedulesRequest orderId(String orderId) {
    this.orderId = orderId;
    return this;
  }

   /**
   * Client order ID if supplied by client.
   * @return orderId
  **/
  @ApiModelProperty(example = "123456", value = "Client order ID if supplied by client.")
  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  public PaymentSchedulesRequest billing(Billing billing) {
    this.billing = billing;
    return this;
  }

   /**
   * Get billing
   * @return billing
  **/
  @ApiModelProperty(value = "")
  public Billing getBilling() {
    return billing;
  }

  public void setBilling(Billing billing) {
    this.billing = billing;
  }

  public PaymentSchedulesRequest shipping(Shipping shipping) {
    this.shipping = shipping;
    return this;
  }

   /**
   * Get shipping
   * @return shipping
  **/
  @ApiModelProperty(value = "")
  public Shipping getShipping() {
    return shipping;
  }

  public void setShipping(Shipping shipping) {
    this.shipping = shipping;
  }

  public PaymentSchedulesRequest comments(String comments) {
    this.comments = comments;
    return this;
  }

   /**
   * User supplied comments.
   * @return comments
  **/
  @ApiModelProperty(example = "This scheduled payment series is to pay for the thing.", value = "User supplied comments.")
  public String getComments() {
    return comments;
  }

  public void setComments(String comments) {
    this.comments = comments;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentSchedulesRequest paymentSchedulesRequest = (PaymentSchedulesRequest) o;
    return Objects.equals(this.storeId, paymentSchedulesRequest.storeId) &&
        Objects.equals(this.referencedOrderId, paymentSchedulesRequest.referencedOrderId) &&
        Objects.equals(this.startDate, paymentSchedulesRequest.startDate) &&
        Objects.equals(this.numberOfPayments, paymentSchedulesRequest.numberOfPayments) &&
        Objects.equals(this.maximumFailures, paymentSchedulesRequest.maximumFailures) &&
        Objects.equals(this.invoiceNumber, paymentSchedulesRequest.invoiceNumber) &&
        Objects.equals(this.purchaseOrderNumber, paymentSchedulesRequest.purchaseOrderNumber) &&
        Objects.equals(this.transactionOrigin, paymentSchedulesRequest.transactionOrigin) &&
        Objects.equals(this.dynamicMerchantName, paymentSchedulesRequest.dynamicMerchantName) &&
        Objects.equals(this.frequency, paymentSchedulesRequest.frequency) &&
        Objects.equals(this.paymentMethod, paymentSchedulesRequest.paymentMethod) &&
        Objects.equals(this.amount, paymentSchedulesRequest.amount) &&
        Objects.equals(this.clientLocale, paymentSchedulesRequest.clientLocale) &&
        Objects.equals(this.orderId, paymentSchedulesRequest.orderId) &&
        Objects.equals(this.billing, paymentSchedulesRequest.billing) &&
        Objects.equals(this.shipping, paymentSchedulesRequest.shipping) &&
        Objects.equals(this.comments, paymentSchedulesRequest.comments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(storeId, referencedOrderId, startDate, numberOfPayments, maximumFailures, invoiceNumber, purchaseOrderNumber, transactionOrigin, dynamicMerchantName, frequency, paymentMethod, amount, clientLocale, orderId, billing, shipping, comments);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentSchedulesRequest {\n");
    
    sb.append("    storeId: ").append(toIndentedString(storeId)).append("\n");
    sb.append("    referencedOrderId: ").append(toIndentedString(referencedOrderId)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    numberOfPayments: ").append(toIndentedString(numberOfPayments)).append("\n");
    sb.append("    maximumFailures: ").append(toIndentedString(maximumFailures)).append("\n");
    sb.append("    invoiceNumber: ").append(toIndentedString(invoiceNumber)).append("\n");
    sb.append("    purchaseOrderNumber: ").append(toIndentedString(purchaseOrderNumber)).append("\n");
    sb.append("    transactionOrigin: ").append(toIndentedString(transactionOrigin)).append("\n");
    sb.append("    dynamicMerchantName: ").append(toIndentedString(dynamicMerchantName)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    clientLocale: ").append(toIndentedString(clientLocale)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    billing: ").append(toIndentedString(billing)).append("\n");
    sb.append("    shipping: ").append(toIndentedString(shipping)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
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

