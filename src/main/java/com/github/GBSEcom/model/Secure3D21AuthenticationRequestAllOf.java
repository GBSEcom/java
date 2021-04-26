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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Secure3D21AuthenticationRequestAllOf
 */

public class Secure3D21AuthenticationRequestAllOf {
  public static final String SERIALIZED_NAME_TERM_U_R_L = "termURL";
  @SerializedName(SERIALIZED_NAME_TERM_U_R_L)
  private String termURL;

  public static final String SERIALIZED_NAME_METHOD_NOTIFICATION_U_R_L = "methodNotificationURL";
  @SerializedName(SERIALIZED_NAME_METHOD_NOTIFICATION_U_R_L)
  private String methodNotificationURL;

  /**
   * Indicates whether or not a challenge should be performed. 01 &#x3D; No preference (You have no preference whether a challenge should be performed. This is the default value) 02 &#x3D; No challenge requested (You prefer that no challenge should be performed) 03 &#x3D; Challenge requested: 3DS Requestor Preference (You prefer that a challenge should be performed) 04 &#x3D; Challenge requested: Mandate (There are local or regional mandates that mean that a challenge must be performed) 
   */
  @JsonAdapter(ChallengeIndicatorEnum.Adapter.class)
  public enum ChallengeIndicatorEnum {
    _01("01"),
    
    _02("02"),
    
    _03("03"),
    
    _04("04");

    private String value;

    ChallengeIndicatorEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ChallengeIndicatorEnum fromValue(String value) {
      for (ChallengeIndicatorEnum b : ChallengeIndicatorEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ChallengeIndicatorEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ChallengeIndicatorEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ChallengeIndicatorEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ChallengeIndicatorEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CHALLENGE_INDICATOR = "challengeIndicator";
  @SerializedName(SERIALIZED_NAME_CHALLENGE_INDICATOR)
  private ChallengeIndicatorEnum challengeIndicator = ChallengeIndicatorEnum._01;

  /**
   * Defines the size of the challenge window displayed to customers during authentication. 01 &#x3D; 250 x 400 02 &#x3D; 390 x 400 03 &#x3D; 500 x 600 04 &#x3D; 600 x 400 05 &#x3D; Full screen 
   */
  @JsonAdapter(ChallengeWindowSizeEnum.Adapter.class)
  public enum ChallengeWindowSizeEnum {
    _01("01"),
    
    _02("02"),
    
    _03("03"),
    
    _04("04"),
    
    _05("05");

    private String value;

    ChallengeWindowSizeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ChallengeWindowSizeEnum fromValue(String value) {
      for (ChallengeWindowSizeEnum b : ChallengeWindowSizeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ChallengeWindowSizeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ChallengeWindowSizeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ChallengeWindowSizeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ChallengeWindowSizeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CHALLENGE_WINDOW_SIZE = "challengeWindowSize";
  @SerializedName(SERIALIZED_NAME_CHALLENGE_WINDOW_SIZE)
  private ChallengeWindowSizeEnum challengeWindowSize;


  public Secure3D21AuthenticationRequestAllOf termURL(String termURL) {
    
    this.termURL = termURL;
    return this;
  }

   /**
   * The result of the authentication will be sent to this URL. If not provided, a term URL will be dynamically generated. Note this must be a valid URL (special characters should be URL-encoded).
   * @return termURL
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://www.mywebshop.com/process3dSecure", value = "The result of the authentication will be sent to this URL. If not provided, a term URL will be dynamically generated. Note this must be a valid URL (special characters should be URL-encoded).")

  public String getTermURL() {
    return termURL;
  }



  public void setTermURL(String termURL) {
    this.termURL = termURL;
  }


  public Secure3D21AuthenticationRequestAllOf methodNotificationURL(String methodNotificationURL) {
    
    this.methodNotificationURL = methodNotificationURL;
    return this;
  }

   /**
   * The 3DS method iframe and transaction ID will be sent here. Note this must be a valid URL (special characters should be URL-encoded).
   * @return methodNotificationURL
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://www.mywebshop.com/process3dSecureMethodNotification?transactionReferenceNumber=ffffffff-ba0b-539f-8000-016b2343ad7e", value = "The 3DS method iframe and transaction ID will be sent here. Note this must be a valid URL (special characters should be URL-encoded).")

  public String getMethodNotificationURL() {
    return methodNotificationURL;
  }



  public void setMethodNotificationURL(String methodNotificationURL) {
    this.methodNotificationURL = methodNotificationURL;
  }


  public Secure3D21AuthenticationRequestAllOf challengeIndicator(ChallengeIndicatorEnum challengeIndicator) {
    
    this.challengeIndicator = challengeIndicator;
    return this;
  }

   /**
   * Indicates whether or not a challenge should be performed. 01 &#x3D; No preference (You have no preference whether a challenge should be performed. This is the default value) 02 &#x3D; No challenge requested (You prefer that no challenge should be performed) 03 &#x3D; Challenge requested: 3DS Requestor Preference (You prefer that a challenge should be performed) 04 &#x3D; Challenge requested: Mandate (There are local or regional mandates that mean that a challenge must be performed) 
   * @return challengeIndicator
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "01", value = "Indicates whether or not a challenge should be performed. 01 = No preference (You have no preference whether a challenge should be performed. This is the default value) 02 = No challenge requested (You prefer that no challenge should be performed) 03 = Challenge requested: 3DS Requestor Preference (You prefer that a challenge should be performed) 04 = Challenge requested: Mandate (There are local or regional mandates that mean that a challenge must be performed) ")

  public ChallengeIndicatorEnum getChallengeIndicator() {
    return challengeIndicator;
  }



  public void setChallengeIndicator(ChallengeIndicatorEnum challengeIndicator) {
    this.challengeIndicator = challengeIndicator;
  }


  public Secure3D21AuthenticationRequestAllOf challengeWindowSize(ChallengeWindowSizeEnum challengeWindowSize) {
    
    this.challengeWindowSize = challengeWindowSize;
    return this;
  }

   /**
   * Defines the size of the challenge window displayed to customers during authentication. 01 &#x3D; 250 x 400 02 &#x3D; 390 x 400 03 &#x3D; 500 x 600 04 &#x3D; 600 x 400 05 &#x3D; Full screen 
   * @return challengeWindowSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "01", value = "Defines the size of the challenge window displayed to customers during authentication. 01 = 250 x 400 02 = 390 x 400 03 = 500 x 600 04 = 600 x 400 05 = Full screen ")

  public ChallengeWindowSizeEnum getChallengeWindowSize() {
    return challengeWindowSize;
  }



  public void setChallengeWindowSize(ChallengeWindowSizeEnum challengeWindowSize) {
    this.challengeWindowSize = challengeWindowSize;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Secure3D21AuthenticationRequestAllOf secure3D21AuthenticationRequestAllOf = (Secure3D21AuthenticationRequestAllOf) o;
    return Objects.equals(this.termURL, secure3D21AuthenticationRequestAllOf.termURL) &&
        Objects.equals(this.methodNotificationURL, secure3D21AuthenticationRequestAllOf.methodNotificationURL) &&
        Objects.equals(this.challengeIndicator, secure3D21AuthenticationRequestAllOf.challengeIndicator) &&
        Objects.equals(this.challengeWindowSize, secure3D21AuthenticationRequestAllOf.challengeWindowSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(termURL, methodNotificationURL, challengeIndicator, challengeWindowSize);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Secure3D21AuthenticationRequestAllOf {\n");
    sb.append("    termURL: ").append(toIndentedString(termURL)).append("\n");
    sb.append("    methodNotificationURL: ").append(toIndentedString(methodNotificationURL)).append("\n");
    sb.append("    challengeIndicator: ").append(toIndentedString(challengeIndicator)).append("\n");
    sb.append("    challengeWindowSize: ").append(toIndentedString(challengeWindowSize)).append("\n");
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

