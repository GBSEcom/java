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

/**
 * Use this model to create a payment token.
 */
@ApiModel(description = "Use this model to create a payment token.")

public class CreatePaymentToken {
  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public static final String SERIALIZED_NAME_REUSABLE = "reusable";
  @SerializedName(SERIALIZED_NAME_REUSABLE)
  private Boolean reusable = true;

  public static final String SERIALIZED_NAME_DECLINE_DUPLICATES = "declineDuplicates";
  @SerializedName(SERIALIZED_NAME_DECLINE_DUPLICATES)
  private Boolean declineDuplicates = false;


  public CreatePaymentToken value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * Client-supplied payment token value. Only applicable for DataVault tokenization scheme.
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "234ljl124l12", value = "Client-supplied payment token value. Only applicable for DataVault tokenization scheme.")

  public String getValue() {
    return value;
  }



  public void setValue(String value) {
    this.value = value;
  }


  public CreatePaymentToken reusable(Boolean reusable) {
    
    this.reusable = reusable;
    return this;
  }

   /**
   * If the token is reusable.
   * @return reusable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "If the token is reusable.")

  public Boolean getReusable() {
    return reusable;
  }



  public void setReusable(Boolean reusable) {
    this.reusable = reusable;
  }


  public CreatePaymentToken declineDuplicates(Boolean declineDuplicates) {
    
    this.declineDuplicates = declineDuplicates;
    return this;
  }

   /**
   * Decline duplicate payment info if client token is supplied.
   * @return declineDuplicates
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "Decline duplicate payment info if client token is supplied.")

  public Boolean getDeclineDuplicates() {
    return declineDuplicates;
  }



  public void setDeclineDuplicates(Boolean declineDuplicates) {
    this.declineDuplicates = declineDuplicates;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreatePaymentToken createPaymentToken = (CreatePaymentToken) o;
    return Objects.equals(this.value, createPaymentToken.value) &&
        Objects.equals(this.reusable, createPaymentToken.reusable) &&
        Objects.equals(this.declineDuplicates, createPaymentToken.declineDuplicates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, reusable, declineDuplicates);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreatePaymentToken {\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    reusable: ").append(toIndentedString(reusable)).append("\n");
    sb.append("    declineDuplicates: ").append(toIndentedString(declineDuplicates)).append("\n");
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

