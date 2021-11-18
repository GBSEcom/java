/*
 * Payment Gateway API Specification.
 * The documentation here is designed to provide all of the technical guidance required to consume and integrate with our APIs for payment processing. To learn more about our APIs please visit https://docs.firstdata.com/org/gateway.
 *
 * The version of the OpenAPI document: 21.5.0.20211029.001
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
import java.math.BigDecimal;

/**
 * Transaction amounts with multiple components.
 */
@ApiModel(description = "Transaction amounts with multiple components.")

public class AmountComponents {
  public static final String SERIALIZED_NAME_SUBTOTAL = "subtotal";
  @SerializedName(SERIALIZED_NAME_SUBTOTAL)
  private BigDecimal subtotal;

  public static final String SERIALIZED_NAME_VAT_AMOUNT = "vatAmount";
  @SerializedName(SERIALIZED_NAME_VAT_AMOUNT)
  private BigDecimal vatAmount;

  public static final String SERIALIZED_NAME_LOCAL_TAX = "localTax";
  @SerializedName(SERIALIZED_NAME_LOCAL_TAX)
  private BigDecimal localTax;

  public static final String SERIALIZED_NAME_SHIPPING = "shipping";
  @SerializedName(SERIALIZED_NAME_SHIPPING)
  private BigDecimal shipping;

  public static final String SERIALIZED_NAME_CASHBACK = "cashback";
  @SerializedName(SERIALIZED_NAME_CASHBACK)
  private BigDecimal cashback;

  public static final String SERIALIZED_NAME_TIP = "tip";
  @SerializedName(SERIALIZED_NAME_TIP)
  private BigDecimal tip;

  public static final String SERIALIZED_NAME_SURCHARGE = "surcharge";
  @SerializedName(SERIALIZED_NAME_SURCHARGE)
  private BigDecimal surcharge;


  public AmountComponents subtotal(BigDecimal subtotal) {
    
    this.subtotal = subtotal;
    return this;
  }

   /**
   * Subtotal amount.
   * @return subtotal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "8.0", value = "Subtotal amount.")

  public BigDecimal getSubtotal() {
    return subtotal;
  }



  public void setSubtotal(BigDecimal subtotal) {
    this.subtotal = subtotal;
  }


  public AmountComponents vatAmount(BigDecimal vatAmount) {
    
    this.vatAmount = vatAmount;
    return this;
  }

   /**
   * Value-added tax amount.
   * @return vatAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "Value-added tax amount.")

  public BigDecimal getVatAmount() {
    return vatAmount;
  }



  public void setVatAmount(BigDecimal vatAmount) {
    this.vatAmount = vatAmount;
  }


  public AmountComponents localTax(BigDecimal localTax) {
    
    this.localTax = localTax;
    return this;
  }

   /**
   * Local tax amount.
   * @return localTax
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1.0", value = "Local tax amount.")

  public BigDecimal getLocalTax() {
    return localTax;
  }



  public void setLocalTax(BigDecimal localTax) {
    this.localTax = localTax;
  }


  public AmountComponents shipping(BigDecimal shipping) {
    
    this.shipping = shipping;
    return this;
  }

   /**
   * Shipping amount.
   * @return shipping
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1.24", value = "Shipping amount.")

  public BigDecimal getShipping() {
    return shipping;
  }



  public void setShipping(BigDecimal shipping) {
    this.shipping = shipping;
  }


  public AmountComponents cashback(BigDecimal cashback) {
    
    this.cashback = cashback;
    return this;
  }

   /**
   * Cashback amount.
   * @return cashback
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2.0", value = "Cashback amount.")

  public BigDecimal getCashback() {
    return cashback;
  }



  public void setCashback(BigDecimal cashback) {
    this.cashback = cashback;
  }


  public AmountComponents tip(BigDecimal tip) {
    
    this.tip = tip;
    return this;
  }

   /**
   * Tip amount.
   * @return tip
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "6.0", value = "Tip amount.")

  public BigDecimal getTip() {
    return tip;
  }



  public void setTip(BigDecimal tip) {
    this.tip = tip;
  }


  public AmountComponents surcharge(BigDecimal surcharge) {
    
    this.surcharge = surcharge;
    return this;
  }

   /**
   * Surcharge amount.
   * @return surcharge
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2.5", value = "Surcharge amount.")

  public BigDecimal getSurcharge() {
    return surcharge;
  }



  public void setSurcharge(BigDecimal surcharge) {
    this.surcharge = surcharge;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AmountComponents amountComponents = (AmountComponents) o;
    return Objects.equals(this.subtotal, amountComponents.subtotal) &&
        Objects.equals(this.vatAmount, amountComponents.vatAmount) &&
        Objects.equals(this.localTax, amountComponents.localTax) &&
        Objects.equals(this.shipping, amountComponents.shipping) &&
        Objects.equals(this.cashback, amountComponents.cashback) &&
        Objects.equals(this.tip, amountComponents.tip) &&
        Objects.equals(this.surcharge, amountComponents.surcharge);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subtotal, vatAmount, localTax, shipping, cashback, tip, surcharge);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AmountComponents {\n");
    sb.append("    subtotal: ").append(toIndentedString(subtotal)).append("\n");
    sb.append("    vatAmount: ").append(toIndentedString(vatAmount)).append("\n");
    sb.append("    localTax: ").append(toIndentedString(localTax)).append("\n");
    sb.append("    shipping: ").append(toIndentedString(shipping)).append("\n");
    sb.append("    cashback: ").append(toIndentedString(cashback)).append("\n");
    sb.append("    tip: ").append(toIndentedString(tip)).append("\n");
    sb.append("    surcharge: ").append(toIndentedString(surcharge)).append("\n");
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

