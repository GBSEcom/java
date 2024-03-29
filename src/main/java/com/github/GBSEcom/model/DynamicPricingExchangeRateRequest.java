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
import com.github.GBSEcom.model.DynamicPricingExchangeRateRequestAllOf;
import com.github.GBSEcom.model.ExchangeRateRequest;
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
 * Request to perform a dynamic pricing exchange rate inquiry.
 */
@ApiModel(description = "Request to perform a dynamic pricing exchange rate inquiry.")

public class DynamicPricingExchangeRateRequest extends ExchangeRateRequest {
  public static final String SERIALIZED_NAME_FOREIGN_CURRENCY = "foreignCurrency";
  @SerializedName(SERIALIZED_NAME_FOREIGN_CURRENCY)
  private String foreignCurrency;


  public DynamicPricingExchangeRateRequest foreignCurrency(String foreignCurrency) {
    
    this.foreignCurrency = foreignCurrency;
    return this;
  }

   /**
   * The currency code to convert for dynamic pricing in either numeric or alphabetic ISO 4217 currency code format.
   * @return foreignCurrency
  **/
  @ApiModelProperty(example = "USD", required = true, value = "The currency code to convert for dynamic pricing in either numeric or alphabetic ISO 4217 currency code format.")

  public String getForeignCurrency() {
    return foreignCurrency;
  }



  public void setForeignCurrency(String foreignCurrency) {
    this.foreignCurrency = foreignCurrency;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DynamicPricingExchangeRateRequest dynamicPricingExchangeRateRequest = (DynamicPricingExchangeRateRequest) o;
    return Objects.equals(this.foreignCurrency, dynamicPricingExchangeRateRequest.foreignCurrency) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(foreignCurrency, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DynamicPricingExchangeRateRequest {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    foreignCurrency: ").append(toIndentedString(foreignCurrency)).append("\n");
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

