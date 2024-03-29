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
 * Currency details associated with a store.
 */
@ApiModel(description = "Currency details associated with a store.")

public class StoreCurrency {
  public static final String SERIALIZED_NAME_LITERAL_CURRENCY_CODE = "literalCurrencyCode";
  @SerializedName(SERIALIZED_NAME_LITERAL_CURRENCY_CODE)
  private String literalCurrencyCode;

  public static final String SERIALIZED_NAME_NUMERIC_CURRENCY_CODE = "numericCurrencyCode";
  @SerializedName(SERIALIZED_NAME_NUMERIC_CURRENCY_CODE)
  private String numericCurrencyCode;

  public static final String SERIALIZED_NAME_DECIMAL_PLACES = "decimalPlaces";
  @SerializedName(SERIALIZED_NAME_DECIMAL_PLACES)
  private Integer decimalPlaces;

  public static final String SERIALIZED_NAME_DEFAULT_CURRENCY = "defaultCurrency";
  @SerializedName(SERIALIZED_NAME_DEFAULT_CURRENCY)
  private Boolean defaultCurrency;


  public StoreCurrency literalCurrencyCode(String literalCurrencyCode) {
    
    this.literalCurrencyCode = literalCurrencyCode;
    return this;
  }

   /**
   * This field contains the ISO alpha currency code.
   * @return literalCurrencyCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "USD", value = "This field contains the ISO alpha currency code.")

  public String getLiteralCurrencyCode() {
    return literalCurrencyCode;
  }



  public void setLiteralCurrencyCode(String literalCurrencyCode) {
    this.literalCurrencyCode = literalCurrencyCode;
  }


  public StoreCurrency numericCurrencyCode(String numericCurrencyCode) {
    
    this.numericCurrencyCode = numericCurrencyCode;
    return this;
  }

   /**
   * This field contains the ISO numeric currecy code.
   * @return numericCurrencyCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "840", value = "This field contains the ISO numeric currecy code.")

  public String getNumericCurrencyCode() {
    return numericCurrencyCode;
  }



  public void setNumericCurrencyCode(String numericCurrencyCode) {
    this.numericCurrencyCode = numericCurrencyCode;
  }


  public StoreCurrency decimalPlaces(Integer decimalPlaces) {
    
    this.decimalPlaces = decimalPlaces;
    return this;
  }

   /**
   * This field indicates the number of decimal places required for this currency.
   * @return decimalPlaces
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2", value = "This field indicates the number of decimal places required for this currency.")

  public Integer getDecimalPlaces() {
    return decimalPlaces;
  }



  public void setDecimalPlaces(Integer decimalPlaces) {
    this.decimalPlaces = decimalPlaces;
  }


  public StoreCurrency defaultCurrency(Boolean defaultCurrency) {
    
    this.defaultCurrency = defaultCurrency;
    return this;
  }

   /**
   * This field indicates if this currency is the default currency for queried store.
   * @return defaultCurrency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "This field indicates if this currency is the default currency for queried store.")

  public Boolean getDefaultCurrency() {
    return defaultCurrency;
  }



  public void setDefaultCurrency(Boolean defaultCurrency) {
    this.defaultCurrency = defaultCurrency;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StoreCurrency storeCurrency = (StoreCurrency) o;
    return Objects.equals(this.literalCurrencyCode, storeCurrency.literalCurrencyCode) &&
        Objects.equals(this.numericCurrencyCode, storeCurrency.numericCurrencyCode) &&
        Objects.equals(this.decimalPlaces, storeCurrency.decimalPlaces) &&
        Objects.equals(this.defaultCurrency, storeCurrency.defaultCurrency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(literalCurrencyCode, numericCurrencyCode, decimalPlaces, defaultCurrency);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StoreCurrency {\n");
    sb.append("    literalCurrencyCode: ").append(toIndentedString(literalCurrencyCode)).append("\n");
    sb.append("    numericCurrencyCode: ").append(toIndentedString(numericCurrencyCode)).append("\n");
    sb.append("    decimalPlaces: ").append(toIndentedString(decimalPlaces)).append("\n");
    sb.append("    defaultCurrency: ").append(toIndentedString(defaultCurrency)).append("\n");
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

