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
 * UnionPayAuthenticationRequestAllOf
 */

public class UnionPayAuthenticationRequestAllOf {
  public static final String SERIALIZED_NAME_SMS_PHONE_NUMBER = "smsPhoneNumber";
  @SerializedName(SERIALIZED_NAME_SMS_PHONE_NUMBER)
  private String smsPhoneNumber;


  public UnionPayAuthenticationRequestAllOf smsPhoneNumber(String smsPhoneNumber) {
    
    this.smsPhoneNumber = smsPhoneNumber;
    return this;
  }

   /**
   * Mobile number for SMS verification.
   * @return smsPhoneNumber
  **/
  @ApiModelProperty(example = "86-13012345678", required = true, value = "Mobile number for SMS verification.")

  public String getSmsPhoneNumber() {
    return smsPhoneNumber;
  }



  public void setSmsPhoneNumber(String smsPhoneNumber) {
    this.smsPhoneNumber = smsPhoneNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UnionPayAuthenticationRequestAllOf unionPayAuthenticationRequestAllOf = (UnionPayAuthenticationRequestAllOf) o;
    return Objects.equals(this.smsPhoneNumber, unionPayAuthenticationRequestAllOf.smsPhoneNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(smsPhoneNumber);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UnionPayAuthenticationRequestAllOf {\n");
    sb.append("    smsPhoneNumber: ").append(toIndentedString(smsPhoneNumber)).append("\n");
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

