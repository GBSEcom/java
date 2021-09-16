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
import com.github.GBSEcom.model.ReceiverInfo;
import com.github.GBSEcom.model.SenderInfo;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Disbursement information. Abstract class, do not use this class directly, use one of its children: FundingTransactionType, DisbursementTransactionType.
 */
@ApiModel(description = "Disbursement information. Abstract class, do not use this class directly, use one of its children: FundingTransactionType, DisbursementTransactionType.")


public class Disbursement {
  public static final String SERIALIZED_NAME_DISBURSEMENT_TYPE = "disbursementType";
  @SerializedName(SERIALIZED_NAME_DISBURSEMENT_TYPE)
  private String disbursementType;

  public static final String SERIALIZED_NAME_SENDER_INFO = "senderInfo";
  @SerializedName(SERIALIZED_NAME_SENDER_INFO)
  private SenderInfo senderInfo;

  public static final String SERIALIZED_NAME_RECEIVER_INFO = "receiverInfo";
  @SerializedName(SERIALIZED_NAME_RECEIVER_INFO)
  private ReceiverInfo receiverInfo;

  public Disbursement() {
    this.disbursementType = this.getClass().getSimpleName();
  }

  public Disbursement disbursementType(String disbursementType) {
    
    this.disbursementType = disbursementType;
    return this;
  }

   /**
   * The type of disbursement.
   * @return disbursementType
  **/
  @ApiModelProperty(example = "FundingTransactionType", required = true, value = "The type of disbursement.")

  public String getDisbursementType() {
    return disbursementType;
  }



  public void setDisbursementType(String disbursementType) {
    this.disbursementType = disbursementType;
  }


  public Disbursement senderInfo(SenderInfo senderInfo) {
    
    this.senderInfo = senderInfo;
    return this;
  }

   /**
   * Get senderInfo
   * @return senderInfo
  **/
  @ApiModelProperty(required = true, value = "")

  public SenderInfo getSenderInfo() {
    return senderInfo;
  }



  public void setSenderInfo(SenderInfo senderInfo) {
    this.senderInfo = senderInfo;
  }


  public Disbursement receiverInfo(ReceiverInfo receiverInfo) {
    
    this.receiverInfo = receiverInfo;
    return this;
  }

   /**
   * Get receiverInfo
   * @return receiverInfo
  **/
  @ApiModelProperty(required = true, value = "")

  public ReceiverInfo getReceiverInfo() {
    return receiverInfo;
  }



  public void setReceiverInfo(ReceiverInfo receiverInfo) {
    this.receiverInfo = receiverInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Disbursement disbursement = (Disbursement) o;
    return Objects.equals(this.disbursementType, disbursement.disbursementType) &&
        Objects.equals(this.senderInfo, disbursement.senderInfo) &&
        Objects.equals(this.receiverInfo, disbursement.receiverInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(disbursementType, senderInfo, receiverInfo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Disbursement {\n");
    sb.append("    disbursementType: ").append(toIndentedString(disbursementType)).append("\n");
    sb.append("    senderInfo: ").append(toIndentedString(senderInfo)).append("\n");
    sb.append("    receiverInfo: ").append(toIndentedString(receiverInfo)).append("\n");
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

