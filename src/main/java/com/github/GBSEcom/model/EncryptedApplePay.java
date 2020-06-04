/*
 * Payment Gateway API Specification.
 * The documentation here is designed to provide all of the technical guidance required to consume and integrate with our APIs for payment processing. To learn more about our APIs please visit https://docs.firstdata.com/org/gateway.
 *
 * The version of the OpenAPI document: 6.8.0.20190731.002
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.github.GBSEcom.model;

import java.util.Objects;
import java.util.Arrays;
import com.github.GBSEcom.model.EncryptedApplePayHeader;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Encrypted Apple Pay payload.
 */
@ApiModel(description = "Encrypted Apple Pay payload.")

public class EncryptedApplePay {
  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private String data;

  public static final String SERIALIZED_NAME_HEADER = "header";
  @SerializedName(SERIALIZED_NAME_HEADER)
  private EncryptedApplePayHeader header;

  public static final String SERIALIZED_NAME_SIGNATURE = "signature";
  @SerializedName(SERIALIZED_NAME_SIGNATURE)
  private String signature;

  /**
   * Version information about the payment token.
   */
  @JsonAdapter(VersionEnum.Adapter.class)
  public enum VersionEnum {
    EC_V1("EC_v1");

    private String value;

    VersionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static VersionEnum fromValue(String value) {
      for (VersionEnum b : VersionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<VersionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final VersionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public VersionEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return VersionEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private VersionEnum version;

  public static final String SERIALIZED_NAME_APPLICATION_DATA = "applicationData";
  @SerializedName(SERIALIZED_NAME_APPLICATION_DATA)
  private String applicationData;

  public static final String SERIALIZED_NAME_MERCHANT_ID = "merchantId";
  @SerializedName(SERIALIZED_NAME_MERCHANT_ID)
  private String merchantId;


  public EncryptedApplePay data(String data) {
    
    this.data = data;
    return this;
  }

   /**
   * The encrypted wallet payload.
   * @return data
  **/
  @ApiModelProperty(example = "NdCmVw5nMjQq746HYc/VbiZcQZ/zFzeEcM1wVMPruEG4/C/EFhobSkwB5JZJU+t6JuDVXUBiRYuOOC8FTYd+qIm6ckktid9aiGh0f2NDP0INSr59QXmr389RonyUfRYKnBmwsh5UqtI7Iz0AmMtl1PWMdxcCewtjuffs79ahTnFgXsRN+ynuhyDfbdRanlTnYKGoTeVh9eJfheJ1wquO+jiGj+npJ/Oh9bAdlw7iEHrYO2aUkgaMyXZ3foXRAJeimQVQS1y8lU1PPq62zpPrFzidbnnU5fK25pvGFjOdmLsBELZPk5thQEkSaA9p1LSKzWSesHhi0BxZaFPXSA6ANXvYIU2AT0lG+0O0w1URA5Sinyj3YDZVqjuir6rzNN9bB2U2nTQnKMbuGLMS20K8fUKZN/YLJh+AtE6J69+VVSU95mE1nOb8hyabz6E5RmnC5Ze2k6F/hQ75ig==", required = true, value = "The encrypted wallet payload.")

  public String getData() {
    return data;
  }



  public void setData(String data) {
    this.data = data;
  }


  public EncryptedApplePay header(EncryptedApplePayHeader header) {
    
    this.header = header;
    return this;
  }

   /**
   * Get header
   * @return header
  **/
  @ApiModelProperty(required = true, value = "")

  public EncryptedApplePayHeader getHeader() {
    return header;
  }



  public void setHeader(EncryptedApplePayHeader header) {
    this.header = header;
  }


  public EncryptedApplePay signature(String signature) {
    
    this.signature = signature;
    return this;
  }

   /**
   * Signature of the payment and header data.
   * @return signature
  **/
  @ApiModelProperty(example = "MIAGCSqGSIb3DQEHAqCAMIACAQExDzANBglghkgBZQMEAgEFADCABgkqhkiG9w0BBwEAAKCAMIIB0zCCAXkCAQEwCQYHKoZIzj0EATB2MQswCQYDVQQGEwJVUzELMAkGA1UECAwCTkoxFDASBgNVBAcMC0plcnNleSBDaXR5MRMwEQYDVQQKDApGaXJzdCBEYXRhMRIwEAYDVQQLDAlGaXJzdCBBUEkxGzAZBgNVBAMMEmQxZHZ0bDEwMDAuMWRjLmNvbTAeFw0xNTA3MjMxNjQxMDNaFw0xOTA3MjIxNjQxMDNaMHYxCzAJBgNVBAYTAlVTMQswCQYDVQQIDAJOSjEUMBIGA1UEBwwLSmVyc2V5IENpdHkxEzARBgNVBAoMCkZpcnN0IERhdGExEjAQBgNVBAsMCUZpcnN0IEFQSTEbMBkGA1UEAwwSZDFkdnRsMTAwMC4xZGMuY29tMFkwEwYHKoZIzj0CAQYIKoZIzj0DAQcDQgAErnHhPM18HFbOomJMUiLiPL7nrJuWvfPy0Gg3xsX3m8q0oWhTs1QcQDTT+TR3yh4sDRPqXnsTUwcvbrCOzdUEeTAJBgcqhkjOPQQBA0kAMEYCIQDrC1z2JTx1jZPvllpnkxPEzBGk9BhTCkEB58j/Cv+sXQIhAKGongoz++3tJroo1GxnwvzK/Qmc4P1K2lHoh9biZeNhAAAxggFUMIIBUAIBATB7MHYxCzAJBgNVBAYTAlVTMQswCQYDVQQIDAJOSjEUMBIGA1UEBwwLSmVyc2V5IENpdHkxEzARBgNVBAoMCkZpcnN0IERhdGExEjAQBgNVBAsMCUZpcnN0IEFQSTEbMBkGA1UEAwwSZDFkdnRsMTAwMC4xZGMuY29tAgEBMA0GCWCGSAFlAwQCAQUAoGkwGAYJKoZIhvcNAQkDMQsGCSqGSIb3DQEHATAcBgkqhkiG9w0BCQUxDxcNMTUwODEyMTczMTAwWjAvBgkqhkiG9w0BCQQxIgQgJyjKLiGQo3I1ZbfHSmF2XCZ8dNlcZyohziuXO48EKwgwCgYIKoZIzj0EAwIESDBGAiEAznKDYEz9MsC+r1g6e4LR1DTaQOl+X2rVNkWnKDpc1EQCIQCmK48ChHoz4HWnUnW5XqaGWOUXKHQvUgeqFr/jgBUzegAAAAAAAA==", required = true, value = "Signature of the payment and header data.")

  public String getSignature() {
    return signature;
  }



  public void setSignature(String signature) {
    this.signature = signature;
  }


  public EncryptedApplePay version(VersionEnum version) {
    
    this.version = version;
    return this;
  }

   /**
   * Version information about the payment token.
   * @return version
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "EC_v1", value = "Version information about the payment token.")

  public VersionEnum getVersion() {
    return version;
  }



  public void setVersion(VersionEnum version) {
    this.version = version;
  }


  public EncryptedApplePay applicationData(String applicationData) {
    
    this.applicationData = applicationData;
    return this;
  }

   /**
   * Base64-encoded value of PKPaymentRequest. Required only if applicationDataHash is present.
   * @return applicationData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "VEVTVA==", value = "Base64-encoded value of PKPaymentRequest. Required only if applicationDataHash is present.")

  public String getApplicationData() {
    return applicationData;
  }



  public void setApplicationData(String applicationData) {
    this.applicationData = applicationData;
  }


  public EncryptedApplePay merchantId(String merchantId) {
    
    this.merchantId = merchantId;
    return this;
  }

   /**
   * The merchant ID assigned by the wallet provider.
   * @return merchantId
  **/
  @ApiModelProperty(example = "order-1", required = true, value = "The merchant ID assigned by the wallet provider.")

  public String getMerchantId() {
    return merchantId;
  }



  public void setMerchantId(String merchantId) {
    this.merchantId = merchantId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EncryptedApplePay encryptedApplePay = (EncryptedApplePay) o;
    return Objects.equals(this.data, encryptedApplePay.data) &&
        Objects.equals(this.header, encryptedApplePay.header) &&
        Objects.equals(this.signature, encryptedApplePay.signature) &&
        Objects.equals(this.version, encryptedApplePay.version) &&
        Objects.equals(this.applicationData, encryptedApplePay.applicationData) &&
        Objects.equals(this.merchantId, encryptedApplePay.merchantId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, header, signature, version, applicationData, merchantId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EncryptedApplePay {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    header: ").append(toIndentedString(header)).append("\n");
    sb.append("    signature: ").append(toIndentedString(signature)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    applicationData: ").append(toIndentedString(applicationData)).append("\n");
    sb.append("    merchantId: ").append(toIndentedString(merchantId)).append("\n");
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

