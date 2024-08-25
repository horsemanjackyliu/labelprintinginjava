

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
 * DmApiV1RestPrintDocumentsPost429ResponseError
 */
// CHECKSTYLE:OFF
public class DmApiV1RestPrintDocumentsPost429ResponseError 
// CHECKSTYLE:ON
{
  @JsonProperty("code")
  private String code;

  @JsonProperty("message")
  private String message;

  @JsonAnySetter
  @JsonAnyGetter
  private final Map<String, Object> cloudSdkCustomFields = new LinkedHashMap<>();

   /**
    * Set the code of this {@link DmApiV1RestPrintDocumentsPost429ResponseError} instance and return the same instance.
    *
    * @param code  The code of this {@link DmApiV1RestPrintDocumentsPost429ResponseError}
    * @return The same instance of this {@link DmApiV1RestPrintDocumentsPost429ResponseError} class
    */
   @Nonnull public DmApiV1RestPrintDocumentsPost429ResponseError code(@Nonnull final String code) {
    this.code = code;
    return this;
  }

   /**
    * Get code
    * @return code  The code of this {@link DmApiV1RestPrintDocumentsPost429ResponseError} instance.
    */
  @Nonnull public String getCode() {
    return code;
  }

  /**
   * Set the code of this {@link DmApiV1RestPrintDocumentsPost429ResponseError} instance.
   *
   * @param code  The code of this {@link DmApiV1RestPrintDocumentsPost429ResponseError}
   */
  public void setCode( @Nonnull final String code) {
    this.code = code;
  }

   /**
    * Set the message of this {@link DmApiV1RestPrintDocumentsPost429ResponseError} instance and return the same instance.
    *
    * @param message  The message of this {@link DmApiV1RestPrintDocumentsPost429ResponseError}
    * @return The same instance of this {@link DmApiV1RestPrintDocumentsPost429ResponseError} class
    */
   @Nonnull public DmApiV1RestPrintDocumentsPost429ResponseError message(@Nonnull final String message) {
    this.message = message;
    return this;
  }

   /**
    * Get message
    * @return message  The message of this {@link DmApiV1RestPrintDocumentsPost429ResponseError} instance.
    */
  @Nonnull public String getMessage() {
    return message;
  }

  /**
   * Set the message of this {@link DmApiV1RestPrintDocumentsPost429ResponseError} instance.
   *
   * @param message  The message of this {@link DmApiV1RestPrintDocumentsPost429ResponseError}
   */
  public void setMessage( @Nonnull final String message) {
    this.message = message;
  }

  /**
   * Get the names of the unrecognizable properties of the {@link DmApiV1RestPrintDocumentsPost429ResponseError}.
   * @return The set of properties names
   */
  @JsonIgnore
  @Nonnull
  public Set<String> getCustomFieldNames() {
    return cloudSdkCustomFields.keySet();
  }

  /**
   * Get the value of an unrecognizable property of this {@link DmApiV1RestPrintDocumentsPost429ResponseError} instance.
   * @param name  The name of the property
   * @return The value of the property
   * @throws NoSuchElementException  If no property with the given name could be found.
   */
  @Nullable
  public Object getCustomField(@Nonnull final String name) throws NoSuchElementException {
    if( !cloudSdkCustomFields.containsKey(name) ) {
        throw new NoSuchElementException("DmApiV1RestPrintDocumentsPost429ResponseError has no field with name '" + name + "'.");
    }
    return cloudSdkCustomFields.get(name);
  }

  /**
   * Set an unrecognizable property of this {@link DmApiV1RestPrintDocumentsPost429ResponseError} instance. If the map previously contained a mapping
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
    final DmApiV1RestPrintDocumentsPost429ResponseError dmApiV1RestPrintDocumentsPost429ResponseError = (DmApiV1RestPrintDocumentsPost429ResponseError) o;
    return Objects.equals(this.cloudSdkCustomFields, dmApiV1RestPrintDocumentsPost429ResponseError.cloudSdkCustomFields) &&
        Objects.equals(this.code, dmApiV1RestPrintDocumentsPost429ResponseError.code) &&
        Objects.equals(this.message, dmApiV1RestPrintDocumentsPost429ResponseError.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, message, cloudSdkCustomFields);
  }

  @Override
  @Nonnull public String toString() {
    final StringBuilder sb = new StringBuilder();
    sb.append("class DmApiV1RestPrintDocumentsPost429ResponseError {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

