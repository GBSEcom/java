/*
 * Payment Gateway API Specification.
 * The documentation here is designed to provide all of the technical guidance required to consume and integrate with our APIs for payment processing. To learn more about our APIs please visit https://docs.firstdata.com/org/gateway.
 *
 * The version of the OpenAPI document: 6.8.0.20190731.002
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
 * Identification information.
 */
@ApiModel(description = "Identification information.")

public class IdInfo {
  public static final String SERIALIZED_NAME_ID_TYPE = "idType";
  @SerializedName(SERIALIZED_NAME_ID_TYPE)
  private String idType;

  public static final String SERIALIZED_NAME_ID_DATA = "idData";
  @SerializedName(SERIALIZED_NAME_ID_DATA)
  private String idData;


  public IdInfo idType(String idType) {
    
    this.idType = idType;
    return this;
  }

   /**
   * Identification type.
   * @return idType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "DL", value = "Identification type.")

  public String getIdType() {
    return idType;
  }



  public void setIdType(String idType) {
    this.idType = idType;
  }


  public IdInfo idData(String idData) {
    
    this.idData = idData;
    return this;
  }

   /**
   * Identification data.
   * @return idData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "12345678", value = "Identification data.")

  public String getIdData() {
    return idData;
  }



  public void setIdData(String idData) {
    this.idData = idData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdInfo idInfo = (IdInfo) o;
    return Objects.equals(this.idType, idInfo.idType) &&
        Objects.equals(this.idData, idInfo.idData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idType, idData);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdInfo {\n");
    sb.append("    idType: ").append(toIndentedString(idType)).append("\n");
    sb.append("    idData: ").append(toIndentedString(idData)).append("\n");
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

