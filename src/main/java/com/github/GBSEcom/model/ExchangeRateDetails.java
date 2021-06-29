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
 * Fields related to Currency Conversion Inquiry.
 */
@ApiModel(description = "Fields related to Currency Conversion Inquiry.")

public class ExchangeRateDetails {
  public static final String SERIALIZED_NAME_INQUIRY_RATE_ID = "inquiryRateId";
  @SerializedName(SERIALIZED_NAME_INQUIRY_RATE_ID)
  private String inquiryRateId;

  public static final String SERIALIZED_NAME_FOREIGN_CURRENCY = "foreignCurrency";
  @SerializedName(SERIALIZED_NAME_FOREIGN_CURRENCY)
  private String foreignCurrency;

  public static final String SERIALIZED_NAME_FOREIGN_AMOUNT = "foreignAmount";
  @SerializedName(SERIALIZED_NAME_FOREIGN_AMOUNT)
  private String foreignAmount;

  public static final String SERIALIZED_NAME_EXCHANGE_RATE = "exchangeRate";
  @SerializedName(SERIALIZED_NAME_EXCHANGE_RATE)
  private String exchangeRate;

  public static final String SERIALIZED_NAME_DCC_OFFERED = "dccOffered";
  @SerializedName(SERIALIZED_NAME_DCC_OFFERED)
  private Boolean dccOffered;

  public static final String SERIALIZED_NAME_EXCHANGE_RATE_SOURCE_TIMESTAMP = "exchangeRateSourceTimestamp";
  @SerializedName(SERIALIZED_NAME_EXCHANGE_RATE_SOURCE_TIMESTAMP)
  private String exchangeRateSourceTimestamp;

  public static final String SERIALIZED_NAME_EXPIRATION_TIMESTAMP = "expirationTimestamp";
  @SerializedName(SERIALIZED_NAME_EXPIRATION_TIMESTAMP)
  private String expirationTimestamp;

  public static final String SERIALIZED_NAME_MARGIN_RATE_PERCENTAGE = "marginRatePercentage";
  @SerializedName(SERIALIZED_NAME_MARGIN_RATE_PERCENTAGE)
  private String marginRatePercentage;

  public static final String SERIALIZED_NAME_EXCHANGE_RATE_SOURCE_NAME = "exchangeRateSourceName";
  @SerializedName(SERIALIZED_NAME_EXCHANGE_RATE_SOURCE_NAME)
  private String exchangeRateSourceName;


  public ExchangeRateDetails inquiryRateId(String inquiryRateId) {
    
    this.inquiryRateId = inquiryRateId;
    return this;
  }

   /**
   * Inquiry rate ID.
   * @return inquiryRateId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "49150", value = "Inquiry rate ID.")

  public String getInquiryRateId() {
    return inquiryRateId;
  }



  public void setInquiryRateId(String inquiryRateId) {
    this.inquiryRateId = inquiryRateId;
  }


  public ExchangeRateDetails foreignCurrency(String foreignCurrency) {
    
    this.foreignCurrency = foreignCurrency;
    return this;
  }

   /**
   * Foreign currency in alphabetic ISO 4217 currency code format.
   * @return foreignCurrency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "AUD", value = "Foreign currency in alphabetic ISO 4217 currency code format.")

  public String getForeignCurrency() {
    return foreignCurrency;
  }



  public void setForeignCurrency(String foreignCurrency) {
    this.foreignCurrency = foreignCurrency;
  }


  public ExchangeRateDetails foreignAmount(String foreignAmount) {
    
    this.foreignAmount = foreignAmount;
    return this;
  }

   /**
   * Foreign amount.
   * @return foreignAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "130.33", value = "Foreign amount.")

  public String getForeignAmount() {
    return foreignAmount;
  }



  public void setForeignAmount(String foreignAmount) {
    this.foreignAmount = foreignAmount;
  }


  public ExchangeRateDetails exchangeRate(String exchangeRate) {
    
    this.exchangeRate = exchangeRate;
    return this;
  }

   /**
   * Exchange rate.
   * @return exchangeRate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1.2968", value = "Exchange rate.")

  public String getExchangeRate() {
    return exchangeRate;
  }



  public void setExchangeRate(String exchangeRate) {
    this.exchangeRate = exchangeRate;
  }


  public ExchangeRateDetails dccOffered(Boolean dccOffered) {
    
    this.dccOffered = dccOffered;
    return this;
  }

   /**
   * Dcc offered.
   * @return dccOffered
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Dcc offered.")

  public Boolean getDccOffered() {
    return dccOffered;
  }



  public void setDccOffered(Boolean dccOffered) {
    this.dccOffered = dccOffered;
  }


  public ExchangeRateDetails exchangeRateSourceTimestamp(String exchangeRateSourceTimestamp) {
    
    this.exchangeRateSourceTimestamp = exchangeRateSourceTimestamp;
    return this;
  }

   /**
   * Exchange rate source timestamp. The used format is \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSXXX\&quot;
   * @return exchangeRateSourceTimestamp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2018-12-05T14:13:00.000-05:00", value = "Exchange rate source timestamp. The used format is \"yyyy-MM-dd'T'HH:mm:ss.SSSXXX\"")

  public String getExchangeRateSourceTimestamp() {
    return exchangeRateSourceTimestamp;
  }



  public void setExchangeRateSourceTimestamp(String exchangeRateSourceTimestamp) {
    this.exchangeRateSourceTimestamp = exchangeRateSourceTimestamp;
  }


  public ExchangeRateDetails expirationTimestamp(String expirationTimestamp) {
    
    this.expirationTimestamp = expirationTimestamp;
    return this;
  }

   /**
   * Expiration timestamp. The used format is \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSXXX\&quot;
   * @return expirationTimestamp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2018-12-05T15:13:00.000-05:00", value = "Expiration timestamp. The used format is \"yyyy-MM-dd'T'HH:mm:ss.SSSXXX\"")

  public String getExpirationTimestamp() {
    return expirationTimestamp;
  }



  public void setExpirationTimestamp(String expirationTimestamp) {
    this.expirationTimestamp = expirationTimestamp;
  }


  public ExchangeRateDetails marginRatePercentage(String marginRatePercentage) {
    
    this.marginRatePercentage = marginRatePercentage;
    return this;
  }

   /**
   * Margin rate percentage.
   * @return marginRatePercentage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3", value = "Margin rate percentage.")

  public String getMarginRatePercentage() {
    return marginRatePercentage;
  }



  public void setMarginRatePercentage(String marginRatePercentage) {
    this.marginRatePercentage = marginRatePercentage;
  }


  public ExchangeRateDetails exchangeRateSourceName(String exchangeRateSourceName) {
    
    this.exchangeRateSourceName = exchangeRateSourceName;
    return this;
  }

   /**
   * Exchange rate source name.
   * @return exchangeRateSourceName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "REUTERS WHOLESALE INTERBANK", value = "Exchange rate source name.")

  public String getExchangeRateSourceName() {
    return exchangeRateSourceName;
  }



  public void setExchangeRateSourceName(String exchangeRateSourceName) {
    this.exchangeRateSourceName = exchangeRateSourceName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExchangeRateDetails exchangeRateDetails = (ExchangeRateDetails) o;
    return Objects.equals(this.inquiryRateId, exchangeRateDetails.inquiryRateId) &&
        Objects.equals(this.foreignCurrency, exchangeRateDetails.foreignCurrency) &&
        Objects.equals(this.foreignAmount, exchangeRateDetails.foreignAmount) &&
        Objects.equals(this.exchangeRate, exchangeRateDetails.exchangeRate) &&
        Objects.equals(this.dccOffered, exchangeRateDetails.dccOffered) &&
        Objects.equals(this.exchangeRateSourceTimestamp, exchangeRateDetails.exchangeRateSourceTimestamp) &&
        Objects.equals(this.expirationTimestamp, exchangeRateDetails.expirationTimestamp) &&
        Objects.equals(this.marginRatePercentage, exchangeRateDetails.marginRatePercentage) &&
        Objects.equals(this.exchangeRateSourceName, exchangeRateDetails.exchangeRateSourceName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inquiryRateId, foreignCurrency, foreignAmount, exchangeRate, dccOffered, exchangeRateSourceTimestamp, expirationTimestamp, marginRatePercentage, exchangeRateSourceName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExchangeRateDetails {\n");
    sb.append("    inquiryRateId: ").append(toIndentedString(inquiryRateId)).append("\n");
    sb.append("    foreignCurrency: ").append(toIndentedString(foreignCurrency)).append("\n");
    sb.append("    foreignAmount: ").append(toIndentedString(foreignAmount)).append("\n");
    sb.append("    exchangeRate: ").append(toIndentedString(exchangeRate)).append("\n");
    sb.append("    dccOffered: ").append(toIndentedString(dccOffered)).append("\n");
    sb.append("    exchangeRateSourceTimestamp: ").append(toIndentedString(exchangeRateSourceTimestamp)).append("\n");
    sb.append("    expirationTimestamp: ").append(toIndentedString(expirationTimestamp)).append("\n");
    sb.append("    marginRatePercentage: ").append(toIndentedString(marginRatePercentage)).append("\n");
    sb.append("    exchangeRateSourceName: ").append(toIndentedString(exchangeRateSourceName)).append("\n");
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

