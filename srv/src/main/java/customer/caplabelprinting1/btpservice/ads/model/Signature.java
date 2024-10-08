

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
import customer.caplabelprinting1.btpservice.ads.model.Certificate;
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
 * Signature
 */
// CHECKSTYLE:OFF
public class Signature 
// CHECKSTYLE:ON
{
  @JsonProperty("certificates")
  private List<Certificate> certificates = new ArrayList<>();

  @JsonProperty("contactInfo")
  private String contactInfo;

  @JsonProperty("date")
  private String date;

  @JsonProperty("field")
  private String field;

  @JsonProperty("legalAttestations")
  private String legalAttestations;

  @JsonProperty("location")
  private String location;

  @JsonProperty("maxRevisions")
  private String maxRevisions;

  @JsonProperty("permissions")
  private String permissions;

  @JsonProperty("reason")
  private String reason;

  @JsonProperty("revision")
  private String revision;

  @JsonProperty("signer")
  private String signer;

  @JsonProperty("status")
  private String status;

  @JsonAnySetter
  @JsonAnyGetter
  private final Map<String, Object> cloudSdkCustomFields = new LinkedHashMap<>();

   /**
    * Set the certificates of this {@link Signature} instance and return the same instance.
    *
    * @param certificates  The certificates of this {@link Signature}
    * @return The same instance of this {@link Signature} class
    */
   @Nonnull public Signature certificates(@Nonnull final List<Certificate> certificates) {
    this.certificates = certificates;
    return this;
  }
  /**
   * Add one certificates instance to this {@link Signature}.
   * @param certificatesItem The certificates that should be added
   * @return The same instance of type {@link Signature}
   */
  @Nonnull public Signature addCertificatesItem( @Nonnull final Certificate certificatesItem) {
    if (this.certificates == null) {
      this.certificates = new ArrayList<>();
    }
    this.certificates.add(certificatesItem);
    return this;
  }

   /**
    * Get certificates
    * @return certificates  The certificates of this {@link Signature} instance.
    */
  @Nonnull public List<Certificate> getCertificates() {
    return certificates;
  }

  /**
   * Set the certificates of this {@link Signature} instance.
   *
   * @param certificates  The certificates of this {@link Signature}
   */
  public void setCertificates( @Nonnull final List<Certificate> certificates) {
    this.certificates = certificates;
  }

   /**
    * Set the contactInfo of this {@link Signature} instance and return the same instance.
    *
    * @param contactInfo  The contactInfo of this {@link Signature}
    * @return The same instance of this {@link Signature} class
    */
   @Nonnull public Signature contactInfo(@Nonnull final String contactInfo) {
    this.contactInfo = contactInfo;
    return this;
  }

   /**
    * Get contactInfo
    * @return contactInfo  The contactInfo of this {@link Signature} instance.
    */
  @Nonnull public String getContactInfo() {
    return contactInfo;
  }

  /**
   * Set the contactInfo of this {@link Signature} instance.
   *
   * @param contactInfo  The contactInfo of this {@link Signature}
   */
  public void setContactInfo( @Nonnull final String contactInfo) {
    this.contactInfo = contactInfo;
  }

   /**
    * Set the date of this {@link Signature} instance and return the same instance.
    *
    * @param date  The date of this {@link Signature}
    * @return The same instance of this {@link Signature} class
    */
   @Nonnull public Signature date(@Nonnull final String date) {
    this.date = date;
    return this;
  }

   /**
    * Get date
    * @return date  The date of this {@link Signature} instance.
    */
  @Nonnull public String getDate() {
    return date;
  }

  /**
   * Set the date of this {@link Signature} instance.
   *
   * @param date  The date of this {@link Signature}
   */
  public void setDate( @Nonnull final String date) {
    this.date = date;
  }

   /**
    * Set the field of this {@link Signature} instance and return the same instance.
    *
    * @param field  The field of this {@link Signature}
    * @return The same instance of this {@link Signature} class
    */
   @Nonnull public Signature field(@Nonnull final String field) {
    this.field = field;
    return this;
  }

   /**
    * Get field
    * @return field  The field of this {@link Signature} instance.
    */
  @Nonnull public String getField() {
    return field;
  }

  /**
   * Set the field of this {@link Signature} instance.
   *
   * @param field  The field of this {@link Signature}
   */
  public void setField( @Nonnull final String field) {
    this.field = field;
  }

   /**
    * Set the legalAttestations of this {@link Signature} instance and return the same instance.
    *
    * @param legalAttestations  The legalAttestations of this {@link Signature}
    * @return The same instance of this {@link Signature} class
    */
   @Nonnull public Signature legalAttestations(@Nonnull final String legalAttestations) {
    this.legalAttestations = legalAttestations;
    return this;
  }

   /**
    * Get legalAttestations
    * @return legalAttestations  The legalAttestations of this {@link Signature} instance.
    */
  @Nonnull public String getLegalAttestations() {
    return legalAttestations;
  }

  /**
   * Set the legalAttestations of this {@link Signature} instance.
   *
   * @param legalAttestations  The legalAttestations of this {@link Signature}
   */
  public void setLegalAttestations( @Nonnull final String legalAttestations) {
    this.legalAttestations = legalAttestations;
  }

   /**
    * Set the location of this {@link Signature} instance and return the same instance.
    *
    * @param location  The location of this {@link Signature}
    * @return The same instance of this {@link Signature} class
    */
   @Nonnull public Signature location(@Nonnull final String location) {
    this.location = location;
    return this;
  }

   /**
    * Get location
    * @return location  The location of this {@link Signature} instance.
    */
  @Nonnull public String getLocation() {
    return location;
  }

  /**
   * Set the location of this {@link Signature} instance.
   *
   * @param location  The location of this {@link Signature}
   */
  public void setLocation( @Nonnull final String location) {
    this.location = location;
  }

   /**
    * Set the maxRevisions of this {@link Signature} instance and return the same instance.
    *
    * @param maxRevisions  The maxRevisions of this {@link Signature}
    * @return The same instance of this {@link Signature} class
    */
   @Nonnull public Signature maxRevisions(@Nonnull final String maxRevisions) {
    this.maxRevisions = maxRevisions;
    return this;
  }

   /**
    * Get maxRevisions
    * @return maxRevisions  The maxRevisions of this {@link Signature} instance.
    */
  @Nonnull public String getMaxRevisions() {
    return maxRevisions;
  }

  /**
   * Set the maxRevisions of this {@link Signature} instance.
   *
   * @param maxRevisions  The maxRevisions of this {@link Signature}
   */
  public void setMaxRevisions( @Nonnull final String maxRevisions) {
    this.maxRevisions = maxRevisions;
  }

   /**
    * Set the permissions of this {@link Signature} instance and return the same instance.
    *
    * @param permissions  The permissions of this {@link Signature}
    * @return The same instance of this {@link Signature} class
    */
   @Nonnull public Signature permissions(@Nonnull final String permissions) {
    this.permissions = permissions;
    return this;
  }

   /**
    * Get permissions
    * @return permissions  The permissions of this {@link Signature} instance.
    */
  @Nonnull public String getPermissions() {
    return permissions;
  }

  /**
   * Set the permissions of this {@link Signature} instance.
   *
   * @param permissions  The permissions of this {@link Signature}
   */
  public void setPermissions( @Nonnull final String permissions) {
    this.permissions = permissions;
  }

   /**
    * Set the reason of this {@link Signature} instance and return the same instance.
    *
    * @param reason  The reason of this {@link Signature}
    * @return The same instance of this {@link Signature} class
    */
   @Nonnull public Signature reason(@Nonnull final String reason) {
    this.reason = reason;
    return this;
  }

   /**
    * Get reason
    * @return reason  The reason of this {@link Signature} instance.
    */
  @Nonnull public String getReason() {
    return reason;
  }

  /**
   * Set the reason of this {@link Signature} instance.
   *
   * @param reason  The reason of this {@link Signature}
   */
  public void setReason( @Nonnull final String reason) {
    this.reason = reason;
  }

   /**
    * Set the revision of this {@link Signature} instance and return the same instance.
    *
    * @param revision  The revision of this {@link Signature}
    * @return The same instance of this {@link Signature} class
    */
   @Nonnull public Signature revision(@Nonnull final String revision) {
    this.revision = revision;
    return this;
  }

   /**
    * Get revision
    * @return revision  The revision of this {@link Signature} instance.
    */
  @Nonnull public String getRevision() {
    return revision;
  }

  /**
   * Set the revision of this {@link Signature} instance.
   *
   * @param revision  The revision of this {@link Signature}
   */
  public void setRevision( @Nonnull final String revision) {
    this.revision = revision;
  }

   /**
    * Set the signer of this {@link Signature} instance and return the same instance.
    *
    * @param signer  The signer of this {@link Signature}
    * @return The same instance of this {@link Signature} class
    */
   @Nonnull public Signature signer(@Nonnull final String signer) {
    this.signer = signer;
    return this;
  }

   /**
    * Get signer
    * @return signer  The signer of this {@link Signature} instance.
    */
  @Nonnull public String getSigner() {
    return signer;
  }

  /**
   * Set the signer of this {@link Signature} instance.
   *
   * @param signer  The signer of this {@link Signature}
   */
  public void setSigner( @Nonnull final String signer) {
    this.signer = signer;
  }

   /**
    * Set the status of this {@link Signature} instance and return the same instance.
    *
    * @param status  The status of this {@link Signature}
    * @return The same instance of this {@link Signature} class
    */
   @Nonnull public Signature status(@Nonnull final String status) {
    this.status = status;
    return this;
  }

   /**
    * Get status
    * @return status  The status of this {@link Signature} instance.
    */
  @Nonnull public String getStatus() {
    return status;
  }

  /**
   * Set the status of this {@link Signature} instance.
   *
   * @param status  The status of this {@link Signature}
   */
  public void setStatus( @Nonnull final String status) {
    this.status = status;
  }

  /**
   * Get the names of the unrecognizable properties of the {@link Signature}.
   * @return The set of properties names
   */
  @JsonIgnore
  @Nonnull
  public Set<String> getCustomFieldNames() {
    return cloudSdkCustomFields.keySet();
  }

  /**
   * Get the value of an unrecognizable property of this {@link Signature} instance.
   * @param name  The name of the property
   * @return The value of the property
   * @throws NoSuchElementException  If no property with the given name could be found.
   */
  @Nullable
  public Object getCustomField(@Nonnull final String name) throws NoSuchElementException {
    if( !cloudSdkCustomFields.containsKey(name) ) {
        throw new NoSuchElementException("Signature has no field with name '" + name + "'.");
    }
    return cloudSdkCustomFields.get(name);
  }

  /**
   * Set an unrecognizable property of this {@link Signature} instance. If the map previously contained a mapping
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
    final Signature signature = (Signature) o;
    return Objects.equals(this.cloudSdkCustomFields, signature.cloudSdkCustomFields) &&
        Objects.equals(this.certificates, signature.certificates) &&
        Objects.equals(this.contactInfo, signature.contactInfo) &&
        Objects.equals(this.date, signature.date) &&
        Objects.equals(this.field, signature.field) &&
        Objects.equals(this.legalAttestations, signature.legalAttestations) &&
        Objects.equals(this.location, signature.location) &&
        Objects.equals(this.maxRevisions, signature.maxRevisions) &&
        Objects.equals(this.permissions, signature.permissions) &&
        Objects.equals(this.reason, signature.reason) &&
        Objects.equals(this.revision, signature.revision) &&
        Objects.equals(this.signer, signature.signer) &&
        Objects.equals(this.status, signature.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(certificates, contactInfo, date, field, legalAttestations, location, maxRevisions, permissions, reason, revision, signer, status, cloudSdkCustomFields);
  }

  @Override
  @Nonnull public String toString() {
    final StringBuilder sb = new StringBuilder();
    sb.append("class Signature {\n");
    sb.append("    certificates: ").append(toIndentedString(certificates)).append("\n");
    sb.append("    contactInfo: ").append(toIndentedString(contactInfo)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    legalAttestations: ").append(toIndentedString(legalAttestations)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    maxRevisions: ").append(toIndentedString(maxRevisions)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    revision: ").append(toIndentedString(revision)).append("\n");
    sb.append("    signer: ").append(toIndentedString(signer)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

