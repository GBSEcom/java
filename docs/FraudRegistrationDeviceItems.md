

# FraudRegistrationDeviceItems

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**networkType** | [**NetworkTypeEnum**](#NetworkTypeEnum) | Defines the type of network associated with the device. | 
**ip** | **String** | The IPv4 or IPv6 address of the device if the network assigned one. |  [optional]
**mac** | **String** | The MAC address of the device that is connected to the Wi-Fi network. |  [optional]
**ssid** | **String** | The Wi-Fi networks Service Set Identifier (SSID). |  [optional]
**bssid** | **String** | The Wi-Fi networks Basic Service Set Identifier (BSSID). |  [optional]
**userDefined** | [**Object**](.md) | A JSON object that can carry any additional information about the network that might be helpful for fraud detection. |  [optional]



## Enum: NetworkTypeEnum

Name | Value
---- | -----
MOBILE | &quot;network/mobile&quot;
WIFI | &quot;network/wifi&quot;



