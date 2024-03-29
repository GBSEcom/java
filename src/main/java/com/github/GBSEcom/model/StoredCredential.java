/*
 * Payment Gateway API Specification.
 * The documentation here is designed to provide all of the technical guidance required to consume and integrate with our APIs for payment processing. To learn more about our APIs please visit https://docs.firstdata.com/org/gateway.
 *
 * The version of the OpenAPI document: 21.5.0.20211029.001
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
 * Object for sending stored credentials.
 */
@ApiModel(description = "Object for sending stored credentials.")

public class StoredCredential {
  /**
   * Indicates if the transaction is first or subsequent. Valid values are &#39;FIRST&#39; and &#39;SUBSEQUENT&#39;.
   */
  @JsonAdapter(SequenceEnum.Adapter.class)
  public enum SequenceEnum {
    FIRST("FIRST"),
    
    SUBSEQUENT("SUBSEQUENT");

    private String value;

    SequenceEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SequenceEnum fromValue(String value) {
      for (SequenceEnum b : SequenceEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<SequenceEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SequenceEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SequenceEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return SequenceEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SEQUENCE = "sequence";
  @SerializedName(SERIALIZED_NAME_SEQUENCE)
  private SequenceEnum sequence;

  public static final String SERIALIZED_NAME_SCHEDULED = "scheduled";
  @SerializedName(SERIALIZED_NAME_SCHEDULED)
  private Boolean scheduled;

  public static final String SERIALIZED_NAME_REFERENCED_SCHEME_TRANSACTION_ID = "referencedSchemeTransactionId";
  @SerializedName(SERIALIZED_NAME_REFERENCED_SCHEME_TRANSACTION_ID)
  private String referencedSchemeTransactionId;

  /**
   * Indicates whether it is a merchant-initiated or explicitly consented to by card holder. Valid values are &#39;MERCHANT&#39; and &#39;CARDHOLDER&#39;.
   */
  @JsonAdapter(InitiatorEnum.Adapter.class)
  public enum InitiatorEnum {
    MERCHANT("MERCHANT"),
    
    CARDHOLDER("CARDHOLDER");

    private String value;

    InitiatorEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static InitiatorEnum fromValue(String value) {
      for (InitiatorEnum b : InitiatorEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<InitiatorEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final InitiatorEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public InitiatorEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return InitiatorEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_INITIATOR = "initiator";
  @SerializedName(SERIALIZED_NAME_INITIATOR)
  private InitiatorEnum initiator;


  public StoredCredential sequence(SequenceEnum sequence) {
    
    this.sequence = sequence;
    return this;
  }

   /**
   * Indicates if the transaction is first or subsequent. Valid values are &#39;FIRST&#39; and &#39;SUBSEQUENT&#39;.
   * @return sequence
  **/
  @ApiModelProperty(example = "FIRST", required = true, value = "Indicates if the transaction is first or subsequent. Valid values are 'FIRST' and 'SUBSEQUENT'.")

  public SequenceEnum getSequence() {
    return sequence;
  }



  public void setSequence(SequenceEnum sequence) {
    this.sequence = sequence;
  }


  public StoredCredential scheduled(Boolean scheduled) {
    
    this.scheduled = scheduled;
    return this;
  }

   /**
   * Indicates if the transaction is scheduled or part of an installment.
   * @return scheduled
  **/
  @ApiModelProperty(example = "true", required = true, value = "Indicates if the transaction is scheduled or part of an installment.")

  public Boolean getScheduled() {
    return scheduled;
  }



  public void setScheduled(Boolean scheduled) {
    this.scheduled = scheduled;
  }


  public StoredCredential referencedSchemeTransactionId(String referencedSchemeTransactionId) {
    
    this.referencedSchemeTransactionId = referencedSchemeTransactionId;
    return this;
  }

   /**
   * The transaction ID received from schemes for the initial transaction. May be required if sequence is &#39;SUBSEQUENT&#39;.
   * @return referencedSchemeTransactionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "019087868716215", value = "The transaction ID received from schemes for the initial transaction. May be required if sequence is 'SUBSEQUENT'.")

  public String getReferencedSchemeTransactionId() {
    return referencedSchemeTransactionId;
  }



  public void setReferencedSchemeTransactionId(String referencedSchemeTransactionId) {
    this.referencedSchemeTransactionId = referencedSchemeTransactionId;
  }


  public StoredCredential initiator(InitiatorEnum initiator) {
    
    this.initiator = initiator;
    return this;
  }

   /**
   * Indicates whether it is a merchant-initiated or explicitly consented to by card holder. Valid values are &#39;MERCHANT&#39; and &#39;CARDHOLDER&#39;.
   * @return initiator
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "MERCHANT", value = "Indicates whether it is a merchant-initiated or explicitly consented to by card holder. Valid values are 'MERCHANT' and 'CARDHOLDER'.")

  public InitiatorEnum getInitiator() {
    return initiator;
  }



  public void setInitiator(InitiatorEnum initiator) {
    this.initiator = initiator;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StoredCredential storedCredential = (StoredCredential) o;
    return Objects.equals(this.sequence, storedCredential.sequence) &&
        Objects.equals(this.scheduled, storedCredential.scheduled) &&
        Objects.equals(this.referencedSchemeTransactionId, storedCredential.referencedSchemeTransactionId) &&
        Objects.equals(this.initiator, storedCredential.initiator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sequence, scheduled, referencedSchemeTransactionId, initiator);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StoredCredential {\n");
    sb.append("    sequence: ").append(toIndentedString(sequence)).append("\n");
    sb.append("    scheduled: ").append(toIndentedString(scheduled)).append("\n");
    sb.append("    referencedSchemeTransactionId: ").append(toIndentedString(referencedSchemeTransactionId)).append("\n");
    sb.append("    initiator: ").append(toIndentedString(initiator)).append("\n");
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

