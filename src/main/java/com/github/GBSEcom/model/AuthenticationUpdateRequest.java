/*
 * Payment Gateway API Specification.
 * The documentation here is designed to provide all of the technical guidance required to consume and integrate with our APIs for payment processing. To learn more about our APIs please visit https://docs.firstdata.com/org/gateway.
 *
 * The version of the OpenAPI document: 21.3.0.20210608.001
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.github.GBSEcom.model;

import java.util.Objects;
import java.util.Arrays;
import com.github.GBSEcom.model.Address;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Provides shared fields for all AuthenticationUpdateRequest types. Abstract class, do not use this class directly, use one of its children.
 */
@ApiModel(description = "Provides shared fields for all AuthenticationUpdateRequest types. Abstract class, do not use this class directly, use one of its children.")


public class AuthenticationUpdateRequest {
  public static final String SERIALIZED_NAME_STORE_ID = "storeId";
  @SerializedName(SERIALIZED_NAME_STORE_ID)
  private String storeId;

  public static final String SERIALIZED_NAME_AUTHENTICATION_TYPE = "authenticationType";
  @SerializedName(SERIALIZED_NAME_AUTHENTICATION_TYPE)
  private String authenticationType;

  public static final String SERIALIZED_NAME_BILLING_ADDRESS = "billingAddress";
  @SerializedName(SERIALIZED_NAME_BILLING_ADDRESS)
  private Address billingAddress;

  public AuthenticationUpdateRequest() {
    this.authenticationType = this.getClass().getSimpleName();
  }

  public AuthenticationUpdateRequest storeId(String storeId) {
    
    this.storeId = storeId;
    return this;
  }

   /**
   * An optional Outlet ID for clients that support multiple stores in the same developer app.
   * @return storeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "12345500000", value = "An optional Outlet ID for clients that support multiple stores in the same developer app.")

  public String getStoreId() {
    return storeId;
  }



  public void setStoreId(String storeId) {
    this.storeId = storeId;
  }


  public AuthenticationUpdateRequest authenticationType(String authenticationType) {
    
    this.authenticationType = authenticationType;
    return this;
  }

   /**
   * Object name of the authentication update request.
   * @return authenticationType
  **/
  @ApiModelProperty(example = "Secure3DAuthenticationUpdateRequest", required = true, value = "Object name of the authentication update request.")

  public String getAuthenticationType() {
    return authenticationType;
  }



  public void setAuthenticationType(String authenticationType) {
    this.authenticationType = authenticationType;
  }


  public AuthenticationUpdateRequest billingAddress(Address billingAddress) {
    
    this.billingAddress = billingAddress;
    return this;
  }

   /**
   * Get billingAddress
   * @return billingAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Address getBillingAddress() {
    return billingAddress;
  }



  public void setBillingAddress(Address billingAddress) {
    this.billingAddress = billingAddress;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthenticationUpdateRequest authenticationUpdateRequest = (AuthenticationUpdateRequest) o;
    return Objects.equals(this.storeId, authenticationUpdateRequest.storeId) &&
        Objects.equals(this.authenticationType, authenticationUpdateRequest.authenticationType) &&
        Objects.equals(this.billingAddress, authenticationUpdateRequest.billingAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(storeId, authenticationType, billingAddress);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthenticationUpdateRequest {\n");
    sb.append("    storeId: ").append(toIndentedString(storeId)).append("\n");
    sb.append("    authenticationType: ").append(toIndentedString(authenticationType)).append("\n");
    sb.append("    billingAddress: ").append(toIndentedString(billingAddress)).append("\n");
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

