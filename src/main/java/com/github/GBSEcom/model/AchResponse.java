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
 * ACH TeleCheck response.
 */
@ApiModel(description = "ACH TeleCheck response.")

public class AchResponse {
  public static final String SERIALIZED_NAME_RESPONSE_CODE = "responseCode";
  @SerializedName(SERIALIZED_NAME_RESPONSE_CODE)
  private String responseCode;

  public static final String SERIALIZED_NAME_APPROVAL_CODE = "approvalCode";
  @SerializedName(SERIALIZED_NAME_APPROVAL_CODE)
  private String approvalCode;

  public static final String SERIALIZED_NAME_REFERENCE_NUMBER = "referenceNumber";
  @SerializedName(SERIALIZED_NAME_REFERENCE_NUMBER)
  private String referenceNumber;

  public static final String SERIALIZED_NAME_PREFERRED_FLAG = "preferredFlag";
  @SerializedName(SERIALIZED_NAME_PREFERRED_FLAG)
  private String preferredFlag;

  public static final String SERIALIZED_NAME_TRANSACTION_STATUS = "transactionStatus";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_STATUS)
  private String transactionStatus;


  public AchResponse responseCode(String responseCode) {
    
    this.responseCode = responseCode;
    return this;
  }

   /**
   * Response code for TeleCheck authentication decision in the sale response message.
   * @return responseCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "49", value = "Response code for TeleCheck authentication decision in the sale response message.")

  public String getResponseCode() {
    return responseCode;
  }



  public void setResponseCode(String responseCode) {
    this.responseCode = responseCode;
  }


  public AchResponse approvalCode(String approvalCode) {
    
    this.approvalCode = approvalCode;
    return this;
  }

   /**
   * Code provided if check is approved.
   * @return approvalCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "A123", value = "Code provided if check is approved.")

  public String getApprovalCode() {
    return approvalCode;
  }



  public void setApprovalCode(String approvalCode) {
    this.approvalCode = approvalCode;
  }


  public AchResponse referenceNumber(String referenceNumber) {
    
    this.referenceNumber = referenceNumber;
    return this;
  }

   /**
   * Reference number.
   * @return referenceNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1234567", value = "Reference number.")

  public String getReferenceNumber() {
    return referenceNumber;
  }



  public void setReferenceNumber(String referenceNumber) {
    this.referenceNumber = referenceNumber;
  }


  public AchResponse preferredFlag(String preferredFlag) {
    
    this.preferredFlag = preferredFlag;
    return this;
  }

   /**
   * Preferred flag.
   * @return preferredFlag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Y", value = "Preferred flag.")

  public String getPreferredFlag() {
    return preferredFlag;
  }



  public void setPreferredFlag(String preferredFlag) {
    this.preferredFlag = preferredFlag;
  }


  public AchResponse transactionStatus(String transactionStatus) {
    
    this.transactionStatus = transactionStatus;
    return this;
  }

   /**
   * Indicates the result of the requested authorization and is returned in the sale response.
   * @return transactionStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "Indicates the result of the requested authorization and is returned in the sale response.")

  public String getTransactionStatus() {
    return transactionStatus;
  }



  public void setTransactionStatus(String transactionStatus) {
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
    AchResponse achResponse = (AchResponse) o;
    return Objects.equals(this.responseCode, achResponse.responseCode) &&
        Objects.equals(this.approvalCode, achResponse.approvalCode) &&
        Objects.equals(this.referenceNumber, achResponse.referenceNumber) &&
        Objects.equals(this.preferredFlag, achResponse.preferredFlag) &&
        Objects.equals(this.transactionStatus, achResponse.transactionStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(responseCode, approvalCode, referenceNumber, preferredFlag, transactionStatus);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AchResponse {\n");
    sb.append("    responseCode: ").append(toIndentedString(responseCode)).append("\n");
    sb.append("    approvalCode: ").append(toIndentedString(approvalCode)).append("\n");
    sb.append("    referenceNumber: ").append(toIndentedString(referenceNumber)).append("\n");
    sb.append("    preferredFlag: ").append(toIndentedString(preferredFlag)).append("\n");
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

