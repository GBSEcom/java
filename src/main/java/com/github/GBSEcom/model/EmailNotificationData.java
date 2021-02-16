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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Object that holds data to configure email notifications.
 */
@ApiModel(description = "Object that holds data to configure email notifications.")

public class EmailNotificationData {
  public static final String SERIALIZED_NAME_ENABLE_NOTIFICATION = "enableNotification";
  @SerializedName(SERIALIZED_NAME_ENABLE_NOTIFICATION)
  private Boolean enableNotification;

  public static final String SERIALIZED_NAME_MERCHANT_NAME = "merchantName";
  @SerializedName(SERIALIZED_NAME_MERCHANT_NAME)
  private String merchantName;

  public static final String SERIALIZED_NAME_RECEIVER_EMAIL = "receiverEmail";
  @SerializedName(SERIALIZED_NAME_RECEIVER_EMAIL)
  private String receiverEmail;

  public static final String SERIALIZED_NAME_SENDER_EMAIL = "senderEmail";
  @SerializedName(SERIALIZED_NAME_SENDER_EMAIL)
  private String senderEmail;

  public static final String SERIALIZED_NAME_LOCALE = "locale";
  @SerializedName(SERIALIZED_NAME_LOCALE)
  private String locale;


  public EmailNotificationData enableNotification(Boolean enableNotification) {
    
    this.enableNotification = enableNotification;
    return this;
  }

   /**
   * Use this to enable/disable email notifications.
   * @return enableNotification
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Use this to enable/disable email notifications.")

  public Boolean getEnableNotification() {
    return enableNotification;
  }



  public void setEnableNotification(Boolean enableNotification) {
    this.enableNotification = enableNotification;
  }


  public EmailNotificationData merchantName(String merchantName) {
    
    this.merchantName = merchantName;
    return this;
  }

   /**
   * The merchant name to be displayed in the email to customer.
   * @return merchantName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "TELECASH 01", value = "The merchant name to be displayed in the email to customer.")

  public String getMerchantName() {
    return merchantName;
  }



  public void setMerchantName(String merchantName) {
    this.merchantName = merchantName;
  }


  public EmailNotificationData receiverEmail(String receiverEmail) {
    
    this.receiverEmail = receiverEmail;
    return this;
  }

   /**
   * The email address(es) for receiving transaction notifications.
   * @return receiverEmail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "info@firstdata.com", value = "The email address(es) for receiving transaction notifications.")

  public String getReceiverEmail() {
    return receiverEmail;
  }



  public void setReceiverEmail(String receiverEmail) {
    this.receiverEmail = receiverEmail;
  }


  public EmailNotificationData senderEmail(String senderEmail) {
    
    this.senderEmail = senderEmail;
    return this;
  }

   /**
   * The email address for sending transaction notifications to customer.
   * @return senderEmail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "do-not-reply@ipg-online.com", value = "The email address for sending transaction notifications to customer.")

  public String getSenderEmail() {
    return senderEmail;
  }



  public void setSenderEmail(String senderEmail) {
    this.senderEmail = senderEmail;
  }


  public EmailNotificationData locale(String locale) {
    
    this.locale = locale;
    return this;
  }

   /**
   * The locale for received notifications.
   * @return locale
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "en_GB", value = "The locale for received notifications.")

  public String getLocale() {
    return locale;
  }



  public void setLocale(String locale) {
    this.locale = locale;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmailNotificationData emailNotificationData = (EmailNotificationData) o;
    return Objects.equals(this.enableNotification, emailNotificationData.enableNotification) &&
        Objects.equals(this.merchantName, emailNotificationData.merchantName) &&
        Objects.equals(this.receiverEmail, emailNotificationData.receiverEmail) &&
        Objects.equals(this.senderEmail, emailNotificationData.senderEmail) &&
        Objects.equals(this.locale, emailNotificationData.locale);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enableNotification, merchantName, receiverEmail, senderEmail, locale);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailNotificationData {\n");
    sb.append("    enableNotification: ").append(toIndentedString(enableNotification)).append("\n");
    sb.append("    merchantName: ").append(toIndentedString(merchantName)).append("\n");
    sb.append("    receiverEmail: ").append(toIndentedString(receiverEmail)).append("\n");
    sb.append("    senderEmail: ").append(toIndentedString(senderEmail)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
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

