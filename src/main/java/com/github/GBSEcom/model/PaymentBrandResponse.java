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
import com.github.GBSEcom.model.ResponseType;
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
 * List of available brands of a store.
 */
@ApiModel(description = "List of available brands of a store.")

public class PaymentBrandResponse {
  public static final String SERIALIZED_NAME_CLIENT_REQUEST_ID = "clientRequestId";
  @SerializedName(SERIALIZED_NAME_CLIENT_REQUEST_ID)
  private String clientRequestId;

  public static final String SERIALIZED_NAME_API_TRACE_ID = "apiTraceId";
  @SerializedName(SERIALIZED_NAME_API_TRACE_ID)
  private String apiTraceId;

  public static final String SERIALIZED_NAME_RESPONSE_TYPE = "responseType";
  @SerializedName(SERIALIZED_NAME_RESPONSE_TYPE)
  private ResponseType responseType;

  public static final String SERIALIZED_NAME_BRANDS = "brands";
  @SerializedName(SERIALIZED_NAME_BRANDS)
  private List<String> brands = null;


  public PaymentBrandResponse clientRequestId(String clientRequestId) {
    
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


  public PaymentBrandResponse apiTraceId(String apiTraceId) {
    
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


  public PaymentBrandResponse responseType(ResponseType responseType) {
    
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


  public PaymentBrandResponse brands(List<String> brands) {
    
    this.brands = brands;
    return this;
  }

  public PaymentBrandResponse addBrandsItem(String brandsItem) {
    if (this.brands == null) {
      this.brands = new ArrayList<>();
    }
    this.brands.add(brandsItem);
    return this;
  }

   /**
   * Get brands
   * @return brands
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getBrands() {
    return brands;
  }



  public void setBrands(List<String> brands) {
    this.brands = brands;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentBrandResponse paymentBrandResponse = (PaymentBrandResponse) o;
    return Objects.equals(this.clientRequestId, paymentBrandResponse.clientRequestId) &&
        Objects.equals(this.apiTraceId, paymentBrandResponse.apiTraceId) &&
        Objects.equals(this.responseType, paymentBrandResponse.responseType) &&
        Objects.equals(this.brands, paymentBrandResponse.brands);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientRequestId, apiTraceId, responseType, brands);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentBrandResponse {\n");
    sb.append("    clientRequestId: ").append(toIndentedString(clientRequestId)).append("\n");
    sb.append("    apiTraceId: ").append(toIndentedString(apiTraceId)).append("\n");
    sb.append("    responseType: ").append(toIndentedString(responseType)).append("\n");
    sb.append("    brands: ").append(toIndentedString(brands)).append("\n");
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

