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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * The processor address validation response for compliance.
 */
@ApiModel(description = "The processor address validation response for compliance.")

public class AVSResponse {
  /**
   * Response if street matches that on file.
   */
  @JsonAdapter(StreetMatchEnum.Adapter.class)
  public enum StreetMatchEnum {
    Y("Y"),
    
    N("N"),
    
    NO_INPUT_DATA("NO_INPUT_DATA"),
    
    NOT_CHECKED("NOT_CHECKED");

    private String value;

    StreetMatchEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StreetMatchEnum fromValue(String value) {
      for (StreetMatchEnum b : StreetMatchEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StreetMatchEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StreetMatchEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StreetMatchEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StreetMatchEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STREET_MATCH = "streetMatch";
  @SerializedName(SERIALIZED_NAME_STREET_MATCH)
  private StreetMatchEnum streetMatch;

  /**
   * Response if postal code matches that on file.
   */
  @JsonAdapter(PostalCodeMatchEnum.Adapter.class)
  public enum PostalCodeMatchEnum {
    Y("Y"),
    
    N("N"),
    
    NO_INPUT_DATA("NO_INPUT_DATA"),
    
    NOT_CHECKED("NOT_CHECKED");

    private String value;

    PostalCodeMatchEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PostalCodeMatchEnum fromValue(String value) {
      for (PostalCodeMatchEnum b : PostalCodeMatchEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PostalCodeMatchEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PostalCodeMatchEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PostalCodeMatchEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return PostalCodeMatchEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_POSTAL_CODE_MATCH = "postalCodeMatch";
  @SerializedName(SERIALIZED_NAME_POSTAL_CODE_MATCH)
  private PostalCodeMatchEnum postalCodeMatch;

  public static final String SERIALIZED_NAME_ASSOCIATION_AVS_RESPONSE = "associationAvsResponse";
  @SerializedName(SERIALIZED_NAME_ASSOCIATION_AVS_RESPONSE)
  private String associationAvsResponse;


  public AVSResponse streetMatch(StreetMatchEnum streetMatch) {
    
    this.streetMatch = streetMatch;
    return this;
  }

   /**
   * Response if street matches that on file.
   * @return streetMatch
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Y", value = "Response if street matches that on file.")

  public StreetMatchEnum getStreetMatch() {
    return streetMatch;
  }



  public void setStreetMatch(StreetMatchEnum streetMatch) {
    this.streetMatch = streetMatch;
  }


  public AVSResponse postalCodeMatch(PostalCodeMatchEnum postalCodeMatch) {
    
    this.postalCodeMatch = postalCodeMatch;
    return this;
  }

   /**
   * Response if postal code matches that on file.
   * @return postalCodeMatch
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "N", value = "Response if postal code matches that on file.")

  public PostalCodeMatchEnum getPostalCodeMatch() {
    return postalCodeMatch;
  }



  public void setPostalCodeMatch(PostalCodeMatchEnum postalCodeMatch) {
    this.postalCodeMatch = postalCodeMatch;
  }


  public AVSResponse associationAvsResponse(String associationAvsResponse) {
    
    this.associationAvsResponse = associationAvsResponse;
    return this;
  }

   /**
   * The raw address verification response code returned by issuer. Please refer to response codes section in developer portal for more info.
   * @return associationAvsResponse
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Y", value = "The raw address verification response code returned by issuer. Please refer to response codes section in developer portal for more info.")

  public String getAssociationAvsResponse() {
    return associationAvsResponse;
  }



  public void setAssociationAvsResponse(String associationAvsResponse) {
    this.associationAvsResponse = associationAvsResponse;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AVSResponse avSResponse = (AVSResponse) o;
    return Objects.equals(this.streetMatch, avSResponse.streetMatch) &&
        Objects.equals(this.postalCodeMatch, avSResponse.postalCodeMatch) &&
        Objects.equals(this.associationAvsResponse, avSResponse.associationAvsResponse);
  }

  @Override
  public int hashCode() {
    return Objects.hash(streetMatch, postalCodeMatch, associationAvsResponse);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AVSResponse {\n");
    sb.append("    streetMatch: ").append(toIndentedString(streetMatch)).append("\n");
    sb.append("    postalCodeMatch: ").append(toIndentedString(postalCodeMatch)).append("\n");
    sb.append("    associationAvsResponse: ").append(toIndentedString(associationAvsResponse)).append("\n");
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

