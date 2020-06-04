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
import com.github.GBSEcom.model.AdditionalDetails;
import com.github.GBSEcom.model.BancontactQR;
import com.github.GBSEcom.model.Billing;
import com.github.GBSEcom.model.IndustrySpecificExtensions;
import com.github.GBSEcom.model.InstallmentOptions;
import com.github.GBSEcom.model.PurchaseCards;
import com.github.GBSEcom.model.Shipping;
import com.github.GBSEcom.model.SoftDescriptor;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Use this model to provide order related details.
 */
@ApiModel(description = "Use this model to provide order related details.")

public class Order {
  public static final String SERIALIZED_NAME_ORDER_ID = "orderId";
  @SerializedName(SERIALIZED_NAME_ORDER_ID)
  private String orderId;

  public static final String SERIALIZED_NAME_BILLING = "billing";
  @SerializedName(SERIALIZED_NAME_BILLING)
  private Billing billing;

  public static final String SERIALIZED_NAME_SHIPPING = "shipping";
  @SerializedName(SERIALIZED_NAME_SHIPPING)
  private Shipping shipping;

  public static final String SERIALIZED_NAME_INDUSTRY_SPECIFIC_EXTENSIONS = "industrySpecificExtensions";
  @SerializedName(SERIALIZED_NAME_INDUSTRY_SPECIFIC_EXTENSIONS)
  private IndustrySpecificExtensions industrySpecificExtensions;

  public static final String SERIALIZED_NAME_PURCHASE_CARD = "purchaseCard";
  @SerializedName(SERIALIZED_NAME_PURCHASE_CARD)
  private PurchaseCards purchaseCard;

  public static final String SERIALIZED_NAME_INSTALLMENT_OPTIONS = "installmentOptions";
  @SerializedName(SERIALIZED_NAME_INSTALLMENT_OPTIONS)
  private InstallmentOptions installmentOptions;

  public static final String SERIALIZED_NAME_SOFT_DESCRIPTOR = "softDescriptor";
  @SerializedName(SERIALIZED_NAME_SOFT_DESCRIPTOR)
  private SoftDescriptor softDescriptor;

  public static final String SERIALIZED_NAME_ADDITIONAL_DETAILS = "additionalDetails";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_DETAILS)
  private AdditionalDetails additionalDetails;

  public static final String SERIALIZED_NAME_BANCONTACT_Q_R = "bancontactQR";
  @SerializedName(SERIALIZED_NAME_BANCONTACT_Q_R)
  private BancontactQR bancontactQR;


  public Order orderId(String orderId) {
    
    this.orderId = orderId;
    return this;
  }

   /**
   * Client Order ID if supplied by client.
   * @return orderId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ABC12345", value = "Client Order ID if supplied by client.")

  public String getOrderId() {
    return orderId;
  }



  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }


  public Order billing(Billing billing) {
    
    this.billing = billing;
    return this;
  }

   /**
   * Get billing
   * @return billing
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Billing getBilling() {
    return billing;
  }



  public void setBilling(Billing billing) {
    this.billing = billing;
  }


  public Order shipping(Shipping shipping) {
    
    this.shipping = shipping;
    return this;
  }

   /**
   * Get shipping
   * @return shipping
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Shipping getShipping() {
    return shipping;
  }



  public void setShipping(Shipping shipping) {
    this.shipping = shipping;
  }


  public Order industrySpecificExtensions(IndustrySpecificExtensions industrySpecificExtensions) {
    
    this.industrySpecificExtensions = industrySpecificExtensions;
    return this;
  }

   /**
   * Get industrySpecificExtensions
   * @return industrySpecificExtensions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IndustrySpecificExtensions getIndustrySpecificExtensions() {
    return industrySpecificExtensions;
  }



  public void setIndustrySpecificExtensions(IndustrySpecificExtensions industrySpecificExtensions) {
    this.industrySpecificExtensions = industrySpecificExtensions;
  }


  public Order purchaseCard(PurchaseCards purchaseCard) {
    
    this.purchaseCard = purchaseCard;
    return this;
  }

   /**
   * Get purchaseCard
   * @return purchaseCard
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PurchaseCards getPurchaseCard() {
    return purchaseCard;
  }



  public void setPurchaseCard(PurchaseCards purchaseCard) {
    this.purchaseCard = purchaseCard;
  }


  public Order installmentOptions(InstallmentOptions installmentOptions) {
    
    this.installmentOptions = installmentOptions;
    return this;
  }

   /**
   * Get installmentOptions
   * @return installmentOptions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public InstallmentOptions getInstallmentOptions() {
    return installmentOptions;
  }



  public void setInstallmentOptions(InstallmentOptions installmentOptions) {
    this.installmentOptions = installmentOptions;
  }


  public Order softDescriptor(SoftDescriptor softDescriptor) {
    
    this.softDescriptor = softDescriptor;
    return this;
  }

   /**
   * Get softDescriptor
   * @return softDescriptor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SoftDescriptor getSoftDescriptor() {
    return softDescriptor;
  }



  public void setSoftDescriptor(SoftDescriptor softDescriptor) {
    this.softDescriptor = softDescriptor;
  }


  public Order additionalDetails(AdditionalDetails additionalDetails) {
    
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


  public Order bancontactQR(BancontactQR bancontactQR) {
    
    this.bancontactQR = bancontactQR;
    return this;
  }

   /**
   * Get bancontactQR
   * @return bancontactQR
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BancontactQR getBancontactQR() {
    return bancontactQR;
  }



  public void setBancontactQR(BancontactQR bancontactQR) {
    this.bancontactQR = bancontactQR;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Order order = (Order) o;
    return Objects.equals(this.orderId, order.orderId) &&
        Objects.equals(this.billing, order.billing) &&
        Objects.equals(this.shipping, order.shipping) &&
        Objects.equals(this.industrySpecificExtensions, order.industrySpecificExtensions) &&
        Objects.equals(this.purchaseCard, order.purchaseCard) &&
        Objects.equals(this.installmentOptions, order.installmentOptions) &&
        Objects.equals(this.softDescriptor, order.softDescriptor) &&
        Objects.equals(this.additionalDetails, order.additionalDetails) &&
        Objects.equals(this.bancontactQR, order.bancontactQR);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderId, billing, shipping, industrySpecificExtensions, purchaseCard, installmentOptions, softDescriptor, additionalDetails, bancontactQR);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Order {\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    billing: ").append(toIndentedString(billing)).append("\n");
    sb.append("    shipping: ").append(toIndentedString(shipping)).append("\n");
    sb.append("    industrySpecificExtensions: ").append(toIndentedString(industrySpecificExtensions)).append("\n");
    sb.append("    purchaseCard: ").append(toIndentedString(purchaseCard)).append("\n");
    sb.append("    installmentOptions: ").append(toIndentedString(installmentOptions)).append("\n");
    sb.append("    softDescriptor: ").append(toIndentedString(softDescriptor)).append("\n");
    sb.append("    additionalDetails: ").append(toIndentedString(additionalDetails)).append("\n");
    sb.append("    bancontactQR: ").append(toIndentedString(bancontactQR)).append("\n");
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

