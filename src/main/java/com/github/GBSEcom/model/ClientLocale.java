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
 * Country and language of client.
 */
@ApiModel(description = "Country and language of client.")

public class ClientLocale {
  public static final String SERIALIZED_NAME_LANGUAGE = "language";
  @SerializedName(SERIALIZED_NAME_LANGUAGE)
  private String language;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;


  public ClientLocale language(String language) {
    
    this.language = language;
    return this;
  }

   /**
   * Language used by client.
   * @return language
  **/
  @ApiModelProperty(example = "en", required = true, value = "Language used by client.")

  public String getLanguage() {
    return language;
  }



  public void setLanguage(String language) {
    this.language = language;
  }


  public ClientLocale country(String country) {
    
    this.country = country;
    return this;
  }

   /**
   * Country of the client.
   * @return country
  **/
  @ApiModelProperty(example = "GB", required = true, value = "Country of the client.")

  public String getCountry() {
    return country;
  }



  public void setCountry(String country) {
    this.country = country;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClientLocale clientLocale = (ClientLocale) o;
    return Objects.equals(this.language, clientLocale.language) &&
        Objects.equals(this.country, clientLocale.country);
  }

  @Override
  public int hashCode() {
    return Objects.hash(language, country);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClientLocale {\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
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

