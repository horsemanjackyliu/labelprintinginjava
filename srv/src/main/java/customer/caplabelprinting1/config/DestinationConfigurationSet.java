package customer.caplabelprinting1.config;

import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.codec.binary.Base64;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.core.env.Environment;
// import org.springframework.security.oauth2.client.OAuth2AuthorizedClient;
// import org.springframework.security.oauth2.client.OAuth2AuthorizedClientService;
// import org.springframework.security.oauth2.client.annotation.RegisteredOAuth2AuthorizedClient;
// import org.springframework.security.oauth2.core.OAuth2AccessToken;

import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import com.sap.cloud.sdk.cloudplatform.connectivity.AuthenticationType;
import com.sap.cloud.sdk.cloudplatform.connectivity.DefaultDestinationLoader;
import com.sap.cloud.sdk.cloudplatform.connectivity.DefaultHttpDestination;
// import com.sap.cloud.sdk.cloudplatform.connectivity.Destination;
import com.sap.cloud.sdk.cloudplatform.connectivity.DestinationAccessor;
// import com.sap.cloud.sdk.cloudplatform.connectivity.OAuth2DestinationBuilder;
// import com.sap.cloud.sdk.cloudplatform.connectivity.SecurityConfigurationStrategy;
// import com.sap.cloud.sdk.cloudplatform.connectivity.DestinationConfiguration;
// import com.sap.cloud.sdk.cloudplatform.connectivity.HttpDestinationProperties;
// import com.sap.cloud.sdk.cloudplatform.connectivity.DestinationServiceV1Response.DestinationAuthToken;
import org.springframework.http.*;

@Configuration
@Order(1)
@Profile("hybrid")


public class DestinationConfigurationSet {
    @Autowired
    private Environment environment;

    private final static Logger logger = LoggerFactory.getLogger(DestinationConfigurationSet.class);

    
  

    String adsTokenUrl ="https://apjcoe-x66183k9.authentication.eu10.hana.ondemand.com/oauth/token?grant_type=client_credentials";
    String adsClientId = "sb-12d96d9b-38ed-4a85-ae9f-24219994f424!b114925|ads-xsappname!b102452";
    String adsClientSecret = "WJzgMzvNIDjJIJFy7D4G18q2tNM=";
    String adsUsername = "sb-12d96d9b-38ed-4a85-ae9f-24219994f424!b114925|ads-xsappname!b102452";
    String adsPassword = "WJzgMzvNIDjJIJFy7D4G18q2tNM=";

    @EventListener


    void applicationReady(ApplicationReadyEvent ready){
                Integer port = environment.getProperty("local.server.port",Integer.class);
    String destinationName = environment.getProperty("cds.remote.services.'[API_OUTBOUND_DELIVERY_SRV]'.destination.name",String.class);
    if(port != null&& destinationName != null){
        DefaultHttpDestination httpDestination = DefaultHttpDestination.builder("https://my300018-api.saps4hanacloud.cn").basicCredentials("SCPTRIAL", "Jl98765432198765432!").name(destinationName).build() ;
        DestinationAccessor.prependDestinationLoader(new DefaultDestinationLoader().registerDestination(httpDestination));
        
    
    }

    String adsDestinationName = "ads-rest-api";
    String printDestinationName = "printServiceApi";

    String adsUrl = "https://adsrestapi-formsprocessing.cfapps.eu10.hana.ondemand.com/";
    String adsTokenUrl ="https://apjcoe-x66183k9.authentication.eu10.hana.ondemand.com/oauth/token?grant_type=client_credentials";
    String adsClientId = "sb-12d96d9b-38ed-4a85-ae9f-24219994f424!b114925|ads-xsappname!b102452";
    String adsClientSecret = "WJzgMzvNIDjJIJFy7D4G18q2tNM=";
    String adsUsername = "sb-12d96d9b-38ed-4a85-ae9f-24219994f424!b114925|ads-xsappname!b102452";
    String adsPassword = "WJzgMzvNIDjJIJFy7D4G18q2tNM=";

    String printUrl = "https://api.eu10.print.services.sap";
    String printTokenUrl = "https://apjcoe-x66183k9.authentication.eu10.hana.ondemand.com/oauth/token?grant_type=client_credentials";
    String printClientId = "sb-6aa6869e-be85-4b6f-b234-3d24a060174e!b114925|print-app!b46384";
    String printClientSecret = "Dwj1xCNNp3tgMAqcCEcLPsj8LMo=";
    String printUsername = "sb-6aa6869e-be85-4b6f-b234-3d24a060174e!b114925|print-app!b46384";
    String printPassword = "Dwj1xCNNp3tgMAqcCEcLPsj8LMo=";
    DefaultHttpDestination adsHttpDestination = DefaultHttpDestination.builder(adsUrl).authenticationType(AuthenticationType.OAUTH2_JWT_BEARER).name(adsDestinationName)
    .header("Authorization", getToken(adsClientId,adsClientSecret,adsTokenUrl))
    .build();

    DestinationAccessor.prependDestinationLoader(new DefaultDestinationLoader().registerDestination(adsHttpDestination));
    DefaultHttpDestination printHttpDestination = DefaultHttpDestination.builder(printUrl).authenticationType(AuthenticationType.OAUTH2_JWT_BEARER).name(printDestinationName)
    .header("Authorization", getToken(printClientId,printClientSecret,printTokenUrl))
    .build();
    DestinationAccessor.prependDestinationLoader(new DefaultDestinationLoader().registerDestination(printHttpDestination));
    }

    public String getToken(String clientId,String clientSecret,String tokenUrl) {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);

        MultiValueMap<String, String> body = new LinkedMultiValueMap<>();
        body.add("grant_type", "client_credentials");
        body.add("client_id", clientId);
        body.add("client_secret", clientSecret);
        ResponseEntity<OAuthTokenResponse> response = restTemplate.postForEntity(tokenUrl, new HttpEntity<>(body, headers), OAuthTokenResponse.class);
       String token = "Bear "+ response.getBody().getaccess_token();
    //    logger.debug(token);
       logger.info(token);
        return token;        
    }

}
