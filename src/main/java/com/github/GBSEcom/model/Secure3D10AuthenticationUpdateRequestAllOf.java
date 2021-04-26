/*
 * Payment Gateway API Specification.
 * The documentation here is designed to provide all of the technical guidance required to consume and integrate with our APIs for payment processing. To learn more about our APIs please visit https://docs.firstdata.com/org/gateway.
 *
 * The version of the OpenAPI document: 21.2.0.20210406.001
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
 * Secure3D10AuthenticationUpdateRequestAllOf
 */

public class Secure3D10AuthenticationUpdateRequestAllOf {
  public static final String SERIALIZED_NAME_PAYER_AUTHENTICATION_RESPONSE = "payerAuthenticationResponse";
  @SerializedName(SERIALIZED_NAME_PAYER_AUTHENTICATION_RESPONSE)
  private String payerAuthenticationResponse;

  public static final String SERIALIZED_NAME_MERCHANT_DATA = "merchantData";
  @SerializedName(SERIALIZED_NAME_MERCHANT_DATA)
  private String merchantData;

  public static final String SERIALIZED_NAME_SECURITY_CODE = "securityCode";
  @SerializedName(SERIALIZED_NAME_SECURITY_CODE)
  private String securityCode;


  public Secure3D10AuthenticationUpdateRequestAllOf payerAuthenticationResponse(String payerAuthenticationResponse) {
    
    this.payerAuthenticationResponse = payerAuthenticationResponse;
    return this;
  }

   /**
   * A formatted message providing results of the issuer’s cardholder authentication.
   * @return payerAuthenticationResponse
  **/
  @ApiModelProperty(example = "eJzVWFm....9f/AhjgEcE=", required = true, value = "A formatted message providing results of the issuer’s cardholder authentication.")

  public String getPayerAuthenticationResponse() {
    return payerAuthenticationResponse;
  }



  public void setPayerAuthenticationResponse(String payerAuthenticationResponse) {
    this.payerAuthenticationResponse = payerAuthenticationResponse;
  }


  public Secure3D10AuthenticationUpdateRequestAllOf merchantData(String merchantData) {
    
    this.merchantData = merchantData;
    return this;
  }

   /**
   * Formatted string encoding transaction time, order ID, and return URL data.
   * @return merchantData
  **/
  @ApiModelProperty(example = "MD__________30002019....85bcd02599", required = true, value = "Formatted string encoding transaction time, order ID, and return URL data.")

  public String getMerchantData() {
    return merchantData;
  }



  public void setMerchantData(String merchantData) {
    this.merchantData = merchantData;
  }


  public Secure3D10AuthenticationUpdateRequestAllOf securityCode(String securityCode) {
    
    this.securityCode = securityCode;
    return this;
  }

   /**
   * Card security code if required by merchant.
   * @return securityCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123", value = "Card security code if required by merchant.")

  public String getSecurityCode() {
    return securityCode;
  }



  public void setSecurityCode(String securityCode) {
    this.securityCode = securityCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Secure3D10AuthenticationUpdateRequestAllOf secure3D10AuthenticationUpdateRequestAllOf = (Secure3D10AuthenticationUpdateRequestAllOf) o;
    return Objects.equals(this.payerAuthenticationResponse, secure3D10AuthenticationUpdateRequestAllOf.payerAuthenticationResponse) &&
        Objects.equals(this.merchantData, secure3D10AuthenticationUpdateRequestAllOf.merchantData) &&
        Objects.equals(this.securityCode, secure3D10AuthenticationUpdateRequestAllOf.securityCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payerAuthenticationResponse, merchantData, securityCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Secure3D10AuthenticationUpdateRequestAllOf {\n");
    sb.append("    payerAuthenticationResponse: ").append(toIndentedString(payerAuthenticationResponse)).append("\n");
    sb.append("    merchantData: ").append(toIndentedString(merchantData)).append("\n");
    sb.append("    securityCode: ").append(toIndentedString(securityCode)).append("\n");
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

