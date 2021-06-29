/*
 * Payment Gateway API Specification.
 * The documentation here is designed to provide all of the technical guidance required to consume and integrate with our APIs for payment processing. To learn more about our APIs please visit https://docs.firstdata.com/org/gateway.
 *
 * The version of the OpenAPI document: 21.3.0.20210608.001
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
 * The payment object for AliPay transactions. Use this to populate AliPay payment method details.
 */
@ApiModel(description = "The payment object for AliPay transactions. Use this to populate AliPay payment method details.")

public class AliPay {
  /**
   * Use this to indicate the type of machine-readable payment data for scanning.
   */
  @JsonAdapter(PaymentDataTypeEnum.Adapter.class)
  public enum PaymentDataTypeEnum {
    BARCODE("BARCODE"),
    
    QRCODE("QRCODE");

    private String value;

    PaymentDataTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PaymentDataTypeEnum fromValue(String value) {
      for (PaymentDataTypeEnum b : PaymentDataTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PaymentDataTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PaymentDataTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PaymentDataTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return PaymentDataTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PAYMENT_DATA_TYPE = "paymentDataType";
  @SerializedName(SERIALIZED_NAME_PAYMENT_DATA_TYPE)
  private PaymentDataTypeEnum paymentDataType;

  public static final String SERIALIZED_NAME_PAYMENT_DATA = "paymentData";
  @SerializedName(SERIALIZED_NAME_PAYMENT_DATA)
  private String paymentData;

  public static final String SERIALIZED_NAME_ORDER_TITLE = "orderTitle";
  @SerializedName(SERIALIZED_NAME_ORDER_TITLE)
  private String orderTitle;

  public static final String SERIALIZED_NAME_ORDER_DETAILS = "orderDetails";
  @SerializedName(SERIALIZED_NAME_ORDER_DETAILS)
  private String orderDetails;


  public AliPay paymentDataType(PaymentDataTypeEnum paymentDataType) {
    
    this.paymentDataType = paymentDataType;
    return this;
  }

   /**
   * Use this to indicate the type of machine-readable payment data for scanning.
   * @return paymentDataType
  **/
  @ApiModelProperty(example = "QRCODE", required = true, value = "Use this to indicate the type of machine-readable payment data for scanning.")

  public PaymentDataTypeEnum getPaymentDataType() {
    return paymentDataType;
  }



  public void setPaymentDataType(PaymentDataTypeEnum paymentDataType) {
    this.paymentDataType = paymentDataType;
  }


  public AliPay paymentData(String paymentData) {
    
    this.paymentData = paymentData;
    return this;
  }

   /**
   * Use this to send payment-related information, such as customer identity ID.
   * @return paymentData
  **/
  @ApiModelProperty(example = "283047752805604753", required = true, value = "Use this to send payment-related information, such as customer identity ID.")

  public String getPaymentData() {
    return paymentData;
  }



  public void setPaymentData(String paymentData) {
    this.paymentData = paymentData;
  }


  public AliPay orderTitle(String orderTitle) {
    
    this.orderTitle = orderTitle;
    return this;
  }

   /**
   * Use this to send an order title that shows up in the statement.
   * @return orderTitle
  **/
  @ApiModelProperty(example = "My Purchase", required = true, value = "Use this to send an order title that shows up in the statement.")

  public String getOrderTitle() {
    return orderTitle;
  }



  public void setOrderTitle(String orderTitle) {
    this.orderTitle = orderTitle;
  }


  public AliPay orderDetails(String orderDetails) {
    
    this.orderDetails = orderDetails;
    return this;
  }

   /**
   * Use this to send order details that show up in the statement.
   * @return orderDetails
  **/
  @ApiModelProperty(example = "These are the details about my purchase.", required = true, value = "Use this to send order details that show up in the statement.")

  public String getOrderDetails() {
    return orderDetails;
  }



  public void setOrderDetails(String orderDetails) {
    this.orderDetails = orderDetails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AliPay aliPay = (AliPay) o;
    return Objects.equals(this.paymentDataType, aliPay.paymentDataType) &&
        Objects.equals(this.paymentData, aliPay.paymentData) &&
        Objects.equals(this.orderTitle, aliPay.orderTitle) &&
        Objects.equals(this.orderDetails, aliPay.orderDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentDataType, paymentData, orderTitle, orderDetails);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AliPay {\n");
    sb.append("    paymentDataType: ").append(toIndentedString(paymentDataType)).append("\n");
    sb.append("    paymentData: ").append(toIndentedString(paymentData)).append("\n");
    sb.append("    orderTitle: ").append(toIndentedString(orderTitle)).append("\n");
    sb.append("    orderDetails: ").append(toIndentedString(orderDetails)).append("\n");
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

