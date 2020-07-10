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
 * AirlineAncillaryServiceCategory
 */

public class AirlineAncillaryServiceCategory {
  /**
   * Identifies the service purchased in the transaction if not a base ticket
   */
  @JsonAdapter(ServiceCategoryEnum.Adapter.class)
  public enum ServiceCategoryEnum {
    BUNDLED_SERVICE("BUNDLED_SERVICE"),
    
    BAGGAGE_FEE("BAGGAGE_FEE"),
    
    CHANGE_FEE("CHANGE_FEE"),
    
    CARGO("CARGO"),
    
    CARBON_OFFSET("CARBON_OFFSET"),
    
    FREQUENT_FLYER("FREQUENT_FLYER"),
    
    GIFT_CARD("GIFT_CARD"),
    
    GROUND_TRANSPORT("GROUND_TRANSPORT"),
    
    IN_FLIGHT_ENTERTAINMENT("IN_FLIGHT_ENTERTAINMENT"),
    
    LOUNGE("LOUNGE"),
    
    MEDICAL("MEDICAL"),
    
    MEAL_BEVERAGE("MEAL_BEVERAGE"),
    
    OTHER("OTHER"),
    
    PASSENGER_ASSIST_FEE("PASSENGER_ASSIST_FEE"),
    
    PETS("PETS"),
    
    SEAT_FEES("SEAT_FEES"),
    
    STANDBY("STANDBY"),
    
    SERVICE_FEE("SERVICE_FEE"),
    
    STORE("STORE"),
    
    TRAVEL_SERVICE("TRAVEL_SERVICE"),
    
    UNACCOMPANIED_TRAVEL("UNACCOMPANIED_TRAVEL"),
    
    UPGRADES("UPGRADES"),
    
    WI_FI("WI_FI");

    private String value;

    ServiceCategoryEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ServiceCategoryEnum fromValue(String value) {
      for (ServiceCategoryEnum b : ServiceCategoryEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ServiceCategoryEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ServiceCategoryEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ServiceCategoryEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ServiceCategoryEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SERVICE_CATEGORY = "serviceCategory";
  @SerializedName(SERIALIZED_NAME_SERVICE_CATEGORY)
  private ServiceCategoryEnum serviceCategory;


  public AirlineAncillaryServiceCategory serviceCategory(ServiceCategoryEnum serviceCategory) {
    
    this.serviceCategory = serviceCategory;
    return this;
  }

   /**
   * Identifies the service purchased in the transaction if not a base ticket
   * @return serviceCategory
  **/
  @ApiModelProperty(example = "BAGGAGE_FEE", required = true, value = "Identifies the service purchased in the transaction if not a base ticket")

  public ServiceCategoryEnum getServiceCategory() {
    return serviceCategory;
  }



  public void setServiceCategory(ServiceCategoryEnum serviceCategory) {
    this.serviceCategory = serviceCategory;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AirlineAncillaryServiceCategory airlineAncillaryServiceCategory = (AirlineAncillaryServiceCategory) o;
    return Objects.equals(this.serviceCategory, airlineAncillaryServiceCategory.serviceCategory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceCategory);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AirlineAncillaryServiceCategory {\n");
    sb.append("    serviceCategory: ").append(toIndentedString(serviceCategory)).append("\n");
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

