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
import com.github.GBSEcom.model.Amount;
import com.github.GBSEcom.model.Disbursement;
import com.github.GBSEcom.model.Order;
import com.github.GBSEcom.model.PaymentDeviceDisbursementTransactionAllOf;
import com.github.GBSEcom.model.PaymentDevicePaymentMethod;
import com.github.GBSEcom.model.PrimaryTransaction;
import com.github.GBSEcom.model.TransactionOrigin;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Request to create disbursement transaction using decrypted card details from payment device. The transaction origin will be fixed as PHONE when data is manually entered into the device and as RETAIL when data is entered into the device via swipe.
 */
@ApiModel(description = "Request to create disbursement transaction using decrypted card details from payment device. The transaction origin will be fixed as PHONE when data is manually entered into the device and as RETAIL when data is entered into the device via swipe.")

public class PaymentDeviceDisbursementTransaction extends PrimaryTransaction {
  public static final String SERIALIZED_NAME_PAYMENT_METHOD = "paymentMethod";
  @SerializedName(SERIALIZED_NAME_PAYMENT_METHOD)
  private PaymentDevicePaymentMethod paymentMethod = null;

  public static final String SERIALIZED_NAME_DISBURSEMENT = "disbursement";
  @SerializedName(SERIALIZED_NAME_DISBURSEMENT)
  private Disbursement disbursement;


  public PaymentDeviceDisbursementTransaction paymentMethod(PaymentDevicePaymentMethod paymentMethod) {
    
    this.paymentMethod = paymentMethod;
    return this;
  }

   /**
   * Get paymentMethod
   * @return paymentMethod
  **/
  @ApiModelProperty(required = true, value = "")

  public PaymentDevicePaymentMethod getPaymentMethod() {
    return paymentMethod;
  }



  public void setPaymentMethod(PaymentDevicePaymentMethod paymentMethod) {
    this.paymentMethod = paymentMethod;
  }


  public PaymentDeviceDisbursementTransaction disbursement(Disbursement disbursement) {
    
    this.disbursement = disbursement;
    return this;
  }

   /**
   * Get disbursement
   * @return disbursement
  **/
  @ApiModelProperty(required = true, value = "")

  public Disbursement getDisbursement() {
    return disbursement;
  }



  public void setDisbursement(Disbursement disbursement) {
    this.disbursement = disbursement;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentDeviceDisbursementTransaction paymentDeviceDisbursementTransaction = (PaymentDeviceDisbursementTransaction) o;
    return Objects.equals(this.paymentMethod, paymentDeviceDisbursementTransaction.paymentMethod) &&
        Objects.equals(this.disbursement, paymentDeviceDisbursementTransaction.disbursement) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentMethod, disbursement, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentDeviceDisbursementTransaction {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    sb.append("    disbursement: ").append(toIndentedString(disbursement)).append("\n");
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

