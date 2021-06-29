/*
 * Payment Gateway API Specification.
 * The documentation here is designed to provide all of the technical guidance required to consume and integrate with our APIs for payment processing. To learn more about our APIs please visit https://docs.firstdata.com/org/gateway.
 *
 * The version of the OpenAPI document: 21.3.0.20210608.001
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
import com.github.GBSEcom.model.ExchangeRateDetails;
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
 * Exchange rate response.
 */
@ApiModel(description = "Exchange rate response.")

public class ExchangeRateResponse {
  public static final String SERIALIZED_NAME_CLIENT_REQUEST_ID = "clientRequestId";
  @SerializedName(SERIALIZED_NAME_CLIENT_REQUEST_ID)
  private String clientRequestId;

  public static final String SERIALIZED_NAME_API_TRACE_ID = "apiTraceId";
  @SerializedName(SERIALIZED_NAME_API_TRACE_ID)
  private String apiTraceId;

  public static final String SERIALIZED_NAME_RESPONSE_TYPE = "responseType";
  @SerializedName(SERIALIZED_NAME_RESPONSE_TYPE)
  private ResponseType responseType;

  public static final String SERIALIZED_NAME_IPG_TRANSACTION_ID = "ipgTransactionId";
  @SerializedName(SERIALIZED_NAME_IPG_TRANSACTION_ID)
  private String ipgTransactionId;

  public static final String SERIALIZED_NAME_REQUEST_TIME = "requestTime";
  @SerializedName(SERIALIZED_NAME_REQUEST_TIME)
  private String requestTime;

  public static final String SERIALIZED_NAME_EXCHANGE_RATE_DETAILS = "exchangeRateDetails";
  @SerializedName(SERIALIZED_NAME_EXCHANGE_RATE_DETAILS)
  private ExchangeRateDetails exchangeRateDetails;


  public ExchangeRateResponse clientRequestId(String clientRequestId) {
    
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


  public ExchangeRateResponse apiTraceId(String apiTraceId) {
    
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


  public ExchangeRateResponse responseType(ResponseType responseType) {
    
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


  public ExchangeRateResponse ipgTransactionId(String ipgTransactionId) {
    
    this.ipgTransactionId = ipgTransactionId;
    return this;
  }

   /**
   * The response transaction ID.
   * @return ipgTransactionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "838916029301", value = "The response transaction ID.")

  public String getIpgTransactionId() {
    return ipgTransactionId;
  }



  public void setIpgTransactionId(String ipgTransactionId) {
    this.ipgTransactionId = ipgTransactionId;
  }


  public ExchangeRateResponse requestTime(String requestTime) {
    
    this.requestTime = requestTime;
    return this;
  }

   /**
   * Time of the request. The used format is \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSXXX\&quot;.
   * @return requestTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2018-12-05T14:13:00.000-05:00", value = "Time of the request. The used format is \"yyyy-MM-dd'T'HH:mm:ss.SSSXXX\".")

  public String getRequestTime() {
    return requestTime;
  }



  public void setRequestTime(String requestTime) {
    this.requestTime = requestTime;
  }


  public ExchangeRateResponse exchangeRateDetails(ExchangeRateDetails exchangeRateDetails) {
    
    this.exchangeRateDetails = exchangeRateDetails;
    return this;
  }

   /**
   * Get exchangeRateDetails
   * @return exchangeRateDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ExchangeRateDetails getExchangeRateDetails() {
    return exchangeRateDetails;
  }



  public void setExchangeRateDetails(ExchangeRateDetails exchangeRateDetails) {
    this.exchangeRateDetails = exchangeRateDetails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExchangeRateResponse exchangeRateResponse = (ExchangeRateResponse) o;
    return Objects.equals(this.clientRequestId, exchangeRateResponse.clientRequestId) &&
        Objects.equals(this.apiTraceId, exchangeRateResponse.apiTraceId) &&
        Objects.equals(this.responseType, exchangeRateResponse.responseType) &&
        Objects.equals(this.ipgTransactionId, exchangeRateResponse.ipgTransactionId) &&
        Objects.equals(this.requestTime, exchangeRateResponse.requestTime) &&
        Objects.equals(this.exchangeRateDetails, exchangeRateResponse.exchangeRateDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientRequestId, apiTraceId, responseType, ipgTransactionId, requestTime, exchangeRateDetails);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExchangeRateResponse {\n");
    sb.append("    clientRequestId: ").append(toIndentedString(clientRequestId)).append("\n");
    sb.append("    apiTraceId: ").append(toIndentedString(apiTraceId)).append("\n");
    sb.append("    responseType: ").append(toIndentedString(responseType)).append("\n");
    sb.append("    ipgTransactionId: ").append(toIndentedString(ipgTransactionId)).append("\n");
    sb.append("    requestTime: ").append(toIndentedString(requestTime)).append("\n");
    sb.append("    exchangeRateDetails: ").append(toIndentedString(exchangeRateDetails)).append("\n");
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

