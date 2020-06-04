package com.github.GBSEcom.simple;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

public interface ClientFactory {
	AuthenticationApi getAuthenticationApi();
	InformationLookupApi getInformationLookupApi();
	VerificationApi getVerificationApi();
	CurrencyConversionApi getCurrencyConversionApi();
	FraudDetectApi getFraudDetectApi();
	OrderApi getOrderApi();
	PaymentApi getPaymentApi();
	PaymentSchedulesApi getPaymentSchedulesApi();
	PaymentTokenApi getPaymentTokenApi();
	PaymentUrlApi getPaymentUrlApi();
}

@AllArgsConstructor
class ClientFactoryImpl implements ClientFactory {

	private ClientContext context;

	public AuthenticationApi getAuthenticationApi() {
		return new AuthenticationApiImpl(context);
	}

	public InformationLookupApi getInformationLookupApi() {
		return new InformationLookupApiImpl(context);
	}

	public VerificationApi getVerificationApi() {
		return new VerificationApiImpl(context);
	}

	public CurrencyConversionApi getCurrencyConversionApi() {
		return new CurrencyConversionApiImpl(context);
	}

	public FraudDetectApi getFraudDetectApi() {
		return new FraudDetectApiImpl(context);
	}

	public OrderApi getOrderApi() {
		return new OrderApiImpl(context);
	}

	public PaymentApi getPaymentApi() {
		return new PaymentApiImpl(context);
	}

	public PaymentSchedulesApi getPaymentSchedulesApi() {
		return new PaymentSchedulesApiImpl(context);
	}

	public PaymentTokenApi getPaymentTokenApi() {
		return new PaymentTokenApiImpl(context);
	}

	public PaymentUrlApi getPaymentUrlApi() {
		return new PaymentUrlApiImpl(context);
	}

	void setContext(ClientContext clientContext) {
		context = clientContext;
	}
}