/*
 * Payment Gateway API Specification.
 * The documentation here is designed to provide all of the technical guidance required to consume and integrate with our APIs for payment processing. To learn more about our APIs please visit https://docs.firstdata.com/org/gateway.
 *
 * OpenAPI spec version: 6.10.1.20200226.002
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
import com.github.GBSEcom.model.Document;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Once sub-merchant element is given, the transaction is considered to be a sub-merchant transaction.
 */
@ApiModel(description = "Once sub-merchant element is given, the transaction is considered to be a sub-merchant transaction.")

public class SubMerchantData {
  public static final String SERIALIZED_NAME_MCC = "mcc";
  @SerializedName(SERIALIZED_NAME_MCC)
  private String mcc;

  public static final String SERIALIZED_NAME_LEGAL_NAME = "legalName";
  @SerializedName(SERIALIZED_NAME_LEGAL_NAME)
  private String legalName;

  public static final String SERIALIZED_NAME_TIMEZONE = "timezone";
  @SerializedName(SERIALIZED_NAME_TIMEZONE)
  private String timezone;

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private Address address = null;

  public static final String SERIALIZED_NAME_DOCUMENT = "document";
  @SerializedName(SERIALIZED_NAME_DOCUMENT)
  private Document document = null;

  public static final String SERIALIZED_NAME_MERCHANT_ID = "merchantId";
  @SerializedName(SERIALIZED_NAME_MERCHANT_ID)
  private String merchantId;

  public SubMerchantData mcc(String mcc) {
    this.mcc = mcc;
    return this;
  }

   /**
   * Merchant category code.
   * @return mcc
  **/
  @ApiModelProperty(example = "7311", required = true, value = "Merchant category code.")
  public String getMcc() {
    return mcc;
  }

  public void setMcc(String mcc) {
    this.mcc = mcc;
  }

  public SubMerchantData legalName(String legalName) {
    this.legalName = legalName;
    return this;
  }

   /**
   * Store legal name.
   * @return legalName
  **/
  @ApiModelProperty(example = "Walmart Inc.", value = "Store legal name.")
  public String getLegalName() {
    return legalName;
  }

  public void setLegalName(String legalName) {
    this.legalName = legalName;
  }

  public SubMerchantData timezone(String timezone) {
    this.timezone = timezone;
    return this;
  }

   /**
   * Timezone.
   * @return timezone
  **/
  @ApiModelProperty(example = "Europe/London", value = "Timezone.")
  public String getTimezone() {
    return timezone;
  }

  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }

  public SubMerchantData address(Address address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @ApiModelProperty(value = "")
  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public SubMerchantData document(Document document) {
    this.document = document;
    return this;
  }

   /**
   * Get document
   * @return document
  **/
  @ApiModelProperty(value = "")
  public Document getDocument() {
    return document;
  }

  public void setDocument(Document document) {
    this.document = document;
  }

  public SubMerchantData merchantId(String merchantId) {
    this.merchantId = merchantId;
    return this;
  }

   /**
   * Sub-merchant ID.
   * @return merchantId
  **/
  @ApiModelProperty(example = "987654321", value = "Sub-merchant ID.")
  public String getMerchantId() {
    return merchantId;
  }

  public void setMerchantId(String merchantId) {
    this.merchantId = merchantId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubMerchantData subMerchantData = (SubMerchantData) o;
    return Objects.equals(this.mcc, subMerchantData.mcc) &&
        Objects.equals(this.legalName, subMerchantData.legalName) &&
        Objects.equals(this.timezone, subMerchantData.timezone) &&
        Objects.equals(this.address, subMerchantData.address) &&
        Objects.equals(this.document, subMerchantData.document) &&
        Objects.equals(this.merchantId, subMerchantData.merchantId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mcc, legalName, timezone, address, document, merchantId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubMerchantData {\n");
    
    sb.append("    mcc: ").append(toIndentedString(mcc)).append("\n");
    sb.append("    legalName: ").append(toIndentedString(legalName)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    document: ").append(toIndentedString(document)).append("\n");
    sb.append("    merchantId: ").append(toIndentedString(merchantId)).append("\n");
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

