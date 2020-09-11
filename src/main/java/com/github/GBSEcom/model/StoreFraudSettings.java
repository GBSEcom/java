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
import com.github.GBSEcom.model.FraudSettings;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Object for fraud settings.
 */
@ApiModel(description = "Object for fraud settings.")

public class StoreFraudSettings {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_FRAUD_SETTINGS = "fraudSettings";
  @SerializedName(SERIALIZED_NAME_FRAUD_SETTINGS)
  private FraudSettings fraudSettings;


  public StoreFraudSettings id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The outlet identificator.
   * @return id
  **/
  @ApiModelProperty(example = "12345500000", required = true, value = "The outlet identificator.")

  public String getId() {
    return id;
  }



  public void setId(String id) {
    this.id = id;
  }


  public StoreFraudSettings fraudSettings(FraudSettings fraudSettings) {
    
    this.fraudSettings = fraudSettings;
    return this;
  }

   /**
   * Get fraudSettings
   * @return fraudSettings
  **/
  @ApiModelProperty(required = true, value = "")

  public FraudSettings getFraudSettings() {
    return fraudSettings;
  }



  public void setFraudSettings(FraudSettings fraudSettings) {
    this.fraudSettings = fraudSettings;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StoreFraudSettings storeFraudSettings = (StoreFraudSettings) o;
    return Objects.equals(this.id, storeFraudSettings.id) &&
        Objects.equals(this.fraudSettings, storeFraudSettings.fraudSettings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, fraudSettings);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StoreFraudSettings {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    fraudSettings: ").append(toIndentedString(fraudSettings)).append("\n");
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

