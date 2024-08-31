

### step 1, Run the following command to generate a cap project .


```bash

cds init --add java --java:mvn persistence=false,archetypeVersion=3.0.0

```
### step 2, Run the following command to import API .

```bash
cds import srv/external/API_OUTBOUND_DELIVERY_SRV.edmx --as cds
```

### step 3, Define Service and Entity .
srv/DNService.cds

```

using { API_OUTBOUND_DELIVERY_SRV as dnapi } from './external/API_OUTBOUND_DELIVERY_SRV';

service DNService {

    @readonly
    entity OutbDeliveryHeader as projection on dnapi.A_OutbDeliveryHeader{
            key DeliveryDocument,
                DeliveryDate,
                ActualDeliveryRoute,
                ActualGoodsMovementDate,
                BillingDocumentDate,
                BillOfLading,
                CreationDate,
                CreatedByUser,
                DocumentDate,
                HeaderGrossWeight,
                HeaderNetWeight,
                HeaderVolume,
                HeaderVolumeUnit,
                HeaderWeightUnit,
                to_DeliveryDocumentItem  as Items  : redirected to  OutbDeliveryItem
    };
    @readonly
    entity OutbDeliveryItem as projection on dnapi.A_OutbDeliveryItem{
            key DeliveryDocument,
            key DeliveryDocumentItem,
                ActualDeliveredQtyInBaseUnit,
                ActualDeliveryQuantity,
                BaseUnit,
                Batch,
                CreatedByUser,
                CreationDate,
                DeliveryDocumentItemCategory,
                DeliveryGroup,
                DeliveryQuantityUnit,
                Division,
                GoodsMovementReasonCode,
                GoodsMovementStatus,
                GoodsMovementType,
                InspectionLot,
                ItemGrossWeight,
                ItemNetWeight,
                ItemVolume,
                ItemVolumeUnit,
                ItemWeightUnit,
                ManufactureDate,
                Material,
                MaterialByCustomer,
                NumberOfSerialNumbers,
                OrderID,
                OrderItem,
                PackingStatus,
                PickingStatus,
                ProfitCenter,
                DeliveryDocumentItemText,
                DistributionChannel
}actions{
            function render(template : String)                          returns LargeBinary;            
            function renderAndPrint(template : String, printQ : String) returns String;
            function test() returns array of String;

};
    function getTemplates()                                               returns array of ObjTemplate;

    function getPrintQs()                                                 returns array of ObjPrintQ;

    function print(pdf : LargeString, printQ : String, fileName : String) returns String;
    

}


define type ObjTemplate {
  name : String;
}
define type ObjPrintQ {
  qname : String;
  qdescription: String;
  qstatus: String(1);
  qformatDescript: String;
  cleanupPrd: Integer;
  techUserName: String;
  creator: String;
  createdOn: Timestamp;
  profileEnabled: Boolean;
  locationId:String;
  locationIdType:String;


}

// annotate dnservice with @(requires: 'Viewer') ;




```


### step 5, Adjust the following file .

srv/src/main/resources/application.yaml


```yaml
---
spring:
  profiles:
    active: mocked

---
spring:
  config.activate.on-profile: default
cds:
  data-source.auto-config.enabled: false
  remote.services:
    '[API_OUTBOUND_DELIVERY_SRV]':
      type: "odata-v2"
      http:
        suffix: "/sap/opu/odata/sap/"
      destination:
        name: "O5P"
logging:
  level:
    root: info

---
spring:
  config.activate.on-profile: mocked
  devtoots.add-properties: true
cds:
  data-source.auto-config.enabled: false
  remote.services:
    '[API_OUTBOUND_DELIVERY_SRV]':
      type: "odata-v2"
      http:
        suffix: "/sap/opu/odata/sap/"
      destination:
        name: "O5P"
logging:
  level:
    root: info
    web: DEBUG


```


### step 6, Adjust pom file .


srv/pom.xml

```xml

		<dependency>
			<groupId>com.sap.cds</groupId>
			<artifactId>cds-feature-remote-odata</artifactId>
			<scope>runtime</scope>
		</dependency>


		<!-- CLOUD SDK dependencies -->
		<dependency>
			<groupId>com.sap.cloud.sdk.cloudplatform</groupId>
			<artifactId>resilience</artifactId>
			<version>5.10.0</version>
		</dependency>

		<dependency>
			<groupId>com.sap.cloud.sdk</groupId>
			<artifactId>sdk-core</artifactId>
			<version>5.10.0</version>
		</dependency>

		<dependency>
			<groupId>com.sap.cloud.sdk.cloudplatform</groupId>
			<artifactId>connectivity-apache-httpclient4</artifactId>
			<version>5.10.0</version>
		</dependency>


```


### step 7, Add destination configration class .


srv/src/main/java/customer/caplabelprinting1/config/DestinationConfiguration.java

```java
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



```


### step 8, Add handler class .

srv/src/main/java/customer/caplabelprinting1/handler/DNServiceHandler.java

```java

package customer.caplabelprinting1.handler;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.sap.cds.Result;
import com.sap.cds.ql.cqn.CqnAnalyzer;
import com.sap.cds.reflect.CdsModel;
import com.sap.cds.services.cds.CdsReadEventContext;
import com.sap.cds.services.handler.EventHandler;
import com.sap.cds.services.handler.annotations.On;
import com.sap.cds.services.handler.annotations.ServiceName;

import cds.gen.ObjTemplate;
import cds.gen.api_outbound_delivery_srv.ApiOutboundDeliverySrv;
import cds.gen.api_outbound_delivery_srv.ApiOutboundDeliverySrv_;
import cds.gen.dnservice.DNService_;
import cds.gen.dnservice.GetTemplatesContext;
import cds.gen.dnservice.OutbDeliveryHeader_;
import cds.gen.dnservice.OutbDeliveryItemRenderContext;
import cds.gen.dnservice.OutbDeliveryItem_;

@Component

@ServiceName(DNService_.CDS_NAME)

public class DNServiceHandler implements EventHandler {

    private final CqnAnalyzer cqnAnalyzer;
    private final ApiOutboundDeliverySrv dnapi;

    DNServiceHandler(@Qualifier(ApiOutboundDeliverySrv_.CDS_NAME) ApiOutboundDeliverySrv dnapi, CdsModel cdsModel) {
        this.dnapi = dnapi;
        this.cqnAnalyzer = CqnAnalyzer.create(cdsModel);
    }

    @On(entity = OutbDeliveryHeader_.CDS_NAME)
    Result readOutbDeliveryHeaders(CdsReadEventContext context) {
        return (Result) dnapi.run(context.getCqn());

    }

    @On(entity = OutbDeliveryItem_.CDS_NAME)
    Result readOutbDeliveryItems(CdsReadEventContext context) {
        return (Result) dnapi.run(context.getCqn());
    }

    @On
    public void getTemplates(GetTemplatesContext context) {
        List<ObjTemplate> aTemplates = new ArrayList<>();
        ObjTemplate template = ObjTemplate.create();
        template.setName("Labelprint/Labelprint");
        aTemplates.add(template);

        context.setResult(aTemplates);

    }


    // @On(entity = OutbDeliveryItem_.CDS_NAME)
    // public void render(OutbDeliveryItemRenderContext context) {

    //     context.setResult(null);
    // }



}


```

cds add mta,xsuaa,approuter --for production

```
<dependency>
    <groupId>com.sap.cds</groupId>
    <artifactId>cds-starter-cloudfoundry</artifactId>
</dependency>
```


mbt build -t gen --mtar mta.mtar

cf deploy gen/mta.mtar