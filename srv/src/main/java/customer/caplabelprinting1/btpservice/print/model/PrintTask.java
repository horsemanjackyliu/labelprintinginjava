

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
import customer.caplabelprinting1.btpservice.print.model.PrintContent;
import customer.caplabelprinting1.btpservice.print.model.PrintTaskMetadata;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/**
 * PrintTask
 */
// CHECKSTYLE:OFF
public class PrintTask 
// CHECKSTYLE:ON
{
  @JsonProperty("numberOfCopies")
  private Integer numberOfCopies;

  @JsonProperty("username")
  private String username;

  @JsonProperty("qname")
  private String qname;

  @JsonProperty("profileName")
  private String profileName;

  @JsonProperty("metadata")
  private PrintTaskMetadata metadata;

  @JsonProperty("printContents")
  private List<PrintContent> printContents = new ArrayList<>();

  @JsonAnySetter
  @JsonAnyGetter
  private final Map<String, Object> cloudSdkCustomFields = new LinkedHashMap<>();

   /**
    * Set the numberOfCopies of this {@link PrintTask} instance and return the same instance.
    *
    * @param numberOfCopies  The numberOfCopies of this {@link PrintTask}
    * @return The same instance of this {@link PrintTask} class
    */
   @Nonnull public PrintTask numberOfCopies(@Nonnull final Integer numberOfCopies) {
    this.numberOfCopies = numberOfCopies;
    return this;
  }

   /**
    * Get numberOfCopies
    * @return numberOfCopies  The numberOfCopies of this {@link PrintTask} instance.
    */
  @Nonnull public Integer getNumberOfCopies() {
    return numberOfCopies;
  }

  /**
   * Set the numberOfCopies of this {@link PrintTask} instance.
   *
   * @param numberOfCopies  The numberOfCopies of this {@link PrintTask}
   */
  public void setNumberOfCopies( @Nonnull final Integer numberOfCopies) {
    this.numberOfCopies = numberOfCopies;
  }

   /**
    * Set the username of this {@link PrintTask} instance and return the same instance.
    *
    * @param username  The username of this {@link PrintTask}
    * @return The same instance of this {@link PrintTask} class
    */
   @Nonnull public PrintTask username(@Nonnull final String username) {
    this.username = username;
    return this;
  }

   /**
    * Get username
    * @return username  The username of this {@link PrintTask} instance.
    */
  @Nonnull public String getUsername() {
    return username;
  }

  /**
   * Set the username of this {@link PrintTask} instance.
   *
   * @param username  The username of this {@link PrintTask}
   */
  public void setUsername( @Nonnull final String username) {
    this.username = username;
  }

   /**
    * Set the qname of this {@link PrintTask} instance and return the same instance.
    *
    * @param qname  The qname of this {@link PrintTask}
    * @return The same instance of this {@link PrintTask} class
    */
   @Nonnull public PrintTask qname(@Nonnull final String qname) {
    this.qname = qname;
    return this;
  }

   /**
    * Get qname
    * @return qname  The qname of this {@link PrintTask} instance.
    */
  @Nonnull public String getQname() {
    return qname;
  }

  /**
   * Set the qname of this {@link PrintTask} instance.
   *
   * @param qname  The qname of this {@link PrintTask}
   */
  public void setQname( @Nonnull final String qname) {
    this.qname = qname;
  }

   /**
    * Set the profileName of this {@link PrintTask} instance and return the same instance.
    *
    * @param profileName  The profileName of this {@link PrintTask}
    * @return The same instance of this {@link PrintTask} class
    */
   @Nonnull public PrintTask profileName(@Nonnull final String profileName) {
    this.profileName = profileName;
    return this;
  }

   /**
    * Get profileName
    * @return profileName  The profileName of this {@link PrintTask} instance.
    */
  @Nonnull public String getProfileName() {
    return profileName;
  }

  /**
   * Set the profileName of this {@link PrintTask} instance.
   *
   * @param profileName  The profileName of this {@link PrintTask}
   */
  public void setProfileName( @Nonnull final String profileName) {
    this.profileName = profileName;
  }

   /**
    * Set the metadata of this {@link PrintTask} instance and return the same instance.
    *
    * @param metadata  The metadata of this {@link PrintTask}
    * @return The same instance of this {@link PrintTask} class
    */
   @Nonnull public PrintTask metadata(@Nonnull final PrintTaskMetadata metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
    * Get metadata
    * @return metadata  The metadata of this {@link PrintTask} instance.
    */
  @Nonnull public PrintTaskMetadata getMetadata() {
    return metadata;
  }

  /**
   * Set the metadata of this {@link PrintTask} instance.
   *
   * @param metadata  The metadata of this {@link PrintTask}
   */
  public void setMetadata( @Nonnull final PrintTaskMetadata metadata) {
    this.metadata = metadata;
  }

   /**
    * Set the printContents of this {@link PrintTask} instance and return the same instance.
    *
    * @param printContents  The printContents of this {@link PrintTask}
    * @return The same instance of this {@link PrintTask} class
    */
   @Nonnull public PrintTask printContents(@Nonnull final List<PrintContent> printContents) {
    this.printContents = printContents;
    return this;
  }
  /**
   * Add one printContents instance to this {@link PrintTask}.
   * @param printContentsItem The printContents that should be added
   * @return The same instance of type {@link PrintTask}
   */
  @Nonnull public PrintTask addPrintContentsItem( @Nonnull final PrintContent printContentsItem) {
    if (this.printContents == null) {
      this.printContents = new ArrayList<>();
    }
    this.printContents.add(printContentsItem);
    return this;
  }

   /**
    * Get printContents
    * @return printContents  The printContents of this {@link PrintTask} instance.
    */
  @Nonnull public List<PrintContent> getPrintContents() {
    return printContents;
  }

  /**
   * Set the printContents of this {@link PrintTask} instance.
   *
   * @param printContents  The printContents of this {@link PrintTask}
   */
  public void setPrintContents( @Nonnull final List<PrintContent> printContents) {
    this.printContents = printContents;
  }

  /**
   * Get the names of the unrecognizable properties of the {@link PrintTask}.
   * @return The set of properties names
   */
  @JsonIgnore
  @Nonnull
  public Set<String> getCustomFieldNames() {
    return cloudSdkCustomFields.keySet();
  }

  /**
   * Get the value of an unrecognizable property of this {@link PrintTask} instance.
   * @param name  The name of the property
   * @return The value of the property
   * @throws NoSuchElementException  If no property with the given name could be found.
   */
  @Nullable
  public Object getCustomField(@Nonnull final String name) throws NoSuchElementException {
    if( !cloudSdkCustomFields.containsKey(name) ) {
        throw new NoSuchElementException("PrintTask has no field with name '" + name + "'.");
    }
    return cloudSdkCustomFields.get(name);
  }

  /**
   * Set an unrecognizable property of this {@link PrintTask} instance. If the map previously contained a mapping
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
    final PrintTask printTask = (PrintTask) o;
    return Objects.equals(this.cloudSdkCustomFields, printTask.cloudSdkCustomFields) &&
        Objects.equals(this.numberOfCopies, printTask.numberOfCopies) &&
        Objects.equals(this.username, printTask.username) &&
        Objects.equals(this.qname, printTask.qname) &&
        Objects.equals(this.profileName, printTask.profileName) &&
        Objects.equals(this.metadata, printTask.metadata) &&
        Objects.equals(this.printContents, printTask.printContents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numberOfCopies, username, qname, profileName, metadata, printContents, cloudSdkCustomFields);
  }

  @Override
  @Nonnull public String toString() {
    final StringBuilder sb = new StringBuilder();
    sb.append("class PrintTask {\n");
    sb.append("    numberOfCopies: ").append(toIndentedString(numberOfCopies)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    qname: ").append(toIndentedString(qname)).append("\n");
    sb.append("    profileName: ").append(toIndentedString(profileName)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    printContents: ").append(toIndentedString(printContents)).append("\n");
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

