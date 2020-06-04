/*
 * Payment Gateway API Specification.
 * The documentation here is designed to provide all of the technical guidance required to consume and integrate with our APIs for payment processing. To learn more about our APIs please visit https://docs.firstdata.com/org/gateway.
 *
 * The version of the OpenAPI document: 6.8.0.20190731.002
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.github.GBSEcom.model;

import java.util.Objects;
import java.util.Arrays;
import com.github.GBSEcom.model.ClearingElement;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Contains clearing related response information.
 */
@ApiModel(description = "Contains clearing related response information.")

public class ClearingDetails {
  public static final String SERIALIZED_NAME_CLEARING_ELEMENTS = "clearingElements";
  @SerializedName(SERIALIZED_NAME_CLEARING_ELEMENTS)
  private List<ClearingElement> clearingElements = null;

  public static final String SERIALIZED_NAME_BATCH_TIME_STAMP = "batchTimeStamp";
  @SerializedName(SERIALIZED_NAME_BATCH_TIME_STAMP)
  private String batchTimeStamp;

  public static final String SERIALIZED_NAME_RECEIPT_NUMBER_FROM = "receiptNumberFrom";
  @SerializedName(SERIALIZED_NAME_RECEIPT_NUMBER_FROM)
  private Integer receiptNumberFrom;

  public static final String SERIALIZED_NAME_RECEIPT_NUMBER_TO = "receiptNumberTo";
  @SerializedName(SERIALIZED_NAME_RECEIPT_NUMBER_TO)
  private Integer receiptNumberTo;

  public static final String SERIALIZED_NAME_TRACE_NUMBER = "traceNumber";
  @SerializedName(SERIALIZED_NAME_TRACE_NUMBER)
  private Integer traceNumber;


  public ClearingDetails clearingElements(List<ClearingElement> clearingElements) {
    
    this.clearingElements = clearingElements;
    return this;
  }

  public ClearingDetails addClearingElementsItem(ClearingElement clearingElementsItem) {
    if (this.clearingElements == null) {
      this.clearingElements = new ArrayList<>();
    }
    this.clearingElements.add(clearingElementsItem);
    return this;
  }

   /**
   * The array contains information about the clearing elements.
   * @return clearingElements
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[{\"clearingElement\":{\"brand\":\"VISA\",\"value\":\"1234\",\"count\":\"1234\"}},{\"clearingElement\":{\"brand\":\"AMEX\",\"value\":\"4321\",\"count\":\"999\"}}]", value = "The array contains information about the clearing elements.")

  public List<ClearingElement> getClearingElements() {
    return clearingElements;
  }



  public void setClearingElements(List<ClearingElement> clearingElements) {
    this.clearingElements = clearingElements;
  }


  public ClearingDetails batchTimeStamp(String batchTimeStamp) {
    
    this.batchTimeStamp = batchTimeStamp;
    return this;
  }

   /**
   * Timestamp when the clearing has been processed. The used format is \&quot;YYYYMMDDhhmmss\&quot;.
   * @return batchTimeStamp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20190501094321", value = "Timestamp when the clearing has been processed. The used format is \"YYYYMMDDhhmmss\".")

  public String getBatchTimeStamp() {
    return batchTimeStamp;
  }



  public void setBatchTimeStamp(String batchTimeStamp) {
    this.batchTimeStamp = batchTimeStamp;
  }


  public ClearingDetails receiptNumberFrom(Integer receiptNumberFrom) {
    
    this.receiptNumberFrom = receiptNumberFrom;
    return this;
  }

   /**
   * Start receipt number for the clearing process.
   * minimum: 1
   * maximum: 9999
   * @return receiptNumberFrom
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2520", value = "Start receipt number for the clearing process.")

  public Integer getReceiptNumberFrom() {
    return receiptNumberFrom;
  }



  public void setReceiptNumberFrom(Integer receiptNumberFrom) {
    this.receiptNumberFrom = receiptNumberFrom;
  }


  public ClearingDetails receiptNumberTo(Integer receiptNumberTo) {
    
    this.receiptNumberTo = receiptNumberTo;
    return this;
  }

   /**
   * End receipt number for the clearing process.
   * minimum: 1
   * maximum: 9999
   * @return receiptNumberTo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2567", value = "End receipt number for the clearing process.")

  public Integer getReceiptNumberTo() {
    return receiptNumberTo;
  }



  public void setReceiptNumberTo(Integer receiptNumberTo) {
    this.receiptNumberTo = receiptNumberTo;
  }


  public ClearingDetails traceNumber(Integer traceNumber) {
    
    this.traceNumber = traceNumber;
    return this;
  }

   /**
   * Trace number for the clearing process.
   * minimum: 0
   * maximum: 999999
   * @return traceNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "113744", value = "Trace number for the clearing process.")

  public Integer getTraceNumber() {
    return traceNumber;
  }



  public void setTraceNumber(Integer traceNumber) {
    this.traceNumber = traceNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClearingDetails clearingDetails = (ClearingDetails) o;
    return Objects.equals(this.clearingElements, clearingDetails.clearingElements) &&
        Objects.equals(this.batchTimeStamp, clearingDetails.batchTimeStamp) &&
        Objects.equals(this.receiptNumberFrom, clearingDetails.receiptNumberFrom) &&
        Objects.equals(this.receiptNumberTo, clearingDetails.receiptNumberTo) &&
        Objects.equals(this.traceNumber, clearingDetails.traceNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clearingElements, batchTimeStamp, receiptNumberFrom, receiptNumberTo, traceNumber);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClearingDetails {\n");
    sb.append("    clearingElements: ").append(toIndentedString(clearingElements)).append("\n");
    sb.append("    batchTimeStamp: ").append(toIndentedString(batchTimeStamp)).append("\n");
    sb.append("    receiptNumberFrom: ").append(toIndentedString(receiptNumberFrom)).append("\n");
    sb.append("    receiptNumberTo: ").append(toIndentedString(receiptNumberTo)).append("\n");
    sb.append("    traceNumber: ").append(toIndentedString(traceNumber)).append("\n");
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

