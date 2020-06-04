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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * The payment object for China-domestic transactions. Use this to populate all china domestic payment method details.
 */
@ApiModel(description = "The payment object for China-domestic transactions. Use this to populate all china domestic payment method details.")

public class ChinaDomestic {
  public static final String SERIALIZED_NAME_PRODUCT_CODE = "productCode";
  @SerializedName(SERIALIZED_NAME_PRODUCT_CODE)
  private String productCode;

  public static final String SERIALIZED_NAME_PRODUCT_QUANTITY = "productQuantity";
  @SerializedName(SERIALIZED_NAME_PRODUCT_QUANTITY)
  private Integer productQuantity;

  public static final String SERIALIZED_NAME_PRODUCT_PRICE = "productPrice";
  @SerializedName(SERIALIZED_NAME_PRODUCT_PRICE)
  private BigDecimal productPrice;

  public static final String SERIALIZED_NAME_PRODUCT_DESCRIPTION = "productDescription";
  @SerializedName(SERIALIZED_NAME_PRODUCT_DESCRIPTION)
  private String productDescription;

  public static final String SERIALIZED_NAME_REDIRECT_U_R_L = "redirectURL";
  @SerializedName(SERIALIZED_NAME_REDIRECT_U_R_L)
  private String redirectURL;

  public static final String SERIALIZED_NAME_LIMIT_CARD_FUNCTION_TO_DEBIT = "limitCardFunctionToDebit";
  @SerializedName(SERIALIZED_NAME_LIMIT_CARD_FUNCTION_TO_DEBIT)
  private Boolean limitCardFunctionToDebit;

  public static final String SERIALIZED_NAME_CUSTOMER_ID = "customerId";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_ID)
  private String customerId;

  public static final String SERIALIZED_NAME_BANK_ID = "bankId";
  @SerializedName(SERIALIZED_NAME_BANK_ID)
  private String bankId;


  public ChinaDomestic productCode(String productCode) {
    
    this.productCode = productCode;
    return this;
  }

   /**
   * Use this to indicate the product code according to the product category list.
   * @return productCode
  **/
  @ApiModelProperty(example = "R2D2C3PO", required = true, value = "Use this to indicate the product code according to the product category list.")

  public String getProductCode() {
    return productCode;
  }



  public void setProductCode(String productCode) {
    this.productCode = productCode;
  }


  public ChinaDomestic productQuantity(Integer productQuantity) {
    
    this.productQuantity = productQuantity;
    return this;
  }

   /**
   * The quantity.
   * minimum: 1
   * @return productQuantity
  **/
  @ApiModelProperty(example = "10", required = true, value = "The quantity.")

  public Integer getProductQuantity() {
    return productQuantity;
  }



  public void setProductQuantity(Integer productQuantity) {
    this.productQuantity = productQuantity;
  }


  public ChinaDomestic productPrice(BigDecimal productPrice) {
    
    this.productPrice = productPrice;
    return this;
  }

   /**
   * Rate amount in 3 decimal 12 bytes total digit.
   * @return productPrice
  **/
  @ApiModelProperty(example = "3.2", required = true, value = "Rate amount in 3 decimal 12 bytes total digit.")

  public BigDecimal getProductPrice() {
    return productPrice;
  }



  public void setProductPrice(BigDecimal productPrice) {
    this.productPrice = productPrice;
  }


  public ChinaDomestic productDescription(String productDescription) {
    
    this.productDescription = productDescription;
    return this;
  }

   /**
   * The product description.
   * @return productDescription
  **/
  @ApiModelProperty(example = "Best product ever", required = true, value = "The product description.")

  public String getProductDescription() {
    return productDescription;
  }



  public void setProductDescription(String productDescription) {
    this.productDescription = productDescription;
  }


  public ChinaDomestic redirectURL(String redirectURL) {
    
    this.redirectURL = redirectURL;
    return this;
  }

   /**
   * Use this to indicate the product code according to the product category list.
   * @return redirectURL
  **/
  @ApiModelProperty(example = "www.urlredirectedto.com", required = true, value = "Use this to indicate the product code according to the product category list.")

  public String getRedirectURL() {
    return redirectURL;
  }



  public void setRedirectURL(String redirectURL) {
    this.redirectURL = redirectURL;
  }


  public ChinaDomestic limitCardFunctionToDebit(Boolean limitCardFunctionToDebit) {
    
    this.limitCardFunctionToDebit = limitCardFunctionToDebit;
    return this;
  }

   /**
   * Use this to limit card functions to debit cards.
   * @return limitCardFunctionToDebit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Use this to limit card functions to debit cards.")

  public Boolean getLimitCardFunctionToDebit() {
    return limitCardFunctionToDebit;
  }



  public void setLimitCardFunctionToDebit(Boolean limitCardFunctionToDebit) {
    this.limitCardFunctionToDebit = limitCardFunctionToDebit;
  }


  public ChinaDomestic customerId(String customerId) {
    
    this.customerId = customerId;
    return this;
  }

   /**
   * Use this to indicate the CUP customer ID if known.
   * @return customerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ID3Bs", value = "Use this to indicate the CUP customer ID if known.")

  public String getCustomerId() {
    return customerId;
  }



  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }


  public ChinaDomestic bankId(String bankId) {
    
    this.bankId = bankId;
    return this;
  }

   /**
   * Use this to indicate the CUP bank ID if known.
   * @return bankId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123456", value = "Use this to indicate the CUP bank ID if known.")

  public String getBankId() {
    return bankId;
  }



  public void setBankId(String bankId) {
    this.bankId = bankId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChinaDomestic chinaDomestic = (ChinaDomestic) o;
    return Objects.equals(this.productCode, chinaDomestic.productCode) &&
        Objects.equals(this.productQuantity, chinaDomestic.productQuantity) &&
        Objects.equals(this.productPrice, chinaDomestic.productPrice) &&
        Objects.equals(this.productDescription, chinaDomestic.productDescription) &&
        Objects.equals(this.redirectURL, chinaDomestic.redirectURL) &&
        Objects.equals(this.limitCardFunctionToDebit, chinaDomestic.limitCardFunctionToDebit) &&
        Objects.equals(this.customerId, chinaDomestic.customerId) &&
        Objects.equals(this.bankId, chinaDomestic.bankId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productCode, productQuantity, productPrice, productDescription, redirectURL, limitCardFunctionToDebit, customerId, bankId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChinaDomestic {\n");
    sb.append("    productCode: ").append(toIndentedString(productCode)).append("\n");
    sb.append("    productQuantity: ").append(toIndentedString(productQuantity)).append("\n");
    sb.append("    productPrice: ").append(toIndentedString(productPrice)).append("\n");
    sb.append("    productDescription: ").append(toIndentedString(productDescription)).append("\n");
    sb.append("    redirectURL: ").append(toIndentedString(redirectURL)).append("\n");
    sb.append("    limitCardFunctionToDebit: ").append(toIndentedString(limitCardFunctionToDebit)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    bankId: ").append(toIndentedString(bankId)).append("\n");
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

