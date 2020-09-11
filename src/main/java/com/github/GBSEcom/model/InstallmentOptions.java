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

/**
 * Indicates that the total sum payable is divided for payment at successive fixed times.
 */
@ApiModel(description = "Indicates that the total sum payable is divided for payment at successive fixed times.")

public class InstallmentOptions {
  public static final String SERIALIZED_NAME_NUMBER_OF_INSTALLMENTS = "numberOfInstallments";
  @SerializedName(SERIALIZED_NAME_NUMBER_OF_INSTALLMENTS)
  private Integer numberOfInstallments;

  public static final String SERIALIZED_NAME_INSTALLMENTS_INTEREST = "installmentsInterest";
  @SerializedName(SERIALIZED_NAME_INSTALLMENTS_INTEREST)
  private Boolean installmentsInterest;

  public static final String SERIALIZED_NAME_INSTALLMENT_DELAY_MONTHS = "installmentDelayMonths";
  @SerializedName(SERIALIZED_NAME_INSTALLMENT_DELAY_MONTHS)
  private Integer installmentDelayMonths;

  /**
   * The type of recurring payment.
   */
  @JsonAdapter(RecurringTypeEnum.Adapter.class)
  public enum RecurringTypeEnum {
    FIRST("FIRST"),
    
    REPEAT("REPEAT"),
    
    STANDING_INSTRUCTION("STANDING_INSTRUCTION");

    private String value;

    RecurringTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RecurringTypeEnum fromValue(String value) {
      for (RecurringTypeEnum b : RecurringTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<RecurringTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RecurringTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RecurringTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return RecurringTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_RECURRING_TYPE = "recurringType";
  @SerializedName(SERIALIZED_NAME_RECURRING_TYPE)
  private RecurringTypeEnum recurringType;

  public static final String SERIALIZED_NAME_MERCHANT_ADVICE_CODE_SUPPORTED = "merchantAdviceCodeSupported";
  @SerializedName(SERIALIZED_NAME_MERCHANT_ADVICE_CODE_SUPPORTED)
  private Boolean merchantAdviceCodeSupported;


  public InstallmentOptions numberOfInstallments(Integer numberOfInstallments) {
    
    this.numberOfInstallments = numberOfInstallments;
    return this;
  }

   /**
   * Number of installments for a sale transaction if the customer pays the total amount in multiple transactions.
   * minimum: 1
   * maximum: 99
   * @return numberOfInstallments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "5", value = "Number of installments for a sale transaction if the customer pays the total amount in multiple transactions.")

  public Integer getNumberOfInstallments() {
    return numberOfInstallments;
  }



  public void setNumberOfInstallments(Integer numberOfInstallments) {
    this.numberOfInstallments = numberOfInstallments;
  }


  public InstallmentOptions installmentsInterest(Boolean installmentsInterest) {
    
    this.installmentsInterest = installmentsInterest;
    return this;
  }

   /**
   * Indicates whether the installment interest amount has been applied.
   * @return installmentsInterest
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Indicates whether the installment interest amount has been applied.")

  public Boolean getInstallmentsInterest() {
    return installmentsInterest;
  }



  public void setInstallmentsInterest(Boolean installmentsInterest) {
    this.installmentsInterest = installmentsInterest;
  }


  public InstallmentOptions installmentDelayMonths(Integer installmentDelayMonths) {
    
    this.installmentDelayMonths = installmentDelayMonths;
    return this;
  }

   /**
   * The number of months the first installment payment will be delayed.
   * minimum: 1
   * maximum: 99
   * @return installmentDelayMonths
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "5", value = "The number of months the first installment payment will be delayed.")

  public Integer getInstallmentDelayMonths() {
    return installmentDelayMonths;
  }



  public void setInstallmentDelayMonths(Integer installmentDelayMonths) {
    this.installmentDelayMonths = installmentDelayMonths;
  }


  public InstallmentOptions recurringType(RecurringTypeEnum recurringType) {
    
    this.recurringType = recurringType;
    return this;
  }

   /**
   * The type of recurring payment.
   * @return recurringType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "FIRST", value = "The type of recurring payment.")

  public RecurringTypeEnum getRecurringType() {
    return recurringType;
  }



  public void setRecurringType(RecurringTypeEnum recurringType) {
    this.recurringType = recurringType;
  }


  public InstallmentOptions merchantAdviceCodeSupported(Boolean merchantAdviceCodeSupported) {
    
    this.merchantAdviceCodeSupported = merchantAdviceCodeSupported;
    return this;
  }

   /**
   * Indicates if the merchant supports merchant advice code (MAC) in order to receive table 55 code for a declined recurring transaction.
   * @return merchantAdviceCodeSupported
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Indicates if the merchant supports merchant advice code (MAC) in order to receive table 55 code for a declined recurring transaction.")

  public Boolean getMerchantAdviceCodeSupported() {
    return merchantAdviceCodeSupported;
  }



  public void setMerchantAdviceCodeSupported(Boolean merchantAdviceCodeSupported) {
    this.merchantAdviceCodeSupported = merchantAdviceCodeSupported;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstallmentOptions installmentOptions = (InstallmentOptions) o;
    return Objects.equals(this.numberOfInstallments, installmentOptions.numberOfInstallments) &&
        Objects.equals(this.installmentsInterest, installmentOptions.installmentsInterest) &&
        Objects.equals(this.installmentDelayMonths, installmentOptions.installmentDelayMonths) &&
        Objects.equals(this.recurringType, installmentOptions.recurringType) &&
        Objects.equals(this.merchantAdviceCodeSupported, installmentOptions.merchantAdviceCodeSupported);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numberOfInstallments, installmentsInterest, installmentDelayMonths, recurringType, merchantAdviceCodeSupported);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstallmentOptions {\n");
    sb.append("    numberOfInstallments: ").append(toIndentedString(numberOfInstallments)).append("\n");
    sb.append("    installmentsInterest: ").append(toIndentedString(installmentsInterest)).append("\n");
    sb.append("    installmentDelayMonths: ").append(toIndentedString(installmentDelayMonths)).append("\n");
    sb.append("    recurringType: ").append(toIndentedString(recurringType)).append("\n");
    sb.append("    merchantAdviceCodeSupported: ").append(toIndentedString(merchantAdviceCodeSupported)).append("\n");
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

