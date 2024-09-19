package customer.caplabelprinting1.service;

import java.time.Duration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sap.cloud.sdk.cloudplatform.connectivity.Destination;
import com.sap.cloud.sdk.cloudplatform.connectivity.DestinationAccessor;
import com.sap.cloud.sdk.cloudplatform.resilience.ResilienceConfiguration;
import com.sap.cloud.sdk.cloudplatform.resilience.ResilienceDecorator;
import com.sap.cloud.sdk.cloudplatform.resilience.ResilienceIsolationMode;
import com.sap.cloud.sdk.services.openapi.core.OpenApiRequestException;
import com.sap.cloud.sdk.services.openapi.core.OpenApiResponse;

import customer.caplabelprinting1.btpservice.print.api.PrintTasksApi;
import customer.caplabelprinting1.btpservice.print.api.QueuesApi;
import customer.caplabelprinting1.btpservice.print.model.PrintTask;

public class PrintServicePrintTask {

    private static final Logger logger = LoggerFactory.getLogger(PrintServicePrintTask.class);

    private final String printDestinationName = "printServiceApi";
    private final ResilienceConfiguration myResilienceConfig;

    public PrintServicePrintTask() {
        this.myResilienceConfig = ResilienceConfiguration.of(QueuesApi.class)
                .isolationMode(ResilienceIsolationMode.TENANT_AND_USER_OPTIONAL)
                .timeLimiterConfiguration(
                        ResilienceConfiguration.TimeLimiterConfiguration.of()
                                .timeoutDuration(Duration.ofSeconds(30)))
                .bulkheadConfiguration(
                        ResilienceConfiguration.BulkheadConfiguration.of()
                                .maxConcurrentCalls(20));

    }

    public int createPrintTaskCommand(String docuId, String ifNonMatch, PrintTask printTask){
        return ResilienceDecorator.executeSupplier( ()-> createPrintTask(docuId,ifNonMatch,printTask), myResilienceConfig,e->{
            logger.warn("Print Task Failed", e);
            return 500;
        });
    }

    private int createPrintTask(String docuId, String ifNonMatch, PrintTask printTask) {
        Destination printDestination = DestinationAccessor.getDestination(printDestinationName);
        PrintTasksApi printTasksApi = new PrintTasksApi(printDestination);
        OpenApiResponse result = new OpenApiResponse(0);
        try {
            result = printTasksApi.qmApiV1RestPrintTasksItemIdPut(docuId, ifNonMatch, printTask);
        } catch (OpenApiRequestException e2) {
            e2.printStackTrace();
        }
        return result.getStatusCode();

    }

}
