package com.github.GBSEcom.simple;

import com.github.GBSEcom.model.AccessTokenResponse;
import com.github.GBSEcom.model.PrimaryTransaction;
import com.github.GBSEcom.model.SecondaryTransaction;
import com.github.GBSEcom.model.TransactionResponse;

public interface ApiClient {
	/**
	 * Generate an access token for user authentication
	 * POST /v1/authentication/access-tokens
	 *
	 * @return
	 */
	AccessTokenResponse requestAccessToken();

	/**
	 * Use this to capture/complete a transaction. Partial postauths are allowed.
	 * POST /v1/payments/{transaction-id}/postauth
	 *
	 * @param transactionId  Gateway transaction id as returned in "ipgTransactionId"
	 * @param payload
	 * @return
	 */
	TransactionResponse performPaymentPostAuthorizationByTransaction(String transactionId, SecondaryTransaction payload);

	/**
	 * Use this to capture/complete a transaction for a particular store. Partial postauths are allowed
	 * POST /v1/payments/{transaction-id}/postauth
	 *
	 * @param transactionId  Gateway transaction id as returned in "ipgTransactionId"
	 * @param payload
	 * @param storeId        Outlet id for clients that support multiple stores from the same dev app
	 * @return
	 */
	TransactionResponse performPaymentPostAuthorizationByTransaction(String transactionId, SecondaryTransaction payload, String storeId);

	/**
	 * Generate a primary transaction
	 * POST /v1/payments
	 *
	 * @param payload
	 * @return
	 */
	TransactionResponse primaryPaymentTransaction(PrimaryTransaction payload);

	/**
	 * Return/refund a transaction
	 * POST /v1/payments/{transaction-id}/return
	 *
	 * @param transactionId  Gateway transaction id as returned in "ipgTransactionId"
	 * @param payload
	 * @return
	 */
	TransactionResponse returnTransaction(String transactionId, SecondaryTransaction payload);

	/**
	 * Return/refund a transaction for a particular store.
	 * POST /v1/payments/{transaction-id}/return
	 *
	 * @param transactionId  Gateway transaction id as returned in "ipgTransactionId"
	 * @param payload
	 * @param storeId        Outlet id for clients that support multiple stores from the same dev app
	 * @return
	 */
	TransactionResponse returnTransaction(String transactionId, SecondaryTransaction payload, String storeId);

	/**
	 * Retrieve the state of a transaction
	 * GET /v1/payments/{transaction-id}
	 *
	 * @param transactionId  Gateway transaction id as returned in "ipgTransactionId"
	 * @return
	 */
	TransactionResponse transactionInquiry(String transactionId);

	/**
	 * Retrieve the state of a transaction for a particular store
	 * GET /v1/payments/{transaction-id}
	 *
	 * @param transactionId  Gateway transaction id as returned in "ipgTransactionId"
	 * @param storeId        Outlet id for clients that support multiple stores from the same dev app
	 * @return
	 */
	TransactionResponse transactionInquiry(String transactionId, String storeId);

	/**
	 * Reverse a previous action on an existing transaction
	 * POST /v1/payments/{transaction-id}/void
	 *
	 * @param transactionId  Gateway transaction id as returned in "ipgTransactionId"
	 * @return
	 */
	TransactionResponse voidTransaction(String transactionId);

	/**
	 * Reverse a previous action on an existing transaction for a particular store
	 * POST /v1/payments/{transaction-id}/void
	 *
	 * @param transactionId  Gateway transaction id as returned in "ipgTransactionId"
	 * @param storeId        Outlet id for clients that support multiple stores from the same dev app
	 * @return
	 */
	TransactionResponse voidTransaction(String transactionId, String storeId);

	/**
	 * Use this to capture/complete a transaction. Partial postauths are allowed.
	 * POST /v1/orders/{order-id}/postauth
	 *
	 * @param orderId  Gateway order identifier as returned in "orderId"
	 * @param payload
	 * @return
	 */
	TransactionResponse performPaymentPostAuthorizationByOrder(String orderId, SecondaryTransaction payload);

	/**
	 * Use this to capture/complete a transaction for a particular store. Partial postauths are allowed.
	 * POST /v1/orders/{order-id}/postauth
	 *
	 * @param orderId  Gateway order identifier as returned in "orderId"
	 * @param payload
	 * @param storeId  Outlet id for clients that support multiple stores from the same dev app
	 * @return
	 */
	TransactionResponse performPaymentPostAuthorizationByOrder(String orderId, SecondaryTransaction payload, String storeId);

	/**
	 * Use this to return/refund on the order. Partial returns are allowed.
	 * POST /v1/orders/{order-id}/return
	 *
	 * @param orderId  Gateway order identifier as returned in "orderId"
	 * @param payload
	 * @return
	 */
	TransactionResponse returnTransactionByOrder(String orderId, SecondaryTransaction payload);

	/**
	 * Use this to return/refund on the order for a particular store. Partial returns are allowed.
	 * POST /v1/orders/{order-id}/return
	 *
	 * @param orderId  Gateway order identifier as returned in "orderId"
	 * @param payload
	 * @param storeId  Outlet id for clients that support multiple stores from the same dev app
	 * @return
	 */
	TransactionResponse returnTransactionByOrder(String orderId, SecondaryTransaction payload, String storeId);
}
