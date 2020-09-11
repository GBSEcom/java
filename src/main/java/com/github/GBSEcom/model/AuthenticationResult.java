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
 * Submit the result of 3DS authentication managed outside of the gateway. An AuthenticationResult should not be submitted within the same request as an AuthenticationRequest. Abstract class, do not use this class directly, use one of its children.
 */
@ApiModel(description = "Submit the result of 3DS authentication managed outside of the gateway. An AuthenticationResult should not be submitted within the same request as an AuthenticationRequest. Abstract class, do not use this class directly, use one of its children.")


public class AuthenticationResult {
  public static final String SERIALIZED_NAME_AUTHENTICATION_TYPE = "authenticationType";
  @SerializedName(SERIALIZED_NAME_AUTHENTICATION_TYPE)
  private String authenticationType;

  public AuthenticationResult() {
    this.authenticationType = this.getClass().getSimpleName();
  }

  public AuthenticationResult authenticationType(String authenticationType) {
    
    this.authenticationType = authenticationType;
    return this;
  }

   /**
   * Specifies the version of 3DS to be used where authentication was managed outside of the gateway.
   * @return authenticationType
  **/
  @ApiModelProperty(example = "Secure3D10AuthenticationResult", required = true, value = "Specifies the version of 3DS to be used where authentication was managed outside of the gateway.")

  public String getAuthenticationType() {
    return authenticationType;
  }



  public void setAuthenticationType(String authenticationType) {
    this.authenticationType = authenticationType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthenticationResult authenticationResult = (AuthenticationResult) o;
    return Objects.equals(this.authenticationType, authenticationResult.authenticationType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authenticationType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthenticationResult {\n");
    sb.append("    authenticationType: ").append(toIndentedString(authenticationType)).append("\n");
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

