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
import com.equinix.openapi.metal.v1.model.Facility;
import com.equinix.openapi.metal.v1.model.Href;
import com.equinix.openapi.metal.v1.model.IPAssignment;
import com.equinix.openapi.metal.v1.model.IPReservation;
import com.equinix.openapi.metal.v1.model.IPReservationMetro;
import com.equinix.openapi.metal.v1.model.MetalGatewayLite;
import com.equinix.openapi.metal.v1.model.Project;
import com.equinix.openapi.metal.v1.model.User;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
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
 * DefaultIPReservation
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DefaultIPReservation extends IPReservation {
  public static final String SERIALIZED_NAME_ADDON = "addon";
  @SerializedName(SERIALIZED_NAME_ADDON)
  private Boolean addon;

  public static final String SERIALIZED_NAME_ASSIGNMENTS = "assignments";
  @SerializedName(SERIALIZED_NAME_ASSIGNMENTS)
  private List<IPAssignment> assignments = null;

  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled;

  public static final String SERIALIZED_NAME_FACILITY = "facility";
  @SerializedName(SERIALIZED_NAME_FACILITY)
  private Facility facility;

  public static final String SERIALIZED_NAME_GLOBAL_IP = "global_ip";
  @SerializedName(SERIALIZED_NAME_GLOBAL_IP)
  private Boolean globalIp;

  public static final String SERIALIZED_NAME_REQUESTED_BY = "requested_by";
  @SerializedName(SERIALIZED_NAME_REQUESTED_BY)
  private User requestedBy;

  public static final String SERIALIZED_NAME_AVAILABLE = "available";
  @SerializedName(SERIALIZED_NAME_AVAILABLE)
  private String available;

  public DefaultIPReservation() {
  }

  public DefaultIPReservation addon(Boolean addon) {
    
    this.addon = addon;
    return this;
  }

   /**
   * Get addon
   * @return addon
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getAddon() {
    return addon;
  }


  public void setAddon(Boolean addon) {
    this.addon = addon;
  }


  public DefaultIPReservation assignments(List<IPAssignment> assignments) {
    
    this.assignments = assignments;
    return this;
  }

  public DefaultIPReservation addAssignmentsItem(IPAssignment assignmentsItem) {
    if (this.assignments == null) {
      this.assignments = new ArrayList<>();
    }
    this.assignments.add(assignmentsItem);
    return this;
  }

   /**
   * Get assignments
   * @return assignments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<IPAssignment> getAssignments() {
    return assignments;
  }


  public void setAssignments(List<IPAssignment> assignments) {
    this.assignments = assignments;
  }


  public DefaultIPReservation enabled(Boolean enabled) {
    
    this.enabled = enabled;
    return this;
  }

   /**
   * Get enabled
   * @return enabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getEnabled() {
    return enabled;
  }


  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  public DefaultIPReservation facility(Facility facility) {
    
    this.facility = facility;
    return this;
  }

   /**
   * Get facility
   * @return facility
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Facility getFacility() {
    return facility;
  }


  public void setFacility(Facility facility) {
    this.facility = facility;
  }


  public DefaultIPReservation globalIp(Boolean globalIp) {
    
    this.globalIp = globalIp;
    return this;
  }

   /**
   * Get globalIp
   * @return globalIp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getGlobalIp() {
    return globalIp;
  }


  public void setGlobalIp(Boolean globalIp) {
    this.globalIp = globalIp;
  }


  public DefaultIPReservation requestedBy(User requestedBy) {
    
    this.requestedBy = requestedBy;
    return this;
  }

   /**
   * Get requestedBy
   * @return requestedBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public User getRequestedBy() {
    return requestedBy;
  }


  public void setRequestedBy(User requestedBy) {
    this.requestedBy = requestedBy;
  }


  public DefaultIPReservation available(String available) {
    
    this.available = available;
    return this;
  }

   /**
   * Get available
   * @return available
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAvailable() {
    return available;
  }


  public void setAvailable(String available) {
    this.available = available;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DefaultIPReservation defaultIPReservation = (DefaultIPReservation) o;
    return Objects.equals(this.addon, defaultIPReservation.addon) &&
        Objects.equals(this.assignments, defaultIPReservation.assignments) &&
        Objects.equals(this.enabled, defaultIPReservation.enabled) &&
        Objects.equals(this.facility, defaultIPReservation.facility) &&
        Objects.equals(this.globalIp, defaultIPReservation.globalIp) &&
        Objects.equals(this.requestedBy, defaultIPReservation.requestedBy) &&
        Objects.equals(this.available, defaultIPReservation.available) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addon, assignments, enabled, facility, globalIp, requestedBy, available, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DefaultIPReservation {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    addon: ").append(toIndentedString(addon)).append("\n");
    sb.append("    assignments: ").append(toIndentedString(assignments)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    facility: ").append(toIndentedString(facility)).append("\n");
    sb.append("    globalIp: ").append(toIndentedString(globalIp)).append("\n");
    sb.append("    requestedBy: ").append(toIndentedString(requestedBy)).append("\n");
    sb.append("    available: ").append(toIndentedString(available)).append("\n");
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
    openapiFields.add("address_family");
    openapiFields.add("bill");
    openapiFields.add("cidr");
    openapiFields.add("created_at");
    openapiFields.add("href");
    openapiFields.add("id");
    openapiFields.add("manageable");
    openapiFields.add("management");
    openapiFields.add("metal_gateway");
    openapiFields.add("metro");
    openapiFields.add("netmask");
    openapiFields.add("network");
    openapiFields.add("public");
    openapiFields.add("state");
    openapiFields.add("tags");
    openapiFields.add("details");
    openapiFields.add("customdata");
    openapiFields.add("project");
    openapiFields.add("project_lite");
    openapiFields.add("address");
    openapiFields.add("gateway");
    openapiFields.add("type");
    openapiFields.add("addon");
    openapiFields.add("assignments");
    openapiFields.add("enabled");
    openapiFields.add("facility");
    openapiFields.add("global_ip");
    openapiFields.add("requested_by");
    openapiFields.add("available");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("type");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DefaultIPReservation
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (DefaultIPReservation.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in DefaultIPReservation is not found in the empty JSON string", DefaultIPReservation.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!DefaultIPReservation.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DefaultIPReservation` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DefaultIPReservation.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      JsonArray jsonArrayassignments = jsonObj.getAsJsonArray("assignments");
      if (jsonArrayassignments != null) {
        // ensure the json data is an array
        if (!jsonObj.get("assignments").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `assignments` to be an array in the JSON string but got `%s`", jsonObj.get("assignments").toString()));
        }

        // validate the optional field `assignments` (array)
        for (int i = 0; i < jsonArrayassignments.size(); i++) {
          IPAssignment.validateJsonObject(jsonArrayassignments.get(i).getAsJsonObject());
        };
      }
      // validate the optional field `facility`
      if (jsonObj.get("facility") != null && !jsonObj.get("facility").isJsonNull()) {
        Facility.validateJsonObject(jsonObj.getAsJsonObject("facility"));
      }
      // validate the optional field `requested_by`
      if (jsonObj.get("requested_by") != null && !jsonObj.get("requested_by").isJsonNull()) {
        User.validateJsonObject(jsonObj.getAsJsonObject("requested_by"));
      }
      if ((jsonObj.get("available") != null && !jsonObj.get("available").isJsonNull()) && !jsonObj.get("available").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `available` to be a primitive type in the JSON string but got `%s`", jsonObj.get("available").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DefaultIPReservation.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DefaultIPReservation' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DefaultIPReservation> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DefaultIPReservation.class));

       return (TypeAdapter<T>) new TypeAdapter<DefaultIPReservation>() {
           @Override
           public void write(JsonWriter out, DefaultIPReservation value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DefaultIPReservation read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DefaultIPReservation given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DefaultIPReservation
  * @throws IOException if the JSON string is invalid with respect to DefaultIPReservation
  */
  public static DefaultIPReservation fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DefaultIPReservation.class);
  }

 /**
  * Convert an instance of DefaultIPReservation to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

