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
import com.github.GBSEcom.model.AchRecurringType;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * TeleCheckICAPaymentMethodAllOf
 */

public class TeleCheckICAPaymentMethodAllOf {
  public static final String SERIALIZED_NAME_CUSTOMER_IP_ADDRESS = "customerIpAddress";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_IP_ADDRESS)
  private String customerIpAddress;

  public static final String SERIALIZED_NAME_IMEI_CODE = "imeiCode";
  @SerializedName(SERIALIZED_NAME_IMEI_CODE)
  private String imeiCode;

  public static final String SERIALIZED_NAME_RECURRING_TYPE = "recurringType";
  @SerializedName(SERIALIZED_NAME_RECURRING_TYPE)
  private AchRecurringType recurringType;


  public TeleCheckICAPaymentMethodAllOf customerIpAddress(String customerIpAddress) {
    
    this.customerIpAddress = customerIpAddress;
    return this;
  }

   /**
   * Customer IP address from the terminal where the order was placed (as captured by merchant).
   * @return customerIpAddress
  **/
  @ApiModelProperty(example = "11.32.232.44", required = true, value = "Customer IP address from the terminal where the order was placed (as captured by merchant).")

  public String getCustomerIpAddress() {
    return customerIpAddress;
  }



  public void setCustomerIpAddress(String customerIpAddress) {
    this.customerIpAddress = customerIpAddress;
  }


  public TeleCheckICAPaymentMethodAllOf imeiCode(String imeiCode) {
    
    this.imeiCode = imeiCode;
    return this;
  }

   /**
   * International mobile equipment identity code.
   * @return imeiCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "99-000086-247185-4", value = "International mobile equipment identity code.")

  public String getImeiCode() {
    return imeiCode;
  }



  public void setImeiCode(String imeiCode) {
    this.imeiCode = imeiCode;
  }


  public TeleCheckICAPaymentMethodAllOf recurringType(AchRecurringType recurringType) {
    
    this.recurringType = recurringType;
    return this;
  }

   /**
   * Get recurringType
   * @return recurringType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AchRecurringType getRecurringType() {
    return recurringType;
  }



  public void setRecurringType(AchRecurringType recurringType) {
    this.recurringType = recurringType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TeleCheckICAPaymentMethodAllOf teleCheckICAPaymentMethodAllOf = (TeleCheckICAPaymentMethodAllOf) o;
    return Objects.equals(this.customerIpAddress, teleCheckICAPaymentMethodAllOf.customerIpAddress) &&
        Objects.equals(this.imeiCode, teleCheckICAPaymentMethodAllOf.imeiCode) &&
        Objects.equals(this.recurringType, teleCheckICAPaymentMethodAllOf.recurringType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerIpAddress, imeiCode, recurringType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TeleCheckICAPaymentMethodAllOf {\n");
    sb.append("    customerIpAddress: ").append(toIndentedString(customerIpAddress)).append("\n");
    sb.append("    imeiCode: ").append(toIndentedString(imeiCode)).append("\n");
    sb.append("    recurringType: ").append(toIndentedString(recurringType)).append("\n");
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

