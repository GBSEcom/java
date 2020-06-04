/*
 * Payment Gateway API Specification.
 * The documentation here is designed to provide all of the technical guidance required to consume and integrate with our APIs for payment processing. To learn more about our APIs please visit https://docs.firstdata.com/org/gateway.
 *
 * The version of the OpenAPI document: 6.8.0.20190731.002
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.github.GBSEcom.model;

import java.util.Objects;
import java.util.Arrays;
import com.github.GBSEcom.model.BlockCard;
import com.github.GBSEcom.model.BlockDomain;
import com.github.GBSEcom.model.BlockIPAddress;
import com.github.GBSEcom.model.BlockName;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Object that holds information about items that should be blocked.
 */
@ApiModel(description = "Object that holds information about items that should be blocked.")

public class BlockedItems {
  public static final String SERIALIZED_NAME_BLOCK_CARD = "blockCard";
  @SerializedName(SERIALIZED_NAME_BLOCK_CARD)
  private BlockCard blockCard;

  public static final String SERIALIZED_NAME_BLOCK_DOMAIN = "blockDomain";
  @SerializedName(SERIALIZED_NAME_BLOCK_DOMAIN)
  private BlockDomain blockDomain;

  public static final String SERIALIZED_NAME_BLOCK_NAME = "blockName";
  @SerializedName(SERIALIZED_NAME_BLOCK_NAME)
  private BlockName blockName;

  public static final String SERIALIZED_NAME_BLOCK_I_P_ADDRESS = "blockIPAddress";
  @SerializedName(SERIALIZED_NAME_BLOCK_I_P_ADDRESS)
  private BlockIPAddress blockIPAddress;


  public BlockedItems blockCard(BlockCard blockCard) {
    
    this.blockCard = blockCard;
    return this;
  }

   /**
   * Get blockCard
   * @return blockCard
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BlockCard getBlockCard() {
    return blockCard;
  }



  public void setBlockCard(BlockCard blockCard) {
    this.blockCard = blockCard;
  }


  public BlockedItems blockDomain(BlockDomain blockDomain) {
    
    this.blockDomain = blockDomain;
    return this;
  }

   /**
   * Get blockDomain
   * @return blockDomain
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BlockDomain getBlockDomain() {
    return blockDomain;
  }



  public void setBlockDomain(BlockDomain blockDomain) {
    this.blockDomain = blockDomain;
  }


  public BlockedItems blockName(BlockName blockName) {
    
    this.blockName = blockName;
    return this;
  }

   /**
   * Get blockName
   * @return blockName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BlockName getBlockName() {
    return blockName;
  }



  public void setBlockName(BlockName blockName) {
    this.blockName = blockName;
  }


  public BlockedItems blockIPAddress(BlockIPAddress blockIPAddress) {
    
    this.blockIPAddress = blockIPAddress;
    return this;
  }

   /**
   * Get blockIPAddress
   * @return blockIPAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BlockIPAddress getBlockIPAddress() {
    return blockIPAddress;
  }



  public void setBlockIPAddress(BlockIPAddress blockIPAddress) {
    this.blockIPAddress = blockIPAddress;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BlockedItems blockedItems = (BlockedItems) o;
    return Objects.equals(this.blockCard, blockedItems.blockCard) &&
        Objects.equals(this.blockDomain, blockedItems.blockDomain) &&
        Objects.equals(this.blockName, blockedItems.blockName) &&
        Objects.equals(this.blockIPAddress, blockedItems.blockIPAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blockCard, blockDomain, blockName, blockIPAddress);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BlockedItems {\n");
    sb.append("    blockCard: ").append(toIndentedString(blockCard)).append("\n");
    sb.append("    blockDomain: ").append(toIndentedString(blockDomain)).append("\n");
    sb.append("    blockName: ").append(toIndentedString(blockName)).append("\n");
    sb.append("    blockIPAddress: ").append(toIndentedString(blockIPAddress)).append("\n");
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

