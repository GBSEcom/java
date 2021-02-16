/*
 * Payment Gateway API Specification.
 * The documentation here is designed to provide all of the technical guidance required to consume and integrate with our APIs for payment processing. To learn more about our APIs please visit https://docs.firstdata.com/org/gateway.
 *
 * The version of the OpenAPI document: 21.1.0.20210122.001
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
 * Bancontact QR information.
 */
@ApiModel(description = "Bancontact QR information.")

public class BancontactQR {
  /**
   * Transaction Routing Means.
   */
  @JsonAdapter(TransactionRoutingMeansEnum.Adapter.class)
  public enum TransactionRoutingMeansEnum {
    QR_CODE("QR Code"),
    
    URL_INTENT("URL Intent");

    private String value;

    TransactionRoutingMeansEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TransactionRoutingMeansEnum fromValue(String value) {
      for (TransactionRoutingMeansEnum b : TransactionRoutingMeansEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TransactionRoutingMeansEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TransactionRoutingMeansEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TransactionRoutingMeansEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TransactionRoutingMeansEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TRANSACTION_ROUTING_MEANS = "transactionRoutingMeans";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_ROUTING_MEANS)
  private TransactionRoutingMeansEnum transactionRoutingMeans;

  public static final String SERIALIZED_NAME_ISSUER_CUSTOMER_REFERENCE = "issuerCustomerReference";
  @SerializedName(SERIALIZED_NAME_ISSUER_CUSTOMER_REFERENCE)
  private String issuerCustomerReference;


  public BancontactQR transactionRoutingMeans(TransactionRoutingMeansEnum transactionRoutingMeans) {
    
    this.transactionRoutingMeans = transactionRoutingMeans;
    return this;
  }

   /**
   * Transaction Routing Means.
   * @return transactionRoutingMeans
  **/
  @ApiModelProperty(example = "QR Code", required = true, value = "Transaction Routing Means.")

  public TransactionRoutingMeansEnum getTransactionRoutingMeans() {
    return transactionRoutingMeans;
  }



  public void setTransactionRoutingMeans(TransactionRoutingMeansEnum transactionRoutingMeans) {
    this.transactionRoutingMeans = transactionRoutingMeans;
  }


  public BancontactQR issuerCustomerReference(String issuerCustomerReference) {
    
    this.issuerCustomerReference = issuerCustomerReference;
    return this;
  }

   /**
   * Issuer Customer Reference.
   * @return issuerCustomerReference
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "303123403", value = "Issuer Customer Reference.")

  public String getIssuerCustomerReference() {
    return issuerCustomerReference;
  }



  public void setIssuerCustomerReference(String issuerCustomerReference) {
    this.issuerCustomerReference = issuerCustomerReference;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BancontactQR bancontactQR = (BancontactQR) o;
    return Objects.equals(this.transactionRoutingMeans, bancontactQR.transactionRoutingMeans) &&
        Objects.equals(this.issuerCustomerReference, bancontactQR.issuerCustomerReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionRoutingMeans, issuerCustomerReference);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BancontactQR {\n");
    sb.append("    transactionRoutingMeans: ").append(toIndentedString(transactionRoutingMeans)).append("\n");
    sb.append("    issuerCustomerReference: ").append(toIndentedString(issuerCustomerReference)).append("\n");
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

