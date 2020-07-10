/*
 * Payment Gateway API Specification.
 * The documentation here is designed to provide all of the technical guidance required to consume and integrate with our APIs for payment processing. To learn more about our APIs please visit https://docs.firstdata.com/org/gateway.
 *
 * The version of the OpenAPI document: 6.12.0.20200605.001
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.github.GBSEcom.model;

import java.util.Objects;
import java.util.Arrays;
import com.github.GBSEcom.model.BillingAddress;
import com.github.GBSEcom.model.Customer;
import com.github.GBSEcom.model.Device;
import com.github.GBSEcom.model.FraudOrder;
import com.github.GBSEcom.model.Loyalty;
import com.github.GBSEcom.model.Merchant;
import com.github.GBSEcom.model.Payment;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Fraud detect request payload.
 */
@ApiModel(description = "Fraud detect request payload.")

public class ScoreOnlyRequest {
  public static final String SERIALIZED_NAME_MERCHANT_REF = "merchantRef";
  @SerializedName(SERIALIZED_NAME_MERCHANT_REF)
  private String merchantRef;

  public static final String SERIALIZED_NAME_TRANSACTION_TYPE = "transactionType";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_TYPE)
  private String transactionType;

  /**
   * Defines the type of the original transaction that is being evaluated for the Fraud Score.
   */
  @JsonAdapter(OriginalTransactionTypeEnum.Adapter.class)
  public enum OriginalTransactionTypeEnum {
    AUTHORIZATION("transaction/authorization"),
    
    AUTHORIZATION_REVERSAL("transaction/authorization-reversal"),
    
    DEPOSIT("transaction/deposit"),
    
    DEPOSIT_REVERSAL("transaction/deposit-reversal"),
    
    PURCHASE("transaction/purchase"),
    
    PURCHASE_REVERSAL("transaction/purchase-reversal"),
    
    REFUND_AUTHORIZATION("transaction/refund-authorization"),
    
    REFUND_DEPOSIT("transaction/refund-deposit"),
    
    VERIFICATION("transaction/verification"),
    
    BALANCE_INQUIRY("transaction/balance-inquiry");

    private String value;

    OriginalTransactionTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static OriginalTransactionTypeEnum fromValue(String value) {
      for (OriginalTransactionTypeEnum b : OriginalTransactionTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<OriginalTransactionTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OriginalTransactionTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OriginalTransactionTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return OriginalTransactionTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ORIGINAL_TRANSACTION_TYPE = "originalTransactionType";
  @SerializedName(SERIALIZED_NAME_ORIGINAL_TRANSACTION_TYPE)
  private OriginalTransactionTypeEnum originalTransactionType;

  public static final String SERIALIZED_NAME_ORIGINAL_TRANSACTION_ID = "originalTransactionId";
  @SerializedName(SERIALIZED_NAME_ORIGINAL_TRANSACTION_ID)
  private String originalTransactionId;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private String amount;

  public static final String SERIALIZED_NAME_CURRENCY_CODE = "currencyCode";
  @SerializedName(SERIALIZED_NAME_CURRENCY_CODE)
  private String currencyCode;

  public static final String SERIALIZED_NAME_CUSTOMER = "customer";
  @SerializedName(SERIALIZED_NAME_CUSTOMER)
  private Customer customer;

  public static final String SERIALIZED_NAME_BILLING_ADDRESS = "billingAddress";
  @SerializedName(SERIALIZED_NAME_BILLING_ADDRESS)
  private BillingAddress billingAddress;

  public static final String SERIALIZED_NAME_DEVICE = "device";
  @SerializedName(SERIALIZED_NAME_DEVICE)
  private Device device;

  public static final String SERIALIZED_NAME_LOYALTY = "loyalty";
  @SerializedName(SERIALIZED_NAME_LOYALTY)
  private Loyalty loyalty;

  public static final String SERIALIZED_NAME_PAYMENT = "payment";
  @SerializedName(SERIALIZED_NAME_PAYMENT)
  private Payment payment;

  public static final String SERIALIZED_NAME_MERCHANT = "merchant";
  @SerializedName(SERIALIZED_NAME_MERCHANT)
  private Merchant merchant;

  public static final String SERIALIZED_NAME_ORDER = "order";
  @SerializedName(SERIALIZED_NAME_ORDER)
  private FraudOrder order;

  public static final String SERIALIZED_NAME_USER_DEFINED = "userDefined";
  @SerializedName(SERIALIZED_NAME_USER_DEFINED)
  private Object userDefined;


  public ScoreOnlyRequest merchantRef(String merchantRef) {
    
    this.merchantRef = merchantRef;
    return this;
  }

   /**
   * Merchant reference code. Used by FirstAPI and reflected in settlement records and Webhook notifications. Typically, the merchantRef field is the purchase order number or unique sequence value associated to a given transaction.
   * @return merchantRef
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ffd031516002", value = "Merchant reference code. Used by FirstAPI and reflected in settlement records and Webhook notifications. Typically, the merchantRef field is the purchase order number or unique sequence value associated to a given transaction.")

  public String getMerchantRef() {
    return merchantRef;
  }



  public void setMerchantRef(String merchantRef) {
    this.merchantRef = merchantRef;
  }


  public ScoreOnlyRequest transactionType(String transactionType) {
    
    this.transactionType = transactionType;
    return this;
  }

   /**
   * Type of transaction merchant wants to process.
   * @return transactionType
  **/
  @ApiModelProperty(example = "score_only", required = true, value = "Type of transaction merchant wants to process.")

  public String getTransactionType() {
    return transactionType;
  }



  public void setTransactionType(String transactionType) {
    this.transactionType = transactionType;
  }


  public ScoreOnlyRequest originalTransactionType(OriginalTransactionTypeEnum originalTransactionType) {
    
    this.originalTransactionType = originalTransactionType;
    return this;
  }

   /**
   * Defines the type of the original transaction that is being evaluated for the Fraud Score.
   * @return originalTransactionType
  **/
  @ApiModelProperty(example = "transaction/authorization", required = true, value = "Defines the type of the original transaction that is being evaluated for the Fraud Score.")

  public OriginalTransactionTypeEnum getOriginalTransactionType() {
    return originalTransactionType;
  }



  public void setOriginalTransactionType(OriginalTransactionTypeEnum originalTransactionType) {
    this.originalTransactionType = originalTransactionType;
  }


  public ScoreOnlyRequest originalTransactionId(String originalTransactionId) {
    
    this.originalTransactionId = originalTransactionId;
    return this;
  }

   /**
   * The unique ID of this transaction. Must be unique for the entire system (not just within a specific merchant or industry). Subsequent requests related to the same transaction must have the same transactionId (e.g. transaction/deposit or transaction/authorization-reversal). This field is used for matching transactions with settlement and chargeback information. If there is no such ID available you may wish to compose one from fields available in both systems. Consider including backend, issuer, merchant id, date and time, amount, etc. as necessary.
   * @return originalTransactionId
  **/
  @ApiModelProperty(example = "fraudFAPI1231231", required = true, value = "The unique ID of this transaction. Must be unique for the entire system (not just within a specific merchant or industry). Subsequent requests related to the same transaction must have the same transactionId (e.g. transaction/deposit or transaction/authorization-reversal). This field is used for matching transactions with settlement and chargeback information. If there is no such ID available you may wish to compose one from fields available in both systems. Consider including backend, issuer, merchant id, date and time, amount, etc. as necessary.")

  public String getOriginalTransactionId() {
    return originalTransactionId;
  }



  public void setOriginalTransactionId(String originalTransactionId) {
    this.originalTransactionId = originalTransactionId;
  }


  public ScoreOnlyRequest amount(String amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * The amount processed for the original transaction.
   * @return amount
  **/
  @ApiModelProperty(example = "1100", required = true, value = "The amount processed for the original transaction.")

  public String getAmount() {
    return amount;
  }



  public void setAmount(String amount) {
    this.amount = amount;
  }


  public ScoreOnlyRequest currencyCode(String currencyCode) {
    
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * The currency of the original transaction.
   * @return currencyCode
  **/
  @ApiModelProperty(example = "USD", required = true, value = "The currency of the original transaction.")

  public String getCurrencyCode() {
    return currencyCode;
  }



  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }


  public ScoreOnlyRequest customer(Customer customer) {
    
    this.customer = customer;
    return this;
  }

   /**
   * Get customer
   * @return customer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Customer getCustomer() {
    return customer;
  }



  public void setCustomer(Customer customer) {
    this.customer = customer;
  }


  public ScoreOnlyRequest billingAddress(BillingAddress billingAddress) {
    
    this.billingAddress = billingAddress;
    return this;
  }

   /**
   * Get billingAddress
   * @return billingAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BillingAddress getBillingAddress() {
    return billingAddress;
  }



  public void setBillingAddress(BillingAddress billingAddress) {
    this.billingAddress = billingAddress;
  }


  public ScoreOnlyRequest device(Device device) {
    
    this.device = device;
    return this;
  }

   /**
   * Get device
   * @return device
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Device getDevice() {
    return device;
  }



  public void setDevice(Device device) {
    this.device = device;
  }


  public ScoreOnlyRequest loyalty(Loyalty loyalty) {
    
    this.loyalty = loyalty;
    return this;
  }

   /**
   * Get loyalty
   * @return loyalty
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Loyalty getLoyalty() {
    return loyalty;
  }



  public void setLoyalty(Loyalty loyalty) {
    this.loyalty = loyalty;
  }


  public ScoreOnlyRequest payment(Payment payment) {
    
    this.payment = payment;
    return this;
  }

   /**
   * Get payment
   * @return payment
  **/
  @ApiModelProperty(required = true, value = "")

  public Payment getPayment() {
    return payment;
  }



  public void setPayment(Payment payment) {
    this.payment = payment;
  }


  public ScoreOnlyRequest merchant(Merchant merchant) {
    
    this.merchant = merchant;
    return this;
  }

   /**
   * Get merchant
   * @return merchant
  **/
  @ApiModelProperty(required = true, value = "")

  public Merchant getMerchant() {
    return merchant;
  }



  public void setMerchant(Merchant merchant) {
    this.merchant = merchant;
  }


  public ScoreOnlyRequest order(FraudOrder order) {
    
    this.order = order;
    return this;
  }

   /**
   * Get order
   * @return order
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FraudOrder getOrder() {
    return order;
  }



  public void setOrder(FraudOrder order) {
    this.order = order;
  }


  public ScoreOnlyRequest userDefined(Object userDefined) {
    
    this.userDefined = userDefined;
    return this;
  }

   /**
   * A JSON object that can carry any additional information that might be helpful for fraud detection.
   * @return userDefined
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"inauthTransId\":1234}", value = "A JSON object that can carry any additional information that might be helpful for fraud detection.")

  public Object getUserDefined() {
    return userDefined;
  }



  public void setUserDefined(Object userDefined) {
    this.userDefined = userDefined;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScoreOnlyRequest scoreOnlyRequest = (ScoreOnlyRequest) o;
    return Objects.equals(this.merchantRef, scoreOnlyRequest.merchantRef) &&
        Objects.equals(this.transactionType, scoreOnlyRequest.transactionType) &&
        Objects.equals(this.originalTransactionType, scoreOnlyRequest.originalTransactionType) &&
        Objects.equals(this.originalTransactionId, scoreOnlyRequest.originalTransactionId) &&
        Objects.equals(this.amount, scoreOnlyRequest.amount) &&
        Objects.equals(this.currencyCode, scoreOnlyRequest.currencyCode) &&
        Objects.equals(this.customer, scoreOnlyRequest.customer) &&
        Objects.equals(this.billingAddress, scoreOnlyRequest.billingAddress) &&
        Objects.equals(this.device, scoreOnlyRequest.device) &&
        Objects.equals(this.loyalty, scoreOnlyRequest.loyalty) &&
        Objects.equals(this.payment, scoreOnlyRequest.payment) &&
        Objects.equals(this.merchant, scoreOnlyRequest.merchant) &&
        Objects.equals(this.order, scoreOnlyRequest.order) &&
        Objects.equals(this.userDefined, scoreOnlyRequest.userDefined);
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchantRef, transactionType, originalTransactionType, originalTransactionId, amount, currencyCode, customer, billingAddress, device, loyalty, payment, merchant, order, userDefined);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScoreOnlyRequest {\n");
    sb.append("    merchantRef: ").append(toIndentedString(merchantRef)).append("\n");
    sb.append("    transactionType: ").append(toIndentedString(transactionType)).append("\n");
    sb.append("    originalTransactionType: ").append(toIndentedString(originalTransactionType)).append("\n");
    sb.append("    originalTransactionId: ").append(toIndentedString(originalTransactionId)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    billingAddress: ").append(toIndentedString(billingAddress)).append("\n");
    sb.append("    device: ").append(toIndentedString(device)).append("\n");
    sb.append("    loyalty: ").append(toIndentedString(loyalty)).append("\n");
    sb.append("    payment: ").append(toIndentedString(payment)).append("\n");
    sb.append("    merchant: ").append(toIndentedString(merchant)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    userDefined: ").append(toIndentedString(userDefined)).append("\n");
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

