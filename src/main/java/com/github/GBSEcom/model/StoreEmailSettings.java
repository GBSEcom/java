/*
 * Payment Gateway API Specification.
 * The documentation here is designed to provide all of the technical guidance required to consume and integrate with our APIs for payment processing. To learn more about our APIs please visit https://docs.firstdata.com/org/gateway.
 *
 * The version of the OpenAPI document: 21.1.0.20210122.001
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.github.GBSEcom.model;

import java.util.Objects;
import java.util.Arrays;
import com.github.GBSEcom.model.EmailNotificationData;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Object for email settings.
 */
@ApiModel(description = "Object for email settings.")

public class StoreEmailSettings {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_EMAIL_NOTIFICATION_DATA = "emailNotificationData";
  @SerializedName(SERIALIZED_NAME_EMAIL_NOTIFICATION_DATA)
  private EmailNotificationData emailNotificationData;


  public StoreEmailSettings id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * An outlet identificator.
   * @return id
  **/
  @ApiModelProperty(example = "12345500000", required = true, value = "An outlet identificator.")

  public String getId() {
    return id;
  }



  public void setId(String id) {
    this.id = id;
  }


  public StoreEmailSettings emailNotificationData(EmailNotificationData emailNotificationData) {
    
    this.emailNotificationData = emailNotificationData;
    return this;
  }

   /**
   * Get emailNotificationData
   * @return emailNotificationData
  **/
  @ApiModelProperty(required = true, value = "")

  public EmailNotificationData getEmailNotificationData() {
    return emailNotificationData;
  }



  public void setEmailNotificationData(EmailNotificationData emailNotificationData) {
    this.emailNotificationData = emailNotificationData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StoreEmailSettings storeEmailSettings = (StoreEmailSettings) o;
    return Objects.equals(this.id, storeEmailSettings.id) &&
        Objects.equals(this.emailNotificationData, storeEmailSettings.emailNotificationData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, emailNotificationData);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StoreEmailSettings {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    emailNotificationData: ").append(toIndentedString(emailNotificationData)).append("\n");
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

