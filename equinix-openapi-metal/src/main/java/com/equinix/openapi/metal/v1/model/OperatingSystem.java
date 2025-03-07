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
import java.util.UUID;

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
 * OperatingSystem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class OperatingSystem {
  public static final String SERIALIZED_NAME_DISTRO = "distro";
  @SerializedName(SERIALIZED_NAME_DISTRO)
  private String distro;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_LICENSED = "licensed";
  @SerializedName(SERIALIZED_NAME_LICENSED)
  private Boolean licensed;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PREINSTALLABLE = "preinstallable";
  @SerializedName(SERIALIZED_NAME_PREINSTALLABLE)
  private Boolean preinstallable;

  public static final String SERIALIZED_NAME_PRICING = "pricing";
  @SerializedName(SERIALIZED_NAME_PRICING)
  private Object pricing;

  public static final String SERIALIZED_NAME_PROVISIONABLE_ON = "provisionable_on";
  @SerializedName(SERIALIZED_NAME_PROVISIONABLE_ON)
  private List<String> provisionableOn = null;

  public static final String SERIALIZED_NAME_SLUG = "slug";
  @SerializedName(SERIALIZED_NAME_SLUG)
  private String slug;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  public OperatingSystem() {
  }

  public OperatingSystem distro(String distro) {
    
    this.distro = distro;
    return this;
  }

   /**
   * Get distro
   * @return distro
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDistro() {
    return distro;
  }


  public void setDistro(String distro) {
    this.distro = distro;
  }


  public OperatingSystem id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    this.id = id;
  }


  public OperatingSystem licensed(Boolean licensed) {
    
    this.licensed = licensed;
    return this;
  }

   /**
   * Licenced OS is priced according to pricing property
   * @return licensed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Licenced OS is priced according to pricing property")

  public Boolean getLicensed() {
    return licensed;
  }


  public void setLicensed(Boolean licensed) {
    this.licensed = licensed;
  }


  public OperatingSystem name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public OperatingSystem preinstallable(Boolean preinstallable) {
    
    this.preinstallable = preinstallable;
    return this;
  }

   /**
   * Servers can be already preinstalled with OS in order to shorten provision time.
   * @return preinstallable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Servers can be already preinstalled with OS in order to shorten provision time.")

  public Boolean getPreinstallable() {
    return preinstallable;
  }


  public void setPreinstallable(Boolean preinstallable) {
    this.preinstallable = preinstallable;
  }


  public OperatingSystem pricing(Object pricing) {
    
    this.pricing = pricing;
    return this;
  }

   /**
   * This object contains price per time unit and optional multiplier value if licence price depends on hardware plan or components (e.g. number of cores)
   * @return pricing
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This object contains price per time unit and optional multiplier value if licence price depends on hardware plan or components (e.g. number of cores)")

  public Object getPricing() {
    return pricing;
  }


  public void setPricing(Object pricing) {
    this.pricing = pricing;
  }


  public OperatingSystem provisionableOn(List<String> provisionableOn) {
    
    this.provisionableOn = provisionableOn;
    return this;
  }

  public OperatingSystem addProvisionableOnItem(String provisionableOnItem) {
    if (this.provisionableOn == null) {
      this.provisionableOn = new ArrayList<>();
    }
    this.provisionableOn.add(provisionableOnItem);
    return this;
  }

   /**
   * Get provisionableOn
   * @return provisionableOn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getProvisionableOn() {
    return provisionableOn;
  }


  public void setProvisionableOn(List<String> provisionableOn) {
    this.provisionableOn = provisionableOn;
  }


  public OperatingSystem slug(String slug) {
    
    this.slug = slug;
    return this;
  }

   /**
   * Get slug
   * @return slug
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSlug() {
    return slug;
  }


  public void setSlug(String slug) {
    this.slug = slug;
  }


  public OperatingSystem version(String version) {
    
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVersion() {
    return version;
  }


  public void setVersion(String version) {
    this.version = version;
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
  public OperatingSystem putAdditionalProperty(String key, Object value) {
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
    OperatingSystem operatingSystem = (OperatingSystem) o;
    return Objects.equals(this.distro, operatingSystem.distro) &&
        Objects.equals(this.id, operatingSystem.id) &&
        Objects.equals(this.licensed, operatingSystem.licensed) &&
        Objects.equals(this.name, operatingSystem.name) &&
        Objects.equals(this.preinstallable, operatingSystem.preinstallable) &&
        Objects.equals(this.pricing, operatingSystem.pricing) &&
        Objects.equals(this.provisionableOn, operatingSystem.provisionableOn) &&
        Objects.equals(this.slug, operatingSystem.slug) &&
        Objects.equals(this.version, operatingSystem.version)&&
        Objects.equals(this.additionalProperties, operatingSystem.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(distro, id, licensed, name, preinstallable, pricing, provisionableOn, slug, version, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperatingSystem {\n");
    sb.append("    distro: ").append(toIndentedString(distro)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    licensed: ").append(toIndentedString(licensed)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    preinstallable: ").append(toIndentedString(preinstallable)).append("\n");
    sb.append("    pricing: ").append(toIndentedString(pricing)).append("\n");
    sb.append("    provisionableOn: ").append(toIndentedString(provisionableOn)).append("\n");
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
    openapiFields.add("distro");
    openapiFields.add("id");
    openapiFields.add("licensed");
    openapiFields.add("name");
    openapiFields.add("preinstallable");
    openapiFields.add("pricing");
    openapiFields.add("provisionable_on");
    openapiFields.add("slug");
    openapiFields.add("version");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OperatingSystem
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!OperatingSystem.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OperatingSystem is not found in the empty JSON string", OperatingSystem.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("distro") != null && !jsonObj.get("distro").isJsonNull()) && !jsonObj.get("distro").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `distro` to be a primitive type in the JSON string but got `%s`", jsonObj.get("distro").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("provisionable_on").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `provisionable_on` to be an array in the JSON string but got `%s`", jsonObj.get("provisionable_on").toString()));
      }
      if ((jsonObj.get("slug") != null && !jsonObj.get("slug").isJsonNull()) && !jsonObj.get("slug").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `slug` to be a primitive type in the JSON string but got `%s`", jsonObj.get("slug").toString()));
      }
      if ((jsonObj.get("version") != null && !jsonObj.get("version").isJsonNull()) && !jsonObj.get("version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("version").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OperatingSystem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OperatingSystem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OperatingSystem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OperatingSystem.class));

       return (TypeAdapter<T>) new TypeAdapter<OperatingSystem>() {
           @Override
           public void write(JsonWriter out, OperatingSystem value) throws IOException {
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
           public OperatingSystem read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             OperatingSystem instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of OperatingSystem given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OperatingSystem
  * @throws IOException if the JSON string is invalid with respect to OperatingSystem
  */
  public static OperatingSystem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OperatingSystem.class);
  }

 /**
  * Convert an instance of OperatingSystem to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

