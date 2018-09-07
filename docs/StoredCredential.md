
# StoredCredential

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sequence** | [**SequenceEnum**](#SequenceEnum) | Indicates if the transaction is first or subsequent. Valid values are &#39;FIRST&#39; and &#39;SUBSEQUENT&#39; | 
**scheduled** | **Boolean** | Indicates if the transaction is scheduled or part of a installment | 
**referencedSchemeTransactionId** | **String** | The transaction id received from schemes for the initial transaction. Required if sequence is &#39;SUBSEQUENT&#39; |  [optional]
**initiator** | [**InitiatorEnum**](#InitiatorEnum) | Indicates whether it is a merchant initiated or explicitly consented by card holder. Valid values are &#39;MERCHANT&#39; and &#39;CARDHOLDER&#39; |  [optional]


<a name="SequenceEnum"></a>
## Enum: SequenceEnum
Name | Value
---- | -----
FIRST | &quot;FIRST&quot;
SUBSEQUENT | &quot;SUBSEQUENT&quot;


<a name="InitiatorEnum"></a>
## Enum: InitiatorEnum
Name | Value
---- | -----
MERCHANT | &quot;MERCHANT&quot;
CARDHOLDER | &quot;CARDHOLDER&quot;



