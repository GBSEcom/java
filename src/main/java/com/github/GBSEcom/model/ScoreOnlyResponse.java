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
import com.github.GBSEcom.model.ScoreOnlyResponseFraudScore;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Fraud detect response.
 */
@ApiModel(description = "Fraud detect response.")

public class ScoreOnlyResponse {
  public static final String SERIALIZED_NAME_API_TRACE_ID = "apiTraceId";
  @SerializedName(SERIALIZED_NAME_API_TRACE_ID)
  private String apiTraceId;

  /**
   * Please refer to \&quot;Errors Section\&quot; for more info.
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

    public static TransactionStatusEnum fromValue(String text) {
      for (TransactionStatusEnum b : TransactionStatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }

    public static class Adapter extends TypeAdapter<TransactionStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TransactionStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TransactionStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TransactionStatusEnum.fromValue(String.valueOf(value));
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
  private ScoreOnlyResponseFraudScore fraudScore = null;

  public static final String SERIALIZED_NAME_RECOMMENDED_DECISION = "recommendedDecision";
  @SerializedName(SERIALIZED_NAME_RECOMMENDED_DECISION)
  private String recommendedDecision;

  public ScoreOnlyResponse apiTraceId(String apiTraceId) {
    this.apiTraceId = apiTraceId;
    return this;
  }

   /**
   * Unique trace ID for issue triage.
   * @return apiTraceId
  **/
  @ApiModelProperty(example = "968a1915-210c-4157-a456-98e4773a1124", value = "Unique trace ID for issue triage.")
  public String getApiTraceId() {
    return apiTraceId;
  }

  public void setApiTraceId(String apiTraceId) {
    this.apiTraceId = apiTraceId;
  }

  public ScoreOnlyResponse transactionStatus(TransactionStatusEnum transactionStatus) {
    this.transactionStatus = transactionStatus;
    return this;
  }

   /**
   * Please refer to \&quot;Errors Section\&quot; for more info.
   * @return transactionStatus
  **/
  @ApiModelProperty(example = "Not Processed", value = "Please refer to \"Errors Section\" for more info.")
  public TransactionStatusEnum getTransactionStatus() {
    return transactionStatus;
  }

  public void setTransactionStatus(TransactionStatusEnum transactionStatus) {
    this.transactionStatus = transactionStatus;
  }

  public ScoreOnlyResponse validationStatus(String validationStatus) {
    this.validationStatus = validationStatus;
    return this;
  }

   /**
   * If status returned is \&quot;failure\&quot;, input validation errors occurred. Please refer to the \&quot;Errors Section\&quot; for more info. Valid values are &#39;success&#39; and &#39;failure&#39;.
   * @return validationStatus
  **/
  @ApiModelProperty(example = "success", value = "If status returned is \"failure\", input validation errors occurred. Please refer to the \"Errors Section\" for more info. Valid values are 'success' and 'failure'.")
  public String getValidationStatus() {
    return validationStatus;
  }

  public void setValidationStatus(String validationStatus) {
    this.validationStatus = validationStatus;
  }

  public ScoreOnlyResponse transactionType(String transactionType) {
    this.transactionType = transactionType;
    return this;
  }

   /**
   * The transactionType provided in request.
   * @return transactionType
  **/
  @ApiModelProperty(example = "transaction/authorization", value = "The transactionType provided in request.")
  public String getTransactionType() {
    return transactionType;
  }

  public void setTransactionType(String transactionType) {
    this.transactionType = transactionType;
  }

  public ScoreOnlyResponse fraudScore(ScoreOnlyResponseFraudScore fraudScore) {
    this.fraudScore = fraudScore;
    return this;
  }

   /**
   * Get fraudScore
   * @return fraudScore
  **/
  @ApiModelProperty(value = "")
  public ScoreOnlyResponseFraudScore getFraudScore() {
    return fraudScore;
  }

  public void setFraudScore(ScoreOnlyResponseFraudScore fraudScore) {
    this.fraudScore = fraudScore;
  }

  public ScoreOnlyResponse recommendedDecision(String recommendedDecision) {
    this.recommendedDecision = recommendedDecision;
    return this;
  }

   /**
   * The action that should be taken for the request that was sent.
   * @return recommendedDecision
  **/
  @ApiModelProperty(example = "accept", value = "The action that should be taken for the request that was sent.")
  public String getRecommendedDecision() {
    return recommendedDecision;
  }

  public void setRecommendedDecision(String recommendedDecision) {
    this.recommendedDecision = recommendedDecision;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScoreOnlyResponse scoreOnlyResponse = (ScoreOnlyResponse) o;
    return Objects.equals(this.apiTraceId, scoreOnlyResponse.apiTraceId) &&
        Objects.equals(this.transactionStatus, scoreOnlyResponse.transactionStatus) &&
        Objects.equals(this.validationStatus, scoreOnlyResponse.validationStatus) &&
        Objects.equals(this.transactionType, scoreOnlyResponse.transactionType) &&
        Objects.equals(this.fraudScore, scoreOnlyResponse.fraudScore) &&
        Objects.equals(this.recommendedDecision, scoreOnlyResponse.recommendedDecision);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiTraceId, transactionStatus, validationStatus, transactionType, fraudScore, recommendedDecision);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScoreOnlyResponse {\n");
    
    sb.append("    apiTraceId: ").append(toIndentedString(apiTraceId)).append("\n");
    sb.append("    transactionStatus: ").append(toIndentedString(transactionStatus)).append("\n");
    sb.append("    validationStatus: ").append(toIndentedString(validationStatus)).append("\n");
    sb.append("    transactionType: ").append(toIndentedString(transactionType)).append("\n");
    sb.append("    fraudScore: ").append(toIndentedString(fraudScore)).append("\n");
    sb.append("    recommendedDecision: ").append(toIndentedString(recommendedDecision)).append("\n");
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

