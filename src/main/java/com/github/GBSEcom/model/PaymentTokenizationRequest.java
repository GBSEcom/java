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
import com.github.GBSEcom.model.AdditionalDetails;
import com.github.GBSEcom.model.Address;
import com.github.GBSEcom.model.CreatePaymentToken;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Used to generate payment tokens. Abstract class, do not use this class directly, use one of its children.
 */
@ApiModel(description = "Used to generate payment tokens. Abstract class, do not use this class directly, use one of its children.")


public class PaymentTokenizationRequest {
  public static final String SERIALIZED_NAME_REQUEST_TYPE = "requestType";
  @SerializedName(SERIALIZED_NAME_REQUEST_TYPE)
  private String requestType;

  public static final String SERIALIZED_NAME_STORE_ID = "storeId";
  @SerializedName(SERIALIZED_NAME_STORE_ID)
  private String storeId;

  public static final String SERIALIZED_NAME_BILLING_ADDRESS = "billingAddress";
  @SerializedName(SERIALIZED_NAME_BILLING_ADDRESS)
  private Address billingAddress;

  public static final String SERIALIZED_NAME_CREATE_TOKEN = "createToken";
  @SerializedName(SERIALIZED_NAME_CREATE_TOKEN)
  private CreatePaymentToken createToken;

  public static final String SERIALIZED_NAME_ACCOUNT_VERIFICATION = "accountVerification";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_VERIFICATION)
  private Boolean accountVerification = false;

  public static final String SERIALIZED_NAME_MERCHANT_TRANSACTION_ID = "merchantTransactionId";
  @SerializedName(SERIALIZED_NAME_MERCHANT_TRANSACTION_ID)
  private String merchantTransactionId;

  public static final String SERIALIZED_NAME_ADDITIONAL_DETAILS = "additionalDetails";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_DETAILS)
  private AdditionalDetails additionalDetails;

  public PaymentTokenizationRequest() {
    this.requestType = this.getClass().getSimpleName();
  }

  public PaymentTokenizationRequest requestType(String requestType) {
    
    this.requestType = requestType;
    return this;
  }

   /**
   * Object name of tokenization request.
   * @return requestType
  **/
  @ApiModelProperty(example = "PaymentCardPaymentTokenizationRequest", required = true, value = "Object name of tokenization request.")

  public String getRequestType() {
    return requestType;
  }



  public void setRequestType(String requestType) {
    this.requestType = requestType;
  }


  public PaymentTokenizationRequest storeId(String storeId) {
    
    this.storeId = storeId;
    return this;
  }

   /**
   * An optional outlet ID for clients that support multiple stores in the same app.
   * @return storeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "12345500000", value = "An optional outlet ID for clients that support multiple stores in the same app.")

  public String getStoreId() {
    return storeId;
  }



  public void setStoreId(String storeId) {
    this.storeId = storeId;
  }


  public PaymentTokenizationRequest billingAddress(Address billingAddress) {
    
    this.billingAddress = billingAddress;
    return this;
  }

   /**
   * Get billingAddress
   * @return billingAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Address getBillingAddress() {
    return billingAddress;
  }



  public void setBillingAddress(Address billingAddress) {
    this.billingAddress = billingAddress;
  }


  public PaymentTokenizationRequest createToken(CreatePaymentToken createToken) {
    
    this.createToken = createToken;
    return this;
  }

   /**
   * Get createToken
   * @return createToken
  **/
  @ApiModelProperty(required = true, value = "")

  public CreatePaymentToken getCreateToken() {
    return createToken;
  }



  public void setCreateToken(CreatePaymentToken createToken) {
    this.createToken = createToken;
  }


  public PaymentTokenizationRequest accountVerification(Boolean accountVerification) {
    
    this.accountVerification = accountVerification;
    return this;
  }

   /**
   * If the account should be verified prior to token creation.
   * @return accountVerification
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "If the account should be verified prior to token creation.")

  public Boolean getAccountVerification() {
    return accountVerification;
  }



  public void setAccountVerification(Boolean accountVerification) {
    this.accountVerification = accountVerification;
  }


  public PaymentTokenizationRequest merchantTransactionId(String merchantTransactionId) {
    
    this.merchantTransactionId = merchantTransactionId;
    return this;
  }

   /**
   * The unique merchant transaction ID from the request, if supplied.
   * @return merchantTransactionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "lsk23532djljff3", value = "The unique merchant transaction ID from the request, if supplied.")

  public String getMerchantTransactionId() {
    return merchantTransactionId;
  }



  public void setMerchantTransactionId(String merchantTransactionId) {
    this.merchantTransactionId = merchantTransactionId;
  }


  public PaymentTokenizationRequest additionalDetails(AdditionalDetails additionalDetails) {
    
    this.additionalDetails = additionalDetails;
    return this;
  }

   /**
   * Get additionalDetails
   * @return additionalDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AdditionalDetails getAdditionalDetails() {
    return additionalDetails;
  }



  public void setAdditionalDetails(AdditionalDetails additionalDetails) {
    this.additionalDetails = additionalDetails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentTokenizationRequest paymentTokenizationRequest = (PaymentTokenizationRequest) o;
    return Objects.equals(this.requestType, paymentTokenizationRequest.requestType) &&
        Objects.equals(this.storeId, paymentTokenizationRequest.storeId) &&
        Objects.equals(this.billingAddress, paymentTokenizationRequest.billingAddress) &&
        Objects.equals(this.createToken, paymentTokenizationRequest.createToken) &&
        Objects.equals(this.accountVerification, paymentTokenizationRequest.accountVerification) &&
        Objects.equals(this.merchantTransactionId, paymentTokenizationRequest.merchantTransactionId) &&
        Objects.equals(this.additionalDetails, paymentTokenizationRequest.additionalDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestType, storeId, billingAddress, createToken, accountVerification, merchantTransactionId, additionalDetails);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentTokenizationRequest {\n");
    sb.append("    requestType: ").append(toIndentedString(requestType)).append("\n");
    sb.append("    storeId: ").append(toIndentedString(storeId)).append("\n");
    sb.append("    billingAddress: ").append(toIndentedString(billingAddress)).append("\n");
    sb.append("    createToken: ").append(toIndentedString(createToken)).append("\n");
    sb.append("    accountVerification: ").append(toIndentedString(accountVerification)).append("\n");
    sb.append("    merchantTransactionId: ").append(toIndentedString(merchantTransactionId)).append("\n");
    sb.append("    additionalDetails: ").append(toIndentedString(additionalDetails)).append("\n");
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

