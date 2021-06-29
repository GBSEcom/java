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
import com.github.GBSEcom.model.PaymentStepResponse;
import com.github.GBSEcom.model.ProvideDetailPaymentStepResponseAllOf;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Non-technical detail provided by the payer or merchant.
 */
@ApiModel(description = "Non-technical detail provided by the payer or merchant.")

public class ProvideDetailPaymentStepResponse {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_DETAIL_KEY = "detailKey";
  @SerializedName(SERIALIZED_NAME_DETAIL_KEY)
  private String detailKey;

  public static final String SERIALIZED_NAME_DETAIL_VALUE = "detailValue";
  @SerializedName(SERIALIZED_NAME_DETAIL_VALUE)
  private String detailValue;


  public ProvideDetailPaymentStepResponse type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(example = "provide-detail", required = true, value = "")

  public String getType() {
    return type;
  }



  public void setType(String type) {
    this.type = type;
  }


  public ProvideDetailPaymentStepResponse detailKey(String detailKey) {
    
    this.detailKey = detailKey;
    return this;
  }

   /**
   * MerchantIdentifier of the provided detail.
   * @return detailKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "BLIK_CODE", value = "MerchantIdentifier of the provided detail.")

  public String getDetailKey() {
    return detailKey;
  }



  public void setDetailKey(String detailKey) {
    this.detailKey = detailKey;
  }


  public ProvideDetailPaymentStepResponse detailValue(String detailValue) {
    
    this.detailValue = detailValue;
    return this;
  }

   /**
   * Value provided by the payer or merchant, validated by JavaScript regular expression
   * @return detailValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "777712", value = "Value provided by the payer or merchant, validated by JavaScript regular expression")

  public String getDetailValue() {
    return detailValue;
  }



  public void setDetailValue(String detailValue) {
    this.detailValue = detailValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProvideDetailPaymentStepResponse provideDetailPaymentStepResponse = (ProvideDetailPaymentStepResponse) o;
    return Objects.equals(this.type, provideDetailPaymentStepResponse.type) &&
        Objects.equals(this.detailKey, provideDetailPaymentStepResponse.detailKey) &&
        Objects.equals(this.detailValue, provideDetailPaymentStepResponse.detailValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, detailKey, detailValue);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProvideDetailPaymentStepResponse {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    detailKey: ").append(toIndentedString(detailKey)).append("\n");
    sb.append("    detailValue: ").append(toIndentedString(detailValue)).append("\n");
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

