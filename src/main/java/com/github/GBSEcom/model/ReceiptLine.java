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
 * Represents a line in the receipt response.
 */
@ApiModel(description = "Represents a line in the receipt response.")

public class ReceiptLine {
  public static final String SERIALIZED_NAME_END_OF_LINE = "endOfLine";
  @SerializedName(SERIALIZED_NAME_END_OF_LINE)
  private Boolean endOfLine = true;

  public static final String SERIALIZED_NAME_TEXT = "text";
  @SerializedName(SERIALIZED_NAME_TEXT)
  private String text;


  public ReceiptLine endOfLine(Boolean endOfLine) {
    
    this.endOfLine = endOfLine;
    return this;
  }

   /**
   * Flag to indicate if the text ends at the end of this receipt line.
   * @return endOfLine
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Flag to indicate if the text ends at the end of this receipt line.")

  public Boolean getEndOfLine() {
    return endOfLine;
  }



  public void setEndOfLine(Boolean endOfLine) {
    this.endOfLine = endOfLine;
  }


  public ReceiptLine text(String text) {
    
    this.text = text;
    return this;
  }

   /**
   * Text that represents a line of the actual receipt data, that can be printed out.
   * @return text
  **/
  @ApiModelProperty(example = "          MerchantName          ", required = true, value = "Text that represents a line of the actual receipt data, that can be printed out.")

  public String getText() {
    return text;
  }



  public void setText(String text) {
    this.text = text;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReceiptLine receiptLine = (ReceiptLine) o;
    return Objects.equals(this.endOfLine, receiptLine.endOfLine) &&
        Objects.equals(this.text, receiptLine.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endOfLine, text);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReceiptLine {\n");
    sb.append("    endOfLine: ").append(toIndentedString(endOfLine)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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
