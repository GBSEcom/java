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
import com.github.GBSEcom.model.Amount;
import com.github.GBSEcom.model.Frequency;
import com.github.GBSEcom.model.PaymentMethodDetails;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Details about existing gateway schedule.
 */
@ApiModel(description = "Details about existing gateway schedule.")

public class RecurringPaymentDetails {
  public static final String SERIALIZED_NAME_STORE_ID = "storeId";
  @SerializedName(SERIALIZED_NAME_STORE_ID)
  private String storeId;

  public static final String SERIALIZED_NAME_PURCHASE_ORDER_NUMBER = "purchaseOrderNumber";
  @SerializedName(SERIALIZED_NAME_PURCHASE_ORDER_NUMBER)
  private String purchaseOrderNumber;

  public static final String SERIALIZED_NAME_INVOICE_NUMBER = "invoiceNumber";
  @SerializedName(SERIALIZED_NAME_INVOICE_NUMBER)
  private String invoiceNumber;

  public static final String SERIALIZED_NAME_CREATION_DATE = "creationDate";
  @SerializedName(SERIALIZED_NAME_CREATION_DATE)
  private String creationDate;

  public static final String SERIALIZED_NAME_START_DATE = "startDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private String startDate;

  public static final String SERIALIZED_NAME_NEXT_ATTEMPT_DATE = "nextAttemptDate";
  @SerializedName(SERIALIZED_NAME_NEXT_ATTEMPT_DATE)
  private String nextAttemptDate;

  public static final String SERIALIZED_NAME_TRANSACTION_AMOUNT = "transactionAmount";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_AMOUNT)
  private Amount transactionAmount;

  public static final String SERIALIZED_NAME_PAYMENT_METHOD_DETAILS = "paymentMethodDetails";
  @SerializedName(SERIALIZED_NAME_PAYMENT_METHOD_DETAILS)
  private PaymentMethodDetails paymentMethodDetails;

  public static final String SERIALIZED_NAME_FREQUENCY = "frequency";
  @SerializedName(SERIALIZED_NAME_FREQUENCY)
  private Frequency frequency;

  public static final String SERIALIZED_NAME_NUMBER_OF_PAYMENTS = "numberOfPayments";
  @SerializedName(SERIALIZED_NAME_NUMBER_OF_PAYMENTS)
  private Integer numberOfPayments;

  public static final String SERIALIZED_NAME_RUN_COUNT = "runCount";
  @SerializedName(SERIALIZED_NAME_RUN_COUNT)
  private Integer runCount;

  /**
   * State of the recurring payment.
   */
  @JsonAdapter(StateEnum.Adapter.class)
  public enum StateEnum {
    INSTALLED("Installed"),
    
    INACTIVATED("Inactivated"),
    
    CANCELLED("Cancelled");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StateEnum fromValue(String value) {
      for (StateEnum b : StateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StateEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StateEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private StateEnum state;

  public static final String SERIALIZED_NAME_COMMENTS = "comments";
  @SerializedName(SERIALIZED_NAME_COMMENTS)
  private String comments;


  public RecurringPaymentDetails storeId(String storeId) {
    
    this.storeId = storeId;
    return this;
  }

   /**
   * Store ID number.
   * @return storeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1109959991", value = "Store ID number.")

  public String getStoreId() {
    return storeId;
  }



  public void setStoreId(String storeId) {
    this.storeId = storeId;
  }


  public RecurringPaymentDetails purchaseOrderNumber(String purchaseOrderNumber) {
    
    this.purchaseOrderNumber = purchaseOrderNumber;
    return this;
  }

   /**
   * Purchase order number.
   * @return purchaseOrderNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123055342", value = "Purchase order number.")

  public String getPurchaseOrderNumber() {
    return purchaseOrderNumber;
  }



  public void setPurchaseOrderNumber(String purchaseOrderNumber) {
    this.purchaseOrderNumber = purchaseOrderNumber;
  }


  public RecurringPaymentDetails invoiceNumber(String invoiceNumber) {
    
    this.invoiceNumber = invoiceNumber;
    return this;
  }

   /**
   * Invoice number.
   * @return invoiceNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "96126098", value = "Invoice number.")

  public String getInvoiceNumber() {
    return invoiceNumber;
  }



  public void setInvoiceNumber(String invoiceNumber) {
    this.invoiceNumber = invoiceNumber;
  }


  public RecurringPaymentDetails creationDate(String creationDate) {
    
    this.creationDate = creationDate;
    return this;
  }

   /**
   * Date recurring payment was created.
   * @return creationDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2018-10-25", value = "Date recurring payment was created.")

  public String getCreationDate() {
    return creationDate;
  }



  public void setCreationDate(String creationDate) {
    this.creationDate = creationDate;
  }


  public RecurringPaymentDetails startDate(String startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * Date of mandate signature.
   * @return startDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2018-10-25", value = "Date of mandate signature.")

  public String getStartDate() {
    return startDate;
  }



  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }


  public RecurringPaymentDetails nextAttemptDate(String nextAttemptDate) {
    
    this.nextAttemptDate = nextAttemptDate;
    return this;
  }

   /**
   * Date of next transaction process attempt.
   * @return nextAttemptDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2018-10-25", value = "Date of next transaction process attempt.")

  public String getNextAttemptDate() {
    return nextAttemptDate;
  }



  public void setNextAttemptDate(String nextAttemptDate) {
    this.nextAttemptDate = nextAttemptDate;
  }


  public RecurringPaymentDetails transactionAmount(Amount transactionAmount) {
    
    this.transactionAmount = transactionAmount;
    return this;
  }

   /**
   * Get transactionAmount
   * @return transactionAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Amount getTransactionAmount() {
    return transactionAmount;
  }



  public void setTransactionAmount(Amount transactionAmount) {
    this.transactionAmount = transactionAmount;
  }


  public RecurringPaymentDetails paymentMethodDetails(PaymentMethodDetails paymentMethodDetails) {
    
    this.paymentMethodDetails = paymentMethodDetails;
    return this;
  }

   /**
   * Get paymentMethodDetails
   * @return paymentMethodDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PaymentMethodDetails getPaymentMethodDetails() {
    return paymentMethodDetails;
  }



  public void setPaymentMethodDetails(PaymentMethodDetails paymentMethodDetails) {
    this.paymentMethodDetails = paymentMethodDetails;
  }


  public RecurringPaymentDetails frequency(Frequency frequency) {
    
    this.frequency = frequency;
    return this;
  }

   /**
   * Get frequency
   * @return frequency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Frequency getFrequency() {
    return frequency;
  }



  public void setFrequency(Frequency frequency) {
    this.frequency = frequency;
  }


  public RecurringPaymentDetails numberOfPayments(Integer numberOfPayments) {
    
    this.numberOfPayments = numberOfPayments;
    return this;
  }

   /**
   * Number of times the recurring payment will process.
   * minimum: 1
   * maximum: 999
   * @return numberOfPayments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10", value = "Number of times the recurring payment will process.")

  public Integer getNumberOfPayments() {
    return numberOfPayments;
  }



  public void setNumberOfPayments(Integer numberOfPayments) {
    this.numberOfPayments = numberOfPayments;
  }


  public RecurringPaymentDetails runCount(Integer runCount) {
    
    this.runCount = runCount;
    return this;
  }

   /**
   * Times the recurring payment has already run.
   * minimum: 0
   * maximum: 999
   * @return runCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10", value = "Times the recurring payment has already run.")

  public Integer getRunCount() {
    return runCount;
  }



  public void setRunCount(Integer runCount) {
    this.runCount = runCount;
  }


  public RecurringPaymentDetails state(StateEnum state) {
    
    this.state = state;
    return this;
  }

   /**
   * State of the recurring payment.
   * @return state
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Installed", value = "State of the recurring payment.")

  public StateEnum getState() {
    return state;
  }



  public void setState(StateEnum state) {
    this.state = state;
  }


  public RecurringPaymentDetails comments(String comments) {
    
    this.comments = comments;
    return this;
  }

   /**
   * User supplied comments.
   * @return comments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "This scheduled payment series is to pay for the thing.", value = "User supplied comments.")

  public String getComments() {
    return comments;
  }



  public void setComments(String comments) {
    this.comments = comments;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecurringPaymentDetails recurringPaymentDetails = (RecurringPaymentDetails) o;
    return Objects.equals(this.storeId, recurringPaymentDetails.storeId) &&
        Objects.equals(this.purchaseOrderNumber, recurringPaymentDetails.purchaseOrderNumber) &&
        Objects.equals(this.invoiceNumber, recurringPaymentDetails.invoiceNumber) &&
        Objects.equals(this.creationDate, recurringPaymentDetails.creationDate) &&
        Objects.equals(this.startDate, recurringPaymentDetails.startDate) &&
        Objects.equals(this.nextAttemptDate, recurringPaymentDetails.nextAttemptDate) &&
        Objects.equals(this.transactionAmount, recurringPaymentDetails.transactionAmount) &&
        Objects.equals(this.paymentMethodDetails, recurringPaymentDetails.paymentMethodDetails) &&
        Objects.equals(this.frequency, recurringPaymentDetails.frequency) &&
        Objects.equals(this.numberOfPayments, recurringPaymentDetails.numberOfPayments) &&
        Objects.equals(this.runCount, recurringPaymentDetails.runCount) &&
        Objects.equals(this.state, recurringPaymentDetails.state) &&
        Objects.equals(this.comments, recurringPaymentDetails.comments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(storeId, purchaseOrderNumber, invoiceNumber, creationDate, startDate, nextAttemptDate, transactionAmount, paymentMethodDetails, frequency, numberOfPayments, runCount, state, comments);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecurringPaymentDetails {\n");
    sb.append("    storeId: ").append(toIndentedString(storeId)).append("\n");
    sb.append("    purchaseOrderNumber: ").append(toIndentedString(purchaseOrderNumber)).append("\n");
    sb.append("    invoiceNumber: ").append(toIndentedString(invoiceNumber)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    nextAttemptDate: ").append(toIndentedString(nextAttemptDate)).append("\n");
    sb.append("    transactionAmount: ").append(toIndentedString(transactionAmount)).append("\n");
    sb.append("    paymentMethodDetails: ").append(toIndentedString(paymentMethodDetails)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    numberOfPayments: ").append(toIndentedString(numberOfPayments)).append("\n");
    sb.append("    runCount: ").append(toIndentedString(runCount)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
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

