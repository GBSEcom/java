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
import com.github.GBSEcom.model.Body;
import com.github.GBSEcom.model.Borders;
import com.github.GBSEcom.model.Content;
import com.github.GBSEcom.model.TopBar;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Object contains background style properties.
 */
@ApiModel(description = "Object contains background style properties.")

public class Background {
  public static final String SERIALIZED_NAME_TOP_BAR = "topBar";
  @SerializedName(SERIALIZED_NAME_TOP_BAR)
  private TopBar topBar;

  public static final String SERIALIZED_NAME_BODY = "body";
  @SerializedName(SERIALIZED_NAME_BODY)
  private Body body;

  public static final String SERIALIZED_NAME_CONTENT = "content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  private Content content;

  public static final String SERIALIZED_NAME_BORDERS = "borders";
  @SerializedName(SERIALIZED_NAME_BORDERS)
  private Borders borders;


  public Background topBar(TopBar topBar) {
    
    this.topBar = topBar;
    return this;
  }

   /**
   * Get topBar
   * @return topBar
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TopBar getTopBar() {
    return topBar;
  }



  public void setTopBar(TopBar topBar) {
    this.topBar = topBar;
  }


  public Background body(Body body) {
    
    this.body = body;
    return this;
  }

   /**
   * Get body
   * @return body
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Body getBody() {
    return body;
  }



  public void setBody(Body body) {
    this.body = body;
  }


  public Background content(Content content) {
    
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


  public Background borders(Borders borders) {
    
    this.borders = borders;
    return this;
  }

   /**
   * Get borders
   * @return borders
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Borders getBorders() {
    return borders;
  }



  public void setBorders(Borders borders) {
    this.borders = borders;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Background background = (Background) o;
    return Objects.equals(this.topBar, background.topBar) &&
        Objects.equals(this.body, background.body) &&
        Objects.equals(this.content, background.content) &&
        Objects.equals(this.borders, background.borders);
  }

  @Override
  public int hashCode() {
    return Objects.hash(topBar, body, content, borders);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Background {\n");
    sb.append("    topBar: ").append(toIndentedString(topBar)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    borders: ").append(toIndentedString(borders)).append("\n");
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

