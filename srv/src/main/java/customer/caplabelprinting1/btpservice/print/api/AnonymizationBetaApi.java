

package customer.caplabelprinting1.btpservice.print.api;

import com.sap.cloud.sdk.services.openapi.core.OpenApiRequestException;
import com.sap.cloud.sdk.services.openapi.core.OpenApiResponse;
import com.sap.cloud.sdk.services.openapi.core.AbstractOpenApiService;
import com.sap.cloud.sdk.services.openapi.apiclient.ApiClient;

import customer.caplabelprinting1.btpservice.print.model.AnonymizeApiV10AnonymizePost400Response;
import customer.caplabelprinting1.btpservice.print.model.AnonymizeApiV10AnonymizePost500Response;
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
public class AnonymizationBetaApi extends AbstractOpenApiService {
    /**
     * Instantiates this API class to invoke operations on the SAP Print Service.
     *
     * @param httpDestination The destination that API should be used with
     */
    public AnonymizationBetaApi( @Nonnull final Destination httpDestination )
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
    public AnonymizationBetaApi( @Nonnull final ApiClient apiClient )
    {
         super(apiClient);
    }

    
    /**
     * <p>Upload a file for anonymization</p>
     *<p>By applying anonymization techniques, this API offers the suitable capacity to anonymize Personally Identifiable Information (PII) for your customer data. It can support you to mask email, address, phone and url for personal data. Currently, it is still Beta release and only available on EU20 region, if you have the specific requirement and want to improve the accuracy of anonymization, please contact support component BC-CCM-PRN-OM-SCP.</p>
     * <p><b>200</b> - Successful operation
     * <p><b>400</b> - Bad Request
     * <p><b>500</b> - Unexpected Error
     * @param entities  (optional)
        Use the default entities for anonymization.
     * @param textFile  (optional)
        The supported Document Types \\\\:.jpeg, .jpg, .png, .pdf, .text, .json
     * @return File
     * @throws OpenApiRequestException if an error occurs while attempting to invoke the API
     */
    @Nonnull
    public File anonymizeApiV10AnonymizePost( @Nullable final String entities,  @Nullable final File textFile) throws OpenApiRequestException {
        final Object localVarPostBody = null;
        
        final String localVarPath = UriComponentsBuilder.fromPath("/anonymize/api/v1.0/anonymize").build().toUriString();

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

                localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "entities", entities));
        

        if (textFile != null)
            localVarFormParams.add("text_file", new FileSystemResource(textFile));

        final String[] localVarAccepts = { 
            "application/pdf", "image/png", "image/jpeg", "text/html", "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        final String[] localVarAuthNames = new String[] { "oauth2api" };

        final ParameterizedTypeReference<File> localVarReturnType = new ParameterizedTypeReference<File>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * <p>Upload a file for anonymization</p>
     * <p>By applying anonymization techniques, this API offers the suitable capacity to anonymize Personally Identifiable Information (PII) for your customer data. It can support you to mask email, address, phone and url for personal data. Currently, it is still Beta release and only available on EU20 region, if you have the specific requirement and want to improve the accuracy of anonymization, please contact support component BC-CCM-PRN-OM-SCP.</p>
     * <p><b>200</b> - Successful operation
     * <p><b>400</b> - Bad Request
     * <p><b>500</b> - Unexpected Error
     * @return File
     * @throws OpenApiRequestException if an error occurs while attempting to invoke the API
     */
    @Nonnull
    public File anonymizeApiV10AnonymizePost() throws OpenApiRequestException {
        return anonymizeApiV10AnonymizePost(null, null);
    }
}
