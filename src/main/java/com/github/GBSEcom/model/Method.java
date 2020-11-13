/*
 * Payment Gateway API Specification.
 * The documentation here is designed to provide all of the technical guidance required to consume and integrate with our APIs for payment processing. To learn more about our APIs please visit https://docs.firstdata.com/org/gateway.
 *
 * The version of the OpenAPI document: 6.14.0.20201015.001
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.github.GBSEcom.model;

import java.util.Objects;
import java.util.Arrays;
import com.github.GBSEcom.model.Card;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Info about the payment method.
 */
@ApiModel(description = "Info about the payment method.")

public class Method {
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

  public static final String SERIALIZED_NAME_METHOD_ALIAS = "methodAlias";
  @SerializedName(SERIALIZED_NAME_METHOD_ALIAS)
  private String methodAlias;

  public static final String SERIALIZED_NAME_CARD = "card";
  @SerializedName(SERIALIZED_NAME_CARD)
  private Card card;

  public static final String SERIALIZED_NAME_PROVIDER = "provider";
  @SerializedName(SERIALIZED_NAME_PROVIDER)
  private String provider;

  public static final String SERIALIZED_NAME_USER_DEFINED = "userDefined";
  @SerializedName(SERIALIZED_NAME_USER_DEFINED)
  private Object userDefined;


  public Method methodType(MethodTypeEnum methodType) {
    
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


  public Method methodId(String methodId) {
    
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


  public Method methodAlias(String methodAlias) {
    
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


  public Method card(Card card) {
    
    this.card = card;
    return this;
  }

   /**
   * Get card
   * @return card
  **/
  @ApiModelProperty(required = true, value = "")

  public Card getCard() {
    return card;
  }



  public void setCard(Card card) {
    this.card = card;
  }


  public Method provider(String provider) {
    
    this.provider = provider;
    return this;
  }

   /**
   * The wallet provider. This field should be normalized before sending through the API.
   * @return provider
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "apple", value = "The wallet provider. This field should be normalized before sending through the API.")

  public String getProvider() {
    return provider;
  }



  public void setProvider(String provider) {
    this.provider = provider;
  }


  public Method userDefined(Object userDefined) {
    
    this.userDefined = userDefined;
    return this;
  }

   /**
   * A JSON object that can carry any additional information about the method that might be helpful for fraud detection.
   * @return userDefined
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"phoneBrand\":\"samsung\"}", value = "A JSON object that can carry any additional information about the method that might be helpful for fraud detection.")

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
    Method method = (Method) o;
    return Objects.equals(this.methodType, method.methodType) &&
        Objects.equals(this.methodId, method.methodId) &&
        Objects.equals(this.methodAlias, method.methodAlias) &&
        Objects.equals(this.card, method.card) &&
        Objects.equals(this.provider, method.provider) &&
        Objects.equals(this.userDefined, method.userDefined);
  }

  @Override
  public int hashCode() {
    return Objects.hash(methodType, methodId, methodAlias, card, provider, userDefined);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Method {\n");
    sb.append("    methodType: ").append(toIndentedString(methodType)).append("\n");
    sb.append("    methodId: ").append(toIndentedString(methodId)).append("\n");
    sb.append("    methodAlias: ").append(toIndentedString(methodAlias)).append("\n");
    sb.append("    card: ").append(toIndentedString(card)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
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

