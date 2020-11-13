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
import com.github.GBSEcom.model.Amount;
import com.github.GBSEcom.model.Order;
import com.github.GBSEcom.model.PaymentFacilitator;
import com.github.GBSEcom.model.PrimaryTransaction;
import com.github.GBSEcom.model.TransactionOrigin;
import com.github.GBSEcom.model.WalletPaymentMethod;
import com.github.GBSEcom.model.WalletSaleTransactionAllOf;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Request to create sale primary transaction using digital wallet.
 */
@ApiModel(description = "Request to create sale primary transaction using digital wallet.")

public class WalletSaleTransaction extends PrimaryTransaction {
  public static final String SERIALIZED_NAME_WALLET_PAYMENT_METHOD = "walletPaymentMethod";
  @SerializedName(SERIALIZED_NAME_WALLET_PAYMENT_METHOD)
  private WalletPaymentMethod walletPaymentMethod;

  public static final String SERIALIZED_NAME_PAYMENT_FACILITATOR = "paymentFacilitator";
  @SerializedName(SERIALIZED_NAME_PAYMENT_FACILITATOR)
  private PaymentFacilitator paymentFacilitator;


  public WalletSaleTransaction walletPaymentMethod(WalletPaymentMethod walletPaymentMethod) {
    
    this.walletPaymentMethod = walletPaymentMethod;
    return this;
  }

   /**
   * Get walletPaymentMethod
   * @return walletPaymentMethod
  **/
  @ApiModelProperty(required = true, value = "")

  public WalletPaymentMethod getWalletPaymentMethod() {
    return walletPaymentMethod;
  }



  public void setWalletPaymentMethod(WalletPaymentMethod walletPaymentMethod) {
    this.walletPaymentMethod = walletPaymentMethod;
  }


  public WalletSaleTransaction paymentFacilitator(PaymentFacilitator paymentFacilitator) {
    
    this.paymentFacilitator = paymentFacilitator;
    return this;
  }

   /**
   * Get paymentFacilitator
   * @return paymentFacilitator
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PaymentFacilitator getPaymentFacilitator() {
    return paymentFacilitator;
  }



  public void setPaymentFacilitator(PaymentFacilitator paymentFacilitator) {
    this.paymentFacilitator = paymentFacilitator;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WalletSaleTransaction walletSaleTransaction = (WalletSaleTransaction) o;
    return Objects.equals(this.walletPaymentMethod, walletSaleTransaction.walletPaymentMethod) &&
        Objects.equals(this.paymentFacilitator, walletSaleTransaction.paymentFacilitator) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(walletPaymentMethod, paymentFacilitator, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WalletSaleTransaction {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    walletPaymentMethod: ").append(toIndentedString(walletPaymentMethod)).append("\n");
    sb.append("    paymentFacilitator: ").append(toIndentedString(paymentFacilitator)).append("\n");
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

