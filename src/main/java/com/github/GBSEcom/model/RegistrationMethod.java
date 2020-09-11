/*
 * Payment Gateway API Specification.
 * The documentation here is designed to provide all of the technical guidance required to consume and integrate with our APIs for payment processing. To learn more about our APIs please visit https://docs.firstdata.com/org/gateway.
 *
 * The version of the OpenAPI document: 6.13.0.20200810.001
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.github.GBSEcom.model;

import java.util.Objects;
import java.util.Arrays;
import com.github.GBSEcom.model.FraudAddress;
import com.github.GBSEcom.model.FraudRegistrationCard;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * A JSON object that holds info about the payment registration method.
 */
@ApiModel(description = "A JSON object that holds info about the payment registration method.")

public class RegistrationMethod {
  /**
   * Unique ID for the payment method type.
   */
  @JsonAdapter(MethodTypeEnum.Adapter.class)
  public enum MethodTypeEnum {
    CARD("method/card"),
    
    WALLET("method/wallet");

    private String value;

    MethodTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MethodTypeEnum fromValue(String value) {
      for (MethodTypeEnum b : MethodTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<MethodTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MethodTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MethodTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return MethodTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_METHOD_TYPE = "methodType";
  @SerializedName(SERIALIZED_NAME_METHOD_TYPE)
  private MethodTypeEnum methodType;

  public static final String SERIALIZED_NAME_METHOD_ID = "methodId";
  @SerializedName(SERIALIZED_NAME_METHOD_ID)
  private String methodId;

  public static final String SERIALIZED_NAME_USER_DEFINED = "userDefined";
  @SerializedName(SERIALIZED_NAME_USER_DEFINED)
  private Object userDefined;

  public static final String SERIALIZED_NAME_BILLING_PHONE_NUMBER = "billingPhoneNumber";
  @SerializedName(SERIALIZED_NAME_BILLING_PHONE_NUMBER)
  private String billingPhoneNumber;

  public static final String SERIALIZED_NAME_METHOD_ALIAS = "methodAlias";
  @SerializedName(SERIALIZED_NAME_METHOD_ALIAS)
  private String methodAlias;

  public static final String SERIALIZED_NAME_CARD = "card";
  @SerializedName(SERIALIZED_NAME_CARD)
  private FraudRegistrationCard card;

  public static final String SERIALIZED_NAME_METHOD_ADDRESS = "methodAddress";
  @SerializedName(SERIALIZED_NAME_METHOD_ADDRESS)
  private FraudAddress methodAddress;


  public RegistrationMethod methodType(MethodTypeEnum methodType) {
    
    this.methodType = methodType;
    return this;
  }

   /**
   * Unique ID for the payment method type.
   * @return methodType
  **/
  @ApiModelProperty(example = "method/card", required = true, value = "Unique ID for the payment method type.")

  public MethodTypeEnum getMethodType() {
    return methodType;
  }



  public void setMethodType(MethodTypeEnum methodType) {
    this.methodType = methodType;
  }


  public RegistrationMethod methodId(String methodId) {
    
    this.methodId = methodId;
    return this;
  }

   /**
   * The unique ID of this payment method if it was previously registered with a registration/method or if it is currently being registered. Must be unique for the entire system (not just within a specific merchant or industry). Mandatory if being used inside a registration/method.
   * @return methodId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "300fa792-bf5f-418e-aa74-d5b3c81298d2", value = "The unique ID of this payment method if it was previously registered with a registration/method or if it is currently being registered. Must be unique for the entire system (not just within a specific merchant or industry). Mandatory if being used inside a registration/method.")

  public String getMethodId() {
    return methodId;
  }



  public void setMethodId(String methodId) {
    this.methodId = methodId;
  }


  public RegistrationMethod userDefined(Object userDefined) {
    
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


  public RegistrationMethod billingPhoneNumber(String billingPhoneNumber) {
    
    this.billingPhoneNumber = billingPhoneNumber;
    return this;
  }

   /**
   * The address that should be used to send billing information for this payment method.
   * @return billingPhoneNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123456789", value = "The address that should be used to send billing information for this payment method.")

  public String getBillingPhoneNumber() {
    return billingPhoneNumber;
  }



  public void setBillingPhoneNumber(String billingPhoneNumber) {
    this.billingPhoneNumber = billingPhoneNumber;
  }


  public RegistrationMethod methodAlias(String methodAlias) {
    
    this.methodAlias = methodAlias;
    return this;
  }

   /**
   * The address that should be used to send billing information for this payment method.
   * @return methodAlias
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "card one", value = "The address that should be used to send billing information for this payment method.")

  public String getMethodAlias() {
    return methodAlias;
  }



  public void setMethodAlias(String methodAlias) {
    this.methodAlias = methodAlias;
  }


  public RegistrationMethod card(FraudRegistrationCard card) {
    
    this.card = card;
    return this;
  }

   /**
   * Get card
   * @return card
  **/
  @ApiModelProperty(required = true, value = "")

  public FraudRegistrationCard getCard() {
    return card;
  }



  public void setCard(FraudRegistrationCard card) {
    this.card = card;
  }


  public RegistrationMethod methodAddress(FraudAddress methodAddress) {
    
    this.methodAddress = methodAddress;
    return this;
  }

   /**
   * Get methodAddress
   * @return methodAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FraudAddress getMethodAddress() {
    return methodAddress;
  }



  public void setMethodAddress(FraudAddress methodAddress) {
    this.methodAddress = methodAddress;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RegistrationMethod registrationMethod = (RegistrationMethod) o;
    return Objects.equals(this.methodType, registrationMethod.methodType) &&
        Objects.equals(this.methodId, registrationMethod.methodId) &&
        Objects.equals(this.userDefined, registrationMethod.userDefined) &&
        Objects.equals(this.billingPhoneNumber, registrationMethod.billingPhoneNumber) &&
        Objects.equals(this.methodAlias, registrationMethod.methodAlias) &&
        Objects.equals(this.card, registrationMethod.card) &&
        Objects.equals(this.methodAddress, registrationMethod.methodAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(methodType, methodId, userDefined, billingPhoneNumber, methodAlias, card, methodAddress);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegistrationMethod {\n");
    sb.append("    methodType: ").append(toIndentedString(methodType)).append("\n");
    sb.append("    methodId: ").append(toIndentedString(methodId)).append("\n");
    sb.append("    userDefined: ").append(toIndentedString(userDefined)).append("\n");
    sb.append("    billingPhoneNumber: ").append(toIndentedString(billingPhoneNumber)).append("\n");
    sb.append("    methodAlias: ").append(toIndentedString(methodAlias)).append("\n");
    sb.append("    card: ").append(toIndentedString(card)).append("\n");
    sb.append("    methodAddress: ").append(toIndentedString(methodAddress)).append("\n");
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

