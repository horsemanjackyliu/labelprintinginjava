package customer.caplabelprinting1.service;

import java.time.Duration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sap.cloud.sdk.cloudplatform.connectivity.Destination;
import com.sap.cloud.sdk.cloudplatform.connectivity.DestinationAccessor;
import com.sap.cloud.sdk.cloudplatform.resilience.ResilienceConfiguration;
import com.sap.cloud.sdk.cloudplatform.resilience.ResilienceDecorator;
import com.sap.cloud.sdk.cloudplatform.resilience.ResilienceIsolationMode;

import customer.caplabelprinting1.btpservice.ads.api.AdsRenderRequestApi;
import customer.caplabelprinting1.btpservice.ads.model.FileOutput;
import customer.caplabelprinting1.btpservice.ads.model.RenderInput;

public class AdsServiceRender {

    private static final Logger logger = LoggerFactory.getLogger(AdsServiceRender.class);

    private final String adsDestinationName = "ads-rest-api";

    private final ResilienceConfiguration myResilienceConfig;

    public AdsServiceRender(){

        this.myResilienceConfig =  ResilienceConfiguration.of(AdsRenderRequestApi.class)
        .isolationMode(ResilienceIsolationMode.TENANT_AND_USER_OPTIONAL)
        .timeLimiterConfiguration(
                ResilienceConfiguration.TimeLimiterConfiguration.of()
                        .timeoutDuration(Duration.ofSeconds(30)))
        .bulkheadConfiguration(
                ResilienceConfiguration.BulkheadConfiguration.of()
                        .maxConcurrentCalls(20));
    }


    public FileOutput renderCommand(RenderInput renderInput,String templateSource,Integer traceLevel){
        return ResilienceDecorator.executeSupplier( ()-> render(renderInput,templateSource,traceLevel), myResilienceConfig,e->{
                logger.warn("Render API Call Failed", e);
                return new FileOutput();
            });
    }




    private FileOutput render(RenderInput renderInput,String templateSource,Integer traceLevel){

        Destination adsDestination = DestinationAccessor.getDestination(this.adsDestinationName);
        AdsRenderRequestApi adsRenderRequestApi = new AdsRenderRequestApi(adsDestination); 
        FileOutput renderResult = adsRenderRequestApi.renderingPDFPost(renderInput, "storageName", traceLevel);
        return renderResult;

        
    }

}
