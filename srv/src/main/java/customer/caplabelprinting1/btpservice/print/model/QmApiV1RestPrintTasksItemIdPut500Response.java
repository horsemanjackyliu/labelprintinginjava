

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
import customer.caplabelprinting1.btpservice.print.model.QmApiV1RestPrintTasksItemIdPut500ResponseError;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/**
 * QmApiV1RestPrintTasksItemIdPut500Response
 */
// CHECKSTYLE:OFF
public class QmApiV1RestPrintTasksItemIdPut500Response 
// CHECKSTYLE:ON
{
  @JsonProperty("error")
  private QmApiV1RestPrintTasksItemIdPut500ResponseError error;

  @JsonAnySetter
  @JsonAnyGetter
  private final Map<String, Object> cloudSdkCustomFields = new LinkedHashMap<>();

   /**
    * Set the error of this {@link QmApiV1RestPrintTasksItemIdPut500Response} instance and return the same instance.
    *
    * @param error  The error of this {@link QmApiV1RestPrintTasksItemIdPut500Response}
    * @return The same instance of this {@link QmApiV1RestPrintTasksItemIdPut500Response} class
    */
   @Nonnull public QmApiV1RestPrintTasksItemIdPut500Response error(@Nonnull final QmApiV1RestPrintTasksItemIdPut500ResponseError error) {
    this.error = error;
    return this;
  }

   /**
    * Get error
    * @return error  The error of this {@link QmApiV1RestPrintTasksItemIdPut500Response} instance.
    */
  @Nonnull public QmApiV1RestPrintTasksItemIdPut500ResponseError getError() {
    return error;
  }

  /**
   * Set the error of this {@link QmApiV1RestPrintTasksItemIdPut500Response} instance.
   *
   * @param error  The error of this {@link QmApiV1RestPrintTasksItemIdPut500Response}
   */
  public void setError( @Nonnull final QmApiV1RestPrintTasksItemIdPut500ResponseError error) {
    this.error = error;
  }

  /**
   * Get the names of the unrecognizable properties of the {@link QmApiV1RestPrintTasksItemIdPut500Response}.
   * @return The set of properties names
   */
  @JsonIgnore
  @Nonnull
  public Set<String> getCustomFieldNames() {
    return cloudSdkCustomFields.keySet();
  }

  /**
   * Get the value of an unrecognizable property of this {@link QmApiV1RestPrintTasksItemIdPut500Response} instance.
   * @param name  The name of the property
   * @return The value of the property
   * @throws NoSuchElementException  If no property with the given name could be found.
   */
  @Nullable
  public Object getCustomField(@Nonnull final String name) throws NoSuchElementException {
    if( !cloudSdkCustomFields.containsKey(name) ) {
        throw new NoSuchElementException("QmApiV1RestPrintTasksItemIdPut500Response has no field with name '" + name + "'.");
    }
    return cloudSdkCustomFields.get(name);
  }

  /**
   * Set an unrecognizable property of this {@link QmApiV1RestPrintTasksItemIdPut500Response} instance. If the map previously contained a mapping
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
    final QmApiV1RestPrintTasksItemIdPut500Response qmApiV1RestPrintTasksItemIdPut500Response = (QmApiV1RestPrintTasksItemIdPut500Response) o;
    return Objects.equals(this.cloudSdkCustomFields, qmApiV1RestPrintTasksItemIdPut500Response.cloudSdkCustomFields) &&
        Objects.equals(this.error, qmApiV1RestPrintTasksItemIdPut500Response.error);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error, cloudSdkCustomFields);
  }

  @Override
  @Nonnull public String toString() {
    final StringBuilder sb = new StringBuilder();
    sb.append("class QmApiV1RestPrintTasksItemIdPut500Response {\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
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

