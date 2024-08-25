

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
 * SetAttachment JSON. FileContent and PDF encoded in BASE64.
 */
// CHECKSTYLE:OFF
public class AttachmentInput 
// CHECKSTYLE:ON
{
  @JsonProperty("description")
  private String description;

  @JsonProperty("fileContent")
  private String fileContent = "Base64 String";

  @JsonProperty("fileName")
  private String fileName;

  @JsonProperty("mimeType")
  private String mimeType;

  @JsonProperty("pdf")
  private String pdf = "Base64 String";

  @JsonAnySetter
  @JsonAnyGetter
  private final Map<String, Object> cloudSdkCustomFields = new LinkedHashMap<>();

   /**
    * Set the description of this {@link AttachmentInput} instance and return the same instance.
    *
    * @param description  The description of this {@link AttachmentInput}
    * @return The same instance of this {@link AttachmentInput} class
    */
   @Nonnull public AttachmentInput description(@Nonnull final String description) {
    this.description = description;
    return this;
  }

   /**
    * Get description
    * @return description  The description of this {@link AttachmentInput} instance.
    */
  @Nonnull public String getDescription() {
    return description;
  }

  /**
   * Set the description of this {@link AttachmentInput} instance.
   *
   * @param description  The description of this {@link AttachmentInput}
   */
  public void setDescription( @Nonnull final String description) {
    this.description = description;
  }

   /**
    * Set the fileContent of this {@link AttachmentInput} instance and return the same instance.
    *
    * @param fileContent  File encoded as Base64 string
    * @return The same instance of this {@link AttachmentInput} class
    */
   @Nonnull public AttachmentInput fileContent(@Nonnull final String fileContent) {
    this.fileContent = fileContent;
    return this;
  }

   /**
    * File encoded as Base64 string
    * @return fileContent  The fileContent of this {@link AttachmentInput} instance.
    */
  @Nonnull public String getFileContent() {
    return fileContent;
  }

  /**
   * Set the fileContent of this {@link AttachmentInput} instance.
   *
   * @param fileContent  File encoded as Base64 string
   */
  public void setFileContent( @Nonnull final String fileContent) {
    this.fileContent = fileContent;
  }

   /**
    * Set the fileName of this {@link AttachmentInput} instance and return the same instance.
    *
    * @param fileName  The fileName of this {@link AttachmentInput}
    * @return The same instance of this {@link AttachmentInput} class
    */
   @Nonnull public AttachmentInput fileName(@Nonnull final String fileName) {
    this.fileName = fileName;
    return this;
  }

   /**
    * Get fileName
    * @return fileName  The fileName of this {@link AttachmentInput} instance.
    */
  @Nonnull public String getFileName() {
    return fileName;
  }

  /**
   * Set the fileName of this {@link AttachmentInput} instance.
   *
   * @param fileName  The fileName of this {@link AttachmentInput}
   */
  public void setFileName( @Nonnull final String fileName) {
    this.fileName = fileName;
  }

   /**
    * Set the mimeType of this {@link AttachmentInput} instance and return the same instance.
    *
    * @param mimeType  The mimeType of this {@link AttachmentInput}
    * @return The same instance of this {@link AttachmentInput} class
    */
   @Nonnull public AttachmentInput mimeType(@Nonnull final String mimeType) {
    this.mimeType = mimeType;
    return this;
  }

   /**
    * Get mimeType
    * @return mimeType  The mimeType of this {@link AttachmentInput} instance.
    */
  @Nonnull public String getMimeType() {
    return mimeType;
  }

  /**
   * Set the mimeType of this {@link AttachmentInput} instance.
   *
   * @param mimeType  The mimeType of this {@link AttachmentInput}
   */
  public void setMimeType( @Nonnull final String mimeType) {
    this.mimeType = mimeType;
  }

   /**
    * Set the pdf of this {@link AttachmentInput} instance and return the same instance.
    *
    * @param pdf  File encoded as Base64 string
    * @return The same instance of this {@link AttachmentInput} class
    */
   @Nonnull public AttachmentInput pdf(@Nonnull final String pdf) {
    this.pdf = pdf;
    return this;
  }

   /**
    * File encoded as Base64 string
    * @return pdf  The pdf of this {@link AttachmentInput} instance.
    */
  @Nonnull public String getPdf() {
    return pdf;
  }

  /**
   * Set the pdf of this {@link AttachmentInput} instance.
   *
   * @param pdf  File encoded as Base64 string
   */
  public void setPdf( @Nonnull final String pdf) {
    this.pdf = pdf;
  }

  /**
   * Get the names of the unrecognizable properties of the {@link AttachmentInput}.
   * @return The set of properties names
   */
  @JsonIgnore
  @Nonnull
  public Set<String> getCustomFieldNames() {
    return cloudSdkCustomFields.keySet();
  }

  /**
   * Get the value of an unrecognizable property of this {@link AttachmentInput} instance.
   * @param name  The name of the property
   * @return The value of the property
   * @throws NoSuchElementException  If no property with the given name could be found.
   */
  @Nullable
  public Object getCustomField(@Nonnull final String name) throws NoSuchElementException {
    if( !cloudSdkCustomFields.containsKey(name) ) {
        throw new NoSuchElementException("AttachmentInput has no field with name '" + name + "'.");
    }
    return cloudSdkCustomFields.get(name);
  }

  /**
   * Set an unrecognizable property of this {@link AttachmentInput} instance. If the map previously contained a mapping
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
    final AttachmentInput attachmentInput = (AttachmentInput) o;
    return Objects.equals(this.cloudSdkCustomFields, attachmentInput.cloudSdkCustomFields) &&
        Objects.equals(this.description, attachmentInput.description) &&
        Objects.equals(this.fileContent, attachmentInput.fileContent) &&
        Objects.equals(this.fileName, attachmentInput.fileName) &&
        Objects.equals(this.mimeType, attachmentInput.mimeType) &&
        Objects.equals(this.pdf, attachmentInput.pdf);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, fileContent, fileName, mimeType, pdf, cloudSdkCustomFields);
  }

  @Override
  @Nonnull public String toString() {
    final StringBuilder sb = new StringBuilder();
    sb.append("class AttachmentInput {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    fileContent: ").append(toIndentedString(fileContent)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    mimeType: ").append(toIndentedString(mimeType)).append("\n");
    sb.append("    pdf: ").append(toIndentedString(pdf)).append("\n");
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

