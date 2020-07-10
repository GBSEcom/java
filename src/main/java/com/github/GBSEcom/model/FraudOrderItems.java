/*
 * Payment Gateway API Specification.
 * The documentation here is designed to provide all of the technical guidance required to consume and integrate with our APIs for payment processing. To learn more about our APIs please visit https://docs.firstdata.com/org/gateway.
 *
 * The version of the OpenAPI document: 6.12.0.20200706.001
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
import java.util.ArrayList;
import java.util.List;

/**
 * Product details.
 */
@ApiModel(description = "Product details.")

public class FraudOrderItems {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_QUANTITY = "quantity";
  @SerializedName(SERIALIZED_NAME_QUANTITY)
  private String quantity;

  public static final String SERIALIZED_NAME_UNIT = "unit";
  @SerializedName(SERIALIZED_NAME_UNIT)
  private String unit;

  public static final String SERIALIZED_NAME_UNIT_PRICE = "unitPrice";
  @SerializedName(SERIALIZED_NAME_UNIT_PRICE)
  private String unitPrice;

  public static final String SERIALIZED_NAME_CATEGORIES = "categories";
  @SerializedName(SERIALIZED_NAME_CATEGORIES)
  private List<List<String>> categories = null;

  public static final String SERIALIZED_NAME_DETAILS_URL = "detailsUrl";
  @SerializedName(SERIALIZED_NAME_DETAILS_URL)
  private String detailsUrl;

  public static final String SERIALIZED_NAME_USER_DEFINED = "userDefined";
  @SerializedName(SERIALIZED_NAME_USER_DEFINED)
  private Object userDefined;


  public FraudOrderItems id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * A unique ID associated with the product. Must be unique within the merchant&#39;s system.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "PRODCODE1", value = "A unique ID associated with the product. Must be unique within the merchant's system.")

  public String getId() {
    return id;
  }



  public void setId(String id) {
    this.id = id;
  }


  public FraudOrderItems name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * A name or short description of the product.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "The Art of Computer Programming", value = "A name or short description of the product.")

  public String getName() {
    return name;
  }



  public void setName(String name) {
    this.name = name;
  }


  public FraudOrderItems quantity(String quantity) {
    
    this.quantity = quantity;
    return this;
  }

   /**
   * The unit in which the product is sold (e.g. litre, kilogram, etc). Leave empty if the product is sold as a complete unit.
   * @return quantity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "litre", value = "The unit in which the product is sold (e.g. litre, kilogram, etc). Leave empty if the product is sold as a complete unit.")

  public String getQuantity() {
    return quantity;
  }



  public void setQuantity(String quantity) {
    this.quantity = quantity;
  }


  public FraudOrderItems unit(String unit) {
    
    this.unit = unit;
    return this;
  }

   /**
   * The number of units sold. Set to 1 if there is only one unit of the item. Leave empty if the quantity is unknown at the time of the request.
   * @return unit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "carret", value = "The number of units sold. Set to 1 if there is only one unit of the item. Leave empty if the quantity is unknown at the time of the request.")

  public String getUnit() {
    return unit;
  }



  public void setUnit(String unit) {
    this.unit = unit;
  }


  public FraudOrderItems unitPrice(String unitPrice) {
    
    this.unitPrice = unitPrice;
    return this;
  }

   /**
   * The price per unit.
   * @return unitPrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"value\": 7300, \"currency\": \"USD\"}", value = "The price per unit.")

  public String getUnitPrice() {
    return unitPrice;
  }



  public void setUnitPrice(String unitPrice) {
    this.unitPrice = unitPrice;
  }


  public FraudOrderItems categories(List<List<String>> categories) {
    
    this.categories = categories;
    return this;
  }

  public FraudOrderItems addCategoriesItem(List<String> categoriesItem) {
    if (this.categories == null) {
      this.categories = new ArrayList<>();
    }
    this.categories.add(categoriesItem);
    return this;
  }

   /**
   * The categories that this product belongs to.
   * @return categories
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"Books, Computers & Technology, Programming\",\"Books, Text Books, Computer Science\"]", value = "The categories that this product belongs to.")

  public List<List<String>> getCategories() {
    return categories;
  }



  public void setCategories(List<List<String>> categories) {
    this.categories = categories;
  }


  public FraudOrderItems detailsUrl(String detailsUrl) {
    
    this.detailsUrl = detailsUrl;
    return this;
  }

   /**
   * The URL to the merchant&#39;s management system, for reporting and analysis.
   * @return detailsUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://mystore.domain/product/PRODCODE1", value = "The URL to the merchant's management system, for reporting and analysis.")

  public String getDetailsUrl() {
    return detailsUrl;
  }



  public void setDetailsUrl(String detailsUrl) {
    this.detailsUrl = detailsUrl;
  }


  public FraudOrderItems userDefined(Object userDefined) {
    
    this.userDefined = userDefined;
    return this;
  }

   /**
   * A JSON object that can carry any additional information about the order that might be helpful for fraud detection.
   * @return userDefined
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"weight\":5021.23,\"vat\":0.06}", value = "A JSON object that can carry any additional information about the order that might be helpful for fraud detection.")

  public Object getUserDefined() {
    return userDefined;
  }



  public void setUserDefined(Object userDefined) {
    this.userDefined = userDefined;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FraudOrderItems fraudOrderItems = (FraudOrderItems) o;
    return Objects.equals(this.id, fraudOrderItems.id) &&
        Objects.equals(this.name, fraudOrderItems.name) &&
        Objects.equals(this.quantity, fraudOrderItems.quantity) &&
        Objects.equals(this.unit, fraudOrderItems.unit) &&
        Objects.equals(this.unitPrice, fraudOrderItems.unitPrice) &&
        Objects.equals(this.categories, fraudOrderItems.categories) &&
        Objects.equals(this.detailsUrl, fraudOrderItems.detailsUrl) &&
        Objects.equals(this.userDefined, fraudOrderItems.userDefined);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, quantity, unit, unitPrice, categories, detailsUrl, userDefined);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FraudOrderItems {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
    sb.append("    unitPrice: ").append(toIndentedString(unitPrice)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    detailsUrl: ").append(toIndentedString(detailsUrl)).append("\n");
    sb.append("    userDefined: ").append(toIndentedString(userDefined)).append("\n");
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

