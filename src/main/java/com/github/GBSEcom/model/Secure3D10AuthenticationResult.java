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
import com.github.GBSEcom.model.AuthenticationResult;
import com.github.GBSEcom.model.Secure3D10AuthenticationResultAllOf;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Submit the result of the authentication managed outside of the gateway for a 3-D Secure 1.0 scheme. For more convenient usage without implementing 3-D Secure yourself see \&quot;authenticationRequest\&quot; section. DEPRECATED - use Secure3DAuthenticationResult instead
 */
@ApiModel(description = "Submit the result of the authentication managed outside of the gateway for a 3-D Secure 1.0 scheme. For more convenient usage without implementing 3-D Secure yourself see \"authenticationRequest\" section. DEPRECATED - use Secure3DAuthenticationResult instead")

public class Secure3D10AuthenticationResult extends AuthenticationResult {
  /**
   * Card enrollment result from the Verification Response (VeRes).
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

    public static VerificationResponseEnum fromValue(String value) {
      for (VerificationResponseEnum b : VerificationResponseEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<VerificationResponseEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final VerificationResponseEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public VerificationResponseEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return VerificationResponseEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_VERIFICATION_RESPONSE = "verificationResponse";
  @SerializedName(SERIALIZED_NAME_VERIFICATION_RESPONSE)
  private VerificationResponseEnum verificationResponse;

  /**
   * Result of authentication attempt from Payer Authentication Response (PaRes).
   */
  @JsonAdapter(AuthenticationAttemptResultEnum.Adapter.class)
  public enum AuthenticationAttemptResultEnum {
    Y("Y"),
    
    N("N"),
    
    U("U"),
    
    A("A");

    private String value;

    AuthenticationAttemptResultEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AuthenticationAttemptResultEnum fromValue(String value) {
      for (AuthenticationAttemptResultEnum b : AuthenticationAttemptResultEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<AuthenticationAttemptResultEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AuthenticationAttemptResultEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AuthenticationAttemptResultEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return AuthenticationAttemptResultEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_AUTHENTICATION_ATTEMPT_RESULT = "authenticationAttemptResult";
  @SerializedName(SERIALIZED_NAME_AUTHENTICATION_ATTEMPT_RESULT)
  private AuthenticationAttemptResultEnum authenticationAttemptResult;

  public static final String SERIALIZED_NAME_CAVV = "cavv";
  @SerializedName(SERIALIZED_NAME_CAVV)
  private String cavv;

  public static final String SERIALIZED_NAME_XID = "xid";
  @SerializedName(SERIALIZED_NAME_XID)
  private String xid;


  public Secure3D10AuthenticationResult verificationResponse(VerificationResponseEnum verificationResponse) {
    
    this.verificationResponse = verificationResponse;
    return this;
  }

   /**
   * Card enrollment result from the Verification Response (VeRes).
   * @return verificationResponse
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "N", value = "Card enrollment result from the Verification Response (VeRes).")

  public VerificationResponseEnum getVerificationResponse() {
    return verificationResponse;
  }



  public void setVerificationResponse(VerificationResponseEnum verificationResponse) {
    this.verificationResponse = verificationResponse;
  }


  public Secure3D10AuthenticationResult authenticationAttemptResult(AuthenticationAttemptResultEnum authenticationAttemptResult) {
    
    this.authenticationAttemptResult = authenticationAttemptResult;
    return this;
  }

   /**
   * Result of authentication attempt from Payer Authentication Response (PaRes).
   * @return authenticationAttemptResult
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Y", value = "Result of authentication attempt from Payer Authentication Response (PaRes).")

  public AuthenticationAttemptResultEnum getAuthenticationAttemptResult() {
    return authenticationAttemptResult;
  }



  public void setAuthenticationAttemptResult(AuthenticationAttemptResultEnum authenticationAttemptResult) {
    this.authenticationAttemptResult = authenticationAttemptResult;
  }


  public Secure3D10AuthenticationResult cavv(String cavv) {
    
    this.cavv = cavv;
    return this;
  }

   /**
   * The Cardholder Authentication Verification Value (CAVV) is a cryptographic value derived by the issuer during payment authentication that can provide evidence of the results of payment authentication during an online purchase.
   * @return cavv
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "AAABCZIhcQAAAABZlyFxAAAAAAA", value = "The Cardholder Authentication Verification Value (CAVV) is a cryptographic value derived by the issuer during payment authentication that can provide evidence of the results of payment authentication during an online purchase.")

  public String getCavv() {
    return cavv;
  }



  public void setCavv(String cavv) {
    this.cavv = cavv;
  }


  public Secure3D10AuthenticationResult xid(String xid) {
    
    this.xid = xid;
    return this;
  }

   /**
   * The transaction identifier (XID) is a unique tracking number set by the merchant.
   * @return xid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "MfhxI43NrkuWQYLCoRWitYRDMYo", value = "The transaction identifier (XID) is a unique tracking number set by the merchant.")

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
    Secure3D10AuthenticationResult secure3D10AuthenticationResult = (Secure3D10AuthenticationResult) o;
    return Objects.equals(this.verificationResponse, secure3D10AuthenticationResult.verificationResponse) &&
        Objects.equals(this.authenticationAttemptResult, secure3D10AuthenticationResult.authenticationAttemptResult) &&
        Objects.equals(this.cavv, secure3D10AuthenticationResult.cavv) &&
        Objects.equals(this.xid, secure3D10AuthenticationResult.xid) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(verificationResponse, authenticationAttemptResult, cavv, xid, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Secure3D10AuthenticationResult {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    verificationResponse: ").append(toIndentedString(verificationResponse)).append("\n");
    sb.append("    authenticationAttemptResult: ").append(toIndentedString(authenticationAttemptResult)).append("\n");
    sb.append("    cavv: ").append(toIndentedString(cavv)).append("\n");
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

