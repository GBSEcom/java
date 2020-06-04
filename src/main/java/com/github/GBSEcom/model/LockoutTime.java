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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Object that holds information about lockout times.
 */
@ApiModel(description = "Object that holds information about lockout times.")

public class LockoutTime {
  public static final String SERIALIZED_NAME_AUTO_LOCKOUT_TIME = "autoLockoutTime";
  @SerializedName(SERIALIZED_NAME_AUTO_LOCKOUT_TIME)
  private Integer autoLockoutTime;

  public static final String SERIALIZED_NAME_DUPLICATE_LOCKOUT_TIME = "duplicateLockoutTime";
  @SerializedName(SERIALIZED_NAME_DUPLICATE_LOCKOUT_TIME)
  private Integer duplicateLockoutTime;


  public LockoutTime autoLockoutTime(Integer autoLockoutTime) {
    
    this.autoLockoutTime = autoLockoutTime;
    return this;
  }

   /**
   * Auto-lockout time.
   * @return autoLockoutTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3", value = "Auto-lockout time.")

  public Integer getAutoLockoutTime() {
    return autoLockoutTime;
  }



  public void setAutoLockoutTime(Integer autoLockoutTime) {
    this.autoLockoutTime = autoLockoutTime;
  }


  public LockoutTime duplicateLockoutTime(Integer duplicateLockoutTime) {
    
    this.duplicateLockoutTime = duplicateLockoutTime;
    return this;
  }

   /**
   * Duplicate lockout time.
   * @return duplicateLockoutTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "4", value = "Duplicate lockout time.")

  public Integer getDuplicateLockoutTime() {
    return duplicateLockoutTime;
  }



  public void setDuplicateLockoutTime(Integer duplicateLockoutTime) {
    this.duplicateLockoutTime = duplicateLockoutTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LockoutTime lockoutTime = (LockoutTime) o;
    return Objects.equals(this.autoLockoutTime, lockoutTime.autoLockoutTime) &&
        Objects.equals(this.duplicateLockoutTime, lockoutTime.duplicateLockoutTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoLockoutTime, duplicateLockoutTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LockoutTime {\n");
    sb.append("    autoLockoutTime: ").append(toIndentedString(autoLockoutTime)).append("\n");
    sb.append("    duplicateLockoutTime: ").append(toIndentedString(duplicateLockoutTime)).append("\n");
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

