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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Access token generation request.
 */
@ApiModel(description = "Access token generation request.")

public class AccessTokenRequest {
  public static final String SERIALIZED_NAME_DOMAIN = "domain";
  @SerializedName(SERIALIZED_NAME_DOMAIN)
  private String domain;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public static final String SERIALIZED_NAME_PUBLIC_KEY_REQUIRED = "publicKeyRequired";
  @SerializedName(SERIALIZED_NAME_PUBLIC_KEY_REQUIRED)
  private Boolean publicKeyRequired;


  public AccessTokenRequest domain(String domain) {
    
    this.domain = domain;
    return this;
  }

   /**
   * Domain name.
   * @return domain
  **/
  @ApiModelProperty(example = "somedomain.com", required = true, value = "Domain name.")

  public String getDomain() {
    return domain;
  }



  public void setDomain(String domain) {
    this.domain = domain;
  }


  public AccessTokenRequest token(String token) {
    
    this.token = token;
    return this;
  }

   /**
   * The token value.
   * @return token
  **/
  @ApiModelProperty(example = "gfgF92JHDJFjxcJHCQ23IbI12D", required = true, value = "The token value.")

  public String getToken() {
    return token;
  }



  public void setToken(String token) {
    this.token = token;
  }


  public AccessTokenRequest publicKeyRequired(Boolean publicKeyRequired) {
    
    this.publicKeyRequired = publicKeyRequired;
    return this;
  }

   /**
   * Indicates whether public key is requested or not.
   * @return publicKeyRequired
  **/
  @ApiModelProperty(example = "true", required = true, value = "Indicates whether public key is requested or not.")

  public Boolean getPublicKeyRequired() {
    return publicKeyRequired;
  }



  public void setPublicKeyRequired(Boolean publicKeyRequired) {
    this.publicKeyRequired = publicKeyRequired;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccessTokenRequest accessTokenRequest = (AccessTokenRequest) o;
    return Objects.equals(this.domain, accessTokenRequest.domain) &&
        Objects.equals(this.token, accessTokenRequest.token) &&
        Objects.equals(this.publicKeyRequired, accessTokenRequest.publicKeyRequired);
  }

  @Override
  public int hashCode() {
    return Objects.hash(domain, token, publicKeyRequired);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccessTokenRequest {\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    publicKeyRequired: ").append(toIndentedString(publicKeyRequired)).append("\n");
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

