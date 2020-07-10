/*
 * Payment Gateway API Specification.
 * The documentation here is designed to provide all of the technical guidance required to consume and integrate with our APIs for payment processing. To learn more about our APIs please visit https://docs.firstdata.com/org/gateway.
 *
 * The version of the OpenAPI document: 6.12.0.20200605.001
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.github.GBSEcom.model;

import java.util.Objects;
import java.util.Arrays;
import com.github.GBSEcom.model.ChinaDomestic;
import com.github.GBSEcom.model.ChinaDomesticPaymentMethodAllOf;
import com.github.GBSEcom.model.PaymentMethod;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Payment method containing China Domestic information.
 */
@ApiModel(description = "Payment method containing China Domestic information.")

public class ChinaDomesticPaymentMethod {
  public static final String SERIALIZED_NAME_CHINA_DOMESTIC = "chinaDomestic";
  @SerializedName(SERIALIZED_NAME_CHINA_DOMESTIC)
  private ChinaDomestic chinaDomestic;

  /**
   * Gets or Sets brand
   */
  @JsonAdapter(BrandEnum.Adapter.class)
  public enum BrandEnum {
    ALIPAY_DOMESTIC("ALIPAY_DOMESTIC"),
    
    CUP_DOMESTIC("CUP_DOMESTIC"),
    
    WECHAT_DOMESTIC("WECHAT_DOMESTIC");

    private String value;

    BrandEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static BrandEnum fromValue(String value) {
      for (BrandEnum b : BrandEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<BrandEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final BrandEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public BrandEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return BrandEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_BRAND = "brand";
  @SerializedName(SERIALIZED_NAME_BRAND)
  private BrandEnum brand;


  public ChinaDomesticPaymentMethod chinaDomestic(ChinaDomestic chinaDomestic) {
    
    this.chinaDomestic = chinaDomestic;
    return this;
  }

   /**
   * Get chinaDomestic
   * @return chinaDomestic
  **/
  @ApiModelProperty(required = true, value = "")

  public ChinaDomestic getChinaDomestic() {
    return chinaDomestic;
  }



  public void setChinaDomestic(ChinaDomestic chinaDomestic) {
    this.chinaDomestic = chinaDomestic;
  }


  public ChinaDomesticPaymentMethod brand(BrandEnum brand) {
    
    this.brand = brand;
    return this;
  }

   /**
   * Get brand
   * @return brand
  **/
  @ApiModelProperty(required = true, value = "")

  public BrandEnum getBrand() {
    return brand;
  }



  public void setBrand(BrandEnum brand) {
    this.brand = brand;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChinaDomesticPaymentMethod chinaDomesticPaymentMethod = (ChinaDomesticPaymentMethod) o;
    return Objects.equals(this.chinaDomestic, chinaDomesticPaymentMethod.chinaDomestic) &&
        Objects.equals(this.brand, chinaDomesticPaymentMethod.brand);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chinaDomestic, brand);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChinaDomesticPaymentMethod {\n");
    sb.append("    chinaDomestic: ").append(toIndentedString(chinaDomestic)).append("\n");
    sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
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

