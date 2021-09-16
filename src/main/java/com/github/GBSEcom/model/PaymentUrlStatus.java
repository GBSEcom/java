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
 * The status of payment URL.
 */
@JsonAdapter(PaymentUrlStatus.Adapter.class)
public enum PaymentUrlStatus {
  
  CREATED("Created"),
  
  USED("Used"),
  
  EXPIRED("Expired"),
  
  CANCELLED("Cancelled");

  private String value;

  PaymentUrlStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PaymentUrlStatus fromValue(String value) {
    for (PaymentUrlStatus b : PaymentUrlStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<PaymentUrlStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final PaymentUrlStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public PaymentUrlStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return PaymentUrlStatus.fromValue(value);
    }
  }
}

