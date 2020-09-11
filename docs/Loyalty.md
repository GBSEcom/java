

# Loyalty

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | A unique ID associated with the loyalty program account. Must be unique within the merchants system. Depending on loyalty programs the account might also serve as a credit/bank account. If this is the case the ID must be not be the PAN. |  [optional]
**program** | **String** | A string that identifies the program in which the customer is enrolled if the merchant supports several programs or levels. |  [optional]
**balance** | [**BigDecimal**](BigDecimal.md) | The balance of the loyalty program account in a program specific currency (e.g. points). |  [optional]



