

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
 * Form JSON Input.&lt;br /&gt;&lt;br /&gt;&lt;br /&gt;**FormName Options:** &#x60;Optional&#x60; Limited to 30 characters. Only alphanumeric characters allowed and &#39;_&#39; character.&lt;br /&gt;&lt;br /&gt;**Description Options:**  &#x60;Optional&#x60; Limited to 280 characters.&lt;br /&gt;&lt;br /&gt;**Note Options:** &#x60;Optional&#x60; Limited to 280 characters.
 */
// CHECKSTYLE:OFF
public class FormStoreInput 
// CHECKSTYLE:ON
{
  @JsonProperty("description")
  private String description;

  @JsonProperty("formName")
  private String formName;

  @JsonProperty("note")
  private String note;

  @JsonAnySetter
  @JsonAnyGetter
  private final Map<String, Object> cloudSdkCustomFields = new LinkedHashMap<>();

   /**
    * Set the description of this {@link FormStoreInput} instance and return the same instance.
    *
    * @param description  The description of this {@link FormStoreInput}
    * @return The same instance of this {@link FormStoreInput} class
    */
   @Nonnull public FormStoreInput description(@Nonnull final String description) {
    this.description = description;
    return this;
  }

   /**
    * Get description
    * @return description  The description of this {@link FormStoreInput} instance.
    */
  @Nonnull public String getDescription() {
    return description;
  }

  /**
   * Set the description of this {@link FormStoreInput} instance.
   *
   * @param description  The description of this {@link FormStoreInput}
   */
  public void setDescription( @Nonnull final String description) {
    this.description = description;
  }

   /**
    * Set the formName of this {@link FormStoreInput} instance and return the same instance.
    *
    * @param formName  Form naming restricted to unicode letters or digits.
    * @return The same instance of this {@link FormStoreInput} class
    */
   @Nonnull public FormStoreInput formName(@Nonnull final String formName) {
    this.formName = formName;
    return this;
  }

   /**
    * Form naming restricted to unicode letters or digits.
    * @return formName  The formName of this {@link FormStoreInput} instance.
    */
  @Nonnull public String getFormName() {
    return formName;
  }

  /**
   * Set the formName of this {@link FormStoreInput} instance.
   *
   * @param formName  Form naming restricted to unicode letters or digits.
   */
  public void setFormName( @Nonnull final String formName) {
    this.formName = formName;
  }

   /**
    * Set the note of this {@link FormStoreInput} instance and return the same instance.
    *
    * @param note  The note of this {@link FormStoreInput}
    * @return The same instance of this {@link FormStoreInput} class
    */
   @Nonnull public FormStoreInput note(@Nonnull final String note) {
    this.note = note;
    return this;
  }

   /**
    * Get note
    * @return note  The note of this {@link FormStoreInput} instance.
    */
  @Nonnull public String getNote() {
    return note;
  }

  /**
   * Set the note of this {@link FormStoreInput} instance.
   *
   * @param note  The note of this {@link FormStoreInput}
   */
  public void setNote( @Nonnull final String note) {
    this.note = note;
  }

  /**
   * Get the names of the unrecognizable properties of the {@link FormStoreInput}.
   * @return The set of properties names
   */
  @JsonIgnore
  @Nonnull
  public Set<String> getCustomFieldNames() {
    return cloudSdkCustomFields.keySet();
  }

  /**
   * Get the value of an unrecognizable property of this {@link FormStoreInput} instance.
   * @param name  The name of the property
   * @return The value of the property
   * @throws NoSuchElementException  If no property with the given name could be found.
   */
  @Nullable
  public Object getCustomField(@Nonnull final String name) throws NoSuchElementException {
    if( !cloudSdkCustomFields.containsKey(name) ) {
        throw new NoSuchElementException("FormStoreInput has no field with name '" + name + "'.");
    }
    return cloudSdkCustomFields.get(name);
  }

  /**
   * Set an unrecognizable property of this {@link FormStoreInput} instance. If the map previously contained a mapping
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
    final FormStoreInput formStoreInput = (FormStoreInput) o;
    return Objects.equals(this.cloudSdkCustomFields, formStoreInput.cloudSdkCustomFields) &&
        Objects.equals(this.description, formStoreInput.description) &&
        Objects.equals(this.formName, formStoreInput.formName) &&
        Objects.equals(this.note, formStoreInput.note);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, formName, note, cloudSdkCustomFields);
  }

  @Override
  @Nonnull public String toString() {
    final StringBuilder sb = new StringBuilder();
    sb.append("class FormStoreInput {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    formName: ").append(toIndentedString(formName)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
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

