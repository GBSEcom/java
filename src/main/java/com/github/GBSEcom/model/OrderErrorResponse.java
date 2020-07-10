/*
 * Payment Gateway API Specification.
 * The documentation here is designed to provide all of the technical guidance required to consume and integrate with our APIs for payment processing. To learn more about our APIs please visit https://docs.firstdata.com/org/gateway.
 *
 * The version of the OpenAPI document: 6.12.0.20200605.001
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.github.GBSEcom.model;

import java.util.Objects;
import java.util.Arrays;
import com.github.GBSEcom.model.AdditionalDetails;
import com.github.GBSEcom.model.Billing;
import com.github.GBSEcom.model.Error;
import com.github.GBSEcom.model.OrderResponse;
import com.github.GBSEcom.model.ResponseType;
import com.github.GBSEcom.model.Shipping;
import com.github.GBSEcom.model.TransactionResponse;
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
 * Order response with error field included.
 */
@ApiModel(description = "Order response with error field included.")

public class OrderErrorResponse {
  public static final String SERIALIZED_NAME_CLIENT_REQUEST_ID = "clientRequestId";
  @SerializedName(SERIALIZED_NAME_CLIENT_REQUEST_ID)
  private String clientRequestId;

  public static final String SERIALIZED_NAME_API_TRACE_ID = "apiTraceId";
  @SerializedName(SERIALIZED_NAME_API_TRACE_ID)
  private String apiTraceId;

  public static final String SERIALIZED_NAME_RESPONSE_TYPE = "responseType";
  @SerializedName(SERIALIZED_NAME_RESPONSE_TYPE)
  private ResponseType responseType;

  public static final String SERIALIZED_NAME_ORDER_ID = "orderId";
  @SerializedName(SERIALIZED_NAME_ORDER_ID)
  private String orderId;

  public static final String SERIALIZED_NAME_BILLING = "billing";
  @SerializedName(SERIALIZED_NAME_BILLING)
  private Billing billing;

  public static final String SERIALIZED_NAME_SHIPPING = "shipping";
  @SerializedName(SERIALIZED_NAME_SHIPPING)
  private Shipping shipping;

  public static final String SERIALIZED_NAME_TRANSACTIONS = "transactions";
  @SerializedName(SERIALIZED_NAME_TRANSACTIONS)
  private List<TransactionResponse> transactions = null;

  public static final String SERIALIZED_NAME_ADDITIONAL_DETAILS = "additionalDetails";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_DETAILS)
  private AdditionalDetails additionalDetails;

  public static final String SERIALIZED_NAME_ERROR = "error";
  @SerializedName(SERIALIZED_NAME_ERROR)
  private Error error;


  public OrderErrorResponse clientRequestId(String clientRequestId) {
    
    this.clientRequestId = clientRequestId;
    return this;
  }

   /**
   * Echoes back the value in the request header for tracking.
   * @return clientRequestId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "30dd879c-ee2f-11db-8314-0800200c9a66", value = "Echoes back the value in the request header for tracking.")

  public String getClientRequestId() {
    return clientRequestId;
  }



  public void setClientRequestId(String clientRequestId) {
    this.clientRequestId = clientRequestId;
  }


  public OrderErrorResponse apiTraceId(String apiTraceId) {
    
    this.apiTraceId = apiTraceId;
    return this;
  }

   /**
   * Request identifier in API, can be used to request logs from the support team.
   * @return apiTraceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "rrt-0bd552c12342d3448-b-ea-1142-12938318-7", value = "Request identifier in API, can be used to request logs from the support team.")

  public String getApiTraceId() {
    return apiTraceId;
  }



  public void setApiTraceId(String apiTraceId) {
    this.apiTraceId = apiTraceId;
  }


  public OrderErrorResponse responseType(ResponseType responseType) {
    
    this.responseType = responseType;
    return this;
  }

   /**
   * Get responseType
   * @return responseType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ResponseType getResponseType() {
    return responseType;
  }



  public void setResponseType(ResponseType responseType) {
    this.responseType = responseType;
  }


  public OrderErrorResponse orderId(String orderId) {
    
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


  public OrderErrorResponse billing(Billing billing) {
    
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


  public OrderErrorResponse shipping(Shipping shipping) {
    
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


  public OrderErrorResponse transactions(List<TransactionResponse> transactions) {
    
    this.transactions = transactions;
    return this;
  }

  public OrderErrorResponse addTransactionsItem(TransactionResponse transactionsItem) {
    if (this.transactions == null) {
      this.transactions = new ArrayList<>();
    }
    this.transactions.add(transactionsItem);
    return this;
  }

   /**
   * Required for some payment methods (for example, Klarna).
   * @return transactions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[{\"transactionState\":\"AUTHORIZED\",\"ipgTransactionId\":\"838916029301\",\"transactionType\":\"SALE\",\"transactionAmount\":{\"total\":10.24,\"currency\":\"USD\"},\"storeId\":\"1109959991\"}]", value = "Required for some payment methods (for example, Klarna).")

  public List<TransactionResponse> getTransactions() {
    return transactions;
  }



  public void setTransactions(List<TransactionResponse> transactions) {
    this.transactions = transactions;
  }


  public OrderErrorResponse additionalDetails(AdditionalDetails additionalDetails) {
    
    this.additionalDetails = additionalDetails;
    return this;
  }

   /**
   * Get additionalDetails
   * @return additionalDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AdditionalDetails getAdditionalDetails() {
    return additionalDetails;
  }



  public void setAdditionalDetails(AdditionalDetails additionalDetails) {
    this.additionalDetails = additionalDetails;
  }


  public OrderErrorResponse error(Error error) {
    
    this.error = error;
    return this;
  }

   /**
   * Get error
   * @return error
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Error getError() {
    return error;
  }



  public void setError(Error error) {
    this.error = error;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderErrorResponse orderErrorResponse = (OrderErrorResponse) o;
    return Objects.equals(this.clientRequestId, orderErrorResponse.clientRequestId) &&
        Objects.equals(this.apiTraceId, orderErrorResponse.apiTraceId) &&
        Objects.equals(this.responseType, orderErrorResponse.responseType) &&
        Objects.equals(this.orderId, orderErrorResponse.orderId) &&
        Objects.equals(this.billing, orderErrorResponse.billing) &&
        Objects.equals(this.shipping, orderErrorResponse.shipping) &&
        Objects.equals(this.transactions, orderErrorResponse.transactions) &&
        Objects.equals(this.additionalDetails, orderErrorResponse.additionalDetails) &&
        Objects.equals(this.error, orderErrorResponse.error);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientRequestId, apiTraceId, responseType, orderId, billing, shipping, transactions, additionalDetails, error);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderErrorResponse {\n");
    sb.append("    clientRequestId: ").append(toIndentedString(clientRequestId)).append("\n");
    sb.append("    apiTraceId: ").append(toIndentedString(apiTraceId)).append("\n");
    sb.append("    responseType: ").append(toIndentedString(responseType)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    billing: ").append(toIndentedString(billing)).append("\n");
    sb.append("    shipping: ").append(toIndentedString(shipping)).append("\n");
    sb.append("    transactions: ").append(toIndentedString(transactions)).append("\n");
    sb.append("    additionalDetails: ").append(toIndentedString(additionalDetails)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
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

