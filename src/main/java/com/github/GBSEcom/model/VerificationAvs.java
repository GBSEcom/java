/*
 * Payment Gateway API Specification.
 * The documentation here is designed to provide all of the technical guidance required to consume and integrate with our APIs for payment processing. To learn more about our APIs please visit https://docs.firstdata.com/org/gateway.
 *
 * The version of the OpenAPI document: 21.4.0.20210824.002
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
 * The result of the AVS (Address Verification System) check.
 */
@ApiModel(description = "The result of the AVS (Address Verification System) check.")

public class VerificationAvs {
  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_SCHEME = "scheme";
  @SerializedName(SERIALIZED_NAME_SCHEME)
  private String scheme;


  public VerificationAvs code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * AVS response code.
   * @return code
  **/
  @ApiModelProperty(example = "+Z", required = true, value = "AVS response code.")

  public String getCode() {
    return code;
  }



  public void setCode(String code) {
    this.code = code;
  }


  public VerificationAvs status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * Interpretation of the response code.
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "zip match", value = "Interpretation of the response code.")

  public String getStatus() {
    return status;
  }



  public void setStatus(String status) {
    this.status = status;
  }


  public VerificationAvs scheme(String scheme) {
    
    this.scheme = scheme;
    return this;
  }

   /**
   * Identifier of the scheme.
   * @return scheme
  **/
  @ApiModelProperty(example = "amex", required = true, value = "Identifier of the scheme.")

  public String getScheme() {
    return scheme;
  }



  public void setScheme(String scheme) {
    this.scheme = scheme;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VerificationAvs verificationAvs = (VerificationAvs) o;
    return Objects.equals(this.code, verificationAvs.code) &&
        Objects.equals(this.status, verificationAvs.status) &&
        Objects.equals(this.scheme, verificationAvs.scheme);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, status, scheme);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VerificationAvs {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    scheme: ").append(toIndentedString(scheme)).append("\n");
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

