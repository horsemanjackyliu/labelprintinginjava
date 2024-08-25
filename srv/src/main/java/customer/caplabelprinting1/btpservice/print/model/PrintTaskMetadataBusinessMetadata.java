

/*
 * SAP Print Service
 * SAP Print service offers public APIs, including Query Print Queue, Upload Documents and Create Print Task that can help manage print queues, connect print clients and monitor print status.   This API is implemented based on REST API specification.
 *
 * The version of the OpenAPI document: 1.2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package customer.caplabelprinting1.btpservice.print.model;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/**
 * PrintTaskMetadataBusinessMetadata
 */
// CHECKSTYLE:OFF
public class PrintTaskMetadataBusinessMetadata 
// CHECKSTYLE:ON
{
  @JsonProperty("business_user")
  private String businessUser;

  @JsonProperty("object_node_type")
  private String objectNodeType;

  @JsonAnySetter
  @JsonAnyGetter
  private final Map<String, Object> cloudSdkCustomFields = new LinkedHashMap<>();

   /**
    * Set the businessUser of this {@link PrintTaskMetadataBusinessMetadata} instance and return the same instance.
    *
    * @param businessUser  The businessUser of this {@link PrintTaskMetadataBusinessMetadata}
    * @return The same instance of this {@link PrintTaskMetadataBusinessMetadata} class
    */
   @Nonnull public PrintTaskMetadataBusinessMetadata businessUser(@Nonnull final String businessUser) {
    this.businessUser = businessUser;
    return this;
  }

   /**
    * Get businessUser
    * @return businessUser  The businessUser of this {@link PrintTaskMetadataBusinessMetadata} instance.
    */
  @Nonnull public String getBusinessUser() {
    return businessUser;
  }

  /**
   * Set the businessUser of this {@link PrintTaskMetadataBusinessMetadata} instance.
   *
   * @param businessUser  The businessUser of this {@link PrintTaskMetadataBusinessMetadata}
   */
  public void setBusinessUser( @Nonnull final String businessUser) {
    this.businessUser = businessUser;
  }

   /**
    * Set the objectNodeType of this {@link PrintTaskMetadataBusinessMetadata} instance and return the same instance.
    *
    * @param objectNodeType  The objectNodeType of this {@link PrintTaskMetadataBusinessMetadata}
    * @return The same instance of this {@link PrintTaskMetadataBusinessMetadata} class
    */
   @Nonnull public PrintTaskMetadataBusinessMetadata objectNodeType(@Nonnull final String objectNodeType) {
    this.objectNodeType = objectNodeType;
    return this;
  }

   /**
    * Get objectNodeType
    * @return objectNodeType  The objectNodeType of this {@link PrintTaskMetadataBusinessMetadata} instance.
    */
  @Nonnull public String getObjectNodeType() {
    return objectNodeType;
  }

  /**
   * Set the objectNodeType of this {@link PrintTaskMetadataBusinessMetadata} instance.
   *
   * @param objectNodeType  The objectNodeType of this {@link PrintTaskMetadataBusinessMetadata}
   */
  public void setObjectNodeType( @Nonnull final String objectNodeType) {
    this.objectNodeType = objectNodeType;
  }

  /**
   * Get the names of the unrecognizable properties of the {@link PrintTaskMetadataBusinessMetadata}.
   * @return The set of properties names
   */
  @JsonIgnore
  @Nonnull
  public Set<String> getCustomFieldNames() {
    return cloudSdkCustomFields.keySet();
  }

  /**
   * Get the value of an unrecognizable property of this {@link PrintTaskMetadataBusinessMetadata} instance.
   * @param name  The name of the property
   * @return The value of the property
   * @throws NoSuchElementException  If no property with the given name could be found.
   */
  @Nullable
  public Object getCustomField(@Nonnull final String name) throws NoSuchElementException {
    if( !cloudSdkCustomFields.containsKey(name) ) {
        throw new NoSuchElementException("PrintTaskMetadataBusinessMetadata has no field with name '" + name + "'.");
    }
    return cloudSdkCustomFields.get(name);
  }

  /**
   * Set an unrecognizable property of this {@link PrintTaskMetadataBusinessMetadata} instance. If the map previously contained a mapping
   * for the key, the old value is replaced by the specified value.
   * @param customFieldName The name of the property
   * @param customFieldValue The value of the property
   */
  @JsonIgnore
  public void setCustomField( @Nonnull String customFieldName, @Nullable Object customFieldValue )
  {
      cloudSdkCustomFields.put(customFieldName, customFieldValue);
  }


  @Override
  public boolean equals(@Nullable final java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    final PrintTaskMetadataBusinessMetadata printTaskMetadataBusinessMetadata = (PrintTaskMetadataBusinessMetadata) o;
    return Objects.equals(this.cloudSdkCustomFields, printTaskMetadataBusinessMetadata.cloudSdkCustomFields) &&
        Objects.equals(this.businessUser, printTaskMetadataBusinessMetadata.businessUser) &&
        Objects.equals(this.objectNodeType, printTaskMetadataBusinessMetadata.objectNodeType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(businessUser, objectNodeType, cloudSdkCustomFields);
  }

  @Override
  @Nonnull public String toString() {
    final StringBuilder sb = new StringBuilder();
    sb.append("class PrintTaskMetadataBusinessMetadata {\n");
    sb.append("    businessUser: ").append(toIndentedString(businessUser)).append("\n");
    sb.append("    objectNodeType: ").append(toIndentedString(objectNodeType)).append("\n");
    cloudSdkCustomFields.forEach((k,v) -> sb.append("    ").append(k).append(": ").append(toIndentedString(v)).append("\n"));
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(final java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

