/*
 * Payment Gateway API Specification.
 * The documentation here is designed to provide all of the technical guidance required to consume and integrate with our APIs for payment processing. To learn more about our APIs please visit https://docs.firstdata.com/org/gateway.
 *
 * OpenAPI spec version: 6.10.1.20200226.002
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
 * ErrorDetails
 */

public class ErrorDetails {
  public static final String SERIALIZED_NAME_FIELD = "field";
  @SerializedName(SERIALIZED_NAME_FIELD)
  private String field;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public ErrorDetails field(String field) {
    this.field = field;
    return this;
  }

   /**
   * The property or attribute associated with the error.
   * @return field
  **/
  @ApiModelProperty(example = "PaymentCard.number", value = "The property or attribute associated with the error.")
  public String getField() {
    return field;
  }

  public void setField(String field) {
    this.field = field;
  }

  public ErrorDetails message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Information specific to a property or attribute.
   * @return message
  **/
  @ApiModelProperty(example = "may not be null", value = "Information specific to a property or attribute.")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorDetails errorDetails = (ErrorDetails) o;
    return Objects.equals(this.field, errorDetails.field) &&
        Objects.equals(this.message, errorDetails.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field, message);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorDetails {\n");
    
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

