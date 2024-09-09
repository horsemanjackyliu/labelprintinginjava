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
            function render(template : String)                          returns LargeString;            
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

 annotate DNService with @(requires: 'Viewer') ;
