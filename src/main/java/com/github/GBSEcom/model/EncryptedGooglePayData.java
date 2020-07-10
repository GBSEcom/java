/*
 * Payment Gateway API Specification.
 * The documentation here is designed to provide all of the technical guidance required to consume and integrate with our APIs for payment processing. To learn more about our APIs please visit https://docs.firstdata.com/org/gateway.
 *
 * The version of the OpenAPI document: 6.12.0.20200605.001
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
 * The encrypted wallet payload.
 */
@ApiModel(description = "The encrypted wallet payload.")

public class EncryptedGooglePayData {
  public static final String SERIALIZED_NAME_ENCRYPTED_MESSAGE = "encryptedMessage";
  @SerializedName(SERIALIZED_NAME_ENCRYPTED_MESSAGE)
  private String encryptedMessage;

  public static final String SERIALIZED_NAME_EPHEMERAL_PUBLIC_KEY = "ephemeralPublicKey";
  @SerializedName(SERIALIZED_NAME_EPHEMERAL_PUBLIC_KEY)
  private String ephemeralPublicKey;

  public static final String SERIALIZED_NAME_TAG = "tag";
  @SerializedName(SERIALIZED_NAME_TAG)
  private String tag;


  public EncryptedGooglePayData encryptedMessage(String encryptedMessage) {
    
    this.encryptedMessage = encryptedMessage;
    return this;
  }

   /**
   * The encrypted message containing the actual payment information as well as additional security fields.
   * @return encryptedMessage
  **/
  @ApiModelProperty(example = "8nxjB9mr2tWZeDRQRcGN91UUnb7AioGp3oRo8kmQ6lyvJZiqD7PJlbRCYElNqUmr6Z8zK7b2gO9MKOjpnTCqH0qAe2vuIlwNXB60M2Lh7Qfl3bVgWzwF/FfFcenVW381hoItYi8AjWnWoydz1XMTEv2qhqUG03mEnRXdMyDyk6KKZXoW8Qc0p1F1thbxxu8weU8CZbZsWGGTjB42cilIqLVbribcOAG8Oas1AcgefFsu2hwp4gdSuOg7wmeSV7XKsGQzzVy85qtjuqET2XYzJE3K/Wh9QKkhu5P9Ms5s1+Smr2IjRyidqQa88SxQplrVoo9+PvT0bxFcMspBmO3pLkuaZSUBy++dL2fefcxNJvGCFfFhdxW9DojuuQxgpeu7RAQUsGLyFmr/4ZfBxt882xTmpX9MRx5CAudl9qUgBfKdwWwMX35qSbDTm1ju5XXzNh94VebjD3bB9Zj8qgbmUOr/+6OQLhoFJyBCXgx3EEH8hBwNVFrss/SLwQvFhZh62eO6lOtnmbOtP1yTDDVqGDBfai5SwAmM+KTcc9SGv/xDC+cWe8ck+aCBkG4HoRPapUVMZ3JIgV7yzTsVLJE\\\\u003d\\\\", required = true, value = "The encrypted message containing the actual payment information as well as additional security fields.")

  public String getEncryptedMessage() {
    return encryptedMessage;
  }



  public void setEncryptedMessage(String encryptedMessage) {
    this.encryptedMessage = encryptedMessage;
  }


  public EncryptedGooglePayData ephemeralPublicKey(String ephemeralPublicKey) {
    
    this.ephemeralPublicKey = ephemeralPublicKey;
    return this;
  }

   /**
   * The ephemeral public key associated with the private key to encrypt the message in uncompressed point format.
   * @return ephemeralPublicKey
  **/
  @ApiModelProperty(example = "BGH3fRFdoAobYrAlxnZOCYzkH84Cna92IZxtgsU36CMDaqSaDYb9/LsY8qw+vMtlBnwsUg/YVMOeeKp+qDkOWb4\\\\u003d\\\\", required = true, value = "The ephemeral public key associated with the private key to encrypt the message in uncompressed point format.")

  public String getEphemeralPublicKey() {
    return ephemeralPublicKey;
  }



  public void setEphemeralPublicKey(String ephemeralPublicKey) {
    this.ephemeralPublicKey = ephemeralPublicKey;
  }


  public EncryptedGooglePayData tag(String tag) {
    
    this.tag = tag;
    return this;
  }

   /**
   * MAC of the encryptedMessage.
   * @return tag
  **/
  @ApiModelProperty(example = "nvmOUNpnOTZULLhMxT/hWCHzH/4f7gGpfvQgwl3p8ng\\\\u003d\\\\", required = true, value = "MAC of the encryptedMessage.")

  public String getTag() {
    return tag;
  }



  public void setTag(String tag) {
    this.tag = tag;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EncryptedGooglePayData encryptedGooglePayData = (EncryptedGooglePayData) o;
    return Objects.equals(this.encryptedMessage, encryptedGooglePayData.encryptedMessage) &&
        Objects.equals(this.ephemeralPublicKey, encryptedGooglePayData.ephemeralPublicKey) &&
        Objects.equals(this.tag, encryptedGooglePayData.tag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(encryptedMessage, ephemeralPublicKey, tag);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EncryptedGooglePayData {\n");
    sb.append("    encryptedMessage: ").append(toIndentedString(encryptedMessage)).append("\n");
    sb.append("    ephemeralPublicKey: ").append(toIndentedString(ephemeralPublicKey)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
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

