/*
 * Payment Gateway API Specification.
 * The documentation here is designed to provide all of the technical guidance required to consume and integrate with our APIs for payment processing. To learn more about our APIs please visit https://docs.firstdata.com/org/gateway.
 *
 * The version of the OpenAPI document: 21.5.0.20211029.001
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.github.GBSEcom.model;

import java.util.Objects;
import java.util.Arrays;
import com.github.GBSEcom.model.ApmPaymentMethodAllOf;
import com.github.GBSEcom.model.PaymentMethod;
import com.github.GBSEcom.model.PaymentMethodType;
import com.github.GBSEcom.model.PaymentStepResponse;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Payment method containing APM specific information, which is intentionally weakly-typed to allow for reduced coupling of APM plugins.
 */
@ApiModel(description = "Payment method containing APM specific information, which is intentionally weakly-typed to allow for reduced coupling of APM plugins.")

public class ApmPaymentMethod {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private PaymentMethodType type;

  public static final String SERIALIZED_NAME_STEPS = "steps";
  @SerializedName(SERIALIZED_NAME_STEPS)
  private List<PaymentStepResponse> steps = null;


  public ApmPaymentMethod type(PaymentMethodType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(required = true, value = "")

  public PaymentMethodType getType() {
    return type;
  }



  public void setType(PaymentMethodType type) {
    this.type = type;
  }


  public ApmPaymentMethod steps(List<PaymentStepResponse> steps) {
    
    this.steps = steps;
    return this;
  }

  public ApmPaymentMethod addStepsItem(PaymentStepResponse stepsItem) {
    if (this.steps == null) {
      this.steps = new ArrayList<>();
    }
    this.steps.add(stepsItem);
    return this;
  }

   /**
   * All steps (already) performed on the payment
   * @return steps
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "All steps (already) performed on the payment")

  public List<PaymentStepResponse> getSteps() {
    return steps;
  }



  public void setSteps(List<PaymentStepResponse> steps) {
    this.steps = steps;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApmPaymentMethod apmPaymentMethod = (ApmPaymentMethod) o;
    return Objects.equals(this.type, apmPaymentMethod.type) &&
        Objects.equals(this.steps, apmPaymentMethod.steps);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, steps);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApmPaymentMethod {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
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

