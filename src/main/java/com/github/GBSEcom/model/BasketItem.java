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
import com.github.GBSEcom.model.Option;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Item details.
 */
@ApiModel(description = "Item details.")

public class BasketItem {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_SUB_TOTAL = "subTotal";
  @SerializedName(SERIALIZED_NAME_SUB_TOTAL)
  private BigDecimal subTotal;

  public static final String SERIALIZED_NAME_VALUE_ADDED_TAX = "valueAddedTax";
  @SerializedName(SERIALIZED_NAME_VALUE_ADDED_TAX)
  private BigDecimal valueAddedTax;

  public static final String SERIALIZED_NAME_LOCAL_TAX = "localTax";
  @SerializedName(SERIALIZED_NAME_LOCAL_TAX)
  private BigDecimal localTax;

  public static final String SERIALIZED_NAME_DELIVERY_AMOUNT = "deliveryAmount";
  @SerializedName(SERIALIZED_NAME_DELIVERY_AMOUNT)
  private BigDecimal deliveryAmount;

  public static final String SERIALIZED_NAME_CHARGE_TOTAL = "chargeTotal";
  @SerializedName(SERIALIZED_NAME_CHARGE_TOTAL)
  private BigDecimal chargeTotal;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public static final String SERIALIZED_NAME_QUANTITY = "quantity";
  @SerializedName(SERIALIZED_NAME_QUANTITY)
  private Long quantity;

  public static final String SERIALIZED_NAME_CATEGORY = "category";
  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private String category;

  public static final String SERIALIZED_NAME_DETAILED_CATEGORY = "detailedCategory";
  @SerializedName(SERIALIZED_NAME_DETAILED_CATEGORY)
  private String detailedCategory;

  public static final String SERIALIZED_NAME_OPTIONS = "options";
  @SerializedName(SERIALIZED_NAME_OPTIONS)
  private List<Option> options = null;


  public BasketItem id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * A unique ID associated with the product.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A unique ID associated with the product.")

  public String getId() {
    return id;
  }



  public void setId(String id) {
    this.id = id;
  }


  public BasketItem description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * A name or short description of the product.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "The Art of Computer Programming", value = "A name or short description of the product.")

  public String getDescription() {
    return description;
  }



  public void setDescription(String description) {
    this.description = description;
  }


  public BasketItem subTotal(BigDecimal subTotal) {
    
    this.subTotal = subTotal;
    return this;
  }

   /**
   * Subtotal amount.
   * @return subTotal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "8.0", value = "Subtotal amount.")

  public BigDecimal getSubTotal() {
    return subTotal;
  }



  public void setSubTotal(BigDecimal subTotal) {
    this.subTotal = subTotal;
  }


  public BasketItem valueAddedTax(BigDecimal valueAddedTax) {
    
    this.valueAddedTax = valueAddedTax;
    return this;
  }

   /**
   * Value added tax amount.
   * @return valueAddedTax
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "Value added tax amount.")

  public BigDecimal getValueAddedTax() {
    return valueAddedTax;
  }



  public void setValueAddedTax(BigDecimal valueAddedTax) {
    this.valueAddedTax = valueAddedTax;
  }


  public BasketItem localTax(BigDecimal localTax) {
    
    this.localTax = localTax;
    return this;
  }

   /**
   * Local tax amount.
   * @return localTax
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1.0", value = "Local tax amount.")

  public BigDecimal getLocalTax() {
    return localTax;
  }



  public void setLocalTax(BigDecimal localTax) {
    this.localTax = localTax;
  }


  public BasketItem deliveryAmount(BigDecimal deliveryAmount) {
    
    this.deliveryAmount = deliveryAmount;
    return this;
  }

   /**
   * Delivery amount.
   * @return deliveryAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1.0", value = "Delivery amount.")

  public BigDecimal getDeliveryAmount() {
    return deliveryAmount;
  }



  public void setDeliveryAmount(BigDecimal deliveryAmount) {
    this.deliveryAmount = deliveryAmount;
  }


  public BasketItem chargeTotal(BigDecimal chargeTotal) {
    
    this.chargeTotal = chargeTotal;
    return this;
  }

   /**
   * Charge Total amount.
   * @return chargeTotal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1.0", value = "Charge Total amount.")

  public BigDecimal getChargeTotal() {
    return chargeTotal;
  }



  public void setChargeTotal(BigDecimal chargeTotal) {
    this.chargeTotal = chargeTotal;
  }


  public BasketItem currency(String currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * The currency of the original transaction.
   * @return currency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "USD", value = "The currency of the original transaction.")

  public String getCurrency() {
    return currency;
  }



  public void setCurrency(String currency) {
    this.currency = currency;
  }


  public BasketItem quantity(Long quantity) {
    
    this.quantity = quantity;
    return this;
  }

   /**
   * The unit in which the product is sold (e.g. litre, kilogram, etc). Leave empty if the product is sold as a complete unit.
   * @return quantity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unit in which the product is sold (e.g. litre, kilogram, etc). Leave empty if the product is sold as a complete unit.")

  public Long getQuantity() {
    return quantity;
  }



  public void setQuantity(Long quantity) {
    this.quantity = quantity;
  }


  public BasketItem category(String category) {
    
    this.category = category;
    return this;
  }

   /**
   * Category of the product.
   * @return category
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Category of the product.")

  public String getCategory() {
    return category;
  }



  public void setCategory(String category) {
    this.category = category;
  }


  public BasketItem detailedCategory(String detailedCategory) {
    
    this.detailedCategory = detailedCategory;
    return this;
  }

   /**
   * Detailed Category of the product.
   * @return detailedCategory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Detailed Category of the product.")

  public String getDetailedCategory() {
    return detailedCategory;
  }



  public void setDetailedCategory(String detailedCategory) {
    this.detailedCategory = detailedCategory;
  }


  public BasketItem options(List<Option> options) {
    
    this.options = options;
    return this;
  }

  public BasketItem addOptionsItem(Option optionsItem) {
    if (this.options == null) {
      this.options = new ArrayList<>();
    }
    this.options.add(optionsItem);
    return this;
  }

   /**
   * Option details
   * @return options
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Option details")

  public List<Option> getOptions() {
    return options;
  }



  public void setOptions(List<Option> options) {
    this.options = options;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BasketItem basketItem = (BasketItem) o;
    return Objects.equals(this.id, basketItem.id) &&
        Objects.equals(this.description, basketItem.description) &&
        Objects.equals(this.subTotal, basketItem.subTotal) &&
        Objects.equals(this.valueAddedTax, basketItem.valueAddedTax) &&
        Objects.equals(this.localTax, basketItem.localTax) &&
        Objects.equals(this.deliveryAmount, basketItem.deliveryAmount) &&
        Objects.equals(this.chargeTotal, basketItem.chargeTotal) &&
        Objects.equals(this.currency, basketItem.currency) &&
        Objects.equals(this.quantity, basketItem.quantity) &&
        Objects.equals(this.category, basketItem.category) &&
        Objects.equals(this.detailedCategory, basketItem.detailedCategory) &&
        Objects.equals(this.options, basketItem.options);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, description, subTotal, valueAddedTax, localTax, deliveryAmount, chargeTotal, currency, quantity, category, detailedCategory, options);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BasketItem {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    subTotal: ").append(toIndentedString(subTotal)).append("\n");
    sb.append("    valueAddedTax: ").append(toIndentedString(valueAddedTax)).append("\n");
    sb.append("    localTax: ").append(toIndentedString(localTax)).append("\n");
    sb.append("    deliveryAmount: ").append(toIndentedString(deliveryAmount)).append("\n");
    sb.append("    chargeTotal: ").append(toIndentedString(chargeTotal)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    detailedCategory: ").append(toIndentedString(detailedCategory)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
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
