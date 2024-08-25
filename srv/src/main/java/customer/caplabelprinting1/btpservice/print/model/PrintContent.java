

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
 * PrintContent
 */
// CHECKSTYLE:OFF
public class PrintContent 
// CHECKSTYLE:ON
{
  @JsonProperty("objectKey")
  private String objectKey;

  @JsonProperty("documentName")
  private String documentName;

  @JsonAnySetter
  @JsonAnyGetter
  private final Map<String, Object> cloudSdkCustomFields = new LinkedHashMap<>();

   /**
    * Set the objectKey of this {@link PrintContent} instance and return the same instance.
    *
    * @param objectKey  The objectKey of this {@link PrintContent}
    * @return The same instance of this {@link PrintContent} class
    */
   @Nonnull public PrintContent objectKey(@Nonnull final String objectKey) {
    this.objectKey = objectKey;
    return this;
  }

   /**
    * Get objectKey
    * @return objectKey  The objectKey of this {@link PrintContent} instance.
    */
  @Nonnull public String getObjectKey() {
    return objectKey;
  }

  /**
   * Set the objectKey of this {@link PrintContent} instance.
   *
   * @param objectKey  The objectKey of this {@link PrintContent}
   */
  public void setObjectKey( @Nonnull final String objectKey) {
    this.objectKey = objectKey;
  }

   /**
    * Set the documentName of this {@link PrintContent} instance and return the same instance.
    *
    * @param documentName  The documentName of this {@link PrintContent}
    * @return The same instance of this {@link PrintContent} class
    */
   @Nonnull public PrintContent documentName(@Nonnull final String documentName) {
    this.documentName = documentName;
    return this;
  }

   /**
    * Get documentName
    * @return documentName  The documentName of this {@link PrintContent} instance.
    */
  @Nonnull public String getDocumentName() {
    return documentName;
  }

  /**
   * Set the documentName of this {@link PrintContent} instance.
   *
   * @param documentName  The documentName of this {@link PrintContent}
   */
  public void setDocumentName( @Nonnull final String documentName) {
    this.documentName = documentName;
  }

  /**
   * Get the names of the unrecognizable properties of the {@link PrintContent}.
   * @return The set of properties names
   */
  @JsonIgnore
  @Nonnull
  public Set<String> getCustomFieldNames() {
    return cloudSdkCustomFields.keySet();
  }

  /**
   * Get the value of an unrecognizable property of this {@link PrintContent} instance.
   * @param name  The name of the property
   * @return The value of the property
   * @throws NoSuchElementException  If no property with the given name could be found.
   */
  @Nullable
  public Object getCustomField(@Nonnull final String name) throws NoSuchElementException {
    if( !cloudSdkCustomFields.containsKey(name) ) {
        throw new NoSuchElementException("PrintContent has no field with name '" + name + "'.");
    }
    return cloudSdkCustomFields.get(name);
  }

  /**
   * Set an unrecognizable property of this {@link PrintContent} instance. If the map previously contained a mapping
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
    final PrintContent printContent = (PrintContent) o;
    return Objects.equals(this.cloudSdkCustomFields, printContent.cloudSdkCustomFields) &&
        Objects.equals(this.objectKey, printContent.objectKey) &&
        Objects.equals(this.documentName, printContent.documentName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(objectKey, documentName, cloudSdkCustomFields);
  }

  @Override
  @Nonnull public String toString() {
    final StringBuilder sb = new StringBuilder();
    sb.append("class PrintContent {\n");
    sb.append("    objectKey: ").append(toIndentedString(objectKey)).append("\n");
    sb.append("    documentName: ").append(toIndentedString(documentName)).append("\n");
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

