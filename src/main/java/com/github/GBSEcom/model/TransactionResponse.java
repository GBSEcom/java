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
import com.github.GBSEcom.model.AccountUpdaterResponse;
import com.github.GBSEcom.model.AdditionalTransactionDetails;
import com.github.GBSEcom.model.Amount;
import com.github.GBSEcom.model.BasicResponse;
import com.github.GBSEcom.model.PaymentMethodDetails;
import com.github.GBSEcom.model.PaymentTokenDetails;
import com.github.GBSEcom.model.ProcessorData;
import com.github.GBSEcom.model.ResponseType;
import com.github.GBSEcom.model.Secure3DAuthenticationResponse;
import com.github.GBSEcom.model.Secure3dResponse;
import com.github.GBSEcom.model.TransactionOrigin;
import com.github.GBSEcom.model.TransactionType;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Common object for primary and secondary payment request responses.
 */
@ApiModel(description = "Common object for primary and secondary payment request responses.")

public class TransactionResponse extends BasicResponse {
  public static final String SERIALIZED_NAME_IPG_TRANSACTION_ID = "ipgTransactionId";
  @SerializedName(SERIALIZED_NAME_IPG_TRANSACTION_ID)
  private String ipgTransactionId;

  public static final String SERIALIZED_NAME_ORDER_ID = "orderId";
  @SerializedName(SERIALIZED_NAME_ORDER_ID)
  private String orderId;

  public static final String SERIALIZED_NAME_TRANSACTION_TYPE = "transactionType";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_TYPE)
  private TransactionType transactionType = null;

  public static final String SERIALIZED_NAME_PAYMENT_TOKEN = "paymentToken";
  @SerializedName(SERIALIZED_NAME_PAYMENT_TOKEN)
  private PaymentTokenDetails paymentToken = null;

  public static final String SERIALIZED_NAME_TRANSACTION_ORIGIN = "transactionOrigin";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_ORIGIN)
  private TransactionOrigin transactionOrigin = null;

  public static final String SERIALIZED_NAME_PAYMENT_METHOD_DETAILS = "paymentMethodDetails";
  @SerializedName(SERIALIZED_NAME_PAYMENT_METHOD_DETAILS)
  private PaymentMethodDetails paymentMethodDetails = null;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public static final String SERIALIZED_NAME_TERMINAL_ID = "terminalId";
  @SerializedName(SERIALIZED_NAME_TERMINAL_ID)
  private String terminalId;

  public static final String SERIALIZED_NAME_MERCHANT_TRANSACTION_ID = "merchantTransactionId";
  @SerializedName(SERIALIZED_NAME_MERCHANT_TRANSACTION_ID)
  private String merchantTransactionId;

  public static final String SERIALIZED_NAME_TRANSACTION_TIME = "transactionTime";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_TIME)
  private Long transactionTime;

  public static final String SERIALIZED_NAME_APPROVED_AMOUNT = "approvedAmount";
  @SerializedName(SERIALIZED_NAME_APPROVED_AMOUNT)
  private Amount approvedAmount = null;

  /**
   * The status of the transaction. APPROVED/WAITING are returned by the endpoints.  VALIDATION_FAILED/DECLINED are errors. See ErrorResponse object for details.
   */
  @JsonAdapter(TransactionStatusEnum.Adapter.class)
  public enum TransactionStatusEnum {
    APPROVED("APPROVED"),
    
    WAITING("WAITING"),
    
    VALIDATION_FAILED("VALIDATION_FAILED"),
    
    PROCESSING_FAILED("PROCESSING_FAILED"),
    
    DECLINED("DECLINED");

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

  /**
   * The state of the transaction.
   */
  @JsonAdapter(TransactionStateEnum.Adapter.class)
  public enum TransactionStateEnum {
    AUTHORIZED("AUTHORIZED"),
    
    CAPTURED("CAPTURED"),
    
    DECLINED("DECLINED"),
    
    CHECKED("CHECKED"),
    
    COMPLETED_GET("COMPLETED_GET"),
    
    INITIALIZED("INITIALIZED"),
    
    PENDING("PENDING"),
    
    READY("READY"),
    
    TEMPLATE("TEMPLATE"),
    
    SETTLED("SETTLED"),
    
    VOIDED("VOIDED"),
    
    WAITING("WAITING");

    private String value;

    TransactionStateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TransactionStateEnum fromValue(String text) {
      for (TransactionStateEnum b : TransactionStateEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }

    public static class Adapter extends TypeAdapter<TransactionStateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TransactionStateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TransactionStateEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TransactionStateEnum.fromValue(String.valueOf(value));
      }
    }
  }

  public static final String SERIALIZED_NAME_TRANSACTION_STATE = "transactionState";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_STATE)
  private TransactionStateEnum transactionState;

  public static final String SERIALIZED_NAME_SECURE3D_RESPONSE = "secure3dResponse";
  @SerializedName(SERIALIZED_NAME_SECURE3D_RESPONSE)
  private Secure3dResponse secure3dResponse = null;

  public static final String SERIALIZED_NAME_REDIRECT_U_R_L = "redirectURL";
  @SerializedName(SERIALIZED_NAME_REDIRECT_U_R_L)
  private String redirectURL;

  public static final String SERIALIZED_NAME_AUTHENTICATION_RESPONSE = "authenticationResponse";
  @SerializedName(SERIALIZED_NAME_AUTHENTICATION_RESPONSE)
  private Secure3DAuthenticationResponse authenticationResponse = null;

  public static final String SERIALIZED_NAME_SCHEME_TRANSACTION_ID = "schemeTransactionId";
  @SerializedName(SERIALIZED_NAME_SCHEME_TRANSACTION_ID)
  private String schemeTransactionId;

  public static final String SERIALIZED_NAME_PROCESSOR = "processor";
  @SerializedName(SERIALIZED_NAME_PROCESSOR)
  private ProcessorData processor = null;

  public static final String SERIALIZED_NAME_ADDITIONAL_DETAILS = "additionalDetails";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_DETAILS)
  private AdditionalTransactionDetails additionalDetails = null;

  public static final String SERIALIZED_NAME_ACCOUNT_UPDATER_RESPONSE = "accountUpdaterResponse";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_UPDATER_RESPONSE)
  private AccountUpdaterResponse accountUpdaterResponse = null;

  public TransactionResponse ipgTransactionId(String ipgTransactionId) {
    this.ipgTransactionId = ipgTransactionId;
    return this;
  }

   /**
   * The response transaction ID.
   * @return ipgTransactionId
  **/
  @ApiModelProperty(example = "838916029301", value = "The response transaction ID.")
  public String getIpgTransactionId() {
    return ipgTransactionId;
  }

  public void setIpgTransactionId(String ipgTransactionId) {
    this.ipgTransactionId = ipgTransactionId;
  }

  public TransactionResponse orderId(String orderId) {
    this.orderId = orderId;
    return this;
  }

   /**
   * Client order ID if supplied by client, otherwise the order ID.
   * @return orderId
  **/
  @ApiModelProperty(example = "123456", value = "Client order ID if supplied by client, otherwise the order ID.")
  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  public TransactionResponse transactionType(TransactionType transactionType) {
    this.transactionType = transactionType;
    return this;
  }

   /**
   * Get transactionType
   * @return transactionType
  **/
  @ApiModelProperty(value = "")
  public TransactionType getTransactionType() {
    return transactionType;
  }

  public void setTransactionType(TransactionType transactionType) {
    this.transactionType = transactionType;
  }

  public TransactionResponse paymentToken(PaymentTokenDetails paymentToken) {
    this.paymentToken = paymentToken;
    return this;
  }

   /**
   * Get paymentToken
   * @return paymentToken
  **/
  @ApiModelProperty(value = "")
  public PaymentTokenDetails getPaymentToken() {
    return paymentToken;
  }

  public void setPaymentToken(PaymentTokenDetails paymentToken) {
    this.paymentToken = paymentToken;
  }

  public TransactionResponse transactionOrigin(TransactionOrigin transactionOrigin) {
    this.transactionOrigin = transactionOrigin;
    return this;
  }

   /**
   * Get transactionOrigin
   * @return transactionOrigin
  **/
  @ApiModelProperty(value = "")
  public TransactionOrigin getTransactionOrigin() {
    return transactionOrigin;
  }

  public void setTransactionOrigin(TransactionOrigin transactionOrigin) {
    this.transactionOrigin = transactionOrigin;
  }

  public TransactionResponse paymentMethodDetails(PaymentMethodDetails paymentMethodDetails) {
    this.paymentMethodDetails = paymentMethodDetails;
    return this;
  }

   /**
   * Get paymentMethodDetails
   * @return paymentMethodDetails
  **/
  @ApiModelProperty(value = "")
  public PaymentMethodDetails getPaymentMethodDetails() {
    return paymentMethodDetails;
  }

  public void setPaymentMethodDetails(PaymentMethodDetails paymentMethodDetails) {
    this.paymentMethodDetails = paymentMethodDetails;
  }

  public TransactionResponse country(String country) {
    this.country = country;
    return this;
  }

   /**
   * Country of the card issuer.
   * @return country
  **/
  @ApiModelProperty(example = "USA", value = "Country of the card issuer.")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public TransactionResponse terminalId(String terminalId) {
    this.terminalId = terminalId;
    return this;
  }

   /**
   * The terminal that is processing the transaction.
   * @return terminalId
  **/
  @ApiModelProperty(example = "123456", value = "The terminal that is processing the transaction.")
  public String getTerminalId() {
    return terminalId;
  }

  public void setTerminalId(String terminalId) {
    this.terminalId = terminalId;
  }

  public TransactionResponse merchantTransactionId(String merchantTransactionId) {
    this.merchantTransactionId = merchantTransactionId;
    return this;
  }

   /**
   * The unique merchant transaction ID from the request header, if supplied.
   * @return merchantTransactionId
  **/
  @ApiModelProperty(example = "lsk23532djljff3", value = "The unique merchant transaction ID from the request header, if supplied.")
  public String getMerchantTransactionId() {
    return merchantTransactionId;
  }

  public void setMerchantTransactionId(String merchantTransactionId) {
    this.merchantTransactionId = merchantTransactionId;
  }

  public TransactionResponse transactionTime(Long transactionTime) {
    this.transactionTime = transactionTime;
    return this;
  }

   /**
   * The transaction time in seconds since epoch.
   * @return transactionTime
  **/
  @ApiModelProperty(example = "1518811817", value = "The transaction time in seconds since epoch.")
  public Long getTransactionTime() {
    return transactionTime;
  }

  public void setTransactionTime(Long transactionTime) {
    this.transactionTime = transactionTime;
  }

  public TransactionResponse approvedAmount(Amount approvedAmount) {
    this.approvedAmount = approvedAmount;
    return this;
  }

   /**
   * Get approvedAmount
   * @return approvedAmount
  **/
  @ApiModelProperty(value = "")
  public Amount getApprovedAmount() {
    return approvedAmount;
  }

  public void setApprovedAmount(Amount approvedAmount) {
    this.approvedAmount = approvedAmount;
  }

  public TransactionResponse transactionStatus(TransactionStatusEnum transactionStatus) {
    this.transactionStatus = transactionStatus;
    return this;
  }

   /**
   * The status of the transaction. APPROVED/WAITING are returned by the endpoints.  VALIDATION_FAILED/DECLINED are errors. See ErrorResponse object for details.
   * @return transactionStatus
  **/
  @ApiModelProperty(example = "APPROVED", value = "The status of the transaction. APPROVED/WAITING are returned by the endpoints.  VALIDATION_FAILED/DECLINED are errors. See ErrorResponse object for details.")
  public TransactionStatusEnum getTransactionStatus() {
    return transactionStatus;
  }

  public void setTransactionStatus(TransactionStatusEnum transactionStatus) {
    this.transactionStatus = transactionStatus;
  }

  public TransactionResponse transactionState(TransactionStateEnum transactionState) {
    this.transactionState = transactionState;
    return this;
  }

   /**
   * The state of the transaction.
   * @return transactionState
  **/
  @ApiModelProperty(example = "AUTHORIZED", value = "The state of the transaction.")
  public TransactionStateEnum getTransactionState() {
    return transactionState;
  }

  public void setTransactionState(TransactionStateEnum transactionState) {
    this.transactionState = transactionState;
  }

  public TransactionResponse secure3dResponse(Secure3dResponse secure3dResponse) {
    this.secure3dResponse = secure3dResponse;
    return this;
  }

   /**
   * Get secure3dResponse
   * @return secure3dResponse
  **/
  @ApiModelProperty(value = "")
  public Secure3dResponse getSecure3dResponse() {
    return secure3dResponse;
  }

  public void setSecure3dResponse(Secure3dResponse secure3dResponse) {
    this.secure3dResponse = secure3dResponse;
  }

  public TransactionResponse redirectURL(String redirectURL) {
    this.redirectURL = redirectURL;
    return this;
  }

   /**
   * The endpoint redirection URL.
   * @return redirectURL
  **/
  @ApiModelProperty(example = "http://pay.issuer-bank.com/sessionID=123&sharedKey=456", value = "The endpoint redirection URL.")
  public String getRedirectURL() {
    return redirectURL;
  }

  public void setRedirectURL(String redirectURL) {
    this.redirectURL = redirectURL;
  }

  public TransactionResponse authenticationResponse(Secure3DAuthenticationResponse authenticationResponse) {
    this.authenticationResponse = authenticationResponse;
    return this;
  }

   /**
   * Get authenticationResponse
   * @return authenticationResponse
  **/
  @ApiModelProperty(value = "")
  public Secure3DAuthenticationResponse getAuthenticationResponse() {
    return authenticationResponse;
  }

  public void setAuthenticationResponse(Secure3DAuthenticationResponse authenticationResponse) {
    this.authenticationResponse = authenticationResponse;
  }

  public TransactionResponse schemeTransactionId(String schemeTransactionId) {
    this.schemeTransactionId = schemeTransactionId;
    return this;
  }

   /**
   * The transaction ID received from schemes for the initial transaction of card on file flows.
   * @return schemeTransactionId
  **/
  @ApiModelProperty(example = "019078743804756", value = "The transaction ID received from schemes for the initial transaction of card on file flows.")
  public String getSchemeTransactionId() {
    return schemeTransactionId;
  }

  public void setSchemeTransactionId(String schemeTransactionId) {
    this.schemeTransactionId = schemeTransactionId;
  }

  public TransactionResponse processor(ProcessorData processor) {
    this.processor = processor;
    return this;
  }

   /**
   * Get processor
   * @return processor
  **/
  @ApiModelProperty(value = "")
  public ProcessorData getProcessor() {
    return processor;
  }

  public void setProcessor(ProcessorData processor) {
    this.processor = processor;
  }

  public TransactionResponse additionalDetails(AdditionalTransactionDetails additionalDetails) {
    this.additionalDetails = additionalDetails;
    return this;
  }

   /**
   * Get additionalDetails
   * @return additionalDetails
  **/
  @ApiModelProperty(value = "")
  public AdditionalTransactionDetails getAdditionalDetails() {
    return additionalDetails;
  }

  public void setAdditionalDetails(AdditionalTransactionDetails additionalDetails) {
    this.additionalDetails = additionalDetails;
  }

  public TransactionResponse accountUpdaterResponse(AccountUpdaterResponse accountUpdaterResponse) {
    this.accountUpdaterResponse = accountUpdaterResponse;
    return this;
  }

   /**
   * Get accountUpdaterResponse
   * @return accountUpdaterResponse
  **/
  @ApiModelProperty(value = "")
  public AccountUpdaterResponse getAccountUpdaterResponse() {
    return accountUpdaterResponse;
  }

  public void setAccountUpdaterResponse(AccountUpdaterResponse accountUpdaterResponse) {
    this.accountUpdaterResponse = accountUpdaterResponse;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionResponse transactionResponse = (TransactionResponse) o;
    return Objects.equals(this.ipgTransactionId, transactionResponse.ipgTransactionId) &&
        Objects.equals(this.orderId, transactionResponse.orderId) &&
        Objects.equals(this.transactionType, transactionResponse.transactionType) &&
        Objects.equals(this.paymentToken, transactionResponse.paymentToken) &&
        Objects.equals(this.transactionOrigin, transactionResponse.transactionOrigin) &&
        Objects.equals(this.paymentMethodDetails, transactionResponse.paymentMethodDetails) &&
        Objects.equals(this.country, transactionResponse.country) &&
        Objects.equals(this.terminalId, transactionResponse.terminalId) &&
        Objects.equals(this.merchantTransactionId, transactionResponse.merchantTransactionId) &&
        Objects.equals(this.transactionTime, transactionResponse.transactionTime) &&
        Objects.equals(this.approvedAmount, transactionResponse.approvedAmount) &&
        Objects.equals(this.transactionStatus, transactionResponse.transactionStatus) &&
        Objects.equals(this.transactionState, transactionResponse.transactionState) &&
        Objects.equals(this.secure3dResponse, transactionResponse.secure3dResponse) &&
        Objects.equals(this.redirectURL, transactionResponse.redirectURL) &&
        Objects.equals(this.authenticationResponse, transactionResponse.authenticationResponse) &&
        Objects.equals(this.schemeTransactionId, transactionResponse.schemeTransactionId) &&
        Objects.equals(this.processor, transactionResponse.processor) &&
        Objects.equals(this.additionalDetails, transactionResponse.additionalDetails) &&
        Objects.equals(this.accountUpdaterResponse, transactionResponse.accountUpdaterResponse) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ipgTransactionId, orderId, transactionType, paymentToken, transactionOrigin, paymentMethodDetails, country, terminalId, merchantTransactionId, transactionTime, approvedAmount, transactionStatus, transactionState, secure3dResponse, redirectURL, authenticationResponse, schemeTransactionId, processor, additionalDetails, accountUpdaterResponse, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    ipgTransactionId: ").append(toIndentedString(ipgTransactionId)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    transactionType: ").append(toIndentedString(transactionType)).append("\n");
    sb.append("    paymentToken: ").append(toIndentedString(paymentToken)).append("\n");
    sb.append("    transactionOrigin: ").append(toIndentedString(transactionOrigin)).append("\n");
    sb.append("    paymentMethodDetails: ").append(toIndentedString(paymentMethodDetails)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    terminalId: ").append(toIndentedString(terminalId)).append("\n");
    sb.append("    merchantTransactionId: ").append(toIndentedString(merchantTransactionId)).append("\n");
    sb.append("    transactionTime: ").append(toIndentedString(transactionTime)).append("\n");
    sb.append("    approvedAmount: ").append(toIndentedString(approvedAmount)).append("\n");
    sb.append("    transactionStatus: ").append(toIndentedString(transactionStatus)).append("\n");
    sb.append("    transactionState: ").append(toIndentedString(transactionState)).append("\n");
    sb.append("    secure3dResponse: ").append(toIndentedString(secure3dResponse)).append("\n");
    sb.append("    redirectURL: ").append(toIndentedString(redirectURL)).append("\n");
    sb.append("    authenticationResponse: ").append(toIndentedString(authenticationResponse)).append("\n");
    sb.append("    schemeTransactionId: ").append(toIndentedString(schemeTransactionId)).append("\n");
    sb.append("    processor: ").append(toIndentedString(processor)).append("\n");
    sb.append("    additionalDetails: ").append(toIndentedString(additionalDetails)).append("\n");
    sb.append("    accountUpdaterResponse: ").append(toIndentedString(accountUpdaterResponse)).append("\n");
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

