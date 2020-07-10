/*
 * Payment Gateway API Specification.
 * The documentation here is designed to provide all of the technical guidance required to consume and integrate with our APIs for payment processing. To learn more about our APIs please visit https://docs.firstdata.com/org/gateway.
 *
 * The version of the OpenAPI document: 6.12.0.20200605.001
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.github.GBSEcom.model;

import java.util.Objects;
import java.util.Arrays;
import com.github.GBSEcom.model.SubMerchantData;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Payment facilitator details provided by the merchant.
 */
@ApiModel(description = "Payment facilitator details provided by the merchant.")

public class PaymentFacilitator {
  public static final String SERIALIZED_NAME_EXTERNAL_MERCHANT_ID = "externalMerchantId";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_MERCHANT_ID)
  private String externalMerchantId;

  public static final String SERIALIZED_NAME_PAYMENT_FACILITATOR_ID = "paymentFacilitatorId";
  @SerializedName(SERIALIZED_NAME_PAYMENT_FACILITATOR_ID)
  private String paymentFacilitatorId;

  public static final String SERIALIZED_NAME_SALE_ORGANIZATION_ID = "saleOrganizationId";
  @SerializedName(SERIALIZED_NAME_SALE_ORGANIZATION_ID)
  private String saleOrganizationId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SUB_MERCHANT_DATA = "subMerchantData";
  @SerializedName(SERIALIZED_NAME_SUB_MERCHANT_DATA)
  private SubMerchantData subMerchantData;


  public PaymentFacilitator externalMerchantId(String externalMerchantId) {
    
    this.externalMerchantId = externalMerchantId;
    return this;
  }

   /**
   * External merchant ID of the payment facilitator.
   * @return externalMerchantId
  **/
  @ApiModelProperty(example = "151623999", required = true, value = "External merchant ID of the payment facilitator.")

  public String getExternalMerchantId() {
    return externalMerchantId;
  }



  public void setExternalMerchantId(String externalMerchantId) {
    this.externalMerchantId = externalMerchantId;
  }


  public PaymentFacilitator paymentFacilitatorId(String paymentFacilitatorId) {
    
    this.paymentFacilitatorId = paymentFacilitatorId;
    return this;
  }

   /**
   * Payment facilitator ID supplied during boarding.
   * @return paymentFacilitatorId
  **/
  @ApiModelProperty(example = "12345678901", required = true, value = "Payment facilitator ID supplied during boarding.")

  public String getPaymentFacilitatorId() {
    return paymentFacilitatorId;
  }



  public void setPaymentFacilitatorId(String paymentFacilitatorId) {
    this.paymentFacilitatorId = paymentFacilitatorId;
  }


  public PaymentFacilitator saleOrganizationId(String saleOrganizationId) {
    
    this.saleOrganizationId = saleOrganizationId;
    return this;
  }

   /**
   * Independent sales organization (ISO) ID provided by Mastercard.
   * @return saleOrganizationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "13579246801", value = "Independent sales organization (ISO) ID provided by Mastercard.")

  public String getSaleOrganizationId() {
    return saleOrganizationId;
  }



  public void setSaleOrganizationId(String saleOrganizationId) {
    this.saleOrganizationId = saleOrganizationId;
  }


  public PaymentFacilitator name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Payment facilitator name.
   * @return name
  **/
  @ApiModelProperty(example = "First Reseller", required = true, value = "Payment facilitator name.")

  public String getName() {
    return name;
  }



  public void setName(String name) {
    this.name = name;
  }


  public PaymentFacilitator subMerchantData(SubMerchantData subMerchantData) {
    
    this.subMerchantData = subMerchantData;
    return this;
  }

   /**
   * Get subMerchantData
   * @return subMerchantData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SubMerchantData getSubMerchantData() {
    return subMerchantData;
  }



  public void setSubMerchantData(SubMerchantData subMerchantData) {
    this.subMerchantData = subMerchantData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentFacilitator paymentFacilitator = (PaymentFacilitator) o;
    return Objects.equals(this.externalMerchantId, paymentFacilitator.externalMerchantId) &&
        Objects.equals(this.paymentFacilitatorId, paymentFacilitator.paymentFacilitatorId) &&
        Objects.equals(this.saleOrganizationId, paymentFacilitator.saleOrganizationId) &&
        Objects.equals(this.name, paymentFacilitator.name) &&
        Objects.equals(this.subMerchantData, paymentFacilitator.subMerchantData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalMerchantId, paymentFacilitatorId, saleOrganizationId, name, subMerchantData);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentFacilitator {\n");
    sb.append("    externalMerchantId: ").append(toIndentedString(externalMerchantId)).append("\n");
    sb.append("    paymentFacilitatorId: ").append(toIndentedString(paymentFacilitatorId)).append("\n");
    sb.append("    saleOrganizationId: ").append(toIndentedString(saleOrganizationId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    subMerchantData: ").append(toIndentedString(subMerchantData)).append("\n");
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

