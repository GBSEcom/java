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
import com.github.GBSEcom.model.Error;
import com.github.GBSEcom.model.PaymentUrlResponse;
import com.github.GBSEcom.model.ResponseType;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Payment URL response with error field included.
 */
@ApiModel(description = "Payment URL response with error field included.")

public class PaymentUrlErrorResponse {
  public static final String SERIALIZED_NAME_CLIENT_REQUEST_ID = "clientRequestId";
  @SerializedName(SERIALIZED_NAME_CLIENT_REQUEST_ID)
  private String clientRequestId;

  public static final String SERIALIZED_NAME_API_TRACE_ID = "apiTraceId";
  @SerializedName(SERIALIZED_NAME_API_TRACE_ID)
  private String apiTraceId;

  public static final String SERIALIZED_NAME_RESPONSE_TYPE = "responseType";
  @SerializedName(SERIALIZED_NAME_RESPONSE_TYPE)
  private ResponseType responseType;

  /**
   * Request status. If it is anything other than &#39;SUCCESS&#39;, please refer to 400s HTTP error codes or decline. See Error object for details.
   */
  @JsonAdapter(RequestStatusEnum.Adapter.class)
  public enum RequestStatusEnum {
    SUCCESS("SUCCESS"),
    
    VALIDATION_FAILED("VALIDATION_FAILED"),
    
    PROCESSING_FAILED("PROCESSING_FAILED"),
    
    FAILURE("FAILURE");

    private String value;

    RequestStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RequestStatusEnum fromValue(String value) {
      for (RequestStatusEnum b : RequestStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<RequestStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RequestStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RequestStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return RequestStatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_REQUEST_STATUS = "requestStatus";
  @SerializedName(SERIALIZED_NAME_REQUEST_STATUS)
  private RequestStatusEnum requestStatus;

  public static final String SERIALIZED_NAME_ORDER_ID = "orderId";
  @SerializedName(SERIALIZED_NAME_ORDER_ID)
  private String orderId;

  public static final String SERIALIZED_NAME_PAYMENT_URL = "paymentUrl";
  @SerializedName(SERIALIZED_NAME_PAYMENT_URL)
  private String paymentUrl;

  public static final String SERIALIZED_NAME_TRANSACTION_ID = "transactionId";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_ID)
  private String transactionId;

  public static final String SERIALIZED_NAME_ERROR = "error";
  @SerializedName(SERIALIZED_NAME_ERROR)
  private Error error;


  public PaymentUrlErrorResponse clientRequestId(String clientRequestId) {
    
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


  public PaymentUrlErrorResponse apiTraceId(String apiTraceId) {
    
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


  public PaymentUrlErrorResponse responseType(ResponseType responseType) {
    
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


  public PaymentUrlErrorResponse requestStatus(RequestStatusEnum requestStatus) {
    
    this.requestStatus = requestStatus;
    return this;
  }

   /**
   * Request status. If it is anything other than &#39;SUCCESS&#39;, please refer to 400s HTTP error codes or decline. See Error object for details.
   * @return requestStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SUCCESS", value = "Request status. If it is anything other than 'SUCCESS', please refer to 400s HTTP error codes or decline. See Error object for details.")

  public RequestStatusEnum getRequestStatus() {
    return requestStatus;
  }



  public void setRequestStatus(RequestStatusEnum requestStatus) {
    this.requestStatus = requestStatus;
  }


  public PaymentUrlErrorResponse orderId(String orderId) {
    
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


  public PaymentUrlErrorResponse paymentUrl(String paymentUrl) {
    
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


  public PaymentUrlErrorResponse transactionId(String transactionId) {
    
    this.transactionId = transactionId;
    return this;
  }

   /**
   * ID code from the transaction.
   * @return transactionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123978432", value = "ID code from the transaction.")

  public String getTransactionId() {
    return transactionId;
  }



  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }


  public PaymentUrlErrorResponse error(Error error) {
    
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
    PaymentUrlErrorResponse paymentUrlErrorResponse = (PaymentUrlErrorResponse) o;
    return Objects.equals(this.clientRequestId, paymentUrlErrorResponse.clientRequestId) &&
        Objects.equals(this.apiTraceId, paymentUrlErrorResponse.apiTraceId) &&
        Objects.equals(this.responseType, paymentUrlErrorResponse.responseType) &&
        Objects.equals(this.requestStatus, paymentUrlErrorResponse.requestStatus) &&
        Objects.equals(this.orderId, paymentUrlErrorResponse.orderId) &&
        Objects.equals(this.paymentUrl, paymentUrlErrorResponse.paymentUrl) &&
        Objects.equals(this.transactionId, paymentUrlErrorResponse.transactionId) &&
        Objects.equals(this.error, paymentUrlErrorResponse.error);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientRequestId, apiTraceId, responseType, requestStatus, orderId, paymentUrl, transactionId, error);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentUrlErrorResponse {\n");
    sb.append("    clientRequestId: ").append(toIndentedString(clientRequestId)).append("\n");
    sb.append("    apiTraceId: ").append(toIndentedString(apiTraceId)).append("\n");
    sb.append("    responseType: ").append(toIndentedString(responseType)).append("\n");
    sb.append("    requestStatus: ").append(toIndentedString(requestStatus)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    paymentUrl: ").append(toIndentedString(paymentUrl)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
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

