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
import java.time.LocalDate;

/**
 * Model for the SEPA Mandate information.
 */
@ApiModel(description = "Model for the SEPA Mandate information.")

public class SepaMandate {
  public static final String SERIALIZED_NAME_REFERENCE = "reference";
  @SerializedName(SERIALIZED_NAME_REFERENCE)
  private String reference;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_SIGNATURE_DATE = "signatureDate";
  @SerializedName(SERIALIZED_NAME_SIGNATURE_DATE)
  private LocalDate signatureDate;

  /**
   * Sequence type of the direct debit. This defaults to &#39;SINGLE&#39; if not provided.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    SINGLE("SINGLE"),
    
    FIRST_COLLECTION("FIRST_COLLECTION"),
    
    RECURRING_COLLECTION("RECURRING_COLLECTION"),
    
    FINAL_COLLECTION("FINAL_COLLECTION");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type = TypeEnum.SINGLE;


  public SepaMandate reference(String reference) {
    
    this.reference = reference;
    return this;
  }

   /**
   * Existing mandate reference, managed by merchant. Must match [A-Za-z0-9:?/+(),. -]{1,35} and not start with two slashes (\&quot;//\&quot;). Also known as the mandate ID.
   * @return reference
  **/
  @ApiModelProperty(example = "3RBQVEE", required = true, value = "Existing mandate reference, managed by merchant. Must match [A-Za-z0-9:?/+(),. -]{1,35} and not start with two slashes (\"//\"). Also known as the mandate ID.")

  public String getReference() {
    return reference;
  }



  public void setReference(String reference) {
    this.reference = reference;
  }


  public SepaMandate url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * Valid URL pointing to the SEPA mandate (PDF / HTML format recommended). When your store is enabled for SEPA Direct Debit as part of the Local Payments offering, this field allows you to transmit a valid URL of SEPA Direct Debit mandate to enable the Risk and Compliance department to access the details. Please note that it is mandatory to submit a mandateReference and a mandateDate together with a mandateUrl in case you manage SEPA Direct Debit mandates on your side in the combination with the Local Payments offering.
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://www.firstdata.com", value = "Valid URL pointing to the SEPA mandate (PDF / HTML format recommended). When your store is enabled for SEPA Direct Debit as part of the Local Payments offering, this field allows you to transmit a valid URL of SEPA Direct Debit mandate to enable the Risk and Compliance department to access the details. Please note that it is mandatory to submit a mandateReference and a mandateDate together with a mandateUrl in case you manage SEPA Direct Debit mandates on your side in the combination with the Local Payments offering.")

  public String getUrl() {
    return url;
  }



  public void setUrl(String url) {
    this.url = url;
  }


  public SepaMandate signatureDate(LocalDate signatureDate) {
    
    this.signatureDate = signatureDate;
    return this;
  }

   /**
   * Date of mandate signature.
   * @return signatureDate
  **/
  @ApiModelProperty(example = "Fri Jul 14 20:00:00 EDT 2017", required = true, value = "Date of mandate signature.")

  public LocalDate getSignatureDate() {
    return signatureDate;
  }



  public void setSignatureDate(LocalDate signatureDate) {
    this.signatureDate = signatureDate;
  }


  public SepaMandate type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * Sequence type of the direct debit. This defaults to &#39;SINGLE&#39; if not provided.
   * @return type
  **/
  @ApiModelProperty(example = "FINAL_COLLECTION", required = true, value = "Sequence type of the direct debit. This defaults to 'SINGLE' if not provided.")

  public TypeEnum getType() {
    return type;
  }



  public void setType(TypeEnum type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SepaMandate sepaMandate = (SepaMandate) o;
    return Objects.equals(this.reference, sepaMandate.reference) &&
        Objects.equals(this.url, sepaMandate.url) &&
        Objects.equals(this.signatureDate, sepaMandate.signatureDate) &&
        Objects.equals(this.type, sepaMandate.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reference, url, signatureDate, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SepaMandate {\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    signatureDate: ").append(toIndentedString(signatureDate)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

