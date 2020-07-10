/*
 * Payment Gateway API Specification.
 * The documentation here is designed to provide all of the technical guidance required to consume and integrate with our APIs for payment processing. To learn more about our APIs please visit https://docs.firstdata.com/org/gateway.
 *
 * The version of the OpenAPI document: 6.12.0.20200605.001
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.github.GBSEcom.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ScoreOnlyResponseFraudScoreExplanations
 */

public class ScoreOnlyResponseFraudScoreExplanations {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_RULE = "rule";
  @SerializedName(SERIALIZED_NAME_RULE)
  private String rule;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;


  public ScoreOnlyResponseFraudScoreExplanations description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Description of the fraud score explanation.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Suspicious transaction amount.", value = "Description of the fraud score explanation.")

  public String getDescription() {
    return description;
  }



  public void setDescription(String description) {
    this.description = description;
  }


  public ScoreOnlyResponseFraudScoreExplanations rule(String rule) {
    
    this.rule = rule;
    return this;
  }

   /**
   * ID of the rule being triggered.
   * @return rule
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "QSR_14", value = "ID of the rule being triggered.")

  public String getRule() {
    return rule;
  }



  public void setRule(String rule) {
    this.rule = rule;
  }


  public ScoreOnlyResponseFraudScoreExplanations type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Type of the explanation (model or rule).
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "explanation/model", value = "Type of the explanation (model or rule).")

  public String getType() {
    return type;
  }



  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScoreOnlyResponseFraudScoreExplanations scoreOnlyResponseFraudScoreExplanations = (ScoreOnlyResponseFraudScoreExplanations) o;
    return Objects.equals(this.description, scoreOnlyResponseFraudScoreExplanations.description) &&
        Objects.equals(this.rule, scoreOnlyResponseFraudScoreExplanations.rule) &&
        Objects.equals(this.type, scoreOnlyResponseFraudScoreExplanations.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, rule, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScoreOnlyResponseFraudScoreExplanations {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    rule: ").append(toIndentedString(rule)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

