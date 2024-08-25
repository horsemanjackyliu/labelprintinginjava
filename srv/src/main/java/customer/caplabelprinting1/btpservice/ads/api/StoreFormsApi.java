

package customer.caplabelprinting1.btpservice.ads.api;

import com.sap.cloud.sdk.services.openapi.core.OpenApiRequestException;
import com.sap.cloud.sdk.services.openapi.core.OpenApiResponse;
import com.sap.cloud.sdk.services.openapi.core.AbstractOpenApiService;
import com.sap.cloud.sdk.services.openapi.apiclient.ApiClient;

import customer.caplabelprinting1.btpservice.ads.model.APIError;
import customer.caplabelprinting1.btpservice.ads.model.APIValidationError;
import customer.caplabelprinting1.btpservice.ads.model.FormMetadata;
import customer.caplabelprinting1.btpservice.ads.model.FormStoreInput;
import customer.caplabelprinting1.btpservice.ads.model.FormStoreOutput;

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
public class StoreFormsApi extends AbstractOpenApiService {
    /**
     * Instantiates this API class to invoke operations on the Forms Service by Adobe API (Cloud Foundry).
     *
     * @param httpDestination The destination that API should be used with
     */
    public StoreFormsApi( @Nonnull final Destination httpDestination )
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
    public StoreFormsApi( @Nonnull final ApiClient apiClient )
    {
         super(apiClient);
    }

        /**
     * <p>Delete a form</p>
     * <p>Delete a form including all related files, templates and schema.</p>
     * <p><b>200</b> - Successful
     * <p><b>400</b> - Invalid Input
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not Found
     * <p><b>409</b> - Conflict
     * <p><b>415</b> - Unsupported Media Type
     * <p><b>500</b> - Internal Server Error
     * @param formName
     *      Name of a form.
     * @return String
     * @throws OpenApiRequestException if an error occurs while attempting to invoke the API
     */
    @Nonnull
    public String formDelete( @Nonnull final String formName) throws OpenApiRequestException {
        final Object localVarPostBody = null;
        
        // verify the required parameter 'formName' is set
        if (formName == null) {
            throw new OpenApiRequestException("Missing the required parameter 'formName' when calling formDelete");
        }
        
        // create path and map variables
        final Map<String, Object> localVarPathParams = new HashMap<String, Object>();
        localVarPathParams.put("formName", formName);
        final String localVarPath = UriComponentsBuilder.fromPath("/v1/forms/{formName}").buildAndExpand(localVarPathParams).toUriString();

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

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
     * <p>Read a form</p>
     *<p>Retrieve a form using &#39;formName&#39; path param. Use query params to filter the result.</p>
     * <p><b>200</b> - Successful
     * <p><b>400</b> - Invalid Input
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not Found
     * <p><b>409</b> - Conflict
     * <p><b>415</b> - Unsupported Media Type
     * <p><b>500</b> - Internal Server Error
     * @param formName  (required)
        Name of a form.
     * @param select  (optional
        Filter form json blocks, Possible Values: formData, formMetaData, xdpTemplate, templateData, templateMetaData, templateVersions, xsdSchema, schemaData, schemaMetaData, schemaVersions.
     * @return FormStoreOutput
     * @throws OpenApiRequestException if an error occurs while attempting to invoke the API
     */
    @Nonnull
    public FormStoreOutput formGet( @Nonnull final String formName,  @Nullable final List<String> select) throws OpenApiRequestException {
        final Object localVarPostBody = null;
        
        // verify the required parameter 'formName' is set
        if (formName == null) {
            throw new OpenApiRequestException("Missing the required parameter 'formName' when calling formGet");
        }
        
        // create path and map variables
        final Map<String, Object> localVarPathParams = new HashMap<String, Object>();
        localVarPathParams.put("formName", formName);
        final String localVarPath = UriComponentsBuilder.fromPath("/v1/forms/{formName}").buildAndExpand(localVarPathParams).toUriString();

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

                localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "select", select));
        

        final String[] localVarAccepts = { 
            "application/json", "*/*"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        final String[] localVarAuthNames = new String[] { "OAuth2" };

        final ParameterizedTypeReference<FormStoreOutput> localVarReturnType = new ParameterizedTypeReference<FormStoreOutput>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * <p>Read a form</p>
     * <p>Retrieve a form using &#39;formName&#39; path param. Use query params to filter the result.</p>
     * <p><b>200</b> - Successful
     * <p><b>400</b> - Invalid Input
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not Found
     * <p><b>409</b> - Conflict
     * <p><b>415</b> - Unsupported Media Type
     * <p><b>500</b> - Internal Server Error
     * @param formName
     *      Name of a form.
     * @return FormStoreOutput
     * @throws OpenApiRequestException if an error occurs while attempting to invoke the API
     */
    @Nonnull
    public FormStoreOutput formGet( @Nonnull final String formName) throws OpenApiRequestException {
        return formGet(formName, null);
    }
    /**
     * <p>Create a form</p>
     * <p>Create a form first to store templates and schema.</p>
     * <p><b>200</b> - Successful
     * <p><b>400</b> - Invalid Input
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not Found
     * <p><b>409</b> - Conflict
     * <p><b>415</b> - Unsupported Media Type
     * <p><b>500</b> - Internal Server Error
     * @param formStoreInput
     *      The value for the parameter formStoreInput
     * @return FormMetadata
     * @throws OpenApiRequestException if an error occurs while attempting to invoke the API
     */
    @Nonnull
    public FormMetadata formPost( @Nonnull final FormStoreInput formStoreInput) throws OpenApiRequestException {
        final Object localVarPostBody = formStoreInput;
        
        // verify the required parameter 'formStoreInput' is set
        if (formStoreInput == null) {
            throw new OpenApiRequestException("Missing the required parameter 'formStoreInput' when calling formPost");
        }
        
        final String localVarPath = UriComponentsBuilder.fromPath("/v1/forms").build().toUriString();

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

        final ParameterizedTypeReference<FormMetadata> localVarReturnType = new ParameterizedTypeReference<FormMetadata>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * <p>Update a form</p>
     * <p>Update a form using &#39;formName&#39; path param.</p>
     * <p><b>200</b> - Successful
     * <p><b>400</b> - Invalid Input
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not Found
     * <p><b>409</b> - Conflict
     * <p><b>415</b> - Unsupported Media Type
     * <p><b>500</b> - Internal Server Error
     * @param formName
     *      Name of a form.
     * @param formStoreInput
     *      The value for the parameter formStoreInput
     * @return FormMetadata
     * @throws OpenApiRequestException if an error occurs while attempting to invoke the API
     */
    @Nonnull
    public FormMetadata formPut( @Nonnull final String formName,  @Nonnull final FormStoreInput formStoreInput) throws OpenApiRequestException {
        final Object localVarPostBody = formStoreInput;
        
        // verify the required parameter 'formName' is set
        if (formName == null) {
            throw new OpenApiRequestException("Missing the required parameter 'formName' when calling formPut");
        }
        
        // verify the required parameter 'formStoreInput' is set
        if (formStoreInput == null) {
            throw new OpenApiRequestException("Missing the required parameter 'formStoreInput' when calling formPut");
        }
        
        // create path and map variables
        final Map<String, Object> localVarPathParams = new HashMap<String, Object>();
        localVarPathParams.put("formName", formName);
        final String localVarPath = UriComponentsBuilder.fromPath("/v1/forms/{formName}").buildAndExpand(localVarPathParams).toUriString();

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

        final ParameterizedTypeReference<FormMetadata> localVarReturnType = new ParameterizedTypeReference<FormMetadata>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.PUT, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * <p>Read forms</p>
     *<p>Retrieve all forms. Use query params to filter the result.</p>
     * <p><b>200</b> - Successful
     * <p><b>400</b> - Invalid Input
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not Found
     * <p><b>409</b> - Conflict
     * <p><b>415</b> - Unsupported Media Type
     * <p><b>500</b> - Internal Server Error
     * @param limit  (optional, default to 0)
        Amount of elements which should be returned.
     * @param offset  (optional, default to 0)
        Starting element.
     * @param select  (optional
        Filter form json blocks, Possible Values: formData, formMetaData, xdpTemplate, templateData, templateMetaData, templateVersions, xsdSchema, schemaData, schemaMetaData, schemaVersions.
     * @return List&lt;FormStoreOutput&gt;
     * @throws OpenApiRequestException if an error occurs while attempting to invoke the API
     */
    @Nonnull
    public List<FormStoreOutput> formsGet( @Nullable final Integer limit,  @Nullable final Integer offset,  @Nullable final List<String> select) throws OpenApiRequestException {
        final Object localVarPostBody = null;
        
        final String localVarPath = UriComponentsBuilder.fromPath("/v1/forms").build().toUriString();

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

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

        final ParameterizedTypeReference<List<FormStoreOutput>> localVarReturnType = new ParameterizedTypeReference<List<FormStoreOutput>>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * <p>Read forms</p>
     * <p>Retrieve all forms. Use query params to filter the result.</p>
     * <p><b>200</b> - Successful
     * <p><b>400</b> - Invalid Input
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not Found
     * <p><b>409</b> - Conflict
     * <p><b>415</b> - Unsupported Media Type
     * <p><b>500</b> - Internal Server Error
     * @return List&lt;FormStoreOutput&gt;
     * @throws OpenApiRequestException if an error occurs while attempting to invoke the API
     */
    @Nonnull
    public List<FormStoreOutput> formsGet() throws OpenApiRequestException {
        return formsGet(null, null, null);
    }
}
