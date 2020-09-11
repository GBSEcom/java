

# AVSResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**streetMatch** | [**StreetMatchEnum**](#StreetMatchEnum) | Response if street matches that on file. |  [optional]
**postalCodeMatch** | [**PostalCodeMatchEnum**](#PostalCodeMatchEnum) | Response if postal code matches that on file. |  [optional]
**associationAvsResponse** | **String** | The raw address verification response code returned by issuer. Please refer to response codes section in developer portal for more info. |  [optional]



## Enum: StreetMatchEnum

Name | Value
---- | -----
Y | &quot;Y&quot;
N | &quot;N&quot;
NO_INPUT_DATA | &quot;NO_INPUT_DATA&quot;
NOT_CHECKED | &quot;NOT_CHECKED&quot;



## Enum: PostalCodeMatchEnum

Name | Value
---- | -----
Y | &quot;Y&quot;
N | &quot;N&quot;
NO_INPUT_DATA | &quot;NO_INPUT_DATA&quot;
NOT_CHECKED | &quot;NOT_CHECKED&quot;



