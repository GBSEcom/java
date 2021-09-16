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
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * The source of the transaction. The possible values are ECOM (if the order was received via email or Internet), MOTO (mail order, telephone order), MAIL, PHONE and RETAIL (face to face).
 */
@JsonAdapter(TransactionOrigin.Adapter.class)
public enum TransactionOrigin {
  
  ECOM("ECOM"),
  
  MOTO("MOTO"),
  
  MAIL("MAIL"),
  
  PHONE("PHONE"),
  
  RETAIL("RETAIL");

  private String value;

  TransactionOrigin(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static TransactionOrigin fromValue(String value) {
    for (TransactionOrigin b : TransactionOrigin.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<TransactionOrigin> {
    @Override
    public void write(final JsonWriter jsonWriter, final TransactionOrigin enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public TransactionOrigin read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return TransactionOrigin.fromValue(value);
    }
  }
}

