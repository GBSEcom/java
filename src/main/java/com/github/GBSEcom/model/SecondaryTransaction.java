/*
 * Payment Gateway API Specification.
 * The documentation here is designed to provide all of the technical guidance required to consume and integrate with our APIs for payment processing. To learn more about our APIs please visit https://docs.firstdata.com/org/gateway.
 *
 * The version of the OpenAPI document: 21.4.0.20210824.002
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.github.GBSEcom.model;

import java.util.Objects;
import java.util.Arrays;
import com.github.GBSEcom.model.Order;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Model for secondary financial transactions. Abstract class, do not use this class directly, use one of its children.
 */
@ApiModel(description = "Model for secondary financial transactions. Abstract class, do not use this class directly, use one of its children.")


public class SecondaryTransaction {
  public static final String SERIALIZED_NAME_REQUEST_TYPE = "requestType";
  @SerializedName(SERIALIZED_NAME_REQUEST_TYPE)
  private String requestType;

  public static final String SERIALIZED_NAME_STORE_ID = "storeId";
  @SerializedName(SERIALIZED_NAME_STORE_ID)
  private String storeId;

  public static final String SERIALIZED_NAME_MERCHANT_TRANSACTION_ID = "merchantTransactionId";
  @SerializedName(SERIALIZED_NAME_MERCHANT_TRANSACTION_ID)
  private String merchantTransactionId;

  public static final String SERIALIZED_NAME_COMMENTS = "comments";
  @SerializedName(SERIALIZED_NAME_COMMENTS)
  private String comments;

  public static final String SERIALIZED_NAME_ORDER = "order";
  @SerializedName(SERIALIZED_NAME_ORDER)
  private Order order;

  public SecondaryTransaction() {
    this.requestType = this.getClass().getSimpleName();
  }

  public SecondaryTransaction requestType(String requestType) {
    
    this.requestType = requestType;
    return this;
  }

   /**
   * Object name of the secondary transaction request.
   * @return requestType
  **/
  @ApiModelProperty(example = "PostAuthTransaction", required = true, value = "Object name of the secondary transaction request.")

  public String getRequestType() {
    return requestType;
  }



  public void setRequestType(String requestType) {
    this.requestType = requestType;
  }


  public SecondaryTransaction storeId(String storeId) {
    
    this.storeId = storeId;
    return this;
  }

   /**
   * An optional outlet ID for clients that support multiple stores in the same developer app.
   * @return storeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "12345500000", value = "An optional outlet ID for clients that support multiple stores in the same developer app.")

  public String getStoreId() {
    return storeId;
  }



  public void setStoreId(String storeId) {
    this.storeId = storeId;
  }


  public SecondaryTransaction merchantTransactionId(String merchantTransactionId) {
    
    this.merchantTransactionId = merchantTransactionId;
    return this;
  }

   /**
   * The unique merchant transaction ID from the request, if supplied.
   * @return merchantTransactionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "lsk23532djljff3", value = "The unique merchant transaction ID from the request, if supplied.")

  public String getMerchantTransactionId() {
    return merchantTransactionId;
  }



  public void setMerchantTransactionId(String merchantTransactionId) {
    this.merchantTransactionId = merchantTransactionId;
  }


  public SecondaryTransaction comments(String comments) {
    
    this.comments = comments;
    return this;
  }

   /**
   * Comment for the secondary transaction.
   * @return comments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "This is a comment", value = "Comment for the secondary transaction.")

  public String getComments() {
    return comments;
  }



  public void setComments(String comments) {
    this.comments = comments;
  }


  public SecondaryTransaction order(Order order) {
    
    this.order = order;
    return this;
  }

   /**
   * Get order
   * @return order
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Order getOrder() {
    return order;
  }



  public void setOrder(Order order) {
    this.order = order;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecondaryTransaction secondaryTransaction = (SecondaryTransaction) o;
    return Objects.equals(this.requestType, secondaryTransaction.requestType) &&
        Objects.equals(this.storeId, secondaryTransaction.storeId) &&
        Objects.equals(this.merchantTransactionId, secondaryTransaction.merchantTransactionId) &&
        Objects.equals(this.comments, secondaryTransaction.comments) &&
        Objects.equals(this.order, secondaryTransaction.order);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestType, storeId, merchantTransactionId, comments, order);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecondaryTransaction {\n");
    sb.append("    requestType: ").append(toIndentedString(requestType)).append("\n");
    sb.append("    storeId: ").append(toIndentedString(storeId)).append("\n");
    sb.append("    merchantTransactionId: ").append(toIndentedString(merchantTransactionId)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

