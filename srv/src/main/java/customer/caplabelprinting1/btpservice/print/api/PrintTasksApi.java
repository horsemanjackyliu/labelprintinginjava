

package customer.caplabelprinting1.btpservice.print.api;

import com.sap.cloud.sdk.services.openapi.core.OpenApiRequestException;
import com.sap.cloud.sdk.services.openapi.core.OpenApiResponse;
import com.sap.cloud.sdk.services.openapi.core.AbstractOpenApiService;
import com.sap.cloud.sdk.services.openapi.apiclient.ApiClient;

import customer.caplabelprinting1.btpservice.print.model.DmApiV1RestPrintDocumentsPost400Response;
import customer.caplabelprinting1.btpservice.print.model.PrintTask;
import customer.caplabelprinting1.btpservice.print.model.QmApiV1RestPrintTasksItemIdPut412Response;
import customer.caplabelprinting1.btpservice.print.model.QmApiV1RestPrintTasksItemIdPut429Response;
import customer.caplabelprinting1.btpservice.print.model.QmApiV1RestPrintTasksItemIdPut500Response;

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
public class PrintTasksApi extends AbstractOpenApiService {
    /**
     * Instantiates this API class to invoke operations on the SAP Print Service.
     *
     * @param httpDestination The destination that API should be used with
     */
    public PrintTasksApi( @Nonnull final Destination httpDestination )
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
    public PrintTasksApi( @Nonnull final ApiClient apiClient )
    {
         super(apiClient);
    }

        /**
     * <p>Create print task</p>
     * <p>You can use the following request to send the business document to the particular print queue that is created in SAP Print service. You can specify information, for example, numberOfCopies, username, etc.</p>
     * <p><b>204</b> - Print task created successfully.
     * <p><b>400</b> - Paas Tenant Information is null. 
     * <p><b>412</b> - ifNoneMatch.header.wrong.content 
     * <p><b>429</b> - Too many requests. The service is busy and doesn&#39;t permit further calls. 
     * <p><b>500</b> - Unfortunately, the schema wasn&#39;&#39;t created successfully. If this error persists, please contact the component BC-CCM-PRN-OM-SCP. 
     * @param itemId
     *      The itemId should be the same as any one of objectKey in body. Once one objectKey is chosen as itemId, it will be considered as the main document during Print Queue Item creation, the rest of objectKey will be considered as the attachments which will be associated to that main document.
     * @param ifNoneMatch
     *      It should always be &#39;*&#39;
     * @param printTask
     *      This API is used to create a print task. The field itemId should be identical to one of the documentId from printContents. The documentId should be created successfully via API /dm/api/v1/rest/print-documents. The field qname should be included in the response of API qm/api/v1/rest/queues. If you want to print the attached document that is associated with the specific main document, the documentName should include the extension, for example, attachment.pdf.
     * @return An OpenApiResponse containing the status code of the HttpResponse.
     * @throws OpenApiRequestException if an error occurs while attempting to invoke the API
     */
    @Nonnull
    public OpenApiResponse qmApiV1RestPrintTasksItemIdPut( @Nonnull final String itemId,  @Nonnull final String ifNoneMatch,  @Nonnull final PrintTask printTask) throws OpenApiRequestException {
        final Object localVarPostBody = printTask;
        
        // verify the required parameter 'itemId' is set
        if (itemId == null) {
            throw new OpenApiRequestException("Missing the required parameter 'itemId' when calling qmApiV1RestPrintTasksItemIdPut");
        }
        
        // verify the required parameter 'ifNoneMatch' is set
        if (ifNoneMatch == null) {
            throw new OpenApiRequestException("Missing the required parameter 'ifNoneMatch' when calling qmApiV1RestPrintTasksItemIdPut");
        }
        
        // verify the required parameter 'printTask' is set
        if (printTask == null) {
            throw new OpenApiRequestException("Missing the required parameter 'printTask' when calling qmApiV1RestPrintTasksItemIdPut");
        }
        
        // create path and map variables
        final Map<String, Object> localVarPathParams = new HashMap<String, Object>();
        localVarPathParams.put("itemId", itemId);
        final String localVarPath = UriComponentsBuilder.fromPath("/qm/api/v1/rest/print-tasks/{itemId}").buildAndExpand(localVarPathParams).toUriString();

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (ifNoneMatch != null)
        localVarHeaderParams.add("If-None-Match", apiClient.parameterToString(ifNoneMatch));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        final String[] localVarAuthNames = new String[] { "oauth2api" };

        final ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(localVarPath, HttpMethod.PUT, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
        return new OpenApiResponse(apiClient);
    }
}
