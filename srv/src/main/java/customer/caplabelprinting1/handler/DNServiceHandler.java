package customer.caplabelprinting1.handler;

import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Base64;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import com.sap.cds.Result;
import com.sap.cds.ql.cqn.CqnAnalyzer;
import com.sap.cds.reflect.CdsModel;
// import com.sap.cds.services.authentication.AuthenticationInfo;
import com.sap.cds.services.cds.CdsReadEventContext;
import com.sap.cds.services.handler.EventHandler;
import com.sap.cds.services.handler.annotations.On;
import com.sap.cds.services.handler.annotations.ServiceName;
// import com.sap.cloud.sdk.cloudplatform.connectivity.DefaultHttpDestination;
import com.sap.cloud.sdk.cloudplatform.connectivity.Destination;
import com.sap.cloud.sdk.cloudplatform.connectivity.DestinationAccessor;
import com.sap.cloud.sdk.services.openapi.core.OpenApiRequestException;

import cds.gen.ObjPrintQ;
import cds.gen.ObjTemplate;
import cds.gen.api_outbound_delivery_srv.ApiOutboundDeliverySrv;
import cds.gen.api_outbound_delivery_srv.ApiOutboundDeliverySrv_;
import cds.gen.dnservice.DNService;
import cds.gen.dnservice.DNService_;
import cds.gen.dnservice.GetPrintQsContext;
import cds.gen.dnservice.GetTemplatesContext;
import cds.gen.dnservice.OutbDeliveryHeader_;
import cds.gen.dnservice.OutbDeliveryItem;
import cds.gen.dnservice.OutbDeliveryItemRenderAndPrintContext;
import cds.gen.dnservice.OutbDeliveryItemRenderContext;
import cds.gen.dnservice.OutbDeliveryItem_;
import cds.gen.dnservice.PrintContext;
import customer.caplabelprinting1.btpservice.ads.api.AdsRenderRequestApi;
import customer.caplabelprinting1.btpservice.ads.api.StoreFormsApi;
import customer.caplabelprinting1.btpservice.ads.model.FileOutput;
import customer.caplabelprinting1.btpservice.ads.model.FormStoreOutput;
import customer.caplabelprinting1.btpservice.ads.model.RenderInput;
import customer.caplabelprinting1.btpservice.ads.model.TemplateStoreOutput;
import customer.caplabelprinting1.btpservice.ads.model.RenderInput.EmbedFontEnum;
import customer.caplabelprinting1.btpservice.ads.model.RenderInput.FormTypeEnum;
import customer.caplabelprinting1.btpservice.ads.model.RenderInput.TaggedPdfEnum;
import customer.caplabelprinting1.btpservice.print.api.DocumentsApi;
import customer.caplabelprinting1.btpservice.print.api.PrintTasksApi;
import customer.caplabelprinting1.btpservice.print.api.QueuesApi;
import customer.caplabelprinting1.btpservice.print.model.PrintContent;
import customer.caplabelprinting1.btpservice.print.model.PrintQueueDTO;
import customer.caplabelprinting1.btpservice.print.model.PrintTask;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component

@ServiceName(DNService_.CDS_NAME)

public class DNServiceHandler implements EventHandler {

    private final static Logger logger = LoggerFactory.getLogger(DNServiceHandler.class);

    private final CqnAnalyzer cqnAnalyzer;
    private final ApiOutboundDeliverySrv dnapi;
    private final Destination adsDestination;
    private final Destination printDestination;
    private final QueuesApi queuesApi;
    private final StoreFormsApi storeFormApi;
    private final DocumentsApi documentsApi;
    private final PrintTasksApi printTasksApi;
    private final DocumentBuilderFactory factory;
    private final AdsRenderRequestApi renderApi;
    // private final DocumentBuilder builder;
    // private final QueuesApi queuesApi;

    DNServiceHandler(@Qualifier(ApiOutboundDeliverySrv_.CDS_NAME) ApiOutboundDeliverySrv dnapi, CdsModel cdsModel) {
        this.dnapi = dnapi;
        this.cqnAnalyzer = CqnAnalyzer.create(cdsModel);
        this.adsDestination = DestinationAccessor.getDestination("ads-rest-api");
        this.printDestination = DestinationAccessor.getDestination("printServiceApi");
        this.queuesApi = new QueuesApi(printDestination);
        this.storeFormApi = new StoreFormsApi(adsDestination);
        this.documentsApi = new DocumentsApi(printDestination);
        this.printTasksApi = new PrintTasksApi(printDestination);
        this.factory = DocumentBuilderFactory.newInstance();
        this.renderApi = new AdsRenderRequestApi(adsDestination);
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
        Integer i;
        i = 0;

        List<FormStoreOutput> formsOutput = this.storeFormApi.formsGet();

        for (FormStoreOutput form : formsOutput) {
            for (TemplateStoreOutput template : form.getTemplates()) {
                aTemplates.add(ObjTemplate.create());
                aTemplates.get(i).setName(form.getFormName().concat("/").concat(template.getTemplateName()));
                i = i + 1;
            }
        }
        context.setResult(aTemplates);
    }

    @On
    public void getPrintQs(GetPrintQsContext context) {
        List<ObjPrintQ> aPrintQs = new ArrayList<>();
        Integer i;
        i = 0;
        List<PrintQueueDTO> printQs = this.queuesApi.qmApiV1RestQueuesGet();
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
        context.setResult(aPrintQs);

    }

    @On
    public void print(PrintContext context) {

        String userId = context.getUserInfo().getName();
        String pdfInB64 = context.getPdf();
        String printQ = context.getPrintQ();
        logger.info(printQ);
        String filename = context.getFileName();
        logger.info(filename);

        byte[] decodedBytes = Base64.getDecoder().decode(pdfInB64);

        String docuId = "";
        File file = new File(filename);
        try {
            Files.write(Paths.get(filename), decodedBytes);
        } catch (IOException e) {
            context.setResult("File Creation in Error");
            // logger.info("file write with error");
            // logger.info(e.getMessage());
            // e.printStackTrace();
            
        }

        try {
            docuId = documentsApi.dmApiV1RestPrintDocumentsPost("*", false, file);
            // logger.info("document uploaded");            
            // logger.info(docuId);
        } catch (OpenApiRequestException apiException) {
            context.setResult("Document upload failed");
            // logger.info("Document upload failed");
            // apiException.printStackTrace();
            
        }
        file.delete();

        if (docuId != "") {

            PrintTask printTask = new PrintTask();
            printTask.setNumberOfCopies(1);
            printTask.setQname(printQ);
            printTask.setUsername(userId);
            PrintContent printContent = new PrintContent();
            printContent.documentName(filename);
            printContent.setObjectKey(docuId);
            printTask.addPrintContentsItem(printContent);
            try {
                printTasksApi.qmApiV1RestPrintTasksItemIdPut(docuId, "*", printTask);
                context.setResult("Print task created successfully");

            } catch (OpenApiRequestException e1) {
                context.setResult("print task creation failed");
                // e1.printStackTrace();
               
            }
            ;

        }else{
            context.setResult("Document ID is null");
        }
    }

    @On(entity = OutbDeliveryItem_.CDS_NAME)
    public void render(OutbDeliveryItemRenderContext context) {
        // logger.info(context.getTemplate());
        String sTemplate = context.getTemplate().replace("|", "/");
        // logger.info(sTemplate);

        String deliverDoc = (String) this.cqnAnalyzer.analyze(context.getCqn()).targetKeys()
                .get(OutbDeliveryItem.DELIVERY_DOCUMENT);
        logger.info(deliverDoc);
        String deliverItem = (String) this.cqnAnalyzer.analyze(context.getCqn()).targetKeys()
                .get(OutbDeliveryItem.DELIVERY_DOCUMENT_ITEM);

        Result oItem = dnapi.run(context.getCqn());
        OutbDeliveryItem dnItem = oItem.first().get().as(OutbDeliveryItem.class);

        String sMaterial = dnItem.getMaterial();
        String sQuantity = dnItem.getActualDeliveryQuantity().toString();
        String sPackageS = dnItem.getNumberOfSerialNumbers().toString();

        // logger.info(this.cqnAnalyzer.analyze(context.getCqn()).toString());

        String qRcodeS = deliverDoc.concat("|").concat(deliverItem).concat("|").concat(sMaterial)
                .concat("|").concat(sQuantity).concat("|").concat(sPackageS);

        String sPrintContent = "";

        try {
            DocumentBuilder builder = factory.newDocumentBuilder();

            Document document = builder.newDocument();

            Element form = document.createElement("form1");
            document.appendChild(form);

            Element labelForm = document.createElement("LabelForm");
            form.appendChild(labelForm);

            Element deliveryId = document.createElement("DeliveryId");
            deliveryId.appendChild(document.createTextNode(deliverDoc));
            labelForm.appendChild(deliveryId);

            Element position = document.createElement("Position");
            position.appendChild(document.createTextNode(deliverItem));
            labelForm.appendChild(position);

            Element materialNo = document.createElement("MaterialNo");
            materialNo.appendChild(document.createTextNode(sMaterial));
            labelForm.appendChild(materialNo);

            Element quantity = document.createElement("Quantity");
            quantity.appendChild(document.createTextNode(sQuantity));
            labelForm.appendChild(quantity);

            Element sPackage = document.createElement("Package");
            sPackage.appendChild(document.createTextNode(sPackageS));
            labelForm.appendChild(sPackage);

            Element qRCode = document.createElement("QRCode");
            qRCode.appendChild(document.createTextNode(qRcodeS));
            labelForm.appendChild(qRCode);
            DOMSource source = new DOMSource(document);
            // sPrintContent = source.getNode("form1").toString();
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            StringWriter writer = new StringWriter();
            transformer.transform(source, new StreamResult(writer));
            sPrintContent = writer.getBuffer().toString();
            // logger.info(sPrintContent);

        } catch (Exception e) {
            logger.info("error happened in xml build");
            e.printStackTrace();
        }
        String sPrintContentInB64 = Base64.getEncoder().encodeToString(sPrintContent.getBytes());
        // logger.info(sPrintContentInB64);

        RenderInput renderInput = new RenderInput();
        renderInput.setXdpTemplate(sTemplate);
        renderInput.setXmlData(sPrintContentInB64);
        renderInput.setFormLocale("en_US");
        renderInput.setFormType(FormTypeEnum.PRINT);
        renderInput.setTaggedPdf(TaggedPdfEnum.NUMBER_1);
        renderInput.setEmbedFont(EmbedFontEnum.NUMBER_1);
        FileOutput renderResult = renderApi.renderingPDFPost(renderInput, "storageName", 2);
        context.setResult(renderResult.getFileContent());
    }

    @On(entity = OutbDeliveryItem_.CDS_NAME)
    public void renderAndPrint(OutbDeliveryItemRenderAndPrintContext context) {

        String sTemplate = context.getTemplate();
        String sPrintQ = context.getPrintQ();

        context.setResult("Print task created");
    }

}
