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
 * Encapsulates the 3DS method form and unique transaction identifier.
 */
@ApiModel(description = "Encapsulates the 3DS method form and unique transaction identifier.")

public class Secure3DAuthenticationResponseSecure3dMethod {
  public static final String SERIALIZED_NAME_METHOD_FORM = "methodForm";
  @SerializedName(SERIALIZED_NAME_METHOD_FORM)
  private String methodForm;

  public static final String SERIALIZED_NAME_SECURE3D_TRANS_ID = "secure3dTransId";
  @SerializedName(SERIALIZED_NAME_SECURE3D_TRANS_ID)
  private String secure3dTransId;


  public Secure3DAuthenticationResponseSecure3dMethod methodForm(String methodForm) {
    
    this.methodForm = methodForm;
    return this;
  }

   /**
   * An iframe to be hidden in the browser used to collect browser data for the issuers. This information adds to the overall consumer profile and helps in identifying potentially fraudulent transactions.
   * @return methodForm
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "&lt;!DOCTYPE iframe SYSTEM \"about:legacy-compat\"&gt; &lt;iframe id=\"tdsMmethodTgtFrame\" name=\"tdsMmethodTgtFrame\"          style=\"width: 1px; height: 1px; display: none;\" src=\"javascript:false;\" xmlns=\"http://www.w3.org/1999/xhtml\"&gt; &lt;!--.--&gt; &lt;/iframe&gt;&lt;form id=\"tdsMmethodForm\" name=\"tdsMmethodForm\"          action=\"https://localhost.modirum.com:8543/dstests/ACSEmu2\" method=\"post\"          target=\"tdsMmethodTgtFrame\" xmlns=\"http://www.w3.org/1999/xhtml\"&gt; &lt;input type=\"hidden\" name=\"3DSMethodData\"          value=\"eyAidGhyZWVEU1NlcnZlclRyYW5zSUQiIDogIjAwMDAwMDAwLTU2NzYtNTY2My04MDAwLTAwMDAw &amp;#10;MDAwNDFhOSIsICJ0aHJlZURTTWV0aG9kTm90aWZpY2F0aW9uVVJMIiA6ICJodHRwczovL2xvY          2Fs&amp;#10;aG9zdC5tb2RpcnVtLmNvbTo4NTQzL21kcGF5bXBpL01lcmNoYW50U2VydmVyP21uPVkmdHhpZD0x &amp;#10;NjgwOSZkaWdlc3Q9aSUyQnhhUEF5NWFOcVJRbllqNmozbWFDZlFJbTdFdjJYTmkwNn          h6YmZNJTJG&amp;#10;R3MlM0QiIH0\"/&gt; &lt;input type=\"hidden\" name=\"threeDSMethodData\"          value=\"eyAidGhyZWVEU1NlcnZlclRyYW5zSUQiIDogIjAwMDAwMDAwLTU2NzYtNTY2My04MDAwLTAwMDA          w&amp;#10;MDAwNDFhOSIsICJ0aHJlZURTTWV0aG9kTm90aWZpY2F0aW9uVVJMIiA6ICJodHRwczovL2xvY          2Fs&amp;#10;aG9zdC5tb2RpcnVtLmNvbTo4NTQzL21kcGF5bXBpL01lcmNoYW50U2VydmVyP21uPVkmd          HhpZD0x&amp;#10;NjgwOSZkaWdlc3Q9aSUyQnhhUEF5NWFOcVJRbllqNmozbWFDZlFJbTdFdjJYTmkwNn          h6YmZNJTJG&amp;#10;R3MlM0QiIH0\"/&gt; &lt;/form&gt;&lt;script type=\"text/javascript\" xmlns=\"http://www.w3.org/1999/xhtml\"&gt;          document.getElementById(\"tdsMmethodForm\").submit(); &lt;/script&gt;", value = "An iframe to be hidden in the browser used to collect browser data for the issuers. This information adds to the overall consumer profile and helps in identifying potentially fraudulent transactions.")

  public String getMethodForm() {
    return methodForm;
  }



  public void setMethodForm(String methodForm) {
    this.methodForm = methodForm;
  }


  public Secure3DAuthenticationResponseSecure3dMethod secure3dTransId(String secure3dTransId) {
    
    this.secure3dTransId = secure3dTransId;
    return this;
  }

   /**
   * A unique transaction identifier supplied by the ACS.
   * @return secure3dTransId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3ac7caa7-aa42-2663-791b-2ac05a542c4a", value = "A unique transaction identifier supplied by the ACS.")

  public String getSecure3dTransId() {
    return secure3dTransId;
  }



  public void setSecure3dTransId(String secure3dTransId) {
    this.secure3dTransId = secure3dTransId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Secure3DAuthenticationResponseSecure3dMethod secure3DAuthenticationResponseSecure3dMethod = (Secure3DAuthenticationResponseSecure3dMethod) o;
    return Objects.equals(this.methodForm, secure3DAuthenticationResponseSecure3dMethod.methodForm) &&
        Objects.equals(this.secure3dTransId, secure3DAuthenticationResponseSecure3dMethod.secure3dTransId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(methodForm, secure3dTransId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Secure3DAuthenticationResponseSecure3dMethod {\n");
    sb.append("    methodForm: ").append(toIndentedString(methodForm)).append("\n");
    sb.append("    secure3dTransId: ").append(toIndentedString(secure3dTransId)).append("\n");
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

