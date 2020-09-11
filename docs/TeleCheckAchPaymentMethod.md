

# TeleCheckAchPaymentMethod

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**achType** | **String** | ACH application type values will be one of either TeleCheckICAPaymentMethod or TeleCheckCBPPaymentMethod. | 
**routingNumber** | **String** | Bank routing number. | 
**accountNumber** | **String** | Bank account number. | 
**accountType** | [**AccountTypeEnum**](#AccountTypeEnum) | Identifies if the account type is checking or savings. | 
**checkNumber** | **String** | Check number. |  [optional]
**checkType** | [**CheckTypeEnum**](#CheckTypeEnum) | Identifies if the check type is personal or company. | 
**productCode** | **String** | Identifies the product code in the transaction. |  [optional]
**manualIdInfo** | [**IdInfo**](IdInfo.md) |  |  [optional]
**supplementIdInfo** | [**IdInfo**](IdInfo.md) |  |  [optional]
**agentId** | **String** | Used to track the agent transaction activity. |  [optional]
**terminalId** | **String** | Identifies the register or lane number where the original sale transaction occurred. |  [optional]
**registrationId** | **String** | Unique ID assigned by the merchant for the consumer (never recycled). It is an additional level of authentication. To use this feature, the merchant must work with TeleCheck Risk to discuss. Registration IDs must not be generated for an existing or returning consumer returns. The single registration ID must be unique per consumer. |  [optional]
**registrationDate** | [**LocalDate**](LocalDate.md) | Date the consumer originally registered in format MMDDYYYY. |  [optional]
**releaseType** | [**ReleaseTypeEnum**](#ReleaseTypeEnum) | Release type is used as a risk variable to gauge risk level when the merchant is releasing the purchased merchandise. |  [optional]
**vipCustomer** | [**VipCustomerEnum**](#VipCustomerEnum) | Flags a transaction as a VIP order (based on merchant criteria). This field should not be sent for non-VIP orders. |  [optional]
**sessionId** | **String** | Session identifier. | 
**terminalState** | **String** | Identifies the US state or territory where the original sale transaction occurred. |  [optional]
**terminalCity** | **String** | Identifies the city where the original sale transaction occurred. |  [optional]
**achBillTo** | [**TeleCheckAchPaymentMethodAchBillTo**](TeleCheckAchPaymentMethodAchBillTo.md) |  | 



## Enum: AccountTypeEnum

Name | Value
---- | -----
C | &quot;C&quot;
S | &quot;S&quot;



## Enum: CheckTypeEnum

Name | Value
---- | -----
P | &quot;P&quot;
C | &quot;C&quot;



## Enum: ReleaseTypeEnum

Name | Value
---- | -----
C | &quot;C&quot;
D | &quot;D&quot;
P | &quot;P&quot;
T | &quot;T&quot;



## Enum: VipCustomerEnum

Name | Value
---- | -----
Y | &quot;Y&quot;
N | &quot;N&quot;



