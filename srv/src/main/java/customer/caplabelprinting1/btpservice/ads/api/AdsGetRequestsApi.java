

package customer.caplabelprinting1.btpservice.ads.api;

import com.sap.cloud.sdk.services.openapi.core.OpenApiRequestException;
import com.sap.cloud.sdk.services.openapi.core.OpenApiResponse;
import com.sap.cloud.sdk.services.openapi.core.AbstractOpenApiService;
import com.sap.cloud.sdk.services.openapi.apiclient.ApiClient;

import customer.caplabelprinting1.btpservice.ads.model.APIError;
import customer.caplabelprinting1.btpservice.ads.model.APIValidationError;
import customer.caplabelprinting1.btpservice.ads.model.AttachmentsListOutput;
import customer.caplabelprinting1.btpservice.ads.model.AttachmentsOutput;
import customer.caplabelprinting1.btpservice.ads.model.FileOutput;
import customer.caplabelprinting1.btpservice.ads.model.PDFInput;
import customer.caplabelprinting1.btpservice.ads.model.SignaturesOutput;
import customer.caplabelprinting1.btpservice.ads.model.TemplateInput;

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
public class AdsGetRequestsApi extends AbstractOpenApiService {
    /**
     * Instantiates this API class to invoke operations on the Forms Service by Adobe API (Cloud Foundry).
     *
     * @param httpDestination The destination that API should be used with
     */
    public AdsGetRequestsApi( @Nonnull final Destination httpDestination )
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
    public AdsGetRequestsApi( @Nonnull final ApiClient apiClient )
    {
         super(apiClient);
    }

    
    /**
     * <p>Get Attachments from PDF</p>
     *<p></p>
     * <p><b>200</b> - Successful
     * <p><b>400</b> - Invalid Input
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not Found
     * <p><b>409</b> - Conflict
     * <p><b>415</b> - Unsupported Media Type
     * <p><b>500</b> - Internal Server Error
     * @param pdFInput  (required)
        The value for the parameter pdFInput
     * @param traceLevel  (optional, default to 0)
        0,1,2
     * @return AttachmentsOutput
     * @throws OpenApiRequestException if an error occurs while attempting to invoke the API
     */
    @Nonnull
    public AttachmentsOutput pDFGetAttachmentsPost( @Nonnull final PDFInput pdFInput,  @Nullable final Integer traceLevel) throws OpenApiRequestException {
        final Object localVarPostBody = pdFInput;
        
        // verify the required parameter 'pdFInput' is set
        if (pdFInput == null) {
            throw new OpenApiRequestException("Missing the required parameter 'pdFInput' when calling pDFGetAttachmentsPost");
        }
        
        final String localVarPath = UriComponentsBuilder.fromPath("/v1/pdf/adsGet/attachments").build().toUriString();

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

                localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "TraceLevel", traceLevel));
        

        final String[] localVarAccepts = { 
            "application/json", "*/*"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        final String[] localVarAuthNames = new String[] { "OAuth2" };

        final ParameterizedTypeReference<AttachmentsOutput> localVarReturnType = new ParameterizedTypeReference<AttachmentsOutput>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * <p>Get Attachments from PDF</p>
     * <p></p>
     * <p><b>200</b> - Successful
     * <p><b>400</b> - Invalid Input
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not Found
     * <p><b>409</b> - Conflict
     * <p><b>415</b> - Unsupported Media Type
     * <p><b>500</b> - Internal Server Error
     * @param pdFInput
     *      The value for the parameter pdFInput
     * @return AttachmentsOutput
     * @throws OpenApiRequestException if an error occurs while attempting to invoke the API
     */
    @Nonnull
    public AttachmentsOutput pDFGetAttachmentsPost( @Nonnull final PDFInput pdFInput) throws OpenApiRequestException {
        return pDFGetAttachmentsPost(pdFInput, null);
    }

    /**
     * <p>Get Data from PDF</p>
     *<p></p>
     * <p><b>200</b> - Successful
     * <p><b>400</b> - Invalid Input
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not Found
     * <p><b>409</b> - Conflict
     * <p><b>415</b> - Unsupported Media Type
     * <p><b>500</b> - Internal Server Error
     * @param pdFInput  (required)
        The value for the parameter pdFInput
     * @param traceLevel  (optional, default to 0)
        0,1,2
     * @return FileOutput
     * @throws OpenApiRequestException if an error occurs while attempting to invoke the API
     */
    @Nonnull
    public FileOutput pDFGetDataPost( @Nonnull final PDFInput pdFInput,  @Nullable final Integer traceLevel) throws OpenApiRequestException {
        final Object localVarPostBody = pdFInput;
        
        // verify the required parameter 'pdFInput' is set
        if (pdFInput == null) {
            throw new OpenApiRequestException("Missing the required parameter 'pdFInput' when calling pDFGetDataPost");
        }
        
        final String localVarPath = UriComponentsBuilder.fromPath("/v1/pdf/adsGet/data").build().toUriString();

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

                localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "TraceLevel", traceLevel));
        

        final String[] localVarAccepts = { 
            "application/json", "*/*"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        final String[] localVarAuthNames = new String[] { "OAuth2" };

        final ParameterizedTypeReference<FileOutput> localVarReturnType = new ParameterizedTypeReference<FileOutput>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * <p>Get Data from PDF</p>
     * <p></p>
     * <p><b>200</b> - Successful
     * <p><b>400</b> - Invalid Input
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not Found
     * <p><b>409</b> - Conflict
     * <p><b>415</b> - Unsupported Media Type
     * <p><b>500</b> - Internal Server Error
     * @param pdFInput
     *      The value for the parameter pdFInput
     * @return FileOutput
     * @throws OpenApiRequestException if an error occurs while attempting to invoke the API
     */
    @Nonnull
    public FileOutput pDFGetDataPost( @Nonnull final PDFInput pdFInput) throws OpenApiRequestException {
        return pDFGetDataPost(pdFInput, null);
    }

    /**
     * <p>Get Signatures from PDF</p>
     *<p></p>
     * <p><b>200</b> - Successful
     * <p><b>400</b> - Invalid Input
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not Found
     * <p><b>409</b> - Conflict
     * <p><b>415</b> - Unsupported Media Type
     * <p><b>500</b> - Internal Server Error
     * @param pdFInput  (required)
        The value for the parameter pdFInput
     * @param traceLevel  (optional, default to 0)
        0,1,2
     * @return SignaturesOutput
     * @throws OpenApiRequestException if an error occurs while attempting to invoke the API
     */
    @Nonnull
    public SignaturesOutput pDFGetSignaturePost( @Nonnull final PDFInput pdFInput,  @Nullable final Integer traceLevel) throws OpenApiRequestException {
        final Object localVarPostBody = pdFInput;
        
        // verify the required parameter 'pdFInput' is set
        if (pdFInput == null) {
            throw new OpenApiRequestException("Missing the required parameter 'pdFInput' when calling pDFGetSignaturePost");
        }
        
        final String localVarPath = UriComponentsBuilder.fromPath("/v1/pdf/adsGet/signatures").build().toUriString();

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

                localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "TraceLevel", traceLevel));
        

        final String[] localVarAccepts = { 
            "application/json", "*/*"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        final String[] localVarAuthNames = new String[] { "OAuth2" };

        final ParameterizedTypeReference<SignaturesOutput> localVarReturnType = new ParameterizedTypeReference<SignaturesOutput>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * <p>Get Signatures from PDF</p>
     * <p></p>
     * <p><b>200</b> - Successful
     * <p><b>400</b> - Invalid Input
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not Found
     * <p><b>409</b> - Conflict
     * <p><b>415</b> - Unsupported Media Type
     * <p><b>500</b> - Internal Server Error
     * @param pdFInput
     *      The value for the parameter pdFInput
     * @return SignaturesOutput
     * @throws OpenApiRequestException if an error occurs while attempting to invoke the API
     */
    @Nonnull
    public SignaturesOutput pDFGetSignaturePost( @Nonnull final PDFInput pdFInput) throws OpenApiRequestException {
        return pDFGetSignaturePost(pdFInput, null);
    }

    /**
     * <p>Get a List of all Attachments from PDF</p>
     *<p></p>
     * <p><b>200</b> - Successful
     * <p><b>400</b> - Invalid Input
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not Found
     * <p><b>409</b> - Conflict
     * <p><b>415</b> - Unsupported Media Type
     * <p><b>500</b> - Internal Server Error
     * @param pdFInput  (required)
        The value for the parameter pdFInput
     * @param traceLevel  (optional, default to 0)
        0,1,2
     * @return AttachmentsListOutput
     * @throws OpenApiRequestException if an error occurs while attempting to invoke the API
     */
    @Nonnull
    public AttachmentsListOutput pDFListAttachmentsPost( @Nonnull final PDFInput pdFInput,  @Nullable final Integer traceLevel) throws OpenApiRequestException {
        final Object localVarPostBody = pdFInput;
        
        // verify the required parameter 'pdFInput' is set
        if (pdFInput == null) {
            throw new OpenApiRequestException("Missing the required parameter 'pdFInput' when calling pDFListAttachmentsPost");
        }
        
        final String localVarPath = UriComponentsBuilder.fromPath("/v1/pdf/adsGet/attachmentsList").build().toUriString();

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

                localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "TraceLevel", traceLevel));
        

        final String[] localVarAccepts = { 
            "application/json", "*/*"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        final String[] localVarAuthNames = new String[] { "OAuth2" };

        final ParameterizedTypeReference<AttachmentsListOutput> localVarReturnType = new ParameterizedTypeReference<AttachmentsListOutput>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * <p>Get a List of all Attachments from PDF</p>
     * <p></p>
     * <p><b>200</b> - Successful
     * <p><b>400</b> - Invalid Input
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not Found
     * <p><b>409</b> - Conflict
     * <p><b>415</b> - Unsupported Media Type
     * <p><b>500</b> - Internal Server Error
     * @param pdFInput
     *      The value for the parameter pdFInput
     * @return AttachmentsListOutput
     * @throws OpenApiRequestException if an error occurs while attempting to invoke the API
     */
    @Nonnull
    public AttachmentsListOutput pDFListAttachmentsPost( @Nonnull final PDFInput pdFInput) throws OpenApiRequestException {
        return pDFListAttachmentsPost(pdFInput, null);
    }

    /**
     * <p>Get Schema from Template</p>
     *<p></p>
     * <p><b>200</b> - Successful
     * <p><b>400</b> - Invalid Input
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not Found
     * <p><b>409</b> - Conflict
     * <p><b>415</b> - Unsupported Media Type
     * <p><b>500</b> - Internal Server Error
     * @param templateInput  (required)
        The value for the parameter templateInput
     * @param traceLevel  (optional, default to 0)
        0,1,2
     * @return FileOutput
     * @throws OpenApiRequestException if an error occurs while attempting to invoke the API
     */
    @Nonnull
    public FileOutput templateGetSchema( @Nonnull final TemplateInput templateInput,  @Nullable final Integer traceLevel) throws OpenApiRequestException {
        final Object localVarPostBody = templateInput;
        
        // verify the required parameter 'templateInput' is set
        if (templateInput == null) {
            throw new OpenApiRequestException("Missing the required parameter 'templateInput' when calling templateGetSchema");
        }
        
        final String localVarPath = UriComponentsBuilder.fromPath("/v1/template/adsGet/schema").build().toUriString();

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

                localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "TraceLevel", traceLevel));
        

        final String[] localVarAccepts = { 
            "application/json", "*/*"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        final String[] localVarAuthNames = new String[] { "OAuth2" };

        final ParameterizedTypeReference<FileOutput> localVarReturnType = new ParameterizedTypeReference<FileOutput>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * <p>Get Schema from Template</p>
     * <p></p>
     * <p><b>200</b> - Successful
     * <p><b>400</b> - Invalid Input
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not Found
     * <p><b>409</b> - Conflict
     * <p><b>415</b> - Unsupported Media Type
     * <p><b>500</b> - Internal Server Error
     * @param templateInput
     *      The value for the parameter templateInput
     * @return FileOutput
     * @throws OpenApiRequestException if an error occurs while attempting to invoke the API
     */
    @Nonnull
    public FileOutput templateGetSchema( @Nonnull final TemplateInput templateInput) throws OpenApiRequestException {
        return templateGetSchema(templateInput, null);
    }
}
