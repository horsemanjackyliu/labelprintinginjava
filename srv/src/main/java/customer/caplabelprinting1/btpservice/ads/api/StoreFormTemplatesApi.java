

package customer.caplabelprinting1.btpservice.ads.api;

import com.sap.cloud.sdk.services.openapi.core.OpenApiRequestException;
import com.sap.cloud.sdk.services.openapi.core.OpenApiResponse;
import com.sap.cloud.sdk.services.openapi.core.AbstractOpenApiService;
import com.sap.cloud.sdk.services.openapi.apiclient.ApiClient;

import customer.caplabelprinting1.btpservice.ads.model.APIError;
import customer.caplabelprinting1.btpservice.ads.model.APIValidationError;
import customer.caplabelprinting1.btpservice.ads.model.TemplateMetadata;
import customer.caplabelprinting1.btpservice.ads.model.TemplateStoreInput;
import customer.caplabelprinting1.btpservice.ads.model.TemplateStoreOutput;
import customer.caplabelprinting1.btpservice.ads.model.TemplateUpdateStoreInput;

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
public class StoreFormTemplatesApi extends AbstractOpenApiService {
    /**
     * Instantiates this API class to invoke operations on the Forms Service by Adobe API (Cloud Foundry).
     *
     * @param httpDestination The destination that API should be used with
     */
    public StoreFormTemplatesApi( @Nonnull final Destination httpDestination )
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
    public StoreFormTemplatesApi( @Nonnull final ApiClient apiClient )
    {
         super(apiClient);
    }

    
    /**
     * <p>Delete a template</p>
     *<p>Delete a template of a form using &#39;name&#39; or &#39;objectId&#39; path param.</p>
     * <p><b>200</b> - Successful
     * <p><b>400</b> - Invalid Input
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not Found
     * <p><b>409</b> - Conflict
     * <p><b>415</b> - Unsupported Media Type
     * <p><b>500</b> - Internal Server Error
     * @param formName  (required)
        Name of a form.
     * @param templateName  (required)
        Name of a template.
     * @param allVersions  (optional, default to false)
        Set to true if all template versions should be deleted.
     * @param isObjectId  (optional, default to false)
        Set to true if template is queried via objectId.
     * @return String
     * @throws OpenApiRequestException if an error occurs while attempting to invoke the API
     */
    @Nonnull
    public String templateDelete( @Nonnull final String formName,  @Nonnull final String templateName,  @Nullable final Boolean allVersions,  @Nullable final Boolean isObjectId) throws OpenApiRequestException {
        final Object localVarPostBody = null;
        
        // verify the required parameter 'formName' is set
        if (formName == null) {
            throw new OpenApiRequestException("Missing the required parameter 'formName' when calling templateDelete");
        }
        
        // verify the required parameter 'templateName' is set
        if (templateName == null) {
            throw new OpenApiRequestException("Missing the required parameter 'templateName' when calling templateDelete");
        }
        
        // create path and map variables
        final Map<String, Object> localVarPathParams = new HashMap<String, Object>();
        localVarPathParams.put("formName", formName);
        localVarPathParams.put("templateName", templateName);
        final String localVarPath = UriComponentsBuilder.fromPath("/v1/forms/{formName}/templates/{templateName}").buildAndExpand(localVarPathParams).toUriString();

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
     * <p>Delete a template</p>
     * <p>Delete a template of a form using &#39;name&#39; or &#39;objectId&#39; path param.</p>
     * <p><b>200</b> - Successful
     * <p><b>400</b> - Invalid Input
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not Found
     * <p><b>409</b> - Conflict
     * <p><b>415</b> - Unsupported Media Type
     * <p><b>500</b> - Internal Server Error
     * @param formName
     *      Name of a form.
     * @param templateName
     *      Name of a template.
     * @return String
     * @throws OpenApiRequestException if an error occurs while attempting to invoke the API
     */
    @Nonnull
    public String templateDelete( @Nonnull final String formName,  @Nonnull final String templateName) throws OpenApiRequestException {
        return templateDelete(formName, templateName, null, null);
    }

    /**
     * <p>Read a template</p>
     *<p>Read a template of a form using &#39;name&#39; or &#39;objectId&#39; path param.</p>
     * <p><b>200</b> - Successful
     * <p><b>400</b> - Invalid Input
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not Found
     * <p><b>409</b> - Conflict
     * <p><b>415</b> - Unsupported Media Type
     * <p><b>500</b> - Internal Server Error
     * @param formName  (required)
        Name of a form.
     * @param templateName  (required)
        Name of a template.
     * @param select  (optional
        Filter template json blocks, Possible Values: &#39;xdpTemplate&#39;, &#39;templateData&#39;, &#39;templateMetaData&#39;, &#39;templateVersions&#39;.
     * @param isObjectId  (optional, default to false)
        Set to true if template is queried via objectId.
     * @return TemplateStoreOutput
     * @throws OpenApiRequestException if an error occurs while attempting to invoke the API
     */
    @Nonnull
    public TemplateStoreOutput templateGet( @Nonnull final String formName,  @Nonnull final String templateName,  @Nullable final List<String> select,  @Nullable final Boolean isObjectId) throws OpenApiRequestException {
        final Object localVarPostBody = null;
        
        // verify the required parameter 'formName' is set
        if (formName == null) {
            throw new OpenApiRequestException("Missing the required parameter 'formName' when calling templateGet");
        }
        
        // verify the required parameter 'templateName' is set
        if (templateName == null) {
            throw new OpenApiRequestException("Missing the required parameter 'templateName' when calling templateGet");
        }
        
        // create path and map variables
        final Map<String, Object> localVarPathParams = new HashMap<String, Object>();
        localVarPathParams.put("formName", formName);
        localVarPathParams.put("templateName", templateName);
        final String localVarPath = UriComponentsBuilder.fromPath("/v1/forms/{formName}/templates/{templateName}").buildAndExpand(localVarPathParams).toUriString();

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

        final ParameterizedTypeReference<TemplateStoreOutput> localVarReturnType = new ParameterizedTypeReference<TemplateStoreOutput>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * <p>Read a template</p>
     * <p>Read a template of a form using &#39;name&#39; or &#39;objectId&#39; path param.</p>
     * <p><b>200</b> - Successful
     * <p><b>400</b> - Invalid Input
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not Found
     * <p><b>409</b> - Conflict
     * <p><b>415</b> - Unsupported Media Type
     * <p><b>500</b> - Internal Server Error
     * @param formName
     *      Name of a form.
     * @param templateName
     *      Name of a template.
     * @return TemplateStoreOutput
     * @throws OpenApiRequestException if an error occurs while attempting to invoke the API
     */
    @Nonnull
    public TemplateStoreOutput templateGet( @Nonnull final String formName,  @Nonnull final String templateName) throws OpenApiRequestException {
        return templateGet(formName, templateName, null, null);
    }
    /**
     * <p>Store a template</p>
     * <p>Store a template of a form.</p>
     * <p><b>200</b> - Successful
     * <p><b>400</b> - Invalid Input
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not Found
     * <p><b>409</b> - Conflict
     * <p><b>415</b> - Unsupported Media Type
     * <p><b>500</b> - Internal Server Error
     * @param formName
     *      Name of form
     * @param templateStoreInput
     *      The value for the parameter templateStoreInput
     * @return TemplateMetadata
     * @throws OpenApiRequestException if an error occurs while attempting to invoke the API
     */
    @Nonnull
    public TemplateMetadata templatePost( @Nonnull final String formName,  @Nonnull final TemplateStoreInput templateStoreInput) throws OpenApiRequestException {
        final Object localVarPostBody = templateStoreInput;
        
        // verify the required parameter 'formName' is set
        if (formName == null) {
            throw new OpenApiRequestException("Missing the required parameter 'formName' when calling templatePost");
        }
        
        // verify the required parameter 'templateStoreInput' is set
        if (templateStoreInput == null) {
            throw new OpenApiRequestException("Missing the required parameter 'templateStoreInput' when calling templatePost");
        }
        
        // create path and map variables
        final Map<String, Object> localVarPathParams = new HashMap<String, Object>();
        localVarPathParams.put("formName", formName);
        final String localVarPath = UriComponentsBuilder.fromPath("/v1/forms/{formName}/templates").buildAndExpand(localVarPathParams).toUriString();

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

        final ParameterizedTypeReference<TemplateMetadata> localVarReturnType = new ParameterizedTypeReference<TemplateMetadata>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * <p>Update a template</p>
     *<p>Update a template of a form using &#39;name&#39; or &#39;objectId&#39; path param.</p>
     * <p><b>200</b> - Successful
     * <p><b>400</b> - Invalid Input
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not Found
     * <p><b>409</b> - Conflict
     * <p><b>415</b> - Unsupported Media Type
     * <p><b>500</b> - Internal Server Error
     * @param formName  (required)
        Name of a form.
     * @param templateName  (required)
        Name of a template to be updated.
     * @param templateUpdateStoreInput  (required)
        The value for the parameter templateUpdateStoreInput
     * @param isObjectId  (optional, default to false)
        Set to true if template is queried via objectId.
     * @return TemplateMetadata
     * @throws OpenApiRequestException if an error occurs while attempting to invoke the API
     */
    @Nonnull
    public TemplateMetadata templatePut( @Nonnull final String formName,  @Nonnull final String templateName,  @Nonnull final TemplateUpdateStoreInput templateUpdateStoreInput,  @Nullable final Boolean isObjectId) throws OpenApiRequestException {
        final Object localVarPostBody = templateUpdateStoreInput;
        
        // verify the required parameter 'formName' is set
        if (formName == null) {
            throw new OpenApiRequestException("Missing the required parameter 'formName' when calling templatePut");
        }
        
        // verify the required parameter 'templateName' is set
        if (templateName == null) {
            throw new OpenApiRequestException("Missing the required parameter 'templateName' when calling templatePut");
        }
        
        // verify the required parameter 'templateUpdateStoreInput' is set
        if (templateUpdateStoreInput == null) {
            throw new OpenApiRequestException("Missing the required parameter 'templateUpdateStoreInput' when calling templatePut");
        }
        
        // create path and map variables
        final Map<String, Object> localVarPathParams = new HashMap<String, Object>();
        localVarPathParams.put("formName", formName);
        localVarPathParams.put("templateName", templateName);
        final String localVarPath = UriComponentsBuilder.fromPath("/v1/forms/{formName}/templates/{templateName}").buildAndExpand(localVarPathParams).toUriString();

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

        final ParameterizedTypeReference<TemplateMetadata> localVarReturnType = new ParameterizedTypeReference<TemplateMetadata>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.PUT, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * <p>Update a template</p>
     * <p>Update a template of a form using &#39;name&#39; or &#39;objectId&#39; path param.</p>
     * <p><b>200</b> - Successful
     * <p><b>400</b> - Invalid Input
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not Found
     * <p><b>409</b> - Conflict
     * <p><b>415</b> - Unsupported Media Type
     * <p><b>500</b> - Internal Server Error
     * @param formName
     *      Name of a form.
     * @param templateName
     *      Name of a template to be updated.
     * @param templateUpdateStoreInput
     *      The value for the parameter templateUpdateStoreInput
     * @return TemplateMetadata
     * @throws OpenApiRequestException if an error occurs while attempting to invoke the API
     */
    @Nonnull
    public TemplateMetadata templatePut( @Nonnull final String formName,  @Nonnull final String templateName,  @Nonnull final TemplateUpdateStoreInput templateUpdateStoreInput) throws OpenApiRequestException {
        return templatePut(formName, templateName, templateUpdateStoreInput, null);
    }

    /**
     * <p>Read templates</p>
     *<p>Retrieve all templates of a form. Use query params to filter the result.</p>
     * <p><b>200</b> - Successful
     * <p><b>400</b> - Invalid Input
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not Found
     * <p><b>409</b> - Conflict
     * <p><b>415</b> - Unsupported Media Type
     * <p><b>500</b> - Internal Server Error
     * @param formName  (required)
        Name of a form
     * @param locale  (optional)
        Filter a templates locale.
     * @param language  (optional)
        Filter a templates language.
     * @param templateName  (optional)
        Filter a templates name.
     * @param masterLanguage  (optional)
        Filter a templates masterLanguage.
     * @param businessArea  (optional)
        Filter a templates businessArea.
     * @param businessDepartment  (optional)
        Filter a templates businessDepartment.
     * @param limit  (optional, default to 0)
        Amount of elements which should be returned.
     * @param offset  (optional, default to 0)
        Starting element.
     * @param select  (optional
        Filter template json blocks, Possible Values: &#39;xdpTemplate&#39;, &#39;templateData&#39;, &#39;templateMetaData&#39;, &#39;templateVersions&#39;.
     * @return List&lt;TemplateStoreOutput&gt;
     * @throws OpenApiRequestException if an error occurs while attempting to invoke the API
     */
    @Nonnull
    public List<TemplateStoreOutput> templatesGet( @Nonnull final String formName,  @Nullable final String locale,  @Nullable final String language,  @Nullable final String templateName,  @Nullable final String masterLanguage,  @Nullable final String businessArea,  @Nullable final String businessDepartment,  @Nullable final Integer limit,  @Nullable final Integer offset,  @Nullable final List<String> select) throws OpenApiRequestException {
        final Object localVarPostBody = null;
        
        // verify the required parameter 'formName' is set
        if (formName == null) {
            throw new OpenApiRequestException("Missing the required parameter 'formName' when calling templatesGet");
        }
        
        // create path and map variables
        final Map<String, Object> localVarPathParams = new HashMap<String, Object>();
        localVarPathParams.put("formName", formName);
        final String localVarPath = UriComponentsBuilder.fromPath("/v1/forms/{formName}/templates").buildAndExpand(localVarPathParams).toUriString();

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

                localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "locale", locale));
                localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "language", language));
                localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "templateName", templateName));
                localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "masterLanguage", masterLanguage));
                localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "businessArea", businessArea));
                localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "businessDepartment", businessDepartment));
                localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));
                localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "offset", offset));
                localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "select", select));
        

        final String[] localVarAccepts = { 
            "application/json", "*/*"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        final String[] localVarAuthNames = new String[] { "OAuth2" };

        final ParameterizedTypeReference<List<TemplateStoreOutput>> localVarReturnType = new ParameterizedTypeReference<List<TemplateStoreOutput>>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * <p>Read templates</p>
     * <p>Retrieve all templates of a form. Use query params to filter the result.</p>
     * <p><b>200</b> - Successful
     * <p><b>400</b> - Invalid Input
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not Found
     * <p><b>409</b> - Conflict
     * <p><b>415</b> - Unsupported Media Type
     * <p><b>500</b> - Internal Server Error
     * @param formName
     *      Name of a form
     * @return List&lt;TemplateStoreOutput&gt;
     * @throws OpenApiRequestException if an error occurs while attempting to invoke the API
     */
    @Nonnull
    public List<TemplateStoreOutput> templatesGet( @Nonnull final String formName) throws OpenApiRequestException {
        return templatesGet(formName, null, null, null, null, null, null, null, null, null);
    }
}
