/*
 * Payment Gateway API Specification
 * Payment Gateway API for payment processing. 
 *
 * OpenAPI spec version: 0.0.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.firstdata.firstapi.model;

import java.util.Objects;
import com.firstdata.firstapi.model.Amount;
import com.firstdata.firstapi.model.ClientLocale;
import com.firstdata.firstapi.model.Frequency;
import com.firstdata.firstapi.model.PaymentMethod;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.LocalDate;

/**
 * Request to create a gateway scheduler.
 */
@ApiModel(description = "Request to create a gateway scheduler.")

public class PaymentSchedulesRequest {
  @SerializedName("storeId")
  private String storeId = null;

  @SerializedName("referenceOrderId")
  private String referenceOrderId = null;

  @SerializedName("startDate")
  private LocalDate startDate = null;

  @SerializedName("numberOfPayments")
  private Integer numberOfPayments = null;

  @SerializedName("maximumFailures")
  private Integer maximumFailures = null;

  @SerializedName("invoiceNumber")
  private String invoiceNumber = null;

  @SerializedName("poNumber")
  private String poNumber = null;

  /**
   * The source of the transaction. The possible values are ECI (if the order was received via email or Internet), MOTO (mail order / telephone order) and RETAIL (face to face).
   */
  @JsonAdapter(TransactionOriginEnum.Adapter.class)
  public enum TransactionOriginEnum {
    ECI("ECI"),
    
    MOTO("MOTO"),
    
    RETAIL("RETAIL");

    private String value;

    TransactionOriginEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TransactionOriginEnum fromValue(String text) {
      for (TransactionOriginEnum b : TransactionOriginEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TransactionOriginEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TransactionOriginEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TransactionOriginEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TransactionOriginEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("transactionOrigin")
  private TransactionOriginEnum transactionOrigin = null;

  @SerializedName("dynamicMerchantName")
  private String dynamicMerchantName = null;

  @SerializedName("frequency")
  private Frequency frequency = null;

  @SerializedName("paymentMethod")
  private PaymentMethod paymentMethod = null;

  @SerializedName("amount")
  private Amount amount = null;

  @SerializedName("clientLocale")
  private ClientLocale clientLocale = null;

  @SerializedName("orderId")
  private String orderId = null;

  public PaymentSchedulesRequest storeId(String storeId) {
    this.storeId = storeId;
    return this;
  }

   /**
   * Store ID number.
   * @return storeId
  **/
  @ApiModelProperty(example = "1109959991", value = "Store ID number.")
  public String getStoreId() {
    return storeId;
  }

  public void setStoreId(String storeId) {
    this.storeId = storeId;
  }

  public PaymentSchedulesRequest referenceOrderId(String referenceOrderId) {
    this.referenceOrderId = referenceOrderId;
    return this;
  }

   /**
   * Order ID used to create recurring payment from existing transaction.
   * @return referenceOrderId
  **/
  @ApiModelProperty(example = "R-f9c2c198-b7cc-491a-a711-93d22fd0e589", value = "Order ID used to create recurring payment from existing transaction.")
  public String getReferenceOrderId() {
    return referenceOrderId;
  }

  public void setReferenceOrderId(String referenceOrderId) {
    this.referenceOrderId = referenceOrderId;
  }

  public PaymentSchedulesRequest startDate(LocalDate startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Date of mandate signature.
   * @return startDate
  **/
  @ApiModelProperty(example = "2018-10-25", value = "Date of mandate signature.")
  public LocalDate getStartDate() {
    return startDate;
  }

  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }

  public PaymentSchedulesRequest numberOfPayments(Integer numberOfPayments) {
    this.numberOfPayments = numberOfPayments;
    return this;
  }

   /**
   * Number of times the recurring payment will process.
   * minimum: 1
   * maximum: 999
   * @return numberOfPayments
  **/
  @ApiModelProperty(example = "10", value = "Number of times the recurring payment will process.")
  public Integer getNumberOfPayments() {
    return numberOfPayments;
  }

  public void setNumberOfPayments(Integer numberOfPayments) {
    this.numberOfPayments = numberOfPayments;
  }

  public PaymentSchedulesRequest maximumFailures(Integer maximumFailures) {
    this.maximumFailures = maximumFailures;
    return this;
  }

   /**
   * Number of failures that can be encountered before re-tries cease.
   * minimum: 1
   * maximum: 999
   * @return maximumFailures
  **/
  @ApiModelProperty(example = "1", value = "Number of failures that can be encountered before re-tries cease.")
  public Integer getMaximumFailures() {
    return maximumFailures;
  }

  public void setMaximumFailures(Integer maximumFailures) {
    this.maximumFailures = maximumFailures;
  }

  public PaymentSchedulesRequest invoiceNumber(String invoiceNumber) {
    this.invoiceNumber = invoiceNumber;
    return this;
  }

   /**
   * Invoice number.
   * @return invoiceNumber
  **/
  @ApiModelProperty(example = "96126098", value = "Invoice number.")
  public String getInvoiceNumber() {
    return invoiceNumber;
  }

  public void setInvoiceNumber(String invoiceNumber) {
    this.invoiceNumber = invoiceNumber;
  }

  public PaymentSchedulesRequest poNumber(String poNumber) {
    this.poNumber = poNumber;
    return this;
  }

   /**
   * Purchase order number.
   * @return poNumber
  **/
  @ApiModelProperty(example = "123055342", value = "Purchase order number.")
  public String getPoNumber() {
    return poNumber;
  }

  public void setPoNumber(String poNumber) {
    this.poNumber = poNumber;
  }

  public PaymentSchedulesRequest transactionOrigin(TransactionOriginEnum transactionOrigin) {
    this.transactionOrigin = transactionOrigin;
    return this;
  }

   /**
   * The source of the transaction. The possible values are ECI (if the order was received via email or Internet), MOTO (mail order / telephone order) and RETAIL (face to face).
   * @return transactionOrigin
  **/
  @ApiModelProperty(example = "ECI", value = "The source of the transaction. The possible values are ECI (if the order was received via email or Internet), MOTO (mail order / telephone order) and RETAIL (face to face).")
  public TransactionOriginEnum getTransactionOrigin() {
    return transactionOrigin;
  }

  public void setTransactionOrigin(TransactionOriginEnum transactionOrigin) {
    this.transactionOrigin = transactionOrigin;
  }

  public PaymentSchedulesRequest dynamicMerchantName(String dynamicMerchantName) {
    this.dynamicMerchantName = dynamicMerchantName;
    return this;
  }

   /**
   * Dynamic merchant name for the cardholder‘s statement.
   * @return dynamicMerchantName
  **/
  @ApiModelProperty(example = "MyWebsite", value = "Dynamic merchant name for the cardholder‘s statement.")
  public String getDynamicMerchantName() {
    return dynamicMerchantName;
  }

  public void setDynamicMerchantName(String dynamicMerchantName) {
    this.dynamicMerchantName = dynamicMerchantName;
  }

  public PaymentSchedulesRequest frequency(Frequency frequency) {
    this.frequency = frequency;
    return this;
  }

   /**
   * Get frequency
   * @return frequency
  **/
  @ApiModelProperty(value = "")
  public Frequency getFrequency() {
    return frequency;
  }

  public void setFrequency(Frequency frequency) {
    this.frequency = frequency;
  }

  public PaymentSchedulesRequest paymentMethod(PaymentMethod paymentMethod) {
    this.paymentMethod = paymentMethod;
    return this;
  }

   /**
   * Get paymentMethod
   * @return paymentMethod
  **/
  @ApiModelProperty(value = "")
  public PaymentMethod getPaymentMethod() {
    return paymentMethod;
  }

  public void setPaymentMethod(PaymentMethod paymentMethod) {
    this.paymentMethod = paymentMethod;
  }

  public PaymentSchedulesRequest amount(Amount amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(value = "")
  public Amount getAmount() {
    return amount;
  }

  public void setAmount(Amount amount) {
    this.amount = amount;
  }

  public PaymentSchedulesRequest clientLocale(ClientLocale clientLocale) {
    this.clientLocale = clientLocale;
    return this;
  }

   /**
   * Get clientLocale
   * @return clientLocale
  **/
  @ApiModelProperty(value = "")
  public ClientLocale getClientLocale() {
    return clientLocale;
  }

  public void setClientLocale(ClientLocale clientLocale) {
    this.clientLocale = clientLocale;
  }

  public PaymentSchedulesRequest orderId(String orderId) {
    this.orderId = orderId;
    return this;
  }

   /**
   * Client Order ID if supplied by client.
   * @return orderId
  **/
  @ApiModelProperty(example = "123456", value = "Client Order ID if supplied by client.")
  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentSchedulesRequest paymentSchedulesRequest = (PaymentSchedulesRequest) o;
    return Objects.equals(this.storeId, paymentSchedulesRequest.storeId) &&
        Objects.equals(this.referenceOrderId, paymentSchedulesRequest.referenceOrderId) &&
        Objects.equals(this.startDate, paymentSchedulesRequest.startDate) &&
        Objects.equals(this.numberOfPayments, paymentSchedulesRequest.numberOfPayments) &&
        Objects.equals(this.maximumFailures, paymentSchedulesRequest.maximumFailures) &&
        Objects.equals(this.invoiceNumber, paymentSchedulesRequest.invoiceNumber) &&
        Objects.equals(this.poNumber, paymentSchedulesRequest.poNumber) &&
        Objects.equals(this.transactionOrigin, paymentSchedulesRequest.transactionOrigin) &&
        Objects.equals(this.dynamicMerchantName, paymentSchedulesRequest.dynamicMerchantName) &&
        Objects.equals(this.frequency, paymentSchedulesRequest.frequency) &&
        Objects.equals(this.paymentMethod, paymentSchedulesRequest.paymentMethod) &&
        Objects.equals(this.amount, paymentSchedulesRequest.amount) &&
        Objects.equals(this.clientLocale, paymentSchedulesRequest.clientLocale) &&
        Objects.equals(this.orderId, paymentSchedulesRequest.orderId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(storeId, referenceOrderId, startDate, numberOfPayments, maximumFailures, invoiceNumber, poNumber, transactionOrigin, dynamicMerchantName, frequency, paymentMethod, amount, clientLocale, orderId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentSchedulesRequest {\n");
    
    sb.append("    storeId: ").append(toIndentedString(storeId)).append("\n");
    sb.append("    referenceOrderId: ").append(toIndentedString(referenceOrderId)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    numberOfPayments: ").append(toIndentedString(numberOfPayments)).append("\n");
    sb.append("    maximumFailures: ").append(toIndentedString(maximumFailures)).append("\n");
    sb.append("    invoiceNumber: ").append(toIndentedString(invoiceNumber)).append("\n");
    sb.append("    poNumber: ").append(toIndentedString(poNumber)).append("\n");
    sb.append("    transactionOrigin: ").append(toIndentedString(transactionOrigin)).append("\n");
    sb.append("    dynamicMerchantName: ").append(toIndentedString(dynamicMerchantName)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    clientLocale: ").append(toIndentedString(clientLocale)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
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

