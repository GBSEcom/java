/*
 * Payment Gateway API Specification.
 * The documentation here is designed to provide all of the technical guidance required to consume and integrate with our APIs for payment processing. To learn more about our APIs please visit https://docs.firstdata.com/org/gateway.
 *
 * The version of the OpenAPI document: 21.2.0.20210406.001
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
 * Identifies if the transaction is single or recurring for ACH transaction which is a optional field for Application Type ICA.
 */
@JsonAdapter(AchRecurringType.Adapter.class)
public enum AchRecurringType {
  
  SINGLE("Single"),
  
  RECURRING("Recurring");

  private String value;

  AchRecurringType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AchRecurringType fromValue(String value) {
    for (AchRecurringType b : AchRecurringType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<AchRecurringType> {
    @Override
    public void write(final JsonWriter jsonWriter, final AchRecurringType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AchRecurringType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AchRecurringType.fromValue(value);
    }
  }
}

