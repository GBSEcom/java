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
import com.github.GBSEcom.model.CustomerAddress;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Customer model for customers registered at merchant&#39;s website.
 */
@ApiModel(description = "Customer model for customers registered at merchant's website.")

public class Customer {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_START_DATE = "startDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private String startDate;

  public static final String SERIALIZED_NAME_FIRST_NAME = "firstName";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_LAST_NAME = "lastName";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public static final String SERIALIZED_NAME_MIDDLE_NAME = "middleName";
  @SerializedName(SERIALIZED_NAME_MIDDLE_NAME)
  private String middleName;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_SESSION_ID = "sessionId";
  @SerializedName(SERIALIZED_NAME_SESSION_ID)
  private String sessionId;

  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;

  /**
   * The customers gender. Do not set this property if the customer does not specify a gender.
   */
  @JsonAdapter(GenderEnum.Adapter.class)
  public enum GenderEnum {
    MALE("male"),
    
    FEMALE("female"),
    
    OTHER("other");

    private String value;

    GenderEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static GenderEnum fromValue(String value) {
      for (GenderEnum b : GenderEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<GenderEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final GenderEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public GenderEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return GenderEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_GENDER = "gender";
  @SerializedName(SERIALIZED_NAME_GENDER)
  private GenderEnum gender;

  public static final String SERIALIZED_NAME_DATE_OF_BIRTH = "dateOfBirth";
  @SerializedName(SERIALIZED_NAME_DATE_OF_BIRTH)
  private String dateOfBirth;

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private CustomerAddress address = null;

  public static final String SERIALIZED_NAME_USER_DEFINED = "userDefined";
  @SerializedName(SERIALIZED_NAME_USER_DEFINED)
  private Object userDefined;


  public Customer id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Unique ID for the customer, if registered. This field is required if the parent object is present.
   * @return id
  **/
  @ApiModelProperty(example = "125Xasdf57D", required = true, value = "Unique ID for the customer, if registered. This field is required if the parent object is present.")

  public String getId() {
    return id;
  }



  public void setId(String id) {
    this.id = id;
  }


  public Customer startDate(String startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * The timestamp of the customers registration in the merchants platform. Format is YYYY-MM-DD.
   * @return startDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2017-01-04", value = "The timestamp of the customers registration in the merchants platform. Format is YYYY-MM-DD.")

  public String getStartDate() {
    return startDate;
  }



  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }


  public Customer firstName(String firstName) {
    
    this.firstName = firstName;
    return this;
  }

   /**
   * Customer&#39;s first name.
   * @return firstName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "John", value = "Customer's first name.")

  public String getFirstName() {
    return firstName;
  }



  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  public Customer lastName(String lastName) {
    
    this.lastName = lastName;
    return this;
  }

   /**
   * Customer&#39;s last name.
   * @return lastName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Smith", value = "Customer's last name.")

  public String getLastName() {
    return lastName;
  }



  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  public Customer middleName(String middleName) {
    
    this.middleName = middleName;
    return this;
  }

   /**
   * Customer&#39;s middle name.
   * @return middleName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Joseph", value = "Customer's middle name.")

  public String getMiddleName() {
    return middleName;
  }



  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }


  public Customer email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * Customer&#39;s email address.
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "accept@xyz.com", value = "Customer's email address.")

  public String getEmail() {
    return email;
  }



  public void setEmail(String email) {
    this.email = email;
  }


  public Customer sessionId(String sessionId) {
    
    this.sessionId = sessionId;
    return this;
  }

   /**
   * The unique ID of the current login session. Must be unique for the customer.
   * @return sessionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "session-1", value = "The unique ID of the current login session. Must be unique for the customer.")

  public String getSessionId() {
    return sessionId;
  }



  public void setSessionId(String sessionId) {
    this.sessionId = sessionId;
  }


  public Customer username(String username) {
    
    this.username = username;
    return this;
  }

   /**
   * The username of this customer in the merchants system. This field should contain customer-supplied data if available instead of a generated ID. This field can contain the clients email address if it is also used for authentication purposes.
   * @return username
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "username", value = "The username of this customer in the merchants system. This field should contain customer-supplied data if available instead of a generated ID. This field can contain the clients email address if it is also used for authentication purposes.")

  public String getUsername() {
    return username;
  }



  public void setUsername(String username) {
    this.username = username;
  }


  public Customer gender(GenderEnum gender) {
    
    this.gender = gender;
    return this;
  }

   /**
   * The customers gender. Do not set this property if the customer does not specify a gender.
   * @return gender
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "male", value = "The customers gender. Do not set this property if the customer does not specify a gender.")

  public GenderEnum getGender() {
    return gender;
  }



  public void setGender(GenderEnum gender) {
    this.gender = gender;
  }


  public Customer dateOfBirth(String dateOfBirth) {
    
    this.dateOfBirth = dateOfBirth;
    return this;
  }

   /**
   * The customer&#39;s year of birth. Format is YYYY.
   * @return dateOfBirth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1982", value = "The customer's year of birth. Format is YYYY.")

  public String getDateOfBirth() {
    return dateOfBirth;
  }



  public void setDateOfBirth(String dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }


  public Customer address(CustomerAddress address) {
    
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CustomerAddress getAddress() {
    return address;
  }



  public void setAddress(CustomerAddress address) {
    this.address = address;
  }


  public Customer userDefined(Object userDefined) {
    
    this.userDefined = userDefined;
    return this;
  }

   /**
   * A JSON object that can carry any additional information about the customer that might be helpful for fraud detection.
   * @return userDefined
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"previouslyAffected\":\"Y\"}", value = "A JSON object that can carry any additional information about the customer that might be helpful for fraud detection.")

  public Object getUserDefined() {
    return userDefined;
  }



  public void setUserDefined(Object userDefined) {
    this.userDefined = userDefined;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Customer customer = (Customer) o;
    return Objects.equals(this.id, customer.id) &&
        Objects.equals(this.startDate, customer.startDate) &&
        Objects.equals(this.firstName, customer.firstName) &&
        Objects.equals(this.lastName, customer.lastName) &&
        Objects.equals(this.middleName, customer.middleName) &&
        Objects.equals(this.email, customer.email) &&
        Objects.equals(this.sessionId, customer.sessionId) &&
        Objects.equals(this.username, customer.username) &&
        Objects.equals(this.gender, customer.gender) &&
        Objects.equals(this.dateOfBirth, customer.dateOfBirth) &&
        Objects.equals(this.address, customer.address) &&
        Objects.equals(this.userDefined, customer.userDefined);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, startDate, firstName, lastName, middleName, email, sessionId, username, gender, dateOfBirth, address, userDefined);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Customer {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    userDefined: ").append(toIndentedString(userDefined)).append("\n");
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

