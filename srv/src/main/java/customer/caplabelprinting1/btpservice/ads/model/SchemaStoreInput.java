

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
 * Schema JSON Input to store a schema. There is only one single schema per form entity.&lt;br /&gt;&lt;br /&gt;&lt;br /&gt;**XsdSchema Options:** &#x60;Required&#x60; Schema file encoded in BASE64 string.&lt;br /&gt;&lt;br /&gt;**SchemaName Options:** &#x60;Required&#x60; Limited to 30 characters. Only alphanumeric characters allowed and &#39;_&#39; character.&lt;br /&gt;&lt;br /&gt;**Note Options:** &#x60;Optional&#x60; Limited to 280 characters.
 */
// CHECKSTYLE:OFF
public class SchemaStoreInput 
// CHECKSTYLE:ON
{
  @JsonProperty("note")
  private String note;

  @JsonProperty("schemaName")
  private String schemaName;

  @JsonProperty("xsdSchema")
  private String xsdSchema = "Base64 String";

  @JsonAnySetter
  @JsonAnyGetter
  private final Map<String, Object> cloudSdkCustomFields = new LinkedHashMap<>();

   /**
    * Set the note of this {@link SchemaStoreInput} instance and return the same instance.
    *
    * @param note  The note of this {@link SchemaStoreInput}
    * @return The same instance of this {@link SchemaStoreInput} class
    */
   @Nonnull public SchemaStoreInput note(@Nonnull final String note) {
    this.note = note;
    return this;
  }

   /**
    * Get note
    * @return note  The note of this {@link SchemaStoreInput} instance.
    */
  @Nonnull public String getNote() {
    return note;
  }

  /**
   * Set the note of this {@link SchemaStoreInput} instance.
   *
   * @param note  The note of this {@link SchemaStoreInput}
   */
  public void setNote( @Nonnull final String note) {
    this.note = note;
  }

   /**
    * Set the schemaName of this {@link SchemaStoreInput} instance and return the same instance.
    *
    * @param schemaName  Schema naming restricted to unicode letters or digits.
    * @return The same instance of this {@link SchemaStoreInput} class
    */
   @Nonnull public SchemaStoreInput schemaName(@Nonnull final String schemaName) {
    this.schemaName = schemaName;
    return this;
  }

   /**
    * Schema naming restricted to unicode letters or digits.
    * @return schemaName  The schemaName of this {@link SchemaStoreInput} instance.
    */
  @Nonnull public String getSchemaName() {
    return schemaName;
  }

  /**
   * Set the schemaName of this {@link SchemaStoreInput} instance.
   *
   * @param schemaName  Schema naming restricted to unicode letters or digits.
   */
  public void setSchemaName( @Nonnull final String schemaName) {
    this.schemaName = schemaName;
  }

   /**
    * Set the xsdSchema of this {@link SchemaStoreInput} instance and return the same instance.
    *
    * @param xsdSchema  Schema file encoded as Base64 string
    * @return The same instance of this {@link SchemaStoreInput} class
    */
   @Nonnull public SchemaStoreInput xsdSchema(@Nonnull final String xsdSchema) {
    this.xsdSchema = xsdSchema;
    return this;
  }

   /**
    * Schema file encoded as Base64 string
    * @return xsdSchema  The xsdSchema of this {@link SchemaStoreInput} instance.
    */
  @Nonnull public String getXsdSchema() {
    return xsdSchema;
  }

  /**
   * Set the xsdSchema of this {@link SchemaStoreInput} instance.
   *
   * @param xsdSchema  Schema file encoded as Base64 string
   */
  public void setXsdSchema( @Nonnull final String xsdSchema) {
    this.xsdSchema = xsdSchema;
  }

  /**
   * Get the names of the unrecognizable properties of the {@link SchemaStoreInput}.
   * @return The set of properties names
   */
  @JsonIgnore
  @Nonnull
  public Set<String> getCustomFieldNames() {
    return cloudSdkCustomFields.keySet();
  }

  /**
   * Get the value of an unrecognizable property of this {@link SchemaStoreInput} instance.
   * @param name  The name of the property
   * @return The value of the property
   * @throws NoSuchElementException  If no property with the given name could be found.
   */
  @Nullable
  public Object getCustomField(@Nonnull final String name) throws NoSuchElementException {
    if( !cloudSdkCustomFields.containsKey(name) ) {
        throw new NoSuchElementException("SchemaStoreInput has no field with name '" + name + "'.");
    }
    return cloudSdkCustomFields.get(name);
  }

  /**
   * Set an unrecognizable property of this {@link SchemaStoreInput} instance. If the map previously contained a mapping
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
    final SchemaStoreInput schemaStoreInput = (SchemaStoreInput) o;
    return Objects.equals(this.cloudSdkCustomFields, schemaStoreInput.cloudSdkCustomFields) &&
        Objects.equals(this.note, schemaStoreInput.note) &&
        Objects.equals(this.schemaName, schemaStoreInput.schemaName) &&
        Objects.equals(this.xsdSchema, schemaStoreInput.xsdSchema);
  }

  @Override
  public int hashCode() {
    return Objects.hash(note, schemaName, xsdSchema, cloudSdkCustomFields);
  }

  @Override
  @Nonnull public String toString() {
    final StringBuilder sb = new StringBuilder();
    sb.append("class SchemaStoreInput {\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    schemaName: ").append(toIndentedString(schemaName)).append("\n");
    sb.append("    xsdSchema: ").append(toIndentedString(xsdSchema)).append("\n");
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

