/*
 * Payment Gateway API Specification.
 * The documentation here is designed to provide all of the technical guidance required to consume and integrate with our APIs for payment processing. To learn more about our APIs please visit https://docs.firstdata.com/org/gateway.
 *
 * The version of the OpenAPI document: 6.14.0.20201015.001
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.github.GBSEcom.model;

import java.util.Objects;
import java.util.Arrays;
import com.github.GBSEcom.model.Content;
import com.github.GBSEcom.model.Footer;
import com.github.GBSEcom.model.Header;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Object contains background color properties.
 */
@ApiModel(description = "Object contains background color properties.")

public class BackgroundColor {
  public static final String SERIALIZED_NAME_HEADER = "header";
  @SerializedName(SERIALIZED_NAME_HEADER)
  private Header header;

  public static final String SERIALIZED_NAME_CONTENT = "content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  private Content content;

  public static final String SERIALIZED_NAME_FOOTER = "footer";
  @SerializedName(SERIALIZED_NAME_FOOTER)
  private Footer footer;


  public BackgroundColor header(Header header) {
    
    this.header = header;
    return this;
  }

   /**
   * Get header
   * @return header
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Header getHeader() {
    return header;
  }



  public void setHeader(Header header) {
    this.header = header;
  }


  public BackgroundColor content(Content content) {
    
    this.content = content;
    return this;
  }

   /**
   * Get content
   * @return content
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Content getContent() {
    return content;
  }



  public void setContent(Content content) {
    this.content = content;
  }


  public BackgroundColor footer(Footer footer) {
    
    this.footer = footer;
    return this;
  }

   /**
   * Get footer
   * @return footer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Footer getFooter() {
    return footer;
  }



  public void setFooter(Footer footer) {
    this.footer = footer;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BackgroundColor backgroundColor = (BackgroundColor) o;
    return Objects.equals(this.header, backgroundColor.header) &&
        Objects.equals(this.content, backgroundColor.content) &&
        Objects.equals(this.footer, backgroundColor.footer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(header, content, footer);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BackgroundColor {\n");
    sb.append("    header: ").append(toIndentedString(header)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    footer: ").append(toIndentedString(footer)).append("\n");
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

