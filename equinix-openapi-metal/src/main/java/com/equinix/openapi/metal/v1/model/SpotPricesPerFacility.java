/*
 * Metal API
 * This is the API for Equinix Metal. The API allows you to programmatically interact with all of your Equinix Metal resources, including devices, networks, addresses, organizations, projects, and your user account.  The official API docs are hosted at <https://metal.equinix.com/developers/api>. 
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: support@equinixmetal.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.equinix.openapi.metal.v1.model;

import java.util.Objects;
import java.util.Arrays;
import com.equinix.openapi.metal.v1.model.SpotPricesPerBaremetal;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.equinix.openapi.JSON;

/**
 * SpotPricesPerFacility
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SpotPricesPerFacility {
  public static final String SERIALIZED_NAME_BAREMETAL0 = "baremetal_0";
  @SerializedName(SERIALIZED_NAME_BAREMETAL0)
  private SpotPricesPerBaremetal baremetal0;

  public static final String SERIALIZED_NAME_BAREMETAL1 = "baremetal_1";
  @SerializedName(SERIALIZED_NAME_BAREMETAL1)
  private SpotPricesPerBaremetal baremetal1;

  public static final String SERIALIZED_NAME_BAREMETAL2 = "baremetal_2";
  @SerializedName(SERIALIZED_NAME_BAREMETAL2)
  private SpotPricesPerBaremetal baremetal2;

  public static final String SERIALIZED_NAME_BAREMETAL2A = "baremetal_2a";
  @SerializedName(SERIALIZED_NAME_BAREMETAL2A)
  private SpotPricesPerBaremetal baremetal2a;

  public static final String SERIALIZED_NAME_BAREMETAL2A2 = "baremetal_2a2";
  @SerializedName(SERIALIZED_NAME_BAREMETAL2A2)
  private SpotPricesPerBaremetal baremetal2a2;

  public static final String SERIALIZED_NAME_BAREMETAL3 = "baremetal_3";
  @SerializedName(SERIALIZED_NAME_BAREMETAL3)
  private SpotPricesPerBaremetal baremetal3;

  public static final String SERIALIZED_NAME_BAREMETAL_S = "baremetal_s";
  @SerializedName(SERIALIZED_NAME_BAREMETAL_S)
  private SpotPricesPerBaremetal baremetalS;

  public static final String SERIALIZED_NAME_C2_MEDIUM_X86 = "c2.medium.x86";
  @SerializedName(SERIALIZED_NAME_C2_MEDIUM_X86)
  private SpotPricesPerBaremetal c2MediumX86;

  public static final String SERIALIZED_NAME_M2_XLARGE_X86 = "m2.xlarge.x86";
  @SerializedName(SERIALIZED_NAME_M2_XLARGE_X86)
  private SpotPricesPerBaremetal m2XlargeX86;

  public SpotPricesPerFacility() {
  }

  public SpotPricesPerFacility baremetal0(SpotPricesPerBaremetal baremetal0) {
    
    this.baremetal0 = baremetal0;
    return this;
  }

   /**
   * Get baremetal0
   * @return baremetal0
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SpotPricesPerBaremetal getBaremetal0() {
    return baremetal0;
  }


  public void setBaremetal0(SpotPricesPerBaremetal baremetal0) {
    this.baremetal0 = baremetal0;
  }


  public SpotPricesPerFacility baremetal1(SpotPricesPerBaremetal baremetal1) {
    
    this.baremetal1 = baremetal1;
    return this;
  }

   /**
   * Get baremetal1
   * @return baremetal1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SpotPricesPerBaremetal getBaremetal1() {
    return baremetal1;
  }


  public void setBaremetal1(SpotPricesPerBaremetal baremetal1) {
    this.baremetal1 = baremetal1;
  }


  public SpotPricesPerFacility baremetal2(SpotPricesPerBaremetal baremetal2) {
    
    this.baremetal2 = baremetal2;
    return this;
  }

   /**
   * Get baremetal2
   * @return baremetal2
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SpotPricesPerBaremetal getBaremetal2() {
    return baremetal2;
  }


  public void setBaremetal2(SpotPricesPerBaremetal baremetal2) {
    this.baremetal2 = baremetal2;
  }


  public SpotPricesPerFacility baremetal2a(SpotPricesPerBaremetal baremetal2a) {
    
    this.baremetal2a = baremetal2a;
    return this;
  }

   /**
   * Get baremetal2a
   * @return baremetal2a
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SpotPricesPerBaremetal getBaremetal2a() {
    return baremetal2a;
  }


  public void setBaremetal2a(SpotPricesPerBaremetal baremetal2a) {
    this.baremetal2a = baremetal2a;
  }


  public SpotPricesPerFacility baremetal2a2(SpotPricesPerBaremetal baremetal2a2) {
    
    this.baremetal2a2 = baremetal2a2;
    return this;
  }

   /**
   * Get baremetal2a2
   * @return baremetal2a2
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SpotPricesPerBaremetal getBaremetal2a2() {
    return baremetal2a2;
  }


  public void setBaremetal2a2(SpotPricesPerBaremetal baremetal2a2) {
    this.baremetal2a2 = baremetal2a2;
  }


  public SpotPricesPerFacility baremetal3(SpotPricesPerBaremetal baremetal3) {
    
    this.baremetal3 = baremetal3;
    return this;
  }

   /**
   * Get baremetal3
   * @return baremetal3
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SpotPricesPerBaremetal getBaremetal3() {
    return baremetal3;
  }


  public void setBaremetal3(SpotPricesPerBaremetal baremetal3) {
    this.baremetal3 = baremetal3;
  }


  public SpotPricesPerFacility baremetalS(SpotPricesPerBaremetal baremetalS) {
    
    this.baremetalS = baremetalS;
    return this;
  }

   /**
   * Get baremetalS
   * @return baremetalS
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SpotPricesPerBaremetal getBaremetalS() {
    return baremetalS;
  }


  public void setBaremetalS(SpotPricesPerBaremetal baremetalS) {
    this.baremetalS = baremetalS;
  }


  public SpotPricesPerFacility c2MediumX86(SpotPricesPerBaremetal c2MediumX86) {
    
    this.c2MediumX86 = c2MediumX86;
    return this;
  }

   /**
   * Get c2MediumX86
   * @return c2MediumX86
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SpotPricesPerBaremetal getC2MediumX86() {
    return c2MediumX86;
  }


  public void setC2MediumX86(SpotPricesPerBaremetal c2MediumX86) {
    this.c2MediumX86 = c2MediumX86;
  }


  public SpotPricesPerFacility m2XlargeX86(SpotPricesPerBaremetal m2XlargeX86) {
    
    this.m2XlargeX86 = m2XlargeX86;
    return this;
  }

   /**
   * Get m2XlargeX86
   * @return m2XlargeX86
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SpotPricesPerBaremetal getM2XlargeX86() {
    return m2XlargeX86;
  }


  public void setM2XlargeX86(SpotPricesPerBaremetal m2XlargeX86) {
    this.m2XlargeX86 = m2XlargeX86;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   */
  public SpotPricesPerFacility putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpotPricesPerFacility spotPricesPerFacility = (SpotPricesPerFacility) o;
    return Objects.equals(this.baremetal0, spotPricesPerFacility.baremetal0) &&
        Objects.equals(this.baremetal1, spotPricesPerFacility.baremetal1) &&
        Objects.equals(this.baremetal2, spotPricesPerFacility.baremetal2) &&
        Objects.equals(this.baremetal2a, spotPricesPerFacility.baremetal2a) &&
        Objects.equals(this.baremetal2a2, spotPricesPerFacility.baremetal2a2) &&
        Objects.equals(this.baremetal3, spotPricesPerFacility.baremetal3) &&
        Objects.equals(this.baremetalS, spotPricesPerFacility.baremetalS) &&
        Objects.equals(this.c2MediumX86, spotPricesPerFacility.c2MediumX86) &&
        Objects.equals(this.m2XlargeX86, spotPricesPerFacility.m2XlargeX86)&&
        Objects.equals(this.additionalProperties, spotPricesPerFacility.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baremetal0, baremetal1, baremetal2, baremetal2a, baremetal2a2, baremetal3, baremetalS, c2MediumX86, m2XlargeX86, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpotPricesPerFacility {\n");
    sb.append("    baremetal0: ").append(toIndentedString(baremetal0)).append("\n");
    sb.append("    baremetal1: ").append(toIndentedString(baremetal1)).append("\n");
    sb.append("    baremetal2: ").append(toIndentedString(baremetal2)).append("\n");
    sb.append("    baremetal2a: ").append(toIndentedString(baremetal2a)).append("\n");
    sb.append("    baremetal2a2: ").append(toIndentedString(baremetal2a2)).append("\n");
    sb.append("    baremetal3: ").append(toIndentedString(baremetal3)).append("\n");
    sb.append("    baremetalS: ").append(toIndentedString(baremetalS)).append("\n");
    sb.append("    c2MediumX86: ").append(toIndentedString(c2MediumX86)).append("\n");
    sb.append("    m2XlargeX86: ").append(toIndentedString(m2XlargeX86)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("baremetal_0");
    openapiFields.add("baremetal_1");
    openapiFields.add("baremetal_2");
    openapiFields.add("baremetal_2a");
    openapiFields.add("baremetal_2a2");
    openapiFields.add("baremetal_3");
    openapiFields.add("baremetal_s");
    openapiFields.add("c2.medium.x86");
    openapiFields.add("m2.xlarge.x86");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SpotPricesPerFacility
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!SpotPricesPerFacility.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SpotPricesPerFacility is not found in the empty JSON string", SpotPricesPerFacility.openapiRequiredFields.toString()));
        }
      }
      // validate the optional field `baremetal_0`
      if (jsonObj.get("baremetal_0") != null && !jsonObj.get("baremetal_0").isJsonNull()) {
        SpotPricesPerBaremetal.validateJsonObject(jsonObj.getAsJsonObject("baremetal_0"));
      }
      // validate the optional field `baremetal_1`
      if (jsonObj.get("baremetal_1") != null && !jsonObj.get("baremetal_1").isJsonNull()) {
        SpotPricesPerBaremetal.validateJsonObject(jsonObj.getAsJsonObject("baremetal_1"));
      }
      // validate the optional field `baremetal_2`
      if (jsonObj.get("baremetal_2") != null && !jsonObj.get("baremetal_2").isJsonNull()) {
        SpotPricesPerBaremetal.validateJsonObject(jsonObj.getAsJsonObject("baremetal_2"));
      }
      // validate the optional field `baremetal_2a`
      if (jsonObj.get("baremetal_2a") != null && !jsonObj.get("baremetal_2a").isJsonNull()) {
        SpotPricesPerBaremetal.validateJsonObject(jsonObj.getAsJsonObject("baremetal_2a"));
      }
      // validate the optional field `baremetal_2a2`
      if (jsonObj.get("baremetal_2a2") != null && !jsonObj.get("baremetal_2a2").isJsonNull()) {
        SpotPricesPerBaremetal.validateJsonObject(jsonObj.getAsJsonObject("baremetal_2a2"));
      }
      // validate the optional field `baremetal_3`
      if (jsonObj.get("baremetal_3") != null && !jsonObj.get("baremetal_3").isJsonNull()) {
        SpotPricesPerBaremetal.validateJsonObject(jsonObj.getAsJsonObject("baremetal_3"));
      }
      // validate the optional field `baremetal_s`
      if (jsonObj.get("baremetal_s") != null && !jsonObj.get("baremetal_s").isJsonNull()) {
        SpotPricesPerBaremetal.validateJsonObject(jsonObj.getAsJsonObject("baremetal_s"));
      }
      // validate the optional field `c2.medium.x86`
      if (jsonObj.get("c2.medium.x86") != null && !jsonObj.get("c2.medium.x86").isJsonNull()) {
        SpotPricesPerBaremetal.validateJsonObject(jsonObj.getAsJsonObject("c2.medium.x86"));
      }
      // validate the optional field `m2.xlarge.x86`
      if (jsonObj.get("m2.xlarge.x86") != null && !jsonObj.get("m2.xlarge.x86").isJsonNull()) {
        SpotPricesPerBaremetal.validateJsonObject(jsonObj.getAsJsonObject("m2.xlarge.x86"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SpotPricesPerFacility.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SpotPricesPerFacility' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SpotPricesPerFacility> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SpotPricesPerFacility.class));

       return (TypeAdapter<T>) new TypeAdapter<SpotPricesPerFacility>() {
           @Override
           public void write(JsonWriter out, SpotPricesPerFacility value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public SpotPricesPerFacility read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             SpotPricesPerFacility instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else { // non-primitive type
                   instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SpotPricesPerFacility given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SpotPricesPerFacility
  * @throws IOException if the JSON string is invalid with respect to SpotPricesPerFacility
  */
  public static SpotPricesPerFacility fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SpotPricesPerFacility.class);
  }

 /**
  * Convert an instance of SpotPricesPerFacility to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

