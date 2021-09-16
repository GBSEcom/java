/*
 * Payment Gateway API Specification.
 * The documentation here is designed to provide all of the technical guidance required to consume and integrate with our APIs for payment processing. To learn more about our APIs please visit https://docs.firstdata.com/org/gateway.
 *
 * The version of the OpenAPI document: 21.4.0.20210824.002
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
 * Secure3DAuthenticationResultAllOf
 */

public class Secure3DAuthenticationResultAllOf {
  public static final String SERIALIZED_NAME_CAVV = "cavv";
  @SerializedName(SERIALIZED_NAME_CAVV)
  private String cavv;

  public static final String SERIALIZED_NAME_XID = "xid";
  @SerializedName(SERIALIZED_NAME_XID)
  private String xid;

  public static final String SERIALIZED_NAME_DS_TRANSACTION_ID = "dsTransactionId";
  @SerializedName(SERIALIZED_NAME_DS_TRANSACTION_ID)
  private String dsTransactionId;

  /**
   * The result of authentication attempt returned by the 3D Secure authentication process (ARes).
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
  private AuthenticationResponseEnum authenticationResponse;

  /**
   * The transaction status as returned by the 3D Secure authentication process. (CRes)
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

  /**
   * Indicates the message category of 3d secure authentication version 2.X. 01 &#x3D; Payment Authentication 02 &#x3D; Non-Payment Authentication 80 &#x3D; Mastercard Data Only 
   */
  @JsonAdapter(MessageCategoryEnum.Adapter.class)
  public enum MessageCategoryEnum {
    _01("01"),
    
    _02("02"),
    
    _80("80");

    private String value;

    MessageCategoryEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MessageCategoryEnum fromValue(String value) {
      for (MessageCategoryEnum b : MessageCategoryEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<MessageCategoryEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MessageCategoryEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MessageCategoryEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return MessageCategoryEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_MESSAGE_CATEGORY = "messageCategory";
  @SerializedName(SERIALIZED_NAME_MESSAGE_CATEGORY)
  private MessageCategoryEnum messageCategory;


  public Secure3DAuthenticationResultAllOf cavv(String cavv) {
    
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


  public Secure3DAuthenticationResultAllOf xid(String xid) {
    
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


  public Secure3DAuthenticationResultAllOf dsTransactionId(String dsTransactionId) {
    
    this.dsTransactionId = dsTransactionId;
    return this;
  }

   /**
   * The response transaction UUID from the DS (directory server)
   * @return dsTransactionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "f38e6948-5388-41a6-bca4-b49723c19437", value = "The response transaction UUID from the DS (directory server)")

  public String getDsTransactionId() {
    return dsTransactionId;
  }



  public void setDsTransactionId(String dsTransactionId) {
    this.dsTransactionId = dsTransactionId;
  }


  public Secure3DAuthenticationResultAllOf authenticationResponse(AuthenticationResponseEnum authenticationResponse) {
    
    this.authenticationResponse = authenticationResponse;
    return this;
  }

   /**
   * The result of authentication attempt returned by the 3D Secure authentication process (ARes).
   * @return authenticationResponse
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "A", value = "The result of authentication attempt returned by the 3D Secure authentication process (ARes).")

  public AuthenticationResponseEnum getAuthenticationResponse() {
    return authenticationResponse;
  }



  public void setAuthenticationResponse(AuthenticationResponseEnum authenticationResponse) {
    this.authenticationResponse = authenticationResponse;
  }


  public Secure3DAuthenticationResultAllOf transactionStatus(TransactionStatusEnum transactionStatus) {
    
    this.transactionStatus = transactionStatus;
    return this;
  }

   /**
   * The transaction status as returned by the 3D Secure authentication process. (CRes)
   * @return transactionStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "A", value = "The transaction status as returned by the 3D Secure authentication process. (CRes)")

  public TransactionStatusEnum getTransactionStatus() {
    return transactionStatus;
  }



  public void setTransactionStatus(TransactionStatusEnum transactionStatus) {
    this.transactionStatus = transactionStatus;
  }


  public Secure3DAuthenticationResultAllOf messageCategory(MessageCategoryEnum messageCategory) {
    
    this.messageCategory = messageCategory;
    return this;
  }

   /**
   * Indicates the message category of 3d secure authentication version 2.X. 01 &#x3D; Payment Authentication 02 &#x3D; Non-Payment Authentication 80 &#x3D; Mastercard Data Only 
   * @return messageCategory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "01", value = "Indicates the message category of 3d secure authentication version 2.X. 01 = Payment Authentication 02 = Non-Payment Authentication 80 = Mastercard Data Only ")

  public MessageCategoryEnum getMessageCategory() {
    return messageCategory;
  }



  public void setMessageCategory(MessageCategoryEnum messageCategory) {
    this.messageCategory = messageCategory;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Secure3DAuthenticationResultAllOf secure3DAuthenticationResultAllOf = (Secure3DAuthenticationResultAllOf) o;
    return Objects.equals(this.cavv, secure3DAuthenticationResultAllOf.cavv) &&
        Objects.equals(this.xid, secure3DAuthenticationResultAllOf.xid) &&
        Objects.equals(this.dsTransactionId, secure3DAuthenticationResultAllOf.dsTransactionId) &&
        Objects.equals(this.authenticationResponse, secure3DAuthenticationResultAllOf.authenticationResponse) &&
        Objects.equals(this.transactionStatus, secure3DAuthenticationResultAllOf.transactionStatus) &&
        Objects.equals(this.messageCategory, secure3DAuthenticationResultAllOf.messageCategory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cavv, xid, dsTransactionId, authenticationResponse, transactionStatus, messageCategory);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Secure3DAuthenticationResultAllOf {\n");
    sb.append("    cavv: ").append(toIndentedString(cavv)).append("\n");
    sb.append("    xid: ").append(toIndentedString(xid)).append("\n");
    sb.append("    dsTransactionId: ").append(toIndentedString(dsTransactionId)).append("\n");
    sb.append("    authenticationResponse: ").append(toIndentedString(authenticationResponse)).append("\n");
    sb.append("    transactionStatus: ").append(toIndentedString(transactionStatus)).append("\n");
    sb.append("    messageCategory: ").append(toIndentedString(messageCategory)).append("\n");
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

