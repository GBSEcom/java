package com.github.GBSEcom.simple;

import com.github.GBSEcom.client.ApiException;
import com.github.GBSEcom.model.ScoreOnlyRequest;
import com.github.GBSEcom.model.ScoreOnlyResponse;
import com.github.GBSEcom.model.ClientRegistration;
import com.github.GBSEcom.model.PaymentRegistration;
import com.github.GBSEcom.model.FraudRegistrationResponse;

public interface FraudDetectApi {
	ScoreOnlyResponse scoreOnly(ScoreOnlyRequest payload, String region);
	ScoreOnlyResponse scoreOnly(ScoreOnlyRequest payload);

	FraudRegistrationResponse fraudClientRegistrationPost(ClientRegistration payload,String region);
	FraudRegistrationResponse fraudClientRegistrationPost(ClientRegistration payload);

	FraudRegistrationResponse fraudPaymentRegistrationPost(PaymentRegistration payload,String region);
	FraudRegistrationResponse fraudPaymentRegistrationPost(PaymentRegistration payload);

}

class FraudDetectApiImpl extends ApiWrapper<com.github.GBSEcom.api.FraudDetectApi> implements FraudDetectApi {
	public FraudDetectApiImpl(final ClientContext context) {
		super(context, com.github.GBSEcom.api.FraudDetectApi::new);
	}

	public ScoreOnlyResponse scoreOnly(final ScoreOnlyRequest payload, final String region) throws ApiException {
		final ClientHeaders headers = genHeaders(payload);
		return getClient().scoreOnly(
			headers.getContentType(),
			headers.getClientRequestId(),
			headers.getApiKey(),
			headers.getTimestamp(),
			payload,
			headers.getMessageSignature(),
			region
		);
	}

	public ScoreOnlyResponse scoreOnly(final ScoreOnlyRequest payload) throws ApiException {
		return scoreOnly(payload, getDefaultRegion());
	}

	public FraudRegistrationResponse fraudClientRegistrationPost(final ClientRegistration payload,final String region) throws ApiException{
		final ClientHeaders headers = genHeaders(payload);
		return getClient().fraudClientRegistrationPost(
			headers.getContentType(),
			headers.getClientRequestId(),
			headers.getApiKey(),
			headers.getTimestamp(),
			payload,
			headers.getMessageSignature(),
			region
		);
	}

	public FraudRegistrationResponse fraudClientRegistrationPost(final ClientRegistration payload) throws ApiException{
		return fraudClientRegistrationPost(payload, getDefaultRegion());
	}

	public FraudRegistrationResponse fraudPaymentRegistrationPost(final PaymentRegistration payload,final String region) throws ApiException{
		final ClientHeaders headers = genHeaders(payload);
		return getClient().fraudPaymentRegistrationPost(
			headers.getContentType(),
			headers.getClientRequestId(),
			headers.getApiKey(),
			headers.getTimestamp(),
			payload,
			headers.getMessageSignature(),
			region
		);
	}

	public FraudRegistrationResponse fraudPaymentRegistrationPost(final PaymentRegistration payload) throws ApiException{
		return fraudPaymentRegistrationPost(payload, getDefaultRegion());
	}

}
