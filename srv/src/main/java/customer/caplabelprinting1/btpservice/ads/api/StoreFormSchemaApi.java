

package customer.caplabelprinting1.btpservice.ads.api;

import com.sap.cloud.sdk.services.openapi.core.OpenApiRequestException;
import com.sap.cloud.sdk.services.openapi.core.OpenApiResponse;
import com.sap.cloud.sdk.services.openapi.core.AbstractOpenApiService;
import com.sap.cloud.sdk.services.openapi.apiclient.ApiClient;

import customer.caplabelprinting1.btpservice.ads.model.APIError;
import customer.caplabelprinting1.btpservice.ads.model.APIValidationError;
import customer.caplabelprinting1.btpservice.ads.model.SchemaMetadata;
import customer.caplabelprinting1.btpservice.ads.model.SchemaStoreInput;
import customer.caplabelprinting1.btpservice.ads.model.SchemaStoreOutput;
import customer.caplabelprinting1.btpservice.ads.model.SchemaUpdateStoreInput;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.common.annotations.Beta;

import com.sap.cloud.sdk.cloudplatform.connectivity.Destination;

/**
 * Forms Service by Adobe API (Cloud Foundry) in version v1.
 *
 * The SAP Forms service by Adobe is a cloud service based on the ADS (Adobe Document Services). The Forms service REST API provides a subset of the SAP Forms service capabilities. They are addressed by different URIs (Uniform Resource Identifiers) where each URI supports data and document exchange in a JSON format. The SAP Forms service REST API delivers a comprehensive description and is easy to test. The application calls the REST API via an SAP BTP subaccount that must be subscribed to the SAP Forms service.
 */
public class StoreFormSchemaApi extends AbstractOpenApiService {
    /**
     * Instantiates this API class to invoke operations on the Forms Service by Adobe API (Cloud Foundry).
     *
     * @param httpDestination The destination that API should be used with
     */
    public StoreFormSchemaApi( @Nonnull final Destination httpDestination )
    {
        super(httpDestination);
    }

    /**
     * Instantiates this API class to invoke operations on the Forms Service by Adobe API (Cloud Foundry) based on a given {@link ApiClient}.
     *
     * @param apiClient
     *            ApiClient to invoke the API on
     */
    @Beta
    public StoreFormSchemaApi( @Nonnull final ApiClient apiClient )
    {
         super(apiClient);
    }

    
    /**
     * <p>Delete a schema</p>
     *<p>Delete a schema of a form using.</p>
     * <p><b>200</b> - Successful
     * <p><b>400</b> - Invalid Input
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not Found
     * <p><b>409</b> - Conflict
     * <p><b>415</b> - Unsupported Media Type
     * <p><b>500</b> - Internal Server Error
     * @param formName  (required)
        Name of a form.
     * @param schemaName  (required)
        Name of a schema.
     * @param allVersions  (optional, default to false)
        Set to true if all schema versions should be deleted.
     * @param isObjectId  (optional, default to false)
        Set to true if schema is queried via objectId.
     * @return String
     * @throws OpenApiRequestException if an error occurs while attempting to invoke the API
     */
    @Nonnull
    public String schemaDelete( @Nonnull final String formName,  @Nonnull final String schemaName,  @Nullable final Boolean allVersions,  @Nullable final Boolean isObjectId) throws OpenApiRequestException {
        final Object localVarPostBody = null;
        
        // verify the required parameter 'formName' is set
        if (formName == null) {
            throw new OpenApiRequestException("Missing the required parameter 'formName' when calling schemaDelete");
        }
        
        // verify the required parameter 'schemaName' is set
        if (schemaName == null) {
            throw new OpenApiRequestException("Missing the required parameter 'schemaName' when calling schemaDelete");
        }
        
        // create path and map variables
        final Map<String, Object> localVarPathParams = new HashMap<String, Object>();
        localVarPathParams.put("formName", formName);
        localVarPathParams.put("schemaName", schemaName);
        final String localVarPath = UriComponentsBuilder.fromPath("/v1/forms/{formName}/schema/{schemaName}").buildAndExpand(localVarPathParams).toUriString();

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

                localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "allVersions", allVersions));
                localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "isObjectId", isObjectId));
        

        final String[] localVarAccepts = { 
            "application/json", "*/*"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        final String[] localVarAuthNames = new String[] { "OAuth2" };

        final ParameterizedTypeReference<String> localVarReturnType = new ParameterizedTypeReference<String>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.DELETE, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * <p>Delete a schema</p>
     * <p>Delete a schema of a form using.</p>
     * <p><b>200</b> - Successful
     * <p><b>400</b> - Invalid Input
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not Found
     * <p><b>409</b> - Conflict
     * <p><b>415</b> - Unsupported Media Type
     * <p><b>500</b> - Internal Server Error
     * @param formName
     *      Name of a form.
     * @param schemaName
     *      Name of a schema.
     * @return String
     * @throws OpenApiRequestException if an error occurs while attempting to invoke the API
     */
    @Nonnull
    public String schemaDelete( @Nonnull final String formName,  @Nonnull final String schemaName) throws OpenApiRequestException {
        return schemaDelete(formName, schemaName, null, null);
    }

    /**
     * <p>Read a schema</p>
     *<p>Read a schema of a form.</p>
     * <p><b>200</b> - Successful
     * <p><b>400</b> - Invalid Input
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not Found
     * <p><b>409</b> - Conflict
     * <p><b>415</b> - Unsupported Media Type
     * <p><b>500</b> - Internal Server Error
     * @param formName  (required)
        Name of a form.
     * @param schemaName  (required)
        Name of a schema.
     * @param select  (optional
        Filter schema json blocks, Possible Values: xsdSchema, schemaData, schemaMetaData, schemaVersions.
     * @param isObjectId  (optional, default to false)
        Set to true if schema is queried via objectId.
     * @return SchemaStoreOutput
     * @throws OpenApiRequestException if an error occurs while attempting to invoke the API
     */
    @Nonnull
    public SchemaStoreOutput schemaGet( @Nonnull final String formName,  @Nonnull final String schemaName,  @Nullable final List<String> select,  @Nullable final Boolean isObjectId) throws OpenApiRequestException {
        final Object localVarPostBody = null;
        
        // verify the required parameter 'formName' is set
        if (formName == null) {
            throw new OpenApiRequestException("Missing the required parameter 'formName' when calling schemaGet");
        }
        
        // verify the required parameter 'schemaName' is set
        if (schemaName == null) {
            throw new OpenApiRequestException("Missing the required parameter 'schemaName' when calling schemaGet");
        }
        
        // create path and map variables
        final Map<String, Object> localVarPathParams = new HashMap<String, Object>();
        localVarPathParams.put("formName", formName);
        localVarPathParams.put("schemaName", schemaName);
        final String localVarPath = UriComponentsBuilder.fromPath("/v1/forms/{formName}/schema/{schemaName}").buildAndExpand(localVarPathParams).toUriString();

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

                localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "select", select));
                localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "isObjectId", isObjectId));
        

        final String[] localVarAccepts = { 
            "application/json", "*/*"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        final String[] localVarAuthNames = new String[] { "OAuth2" };

        final ParameterizedTypeReference<SchemaStoreOutput> localVarReturnType = new ParameterizedTypeReference<SchemaStoreOutput>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * <p>Read a schema</p>
     * <p>Read a schema of a form.</p>
     * <p><b>200</b> - Successful
     * <p><b>400</b> - Invalid Input
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not Found
     * <p><b>409</b> - Conflict
     * <p><b>415</b> - Unsupported Media Type
     * <p><b>500</b> - Internal Server Error
     * @param formName
     *      Name of a form.
     * @param schemaName
     *      Name of a schema.
     * @return SchemaStoreOutput
     * @throws OpenApiRequestException if an error occurs while attempting to invoke the API
     */
    @Nonnull
    public SchemaStoreOutput schemaGet( @Nonnull final String formName,  @Nonnull final String schemaName) throws OpenApiRequestException {
        return schemaGet(formName, schemaName, null, null);
    }
    /**
     * <p>Store a schema</p>
     * <p>Store a schema of a form.</p>
     * <p><b>200</b> - Successful
     * <p><b>400</b> - Invalid Input
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not Found
     * <p><b>409</b> - Conflict
     * <p><b>415</b> - Unsupported Media Type
     * <p><b>500</b> - Internal Server Error
     * @param formName
     *      Name of a form.
     * @param schemaStoreInput
     *      The value for the parameter schemaStoreInput
     * @return SchemaMetadata
     * @throws OpenApiRequestException if an error occurs while attempting to invoke the API
     */
    @Nonnull
    public SchemaMetadata schemaPost( @Nonnull final String formName,  @Nonnull final SchemaStoreInput schemaStoreInput) throws OpenApiRequestException {
        final Object localVarPostBody = schemaStoreInput;
        
        // verify the required parameter 'formName' is set
        if (formName == null) {
            throw new OpenApiRequestException("Missing the required parameter 'formName' when calling schemaPost");
        }
        
        // verify the required parameter 'schemaStoreInput' is set
        if (schemaStoreInput == null) {
            throw new OpenApiRequestException("Missing the required parameter 'schemaStoreInput' when calling schemaPost");
        }
        
        // create path and map variables
        final Map<String, Object> localVarPathParams = new HashMap<String, Object>();
        localVarPathParams.put("formName", formName);
        final String localVarPath = UriComponentsBuilder.fromPath("/v1/forms/{formName}/schema").buildAndExpand(localVarPathParams).toUriString();

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json", "*/*"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        final String[] localVarAuthNames = new String[] { "OAuth2" };

        final ParameterizedTypeReference<SchemaMetadata> localVarReturnType = new ParameterizedTypeReference<SchemaMetadata>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * <p>Update a schema</p>
     *<p>Update a schema of a form.</p>
     * <p><b>200</b> - Successful
     * <p><b>400</b> - Invalid Input
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not Found
     * <p><b>409</b> - Conflict
     * <p><b>415</b> - Unsupported Media Type
     * <p><b>500</b> - Internal Server Error
     * @param formName  (required)
        Name of a form.
     * @param schemaName  (required)
        Name of a schema.
     * @param schemaUpdateStoreInput  (required)
        The value for the parameter schemaUpdateStoreInput
     * @param isObjectId  (optional, default to false)
        Set to true if schema is queried via objectId.
     * @return SchemaMetadata
     * @throws OpenApiRequestException if an error occurs while attempting to invoke the API
     */
    @Nonnull
    public SchemaMetadata schemaPut( @Nonnull final String formName,  @Nonnull final String schemaName,  @Nonnull final SchemaUpdateStoreInput schemaUpdateStoreInput,  @Nullable final Boolean isObjectId) throws OpenApiRequestException {
        final Object localVarPostBody = schemaUpdateStoreInput;
        
        // verify the required parameter 'formName' is set
        if (formName == null) {
            throw new OpenApiRequestException("Missing the required parameter 'formName' when calling schemaPut");
        }
        
        // verify the required parameter 'schemaName' is set
        if (schemaName == null) {
            throw new OpenApiRequestException("Missing the required parameter 'schemaName' when calling schemaPut");
        }
        
        // verify the required parameter 'schemaUpdateStoreInput' is set
        if (schemaUpdateStoreInput == null) {
            throw new OpenApiRequestException("Missing the required parameter 'schemaUpdateStoreInput' when calling schemaPut");
        }
        
        // create path and map variables
        final Map<String, Object> localVarPathParams = new HashMap<String, Object>();
        localVarPathParams.put("formName", formName);
        localVarPathParams.put("schemaName", schemaName);
        final String localVarPath = UriComponentsBuilder.fromPath("/v1/forms/{formName}/schema/{schemaName}").buildAndExpand(localVarPathParams).toUriString();

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

                localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "isObjectId", isObjectId));
        

        final String[] localVarAccepts = { 
            "application/json", "*/*"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        final String[] localVarAuthNames = new String[] { "OAuth2" };

        final ParameterizedTypeReference<SchemaMetadata> localVarReturnType = new ParameterizedTypeReference<SchemaMetadata>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.PUT, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * <p>Update a schema</p>
     * <p>Update a schema of a form.</p>
     * <p><b>200</b> - Successful
     * <p><b>400</b> - Invalid Input
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not Found
     * <p><b>409</b> - Conflict
     * <p><b>415</b> - Unsupported Media Type
     * <p><b>500</b> - Internal Server Error
     * @param formName
     *      Name of a form.
     * @param schemaName
     *      Name of a schema.
     * @param schemaUpdateStoreInput
     *      The value for the parameter schemaUpdateStoreInput
     * @return SchemaMetadata
     * @throws OpenApiRequestException if an error occurs while attempting to invoke the API
     */
    @Nonnull
    public SchemaMetadata schemaPut( @Nonnull final String formName,  @Nonnull final String schemaName,  @Nonnull final SchemaUpdateStoreInput schemaUpdateStoreInput) throws OpenApiRequestException {
        return schemaPut(formName, schemaName, schemaUpdateStoreInput, null);
    }
}
