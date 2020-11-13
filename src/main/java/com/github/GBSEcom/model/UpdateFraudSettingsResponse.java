/*
 * Payment Gateway API Specification.
 * The documentation here is designed to provide all of the technical guidance required to consume and integrate with our APIs for payment processing. To learn more about our APIs please visit https://docs.firstdata.com/org/gateway.
 *
 * The version of the OpenAPI document: 6.14.0.20201015.001
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
import com.github.GBSEcom.model.StoreFraudSettingsResult;
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
 * Response from update fraud settings request.
 */
@ApiModel(description = "Response from update fraud settings request.")

public class UpdateFraudSettingsResponse {
  public static final String SERIALIZED_NAME_CLIENT_REQUEST_ID = "clientRequestId";
  @SerializedName(SERIALIZED_NAME_CLIENT_REQUEST_ID)
  private String clientRequestId;

  public static final String SERIALIZED_NAME_API_TRACE_ID = "apiTraceId";
  @SerializedName(SERIALIZED_NAME_API_TRACE_ID)
  private String apiTraceId;

  public static final String SERIALIZED_NAME_RESPONSE_TYPE = "responseType";
  @SerializedName(SERIALIZED_NAME_RESPONSE_TYPE)
  private ResponseType responseType;

  public static final String SERIALIZED_NAME_STORES = "stores";
  @SerializedName(SERIALIZED_NAME_STORES)
  private List<StoreFraudSettingsResult> stores = null;


  public UpdateFraudSettingsResponse clientRequestId(String clientRequestId) {
    
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


  public UpdateFraudSettingsResponse apiTraceId(String apiTraceId) {
    
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


  public UpdateFraudSettingsResponse responseType(ResponseType responseType) {
    
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


  public UpdateFraudSettingsResponse stores(List<StoreFraudSettingsResult> stores) {
    
    this.stores = stores;
    return this;
  }

  public UpdateFraudSettingsResponse addStoresItem(StoreFraudSettingsResult storesItem) {
    if (this.stores == null) {
      this.stores = new ArrayList<>();
    }
    this.stores.add(storesItem);
    return this;
  }

   /**
   * Get stores
   * @return stores
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[{\"id\":\"12345500000\",\"blockedCardIdentifier\":{\"tokenIdentifier\":\"570e66b0d4fd91b27155a36911220e0e98d0db7e22fcf0b86544fdf175c707d0\"},\"status\":\"SUCCESS. Fraud settings was updated successfully.\"},{\"id\":\"1234550000044\",\"blockedCardIdentifier\":{\"tokenIdentifier\":\"8535993dsrfs9898fssdfgddse9898fv9dfu8f98d0db7e22fcf0b86544fdf178\"},\"status\":\"SUCCESS. Fraud settings was updated successfully.\"}]", value = "")

  public List<StoreFraudSettingsResult> getStores() {
    return stores;
  }



  public void setStores(List<StoreFraudSettingsResult> stores) {
    this.stores = stores;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateFraudSettingsResponse updateFraudSettingsResponse = (UpdateFraudSettingsResponse) o;
    return Objects.equals(this.clientRequestId, updateFraudSettingsResponse.clientRequestId) &&
        Objects.equals(this.apiTraceId, updateFraudSettingsResponse.apiTraceId) &&
        Objects.equals(this.responseType, updateFraudSettingsResponse.responseType) &&
        Objects.equals(this.stores, updateFraudSettingsResponse.stores);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientRequestId, apiTraceId, responseType, stores);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateFraudSettingsResponse {\n");
    sb.append("    clientRequestId: ").append(toIndentedString(clientRequestId)).append("\n");
    sb.append("    apiTraceId: ").append(toIndentedString(apiTraceId)).append("\n");
    sb.append("    responseType: ").append(toIndentedString(responseType)).append("\n");
    sb.append("    stores: ").append(toIndentedString(stores)).append("\n");
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

