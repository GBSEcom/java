/*
 * Payment Gateway API Specification.
 * The documentation here is designed to provide all of the technical guidance required to consume and integrate with our APIs for payment processing. To learn more about our APIs please visit https://docs.firstdata.com/org/gateway.
 *
 * The version of the OpenAPI document: 6.14.0.20201015.001
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.github.GBSEcom.model;

import java.util.Objects;
import java.util.Arrays;
import com.github.GBSEcom.model.FraudRegistrationError;
import com.github.GBSEcom.model.FraudScore;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * FraudRegistrationResponse
 */

public class FraudRegistrationResponse {
  public static final String SERIALIZED_NAME_CORRELATION_ID = "correlationId";
  @SerializedName(SERIALIZED_NAME_CORRELATION_ID)
  private String correlationId;

  /**
   * Status of the transaction. Valid values are &#39;Not Processed&#39; and &#39;Scored successfully&#39;
   */
  @JsonAdapter(TransactionStatusEnum.Adapter.class)
  public enum TransactionStatusEnum {
    SCORED_SUCCESSFULLY("Scored Successfully"),
    
    NOT_PROCESSED("Not Processed");

    private String value;

    TransactionStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TransactionStatusEnum fromValue(String value) {
      for (TransactionStatusEnum b : TransactionStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TransactionStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TransactionStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TransactionStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TransactionStatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TRANSACTION_STATUS = "transactionStatus";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_STATUS)
  private TransactionStatusEnum transactionStatus;

  public static final String SERIALIZED_NAME_VALIDATION_STATUS = "validationStatus";
  @SerializedName(SERIALIZED_NAME_VALIDATION_STATUS)
  private String validationStatus;

  public static final String SERIALIZED_NAME_TRANSACTION_TYPE = "transactionType";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_TYPE)
  private String transactionType;

  public static final String SERIALIZED_NAME_FRAUD_SCORE = "fraudScore";
  @SerializedName(SERIALIZED_NAME_FRAUD_SCORE)
  private FraudScore fraudScore;

  public static final String SERIALIZED_NAME_ERROR = "Error";
  @SerializedName(SERIALIZED_NAME_ERROR)
  private FraudRegistrationError error;


  public FraudRegistrationResponse correlationId(String correlationId) {
    
    this.correlationId = correlationId;
    return this;
  }

   /**
   * The value used to track the transaction.
   * @return correlationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "228.6277057434761", value = "The value used to track the transaction.")

  public String getCorrelationId() {
    return correlationId;
  }



  public void setCorrelationId(String correlationId) {
    this.correlationId = correlationId;
  }


  public FraudRegistrationResponse transactionStatus(TransactionStatusEnum transactionStatus) {
    
    this.transactionStatus = transactionStatus;
    return this;
  }

   /**
   * Status of the transaction. Valid values are &#39;Not Processed&#39; and &#39;Scored successfully&#39;
   * @return transactionStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Not Processed", value = "Status of the transaction. Valid values are 'Not Processed' and 'Scored successfully'")

  public TransactionStatusEnum getTransactionStatus() {
    return transactionStatus;
  }



  public void setTransactionStatus(TransactionStatusEnum transactionStatus) {
    this.transactionStatus = transactionStatus;
  }


  public FraudRegistrationResponse validationStatus(String validationStatus) {
    
    this.validationStatus = validationStatus;
    return this;
  }

   /**
   * If status returned is \&quot;failure\&quot;, input validation errors occurred. Please refer to the \&quot;Errors Section\&quot; for more info. Valid values are &#39;success&#39; and &#39;failed&#39;.
   * @return validationStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "success", value = "If status returned is \"failure\", input validation errors occurred. Please refer to the \"Errors Section\" for more info. Valid values are 'success' and 'failed'.")

  public String getValidationStatus() {
    return validationStatus;
  }



  public void setValidationStatus(String validationStatus) {
    this.validationStatus = validationStatus;
  }


  public FraudRegistrationResponse transactionType(String transactionType) {
    
    this.transactionType = transactionType;
    return this;
  }

   /**
   * The transactionType provided in request.
   * @return transactionType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "registration", value = "The transactionType provided in request.")

  public String getTransactionType() {
    return transactionType;
  }



  public void setTransactionType(String transactionType) {
    this.transactionType = transactionType;
  }


  public FraudRegistrationResponse fraudScore(FraudScore fraudScore) {
    
    this.fraudScore = fraudScore;
    return this;
  }

   /**
   * Get fraudScore
   * @return fraudScore
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FraudScore getFraudScore() {
    return fraudScore;
  }



  public void setFraudScore(FraudScore fraudScore) {
    this.fraudScore = fraudScore;
  }


  public FraudRegistrationResponse error(FraudRegistrationError error) {
    
    this.error = error;
    return this;
  }

   /**
   * Get error
   * @return error
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FraudRegistrationError getError() {
    return error;
  }



  public void setError(FraudRegistrationError error) {
    this.error = error;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FraudRegistrationResponse fraudRegistrationResponse = (FraudRegistrationResponse) o;
    return Objects.equals(this.correlationId, fraudRegistrationResponse.correlationId) &&
        Objects.equals(this.transactionStatus, fraudRegistrationResponse.transactionStatus) &&
        Objects.equals(this.validationStatus, fraudRegistrationResponse.validationStatus) &&
        Objects.equals(this.transactionType, fraudRegistrationResponse.transactionType) &&
        Objects.equals(this.fraudScore, fraudRegistrationResponse.fraudScore) &&
        Objects.equals(this.error, fraudRegistrationResponse.error);
  }

  @Override
  public int hashCode() {
    return Objects.hash(correlationId, transactionStatus, validationStatus, transactionType, fraudScore, error);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FraudRegistrationResponse {\n");
    sb.append("    correlationId: ").append(toIndentedString(correlationId)).append("\n");
    sb.append("    transactionStatus: ").append(toIndentedString(transactionStatus)).append("\n");
    sb.append("    validationStatus: ").append(toIndentedString(validationStatus)).append("\n");
    sb.append("    transactionType: ").append(toIndentedString(transactionType)).append("\n");
    sb.append("    fraudScore: ").append(toIndentedString(fraudScore)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
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

