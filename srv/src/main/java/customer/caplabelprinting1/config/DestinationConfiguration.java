package customer.caplabelprinting1.config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Profile;
import org.springframework.context.event.EventListener;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import com.sap.cloud.sdk.cloudplatform.connectivity.DefaultDestinationLoader;
import com.sap.cloud.sdk.cloudplatform.connectivity.DefaultHttpDestination;
import com.sap.cloud.sdk.cloudplatform.connectivity.DestinationAccessor;

@Component
@Profile("mocked")
@SpringBootConfiguration

public class DestinationConfiguration {
    @Autowired
    private Environment environment;
    @EventListener

    void applicationReady(ApplicationReadyEvent ready){
                Integer port = environment.getProperty("local.server.port",Integer.class);
    String destinationName = environment.getProperty("cds.remote.services.'[API_OUTBOUND_DELIVERY_SRV]'.destination.name",String.class);
    if(port != null&& destinationName != null){
        DefaultHttpDestination httpDestination = DefaultHttpDestination.builder("https://my300018-api.saps4hanacloud.cn").basicCredentials("SCPTRIAL", "Jl98765432198765432!").name(destinationName).build();
        DestinationAccessor.prependDestinationLoader(new DefaultDestinationLoader().registerDestination(httpDestination));
    }

    }

}
