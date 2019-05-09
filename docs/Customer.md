
# Customer

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Unique ID for the customer, if registered. This field is required if the parent object is present. | 
**startDate** | **String** | The timestamp of the customers registration in the merchants platform. Format is CCYY-MM-DD. |  [optional]
**firstName** | **String** | Customers first name. |  [optional]
**lastName** | **String** | Customers last name. |  [optional]
**middleName** | **String** | Customers middle name. |  [optional]
**email** | **String** | Customers email address. |  [optional]
**sessionId** | **String** | The unique ID of the current login session. Must be unique for the customer. |  [optional]
**username** | **String** | The username of this customer in the merchants system. This field should contain customer-supplied data if available instead of a generated ID. This field can contain the clients email address if it is also used for authentication purposes. |  [optional]
**gender** | [**GenderEnum**](#GenderEnum) | The customers gender. Do not set this property if the customer does not specify a gender. |  [optional]
**dateOfBirth** | **String** | The customers year of birth. Format is CCYY. |  [optional]
**address** | [**CustomerAddress**](CustomerAddress.md) |  |  [optional]
**userDefined** | [**Object**](.md) | A JSON object that can carry any additional information about the customer that might be helpful for fraud detection. |  [optional]


<a name="GenderEnum"></a>
## Enum: GenderEnum
Name | Value
---- | -----
MALE | &quot;male&quot;
FEMALE | &quot;female&quot;
OTHER | &quot;other&quot;



