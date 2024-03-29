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
import com.github.GBSEcom.model.IssuerResponse;
import com.github.GBSEcom.model.Method;
import com.github.GBSEcom.model.Verification3ds;
import com.github.GBSEcom.model.VerificationAvs;
import com.github.GBSEcom.model.VerificationCvv;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Payment information for the transaction.
 */
@ApiModel(description = "Payment information for the transaction.")

public class Payment {
  /**
   * Defines the type of the payment.
   */
  @JsonAdapter(PaymentTypeEnum.Adapter.class)
  public enum PaymentTypeEnum {
    CARD("payment/card"),
    
    WALLET("payment/wallet");

    private String value;

    PaymentTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PaymentTypeEnum fromValue(String value) {
      for (PaymentTypeEnum b : PaymentTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PaymentTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PaymentTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PaymentTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return PaymentTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PAYMENT_TYPE = "paymentType";
  @SerializedName(SERIALIZED_NAME_PAYMENT_TYPE)
  private PaymentTypeEnum paymentType;

  public static final String SERIALIZED_NAME_METHOD = "method";
  @SerializedName(SERIALIZED_NAME_METHOD)
  private Method method;

  public static final String SERIALIZED_NAME_PIN_PRESENT = "pinPresent";
  @SerializedName(SERIALIZED_NAME_PIN_PRESENT)
  private Boolean pinPresent;

  /**
   * The method in which the card information entered the system.
   */
  @JsonAdapter(EntryMethodEnum.Adapter.class)
  public enum EntryMethodEnum {
    MANUAL("manual"),
    
    STRIPE("stripe"),
    
    OCR("ocr"),
    
    EMV("emv"),
    
    NFC("nfc"),
    
    REMOTE("remote"),
    
    PIN_PRESENT("pin_present");

    private String value;

    EntryMethodEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EntryMethodEnum fromValue(String value) {
      for (EntryMethodEnum b : EntryMethodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<EntryMethodEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EntryMethodEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EntryMethodEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return EntryMethodEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ENTRY_METHOD = "entryMethod";
  @SerializedName(SERIALIZED_NAME_ENTRY_METHOD)
  private EntryMethodEnum entryMethod;

  public static final String SERIALIZED_NAME_ISSUER_RESPONSE = "issuerResponse";
  @SerializedName(SERIALIZED_NAME_ISSUER_RESPONSE)
  private IssuerResponse issuerResponse;

  public static final String SERIALIZED_NAME_ISSUER_APPROVED_AMOUNT = "issuerApprovedAmount";
  @SerializedName(SERIALIZED_NAME_ISSUER_APPROVED_AMOUNT)
  private String issuerApprovedAmount;

  public static final String SERIALIZED_NAME_ISSUER_CARD_BALANCE = "issuerCardBalance";
  @SerializedName(SERIALIZED_NAME_ISSUER_CARD_BALANCE)
  private String issuerCardBalance;

  public static final String SERIALIZED_NAME_VERIFICATION_AVS = "verificationAvs";
  @SerializedName(SERIALIZED_NAME_VERIFICATION_AVS)
  private VerificationAvs verificationAvs;

  public static final String SERIALIZED_NAME_VERIFICATION3DS = "verification3ds";
  @SerializedName(SERIALIZED_NAME_VERIFICATION3DS)
  private Verification3ds verification3ds;

  public static final String SERIALIZED_NAME_VERIFICATION_CVV = "verificationCvv";
  @SerializedName(SERIALIZED_NAME_VERIFICATION_CVV)
  private VerificationCvv verificationCvv;

  public static final String SERIALIZED_NAME_USER_DEFINED = "userDefined";
  @SerializedName(SERIALIZED_NAME_USER_DEFINED)
  private Object userDefined;


  public Payment paymentType(PaymentTypeEnum paymentType) {
    
    this.paymentType = paymentType;
    return this;
  }

   /**
   * Defines the type of the payment.
   * @return paymentType
  **/
  @ApiModelProperty(example = "payment/card", required = true, value = "Defines the type of the payment.")

  public PaymentTypeEnum getPaymentType() {
    return paymentType;
  }



  public void setPaymentType(PaymentTypeEnum paymentType) {
    this.paymentType = paymentType;
  }


  public Payment method(Method method) {
    
    this.method = method;
    return this;
  }

   /**
   * Get method
   * @return method
  **/
  @ApiModelProperty(required = true, value = "")

  public Method getMethod() {
    return method;
  }



  public void setMethod(Method method) {
    this.method = method;
  }


  public Payment pinPresent(Boolean pinPresent) {
    
    this.pinPresent = pinPresent;
    return this;
  }

   /**
   * Indicates if the cards Personal Identification Number was supplied.
   * @return pinPresent
  **/
  @ApiModelProperty(example = "true", required = true, value = "Indicates if the cards Personal Identification Number was supplied.")

  public Boolean getPinPresent() {
    return pinPresent;
  }



  public void setPinPresent(Boolean pinPresent) {
    this.pinPresent = pinPresent;
  }


  public Payment entryMethod(EntryMethodEnum entryMethod) {
    
    this.entryMethod = entryMethod;
    return this;
  }

   /**
   * The method in which the card information entered the system.
   * @return entryMethod
  **/
  @ApiModelProperty(example = "remote", required = true, value = "The method in which the card information entered the system.")

  public EntryMethodEnum getEntryMethod() {
    return entryMethod;
  }



  public void setEntryMethod(EntryMethodEnum entryMethod) {
    this.entryMethod = entryMethod;
  }


  public Payment issuerResponse(IssuerResponse issuerResponse) {
    
    this.issuerResponse = issuerResponse;
    return this;
  }

   /**
   * Get issuerResponse
   * @return issuerResponse
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IssuerResponse getIssuerResponse() {
    return issuerResponse;
  }



  public void setIssuerResponse(IssuerResponse issuerResponse) {
    this.issuerResponse = issuerResponse;
  }


  public Payment issuerApprovedAmount(String issuerApprovedAmount) {
    
    this.issuerApprovedAmount = issuerApprovedAmount;
    return this;
  }

   /**
   * The actual approved amount. This field should be filled in when the message has already passed through the issuer (e.g. post-authorization). For transaction/authorization this amount refers to the amount that was locked on the card-holders account.
   * @return issuerApprovedAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1234", value = "The actual approved amount. This field should be filled in when the message has already passed through the issuer (e.g. post-authorization). For transaction/authorization this amount refers to the amount that was locked on the card-holders account.")

  public String getIssuerApprovedAmount() {
    return issuerApprovedAmount;
  }



  public void setIssuerApprovedAmount(String issuerApprovedAmount) {
    this.issuerApprovedAmount = issuerApprovedAmount;
  }


  public Payment issuerCardBalance(String issuerCardBalance) {
    
    this.issuerCardBalance = issuerCardBalance;
    return this;
  }

   /**
   * The payment methods account balance if available. This field should be filled in when the message has already passed through the issuer (e.g. post-authorization).
   * @return issuerCardBalance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2000", value = "The payment methods account balance if available. This field should be filled in when the message has already passed through the issuer (e.g. post-authorization).")

  public String getIssuerCardBalance() {
    return issuerCardBalance;
  }



  public void setIssuerCardBalance(String issuerCardBalance) {
    this.issuerCardBalance = issuerCardBalance;
  }


  public Payment verificationAvs(VerificationAvs verificationAvs) {
    
    this.verificationAvs = verificationAvs;
    return this;
  }

   /**
   * Get verificationAvs
   * @return verificationAvs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VerificationAvs getVerificationAvs() {
    return verificationAvs;
  }



  public void setVerificationAvs(VerificationAvs verificationAvs) {
    this.verificationAvs = verificationAvs;
  }


  public Payment verification3ds(Verification3ds verification3ds) {
    
    this.verification3ds = verification3ds;
    return this;
  }

   /**
   * Get verification3ds
   * @return verification3ds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Verification3ds getVerification3ds() {
    return verification3ds;
  }



  public void setVerification3ds(Verification3ds verification3ds) {
    this.verification3ds = verification3ds;
  }


  public Payment verificationCvv(VerificationCvv verificationCvv) {
    
    this.verificationCvv = verificationCvv;
    return this;
  }

   /**
   * Get verificationCvv
   * @return verificationCvv
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VerificationCvv getVerificationCvv() {
    return verificationCvv;
  }



  public void setVerificationCvv(VerificationCvv verificationCvv) {
    this.verificationCvv = verificationCvv;
  }


  public Payment userDefined(Object userDefined) {
    
    this.userDefined = userDefined;
    return this;
  }

   /**
   * A JSON object that carries any additional information that might be helpful for fraud detection.
   * @return userDefined
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"failedPinAttempts\":3}", value = "A JSON object that carries any additional information that might be helpful for fraud detection.")

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
    Payment payment = (Payment) o;
    return Objects.equals(this.paymentType, payment.paymentType) &&
        Objects.equals(this.method, payment.method) &&
        Objects.equals(this.pinPresent, payment.pinPresent) &&
        Objects.equals(this.entryMethod, payment.entryMethod) &&
        Objects.equals(this.issuerResponse, payment.issuerResponse) &&
        Objects.equals(this.issuerApprovedAmount, payment.issuerApprovedAmount) &&
        Objects.equals(this.issuerCardBalance, payment.issuerCardBalance) &&
        Objects.equals(this.verificationAvs, payment.verificationAvs) &&
        Objects.equals(this.verification3ds, payment.verification3ds) &&
        Objects.equals(this.verificationCvv, payment.verificationCvv) &&
        Objects.equals(this.userDefined, payment.userDefined);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentType, method, pinPresent, entryMethod, issuerResponse, issuerApprovedAmount, issuerCardBalance, verificationAvs, verification3ds, verificationCvv, userDefined);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Payment {\n");
    sb.append("    paymentType: ").append(toIndentedString(paymentType)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    pinPresent: ").append(toIndentedString(pinPresent)).append("\n");
    sb.append("    entryMethod: ").append(toIndentedString(entryMethod)).append("\n");
    sb.append("    issuerResponse: ").append(toIndentedString(issuerResponse)).append("\n");
    sb.append("    issuerApprovedAmount: ").append(toIndentedString(issuerApprovedAmount)).append("\n");
    sb.append("    issuerCardBalance: ").append(toIndentedString(issuerCardBalance)).append("\n");
    sb.append("    verificationAvs: ").append(toIndentedString(verificationAvs)).append("\n");
    sb.append("    verification3ds: ").append(toIndentedString(verification3ds)).append("\n");
    sb.append("    verificationCvv: ").append(toIndentedString(verificationCvv)).append("\n");
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

