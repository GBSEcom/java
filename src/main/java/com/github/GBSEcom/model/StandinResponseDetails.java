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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Contains Standin response details.
 */
@ApiModel(description = "Contains Standin response details.")

public class StandinResponseDetails {
  public static final String SERIALIZED_NAME_SECURE3_D_ENROLMENT_STATUS = "secure3DEnrolmentStatus";
  @SerializedName(SERIALIZED_NAME_SECURE3_D_ENROLMENT_STATUS)
  private String secure3DEnrolmentStatus;

  public static final String SERIALIZED_NAME_SECURE3_D_E_C_I = "secure3DECI";
  @SerializedName(SERIALIZED_NAME_SECURE3_D_E_C_I)
  private String secure3DECI;

  public static final String SERIALIZED_NAME_SECURE3_D_AUTHENTICATION_RESPONSE = "secure3DAuthenticationResponse";
  @SerializedName(SERIALIZED_NAME_SECURE3_D_AUTHENTICATION_RESPONSE)
  private String secure3DAuthenticationResponse;

  public static final String SERIALIZED_NAME_AUTHENTICATION_VALUE = "authenticationValue";
  @SerializedName(SERIALIZED_NAME_AUTHENTICATION_VALUE)
  private String authenticationValue;

  public static final String SERIALIZED_NAME_XID = "xid";
  @SerializedName(SERIALIZED_NAME_XID)
  private String xid;

  public static final String SERIALIZED_NAME_AUTHENTICATION_ALGORITHM = "authenticationAlgorithm";
  @SerializedName(SERIALIZED_NAME_AUTHENTICATION_ALGORITHM)
  private String authenticationAlgorithm;


  public StandinResponseDetails secure3DEnrolmentStatus(String secure3DEnrolmentStatus) {
    
    this.secure3DEnrolmentStatus = secure3DEnrolmentStatus;
    return this;
  }

   /**
   * Secure 3D Enrolment Status.
   * @return secure3DEnrolmentStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Y", value = "Secure 3D Enrolment Status.")

  public String getSecure3DEnrolmentStatus() {
    return secure3DEnrolmentStatus;
  }



  public void setSecure3DEnrolmentStatus(String secure3DEnrolmentStatus) {
    this.secure3DEnrolmentStatus = secure3DEnrolmentStatus;
  }


  public StandinResponseDetails secure3DECI(String secure3DECI) {
    
    this.secure3DECI = secure3DECI;
    return this;
  }

   /**
   * Secure 3D ECI.
   * @return secure3DECI
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "05", value = "Secure 3D ECI.")

  public String getSecure3DECI() {
    return secure3DECI;
  }



  public void setSecure3DECI(String secure3DECI) {
    this.secure3DECI = secure3DECI;
  }


  public StandinResponseDetails secure3DAuthenticationResponse(String secure3DAuthenticationResponse) {
    
    this.secure3DAuthenticationResponse = secure3DAuthenticationResponse;
    return this;
  }

   /**
   * Secure 3D Authentication Response.
   * @return secure3DAuthenticationResponse
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Y", value = "Secure 3D Authentication Response.")

  public String getSecure3DAuthenticationResponse() {
    return secure3DAuthenticationResponse;
  }



  public void setSecure3DAuthenticationResponse(String secure3DAuthenticationResponse) {
    this.secure3DAuthenticationResponse = secure3DAuthenticationResponse;
  }


  public StandinResponseDetails authenticationValue(String authenticationValue) {
    
    this.authenticationValue = authenticationValue;
    return this;
  }

   /**
   * Secure 3D Authentication Value.
   * @return authenticationValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "AAABBgFWUQAAAAEzZ1ZRAAAAAAA=", value = "Secure 3D Authentication Value.")

  public String getAuthenticationValue() {
    return authenticationValue;
  }



  public void setAuthenticationValue(String authenticationValue) {
    this.authenticationValue = authenticationValue;
  }


  public StandinResponseDetails xid(String xid) {
    
    this.xid = xid;
    return this;
  }

   /**
   * Secure 3D XID.
   * @return xid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "cb8QZ9mmkTUqreE89RjjjAtpJpg", value = "Secure 3D XID.")

  public String getXid() {
    return xid;
  }



  public void setXid(String xid) {
    this.xid = xid;
  }


  public StandinResponseDetails authenticationAlgorithm(String authenticationAlgorithm) {
    
    this.authenticationAlgorithm = authenticationAlgorithm;
    return this;
  }

   /**
   * Secure 3D Authentication Algorithm.
   * @return authenticationAlgorithm
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2", value = "Secure 3D Authentication Algorithm.")

  public String getAuthenticationAlgorithm() {
    return authenticationAlgorithm;
  }



  public void setAuthenticationAlgorithm(String authenticationAlgorithm) {
    this.authenticationAlgorithm = authenticationAlgorithm;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StandinResponseDetails standinResponseDetails = (StandinResponseDetails) o;
    return Objects.equals(this.secure3DEnrolmentStatus, standinResponseDetails.secure3DEnrolmentStatus) &&
        Objects.equals(this.secure3DECI, standinResponseDetails.secure3DECI) &&
        Objects.equals(this.secure3DAuthenticationResponse, standinResponseDetails.secure3DAuthenticationResponse) &&
        Objects.equals(this.authenticationValue, standinResponseDetails.authenticationValue) &&
        Objects.equals(this.xid, standinResponseDetails.xid) &&
        Objects.equals(this.authenticationAlgorithm, standinResponseDetails.authenticationAlgorithm);
  }

  @Override
  public int hashCode() {
    return Objects.hash(secure3DEnrolmentStatus, secure3DECI, secure3DAuthenticationResponse, authenticationValue, xid, authenticationAlgorithm);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StandinResponseDetails {\n");
    sb.append("    secure3DEnrolmentStatus: ").append(toIndentedString(secure3DEnrolmentStatus)).append("\n");
    sb.append("    secure3DECI: ").append(toIndentedString(secure3DECI)).append("\n");
    sb.append("    secure3DAuthenticationResponse: ").append(toIndentedString(secure3DAuthenticationResponse)).append("\n");
    sb.append("    authenticationValue: ").append(toIndentedString(authenticationValue)).append("\n");
    sb.append("    xid: ").append(toIndentedString(xid)).append("\n");
    sb.append("    authenticationAlgorithm: ").append(toIndentedString(authenticationAlgorithm)).append("\n");
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

