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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * Request to perform an exchange rate inquiry. Abstract class, do not use this class directly, use one of its children.
 */
@ApiModel(description = "Request to perform an exchange rate inquiry. Abstract class, do not use this class directly, use one of its children.")


public class ExchangeRateRequest {
  public static final String SERIALIZED_NAME_REQUEST_TYPE = "requestType";
  @SerializedName(SERIALIZED_NAME_REQUEST_TYPE)
  private String requestType;

  public static final String SERIALIZED_NAME_BASE_AMOUNT = "baseAmount";
  @SerializedName(SERIALIZED_NAME_BASE_AMOUNT)
  private BigDecimal baseAmount;

  public static final String SERIALIZED_NAME_STORE_ID = "storeId";
  @SerializedName(SERIALIZED_NAME_STORE_ID)
  private String storeId;

  public ExchangeRateRequest() {
    this.requestType = this.getClass().getSimpleName();
  }

  public ExchangeRateRequest requestType(String requestType) {
    
    this.requestType = requestType;
    return this;
  }

   /**
   * Object name of the exchange rate request.
   * @return requestType
  **/
  @ApiModelProperty(example = "DCCExchangeRateRequest", required = true, value = "Object name of the exchange rate request.")

  public String getRequestType() {
    return requestType;
  }



  public void setRequestType(String requestType) {
    this.requestType = requestType;
  }


  public ExchangeRateRequest baseAmount(BigDecimal baseAmount) {
    
    this.baseAmount = baseAmount;
    return this;
  }

   /**
   * The original amount of the merchant currency for calculation.
   * @return baseAmount
  **/
  @ApiModelProperty(example = "12.32", required = true, value = "The original amount of the merchant currency for calculation.")

  public BigDecimal getBaseAmount() {
    return baseAmount;
  }



  public void setBaseAmount(BigDecimal baseAmount) {
    this.baseAmount = baseAmount;
  }


  public ExchangeRateRequest storeId(String storeId) {
    
    this.storeId = storeId;
    return this;
  }

   /**
   * An optional outlet ID for clients that support multiple stores in the same app.
   * @return storeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1109959991", value = "An optional outlet ID for clients that support multiple stores in the same app.")

  public String getStoreId() {
    return storeId;
  }



  public void setStoreId(String storeId) {
    this.storeId = storeId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExchangeRateRequest exchangeRateRequest = (ExchangeRateRequest) o;
    return Objects.equals(this.requestType, exchangeRateRequest.requestType) &&
        Objects.equals(this.baseAmount, exchangeRateRequest.baseAmount) &&
        Objects.equals(this.storeId, exchangeRateRequest.storeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestType, baseAmount, storeId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExchangeRateRequest {\n");
    sb.append("    requestType: ").append(toIndentedString(requestType)).append("\n");
    sb.append("    baseAmount: ").append(toIndentedString(baseAmount)).append("\n");
    sb.append("    storeId: ").append(toIndentedString(storeId)).append("\n");
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

