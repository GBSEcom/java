

# Secure3DAuthenticationResponseParams

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**payerAuthenticationRequest** | **String** | Message sent from merchant server to authenticate the cardholder. |  [optional]
**termURL** | **String** | Terminal URL for processing request. |  [optional]
**merchantData** | **String** | Formatted string encoding transaction time, order ID, and return URL data. |  [optional]
**acsURL** | **String** | The URL for the authentication redirect for the merchant. |  [optional]
**cReq** | **String** | The CReq message initiates cardholder interaction in a 3DS 2.1 challenge flow and carries authentication data from the cardholder. |  [optional]
**sessionData** | **String** | Customer web browser session data. |  [optional]



