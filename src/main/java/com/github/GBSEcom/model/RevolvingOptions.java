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
 * Indicates the options for revolving payment.
 */
@ApiModel(description = "Indicates the options for revolving payment.")

public class RevolvingOptions {
  public static final String SERIALIZED_NAME_REVOLVING_PAYMENT = "revolvingPayment";
  @SerializedName(SERIALIZED_NAME_REVOLVING_PAYMENT)
  private Boolean revolvingPayment;


  public RevolvingOptions revolvingPayment(Boolean revolvingPayment) {
    
    this.revolvingPayment = revolvingPayment;
    return this;
  }

   /**
   * Indicates whether the payment has been chosen as revolving type.
   * @return revolvingPayment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Indicates whether the payment has been chosen as revolving type.")

  public Boolean getRevolvingPayment() {
    return revolvingPayment;
  }



  public void setRevolvingPayment(Boolean revolvingPayment) {
    this.revolvingPayment = revolvingPayment;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RevolvingOptions revolvingOptions = (RevolvingOptions) o;
    return Objects.equals(this.revolvingPayment, revolvingOptions.revolvingPayment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(revolvingPayment);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RevolvingOptions {\n");
    sb.append("    revolvingPayment: ").append(toIndentedString(revolvingPayment)).append("\n");
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

