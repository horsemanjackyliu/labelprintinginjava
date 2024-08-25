

package customer.caplabelprinting1.btpservice.print.api;

import com.sap.cloud.sdk.services.openapi.core.OpenApiRequestException;
import com.sap.cloud.sdk.services.openapi.core.OpenApiResponse;
import com.sap.cloud.sdk.services.openapi.core.AbstractOpenApiService;
import com.sap.cloud.sdk.services.openapi.apiclient.ApiClient;

import customer.caplabelprinting1.btpservice.print.model.DmApiV1RestPrintDocumentsPost400Response;
import customer.caplabelprinting1.btpservice.print.model.PrintProfileDTO;
import customer.caplabelprinting1.btpservice.print.model.QmApiV1RestQueuesQnameProfilesGet403Response;

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
public class PrintProfileApi extends AbstractOpenApiService {
    /**
     * Instantiates this API class to invoke operations on the SAP Print Service.
     *
     * @param httpDestination The destination that API should be used with
     */
    public PrintProfileApi( @Nonnull final Destination httpDestination )
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
    public PrintProfileApi( @Nonnull final ApiClient apiClient )
    {
         super(apiClient);
    }

        /**
     * <p>Get print profile</p>
     * <p>You can use this API to fetch and check the print profile information for each print queue, afterwards, it allows to specify the valid profileName for the particular print task via print-task API, and then, SAP Print service will directly pass those profile parameter to local physical printers. profileParams field is reserved to response the profile parameter detail, it is empty in current version, if you can have any reasonable use case which needs this data, please contact with us, our support component is BC-CCM-PRN-OM-SCP.</p>
     * <p><b>200</b> - Retrieved print profile.
     * <p><b>400</b> - Bad request. 
     * <p><b>403</b> - Invalid owner. 
     * @param qname
     *      The qname should be exist.
     * @return List&lt;PrintProfileDTO&gt;
     * @throws OpenApiRequestException if an error occurs while attempting to invoke the API
     */
    @Nonnull
    public List<PrintProfileDTO> qmApiV1RestQueuesQnameProfilesGet( @Nonnull final String qname) throws OpenApiRequestException {
        final Object localVarPostBody = null;
        
        // verify the required parameter 'qname' is set
        if (qname == null) {
            throw new OpenApiRequestException("Missing the required parameter 'qname' when calling qmApiV1RestQueuesQnameProfilesGet");
        }
        
        // create path and map variables
        final Map<String, Object> localVarPathParams = new HashMap<String, Object>();
        localVarPathParams.put("qname", qname);
        final String localVarPath = UriComponentsBuilder.fromPath("/qm/api/v1/rest/queues/{qname}/profiles").buildAndExpand(localVarPathParams).toUriString();

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json", "application/xml"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        final String[] localVarAuthNames = new String[] { "oauth2api" };

        final ParameterizedTypeReference<List<PrintProfileDTO>> localVarReturnType = new ParameterizedTypeReference<List<PrintProfileDTO>>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
}
