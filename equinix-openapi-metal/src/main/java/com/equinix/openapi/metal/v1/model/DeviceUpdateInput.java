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
 * DeviceUpdateInput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DeviceUpdateInput {
  public static final String SERIALIZED_NAME_ALWAYS_PXE = "always_pxe";
  @SerializedName(SERIALIZED_NAME_ALWAYS_PXE)
  private Boolean alwaysPxe;

  public static final String SERIALIZED_NAME_BILLING_CYCLE = "billing_cycle";
  @SerializedName(SERIALIZED_NAME_BILLING_CYCLE)
  private String billingCycle;

  public static final String SERIALIZED_NAME_CUSTOMDATA = "customdata";
  @SerializedName(SERIALIZED_NAME_CUSTOMDATA)
  private Object customdata;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_HOSTNAME = "hostname";
  @SerializedName(SERIALIZED_NAME_HOSTNAME)
  private String hostname;

  public static final String SERIALIZED_NAME_IPXE_SCRIPT_URL = "ipxe_script_url";
  @SerializedName(SERIALIZED_NAME_IPXE_SCRIPT_URL)
  private String ipxeScriptUrl;

  public static final String SERIALIZED_NAME_LOCKED = "locked";
  @SerializedName(SERIALIZED_NAME_LOCKED)
  private Boolean locked;

  public static final String SERIALIZED_NAME_NETWORK_FROZEN = "network_frozen";
  @SerializedName(SERIALIZED_NAME_NETWORK_FROZEN)
  private Boolean networkFrozen;

  public static final String SERIALIZED_NAME_SPOT_INSTANCE = "spot_instance";
  @SerializedName(SERIALIZED_NAME_SPOT_INSTANCE)
  private Boolean spotInstance;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<String> tags = null;

  public static final String SERIALIZED_NAME_USERDATA = "userdata";
  @SerializedName(SERIALIZED_NAME_USERDATA)
  private String userdata;

  public DeviceUpdateInput() {
  }

  public DeviceUpdateInput alwaysPxe(Boolean alwaysPxe) {
    
    this.alwaysPxe = alwaysPxe;
    return this;
  }

   /**
   * Get alwaysPxe
   * @return alwaysPxe
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getAlwaysPxe() {
    return alwaysPxe;
  }


  public void setAlwaysPxe(Boolean alwaysPxe) {
    this.alwaysPxe = alwaysPxe;
  }


  public DeviceUpdateInput billingCycle(String billingCycle) {
    
    this.billingCycle = billingCycle;
    return this;
  }

   /**
   * Get billingCycle
   * @return billingCycle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBillingCycle() {
    return billingCycle;
  }


  public void setBillingCycle(String billingCycle) {
    this.billingCycle = billingCycle;
  }


  public DeviceUpdateInput customdata(Object customdata) {
    
    this.customdata = customdata;
    return this;
  }

   /**
   * Get customdata
   * @return customdata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getCustomdata() {
    return customdata;
  }


  public void setCustomdata(Object customdata) {
    this.customdata = customdata;
  }


  public DeviceUpdateInput description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public DeviceUpdateInput hostname(String hostname) {
    
    this.hostname = hostname;
    return this;
  }

   /**
   * Get hostname
   * @return hostname
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getHostname() {
    return hostname;
  }


  public void setHostname(String hostname) {
    this.hostname = hostname;
  }


  public DeviceUpdateInput ipxeScriptUrl(String ipxeScriptUrl) {
    
    this.ipxeScriptUrl = ipxeScriptUrl;
    return this;
  }

   /**
   * Get ipxeScriptUrl
   * @return ipxeScriptUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIpxeScriptUrl() {
    return ipxeScriptUrl;
  }


  public void setIpxeScriptUrl(String ipxeScriptUrl) {
    this.ipxeScriptUrl = ipxeScriptUrl;
  }


  public DeviceUpdateInput locked(Boolean locked) {
    
    this.locked = locked;
    return this;
  }

   /**
   * Get locked
   * @return locked
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getLocked() {
    return locked;
  }


  public void setLocked(Boolean locked) {
    this.locked = locked;
  }


  public DeviceUpdateInput networkFrozen(Boolean networkFrozen) {
    
    this.networkFrozen = networkFrozen;
    return this;
  }

   /**
   * If true, this instance can not be converted to a different network type.
   * @return networkFrozen
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If true, this instance can not be converted to a different network type.")

  public Boolean getNetworkFrozen() {
    return networkFrozen;
  }


  public void setNetworkFrozen(Boolean networkFrozen) {
    this.networkFrozen = networkFrozen;
  }


  public DeviceUpdateInput spotInstance(Boolean spotInstance) {
    
    this.spotInstance = spotInstance;
    return this;
  }

   /**
   * Get spotInstance
   * @return spotInstance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getSpotInstance() {
    return spotInstance;
  }


  public void setSpotInstance(Boolean spotInstance) {
    this.spotInstance = spotInstance;
  }


  public DeviceUpdateInput tags(List<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public DeviceUpdateInput addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getTags() {
    return tags;
  }


  public void setTags(List<String> tags) {
    this.tags = tags;
  }


  public DeviceUpdateInput userdata(String userdata) {
    
    this.userdata = userdata;
    return this;
  }

   /**
   * Get userdata
   * @return userdata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUserdata() {
    return userdata;
  }


  public void setUserdata(String userdata) {
    this.userdata = userdata;
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
  public DeviceUpdateInput putAdditionalProperty(String key, Object value) {
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
    DeviceUpdateInput deviceUpdateInput = (DeviceUpdateInput) o;
    return Objects.equals(this.alwaysPxe, deviceUpdateInput.alwaysPxe) &&
        Objects.equals(this.billingCycle, deviceUpdateInput.billingCycle) &&
        Objects.equals(this.customdata, deviceUpdateInput.customdata) &&
        Objects.equals(this.description, deviceUpdateInput.description) &&
        Objects.equals(this.hostname, deviceUpdateInput.hostname) &&
        Objects.equals(this.ipxeScriptUrl, deviceUpdateInput.ipxeScriptUrl) &&
        Objects.equals(this.locked, deviceUpdateInput.locked) &&
        Objects.equals(this.networkFrozen, deviceUpdateInput.networkFrozen) &&
        Objects.equals(this.spotInstance, deviceUpdateInput.spotInstance) &&
        Objects.equals(this.tags, deviceUpdateInput.tags) &&
        Objects.equals(this.userdata, deviceUpdateInput.userdata)&&
        Objects.equals(this.additionalProperties, deviceUpdateInput.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alwaysPxe, billingCycle, customdata, description, hostname, ipxeScriptUrl, locked, networkFrozen, spotInstance, tags, userdata, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceUpdateInput {\n");
    sb.append("    alwaysPxe: ").append(toIndentedString(alwaysPxe)).append("\n");
    sb.append("    billingCycle: ").append(toIndentedString(billingCycle)).append("\n");
    sb.append("    customdata: ").append(toIndentedString(customdata)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
    sb.append("    ipxeScriptUrl: ").append(toIndentedString(ipxeScriptUrl)).append("\n");
    sb.append("    locked: ").append(toIndentedString(locked)).append("\n");
    sb.append("    networkFrozen: ").append(toIndentedString(networkFrozen)).append("\n");
    sb.append("    spotInstance: ").append(toIndentedString(spotInstance)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    userdata: ").append(toIndentedString(userdata)).append("\n");
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
    openapiFields.add("always_pxe");
    openapiFields.add("billing_cycle");
    openapiFields.add("customdata");
    openapiFields.add("description");
    openapiFields.add("hostname");
    openapiFields.add("ipxe_script_url");
    openapiFields.add("locked");
    openapiFields.add("network_frozen");
    openapiFields.add("spot_instance");
    openapiFields.add("tags");
    openapiFields.add("userdata");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DeviceUpdateInput
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!DeviceUpdateInput.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DeviceUpdateInput is not found in the empty JSON string", DeviceUpdateInput.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("billing_cycle") != null && !jsonObj.get("billing_cycle").isJsonNull()) && !jsonObj.get("billing_cycle").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `billing_cycle` to be a primitive type in the JSON string but got `%s`", jsonObj.get("billing_cycle").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("hostname") != null && !jsonObj.get("hostname").isJsonNull()) && !jsonObj.get("hostname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hostname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hostname").toString()));
      }
      if ((jsonObj.get("ipxe_script_url") != null && !jsonObj.get("ipxe_script_url").isJsonNull()) && !jsonObj.get("ipxe_script_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ipxe_script_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ipxe_script_url").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("tags").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `tags` to be an array in the JSON string but got `%s`", jsonObj.get("tags").toString()));
      }
      if ((jsonObj.get("userdata") != null && !jsonObj.get("userdata").isJsonNull()) && !jsonObj.get("userdata").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `userdata` to be a primitive type in the JSON string but got `%s`", jsonObj.get("userdata").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DeviceUpdateInput.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DeviceUpdateInput' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DeviceUpdateInput> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DeviceUpdateInput.class));

       return (TypeAdapter<T>) new TypeAdapter<DeviceUpdateInput>() {
           @Override
           public void write(JsonWriter out, DeviceUpdateInput value) throws IOException {
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
           public DeviceUpdateInput read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             DeviceUpdateInput instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of DeviceUpdateInput given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DeviceUpdateInput
  * @throws IOException if the JSON string is invalid with respect to DeviceUpdateInput
  */
  public static DeviceUpdateInput fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DeviceUpdateInput.class);
  }

 /**
  * Convert an instance of DeviceUpdateInput to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

