/*
 * Payment Gateway API Specification.
 * The documentation here is designed to provide all of the technical guidance required to consume and integrate with our APIs for payment processing. To learn more about our APIs please visit https://docs.firstdata.com/org/gateway.
 *
 * OpenAPI spec version: 6.6.0.20190329.001
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.github.GBSEcom.model;

import java.util.Objects;
import java.util.Arrays;
import com.github.GBSEcom.model.AVSResponse;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Model for processor data.
 */
@ApiModel(description = "Model for processor data.")

public class ProcessorData {
  public static final String SERIALIZED_NAME_REFERENCE_NUMBER = "referenceNumber";
  @SerializedName(SERIALIZED_NAME_REFERENCE_NUMBER)
  private String referenceNumber;

  public static final String SERIALIZED_NAME_AUTHORIZATION_CODE = "authorizationCode";
  @SerializedName(SERIALIZED_NAME_AUTHORIZATION_CODE)
  private String authorizationCode;

  public static final String SERIALIZED_NAME_RESPONSE_CODE = "responseCode";
  @SerializedName(SERIALIZED_NAME_RESPONSE_CODE)
  private String responseCode;

  public static final String SERIALIZED_NAME_NETWORK = "network";
  @SerializedName(SERIALIZED_NAME_NETWORK)
  private String network;

  public static final String SERIALIZED_NAME_ASSOCIATION_RESPONSE_CODE = "associationResponseCode";
  @SerializedName(SERIALIZED_NAME_ASSOCIATION_RESPONSE_CODE)
  private String associationResponseCode;

  public static final String SERIALIZED_NAME_RESPONSE_MESSAGE = "responseMessage";
  @SerializedName(SERIALIZED_NAME_RESPONSE_MESSAGE)
  private String responseMessage;

  public static final String SERIALIZED_NAME_AVS_RESPONSE = "avsResponse";
  @SerializedName(SERIALIZED_NAME_AVS_RESPONSE)
  private AVSResponse avsResponse = null;

  /**
   * Code returned for CVV.
   */
  @JsonAdapter(SecurityCodeResponseEnum.Adapter.class)
  public enum SecurityCodeResponseEnum {
    MATCHED("MATCHED"),
    
    NOT_MATCHED("NOT_MATCHED"),
    
    NOT_PROCESSED("NOT_PROCESSED"),
    
    NOT_PRESENT("NOT_PRESENT"),
    
    NOT_CERTIFIED("NOT_CERTIFIED");

    private String value;

    SecurityCodeResponseEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SecurityCodeResponseEnum fromValue(String text) {
      for (SecurityCodeResponseEnum b : SecurityCodeResponseEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }

    public static class Adapter extends TypeAdapter<SecurityCodeResponseEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SecurityCodeResponseEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SecurityCodeResponseEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return SecurityCodeResponseEnum.fromValue(String.valueOf(value));
      }
    }
  }

  public static final String SERIALIZED_NAME_SECURITY_CODE_RESPONSE = "securityCodeResponse";
  @SerializedName(SERIALIZED_NAME_SECURITY_CODE_RESPONSE)
  private SecurityCodeResponseEnum securityCodeResponse;

  public static final String SERIALIZED_NAME_MERCHANT_ADVICE_CODE_INDICATOR = "merchantAdviceCodeIndicator";
  @SerializedName(SERIALIZED_NAME_MERCHANT_ADVICE_CODE_INDICATOR)
  private String merchantAdviceCodeIndicator;

  public ProcessorData referenceNumber(String referenceNumber) {
    this.referenceNumber = referenceNumber;
    return this;
  }

   /**
   * Reference transaction ID.
   * @return referenceNumber
  **/
  @ApiModelProperty(example = "811720726601", value = "Reference transaction ID.")
  public String getReferenceNumber() {
    return referenceNumber;
  }

  public void setReferenceNumber(String referenceNumber) {
    this.referenceNumber = referenceNumber;
  }

  public ProcessorData authorizationCode(String authorizationCode) {
    this.authorizationCode = authorizationCode;
    return this;
  }

   /**
   * Code returned to confirm transaction.
   * @return authorizationCode
  **/
  @ApiModelProperty(example = "OK7118", value = "Code returned to confirm transaction.")
  public String getAuthorizationCode() {
    return authorizationCode;
  }

  public void setAuthorizationCode(String authorizationCode) {
    this.authorizationCode = authorizationCode;
  }

  public ProcessorData responseCode(String responseCode) {
    this.responseCode = responseCode;
    return this;
  }

   /**
   * Response code from endpoints.
   * @return responseCode
  **/
  @ApiModelProperty(example = "00", value = "Response code from endpoints.")
  public String getResponseCode() {
    return responseCode;
  }

  public void setResponseCode(String responseCode) {
    this.responseCode = responseCode;
  }

  public ProcessorData network(String network) {
    this.network = network;
    return this;
  }

   /**
   * Network used for transaction.
   * @return network
  **/
  @ApiModelProperty(example = "NYCE", value = "Network used for transaction.")
  public String getNetwork() {
    return network;
  }

  public void setNetwork(String network) {
    this.network = network;
  }

  public ProcessorData associationResponseCode(String associationResponseCode) {
    this.associationResponseCode = associationResponseCode;
    return this;
  }

   /**
   * Raw response code from issuer.
   * @return associationResponseCode
  **/
  @ApiModelProperty(example = "000", value = "Raw response code from issuer.")
  public String getAssociationResponseCode() {
    return associationResponseCode;
  }

  public void setAssociationResponseCode(String associationResponseCode) {
    this.associationResponseCode = associationResponseCode;
  }

  public ProcessorData responseMessage(String responseMessage) {
    this.responseMessage = responseMessage;
    return this;
  }

   /**
   * Message returned from endpoints.
   * @return responseMessage
  **/
  @ApiModelProperty(example = "Amount specified exceeds allowable limit.", value = "Message returned from endpoints.")
  public String getResponseMessage() {
    return responseMessage;
  }

  public void setResponseMessage(String responseMessage) {
    this.responseMessage = responseMessage;
  }

  public ProcessorData avsResponse(AVSResponse avsResponse) {
    this.avsResponse = avsResponse;
    return this;
  }

   /**
   * Get avsResponse
   * @return avsResponse
  **/
  @ApiModelProperty(value = "")
  public AVSResponse getAvsResponse() {
    return avsResponse;
  }

  public void setAvsResponse(AVSResponse avsResponse) {
    this.avsResponse = avsResponse;
  }

  public ProcessorData securityCodeResponse(SecurityCodeResponseEnum securityCodeResponse) {
    this.securityCodeResponse = securityCodeResponse;
    return this;
  }

   /**
   * Code returned for CVV.
   * @return securityCodeResponse
  **/
  @ApiModelProperty(example = "NOT_MATCHED", value = "Code returned for CVV.")
  public SecurityCodeResponseEnum getSecurityCodeResponse() {
    return securityCodeResponse;
  }

  public void setSecurityCodeResponse(SecurityCodeResponseEnum securityCodeResponse) {
    this.securityCodeResponse = securityCodeResponse;
  }

  public ProcessorData merchantAdviceCodeIndicator(String merchantAdviceCodeIndicator) {
    this.merchantAdviceCodeIndicator = merchantAdviceCodeIndicator;
    return this;
  }

   /**
   * Code to map merchant advice code to ISO specification.
   * @return merchantAdviceCodeIndicator
  **/
  @ApiModelProperty(example = "01", value = "Code to map merchant advice code to ISO specification.")
  public String getMerchantAdviceCodeIndicator() {
    return merchantAdviceCodeIndicator;
  }

  public void setMerchantAdviceCodeIndicator(String merchantAdviceCodeIndicator) {
    this.merchantAdviceCodeIndicator = merchantAdviceCodeIndicator;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProcessorData processorData = (ProcessorData) o;
    return Objects.equals(this.referenceNumber, processorData.referenceNumber) &&
        Objects.equals(this.authorizationCode, processorData.authorizationCode) &&
        Objects.equals(this.responseCode, processorData.responseCode) &&
        Objects.equals(this.network, processorData.network) &&
        Objects.equals(this.associationResponseCode, processorData.associationResponseCode) &&
        Objects.equals(this.responseMessage, processorData.responseMessage) &&
        Objects.equals(this.avsResponse, processorData.avsResponse) &&
        Objects.equals(this.securityCodeResponse, processorData.securityCodeResponse) &&
        Objects.equals(this.merchantAdviceCodeIndicator, processorData.merchantAdviceCodeIndicator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(referenceNumber, authorizationCode, responseCode, network, associationResponseCode, responseMessage, avsResponse, securityCodeResponse, merchantAdviceCodeIndicator);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessorData {\n");
    
    sb.append("    referenceNumber: ").append(toIndentedString(referenceNumber)).append("\n");
    sb.append("    authorizationCode: ").append(toIndentedString(authorizationCode)).append("\n");
    sb.append("    responseCode: ").append(toIndentedString(responseCode)).append("\n");
    sb.append("    network: ").append(toIndentedString(network)).append("\n");
    sb.append("    associationResponseCode: ").append(toIndentedString(associationResponseCode)).append("\n");
    sb.append("    responseMessage: ").append(toIndentedString(responseMessage)).append("\n");
    sb.append("    avsResponse: ").append(toIndentedString(avsResponse)).append("\n");
    sb.append("    securityCodeResponse: ").append(toIndentedString(securityCodeResponse)).append("\n");
    sb.append("    merchantAdviceCodeIndicator: ").append(toIndentedString(merchantAdviceCodeIndicator)).append("\n");
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

