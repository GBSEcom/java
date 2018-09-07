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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Submit the result of the authentication managed outside of The Gateway. For more convenient usage without implementing 3-D Secure yourself see \&quot;authenticationRequest\&quot; section
 */
@ApiModel(description = "Submit the result of the authentication managed outside of The Gateway. For more convenient usage without implementing 3-D Secure yourself see \"authenticationRequest\" section")

public class PaymentCardAuthenticationResult {
  /**
   * Type of authentication result. For example, 3-D Secure.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    _3D("SECURE_3D");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("type")
  private TypeEnum type = null;

  /**
   * Card enrollment result from the Verification Response (VeRes)
   */
  @JsonAdapter(VerificationResponseEnum.Adapter.class)
  public enum VerificationResponseEnum {
    Y("Y"),
    
    N("N"),
    
    U("U");

    private String value;

    VerificationResponseEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static VerificationResponseEnum fromValue(String text) {
      for (VerificationResponseEnum b : VerificationResponseEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<VerificationResponseEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final VerificationResponseEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public VerificationResponseEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return VerificationResponseEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("verificationResponse")
  private VerificationResponseEnum verificationResponse = null;

  /**
   * Payer authentication result from Payment Authentication Response (PaRes)
   */
  @JsonAdapter(PayerAuthenticationResponseEnum.Adapter.class)
  public enum PayerAuthenticationResponseEnum {
    Y("Y"),
    
    N("N"),
    
    U("U"),
    
    A("A");

    private String value;

    PayerAuthenticationResponseEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PayerAuthenticationResponseEnum fromValue(String text) {
      for (PayerAuthenticationResponseEnum b : PayerAuthenticationResponseEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<PayerAuthenticationResponseEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PayerAuthenticationResponseEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PayerAuthenticationResponseEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return PayerAuthenticationResponseEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("payerAuthenticationResponse")
  private PayerAuthenticationResponseEnum payerAuthenticationResponse = null;

  @SerializedName("authenticationValue")
  private String authenticationValue = null;

  @SerializedName("xid")
  private String xid = null;

  public PaymentCardAuthenticationResult type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Type of authentication result. For example, 3-D Secure.
   * @return type
  **/
  @ApiModelProperty(value = "Type of authentication result. For example, 3-D Secure.")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public PaymentCardAuthenticationResult verificationResponse(VerificationResponseEnum verificationResponse) {
    this.verificationResponse = verificationResponse;
    return this;
  }

   /**
   * Card enrollment result from the Verification Response (VeRes)
   * @return verificationResponse
  **/
  @ApiModelProperty(value = "Card enrollment result from the Verification Response (VeRes)")
  public VerificationResponseEnum getVerificationResponse() {
    return verificationResponse;
  }

  public void setVerificationResponse(VerificationResponseEnum verificationResponse) {
    this.verificationResponse = verificationResponse;
  }

  public PaymentCardAuthenticationResult payerAuthenticationResponse(PayerAuthenticationResponseEnum payerAuthenticationResponse) {
    this.payerAuthenticationResponse = payerAuthenticationResponse;
    return this;
  }

   /**
   * Payer authentication result from Payment Authentication Response (PaRes)
   * @return payerAuthenticationResponse
  **/
  @ApiModelProperty(value = "Payer authentication result from Payment Authentication Response (PaRes)")
  public PayerAuthenticationResponseEnum getPayerAuthenticationResponse() {
    return payerAuthenticationResponse;
  }

  public void setPayerAuthenticationResponse(PayerAuthenticationResponseEnum payerAuthenticationResponse) {
    this.payerAuthenticationResponse = payerAuthenticationResponse;
  }

  public PaymentCardAuthenticationResult authenticationValue(String authenticationValue) {
    this.authenticationValue = authenticationValue;
    return this;
  }

   /**
   * Cardholder Authentication Verification Value (CAVV)
   * @return authenticationValue
  **/
  @ApiModelProperty(value = "Cardholder Authentication Verification Value (CAVV)")
  public String getAuthenticationValue() {
    return authenticationValue;
  }

  public void setAuthenticationValue(String authenticationValue) {
    this.authenticationValue = authenticationValue;
  }

  public PaymentCardAuthenticationResult xid(String xid) {
    this.xid = xid;
    return this;
  }

   /**
   * Authentication ID
   * @return xid
  **/
  @ApiModelProperty(value = "Authentication ID")
  public String getXid() {
    return xid;
  }

  public void setXid(String xid) {
    this.xid = xid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentCardAuthenticationResult paymentCardAuthenticationResult = (PaymentCardAuthenticationResult) o;
    return Objects.equals(this.type, paymentCardAuthenticationResult.type) &&
        Objects.equals(this.verificationResponse, paymentCardAuthenticationResult.verificationResponse) &&
        Objects.equals(this.payerAuthenticationResponse, paymentCardAuthenticationResult.payerAuthenticationResponse) &&
        Objects.equals(this.authenticationValue, paymentCardAuthenticationResult.authenticationValue) &&
        Objects.equals(this.xid, paymentCardAuthenticationResult.xid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, verificationResponse, payerAuthenticationResponse, authenticationValue, xid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentCardAuthenticationResult {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    verificationResponse: ").append(toIndentedString(verificationResponse)).append("\n");
    sb.append("    payerAuthenticationResponse: ").append(toIndentedString(payerAuthenticationResponse)).append("\n");
    sb.append("    authenticationValue: ").append(toIndentedString(authenticationValue)).append("\n");
    sb.append("    xid: ").append(toIndentedString(xid)).append("\n");
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
