/*
 * Payment Gateway API Specification.
 * The documentation here is designed to provide all of the technical guidance required to consume and integrate with our APIs for payment processing. To learn more about our APIs please visit https://docs.firstdata.com/org/gateway.
 *
 * The version of the OpenAPI document: 21.2.0.20210406.001
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
import com.github.GBSEcom.model.Secure3D21AuthenticationResultAllOf;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Submit the result of the authentication managed outside of the gateway for a 3-D Secure 2.x scheme. For more convenient usage without implementing 3-D Secure yourself see \&quot;authenticationRequest\&quot; section. DEPRECATED - use Secure3DAuthenticationResult instead
 */
@ApiModel(description = "Submit the result of the authentication managed outside of the gateway for a 3-D Secure 2.x scheme. For more convenient usage without implementing 3-D Secure yourself see \"authenticationRequest\" section. DEPRECATED - use Secure3DAuthenticationResult instead")

public class Secure3D21AuthenticationResult extends AuthenticationResult {
  public static final String SERIALIZED_NAME_CAVV = "cavv";
  @SerializedName(SERIALIZED_NAME_CAVV)
  private String cavv;

  public static final String SERIALIZED_NAME_XID = "xid";
  @SerializedName(SERIALIZED_NAME_XID)
  private String xid;

  public static final String SERIALIZED_NAME_TRANSACTION_ID = "transactionId";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_ID)
  private String transactionId;

  /**
   * The result of authentication attempt returned by the 3D Secure authentication process (PaRes).
   */
  @JsonAdapter(AuthenticationResponseEnum.Adapter.class)
  public enum AuthenticationResponseEnum {
    A("A"),
    
    N("N"),
    
    U("U"),
    
    Y("Y"),
    
    C("C"),
    
    R("R");

    private String value;

    AuthenticationResponseEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AuthenticationResponseEnum fromValue(String value) {
      for (AuthenticationResponseEnum b : AuthenticationResponseEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<AuthenticationResponseEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AuthenticationResponseEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AuthenticationResponseEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return AuthenticationResponseEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_AUTHENTICATION_RESPONSE = "authenticationResponse";
  @SerializedName(SERIALIZED_NAME_AUTHENTICATION_RESPONSE)
  private AuthenticationResponseEnum authenticationResponse = AuthenticationResponseEnum.Y;

  /**
   * The transaction status as returned by the 3D Secure authentication process.
   */
  @JsonAdapter(TransactionStatusEnum.Adapter.class)
  public enum TransactionStatusEnum {
    A("A"),
    
    N("N"),
    
    U("U"),
    
    Y("Y"),
    
    C("C"),
    
    R("R");

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


  public Secure3D21AuthenticationResult cavv(String cavv) {
    
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


  public Secure3D21AuthenticationResult xid(String xid) {
    
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


  public Secure3D21AuthenticationResult transactionId(String transactionId) {
    
    this.transactionId = transactionId;
    return this;
  }

   /**
   * The response transaction UUID. Only applicable to MasterCard.
   * @return transactionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "f38e6948-5388-41a6-bca4-b49723c19437", value = "The response transaction UUID. Only applicable to MasterCard.")

  public String getTransactionId() {
    return transactionId;
  }



  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }


  public Secure3D21AuthenticationResult authenticationResponse(AuthenticationResponseEnum authenticationResponse) {
    
    this.authenticationResponse = authenticationResponse;
    return this;
  }

   /**
   * The result of authentication attempt returned by the 3D Secure authentication process (PaRes).
   * @return authenticationResponse
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "A", value = "The result of authentication attempt returned by the 3D Secure authentication process (PaRes).")

  public AuthenticationResponseEnum getAuthenticationResponse() {
    return authenticationResponse;
  }



  public void setAuthenticationResponse(AuthenticationResponseEnum authenticationResponse) {
    this.authenticationResponse = authenticationResponse;
  }


  public Secure3D21AuthenticationResult transactionStatus(TransactionStatusEnum transactionStatus) {
    
    this.transactionStatus = transactionStatus;
    return this;
  }

   /**
   * The transaction status as returned by the 3D Secure authentication process.
   * @return transactionStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "A", value = "The transaction status as returned by the 3D Secure authentication process.")

  public TransactionStatusEnum getTransactionStatus() {
    return transactionStatus;
  }



  public void setTransactionStatus(TransactionStatusEnum transactionStatus) {
    this.transactionStatus = transactionStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Secure3D21AuthenticationResult secure3D21AuthenticationResult = (Secure3D21AuthenticationResult) o;
    return Objects.equals(this.cavv, secure3D21AuthenticationResult.cavv) &&
        Objects.equals(this.xid, secure3D21AuthenticationResult.xid) &&
        Objects.equals(this.transactionId, secure3D21AuthenticationResult.transactionId) &&
        Objects.equals(this.authenticationResponse, secure3D21AuthenticationResult.authenticationResponse) &&
        Objects.equals(this.transactionStatus, secure3D21AuthenticationResult.transactionStatus) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cavv, xid, transactionId, authenticationResponse, transactionStatus, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Secure3D21AuthenticationResult {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    cavv: ").append(toIndentedString(cavv)).append("\n");
    sb.append("    xid: ").append(toIndentedString(xid)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    authenticationResponse: ").append(toIndentedString(authenticationResponse)).append("\n");
    sb.append("    transactionStatus: ").append(toIndentedString(transactionStatus)).append("\n");
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

