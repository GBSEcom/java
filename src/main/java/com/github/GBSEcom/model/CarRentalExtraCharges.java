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
 * CarRentalExtraCharges
 */

public class CarRentalExtraCharges {
  /**
   * Additional charge item.
   */
  @JsonAdapter(ChargeItemEnum.Adapter.class)
  public enum ChargeItemEnum {
    EXTRA_MILEAGE("EXTRA_MILEAGE"),
    
    GAS("GAS"),
    
    LATE_RETURN("LATE_RETURN"),
    
    ONE_WAY_SERVICE_FEE("ONE_WAY_SERVICE_FEE"),
    
    PARKING_VIOLATION("PARKING_VIOLATION");

    private String value;

    ChargeItemEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ChargeItemEnum fromValue(String value) {
      for (ChargeItemEnum b : ChargeItemEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ChargeItemEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ChargeItemEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ChargeItemEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ChargeItemEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CHARGE_ITEM = "chargeItem";
  @SerializedName(SERIALIZED_NAME_CHARGE_ITEM)
  private ChargeItemEnum chargeItem;


  public CarRentalExtraCharges chargeItem(ChargeItemEnum chargeItem) {
    
    this.chargeItem = chargeItem;
    return this;
  }

   /**
   * Additional charge item.
   * @return chargeItem
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "GAS", value = "Additional charge item.")

  public ChargeItemEnum getChargeItem() {
    return chargeItem;
  }



  public void setChargeItem(ChargeItemEnum chargeItem) {
    this.chargeItem = chargeItem;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CarRentalExtraCharges carRentalExtraCharges = (CarRentalExtraCharges) o;
    return Objects.equals(this.chargeItem, carRentalExtraCharges.chargeItem);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chargeItem);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CarRentalExtraCharges {\n");
    sb.append("    chargeItem: ").append(toIndentedString(chargeItem)).append("\n");
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

