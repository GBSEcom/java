
# CarRental

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**agreementNumber** | **String** | The car rental agreement number. |  [optional]
**renterName** | **String** | The name of the person renting the car. |  [optional]
**returnCity** | **String** | The city where the rental ends and the car is returned. |  [optional]
**returnDate** | [**LocalDate**](LocalDate.md) | The date the car rental ends and the car is returned. |  [optional]
**pickupDate** | [**LocalDate**](LocalDate.md) | The date the car rental begins. |  [optional]
**rentalClassId** | **String** | The classification of the rental car. |  [optional]
**extraCharges** | [**List&lt;CarRentalExtraCharges&gt;**](CarRentalExtraCharges.md) | Array containing information about charges other than the rental rate. |  [optional]
**noShowIndicator** | **Boolean** | Indicates if the transaction is related to a no-show charge. |  [optional]



