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
import com.github.GBSEcom.model.AccountUpdaterResponse;
import com.github.GBSEcom.model.AchResponse;
import com.github.GBSEcom.model.AdditionalTransactionDetails;
import com.github.GBSEcom.model.Amount;
import com.github.GBSEcom.model.BasicResponse;
import com.github.GBSEcom.model.CurrencyConversionResponse;
import com.github.GBSEcom.model.PaymentMethodDetails;
import com.github.GBSEcom.model.PaymentStepRequest;
import com.github.GBSEcom.model.PaymentTokenDetails;
import com.github.GBSEcom.model.ProcessorData;
import com.github.GBSEcom.model.ResponseType;
import com.github.GBSEcom.model.Secure3DAuthenticationResponse;
import com.github.GBSEcom.model.Secure3dResponse;
import com.github.GBSEcom.model.StandinResponseDetails;
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
import java.util.ArrayList;
import java.util.List;

/**
 * Common object for primary and secondary payment request responses.
 */
@ApiModel(description = "Common object for primary and secondary payment request responses.")

public class TransactionResponse {
  public static final String SERIALIZED_NAME_CLIENT_REQUEST_ID = "clientRequestId";
  @SerializedName(SERIALIZED_NAME_CLIENT_REQUEST_ID)
  private String clientRequestId;

  public static final String SERIALIZED_NAME_API_TRACE_ID = "apiTraceId";
  @SerializedName(SERIALIZED_NAME_API_TRACE_ID)
  private String apiTraceId;

  public static final String SERIALIZED_NAME_RESPONSE_TYPE = "responseType";
  @SerializedName(SERIALIZED_NAME_RESPONSE_TYPE)
  private ResponseType responseType;

  public static final String SERIALIZED_NAME_IPG_TRANSACTION_ID = "ipgTransactionId";
  @SerializedName(SERIALIZED_NAME_IPG_TRANSACTION_ID)
  private String ipgTransactionId;

  public static final String SERIALIZED_NAME_ORDER_ID = "orderId";
  @SerializedName(SERIALIZED_NAME_ORDER_ID)
  private String orderId;

  public static final String SERIALIZED_NAME_TRANSACTION_TYPE = "transactionType";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_TYPE)
  private TransactionType transactionType;

  public static final String SERIALIZED_NAME_PAYMENT_TOKEN = "paymentToken";
  @SerializedName(SERIALIZED_NAME_PAYMENT_TOKEN)
  private PaymentTokenDetails paymentToken = null;

  public static final String SERIALIZED_NAME_TRANSACTION_ORIGIN = "transactionOrigin";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_ORIGIN)
  private TransactionOrigin transactionOrigin;

  public static final String SERIALIZED_NAME_PAYMENT_METHOD_DETAILS = "paymentMethodDetails";
  @SerializedName(SERIALIZED_NAME_PAYMENT_METHOD_DETAILS)
  private PaymentMethodDetails paymentMethodDetails;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public static final String SERIALIZED_NAME_TERMINAL_ID = "terminalId";
  @SerializedName(SERIALIZED_NAME_TERMINAL_ID)
  private String terminalId;

  public static final String SERIALIZED_NAME_MERCHANT_ID = "merchantId";
  @SerializedName(SERIALIZED_NAME_MERCHANT_ID)
  private String merchantId;

  public static final String SERIALIZED_NAME_MERCHANT_TRANSACTION_ID = "merchantTransactionId";
  @SerializedName(SERIALIZED_NAME_MERCHANT_TRANSACTION_ID)
  private String merchantTransactionId;

  public static final String SERIALIZED_NAME_TRANSACTION_TIME = "transactionTime";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_TIME)
  private Long transactionTime;

  public static final String SERIALIZED_NAME_APPROVED_AMOUNT = "approvedAmount";
  @SerializedName(SERIALIZED_NAME_APPROVED_AMOUNT)
  private Amount approvedAmount;

  /**
   * Represents the status of a transaction immediately following the original processing request. This value is not stored for the transaction and is only available in the response when the transaction is processed. TransactionStatus is not returned on either the transaction inquiry or on the order inquiry.
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

  /**
   * Shows the state of the current transaction.
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

    public static TransactionStateEnum fromValue(String value) {
      for (TransactionStateEnum b : TransactionStateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TransactionStateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TransactionStateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TransactionStateEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TransactionStateEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TRANSACTION_STATE = "transactionState";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_STATE)
  private TransactionStateEnum transactionState;

  public static final String SERIALIZED_NAME_PAYMENT_ACCOUNT_REFERENCE_NUMBER = "paymentAccountReferenceNumber";
  @SerializedName(SERIALIZED_NAME_PAYMENT_ACCOUNT_REFERENCE_NUMBER)
  private String paymentAccountReferenceNumber;

  public static final String SERIALIZED_NAME_SECURE3D_RESPONSE = "secure3dResponse";
  @SerializedName(SERIALIZED_NAME_SECURE3D_RESPONSE)
  private Secure3dResponse secure3dResponse;

  public static final String SERIALIZED_NAME_STANDIN_RESPONSE_DETAILS = "standinResponseDetails";
  @SerializedName(SERIALIZED_NAME_STANDIN_RESPONSE_DETAILS)
  private StandinResponseDetails standinResponseDetails;

  public static final String SERIALIZED_NAME_REDIRECT_U_R_L = "redirectURL";
  @SerializedName(SERIALIZED_NAME_REDIRECT_U_R_L)
  private String redirectURL;

  public static final String SERIALIZED_NAME_AUTHENTICATION_RESPONSE = "authenticationResponse";
  @SerializedName(SERIALIZED_NAME_AUTHENTICATION_RESPONSE)
  private Secure3DAuthenticationResponse authenticationResponse;

  public static final String SERIALIZED_NAME_SCHEME_TRANSACTION_ID = "schemeTransactionId";
  @SerializedName(SERIALIZED_NAME_SCHEME_TRANSACTION_ID)
  private String schemeTransactionId;

  public static final String SERIALIZED_NAME_PROCESSOR = "processor";
  @SerializedName(SERIALIZED_NAME_PROCESSOR)
  private ProcessorData processor;

  public static final String SERIALIZED_NAME_ADDITIONAL_DETAILS = "additionalDetails";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_DETAILS)
  private AdditionalTransactionDetails additionalDetails;

  public static final String SERIALIZED_NAME_ACCOUNT_UPDATER_RESPONSE = "accountUpdaterResponse";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_UPDATER_RESPONSE)
  private AccountUpdaterResponse accountUpdaterResponse;

  public static final String SERIALIZED_NAME_ACH_RESPONSE = "achResponse";
  @SerializedName(SERIALIZED_NAME_ACH_RESPONSE)
  private AchResponse achResponse;

  public static final String SERIALIZED_NAME_CURRENCY_CONVERSION_RESPONSE = "currencyConversionResponse";
  @SerializedName(SERIALIZED_NAME_CURRENCY_CONVERSION_RESPONSE)
  private CurrencyConversionResponse currencyConversionResponse;

  public static final String SERIALIZED_NAME_STEPS = "steps";
  @SerializedName(SERIALIZED_NAME_STEPS)
  private List<PaymentStepRequest> steps = null;


  public TransactionResponse clientRequestId(String clientRequestId) {
    
    this.clientRequestId = clientRequestId;
    return this;
  }

   /**
   * Echoes back the value in the request header for tracking.
   * @return clientRequestId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "30dd879c-ee2f-11db-8314-0800200c9a66", value = "Echoes back the value in the request header for tracking.")

  public String getClientRequestId() {
    return clientRequestId;
  }



  public void setClientRequestId(String clientRequestId) {
    this.clientRequestId = clientRequestId;
  }


  public TransactionResponse apiTraceId(String apiTraceId) {
    
    this.apiTraceId = apiTraceId;
    return this;
  }

   /**
   * Request identifier in API, can be used to request logs from the support team.
   * @return apiTraceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "rrt-0bd552c12342d3448-b-ea-1142-12938318-7", value = "Request identifier in API, can be used to request logs from the support team.")

  public String getApiTraceId() {
    return apiTraceId;
  }



  public void setApiTraceId(String apiTraceId) {
    this.apiTraceId = apiTraceId;
  }


  public TransactionResponse responseType(ResponseType responseType) {
    
    this.responseType = responseType;
    return this;
  }

   /**
   * Get responseType
   * @return responseType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ResponseType getResponseType() {
    return responseType;
  }



  public void setResponseType(ResponseType responseType) {
    this.responseType = responseType;
  }


  public TransactionResponse ipgTransactionId(String ipgTransactionId) {
    
    this.ipgTransactionId = ipgTransactionId;
    return this;
  }

   /**
   * The response transaction ID.
   * @return ipgTransactionId
  **/
  @javax.annotation.Nullable
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
   * Note - Client Order ID if supplied by client. If not supplied by client, IPG will generate. The first 12 alphanumeric digits are passed down to Fiserv Enterprise reporting tool, Clientline and Data File Manager (DFM).
   * @return orderId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123456", value = "Note - Client Order ID if supplied by client. If not supplied by client, IPG will generate. The first 12 alphanumeric digits are passed down to Fiserv Enterprise reporting tool, Clientline and Data File Manager (DFM).")

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
  @javax.annotation.Nullable
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
  @javax.annotation.Nullable
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
  @javax.annotation.Nullable
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
  @javax.annotation.Nullable
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
  @javax.annotation.Nullable
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
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123456", value = "The terminal that is processing the transaction.")

  public String getTerminalId() {
    return terminalId;
  }



  public void setTerminalId(String terminalId) {
    this.terminalId = terminalId;
  }


  public TransactionResponse merchantId(String merchantId) {
    
    this.merchantId = merchantId;
    return this;
  }

   /**
   * The unique (on Acquirer level) mechant ID. Usually this value has been chosen from the merchant itself and will be used in communication with the endpoint.
   * @return merchantId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "199950008", value = "The unique (on Acquirer level) mechant ID. Usually this value has been chosen from the merchant itself and will be used in communication with the endpoint.")

  public String getMerchantId() {
    return merchantId;
  }



  public void setMerchantId(String merchantId) {
    this.merchantId = merchantId;
  }


  public TransactionResponse merchantTransactionId(String merchantTransactionId) {
    
    this.merchantTransactionId = merchantTransactionId;
    return this;
  }

   /**
   * The unique merchant transaction ID from the request header, if supplied.
   * @return merchantTransactionId
  **/
  @javax.annotation.Nullable
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
  @javax.annotation.Nullable
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
  @javax.annotation.Nullable
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
   * Represents the status of a transaction immediately following the original processing request. This value is not stored for the transaction and is only available in the response when the transaction is processed. TransactionStatus is not returned on either the transaction inquiry or on the order inquiry.
   * @return transactionStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "APPROVED", value = "Represents the status of a transaction immediately following the original processing request. This value is not stored for the transaction and is only available in the response when the transaction is processed. TransactionStatus is not returned on either the transaction inquiry or on the order inquiry.")

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
   * Shows the state of the current transaction.
   * @return transactionState
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "AUTHORIZED", value = "Shows the state of the current transaction.")

  public TransactionStateEnum getTransactionState() {
    return transactionState;
  }



  public void setTransactionState(TransactionStateEnum transactionState) {
    this.transactionState = transactionState;
  }


  public TransactionResponse paymentAccountReferenceNumber(String paymentAccountReferenceNumber) {
    
    this.paymentAccountReferenceNumber = paymentAccountReferenceNumber;
    return this;
  }

   /**
   * Payment Account Reference Number from response, if supplied.
   * @return paymentAccountReferenceNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1234001AB101112131415161718CV", value = "Payment Account Reference Number from response, if supplied.")

  public String getPaymentAccountReferenceNumber() {
    return paymentAccountReferenceNumber;
  }



  public void setPaymentAccountReferenceNumber(String paymentAccountReferenceNumber) {
    this.paymentAccountReferenceNumber = paymentAccountReferenceNumber;
  }


  public TransactionResponse secure3dResponse(Secure3dResponse secure3dResponse) {
    
    this.secure3dResponse = secure3dResponse;
    return this;
  }

   /**
   * Get secure3dResponse
   * @return secure3dResponse
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Secure3dResponse getSecure3dResponse() {
    return secure3dResponse;
  }



  public void setSecure3dResponse(Secure3dResponse secure3dResponse) {
    this.secure3dResponse = secure3dResponse;
  }


  public TransactionResponse standinResponseDetails(StandinResponseDetails standinResponseDetails) {
    
    this.standinResponseDetails = standinResponseDetails;
    return this;
  }

   /**
   * Get standinResponseDetails
   * @return standinResponseDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public StandinResponseDetails getStandinResponseDetails() {
    return standinResponseDetails;
  }



  public void setStandinResponseDetails(StandinResponseDetails standinResponseDetails) {
    this.standinResponseDetails = standinResponseDetails;
  }


  public TransactionResponse redirectURL(String redirectURL) {
    
    this.redirectURL = redirectURL;
    return this;
  }

   /**
   * The endpoint redirection URL.
   * @return redirectURL
  **/
  @javax.annotation.Nullable
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
  @javax.annotation.Nullable
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
  @javax.annotation.Nullable
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
  @javax.annotation.Nullable
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
  @javax.annotation.Nullable
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
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AccountUpdaterResponse getAccountUpdaterResponse() {
    return accountUpdaterResponse;
  }



  public void setAccountUpdaterResponse(AccountUpdaterResponse accountUpdaterResponse) {
    this.accountUpdaterResponse = accountUpdaterResponse;
  }


  public TransactionResponse achResponse(AchResponse achResponse) {
    
    this.achResponse = achResponse;
    return this;
  }

   /**
   * Get achResponse
   * @return achResponse
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AchResponse getAchResponse() {
    return achResponse;
  }



  public void setAchResponse(AchResponse achResponse) {
    this.achResponse = achResponse;
  }


  public TransactionResponse currencyConversionResponse(CurrencyConversionResponse currencyConversionResponse) {
    
    this.currencyConversionResponse = currencyConversionResponse;
    return this;
  }

   /**
   * Get currencyConversionResponse
   * @return currencyConversionResponse
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CurrencyConversionResponse getCurrencyConversionResponse() {
    return currencyConversionResponse;
  }



  public void setCurrencyConversionResponse(CurrencyConversionResponse currencyConversionResponse) {
    this.currencyConversionResponse = currencyConversionResponse;
  }


  public TransactionResponse steps(List<PaymentStepRequest> steps) {
    
    this.steps = steps;
    return this;
  }

  public TransactionResponse addStepsItem(PaymentStepRequest stepsItem) {
    if (this.steps == null) {
      this.steps = new ArrayList<>();
    }
    this.steps.add(stepsItem);
    return this;
  }

   /**
   * Steps to be performed by the payer.
   * @return steps
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Steps to be performed by the payer.")

  public List<PaymentStepRequest> getSteps() {
    return steps;
  }



  public void setSteps(List<PaymentStepRequest> steps) {
    this.steps = steps;
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
    return Objects.equals(this.clientRequestId, transactionResponse.clientRequestId) &&
        Objects.equals(this.apiTraceId, transactionResponse.apiTraceId) &&
        Objects.equals(this.responseType, transactionResponse.responseType) &&
        Objects.equals(this.ipgTransactionId, transactionResponse.ipgTransactionId) &&
        Objects.equals(this.orderId, transactionResponse.orderId) &&
        Objects.equals(this.transactionType, transactionResponse.transactionType) &&
        Objects.equals(this.paymentToken, transactionResponse.paymentToken) &&
        Objects.equals(this.transactionOrigin, transactionResponse.transactionOrigin) &&
        Objects.equals(this.paymentMethodDetails, transactionResponse.paymentMethodDetails) &&
        Objects.equals(this.country, transactionResponse.country) &&
        Objects.equals(this.terminalId, transactionResponse.terminalId) &&
        Objects.equals(this.merchantId, transactionResponse.merchantId) &&
        Objects.equals(this.merchantTransactionId, transactionResponse.merchantTransactionId) &&
        Objects.equals(this.transactionTime, transactionResponse.transactionTime) &&
        Objects.equals(this.approvedAmount, transactionResponse.approvedAmount) &&
        Objects.equals(this.transactionStatus, transactionResponse.transactionStatus) &&
        Objects.equals(this.transactionState, transactionResponse.transactionState) &&
        Objects.equals(this.paymentAccountReferenceNumber, transactionResponse.paymentAccountReferenceNumber) &&
        Objects.equals(this.secure3dResponse, transactionResponse.secure3dResponse) &&
        Objects.equals(this.standinResponseDetails, transactionResponse.standinResponseDetails) &&
        Objects.equals(this.redirectURL, transactionResponse.redirectURL) &&
        Objects.equals(this.authenticationResponse, transactionResponse.authenticationResponse) &&
        Objects.equals(this.schemeTransactionId, transactionResponse.schemeTransactionId) &&
        Objects.equals(this.processor, transactionResponse.processor) &&
        Objects.equals(this.additionalDetails, transactionResponse.additionalDetails) &&
        Objects.equals(this.accountUpdaterResponse, transactionResponse.accountUpdaterResponse) &&
        Objects.equals(this.achResponse, transactionResponse.achResponse) &&
        Objects.equals(this.currencyConversionResponse, transactionResponse.currencyConversionResponse) &&
        Objects.equals(this.steps, transactionResponse.steps);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientRequestId, apiTraceId, responseType, ipgTransactionId, orderId, transactionType, paymentToken, transactionOrigin, paymentMethodDetails, country, terminalId, merchantId, merchantTransactionId, transactionTime, approvedAmount, transactionStatus, transactionState, paymentAccountReferenceNumber, secure3dResponse, standinResponseDetails, redirectURL, authenticationResponse, schemeTransactionId, processor, additionalDetails, accountUpdaterResponse, achResponse, currencyConversionResponse, steps);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionResponse {\n");
    sb.append("    clientRequestId: ").append(toIndentedString(clientRequestId)).append("\n");
    sb.append("    apiTraceId: ").append(toIndentedString(apiTraceId)).append("\n");
    sb.append("    responseType: ").append(toIndentedString(responseType)).append("\n");
    sb.append("    ipgTransactionId: ").append(toIndentedString(ipgTransactionId)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    transactionType: ").append(toIndentedString(transactionType)).append("\n");
    sb.append("    paymentToken: ").append(toIndentedString(paymentToken)).append("\n");
    sb.append("    transactionOrigin: ").append(toIndentedString(transactionOrigin)).append("\n");
    sb.append("    paymentMethodDetails: ").append(toIndentedString(paymentMethodDetails)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    terminalId: ").append(toIndentedString(terminalId)).append("\n");
    sb.append("    merchantId: ").append(toIndentedString(merchantId)).append("\n");
    sb.append("    merchantTransactionId: ").append(toIndentedString(merchantTransactionId)).append("\n");
    sb.append("    transactionTime: ").append(toIndentedString(transactionTime)).append("\n");
    sb.append("    approvedAmount: ").append(toIndentedString(approvedAmount)).append("\n");
    sb.append("    transactionStatus: ").append(toIndentedString(transactionStatus)).append("\n");
    sb.append("    transactionState: ").append(toIndentedString(transactionState)).append("\n");
    sb.append("    paymentAccountReferenceNumber: ").append(toIndentedString(paymentAccountReferenceNumber)).append("\n");
    sb.append("    secure3dResponse: ").append(toIndentedString(secure3dResponse)).append("\n");
    sb.append("    standinResponseDetails: ").append(toIndentedString(standinResponseDetails)).append("\n");
    sb.append("    redirectURL: ").append(toIndentedString(redirectURL)).append("\n");
    sb.append("    authenticationResponse: ").append(toIndentedString(authenticationResponse)).append("\n");
    sb.append("    schemeTransactionId: ").append(toIndentedString(schemeTransactionId)).append("\n");
    sb.append("    processor: ").append(toIndentedString(processor)).append("\n");
    sb.append("    additionalDetails: ").append(toIndentedString(additionalDetails)).append("\n");
    sb.append("    accountUpdaterResponse: ").append(toIndentedString(accountUpdaterResponse)).append("\n");
    sb.append("    achResponse: ").append(toIndentedString(achResponse)).append("\n");
    sb.append("    currencyConversionResponse: ").append(toIndentedString(currencyConversionResponse)).append("\n");
    sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
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

