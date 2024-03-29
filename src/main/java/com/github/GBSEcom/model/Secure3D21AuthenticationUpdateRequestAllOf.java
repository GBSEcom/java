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
import com.github.GBSEcom.model.ACSResponse;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Secure3D21AuthenticationUpdateRequestAllOf
 */

public class Secure3D21AuthenticationUpdateRequestAllOf {
  /**
   * Indicates how the merchant received the 3DS method.
   */
  @JsonAdapter(MethodNotificationStatusEnum.Adapter.class)
  public enum MethodNotificationStatusEnum {
    RECEIVED("RECEIVED"),
    
    EXPECTED_BUT_NOT_RECEIVED("EXPECTED_BUT_NOT_RECEIVED"),
    
    NOT_EXPECTED("NOT_EXPECTED");

    private String value;

    MethodNotificationStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MethodNotificationStatusEnum fromValue(String value) {
      for (MethodNotificationStatusEnum b : MethodNotificationStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<MethodNotificationStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MethodNotificationStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MethodNotificationStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return MethodNotificationStatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_METHOD_NOTIFICATION_STATUS = "methodNotificationStatus";
  @SerializedName(SERIALIZED_NAME_METHOD_NOTIFICATION_STATUS)
  private MethodNotificationStatusEnum methodNotificationStatus;

  public static final String SERIALIZED_NAME_ACS_RESPONSE = "acsResponse";
  @SerializedName(SERIALIZED_NAME_ACS_RESPONSE)
  private ACSResponse acsResponse;


  public Secure3D21AuthenticationUpdateRequestAllOf methodNotificationStatus(MethodNotificationStatusEnum methodNotificationStatus) {
    
    this.methodNotificationStatus = methodNotificationStatus;
    return this;
  }

   /**
   * Indicates how the merchant received the 3DS method.
   * @return methodNotificationStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "RECEIVED", value = "Indicates how the merchant received the 3DS method.")

  public MethodNotificationStatusEnum getMethodNotificationStatus() {
    return methodNotificationStatus;
  }



  public void setMethodNotificationStatus(MethodNotificationStatusEnum methodNotificationStatus) {
    this.methodNotificationStatus = methodNotificationStatus;
  }


  public Secure3D21AuthenticationUpdateRequestAllOf acsResponse(ACSResponse acsResponse) {
    
    this.acsResponse = acsResponse;
    return this;
  }

   /**
   * Get acsResponse
   * @return acsResponse
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ACSResponse getAcsResponse() {
    return acsResponse;
  }



  public void setAcsResponse(ACSResponse acsResponse) {
    this.acsResponse = acsResponse;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Secure3D21AuthenticationUpdateRequestAllOf secure3D21AuthenticationUpdateRequestAllOf = (Secure3D21AuthenticationUpdateRequestAllOf) o;
    return Objects.equals(this.methodNotificationStatus, secure3D21AuthenticationUpdateRequestAllOf.methodNotificationStatus) &&
        Objects.equals(this.acsResponse, secure3D21AuthenticationUpdateRequestAllOf.acsResponse);
  }

  @Override
  public int hashCode() {
    return Objects.hash(methodNotificationStatus, acsResponse);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Secure3D21AuthenticationUpdateRequestAllOf {\n");
    sb.append("    methodNotificationStatus: ").append(toIndentedString(methodNotificationStatus)).append("\n");
    sb.append("    acsResponse: ").append(toIndentedString(acsResponse)).append("\n");
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

