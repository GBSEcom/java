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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Sofort setup.
 */
@ApiModel(description = "Sofort setup.")

public class SofortSetup {
  public static final String SERIALIZED_NAME_CUSTOMER_ID = "customerId";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_ID)
  private String customerId;

  public static final String SERIALIZED_NAME_PROJECT_ID = "projectId";
  @SerializedName(SERIALIZED_NAME_PROJECT_ID)
  private String projectId;

  public static final String SERIALIZED_NAME_API_KEY = "apiKey";
  @SerializedName(SERIALIZED_NAME_API_KEY)
  private String apiKey;


  public SofortSetup customerId(String customerId) {
    
    this.customerId = customerId;
    return this;
  }

   /**
   * Sofort customer identifier.
   * @return customerId
  **/
  @ApiModelProperty(example = "88649", required = true, value = "Sofort customer identifier.")

  public String getCustomerId() {
    return customerId;
  }



  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }


  public SofortSetup projectId(String projectId) {
    
    this.projectId = projectId;
    return this;
  }

   /**
   * Sofort project identifier.
   * @return projectId
  **/
  @ApiModelProperty(example = "183129", required = true, value = "Sofort project identifier.")

  public String getProjectId() {
    return projectId;
  }



  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }


  public SofortSetup apiKey(String apiKey) {
    
    this.apiKey = apiKey;
    return this;
  }

   /**
   * API key provided by Sofort.
   * @return apiKey
  **/
  @ApiModelProperty(example = "9e6c99f4be0d29c0e28bf5c0154ac00a", required = true, value = "API key provided by Sofort.")

  public String getApiKey() {
    return apiKey;
  }



  public void setApiKey(String apiKey) {
    this.apiKey = apiKey;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SofortSetup sofortSetup = (SofortSetup) o;
    return Objects.equals(this.customerId, sofortSetup.customerId) &&
        Objects.equals(this.projectId, sofortSetup.projectId) &&
        Objects.equals(this.apiKey, sofortSetup.apiKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerId, projectId, apiKey);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SofortSetup {\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    apiKey: ").append(toIndentedString(apiKey)).append("\n");
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

