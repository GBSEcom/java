/*
 * Payment Gateway API Specification.
 * The documentation here is designed to provide all of the technical guidance required to consume and integrate with our APIs for payment processing. To learn more about our APIs please visit https://docs.firstdata.com/org/gateway.
 *
 * The version of the OpenAPI document: 6.13.0.20200810.001
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
 * Sub-merchant split object for SettlementSplit.
 */
@ApiModel(description = "Sub-merchant split object for SettlementSplit.")

public class SubMerchantSplit {
  public static final String SERIALIZED_NAME_MERCHANT_I_D = "merchantID";
  @SerializedName(SERIALIZED_NAME_MERCHANT_I_D)
  private String merchantID;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private BigDecimal amount;


  public SubMerchantSplit merchantID(String merchantID) {
    
    this.merchantID = merchantID;
    return this;
  }

   /**
   * ID of merchant for tracking.
   * @return merchantID
  **/
  @ApiModelProperty(example = "100000001", required = true, value = "ID of merchant for tracking.")

  public String getMerchantID() {
    return merchantID;
  }



  public void setMerchantID(String merchantID) {
    this.merchantID = merchantID;
  }


  public SubMerchantSplit amount(BigDecimal amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * The amount each sub-merchant receives.
   * @return amount
  **/
  @ApiModelProperty(example = "25.06", required = true, value = "The amount each sub-merchant receives.")

  public BigDecimal getAmount() {
    return amount;
  }



  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubMerchantSplit subMerchantSplit = (SubMerchantSplit) o;
    return Objects.equals(this.merchantID, subMerchantSplit.merchantID) &&
        Objects.equals(this.amount, subMerchantSplit.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchantID, amount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubMerchantSplit {\n");
    sb.append("    merchantID: ").append(toIndentedString(merchantID)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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

