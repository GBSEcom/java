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
 * Required for normal transactions except for payment with &#39;RECURRING&#39; flags.
 */
@ApiModel(description = "Required for normal transactions except for payment with 'RECURRING' flags.")

public class Expiration {
  public static final String SERIALIZED_NAME_MONTH = "month";
  @SerializedName(SERIALIZED_NAME_MONTH)
  private String month;

  public static final String SERIALIZED_NAME_YEAR = "year";
  @SerializedName(SERIALIZED_NAME_YEAR)
  private String year;


  public Expiration month(String month) {
    
    this.month = month;
    return this;
  }

   /**
   * Month of the card expiration date in MM format.
   * @return month
  **/
  @ApiModelProperty(example = "03", required = true, value = "Month of the card expiration date in MM format.")

  public String getMonth() {
    return month;
  }



  public void setMonth(String month) {
    this.month = month;
  }


  public Expiration year(String year) {
    
    this.year = year;
    return this;
  }

   /**
   * Year of the card expiration date in YY format.
   * @return year
  **/
  @ApiModelProperty(example = "21", required = true, value = "Year of the card expiration date in YY format.")

  public String getYear() {
    return year;
  }



  public void setYear(String year) {
    this.year = year;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Expiration expiration = (Expiration) o;
    return Objects.equals(this.month, expiration.month) &&
        Objects.equals(this.year, expiration.year);
  }

  @Override
  public int hashCode() {
    return Objects.hash(month, year);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Expiration {\n");
    sb.append("    month: ").append(toIndentedString(month)).append("\n");
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
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

