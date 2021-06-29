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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Customer contact information.
 */
@ApiModel(description = "Customer contact information.")

public class Contact {
  public static final String SERIALIZED_NAME_PHONE = "phone";
  @SerializedName(SERIALIZED_NAME_PHONE)
  private String phone;

  public static final String SERIALIZED_NAME_MOBILE_PHONE = "mobilePhone";
  @SerializedName(SERIALIZED_NAME_MOBILE_PHONE)
  private String mobilePhone;

  public static final String SERIALIZED_NAME_FAX = "fax";
  @SerializedName(SERIALIZED_NAME_FAX)
  private String fax;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;


  public Contact phone(String phone) {
    
    this.phone = phone;
    return this;
  }

   /**
   * Primary phone number.
   * @return phone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "5555555555", value = "Primary phone number.")

  public String getPhone() {
    return phone;
  }



  public void setPhone(String phone) {
    this.phone = phone;
  }


  public Contact mobilePhone(String mobilePhone) {
    
    this.mobilePhone = mobilePhone;
    return this;
  }

   /**
   * Mobile phone number.
   * @return mobilePhone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "5555555555", value = "Mobile phone number.")

  public String getMobilePhone() {
    return mobilePhone;
  }



  public void setMobilePhone(String mobilePhone) {
    this.mobilePhone = mobilePhone;
  }


  public Contact fax(String fax) {
    
    this.fax = fax;
    return this;
  }

   /**
   * Fax number.
   * @return fax
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "5555555555", value = "Fax number.")

  public String getFax() {
    return fax;
  }



  public void setFax(String fax) {
    this.fax = fax;
  }


  public Contact email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * Email address.
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "john@test.com", value = "Email address.")

  public String getEmail() {
    return email;
  }



  public void setEmail(String email) {
    this.email = email;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Contact contact = (Contact) o;
    return Objects.equals(this.phone, contact.phone) &&
        Objects.equals(this.mobilePhone, contact.mobilePhone) &&
        Objects.equals(this.fax, contact.fax) &&
        Objects.equals(this.email, contact.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(phone, mobilePhone, fax, email);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Contact {\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    mobilePhone: ").append(toIndentedString(mobilePhone)).append("\n");
    sb.append("    fax: ").append(toIndentedString(fax)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
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

