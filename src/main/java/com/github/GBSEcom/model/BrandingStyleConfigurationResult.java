/*
 * Payment Gateway API Specification.
 * The documentation here is designed to provide all of the technical guidance required to consume and integrate with our APIs for payment processing. To learn more about our APIs please visit https://docs.firstdata.com/org/gateway.
 *
 * The version of the OpenAPI document: 6.13.0.20200810.001
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
 * BrandingStyleConfigurationResult
 */

public class BrandingStyleConfigurationResult {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;


  public BrandingStyleConfigurationResult id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * An optional outlet id for clients that support multiple stores in the same developer app.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "12345500000", value = "An optional outlet id for clients that support multiple stores in the same developer app.")

  public String getId() {
    return id;
  }



  public void setId(String id) {
    this.id = id;
  }


  public BrandingStyleConfigurationResult status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * Status from branding style configuration process.
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SUCCESS. Style properties were changed successfully.", value = "Status from branding style configuration process.")

  public String getStatus() {
    return status;
  }



  public void setStatus(String status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandingStyleConfigurationResult brandingStyleConfigurationResult = (BrandingStyleConfigurationResult) o;
    return Objects.equals(this.id, brandingStyleConfigurationResult.id) &&
        Objects.equals(this.status, brandingStyleConfigurationResult.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandingStyleConfigurationResult {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

