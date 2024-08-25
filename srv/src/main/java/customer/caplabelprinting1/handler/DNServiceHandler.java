package customer.caplabelprinting1.handler;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.sap.cds.Result;
import com.sap.cds.ql.cqn.CqnAnalyzer;
import com.sap.cds.reflect.CdsModel;
import com.sap.cds.services.cds.CdsReadEventContext;
import com.sap.cds.services.handler.EventHandler;
import com.sap.cds.services.handler.annotations.On;
import com.sap.cds.services.handler.annotations.ServiceName;

import cds.gen.ObjPrintQ;
import cds.gen.ObjTemplate;
import cds.gen.api_outbound_delivery_srv.ApiOutboundDeliverySrv;
import cds.gen.api_outbound_delivery_srv.ApiOutboundDeliverySrv_;
import cds.gen.dnservice.DNService_;
import cds.gen.dnservice.GetPrintQsContext;
import cds.gen.dnservice.GetTemplatesContext;
import cds.gen.dnservice.OutbDeliveryHeader_;
import cds.gen.dnservice.OutbDeliveryItemRenderAndPrintContext;
import cds.gen.dnservice.OutbDeliveryItemRenderContext;
import cds.gen.dnservice.OutbDeliveryItem_;



@Component

@ServiceName(DNService_.CDS_NAME)

public class DNServiceHandler implements EventHandler {

    private final CqnAnalyzer cqnAnalyzer;
    private final ApiOutboundDeliverySrv dnapi;
    private final StoreFormApi storeFormApi;


    DNServiceHandler(@Qualifier(ApiOutboundDeliverySrv_.CDS_NAME) ApiOutboundDeliverySrv dnapi,CdsModel cdsModel) {
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


    @On
    public void getPrintQs(GetPrintQsContext context) {
        List<ObjPrintQ> aPrintQs = new ArrayList<>();
        ObjPrintQ printQ = ObjPrintQ.create();
        printQ.setQname("Plant1");
        aPrintQs.add(printQ);

        context.setResult(aPrintQs);

    }


    @On(entity = OutbDeliveryItem_.CDS_NAME)
    public void render(OutbDeliveryItemRenderContext context) {
        String sTemplate = context.getTemplate();

        byte result[];
        result = new byte[3] ;
        result[0] = 10;
        result[1] = 20;
        result[2] =30 ;
        context.setResult(result);
    }



    @On(entity = OutbDeliveryItem_.CDS_NAME)
    public void renderAndPrint(OutbDeliveryItemRenderAndPrintContext context) {
        String sTemplate = context.getTemplate();
        String sPrintQ = context.getPrintQ();

        context.setResult("Print task created");
    }



}
