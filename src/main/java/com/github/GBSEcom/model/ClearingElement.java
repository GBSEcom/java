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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Holds brand specific clearing information.
 */
@ApiModel(description = "Holds brand specific clearing information.")

public class ClearingElement {
  public static final String SERIALIZED_NAME_BRAND = "brand";
  @SerializedName(SERIALIZED_NAME_BRAND)
  private String brand;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private Long value;

  public static final String SERIALIZED_NAME_COUNT = "count";
  @SerializedName(SERIALIZED_NAME_COUNT)
  private Integer count;


  public ClearingElement brand(String brand) {
    
    this.brand = brand;
    return this;
  }

   /**
   * Contains the brand of the card.
   * @return brand
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "VISA", value = "Contains the brand of the card.")

  public String getBrand() {
    return brand;
  }



  public void setBrand(String brand) {
    this.brand = brand;
  }


  public ClearingElement value(Long value) {
    
    this.value = value;
    return this;
  }

   /**
   * Holds the total clearing value computed for a specific brand.
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1234", value = "Holds the total clearing value computed for a specific brand.")

  public Long getValue() {
    return value;
  }



  public void setValue(Long value) {
    this.value = value;
  }


  public ClearingElement count(Integer count) {
    
    this.count = count;
    return this;
  }

   /**
   * Specifies the amount of clearing elements for a given brand.
   * @return count
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1234", value = "Specifies the amount of clearing elements for a given brand.")

  public Integer getCount() {
    return count;
  }



  public void setCount(Integer count) {
    this.count = count;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClearingElement clearingElement = (ClearingElement) o;
    return Objects.equals(this.brand, clearingElement.brand) &&
        Objects.equals(this.value, clearingElement.value) &&
        Objects.equals(this.count, clearingElement.count);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brand, value, count);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClearingElement {\n");
    sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
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

