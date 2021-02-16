/*
 * Payment Gateway API Specification.
 * The documentation here is designed to provide all of the technical guidance required to consume and integrate with our APIs for payment processing. To learn more about our APIs please visit https://docs.firstdata.com/org/gateway.
 *
 * The version of the OpenAPI document: 21.1.0.20210122.001
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.github.GBSEcom.model;

import java.util.Objects;
import java.util.Arrays;
import com.github.GBSEcom.model.AmountComponents;
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
 * Amount of the transaction.
 */
@ApiModel(description = "Amount of the transaction.")

public class Amount {
  public static final String SERIALIZED_NAME_TOTAL = "total";
  @SerializedName(SERIALIZED_NAME_TOTAL)
  private BigDecimal total;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public static final String SERIALIZED_NAME_COMPONENTS = "components";
  @SerializedName(SERIALIZED_NAME_COMPONENTS)
  private AmountComponents components;


  public Amount total(BigDecimal total) {
    
    this.total = total;
    return this;
  }

   /**
   * Sub component values must add up to total amount.
   * minimum: 0
   * @return total
  **/
  @ApiModelProperty(example = "10.24", required = true, value = "Sub component values must add up to total amount.")

  public BigDecimal getTotal() {
    return total;
  }



  public void setTotal(BigDecimal total) {
    this.total = total;
  }


  public Amount currency(String currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * ISO 4217 currency code.
   * @return currency
  **/
  @ApiModelProperty(example = "USD", required = true, value = "ISO 4217 currency code.")

  public String getCurrency() {
    return currency;
  }



  public void setCurrency(String currency) {
    this.currency = currency;
  }


  public Amount components(AmountComponents components) {
    
    this.components = components;
    return this;
  }

   /**
   * Get components
   * @return components
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AmountComponents getComponents() {
    return components;
  }



  public void setComponents(AmountComponents components) {
    this.components = components;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Amount amount = (Amount) o;
    return Objects.equals(this.total, amount.total) &&
        Objects.equals(this.currency, amount.currency) &&
        Objects.equals(this.components, amount.components);
  }

  @Override
  public int hashCode() {
    return Objects.hash(total, currency, components);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Amount {\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    components: ").append(toIndentedString(components)).append("\n");
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

