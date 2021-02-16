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
import com.github.GBSEcom.model.Billing;
import com.github.GBSEcom.model.ClientLocale;
import com.github.GBSEcom.model.Shipping;
import com.github.GBSEcom.model.TransactionType;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Request to generate an embedded payment link.
 */
@ApiModel(description = "Request to generate an embedded payment link.")

public class PaymentUrlRequest {
  public static final String SERIALIZED_NAME_STORE_ID = "storeId";
  @SerializedName(SERIALIZED_NAME_STORE_ID)
  private String storeId;

  public static final String SERIALIZED_NAME_CLIENT_LOCALE = "clientLocale";
  @SerializedName(SERIALIZED_NAME_CLIENT_LOCALE)
  private ClientLocale clientLocale;

  public static final String SERIALIZED_NAME_TRANSACTION_AMOUNT = "transactionAmount";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_AMOUNT)
  private Amount transactionAmount;

  public static final String SERIALIZED_NAME_TRANSACTION_TYPE = "transactionType";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_TYPE)
  private TransactionType transactionType;

  public static final String SERIALIZED_NAME_ORDER_ID = "orderId";
  @SerializedName(SERIALIZED_NAME_ORDER_ID)
  private String orderId;

  public static final String SERIALIZED_NAME_BILLING = "billing";
  @SerializedName(SERIALIZED_NAME_BILLING)
  private Billing billing;

  public static final String SERIALIZED_NAME_SHIPPING = "shipping";
  @SerializedName(SERIALIZED_NAME_SHIPPING)
  private Shipping shipping;

  public static final String SERIALIZED_NAME_TRANSACTION_NOTIFICATION_U_R_L = "transactionNotificationURL";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_NOTIFICATION_U_R_L)
  private String transactionNotificationURL;

  public static final String SERIALIZED_NAME_EXPIRATION = "expiration";
  @SerializedName(SERIALIZED_NAME_EXPIRATION)
  private Long expiration;

  public static final String SERIALIZED_NAME_AUTHENTICATE_TRANSACTION = "authenticateTransaction";
  @SerializedName(SERIALIZED_NAME_AUTHENTICATE_TRANSACTION)
  private Boolean authenticateTransaction;

  public static final String SERIALIZED_NAME_DYNAMIC_MERCHANT_NAME = "dynamicMerchantName";
  @SerializedName(SERIALIZED_NAME_DYNAMIC_MERCHANT_NAME)
  private String dynamicMerchantName;

  public static final String SERIALIZED_NAME_INVOICE_NUMBER = "invoiceNumber";
  @SerializedName(SERIALIZED_NAME_INVOICE_NUMBER)
  private String invoiceNumber;

  public static final String SERIALIZED_NAME_PURCHASE_ORDER_NUMBER = "purchaseOrderNumber";
  @SerializedName(SERIALIZED_NAME_PURCHASE_ORDER_NUMBER)
  private String purchaseOrderNumber;

  public static final String SERIALIZED_NAME_HOSTED_PAYMENT_PAGE_TEXT = "hostedPaymentPageText";
  @SerializedName(SERIALIZED_NAME_HOSTED_PAYMENT_PAGE_TEXT)
  private String hostedPaymentPageText;

  public static final String SERIALIZED_NAME_IP = "ip";
  @SerializedName(SERIALIZED_NAME_IP)
  private String ip;


  public PaymentUrlRequest storeId(String storeId) {
    
    this.storeId = storeId;
    return this;
  }

   /**
   * An optional Outlet ID for clients that support multiple stores in the same developer app.
   * @return storeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "12345500000", value = "An optional Outlet ID for clients that support multiple stores in the same developer app.")

  public String getStoreId() {
    return storeId;
  }



  public void setStoreId(String storeId) {
    this.storeId = storeId;
  }


  public PaymentUrlRequest clientLocale(ClientLocale clientLocale) {
    
    this.clientLocale = clientLocale;
    return this;
  }

   /**
   * Get clientLocale
   * @return clientLocale
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ClientLocale getClientLocale() {
    return clientLocale;
  }



  public void setClientLocale(ClientLocale clientLocale) {
    this.clientLocale = clientLocale;
  }


  public PaymentUrlRequest transactionAmount(Amount transactionAmount) {
    
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


  public PaymentUrlRequest transactionType(TransactionType transactionType) {
    
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


  public PaymentUrlRequest orderId(String orderId) {
    
    this.orderId = orderId;
    return this;
  }

   /**
   * Client order ID if supplied by client, otherwise the order ID.
   * @return orderId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123456", value = "Client order ID if supplied by client, otherwise the order ID.")

  public String getOrderId() {
    return orderId;
  }



  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }


  public PaymentUrlRequest billing(Billing billing) {
    
    this.billing = billing;
    return this;
  }

   /**
   * Get billing
   * @return billing
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Billing getBilling() {
    return billing;
  }



  public void setBilling(Billing billing) {
    this.billing = billing;
  }


  public PaymentUrlRequest shipping(Shipping shipping) {
    
    this.shipping = shipping;
    return this;
  }

   /**
   * Get shipping
   * @return shipping
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Shipping getShipping() {
    return shipping;
  }



  public void setShipping(Shipping shipping) {
    this.shipping = shipping;
  }


  public PaymentUrlRequest transactionNotificationURL(String transactionNotificationURL) {
    
    this.transactionNotificationURL = transactionNotificationURL;
    return this;
  }

   /**
   * URL for notifying merchant of payment result.
   * @return transactionNotificationURL
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://showmethepaymentresult.com", value = "URL for notifying merchant of payment result.")

  public String getTransactionNotificationURL() {
    return transactionNotificationURL;
  }



  public void setTransactionNotificationURL(String transactionNotificationURL) {
    this.transactionNotificationURL = transactionNotificationURL;
  }


  public PaymentUrlRequest expiration(Long expiration) {
    
    this.expiration = expiration;
    return this;
  }

   /**
   * Time until payment URL expires.
   * @return expiration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "4102358400", value = "Time until payment URL expires.")

  public Long getExpiration() {
    return expiration;
  }



  public void setExpiration(Long expiration) {
    this.expiration = expiration;
  }


  public PaymentUrlRequest authenticateTransaction(Boolean authenticateTransaction) {
    
    this.authenticateTransaction = authenticateTransaction;
    return this;
  }

   /**
   * If 3D secure should be applied.
   * @return authenticateTransaction
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "If 3D secure should be applied.")

  public Boolean getAuthenticateTransaction() {
    return authenticateTransaction;
  }



  public void setAuthenticateTransaction(Boolean authenticateTransaction) {
    this.authenticateTransaction = authenticateTransaction;
  }


  public PaymentUrlRequest dynamicMerchantName(String dynamicMerchantName) {
    
    this.dynamicMerchantName = dynamicMerchantName;
    return this;
  }

   /**
   * Dynamic merchant name for the cardholder&#39;s statement.
   * @return dynamicMerchantName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "MyWebsite", value = "Dynamic merchant name for the cardholder's statement.")

  public String getDynamicMerchantName() {
    return dynamicMerchantName;
  }



  public void setDynamicMerchantName(String dynamicMerchantName) {
    this.dynamicMerchantName = dynamicMerchantName;
  }


  public PaymentUrlRequest invoiceNumber(String invoiceNumber) {
    
    this.invoiceNumber = invoiceNumber;
    return this;
  }

   /**
   * Invoice number.
   * @return invoiceNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "96126098", value = "Invoice number.")

  public String getInvoiceNumber() {
    return invoiceNumber;
  }



  public void setInvoiceNumber(String invoiceNumber) {
    this.invoiceNumber = invoiceNumber;
  }


  public PaymentUrlRequest purchaseOrderNumber(String purchaseOrderNumber) {
    
    this.purchaseOrderNumber = purchaseOrderNumber;
    return this;
  }

   /**
   * Purchase order number.
   * @return purchaseOrderNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123055342", value = "Purchase order number.")

  public String getPurchaseOrderNumber() {
    return purchaseOrderNumber;
  }



  public void setPurchaseOrderNumber(String purchaseOrderNumber) {
    this.purchaseOrderNumber = purchaseOrderNumber;
  }


  public PaymentUrlRequest hostedPaymentPageText(String hostedPaymentPageText) {
    
    this.hostedPaymentPageText = hostedPaymentPageText;
    return this;
  }

   /**
   * The text to be displayed to the payer on the hosted payment page.
   * @return hostedPaymentPageText
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "This is a payment for x", value = "The text to be displayed to the payer on the hosted payment page.")

  public String getHostedPaymentPageText() {
    return hostedPaymentPageText;
  }



  public void setHostedPaymentPageText(String hostedPaymentPageText) {
    this.hostedPaymentPageText = hostedPaymentPageText;
  }


  public PaymentUrlRequest ip(String ip) {
    
    this.ip = ip;
    return this;
  }

   /**
   * IPv4 or IPv6 network address.
   * @return ip
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "264.31.73.24", value = "IPv4 or IPv6 network address.")

  public String getIp() {
    return ip;
  }



  public void setIp(String ip) {
    this.ip = ip;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentUrlRequest paymentUrlRequest = (PaymentUrlRequest) o;
    return Objects.equals(this.storeId, paymentUrlRequest.storeId) &&
        Objects.equals(this.clientLocale, paymentUrlRequest.clientLocale) &&
        Objects.equals(this.transactionAmount, paymentUrlRequest.transactionAmount) &&
        Objects.equals(this.transactionType, paymentUrlRequest.transactionType) &&
        Objects.equals(this.orderId, paymentUrlRequest.orderId) &&
        Objects.equals(this.billing, paymentUrlRequest.billing) &&
        Objects.equals(this.shipping, paymentUrlRequest.shipping) &&
        Objects.equals(this.transactionNotificationURL, paymentUrlRequest.transactionNotificationURL) &&
        Objects.equals(this.expiration, paymentUrlRequest.expiration) &&
        Objects.equals(this.authenticateTransaction, paymentUrlRequest.authenticateTransaction) &&
        Objects.equals(this.dynamicMerchantName, paymentUrlRequest.dynamicMerchantName) &&
        Objects.equals(this.invoiceNumber, paymentUrlRequest.invoiceNumber) &&
        Objects.equals(this.purchaseOrderNumber, paymentUrlRequest.purchaseOrderNumber) &&
        Objects.equals(this.hostedPaymentPageText, paymentUrlRequest.hostedPaymentPageText) &&
        Objects.equals(this.ip, paymentUrlRequest.ip);
  }

  @Override
  public int hashCode() {
    return Objects.hash(storeId, clientLocale, transactionAmount, transactionType, orderId, billing, shipping, transactionNotificationURL, expiration, authenticateTransaction, dynamicMerchantName, invoiceNumber, purchaseOrderNumber, hostedPaymentPageText, ip);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentUrlRequest {\n");
    sb.append("    storeId: ").append(toIndentedString(storeId)).append("\n");
    sb.append("    clientLocale: ").append(toIndentedString(clientLocale)).append("\n");
    sb.append("    transactionAmount: ").append(toIndentedString(transactionAmount)).append("\n");
    sb.append("    transactionType: ").append(toIndentedString(transactionType)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    billing: ").append(toIndentedString(billing)).append("\n");
    sb.append("    shipping: ").append(toIndentedString(shipping)).append("\n");
    sb.append("    transactionNotificationURL: ").append(toIndentedString(transactionNotificationURL)).append("\n");
    sb.append("    expiration: ").append(toIndentedString(expiration)).append("\n");
    sb.append("    authenticateTransaction: ").append(toIndentedString(authenticateTransaction)).append("\n");
    sb.append("    dynamicMerchantName: ").append(toIndentedString(dynamicMerchantName)).append("\n");
    sb.append("    invoiceNumber: ").append(toIndentedString(invoiceNumber)).append("\n");
    sb.append("    purchaseOrderNumber: ").append(toIndentedString(purchaseOrderNumber)).append("\n");
    sb.append("    hostedPaymentPageText: ").append(toIndentedString(hostedPaymentPageText)).append("\n");
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
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

