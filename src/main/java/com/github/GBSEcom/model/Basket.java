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
import com.github.GBSEcom.model.BasketItem;
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
 * Indicates basket of items.
 */
@ApiModel(description = "Indicates basket of items.")

public class Basket {
  /**
   * Product stock.
   */
  @JsonAdapter(ProductStockEnum.Adapter.class)
  public enum ProductStockEnum {
    CHECK("check");

    private String value;

    ProductStockEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ProductStockEnum fromValue(String value) {
      for (ProductStockEnum b : ProductStockEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ProductStockEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ProductStockEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ProductStockEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ProductStockEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PRODUCT_STOCK = "productStock";
  @SerializedName(SERIALIZED_NAME_PRODUCT_STOCK)
  private ProductStockEnum productStock;

  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<BasketItem> items = null;


  public Basket productStock(ProductStockEnum productStock) {
    
    this.productStock = productStock;
    return this;
  }

   /**
   * Product stock.
   * @return productStock
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "check", value = "Product stock.")

  public ProductStockEnum getProductStock() {
    return productStock;
  }



  public void setProductStock(ProductStockEnum productStock) {
    this.productStock = productStock;
  }


  public Basket items(List<BasketItem> items) {
    
    this.items = items;
    return this;
  }

  public Basket addItemsItem(BasketItem itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * The list of items included in the order.
   * @return items
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The list of items included in the order.")

  public List<BasketItem> getItems() {
    return items;
  }



  public void setItems(List<BasketItem> items) {
    this.items = items;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Basket basket = (Basket) o;
    return Objects.equals(this.productStock, basket.productStock) &&
        Objects.equals(this.items, basket.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productStock, items);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Basket {\n");
    sb.append("    productStock: ").append(toIndentedString(productStock)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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

