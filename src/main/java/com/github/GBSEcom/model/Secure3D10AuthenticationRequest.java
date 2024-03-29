/*
 * Payment Gateway API Specification.
 * The documentation here is designed to provide all of the technical guidance required to consume and integrate with our APIs for payment processing. To learn more about our APIs please visit https://docs.firstdata.com/org/gateway.
 *
 * The version of the OpenAPI document: 21.5.0.20211029.001
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.github.GBSEcom.model;

import java.util.Objects;
import java.util.Arrays;
import com.github.GBSEcom.model.AuthenticationRequest;
import com.github.GBSEcom.model.Secure3D10AuthenticationRequestAllOf;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Request authentication of the payment card using the 3DS 1.0 URL redirect scheme. DEPRECATED - use Secure3DAuthenticationRequest instead
 */
@ApiModel(description = "Request authentication of the payment card using the 3DS 1.0 URL redirect scheme. DEPRECATED - use Secure3DAuthenticationRequest instead")

public class Secure3D10AuthenticationRequest extends AuthenticationRequest {
  public static final String SERIALIZED_NAME_TERM_U_R_L = "termURL";
  @SerializedName(SERIALIZED_NAME_TERM_U_R_L)
  private String termURL;


  public Secure3D10AuthenticationRequest termURL(String termURL) {
    
    this.termURL = termURL;
    return this;
  }

   /**
   * The result of the authentication will be sent to this URL. If not provided, a term URL will be dynamically generated. Note this must be a valid URL (special characters should be URL-encoded).
   * @return termURL
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://www.mywebshop.com/process3dSecure", value = "The result of the authentication will be sent to this URL. If not provided, a term URL will be dynamically generated. Note this must be a valid URL (special characters should be URL-encoded).")

  public String getTermURL() {
    return termURL;
  }



  public void setTermURL(String termURL) {
    this.termURL = termURL;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Secure3D10AuthenticationRequest secure3D10AuthenticationRequest = (Secure3D10AuthenticationRequest) o;
    return Objects.equals(this.termURL, secure3D10AuthenticationRequest.termURL) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(termURL, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Secure3D10AuthenticationRequest {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    termURL: ").append(toIndentedString(termURL)).append("\n");
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

