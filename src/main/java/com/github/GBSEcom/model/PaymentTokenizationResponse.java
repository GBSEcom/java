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
import com.github.GBSEcom.model.BasicResponse;
import com.github.GBSEcom.model.PaymentCard;
import com.github.GBSEcom.model.PaymentTokenDetails;
import com.github.GBSEcom.model.ProcessorData;
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
 * PaymentTokenizationResponse
 */

public class PaymentTokenizationResponse {
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
   * The status of the request.
   */
  @JsonAdapter(RequestStatusEnum.Adapter.class)
  public enum RequestStatusEnum {
    DELETED("DELETED"),
    
    FAILED("FAILED"),
    
    SUCCESS("SUCCESS"),
    
    APPROVED("APPROVED"),
    
    WAITING("WAITING"),
    
    VALIDATION_FAILED("VALIDATION_FAILED"),
    
    DECLINED("DECLINED");

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

  public static final String SERIALIZED_NAME_REQUEST_TIME = "requestTime";
  @SerializedName(SERIALIZED_NAME_REQUEST_TIME)
  private Long requestTime;

  public static final String SERIALIZED_NAME_BRAND = "brand";
  @SerializedName(SERIALIZED_NAME_BRAND)
  private String brand;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public static final String SERIALIZED_NAME_PAYMENT_TOKEN = "paymentToken";
  @SerializedName(SERIALIZED_NAME_PAYMENT_TOKEN)
  private PaymentTokenDetails paymentToken = null;

  public static final String SERIALIZED_NAME_PAYMENT_CARD = "paymentCard";
  @SerializedName(SERIALIZED_NAME_PAYMENT_CARD)
  private PaymentCard paymentCard;

  public static final String SERIALIZED_NAME_PROCESSOR = "processor";
  @SerializedName(SERIALIZED_NAME_PROCESSOR)
  private ProcessorData processor;

  public static final String SERIALIZED_NAME_ORDER_ID = "orderId";
  @SerializedName(SERIALIZED_NAME_ORDER_ID)
  private String orderId;


  public PaymentTokenizationResponse clientRequestId(String clientRequestId) {
    
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


  public PaymentTokenizationResponse apiTraceId(String apiTraceId) {
    
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


  public PaymentTokenizationResponse responseType(ResponseType responseType) {
    
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


  public PaymentTokenizationResponse requestStatus(RequestStatusEnum requestStatus) {
    
    this.requestStatus = requestStatus;
    return this;
  }

   /**
   * The status of the request.
   * @return requestStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "DELETED", value = "The status of the request.")

  public RequestStatusEnum getRequestStatus() {
    return requestStatus;
  }



  public void setRequestStatus(RequestStatusEnum requestStatus) {
    this.requestStatus = requestStatus;
  }


  public PaymentTokenizationResponse requestTime(Long requestTime) {
    
    this.requestTime = requestTime;
    return this;
  }

   /**
   * Time of the request.
   * @return requestTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1554308829345", value = "Time of the request.")

  public Long getRequestTime() {
    return requestTime;
  }



  public void setRequestTime(Long requestTime) {
    this.requestTime = requestTime;
  }


  public PaymentTokenizationResponse brand(String brand) {
    
    this.brand = brand;
    return this;
  }

   /**
   * Card brand.
   * @return brand
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "VISA", value = "Card brand.")

  public String getBrand() {
    return brand;
  }



  public void setBrand(String brand) {
    this.brand = brand;
  }


  public PaymentTokenizationResponse country(String country) {
    
    this.country = country;
    return this;
  }

   /**
   * Country of the card issued.
   * @return country
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Germany", value = "Country of the card issued.")

  public String getCountry() {
    return country;
  }



  public void setCountry(String country) {
    this.country = country;
  }


  public PaymentTokenizationResponse paymentToken(PaymentTokenDetails paymentToken) {
    
    this.paymentToken = paymentToken;
    return this;
  }

   /**
   * Get paymentToken
   * @return paymentToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PaymentTokenDetails getPaymentToken() {
    return paymentToken;
  }



  public void setPaymentToken(PaymentTokenDetails paymentToken) {
    this.paymentToken = paymentToken;
  }


  public PaymentTokenizationResponse paymentCard(PaymentCard paymentCard) {
    
    this.paymentCard = paymentCard;
    return this;
  }

   /**
   * Get paymentCard
   * @return paymentCard
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PaymentCard getPaymentCard() {
    return paymentCard;
  }



  public void setPaymentCard(PaymentCard paymentCard) {
    this.paymentCard = paymentCard;
  }


  public PaymentTokenizationResponse processor(ProcessorData processor) {
    
    this.processor = processor;
    return this;
  }

   /**
   * Get processor
   * @return processor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ProcessorData getProcessor() {
    return processor;
  }



  public void setProcessor(ProcessorData processor) {
    this.processor = processor;
  }


  public PaymentTokenizationResponse orderId(String orderId) {
    
    this.orderId = orderId;
    return this;
  }

   /**
   * Client order ID if supplied by client, otherwise the order ID.
   * @return orderId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "R-44df6542-ae0b-4415-88e8-7f3e62cc9e5d", value = "Client order ID if supplied by client, otherwise the order ID.")

  public String getOrderId() {
    return orderId;
  }



  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentTokenizationResponse paymentTokenizationResponse = (PaymentTokenizationResponse) o;
    return Objects.equals(this.clientRequestId, paymentTokenizationResponse.clientRequestId) &&
        Objects.equals(this.apiTraceId, paymentTokenizationResponse.apiTraceId) &&
        Objects.equals(this.responseType, paymentTokenizationResponse.responseType) &&
        Objects.equals(this.requestStatus, paymentTokenizationResponse.requestStatus) &&
        Objects.equals(this.requestTime, paymentTokenizationResponse.requestTime) &&
        Objects.equals(this.brand, paymentTokenizationResponse.brand) &&
        Objects.equals(this.country, paymentTokenizationResponse.country) &&
        Objects.equals(this.paymentToken, paymentTokenizationResponse.paymentToken) &&
        Objects.equals(this.paymentCard, paymentTokenizationResponse.paymentCard) &&
        Objects.equals(this.processor, paymentTokenizationResponse.processor) &&
        Objects.equals(this.orderId, paymentTokenizationResponse.orderId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientRequestId, apiTraceId, responseType, requestStatus, requestTime, brand, country, paymentToken, paymentCard, processor, orderId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentTokenizationResponse {\n");
    sb.append("    clientRequestId: ").append(toIndentedString(clientRequestId)).append("\n");
    sb.append("    apiTraceId: ").append(toIndentedString(apiTraceId)).append("\n");
    sb.append("    responseType: ").append(toIndentedString(responseType)).append("\n");
    sb.append("    requestStatus: ").append(toIndentedString(requestStatus)).append("\n");
    sb.append("    requestTime: ").append(toIndentedString(requestTime)).append("\n");
    sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    paymentToken: ").append(toIndentedString(paymentToken)).append("\n");
    sb.append("    paymentCard: ").append(toIndentedString(paymentCard)).append("\n");
    sb.append("    processor: ").append(toIndentedString(processor)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
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

