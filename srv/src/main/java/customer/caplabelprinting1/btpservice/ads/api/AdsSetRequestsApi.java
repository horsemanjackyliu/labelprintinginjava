

package customer.caplabelprinting1.btpservice.ads.api;

import com.sap.cloud.sdk.services.openapi.core.OpenApiRequestException;
import com.sap.cloud.sdk.services.openapi.core.OpenApiResponse;
import com.sap.cloud.sdk.services.openapi.core.AbstractOpenApiService;
import com.sap.cloud.sdk.services.openapi.apiclient.ApiClient;

import customer.caplabelprinting1.btpservice.ads.model.APIError;
import customer.caplabelprinting1.btpservice.ads.model.APIValidationError;
import customer.caplabelprinting1.btpservice.ads.model.AttachmentInput;
import customer.caplabelprinting1.btpservice.ads.model.FileOutput;
import customer.caplabelprinting1.btpservice.ads.model.SignatureInput;

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
public class AdsSetRequestsApi extends AbstractOpenApiService {
    /**
     * Instantiates this API class to invoke operations on the Forms Service by Adobe API (Cloud Foundry).
     *
     * @param httpDestination The destination that API should be used with
     */
    public AdsSetRequestsApi( @Nonnull final Destination httpDestination )
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
    public AdsSetRequestsApi( @Nonnull final ApiClient apiClient )
    {
         super(apiClient);
    }

    
    /**
     * <p>Set Attachment to PDF</p>
     *<p>Attaches content to a pdf file. TraceLevel set to 1 or 2 adds a &#39;traceString&#39; node to response JSON.</p>
     * <p><b>200</b> - Successful
     * <p><b>400</b> - Invalid JSON supplied
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not Found
     * <p><b>409</b> - Conflict
     * <p><b>415</b> - Unsupported Media Type
     * <p><b>500</b> - Internal Server Error
     * @param attachmentInput  (required)
        The value for the parameter attachmentInput
     * @param traceLevel  (optional, default to 0)
        0,1,2
     * @return FileOutput
     * @throws OpenApiRequestException if an error occurs while attempting to invoke the API
     */
    @Nonnull
    public FileOutput pDFSetAttachmentPost( @Nonnull final AttachmentInput attachmentInput,  @Nullable final Integer traceLevel) throws OpenApiRequestException {
        final Object localVarPostBody = attachmentInput;
        
        // verify the required parameter 'attachmentInput' is set
        if (attachmentInput == null) {
            throw new OpenApiRequestException("Missing the required parameter 'attachmentInput' when calling pDFSetAttachmentPost");
        }
        
        final String localVarPath = UriComponentsBuilder.fromPath("/v1/pdf/adsSet/attachment").build().toUriString();

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
     * <p>Set Attachment to PDF</p>
     * <p>Attaches content to a pdf file. TraceLevel set to 1 or 2 adds a &#39;traceString&#39; node to response JSON.</p>
     * <p><b>200</b> - Successful
     * <p><b>400</b> - Invalid JSON supplied
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not Found
     * <p><b>409</b> - Conflict
     * <p><b>415</b> - Unsupported Media Type
     * <p><b>500</b> - Internal Server Error
     * @param attachmentInput
     *      The value for the parameter attachmentInput
     * @return FileOutput
     * @throws OpenApiRequestException if an error occurs while attempting to invoke the API
     */
    @Nonnull
    public FileOutput pDFSetAttachmentPost( @Nonnull final AttachmentInput attachmentInput) throws OpenApiRequestException {
        return pDFSetAttachmentPost(attachmentInput, null);
    }

    /**
     * <p>Set Signature to PDF</p>
     *<p>Sets a signature to a pdf file. TraceLevel set to 1 or 2 adds a &#39;traceString&#39; node to response JSON.</p>
     * <p><b>200</b> - Successful
     * <p><b>400</b> - Invalid JSON supplied
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not Found
     * <p><b>409</b> - Conflict
     * <p><b>415</b> - Unsupported Media Type
     * <p><b>500</b> - Internal Server Error
     * @param signatureInput  (required)
        The value for the parameter signatureInput
     * @param traceLevel  (optional, default to 0)
        0,1,2
     * @return FileOutput
     * @throws OpenApiRequestException if an error occurs while attempting to invoke the API
     */
    @Nonnull
    public FileOutput pDFSetSignaturePost( @Nonnull final SignatureInput signatureInput,  @Nullable final Integer traceLevel) throws OpenApiRequestException {
        final Object localVarPostBody = signatureInput;
        
        // verify the required parameter 'signatureInput' is set
        if (signatureInput == null) {
            throw new OpenApiRequestException("Missing the required parameter 'signatureInput' when calling pDFSetSignaturePost");
        }
        
        final String localVarPath = UriComponentsBuilder.fromPath("/v1/pdf/adsSet/signature").build().toUriString();

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
     * <p>Set Signature to PDF</p>
     * <p>Sets a signature to a pdf file. TraceLevel set to 1 or 2 adds a &#39;traceString&#39; node to response JSON.</p>
     * <p><b>200</b> - Successful
     * <p><b>400</b> - Invalid JSON supplied
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not Found
     * <p><b>409</b> - Conflict
     * <p><b>415</b> - Unsupported Media Type
     * <p><b>500</b> - Internal Server Error
     * @param signatureInput
     *      The value for the parameter signatureInput
     * @return FileOutput
     * @throws OpenApiRequestException if an error occurs while attempting to invoke the API
     */
    @Nonnull
    public FileOutput pDFSetSignaturePost( @Nonnull final SignatureInput signatureInput) throws OpenApiRequestException {
        return pDFSetSignaturePost(signatureInput, null);
    }
}
