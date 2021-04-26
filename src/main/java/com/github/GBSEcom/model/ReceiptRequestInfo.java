/*
 * Payment Gateway API Specification.
 * The documentation here is designed to provide all of the technical guidance required to consume and integrate with our APIs for payment processing. To learn more about our APIs please visit https://docs.firstdata.com/org/gateway.
 *
 * The version of the OpenAPI document: 21.2.0.20210406.001
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
 * Defines receipt related parameters that are necessary to generate a receipt.
 */
@ApiModel(description = "Defines receipt related parameters that are necessary to generate a receipt.")

public class ReceiptRequestInfo {
  /**
   * Defines the consumer of the receipt (e.g. cardholder, merchant).
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    CARDHOLDER("cardholder"),
    
    MERCHANT("merchant");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public static final String SERIALIZED_NAME_LOCALE = "locale";
  @SerializedName(SERIALIZED_NAME_LOCALE)
  private String locale;

  public static final String SERIALIZED_NAME_LINEWIDTH = "linewidth";
  @SerializedName(SERIALIZED_NAME_LINEWIDTH)
  private Integer linewidth = 32;


  public ReceiptRequestInfo type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * Defines the consumer of the receipt (e.g. cardholder, merchant).
   * @return type
  **/
  @ApiModelProperty(example = "merchant", required = true, value = "Defines the consumer of the receipt (e.g. cardholder, merchant).")

  public TypeEnum getType() {
    return type;
  }



  public void setType(TypeEnum type) {
    this.type = type;
  }


  public ReceiptRequestInfo locale(String locale) {
    
    this.locale = locale;
    return this;
  }

   /**
   * The locale of the receipt. The format has to be a well-formed BCP 47 language tag.
   * @return locale
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "en-GB", value = "The locale of the receipt. The format has to be a well-formed BCP 47 language tag.")

  public String getLocale() {
    return locale;
  }



  public void setLocale(String locale) {
    this.locale = locale;
  }


  public ReceiptRequestInfo linewidth(Integer linewidth) {
    
    this.linewidth = linewidth;
    return this;
  }

   /**
   * The line width of the receipt. Default will be 32 characters.
   * @return linewidth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "48", value = "The line width of the receipt. Default will be 32 characters.")

  public Integer getLinewidth() {
    return linewidth;
  }



  public void setLinewidth(Integer linewidth) {
    this.linewidth = linewidth;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReceiptRequestInfo receiptRequestInfo = (ReceiptRequestInfo) o;
    return Objects.equals(this.type, receiptRequestInfo.type) &&
        Objects.equals(this.locale, receiptRequestInfo.locale) &&
        Objects.equals(this.linewidth, receiptRequestInfo.linewidth);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, locale, linewidth);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReceiptRequestInfo {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    linewidth: ").append(toIndentedString(linewidth)).append("\n");
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

