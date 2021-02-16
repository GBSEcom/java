/*
 * Payment Gateway API Specification.
 * The documentation here is designed to provide all of the technical guidance required to consume and integrate with our APIs for payment processing. To learn more about our APIs please visit https://docs.firstdata.com/org/gateway.
 *
 * The version of the OpenAPI document: 21.1.0.20210122.001
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.github.GBSEcom.model;

import java.util.Objects;
import java.util.Arrays;
import com.github.GBSEcom.model.Background;
import com.github.GBSEcom.model.Button;
import com.github.GBSEcom.model.Logo;
import com.github.GBSEcom.model.Text;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Object contains combined mode branding style properties.
 */
@ApiModel(description = "Object contains combined mode branding style properties.")

public class CombinedMode {
  public static final String SERIALIZED_NAME_LOGO = "logo";
  @SerializedName(SERIALIZED_NAME_LOGO)
  private Logo logo;

  public static final String SERIALIZED_NAME_BACKGROUND = "background";
  @SerializedName(SERIALIZED_NAME_BACKGROUND)
  private Background background;

  public static final String SERIALIZED_NAME_TEXT = "text";
  @SerializedName(SERIALIZED_NAME_TEXT)
  private Text text;

  public static final String SERIALIZED_NAME_BUTTON = "button";
  @SerializedName(SERIALIZED_NAME_BUTTON)
  private Button button;


  public CombinedMode logo(Logo logo) {
    
    this.logo = logo;
    return this;
  }

   /**
   * Get logo
   * @return logo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Logo getLogo() {
    return logo;
  }



  public void setLogo(Logo logo) {
    this.logo = logo;
  }


  public CombinedMode background(Background background) {
    
    this.background = background;
    return this;
  }

   /**
   * Get background
   * @return background
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Background getBackground() {
    return background;
  }



  public void setBackground(Background background) {
    this.background = background;
  }


  public CombinedMode text(Text text) {
    
    this.text = text;
    return this;
  }

   /**
   * Get text
   * @return text
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Text getText() {
    return text;
  }



  public void setText(Text text) {
    this.text = text;
  }


  public CombinedMode button(Button button) {
    
    this.button = button;
    return this;
  }

   /**
   * Get button
   * @return button
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Button getButton() {
    return button;
  }



  public void setButton(Button button) {
    this.button = button;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CombinedMode combinedMode = (CombinedMode) o;
    return Objects.equals(this.logo, combinedMode.logo) &&
        Objects.equals(this.background, combinedMode.background) &&
        Objects.equals(this.text, combinedMode.text) &&
        Objects.equals(this.button, combinedMode.button);
  }

  @Override
  public int hashCode() {
    return Objects.hash(logo, background, text, button);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CombinedMode {\n");
    sb.append("    logo: ").append(toIndentedString(logo)).append("\n");
    sb.append("    background: ").append(toIndentedString(background)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    button: ").append(toIndentedString(button)).append("\n");
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

