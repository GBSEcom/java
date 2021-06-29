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
 * The group MCC (Merchant Category Code) 6012
 */
@ApiModel(description = "The group MCC (Merchant Category Code) 6012")

public class Mcc6012 {
  public static final String SERIALIZED_NAME_DATE_OF_BIRTH = "dateOfBirth";
  @SerializedName(SERIALIZED_NAME_DATE_OF_BIRTH)
  private String dateOfBirth;

  public static final String SERIALIZED_NAME_ACCOUNT_FIRST6 = "accountFirst6";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_FIRST6)
  private String accountFirst6;

  public static final String SERIALIZED_NAME_ACCOUNT_LAST4 = "accountLast4";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_LAST4)
  private String accountLast4;

  public static final String SERIALIZED_NAME_ACCOUNT_NUM = "accountNum";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_NUM)
  private String accountNum;

  public static final String SERIALIZED_NAME_POST_CODE = "postCode";
  @SerializedName(SERIALIZED_NAME_POST_CODE)
  private String postCode;

  public static final String SERIALIZED_NAME_SURNAME = "surname";
  @SerializedName(SERIALIZED_NAME_SURNAME)
  private String surname;


  public Mcc6012 dateOfBirth(String dateOfBirth) {
    
    this.dateOfBirth = dateOfBirth;
    return this;
  }

   /**
   * The date of birth of the cardholder (YYYYMMDD).
   * @return dateOfBirth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20200505", value = "The date of birth of the cardholder (YYYYMMDD).")

  public String getDateOfBirth() {
    return dateOfBirth;
  }



  public void setDateOfBirth(String dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }


  public Mcc6012 accountFirst6(String accountFirst6) {
    
    this.accountFirst6 = accountFirst6;
    return this;
  }

   /**
   * The first six digits of the primary account number.
   * @return accountFirst6
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "411111", value = "The first six digits of the primary account number.")

  public String getAccountFirst6() {
    return accountFirst6;
  }



  public void setAccountFirst6(String accountFirst6) {
    this.accountFirst6 = accountFirst6;
  }


  public Mcc6012 accountLast4(String accountLast4) {
    
    this.accountLast4 = accountLast4;
    return this;
  }

   /**
   * The last four digits of the primary account number.
   * @return accountLast4
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2343", value = "The last four digits of the primary account number.")

  public String getAccountLast4() {
    return accountLast4;
  }



  public void setAccountLast4(String accountLast4) {
    this.accountLast4 = accountLast4;
  }


  public Mcc6012 accountNum(String accountNum) {
    
    this.accountNum = accountNum;
    return this;
  }

   /**
   * The account number where the primary account number is not a card.
   * @return accountNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "146789900034567", value = "The account number where the primary account number is not a card.")

  public String getAccountNum() {
    return accountNum;
  }



  public void setAccountNum(String accountNum) {
    this.accountNum = accountNum;
  }


  public Mcc6012 postCode(String postCode) {
    
    this.postCode = postCode;
    return this;
  }

   /**
   * The postal code of the cardholder.
   * @return postCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "30101", value = "The postal code of the cardholder.")

  public String getPostCode() {
    return postCode;
  }



  public void setPostCode(String postCode) {
    this.postCode = postCode;
  }


  public Mcc6012 surname(String surname) {
    
    this.surname = surname;
    return this;
  }

   /**
   * Surname or last name of the card holder.
   * @return surname
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Walker", value = "Surname or last name of the card holder.")

  public String getSurname() {
    return surname;
  }



  public void setSurname(String surname) {
    this.surname = surname;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Mcc6012 mcc6012 = (Mcc6012) o;
    return Objects.equals(this.dateOfBirth, mcc6012.dateOfBirth) &&
        Objects.equals(this.accountFirst6, mcc6012.accountFirst6) &&
        Objects.equals(this.accountLast4, mcc6012.accountLast4) &&
        Objects.equals(this.accountNum, mcc6012.accountNum) &&
        Objects.equals(this.postCode, mcc6012.postCode) &&
        Objects.equals(this.surname, mcc6012.surname);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateOfBirth, accountFirst6, accountLast4, accountNum, postCode, surname);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Mcc6012 {\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    accountFirst6: ").append(toIndentedString(accountFirst6)).append("\n");
    sb.append("    accountLast4: ").append(toIndentedString(accountLast4)).append("\n");
    sb.append("    accountNum: ").append(toIndentedString(accountNum)).append("\n");
    sb.append("    postCode: ").append(toIndentedString(postCode)).append("\n");
    sb.append("    surname: ").append(toIndentedString(surname)).append("\n");
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

