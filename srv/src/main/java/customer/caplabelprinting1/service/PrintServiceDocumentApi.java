package customer.caplabelprinting1.service;

import java.time.Duration;
import java.io.File;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sap.cloud.sdk.cloudplatform.connectivity.Destination;
import com.sap.cloud.sdk.cloudplatform.connectivity.DestinationAccessor;
import com.sap.cloud.sdk.cloudplatform.resilience.ResilienceConfiguration;
import com.sap.cloud.sdk.cloudplatform.resilience.ResilienceDecorator;
import com.sap.cloud.sdk.cloudplatform.resilience.ResilienceIsolationMode;
import com.sap.cloud.sdk.services.openapi.core.OpenApiRequestException;

import customer.caplabelprinting1.btpservice.print.api.DocumentsApi;
import customer.caplabelprinting1.btpservice.print.api.QueuesApi;



public class PrintServiceDocumentApi {

    private static final Logger logger = LoggerFactory.getLogger(PrintServiceDocumentApi.class);

    private final String printDestinationName = "printServiceApi";
    private final ResilienceConfiguration myResilienceConfig;

    public PrintServiceDocumentApi(){
        this.myResilienceConfig = ResilienceConfiguration.of(QueuesApi.class)
        .isolationMode(ResilienceIsolationMode.TENANT_AND_USER_OPTIONAL)
        .timeLimiterConfiguration(
                ResilienceConfiguration.TimeLimiterConfiguration.of()
                        .timeoutDuration(Duration.ofSeconds(30)))
        .bulkheadConfiguration(
                ResilienceConfiguration.BulkheadConfiguration.of()
                        .maxConcurrentCalls(20));
    }

    public String documentApiCommanc(String ifNonMatch,Boolean scan, File file){
        return ResilienceDecorator.executeSupplier( ()->  documentApi(ifNonMatch,scan,file), myResilienceConfig,e->{
                logger.warn("Document Upload Failed", e);
                return "";
            });
    }

    private String documentApi(String ifNonMatch,Boolean scan, File file){
       Destination printDestination = DestinationAccessor.getDestination(printDestinationName);
       DocumentsApi documentsApi = new DocumentsApi(printDestination);
       String docuId = "";
       try{
        docuId = documentsApi.dmApiV1RestPrintDocumentsPost(ifNonMatch, scan, file);
        } catch(OpenApiRequestException e1){
                e1.printStackTrace();
        }
        return docuId;


    }



}
