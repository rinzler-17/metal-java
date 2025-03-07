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
import com.equinix.openapi.metal.v1.model.BgpNeighborDataRoutesInInner;
import com.equinix.openapi.metal.v1.model.BgpNeighborDataRoutesOutInner;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
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
 * BgpNeighborData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class BgpNeighborData {
  public static final String SERIALIZED_NAME_ADDRESS_FAMILY = "address_family";
  @SerializedName(SERIALIZED_NAME_ADDRESS_FAMILY)
  private BigDecimal addressFamily;

  public static final String SERIALIZED_NAME_CUSTOMER_AS = "customer_as";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_AS)
  private BigDecimal customerAs;

  public static final String SERIALIZED_NAME_CUSTOMER_IP = "customer_ip";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_IP)
  private String customerIp;

  public static final String SERIALIZED_NAME_MD5_ENABLED = "md5_enabled";
  @SerializedName(SERIALIZED_NAME_MD5_ENABLED)
  private Boolean md5Enabled;

  public static final String SERIALIZED_NAME_MD5_PASSWORD = "md5_password";
  @SerializedName(SERIALIZED_NAME_MD5_PASSWORD)
  private String md5Password;

  public static final String SERIALIZED_NAME_MULTIHOP = "multihop";
  @SerializedName(SERIALIZED_NAME_MULTIHOP)
  private Boolean multihop;

  public static final String SERIALIZED_NAME_PEER_AS = "peer_as";
  @SerializedName(SERIALIZED_NAME_PEER_AS)
  private BigDecimal peerAs;

  public static final String SERIALIZED_NAME_PEER_IPS = "peer_ips";
  @SerializedName(SERIALIZED_NAME_PEER_IPS)
  private List<String> peerIps = null;

  public static final String SERIALIZED_NAME_ROUTES_IN = "routes_in";
  @SerializedName(SERIALIZED_NAME_ROUTES_IN)
  private List<BgpNeighborDataRoutesInInner> routesIn = null;

  public static final String SERIALIZED_NAME_ROUTES_OUT = "routes_out";
  @SerializedName(SERIALIZED_NAME_ROUTES_OUT)
  private List<BgpNeighborDataRoutesOutInner> routesOut = null;

  public BgpNeighborData() {
  }

  public BgpNeighborData addressFamily(BigDecimal addressFamily) {
    
    this.addressFamily = addressFamily;
    return this;
  }

   /**
   * Address Family for IP Address. Accepted values are 4 or 6
   * @return addressFamily
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "4", value = "Address Family for IP Address. Accepted values are 4 or 6")

  public BigDecimal getAddressFamily() {
    return addressFamily;
  }


  public void setAddressFamily(BigDecimal addressFamily) {
    this.addressFamily = addressFamily;
  }


  public BgpNeighborData customerAs(BigDecimal customerAs) {
    
    this.customerAs = customerAs;
    return this;
  }

   /**
   * The customer&#39;s ASN. In a local BGP deployment, this will be an internal ASN used to route within the data center. For a global BGP deployment, this will be the your own ASN, configured when you set up BGP for your project.
   * @return customerAs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "65000", value = "The customer's ASN. In a local BGP deployment, this will be an internal ASN used to route within the data center. For a global BGP deployment, this will be the your own ASN, configured when you set up BGP for your project.")

  public BigDecimal getCustomerAs() {
    return customerAs;
  }


  public void setCustomerAs(BigDecimal customerAs) {
    this.customerAs = customerAs;
  }


  public BgpNeighborData customerIp(String customerIp) {
    
    this.customerIp = customerIp;
    return this;
  }

   /**
   * The device&#39;s IP address. For an IPv4 BGP session, this is typically the private bond0 address for the device.
   * @return customerIp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10.32.16.1 (IPv4) or 2604:1380:4111:2700::1 (IPv6)", value = "The device's IP address. For an IPv4 BGP session, this is typically the private bond0 address for the device.")

  public String getCustomerIp() {
    return customerIp;
  }


  public void setCustomerIp(String customerIp) {
    this.customerIp = customerIp;
  }


  public BgpNeighborData md5Enabled(Boolean md5Enabled) {
    
    this.md5Enabled = md5Enabled;
    return this;
  }

   /**
   * True if an MD5 password is configured for the project.
   * @return md5Enabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "True if an MD5 password is configured for the project.")

  public Boolean getMd5Enabled() {
    return md5Enabled;
  }


  public void setMd5Enabled(Boolean md5Enabled) {
    this.md5Enabled = md5Enabled;
  }


  public BgpNeighborData md5Password(String md5Password) {
    
    this.md5Password = md5Password;
    return this;
  }

   /**
   * The MD5 password configured for the project, if set.
   * @return md5Password
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The MD5 password configured for the project, if set.")

  public String getMd5Password() {
    return md5Password;
  }


  public void setMd5Password(String md5Password) {
    this.md5Password = md5Password;
  }


  public BgpNeighborData multihop(Boolean multihop) {
    
    this.multihop = multihop;
    return this;
  }

   /**
   * True when the BGP session should be configured as multihop.
   * @return multihop
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "True when the BGP session should be configured as multihop.")

  public Boolean getMultihop() {
    return multihop;
  }


  public void setMultihop(Boolean multihop) {
    this.multihop = multihop;
  }


  public BgpNeighborData peerAs(BigDecimal peerAs) {
    
    this.peerAs = peerAs;
    return this;
  }

   /**
   * The Peer ASN to use when configuring BGP on your device.
   * @return peerAs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "65530", value = "The Peer ASN to use when configuring BGP on your device.")

  public BigDecimal getPeerAs() {
    return peerAs;
  }


  public void setPeerAs(BigDecimal peerAs) {
    this.peerAs = peerAs;
  }


  public BgpNeighborData peerIps(List<String> peerIps) {
    
    this.peerIps = peerIps;
    return this;
  }

  public BgpNeighborData addPeerIpsItem(String peerIpsItem) {
    if (this.peerIps == null) {
      this.peerIps = new ArrayList<>();
    }
    this.peerIps.add(peerIpsItem);
    return this;
  }

   /**
   * A list of one or more IP addresses to use for the Peer IP section of your BGP configuration. For non-multihop sessions, this will typically be a single gateway address for the device. For multihop sessions, it will be a list of IPs.
   * @return peerIps
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"169.254.255.1\",\"169.254.255.2\"]", value = "A list of one or more IP addresses to use for the Peer IP section of your BGP configuration. For non-multihop sessions, this will typically be a single gateway address for the device. For multihop sessions, it will be a list of IPs.")

  public List<String> getPeerIps() {
    return peerIps;
  }


  public void setPeerIps(List<String> peerIps) {
    this.peerIps = peerIps;
  }


  public BgpNeighborData routesIn(List<BgpNeighborDataRoutesInInner> routesIn) {
    
    this.routesIn = routesIn;
    return this;
  }

  public BgpNeighborData addRoutesInItem(BgpNeighborDataRoutesInInner routesInItem) {
    if (this.routesIn == null) {
      this.routesIn = new ArrayList<>();
    }
    this.routesIn.add(routesInItem);
    return this;
  }

   /**
   * A list of project subnets
   * @return routesIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of project subnets")

  public List<BgpNeighborDataRoutesInInner> getRoutesIn() {
    return routesIn;
  }


  public void setRoutesIn(List<BgpNeighborDataRoutesInInner> routesIn) {
    this.routesIn = routesIn;
  }


  public BgpNeighborData routesOut(List<BgpNeighborDataRoutesOutInner> routesOut) {
    
    this.routesOut = routesOut;
    return this;
  }

  public BgpNeighborData addRoutesOutItem(BgpNeighborDataRoutesOutInner routesOutItem) {
    if (this.routesOut == null) {
      this.routesOut = new ArrayList<>();
    }
    this.routesOut.add(routesOutItem);
    return this;
  }

   /**
   * A list of outgoing routes. Only populated if the BGP session has default route enabled.
   * @return routesOut
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of outgoing routes. Only populated if the BGP session has default route enabled.")

  public List<BgpNeighborDataRoutesOutInner> getRoutesOut() {
    return routesOut;
  }


  public void setRoutesOut(List<BgpNeighborDataRoutesOutInner> routesOut) {
    this.routesOut = routesOut;
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
  public BgpNeighborData putAdditionalProperty(String key, Object value) {
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
    BgpNeighborData bgpNeighborData = (BgpNeighborData) o;
    return Objects.equals(this.addressFamily, bgpNeighborData.addressFamily) &&
        Objects.equals(this.customerAs, bgpNeighborData.customerAs) &&
        Objects.equals(this.customerIp, bgpNeighborData.customerIp) &&
        Objects.equals(this.md5Enabled, bgpNeighborData.md5Enabled) &&
        Objects.equals(this.md5Password, bgpNeighborData.md5Password) &&
        Objects.equals(this.multihop, bgpNeighborData.multihop) &&
        Objects.equals(this.peerAs, bgpNeighborData.peerAs) &&
        Objects.equals(this.peerIps, bgpNeighborData.peerIps) &&
        Objects.equals(this.routesIn, bgpNeighborData.routesIn) &&
        Objects.equals(this.routesOut, bgpNeighborData.routesOut)&&
        Objects.equals(this.additionalProperties, bgpNeighborData.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressFamily, customerAs, customerIp, md5Enabled, md5Password, multihop, peerAs, peerIps, routesIn, routesOut, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BgpNeighborData {\n");
    sb.append("    addressFamily: ").append(toIndentedString(addressFamily)).append("\n");
    sb.append("    customerAs: ").append(toIndentedString(customerAs)).append("\n");
    sb.append("    customerIp: ").append(toIndentedString(customerIp)).append("\n");
    sb.append("    md5Enabled: ").append(toIndentedString(md5Enabled)).append("\n");
    sb.append("    md5Password: ").append(toIndentedString(md5Password)).append("\n");
    sb.append("    multihop: ").append(toIndentedString(multihop)).append("\n");
    sb.append("    peerAs: ").append(toIndentedString(peerAs)).append("\n");
    sb.append("    peerIps: ").append(toIndentedString(peerIps)).append("\n");
    sb.append("    routesIn: ").append(toIndentedString(routesIn)).append("\n");
    sb.append("    routesOut: ").append(toIndentedString(routesOut)).append("\n");
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
    openapiFields.add("address_family");
    openapiFields.add("customer_as");
    openapiFields.add("customer_ip");
    openapiFields.add("md5_enabled");
    openapiFields.add("md5_password");
    openapiFields.add("multihop");
    openapiFields.add("peer_as");
    openapiFields.add("peer_ips");
    openapiFields.add("routes_in");
    openapiFields.add("routes_out");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to BgpNeighborData
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!BgpNeighborData.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BgpNeighborData is not found in the empty JSON string", BgpNeighborData.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("customer_ip") != null && !jsonObj.get("customer_ip").isJsonNull()) && !jsonObj.get("customer_ip").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customer_ip` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customer_ip").toString()));
      }
      if ((jsonObj.get("md5_password") != null && !jsonObj.get("md5_password").isJsonNull()) && !jsonObj.get("md5_password").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `md5_password` to be a primitive type in the JSON string but got `%s`", jsonObj.get("md5_password").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("peer_ips").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `peer_ips` to be an array in the JSON string but got `%s`", jsonObj.get("peer_ips").toString()));
      }
      if (jsonObj.get("routes_in") != null && !jsonObj.get("routes_in").isJsonNull()) {
        JsonArray jsonArrayroutesIn = jsonObj.getAsJsonArray("routes_in");
        if (jsonArrayroutesIn != null) {
          // ensure the json data is an array
          if (!jsonObj.get("routes_in").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `routes_in` to be an array in the JSON string but got `%s`", jsonObj.get("routes_in").toString()));
          }

          // validate the optional field `routes_in` (array)
          for (int i = 0; i < jsonArrayroutesIn.size(); i++) {
            BgpNeighborDataRoutesInInner.validateJsonObject(jsonArrayroutesIn.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("routes_out") != null && !jsonObj.get("routes_out").isJsonNull()) {
        JsonArray jsonArrayroutesOut = jsonObj.getAsJsonArray("routes_out");
        if (jsonArrayroutesOut != null) {
          // ensure the json data is an array
          if (!jsonObj.get("routes_out").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `routes_out` to be an array in the JSON string but got `%s`", jsonObj.get("routes_out").toString()));
          }

          // validate the optional field `routes_out` (array)
          for (int i = 0; i < jsonArrayroutesOut.size(); i++) {
            BgpNeighborDataRoutesOutInner.validateJsonObject(jsonArrayroutesOut.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BgpNeighborData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BgpNeighborData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BgpNeighborData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BgpNeighborData.class));

       return (TypeAdapter<T>) new TypeAdapter<BgpNeighborData>() {
           @Override
           public void write(JsonWriter out, BgpNeighborData value) throws IOException {
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
           public BgpNeighborData read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             BgpNeighborData instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of BgpNeighborData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BgpNeighborData
  * @throws IOException if the JSON string is invalid with respect to BgpNeighborData
  */
  public static BgpNeighborData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BgpNeighborData.class);
  }

 /**
  * Convert an instance of BgpNeighborData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

