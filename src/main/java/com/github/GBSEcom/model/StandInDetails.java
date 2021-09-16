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
 * Indicates standin transaction.
 */
@ApiModel(description = "Indicates standin transaction.")

public class StandInDetails {
  /**
   * Indicates standin instruction type.
   */
  @JsonAdapter(StandInTypeEnum.Adapter.class)
  public enum StandInTypeEnum {
    FIXED_AMOUNT("FIXED_AMOUNT"),
    
    MAXIMUM_AMOUNT("MAXIMUM_AMOUNT");

    private String value;

    StandInTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StandInTypeEnum fromValue(String value) {
      for (StandInTypeEnum b : StandInTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StandInTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StandInTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StandInTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StandInTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STAND_IN_TYPE = "standInType";
  @SerializedName(SERIALIZED_NAME_STAND_IN_TYPE)
  private StandInTypeEnum standInType;

  public static final String SERIALIZED_NAME_NUMBER_OF_DEBITS = "numberOfDebits";
  @SerializedName(SERIALIZED_NAME_NUMBER_OF_DEBITS)
  private String numberOfDebits;

  public static final String SERIALIZED_NAME_SI_VALIDATED = "siValidated";
  @SerializedName(SERIALIZED_NAME_SI_VALIDATED)
  private Boolean siValidated;

  public static final String SERIALIZED_NAME_MAXIMUM_TRANSACTION_AMOUNT = "maximumTransactionAmount";
  @SerializedName(SERIALIZED_NAME_MAXIMUM_TRANSACTION_AMOUNT)
  private BigDecimal maximumTransactionAmount;

  public static final String SERIALIZED_NAME_SI_HUB_ID = "siHubId";
  @SerializedName(SERIALIZED_NAME_SI_HUB_ID)
  private String siHubId;

  /**
   * Indicates frequency of the standin instruction debit.
   */
  @JsonAdapter(FrequencyEnum.Adapter.class)
  public enum FrequencyEnum {
    WEEKLY("WEEKLY"),
    
    FORTNIGHTLY("FORTNIGHTLY"),
    
    MONTHLY("MONTHLY"),
    
    QUARTERLY("QUARTERLY"),
    
    HALFYEARLY("HALFYEARLY"),
    
    YEARLY("YEARLY"),
    
    UNSCHEDULED("UNSCHEDULED");

    private String value;

    FrequencyEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FrequencyEnum fromValue(String value) {
      for (FrequencyEnum b : FrequencyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<FrequencyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FrequencyEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FrequencyEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return FrequencyEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_FREQUENCY = "frequency";
  @SerializedName(SERIALIZED_NAME_FREQUENCY)
  private FrequencyEnum frequency;


  public StandInDetails standInType(StandInTypeEnum standInType) {
    
    this.standInType = standInType;
    return this;
  }

   /**
   * Indicates standin instruction type.
   * @return standInType
  **/
  @ApiModelProperty(example = "FIXED_AMOUNT", required = true, value = "Indicates standin instruction type.")

  public StandInTypeEnum getStandInType() {
    return standInType;
  }



  public void setStandInType(StandInTypeEnum standInType) {
    this.standInType = standInType;
  }


  public StandInDetails numberOfDebits(String numberOfDebits) {
    
    this.numberOfDebits = numberOfDebits;
    return this;
  }

   /**
   * Indicates number of standin instruction debits.Possible values can be two digit number or UN (Until it is cancelled) or ND (Not defined).
   * @return numberOfDebits
  **/
  @ApiModelProperty(example = "12", required = true, value = "Indicates number of standin instruction debits.Possible values can be two digit number or UN (Until it is cancelled) or ND (Not defined).")

  public String getNumberOfDebits() {
    return numberOfDebits;
  }



  public void setNumberOfDebits(String numberOfDebits) {
    this.numberOfDebits = numberOfDebits;
  }


  public StandInDetails siValidated(Boolean siValidated) {
    
    this.siValidated = siValidated;
    return this;
  }

   /**
   * Indicates standin instruction validation flag, it can be true or false. \&quot;false\&quot; - Not validated, \&quot;true\&quot; - Validated.
   * @return siValidated
  **/
  @ApiModelProperty(example = "true", required = true, value = "Indicates standin instruction validation flag, it can be true or false. \"false\" - Not validated, \"true\" - Validated.")

  public Boolean getSiValidated() {
    return siValidated;
  }



  public void setSiValidated(Boolean siValidated) {
    this.siValidated = siValidated;
  }


  public StandInDetails maximumTransactionAmount(BigDecimal maximumTransactionAmount) {
    
    this.maximumTransactionAmount = maximumTransactionAmount;
    return this;
  }

   /**
   * Maximum debit amount per standin instruction transaction.
   * @return maximumTransactionAmount
  **/
  @ApiModelProperty(example = "1800", required = true, value = "Maximum debit amount per standin instruction transaction.")

  public BigDecimal getMaximumTransactionAmount() {
    return maximumTransactionAmount;
  }



  public void setMaximumTransactionAmount(BigDecimal maximumTransactionAmount) {
    this.maximumTransactionAmount = maximumTransactionAmount;
  }


  public StandInDetails siHubId(String siHubId) {
    
    this.siHubId = siHubId;
    return this;
  }

   /**
   * Unique identifier for standin instruction.
   * @return siHubId
  **/
  @ApiModelProperty(example = "Y3PCO6QGHT", required = true, value = "Unique identifier for standin instruction.")

  public String getSiHubId() {
    return siHubId;
  }



  public void setSiHubId(String siHubId) {
    this.siHubId = siHubId;
  }


  public StandInDetails frequency(FrequencyEnum frequency) {
    
    this.frequency = frequency;
    return this;
  }

   /**
   * Indicates frequency of the standin instruction debit.
   * @return frequency
  **/
  @ApiModelProperty(example = "MONTHLY", required = true, value = "Indicates frequency of the standin instruction debit.")

  public FrequencyEnum getFrequency() {
    return frequency;
  }



  public void setFrequency(FrequencyEnum frequency) {
    this.frequency = frequency;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StandInDetails standInDetails = (StandInDetails) o;
    return Objects.equals(this.standInType, standInDetails.standInType) &&
        Objects.equals(this.numberOfDebits, standInDetails.numberOfDebits) &&
        Objects.equals(this.siValidated, standInDetails.siValidated) &&
        Objects.equals(this.maximumTransactionAmount, standInDetails.maximumTransactionAmount) &&
        Objects.equals(this.siHubId, standInDetails.siHubId) &&
        Objects.equals(this.frequency, standInDetails.frequency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(standInType, numberOfDebits, siValidated, maximumTransactionAmount, siHubId, frequency);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StandInDetails {\n");
    sb.append("    standInType: ").append(toIndentedString(standInType)).append("\n");
    sb.append("    numberOfDebits: ").append(toIndentedString(numberOfDebits)).append("\n");
    sb.append("    siValidated: ").append(toIndentedString(siValidated)).append("\n");
    sb.append("    maximumTransactionAmount: ").append(toIndentedString(maximumTransactionAmount)).append("\n");
    sb.append("    siHubId: ").append(toIndentedString(siHubId)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
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

