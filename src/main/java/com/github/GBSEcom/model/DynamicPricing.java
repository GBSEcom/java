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
import com.github.GBSEcom.model.CurrencyConversion;
import com.github.GBSEcom.model.DynamicPricingAllOf;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Request to perform a dynamic pricing exchange rate inquiry.
 */
@ApiModel(description = "Request to perform a dynamic pricing exchange rate inquiry.")

public class DynamicPricing extends CurrencyConversion {
  public static final String SERIALIZED_NAME_FOREIGN_CURRENCY = "foreignCurrency";
  @SerializedName(SERIALIZED_NAME_FOREIGN_CURRENCY)
  private String foreignCurrency;

  public static final String SERIALIZED_NAME_FOREIGN_AMOUNT = "foreignAmount";
  @SerializedName(SERIALIZED_NAME_FOREIGN_AMOUNT)
  private String foreignAmount;


  public DynamicPricing foreignCurrency(String foreignCurrency) {
    
    this.foreignCurrency = foreignCurrency;
    return this;
  }

   /**
   * The currency code to convert for dynamic pricing in ISO 4217 currency code format.
   * @return foreignCurrency
  **/
  @ApiModelProperty(example = "978", required = true, value = "The currency code to convert for dynamic pricing in ISO 4217 currency code format.")

  public String getForeignCurrency() {
    return foreignCurrency;
  }



  public void setForeignCurrency(String foreignCurrency) {
    this.foreignCurrency = foreignCurrency;
  }


  public DynamicPricing foreignAmount(String foreignAmount) {
    
    this.foreignAmount = foreignAmount;
    return this;
  }

   /**
   * Foreign amount.
   * @return foreignAmount
  **/
  @ApiModelProperty(example = "22.52", required = true, value = "Foreign amount.")

  public String getForeignAmount() {
    return foreignAmount;
  }



  public void setForeignAmount(String foreignAmount) {
    this.foreignAmount = foreignAmount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DynamicPricing dynamicPricing = (DynamicPricing) o;
    return Objects.equals(this.foreignCurrency, dynamicPricing.foreignCurrency) &&
        Objects.equals(this.foreignAmount, dynamicPricing.foreignAmount) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(foreignCurrency, foreignAmount, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DynamicPricing {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    foreignCurrency: ").append(toIndentedString(foreignCurrency)).append("\n");
    sb.append("    foreignAmount: ").append(toIndentedString(foreignAmount)).append("\n");
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

