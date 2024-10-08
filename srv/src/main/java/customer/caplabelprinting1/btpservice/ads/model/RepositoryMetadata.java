

/*
 * Forms Service by Adobe API (Cloud Foundry)
 * The SAP Forms service by Adobe is a cloud service based on the ADS (Adobe Document Services). The Forms service REST API provides a subset of the SAP Forms service capabilities. They are addressed by different URIs (Uniform Resource Identifiers) where each URI supports data and document exchange in a JSON format. The SAP Forms service REST API delivers a comprehensive description and is easy to test. The application calls the REST API via an SAP BTP subaccount that must be subscribed to the SAP Forms service.
 *
 * The version of the OpenAPI document: v1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package customer.caplabelprinting1.btpservice.ads.model;

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
 * RepositoryMetadata
 */
// CHECKSTYLE:OFF
public class RepositoryMetadata 
// CHECKSTYLE:ON
{
  @JsonProperty("creationDate")
  private String creationDate;

  @JsonProperty("repositoryId")
  private String repositoryId;

  @JsonProperty("repositoryName")
  private String repositoryName;

  @JsonAnySetter
  @JsonAnyGetter
  private final Map<String, Object> cloudSdkCustomFields = new LinkedHashMap<>();

   /**
    * Set the creationDate of this {@link RepositoryMetadata} instance and return the same instance.
    *
    * @param creationDate  The creationDate of this {@link RepositoryMetadata}
    * @return The same instance of this {@link RepositoryMetadata} class
    */
   @Nonnull public RepositoryMetadata creationDate(@Nonnull final String creationDate) {
    this.creationDate = creationDate;
    return this;
  }

   /**
    * Get creationDate
    * @return creationDate  The creationDate of this {@link RepositoryMetadata} instance.
    */
  @Nonnull public String getCreationDate() {
    return creationDate;
  }

  /**
   * Set the creationDate of this {@link RepositoryMetadata} instance.
   *
   * @param creationDate  The creationDate of this {@link RepositoryMetadata}
   */
  public void setCreationDate( @Nonnull final String creationDate) {
    this.creationDate = creationDate;
  }

   /**
    * Set the repositoryId of this {@link RepositoryMetadata} instance and return the same instance.
    *
    * @param repositoryId  The repositoryId of this {@link RepositoryMetadata}
    * @return The same instance of this {@link RepositoryMetadata} class
    */
   @Nonnull public RepositoryMetadata repositoryId(@Nonnull final String repositoryId) {
    this.repositoryId = repositoryId;
    return this;
  }

   /**
    * Get repositoryId
    * @return repositoryId  The repositoryId of this {@link RepositoryMetadata} instance.
    */
  @Nonnull public String getRepositoryId() {
    return repositoryId;
  }

  /**
   * Set the repositoryId of this {@link RepositoryMetadata} instance.
   *
   * @param repositoryId  The repositoryId of this {@link RepositoryMetadata}
   */
  public void setRepositoryId( @Nonnull final String repositoryId) {
    this.repositoryId = repositoryId;
  }

   /**
    * Set the repositoryName of this {@link RepositoryMetadata} instance and return the same instance.
    *
    * @param repositoryName  The repositoryName of this {@link RepositoryMetadata}
    * @return The same instance of this {@link RepositoryMetadata} class
    */
   @Nonnull public RepositoryMetadata repositoryName(@Nonnull final String repositoryName) {
    this.repositoryName = repositoryName;
    return this;
  }

   /**
    * Get repositoryName
    * @return repositoryName  The repositoryName of this {@link RepositoryMetadata} instance.
    */
  @Nonnull public String getRepositoryName() {
    return repositoryName;
  }

  /**
   * Set the repositoryName of this {@link RepositoryMetadata} instance.
   *
   * @param repositoryName  The repositoryName of this {@link RepositoryMetadata}
   */
  public void setRepositoryName( @Nonnull final String repositoryName) {
    this.repositoryName = repositoryName;
  }

  /**
   * Get the names of the unrecognizable properties of the {@link RepositoryMetadata}.
   * @return The set of properties names
   */
  @JsonIgnore
  @Nonnull
  public Set<String> getCustomFieldNames() {
    return cloudSdkCustomFields.keySet();
  }

  /**
   * Get the value of an unrecognizable property of this {@link RepositoryMetadata} instance.
   * @param name  The name of the property
   * @return The value of the property
   * @throws NoSuchElementException  If no property with the given name could be found.
   */
  @Nullable
  public Object getCustomField(@Nonnull final String name) throws NoSuchElementException {
    if( !cloudSdkCustomFields.containsKey(name) ) {
        throw new NoSuchElementException("RepositoryMetadata has no field with name '" + name + "'.");
    }
    return cloudSdkCustomFields.get(name);
  }

  /**
   * Set an unrecognizable property of this {@link RepositoryMetadata} instance. If the map previously contained a mapping
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
    final RepositoryMetadata repositoryMetadata = (RepositoryMetadata) o;
    return Objects.equals(this.cloudSdkCustomFields, repositoryMetadata.cloudSdkCustomFields) &&
        Objects.equals(this.creationDate, repositoryMetadata.creationDate) &&
        Objects.equals(this.repositoryId, repositoryMetadata.repositoryId) &&
        Objects.equals(this.repositoryName, repositoryMetadata.repositoryName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creationDate, repositoryId, repositoryName, cloudSdkCustomFields);
  }

  @Override
  @Nonnull public String toString() {
    final StringBuilder sb = new StringBuilder();
    sb.append("class RepositoryMetadata {\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    repositoryId: ").append(toIndentedString(repositoryId)).append("\n");
    sb.append("    repositoryName: ").append(toIndentedString(repositoryName)).append("\n");
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

