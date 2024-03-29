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
 * Identifying information about a merchant which appears on buyer&#39;s credit/debit card statements.
 */
@ApiModel(description = "Identifying information about a merchant which appears on buyer's credit/debit card statements.")

public class SoftDescriptor {
  public static final String SERIALIZED_NAME_DYNAMIC_MERCHANT_NAME = "dynamicMerchantName";
  @SerializedName(SERIALIZED_NAME_DYNAMIC_MERCHANT_NAME)
  private String dynamicMerchantName;

  public static final String SERIALIZED_NAME_CUSTOMER_SERVICE_NUMBER = "customerServiceNumber";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_SERVICE_NUMBER)
  private String customerServiceNumber;

  public static final String SERIALIZED_NAME_MCC = "mcc";
  @SerializedName(SERIALIZED_NAME_MCC)
  private String mcc;

  public static final String SERIALIZED_NAME_DYNAMIC_ADDRESS = "dynamicAddress";
  @SerializedName(SERIALIZED_NAME_DYNAMIC_ADDRESS)
  private Address dynamicAddress;


  public SoftDescriptor dynamicMerchantName(String dynamicMerchantName) {
    
    this.dynamicMerchantName = dynamicMerchantName;
    return this;
  }

   /**
   * Store \&quot;doing-business-as\&quot; name.
   * @return dynamicMerchantName
  **/
  @ApiModelProperty(example = "Merchant XYZ", required = true, value = "Store \"doing-business-as\" name.")

  public String getDynamicMerchantName() {
    return dynamicMerchantName;
  }



  public void setDynamicMerchantName(String dynamicMerchantName) {
    this.dynamicMerchantName = dynamicMerchantName;
  }


  public SoftDescriptor customerServiceNumber(String customerServiceNumber) {
    
    this.customerServiceNumber = customerServiceNumber;
    return this;
  }

   /**
   * Customer service phone number information that is passed to the issuer (it may appear on the cardholder’s statement) or if merchant wants to pass information that differs from the information stored on our master File.
   * @return customerServiceNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "9973322990", value = "Customer service phone number information that is passed to the issuer (it may appear on the cardholder’s statement) or if merchant wants to pass information that differs from the information stored on our master File.")

  public String getCustomerServiceNumber() {
    return customerServiceNumber;
  }



  public void setCustomerServiceNumber(String customerServiceNumber) {
    this.customerServiceNumber = customerServiceNumber;
  }


  public SoftDescriptor mcc(String mcc) {
    
    this.mcc = mcc;
    return this;
  }

   /**
   * The 4-digit merchant category code (MCC). The merchant might be associated with multiple MCCs. In that case the MCC provided here will be the one that better describes the current transaction.
   * @return mcc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "7311", value = "The 4-digit merchant category code (MCC). The merchant might be associated with multiple MCCs. In that case the MCC provided here will be the one that better describes the current transaction.")

  public String getMcc() {
    return mcc;
  }



  public void setMcc(String mcc) {
    this.mcc = mcc;
  }


  public SoftDescriptor dynamicAddress(Address dynamicAddress) {
    
    this.dynamicAddress = dynamicAddress;
    return this;
  }

   /**
   * Get dynamicAddress
   * @return dynamicAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Address getDynamicAddress() {
    return dynamicAddress;
  }



  public void setDynamicAddress(Address dynamicAddress) {
    this.dynamicAddress = dynamicAddress;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SoftDescriptor softDescriptor = (SoftDescriptor) o;
    return Objects.equals(this.dynamicMerchantName, softDescriptor.dynamicMerchantName) &&
        Objects.equals(this.customerServiceNumber, softDescriptor.customerServiceNumber) &&
        Objects.equals(this.mcc, softDescriptor.mcc) &&
        Objects.equals(this.dynamicAddress, softDescriptor.dynamicAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dynamicMerchantName, customerServiceNumber, mcc, dynamicAddress);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SoftDescriptor {\n");
    sb.append("    dynamicMerchantName: ").append(toIndentedString(dynamicMerchantName)).append("\n");
    sb.append("    customerServiceNumber: ").append(toIndentedString(customerServiceNumber)).append("\n");
    sb.append("    mcc: ").append(toIndentedString(mcc)).append("\n");
    sb.append("    dynamicAddress: ").append(toIndentedString(dynamicAddress)).append("\n");
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

