/*
 * Payment Gateway API Specification.
 * The documentation here is designed to provide all of the technical guidance required to consume and integrate with our APIs for payment processing. To learn more about our APIs please visit https://docs.firstdata.com/org/gateway.
 *
 * The version of the OpenAPI document: 6.8.0.20190731.002
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.github.GBSEcom.model;

import java.util.Objects;
import java.util.Arrays;
import com.github.GBSEcom.model.PurchaseCardsLevel3LineItems;
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
 * Level 3 data for monitoring and controlling corporate expenditures.
 */
@ApiModel(description = "Level 3 data for monitoring and controlling corporate expenditures.")

public class PurchaseCardsLevel3 {
  public static final String SERIALIZED_NAME_LINE_ITEMS = "lineItems";
  @SerializedName(SERIALIZED_NAME_LINE_ITEMS)
  private List<PurchaseCardsLevel3LineItems> lineItems = new ArrayList<>();


  public PurchaseCardsLevel3 lineItems(List<PurchaseCardsLevel3LineItems> lineItems) {
    
    this.lineItems = lineItems;
    return this;
  }

  public PurchaseCardsLevel3 addLineItemsItem(PurchaseCardsLevel3LineItems lineItemsItem) {
    this.lineItems.add(lineItemsItem);
    return this;
  }

   /**
   * Line items of monitoring and controlling corporate expenditures data.
   * @return lineItems
  **/
  @ApiModelProperty(required = true, value = "Line items of monitoring and controlling corporate expenditures data.")

  public List<PurchaseCardsLevel3LineItems> getLineItems() {
    return lineItems;
  }



  public void setLineItems(List<PurchaseCardsLevel3LineItems> lineItems) {
    this.lineItems = lineItems;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PurchaseCardsLevel3 purchaseCardsLevel3 = (PurchaseCardsLevel3) o;
    return Objects.equals(this.lineItems, purchaseCardsLevel3.lineItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lineItems);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PurchaseCardsLevel3 {\n");
    sb.append("    lineItems: ").append(toIndentedString(lineItems)).append("\n");
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

