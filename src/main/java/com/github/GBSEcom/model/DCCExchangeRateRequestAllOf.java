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

/**
 * DCCExchangeRateRequestAllOf
 */

public class DCCExchangeRateRequestAllOf {
  public static final String SERIALIZED_NAME_BIN = "bin";
  @SerializedName(SERIALIZED_NAME_BIN)
  private String bin;


  public DCCExchangeRateRequestAllOf bin(String bin) {
    
    this.bin = bin;
    return this;
  }

   /**
   * The bank identification number (BIN) of the card to be used for DCC. The BIN is the first 6-9 digits of the card number.
   * @return bin
  **/
  @ApiModelProperty(example = "411111", required = true, value = "The bank identification number (BIN) of the card to be used for DCC. The BIN is the first 6-9 digits of the card number.")

  public String getBin() {
    return bin;
  }



  public void setBin(String bin) {
    this.bin = bin;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DCCExchangeRateRequestAllOf dcCExchangeRateRequestAllOf = (DCCExchangeRateRequestAllOf) o;
    return Objects.equals(this.bin, dcCExchangeRateRequestAllOf.bin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bin);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DCCExchangeRateRequestAllOf {\n");
    sb.append("    bin: ").append(toIndentedString(bin)).append("\n");
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

