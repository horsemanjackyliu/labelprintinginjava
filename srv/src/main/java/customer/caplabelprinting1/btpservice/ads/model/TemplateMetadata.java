

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
 * TemplateMetadata
 */
// CHECKSTYLE:OFF
public class TemplateMetadata 
// CHECKSTYLE:ON
{
  @JsonProperty("contentLength")
  private String contentLength;

  @JsonProperty("creationDate")
  private String creationDate;

  @JsonProperty("isLatestVersion")
  private Boolean isLatestVersion;

  @JsonProperty("lastModificationDate")
  private String lastModificationDate;

  @JsonProperty("managedBy")
  private String managedBy;

  @JsonProperty("mimeType")
  private String mimeType;

  @JsonProperty("objectId")
  private String objectId;

  @JsonProperty("versionNumber")
  private String versionNumber;

  @JsonAnySetter
  @JsonAnyGetter
  private final Map<String, Object> cloudSdkCustomFields = new LinkedHashMap<>();

   /**
    * Set the contentLength of this {@link TemplateMetadata} instance and return the same instance.
    *
    * @param contentLength  The contentLength of this {@link TemplateMetadata}
    * @return The same instance of this {@link TemplateMetadata} class
    */
   @Nonnull public TemplateMetadata contentLength(@Nonnull final String contentLength) {
    this.contentLength = contentLength;
    return this;
  }

   /**
    * Get contentLength
    * @return contentLength  The contentLength of this {@link TemplateMetadata} instance.
    */
  @Nonnull public String getContentLength() {
    return contentLength;
  }

  /**
   * Set the contentLength of this {@link TemplateMetadata} instance.
   *
   * @param contentLength  The contentLength of this {@link TemplateMetadata}
   */
  public void setContentLength( @Nonnull final String contentLength) {
    this.contentLength = contentLength;
  }

   /**
    * Set the creationDate of this {@link TemplateMetadata} instance and return the same instance.
    *
    * @param creationDate  The creationDate of this {@link TemplateMetadata}
    * @return The same instance of this {@link TemplateMetadata} class
    */
   @Nonnull public TemplateMetadata creationDate(@Nonnull final String creationDate) {
    this.creationDate = creationDate;
    return this;
  }

   /**
    * Get creationDate
    * @return creationDate  The creationDate of this {@link TemplateMetadata} instance.
    */
  @Nonnull public String getCreationDate() {
    return creationDate;
  }

  /**
   * Set the creationDate of this {@link TemplateMetadata} instance.
   *
   * @param creationDate  The creationDate of this {@link TemplateMetadata}
   */
  public void setCreationDate( @Nonnull final String creationDate) {
    this.creationDate = creationDate;
  }

   /**
    * Set the isLatestVersion of this {@link TemplateMetadata} instance and return the same instance.
    *
    * @param isLatestVersion  The isLatestVersion of this {@link TemplateMetadata}
    * @return The same instance of this {@link TemplateMetadata} class
    */
   @Nonnull public TemplateMetadata isLatestVersion(@Nonnull final Boolean isLatestVersion) {
    this.isLatestVersion = isLatestVersion;
    return this;
  }

   /**
    * Get isLatestVersion
    * @return isLatestVersion  The isLatestVersion of this {@link TemplateMetadata} instance.
    */
  @Nonnull public Boolean isIsLatestVersion() {
    return isLatestVersion;
  }

  /**
   * Set the isLatestVersion of this {@link TemplateMetadata} instance.
   *
   * @param isLatestVersion  The isLatestVersion of this {@link TemplateMetadata}
   */
  public void setIsLatestVersion( @Nonnull final Boolean isLatestVersion) {
    this.isLatestVersion = isLatestVersion;
  }

   /**
    * Set the lastModificationDate of this {@link TemplateMetadata} instance and return the same instance.
    *
    * @param lastModificationDate  The lastModificationDate of this {@link TemplateMetadata}
    * @return The same instance of this {@link TemplateMetadata} class
    */
   @Nonnull public TemplateMetadata lastModificationDate(@Nonnull final String lastModificationDate) {
    this.lastModificationDate = lastModificationDate;
    return this;
  }

   /**
    * Get lastModificationDate
    * @return lastModificationDate  The lastModificationDate of this {@link TemplateMetadata} instance.
    */
  @Nonnull public String getLastModificationDate() {
    return lastModificationDate;
  }

  /**
   * Set the lastModificationDate of this {@link TemplateMetadata} instance.
   *
   * @param lastModificationDate  The lastModificationDate of this {@link TemplateMetadata}
   */
  public void setLastModificationDate( @Nonnull final String lastModificationDate) {
    this.lastModificationDate = lastModificationDate;
  }

   /**
    * Set the managedBy of this {@link TemplateMetadata} instance and return the same instance.
    *
    * @param managedBy  The managedBy of this {@link TemplateMetadata}
    * @return The same instance of this {@link TemplateMetadata} class
    */
   @Nonnull public TemplateMetadata managedBy(@Nonnull final String managedBy) {
    this.managedBy = managedBy;
    return this;
  }

   /**
    * Get managedBy
    * @return managedBy  The managedBy of this {@link TemplateMetadata} instance.
    */
  @Nonnull public String getManagedBy() {
    return managedBy;
  }

  /**
   * Set the managedBy of this {@link TemplateMetadata} instance.
   *
   * @param managedBy  The managedBy of this {@link TemplateMetadata}
   */
  public void setManagedBy( @Nonnull final String managedBy) {
    this.managedBy = managedBy;
  }

   /**
    * Set the mimeType of this {@link TemplateMetadata} instance and return the same instance.
    *
    * @param mimeType  The mimeType of this {@link TemplateMetadata}
    * @return The same instance of this {@link TemplateMetadata} class
    */
   @Nonnull public TemplateMetadata mimeType(@Nonnull final String mimeType) {
    this.mimeType = mimeType;
    return this;
  }

   /**
    * Get mimeType
    * @return mimeType  The mimeType of this {@link TemplateMetadata} instance.
    */
  @Nonnull public String getMimeType() {
    return mimeType;
  }

  /**
   * Set the mimeType of this {@link TemplateMetadata} instance.
   *
   * @param mimeType  The mimeType of this {@link TemplateMetadata}
   */
  public void setMimeType( @Nonnull final String mimeType) {
    this.mimeType = mimeType;
  }

   /**
    * Set the objectId of this {@link TemplateMetadata} instance and return the same instance.
    *
    * @param objectId  The objectId of this {@link TemplateMetadata}
    * @return The same instance of this {@link TemplateMetadata} class
    */
   @Nonnull public TemplateMetadata objectId(@Nonnull final String objectId) {
    this.objectId = objectId;
    return this;
  }

   /**
    * Get objectId
    * @return objectId  The objectId of this {@link TemplateMetadata} instance.
    */
  @Nonnull public String getObjectId() {
    return objectId;
  }

  /**
   * Set the objectId of this {@link TemplateMetadata} instance.
   *
   * @param objectId  The objectId of this {@link TemplateMetadata}
   */
  public void setObjectId( @Nonnull final String objectId) {
    this.objectId = objectId;
  }

   /**
    * Set the versionNumber of this {@link TemplateMetadata} instance and return the same instance.
    *
    * @param versionNumber  The versionNumber of this {@link TemplateMetadata}
    * @return The same instance of this {@link TemplateMetadata} class
    */
   @Nonnull public TemplateMetadata versionNumber(@Nonnull final String versionNumber) {
    this.versionNumber = versionNumber;
    return this;
  }

   /**
    * Get versionNumber
    * @return versionNumber  The versionNumber of this {@link TemplateMetadata} instance.
    */
  @Nonnull public String getVersionNumber() {
    return versionNumber;
  }

  /**
   * Set the versionNumber of this {@link TemplateMetadata} instance.
   *
   * @param versionNumber  The versionNumber of this {@link TemplateMetadata}
   */
  public void setVersionNumber( @Nonnull final String versionNumber) {
    this.versionNumber = versionNumber;
  }

  /**
   * Get the names of the unrecognizable properties of the {@link TemplateMetadata}.
   * @return The set of properties names
   */
  @JsonIgnore
  @Nonnull
  public Set<String> getCustomFieldNames() {
    return cloudSdkCustomFields.keySet();
  }

  /**
   * Get the value of an unrecognizable property of this {@link TemplateMetadata} instance.
   * @param name  The name of the property
   * @return The value of the property
   * @throws NoSuchElementException  If no property with the given name could be found.
   */
  @Nullable
  public Object getCustomField(@Nonnull final String name) throws NoSuchElementException {
    if( !cloudSdkCustomFields.containsKey(name) ) {
        throw new NoSuchElementException("TemplateMetadata has no field with name '" + name + "'.");
    }
    return cloudSdkCustomFields.get(name);
  }

  /**
   * Set an unrecognizable property of this {@link TemplateMetadata} instance. If the map previously contained a mapping
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
    final TemplateMetadata templateMetadata = (TemplateMetadata) o;
    return Objects.equals(this.cloudSdkCustomFields, templateMetadata.cloudSdkCustomFields) &&
        Objects.equals(this.contentLength, templateMetadata.contentLength) &&
        Objects.equals(this.creationDate, templateMetadata.creationDate) &&
        Objects.equals(this.isLatestVersion, templateMetadata.isLatestVersion) &&
        Objects.equals(this.lastModificationDate, templateMetadata.lastModificationDate) &&
        Objects.equals(this.managedBy, templateMetadata.managedBy) &&
        Objects.equals(this.mimeType, templateMetadata.mimeType) &&
        Objects.equals(this.objectId, templateMetadata.objectId) &&
        Objects.equals(this.versionNumber, templateMetadata.versionNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contentLength, creationDate, isLatestVersion, lastModificationDate, managedBy, mimeType, objectId, versionNumber, cloudSdkCustomFields);
  }

  @Override
  @Nonnull public String toString() {
    final StringBuilder sb = new StringBuilder();
    sb.append("class TemplateMetadata {\n");
    sb.append("    contentLength: ").append(toIndentedString(contentLength)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    isLatestVersion: ").append(toIndentedString(isLatestVersion)).append("\n");
    sb.append("    lastModificationDate: ").append(toIndentedString(lastModificationDate)).append("\n");
    sb.append("    managedBy: ").append(toIndentedString(managedBy)).append("\n");
    sb.append("    mimeType: ").append(toIndentedString(mimeType)).append("\n");
    sb.append("    objectId: ").append(toIndentedString(objectId)).append("\n");
    sb.append("    versionNumber: ").append(toIndentedString(versionNumber)).append("\n");
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

