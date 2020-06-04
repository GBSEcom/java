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
 * Network information.
 */
@ApiModel(description = "Network information.")

public class FraudRegistrationDeviceItems {
  /**
   * Defines the type of network associated with the device.
   */
  @JsonAdapter(NetworkTypeEnum.Adapter.class)
  public enum NetworkTypeEnum {
    MOBILE("network/mobile"),
    
    WIFI("network/wifi");

    private String value;

    NetworkTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static NetworkTypeEnum fromValue(String value) {
      for (NetworkTypeEnum b : NetworkTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<NetworkTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final NetworkTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public NetworkTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return NetworkTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_NETWORK_TYPE = "networkType";
  @SerializedName(SERIALIZED_NAME_NETWORK_TYPE)
  private NetworkTypeEnum networkType;

  public static final String SERIALIZED_NAME_IP = "ip";
  @SerializedName(SERIALIZED_NAME_IP)
  private String ip;

  public static final String SERIALIZED_NAME_MAC = "mac";
  @SerializedName(SERIALIZED_NAME_MAC)
  private String mac;

  public static final String SERIALIZED_NAME_SSID = "ssid";
  @SerializedName(SERIALIZED_NAME_SSID)
  private String ssid;

  public static final String SERIALIZED_NAME_BSSID = "bssid";
  @SerializedName(SERIALIZED_NAME_BSSID)
  private String bssid;

  public static final String SERIALIZED_NAME_USER_DEFINED = "userDefined";
  @SerializedName(SERIALIZED_NAME_USER_DEFINED)
  private Object userDefined;


  public FraudRegistrationDeviceItems networkType(NetworkTypeEnum networkType) {
    
    this.networkType = networkType;
    return this;
  }

   /**
   * Defines the type of network associated with the device.
   * @return networkType
  **/
  @ApiModelProperty(example = "network/wifi", required = true, value = "Defines the type of network associated with the device.")

  public NetworkTypeEnum getNetworkType() {
    return networkType;
  }



  public void setNetworkType(NetworkTypeEnum networkType) {
    this.networkType = networkType;
  }


  public FraudRegistrationDeviceItems ip(String ip) {
    
    this.ip = ip;
    return this;
  }

   /**
   * The IPv4 or IPv6 address of the device if the network assigned one.
   * @return ip
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10.201.0.244", value = "The IPv4 or IPv6 address of the device if the network assigned one.")

  public String getIp() {
    return ip;
  }



  public void setIp(String ip) {
    this.ip = ip;
  }


  public FraudRegistrationDeviceItems mac(String mac) {
    
    this.mac = mac;
    return this;
  }

   /**
   * The MAC address of the device that is connected to the Wi-Fi network.
   * @return mac
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "02:00:00:00:00:00", value = "The MAC address of the device that is connected to the Wi-Fi network.")

  public String getMac() {
    return mac;
  }



  public void setMac(String mac) {
    this.mac = mac;
  }


  public FraudRegistrationDeviceItems ssid(String ssid) {
    
    this.ssid = ssid;
    return this;
  }

   /**
   * The Wi-Fi networks Service Set Identifier (SSID).
   * @return ssid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Boston-5G-1", value = "The Wi-Fi networks Service Set Identifier (SSID).")

  public String getSsid() {
    return ssid;
  }



  public void setSsid(String ssid) {
    this.ssid = ssid;
  }


  public FraudRegistrationDeviceItems bssid(String bssid) {
    
    this.bssid = bssid;
    return this;
  }

   /**
   * The Wi-Fi networks Basic Service Set Identifier (BSSID).
   * @return bssid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "e8:fc:af:fb:4b:8c", value = "The Wi-Fi networks Basic Service Set Identifier (BSSID).")

  public String getBssid() {
    return bssid;
  }



  public void setBssid(String bssid) {
    this.bssid = bssid;
  }


  public FraudRegistrationDeviceItems userDefined(Object userDefined) {
    
    this.userDefined = userDefined;
    return this;
  }

   /**
   * A JSON object that can carry any additional information about the network that might be helpful for fraud detection.
   * @return userDefined
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"battery\":\"5h 10m\"}", value = "A JSON object that can carry any additional information about the network that might be helpful for fraud detection.")

  public Object getUserDefined() {
    return userDefined;
  }



  public void setUserDefined(Object userDefined) {
    this.userDefined = userDefined;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FraudRegistrationDeviceItems fraudRegistrationDeviceItems = (FraudRegistrationDeviceItems) o;
    return Objects.equals(this.networkType, fraudRegistrationDeviceItems.networkType) &&
        Objects.equals(this.ip, fraudRegistrationDeviceItems.ip) &&
        Objects.equals(this.mac, fraudRegistrationDeviceItems.mac) &&
        Objects.equals(this.ssid, fraudRegistrationDeviceItems.ssid) &&
        Objects.equals(this.bssid, fraudRegistrationDeviceItems.bssid) &&
        Objects.equals(this.userDefined, fraudRegistrationDeviceItems.userDefined);
  }

  @Override
  public int hashCode() {
    return Objects.hash(networkType, ip, mac, ssid, bssid, userDefined);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FraudRegistrationDeviceItems {\n");
    sb.append("    networkType: ").append(toIndentedString(networkType)).append("\n");
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
    sb.append("    mac: ").append(toIndentedString(mac)).append("\n");
    sb.append("    ssid: ").append(toIndentedString(ssid)).append("\n");
    sb.append("    bssid: ").append(toIndentedString(bssid)).append("\n");
    sb.append("    userDefined: ").append(toIndentedString(userDefined)).append("\n");
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

