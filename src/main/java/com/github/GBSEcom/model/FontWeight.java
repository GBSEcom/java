/*
 * Payment Gateway API Specification.
 * The documentation here is designed to provide all of the technical guidance required to consume and integrate with our APIs for payment processing. To learn more about our APIs please visit https://docs.firstdata.com/org/gateway.
 *
 * OpenAPI spec version: 6.10.1.20200226.002
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
 * Font weight property.
 */
@JsonAdapter(FontWeight.Adapter.class)
public enum FontWeight {
  
  NORMAL("normal"),
  
  BOLD("bold");

  private String value;

  FontWeight(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static FontWeight fromValue(String text) {
    for (FontWeight b : FontWeight.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }

  public static class Adapter extends TypeAdapter<FontWeight> {
    @Override
    public void write(final JsonWriter jsonWriter, final FontWeight enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public FontWeight read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return FontWeight.fromValue(String.valueOf(value));
    }
  }
}
