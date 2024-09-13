

package customer.caplabelprinting1.btpservice.print.api;

import com.sap.cloud.sdk.services.openapi.core.OpenApiRequestException;
import com.sap.cloud.sdk.services.openapi.core.OpenApiResponse;
import com.sap.cloud.sdk.services.openapi.core.AbstractOpenApiService;
import com.sap.cloud.sdk.services.openapi.apiclient.ApiClient;

import customer.caplabelprinting1.btpservice.print.model.DmApiV1RestPrintDocumentsPost400Response;
import customer.caplabelprinting1.btpservice.print.model.DmApiV1RestPrintDocumentsPost413Response;
import customer.caplabelprinting1.btpservice.print.model.DmApiV1RestPrintDocumentsPost429Response;
import customer.caplabelprinting1.btpservice.print.model.DmApiV1RestPrintDocumentsPost500Response;
import java.io.File;

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
 * SAP Print Service in version 1.2.
 *
 * SAP Print service offers public APIs, including Query Print Queue, Upload Documents and Create Print Task that can help manage print queues, connect print clients and monitor print status.   This API is implemented based on REST API specification.
 */
public class DocumentsApi extends AbstractOpenApiService {
    /**
     * Instantiates this API class to invoke operations on the SAP Print Service.
     *
     * @param httpDestination The destination that API should be used with
     */
    public DocumentsApi( @Nonnull final Destination httpDestination )
    {
        super(httpDestination);
    }

    /**
     * Instantiates this API class to invoke operations on the SAP Print Service based on a given {@link ApiClient}.
     *
     * @param apiClient
     *            ApiClient to invoke the API on
     */
    @Beta
    public DocumentsApi( @Nonnull final ApiClient apiClient )
    {
         super(apiClient);
    }

    
    /**
     * <p>Put print document</p>
     *<p>You can use the following request to send the business document to a particular print queue that is created in SAP  Print service. You can specify information, for example, numberOfCopies, username, etc. Maximum document size is 1 MB.</p>
     * <p><b>201</b> - Document uploaded successfully.
     * <p><b>400</b> - no document in the request
     * <p><b>413</b> - Request entity too large.
     * <p><b>429</b> - rate.limiter.error.
     * <p><b>500</b> - Virus scan failed.
     * @param ifNoneMatch  (required)
        It should always be &#39;*&#39;
     * @param scan  (optional, default to true)
        Set to true to enable virus scan; Set to false to skip virus scan
     * @param _file  (optional)
        The value for the parameter _file
     * @return String
     * @throws OpenApiRequestException if an error occurs while attempting to invoke the API
     */
    @Nonnull
    public String dmApiV1RestPrintDocumentsPost( @Nonnull final String ifNoneMatch,  @Nullable final Boolean scan,  @Nullable final File _file) throws OpenApiRequestException {
        final Object localVarPostBody = null;
        
        // verify the required parameter 'ifNoneMatch' is set
        if (ifNoneMatch == null) {
            throw new OpenApiRequestException("Missing the required parameter 'ifNoneMatch' when calling dmApiV1RestPrintDocumentsPost");
        }
        
        final String localVarPath = UriComponentsBuilder.fromPath("/dm/api/v1/rest/print-documents").build().toUriString();
    

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (ifNoneMatch != null)
            localVarHeaderParams.add("If-None-Match", apiClient.parameterToString(ifNoneMatch));
        if (scan != null)
            localVarHeaderParams.add("scan", apiClient.parameterToString(scan));

        if (_file != null)
            localVarFormParams.add("file", new FileSystemResource(_file));

        final String[] localVarAccepts = { 
            "plain/text", "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        final String[] localVarAuthNames = new String[] { "oauth2api" };

        final ParameterizedTypeReference<String> localVarReturnType = new ParameterizedTypeReference<String>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * <p>Put print document</p>
     * <p>You can use the following request to send the business document to a particular print queue that is created in SAP  Print service. You can specify information, for example, numberOfCopies, username, etc. Maximum document size is 1 MB.</p>
     * <p><b>201</b> - Document uploaded successfully.
     * <p><b>400</b> - no document in the request
     * <p><b>413</b> - Request entity too large.
     * <p><b>429</b> - rate.limiter.error.
     * <p><b>500</b> - Virus scan failed.
     * @param ifNoneMatch
     *      It should always be &#39;*&#39;
     * @return String
     * @throws OpenApiRequestException if an error occurs while attempting to invoke the API
     */
    @Nonnull
    public String dmApiV1RestPrintDocumentsPost( @Nonnull final String ifNoneMatch) throws OpenApiRequestException {
        return dmApiV1RestPrintDocumentsPost(ifNoneMatch, null, null);
    }
}
