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
import com.equinix.openapi.metal.v1.model.Address;
import com.equinix.openapi.metal.v1.model.Href;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.File;
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
 * Organization
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Organization {
  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private Address address;

  public static final String SERIALIZED_NAME_BILLING_ADDRESS = "billing_address";
  @SerializedName(SERIALIZED_NAME_BILLING_ADDRESS)
  private Address billingAddress;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_CREDIT_AMOUNT = "credit_amount";
  @SerializedName(SERIALIZED_NAME_CREDIT_AMOUNT)
  private Float creditAmount;

  public static final String SERIALIZED_NAME_CUSTOMDATA = "customdata";
  @SerializedName(SERIALIZED_NAME_CUSTOMDATA)
  private Object customdata;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ENFORCE2FA_AT = "enforce_2fa_at";
  @SerializedName(SERIALIZED_NAME_ENFORCE2FA_AT)
  private OffsetDateTime enforce2faAt;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_LOGO = "logo";
  @SerializedName(SERIALIZED_NAME_LOGO)
  private File logo;

  public static final String SERIALIZED_NAME_MEMBERS = "members";
  @SerializedName(SERIALIZED_NAME_MEMBERS)
  private List<Href> members = null;

  public static final String SERIALIZED_NAME_MEMBERSHIPS = "memberships";
  @SerializedName(SERIALIZED_NAME_MEMBERSHIPS)
  private List<Href> memberships = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PROJECTS = "projects";
  @SerializedName(SERIALIZED_NAME_PROJECTS)
  private List<Href> projects = null;

  public static final String SERIALIZED_NAME_TERMS = "terms";
  @SerializedName(SERIALIZED_NAME_TERMS)
  private Integer terms;

  public static final String SERIALIZED_NAME_TWITTER = "twitter";
  @SerializedName(SERIALIZED_NAME_TWITTER)
  private String twitter;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_WEBSITE = "website";
  @SerializedName(SERIALIZED_NAME_WEBSITE)
  private String website;

  public Organization() {
  }

  public Organization address(Address address) {
    
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Address getAddress() {
    return address;
  }


  public void setAddress(Address address) {
    this.address = address;
  }


  public Organization billingAddress(Address billingAddress) {
    
    this.billingAddress = billingAddress;
    return this;
  }

   /**
   * Get billingAddress
   * @return billingAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Address getBillingAddress() {
    return billingAddress;
  }


  public void setBillingAddress(Address billingAddress) {
    this.billingAddress = billingAddress;
  }


  public Organization createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public Organization creditAmount(Float creditAmount) {
    
    this.creditAmount = creditAmount;
    return this;
  }

   /**
   * Get creditAmount
   * @return creditAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Float getCreditAmount() {
    return creditAmount;
  }


  public void setCreditAmount(Float creditAmount) {
    this.creditAmount = creditAmount;
  }


  public Organization customdata(Object customdata) {
    
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


  public Organization description(String description) {
    
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


  public Organization enforce2faAt(OffsetDateTime enforce2faAt) {
    
    this.enforce2faAt = enforce2faAt;
    return this;
  }

   /**
   * Force to all members to have enabled the two factor authentication after that date, unless the value is null
   * @return enforce2faAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Force to all members to have enabled the two factor authentication after that date, unless the value is null")

  public OffsetDateTime getEnforce2faAt() {
    return enforce2faAt;
  }


  public void setEnforce2faAt(OffsetDateTime enforce2faAt) {
    this.enforce2faAt = enforce2faAt;
  }


  public Organization id(UUID id) {
    
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


  public Organization logo(File logo) {
    
    this.logo = logo;
    return this;
  }

   /**
   * Get logo
   * @return logo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public File getLogo() {
    return logo;
  }


  public void setLogo(File logo) {
    this.logo = logo;
  }


  public Organization members(List<Href> members) {
    
    this.members = members;
    return this;
  }

  public Organization addMembersItem(Href membersItem) {
    if (this.members == null) {
      this.members = new ArrayList<>();
    }
    this.members.add(membersItem);
    return this;
  }

   /**
   * Get members
   * @return members
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Href> getMembers() {
    return members;
  }


  public void setMembers(List<Href> members) {
    this.members = members;
  }


  public Organization memberships(List<Href> memberships) {
    
    this.memberships = memberships;
    return this;
  }

  public Organization addMembershipsItem(Href membershipsItem) {
    if (this.memberships == null) {
      this.memberships = new ArrayList<>();
    }
    this.memberships.add(membershipsItem);
    return this;
  }

   /**
   * Get memberships
   * @return memberships
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Href> getMemberships() {
    return memberships;
  }


  public void setMemberships(List<Href> memberships) {
    this.memberships = memberships;
  }


  public Organization name(String name) {
    
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


  public Organization projects(List<Href> projects) {
    
    this.projects = projects;
    return this;
  }

  public Organization addProjectsItem(Href projectsItem) {
    if (this.projects == null) {
      this.projects = new ArrayList<>();
    }
    this.projects.add(projectsItem);
    return this;
  }

   /**
   * Get projects
   * @return projects
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Href> getProjects() {
    return projects;
  }


  public void setProjects(List<Href> projects) {
    this.projects = projects;
  }


  public Organization terms(Integer terms) {
    
    this.terms = terms;
    return this;
  }

   /**
   * Get terms
   * @return terms
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getTerms() {
    return terms;
  }


  public void setTerms(Integer terms) {
    this.terms = terms;
  }


  public Organization twitter(String twitter) {
    
    this.twitter = twitter;
    return this;
  }

   /**
   * Get twitter
   * @return twitter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTwitter() {
    return twitter;
  }


  public void setTwitter(String twitter) {
    this.twitter = twitter;
  }


  public Organization updatedAt(OffsetDateTime updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  public Organization website(String website) {
    
    this.website = website;
    return this;
  }

   /**
   * Get website
   * @return website
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getWebsite() {
    return website;
  }


  public void setWebsite(String website) {
    this.website = website;
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
  public Organization putAdditionalProperty(String key, Object value) {
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
    Organization organization = (Organization) o;
    return Objects.equals(this.address, organization.address) &&
        Objects.equals(this.billingAddress, organization.billingAddress) &&
        Objects.equals(this.createdAt, organization.createdAt) &&
        Objects.equals(this.creditAmount, organization.creditAmount) &&
        Objects.equals(this.customdata, organization.customdata) &&
        Objects.equals(this.description, organization.description) &&
        Objects.equals(this.enforce2faAt, organization.enforce2faAt) &&
        Objects.equals(this.id, organization.id) &&
        Objects.equals(this.logo, organization.logo) &&
        Objects.equals(this.members, organization.members) &&
        Objects.equals(this.memberships, organization.memberships) &&
        Objects.equals(this.name, organization.name) &&
        Objects.equals(this.projects, organization.projects) &&
        Objects.equals(this.terms, organization.terms) &&
        Objects.equals(this.twitter, organization.twitter) &&
        Objects.equals(this.updatedAt, organization.updatedAt) &&
        Objects.equals(this.website, organization.website)&&
        Objects.equals(this.additionalProperties, organization.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, billingAddress, createdAt, creditAmount, customdata, description, enforce2faAt, id, logo, members, memberships, name, projects, terms, twitter, updatedAt, website, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Organization {\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    billingAddress: ").append(toIndentedString(billingAddress)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    creditAmount: ").append(toIndentedString(creditAmount)).append("\n");
    sb.append("    customdata: ").append(toIndentedString(customdata)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    enforce2faAt: ").append(toIndentedString(enforce2faAt)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    logo: ").append(toIndentedString(logo)).append("\n");
    sb.append("    members: ").append(toIndentedString(members)).append("\n");
    sb.append("    memberships: ").append(toIndentedString(memberships)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    projects: ").append(toIndentedString(projects)).append("\n");
    sb.append("    terms: ").append(toIndentedString(terms)).append("\n");
    sb.append("    twitter: ").append(toIndentedString(twitter)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    website: ").append(toIndentedString(website)).append("\n");
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
    openapiFields.add("address");
    openapiFields.add("billing_address");
    openapiFields.add("created_at");
    openapiFields.add("credit_amount");
    openapiFields.add("customdata");
    openapiFields.add("description");
    openapiFields.add("enforce_2fa_at");
    openapiFields.add("id");
    openapiFields.add("logo");
    openapiFields.add("members");
    openapiFields.add("memberships");
    openapiFields.add("name");
    openapiFields.add("projects");
    openapiFields.add("terms");
    openapiFields.add("twitter");
    openapiFields.add("updated_at");
    openapiFields.add("website");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Organization
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Organization.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Organization is not found in the empty JSON string", Organization.openapiRequiredFields.toString()));
        }
      }
      // validate the optional field `address`
      if (jsonObj.get("address") != null && !jsonObj.get("address").isJsonNull()) {
        Address.validateJsonObject(jsonObj.getAsJsonObject("address"));
      }
      // validate the optional field `billing_address`
      if (jsonObj.get("billing_address") != null && !jsonObj.get("billing_address").isJsonNull()) {
        Address.validateJsonObject(jsonObj.getAsJsonObject("billing_address"));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (jsonObj.get("members") != null && !jsonObj.get("members").isJsonNull()) {
        JsonArray jsonArraymembers = jsonObj.getAsJsonArray("members");
        if (jsonArraymembers != null) {
          // ensure the json data is an array
          if (!jsonObj.get("members").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `members` to be an array in the JSON string but got `%s`", jsonObj.get("members").toString()));
          }

          // validate the optional field `members` (array)
          for (int i = 0; i < jsonArraymembers.size(); i++) {
            Href.validateJsonObject(jsonArraymembers.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("memberships") != null && !jsonObj.get("memberships").isJsonNull()) {
        JsonArray jsonArraymemberships = jsonObj.getAsJsonArray("memberships");
        if (jsonArraymemberships != null) {
          // ensure the json data is an array
          if (!jsonObj.get("memberships").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `memberships` to be an array in the JSON string but got `%s`", jsonObj.get("memberships").toString()));
          }

          // validate the optional field `memberships` (array)
          for (int i = 0; i < jsonArraymemberships.size(); i++) {
            Href.validateJsonObject(jsonArraymemberships.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (jsonObj.get("projects") != null && !jsonObj.get("projects").isJsonNull()) {
        JsonArray jsonArrayprojects = jsonObj.getAsJsonArray("projects");
        if (jsonArrayprojects != null) {
          // ensure the json data is an array
          if (!jsonObj.get("projects").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `projects` to be an array in the JSON string but got `%s`", jsonObj.get("projects").toString()));
          }

          // validate the optional field `projects` (array)
          for (int i = 0; i < jsonArrayprojects.size(); i++) {
            Href.validateJsonObject(jsonArrayprojects.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("twitter") != null && !jsonObj.get("twitter").isJsonNull()) && !jsonObj.get("twitter").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `twitter` to be a primitive type in the JSON string but got `%s`", jsonObj.get("twitter").toString()));
      }
      if ((jsonObj.get("website") != null && !jsonObj.get("website").isJsonNull()) && !jsonObj.get("website").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `website` to be a primitive type in the JSON string but got `%s`", jsonObj.get("website").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Organization.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Organization' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Organization> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Organization.class));

       return (TypeAdapter<T>) new TypeAdapter<Organization>() {
           @Override
           public void write(JsonWriter out, Organization value) throws IOException {
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
           public Organization read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             Organization instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of Organization given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Organization
  * @throws IOException if the JSON string is invalid with respect to Organization
  */
  public static Organization fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Organization.class);
  }

 /**
  * Convert an instance of Organization to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

