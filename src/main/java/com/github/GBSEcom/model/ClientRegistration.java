/*
 * Payment Gateway API Specification.
 * The documentation here is designed to provide all of the technical guidance required to consume and integrate with our APIs for payment processing. To learn more about our APIs please visit https://docs.firstdata.com/org/gateway.
 *
 * The version of the OpenAPI document: 6.8.0.20190731.002
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.github.GBSEcom.model;

import java.util.Objects;
import java.util.Arrays;
import com.github.GBSEcom.model.Customer;
import com.github.GBSEcom.model.FraudRegistration;
import com.github.GBSEcom.model.FraudRegistrationDevice;
import com.github.GBSEcom.model.Merchant;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ClientRegistration
 */

public class ClientRegistration {
  public static final String SERIALIZED_NAME_MERCHANT_REF = "merchantRef";
  @SerializedName(SERIALIZED_NAME_MERCHANT_REF)
  private String merchantRef;

  public static final String SERIALIZED_NAME_TRANSACTION_TYPE = "transactionType";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_TYPE)
  private String transactionType;

  public static final String SERIALIZED_NAME_CUSTOMER = "customer";
  @SerializedName(SERIALIZED_NAME_CUSTOMER)
  private Customer customer;

  public static final String SERIALIZED_NAME_MERCHANT = "merchant";
  @SerializedName(SERIALIZED_NAME_MERCHANT)
  private Merchant merchant;

  public static final String SERIALIZED_NAME_DEVICE = "device";
  @SerializedName(SERIALIZED_NAME_DEVICE)
  private FraudRegistrationDevice device;

  public static final String SERIALIZED_NAME_USER_DEFINED = "userDefined";
  @SerializedName(SERIALIZED_NAME_USER_DEFINED)
  private Object userDefined;

  public static final String SERIALIZED_NAME_ORIGINAL_TRANSACTION_TYPE = "originalTransactionType";
  @SerializedName(SERIALIZED_NAME_ORIGINAL_TRANSACTION_TYPE)
  private String originalTransactionType;


  public ClientRegistration merchantRef(String merchantRef) {
    
    this.merchantRef = merchantRef;
    return this;
  }

   /**
   * Merchant reference code. Used by FirstAPI and reflected in settlement records and webhook notifications. Typically, the merchantRef field is the purchase order number or unique sequence value associated to a given transaction.
   * @return merchantRef
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ffd031516002", value = "Merchant reference code. Used by FirstAPI and reflected in settlement records and webhook notifications. Typically, the merchantRef field is the purchase order number or unique sequence value associated to a given transaction.")

  public String getMerchantRef() {
    return merchantRef;
  }



  public void setMerchantRef(String merchantRef) {
    this.merchantRef = merchantRef;
  }


  public ClientRegistration transactionType(String transactionType) {
    
    this.transactionType = transactionType;
    return this;
  }

   /**
   * Type of transaction merchant wants to process.
   * @return transactionType
  **/
  @ApiModelProperty(example = "registration", required = true, value = "Type of transaction merchant wants to process.")

  public String getTransactionType() {
    return transactionType;
  }



  public void setTransactionType(String transactionType) {
    this.transactionType = transactionType;
  }


  public ClientRegistration customer(Customer customer) {
    
    this.customer = customer;
    return this;
  }

   /**
   * Get customer
   * @return customer
  **/
  @ApiModelProperty(required = true, value = "")

  public Customer getCustomer() {
    return customer;
  }



  public void setCustomer(Customer customer) {
    this.customer = customer;
  }


  public ClientRegistration merchant(Merchant merchant) {
    
    this.merchant = merchant;
    return this;
  }

   /**
   * Get merchant
   * @return merchant
  **/
  @ApiModelProperty(required = true, value = "")

  public Merchant getMerchant() {
    return merchant;
  }



  public void setMerchant(Merchant merchant) {
    this.merchant = merchant;
  }


  public ClientRegistration device(FraudRegistrationDevice device) {
    
    this.device = device;
    return this;
  }

   /**
   * Get device
   * @return device
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FraudRegistrationDevice getDevice() {
    return device;
  }



  public void setDevice(FraudRegistrationDevice device) {
    this.device = device;
  }


  public ClientRegistration userDefined(Object userDefined) {
    
    this.userDefined = userDefined;
    return this;
  }

   /**
   * A JSON object that can carry any additional information that might be helpful for fraud detection.
   * @return userDefined
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"inauthTransId\":\"1234\"}", value = "A JSON object that can carry any additional information that might be helpful for fraud detection.")

  public Object getUserDefined() {
    return userDefined;
  }



  public void setUserDefined(Object userDefined) {
    this.userDefined = userDefined;
  }


  public ClientRegistration originalTransactionType(String originalTransactionType) {
    
    this.originalTransactionType = originalTransactionType;
    return this;
  }

   /**
   * Defines the type of the original transaction that is being evaluated for the Fraud Score.
   * @return originalTransactionType
  **/
  @ApiModelProperty(example = "registration/client", required = true, value = "Defines the type of the original transaction that is being evaluated for the Fraud Score.")

  public String getOriginalTransactionType() {
    return originalTransactionType;
  }



  public void setOriginalTransactionType(String originalTransactionType) {
    this.originalTransactionType = originalTransactionType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClientRegistration clientRegistration = (ClientRegistration) o;
    return Objects.equals(this.merchantRef, clientRegistration.merchantRef) &&
        Objects.equals(this.transactionType, clientRegistration.transactionType) &&
        Objects.equals(this.customer, clientRegistration.customer) &&
        Objects.equals(this.merchant, clientRegistration.merchant) &&
        Objects.equals(this.device, clientRegistration.device) &&
        Objects.equals(this.userDefined, clientRegistration.userDefined) &&
        Objects.equals(this.originalTransactionType, clientRegistration.originalTransactionType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchantRef, transactionType, customer, merchant, device, userDefined, originalTransactionType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClientRegistration {\n");
    sb.append("    merchantRef: ").append(toIndentedString(merchantRef)).append("\n");
    sb.append("    transactionType: ").append(toIndentedString(transactionType)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    merchant: ").append(toIndentedString(merchant)).append("\n");
    sb.append("    device: ").append(toIndentedString(device)).append("\n");
    sb.append("    userDefined: ").append(toIndentedString(userDefined)).append("\n");
    sb.append("    originalTransactionType: ").append(toIndentedString(originalTransactionType)).append("\n");
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

