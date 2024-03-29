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
import com.github.GBSEcom.model.PaymentUrlStatus;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Detailed information about a payment URL.
 */
@ApiModel(description = "Detailed information about a payment URL.")

public class PaymentUrlDetail {
  public static final String SERIALIZED_NAME_PAYMENT_URL = "paymentUrl";
  @SerializedName(SERIALIZED_NAME_PAYMENT_URL)
  private String paymentUrl;

  public static final String SERIALIZED_NAME_MERCHANT_TRANSACTION_ID = "merchantTransactionId";
  @SerializedName(SERIALIZED_NAME_MERCHANT_TRANSACTION_ID)
  private String merchantTransactionId;

  public static final String SERIALIZED_NAME_ORDER_ID = "orderId";
  @SerializedName(SERIALIZED_NAME_ORDER_ID)
  private String orderId;

  public static final String SERIALIZED_NAME_REQUEST_TIME = "requestTime";
  @SerializedName(SERIALIZED_NAME_REQUEST_TIME)
  private Long requestTime;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private PaymentUrlStatus status;


  public PaymentUrlDetail paymentUrl(String paymentUrl) {
    
    this.paymentUrl = paymentUrl;
    return this;
  }

   /**
   * URL for embedded payment link.
   * @return paymentUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://api.firstdata.com/connect/gateway/processing?storename=123456789&oid=R-96cdbaa4-c22e-4598-a2f1-c2b5fed79ef1&paymentUrlId=d3eb74fe-cf63-47e1-b89f-52ba0cc7965c", value = "URL for embedded payment link.")

  public String getPaymentUrl() {
    return paymentUrl;
  }



  public void setPaymentUrl(String paymentUrl) {
    this.paymentUrl = paymentUrl;
  }


  public PaymentUrlDetail merchantTransactionId(String merchantTransactionId) {
    
    this.merchantTransactionId = merchantTransactionId;
    return this;
  }

   /**
   * The unique merchant transaction ID from the request, if supplied.
   * @return merchantTransactionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "lsk23532djljff3", value = "The unique merchant transaction ID from the request, if supplied.")

  public String getMerchantTransactionId() {
    return merchantTransactionId;
  }



  public void setMerchantTransactionId(String merchantTransactionId) {
    this.merchantTransactionId = merchantTransactionId;
  }


  public PaymentUrlDetail orderId(String orderId) {
    
    this.orderId = orderId;
    return this;
  }

   /**
   * Note - Client Order ID if supplied by client. If not supplied by client, IPG will generate. The first 12 alphanumeric digits are passed down to Fiserv Enterprise reporting tool, Clientline and Data File Manager (DFM).
   * @return orderId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123456", value = "Note - Client Order ID if supplied by client. If not supplied by client, IPG will generate. The first 12 alphanumeric digits are passed down to Fiserv Enterprise reporting tool, Clientline and Data File Manager (DFM).")

  public String getOrderId() {
    return orderId;
  }



  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }


  public PaymentUrlDetail requestTime(Long requestTime) {
    
    this.requestTime = requestTime;
    return this;
  }

   /**
   * The transaction time in seconds since epoch.
   * @return requestTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1518811817", value = "The transaction time in seconds since epoch.")

  public Long getRequestTime() {
    return requestTime;
  }



  public void setRequestTime(Long requestTime) {
    this.requestTime = requestTime;
  }


  public PaymentUrlDetail status(PaymentUrlStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PaymentUrlStatus getStatus() {
    return status;
  }



  public void setStatus(PaymentUrlStatus status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentUrlDetail paymentUrlDetail = (PaymentUrlDetail) o;
    return Objects.equals(this.paymentUrl, paymentUrlDetail.paymentUrl) &&
        Objects.equals(this.merchantTransactionId, paymentUrlDetail.merchantTransactionId) &&
        Objects.equals(this.orderId, paymentUrlDetail.orderId) &&
        Objects.equals(this.requestTime, paymentUrlDetail.requestTime) &&
        Objects.equals(this.status, paymentUrlDetail.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentUrl, merchantTransactionId, orderId, requestTime, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentUrlDetail {\n");
    sb.append("    paymentUrl: ").append(toIndentedString(paymentUrl)).append("\n");
    sb.append("    merchantTransactionId: ").append(toIndentedString(merchantTransactionId)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    requestTime: ").append(toIndentedString(requestTime)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

