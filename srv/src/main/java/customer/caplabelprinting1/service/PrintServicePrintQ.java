package customer.caplabelprinting1.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.time.Duration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sap.cloud.sdk.cloudplatform.connectivity.Destination;
import com.sap.cloud.sdk.cloudplatform.connectivity.DestinationAccessor;
import com.sap.cloud.sdk.cloudplatform.resilience.ResilienceConfiguration;
import com.sap.cloud.sdk.cloudplatform.resilience.ResilienceDecorator;
import com.sap.cloud.sdk.cloudplatform.resilience.ResilienceIsolationMode;

import cds.gen.ObjPrintQ;
import customer.caplabelprinting1.btpservice.print.api.QueuesApi;
import customer.caplabelprinting1.btpservice.print.model.PrintQueueDTO;

public class PrintServicePrintQ {

    private static final Logger logger = LoggerFactory.getLogger(PrintServicePrintQ.class);

    private final String printDestinationName = "printServiceApi";
    private final ResilienceConfiguration myResilienceConfig;

    public PrintServicePrintQ() {

        this.myResilienceConfig = ResilienceConfiguration.of(QueuesApi.class)
                .isolationMode(ResilienceIsolationMode.TENANT_AND_USER_OPTIONAL)
                .timeLimiterConfiguration(
                        ResilienceConfiguration.TimeLimiterConfiguration.of()
                                .timeoutDuration(Duration.ofSeconds(30)))
                .bulkheadConfiguration(
                        ResilienceConfiguration.BulkheadConfiguration.of()
                                .maxConcurrentCalls(20));

    }


    public List<ObjPrintQ> getPrintQsCommand(){

        return ResilienceDecorator.executeSupplier(this::getPrintQs, myResilienceConfig,e->{
            logger.warn("Getting PrintQS Failed", e);
            return Collections.emptyList();
        });
    }

    private List<ObjPrintQ> getPrintQs(){

        Destination printDestination = DestinationAccessor.getDestination(printDestinationName);
        QueuesApi queuesApi = new QueuesApi(printDestination);
        List<ObjPrintQ> aPrintQs = new ArrayList<>();
        Integer i;
        i = 0;
        List<PrintQueueDTO> printQs = queuesApi.qmApiV1RestQueuesGet();

        logger.info(printQs.toString());
        logger.info("Print Qs get successfully");
        for (PrintQueueDTO printQ : printQs) {
            aPrintQs.add(ObjPrintQ.create());
            aPrintQs.get(i).setQname(printQ.getQname());
            aPrintQs.get(i).setQformatDescript(printQ.getQdescription());
            aPrintQs.get(i).setCreator(printQ.getCreator());
            aPrintQs.get(i).setQstatus(printQ.getQstatus());
            i = i + 1;
        }
        return aPrintQs;




    }

}
