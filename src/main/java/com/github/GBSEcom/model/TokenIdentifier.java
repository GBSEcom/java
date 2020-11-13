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
 * Token identifier object.
 */
@ApiModel(description = "Token identifier object.")

public class TokenIdentifier {
  public static final String SERIALIZED_NAME_TOKEN_IDENTIFIER = "tokenIdentifier";
  @SerializedName(SERIALIZED_NAME_TOKEN_IDENTIFIER)
  private String tokenIdentifier;


  public TokenIdentifier tokenIdentifier(String tokenIdentifier) {
    
    this.tokenIdentifier = tokenIdentifier;
    return this;
  }

   /**
   * Token identifier.
   * @return tokenIdentifier
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "00ef9c73d065da1e01b9439998aca5cd6c73ff178660570c8743ed2e4a700f56", value = "Token identifier.")

  public String getTokenIdentifier() {
    return tokenIdentifier;
  }



  public void setTokenIdentifier(String tokenIdentifier) {
    this.tokenIdentifier = tokenIdentifier;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TokenIdentifier tokenIdentifier = (TokenIdentifier) o;
    return Objects.equals(this.tokenIdentifier, tokenIdentifier.tokenIdentifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tokenIdentifier);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TokenIdentifier {\n");
    sb.append("    tokenIdentifier: ").append(toIndentedString(tokenIdentifier)).append("\n");
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

