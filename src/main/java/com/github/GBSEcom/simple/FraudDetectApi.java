package com.github.GBSEcom.simple;

import com.github.GBSEcom.client.ApiException;
import com.github.GBSEcom.model.ScoreOnlyRequest;
import com.github.GBSEcom.model.ScoreOnlyResponse;

public interface FraudDetectApi {
	ScoreOnlyResponse scoreOnly(ScoreOnlyRequest payload, String region);
	ScoreOnlyResponse scoreOnly(ScoreOnlyRequest payload);
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
}
