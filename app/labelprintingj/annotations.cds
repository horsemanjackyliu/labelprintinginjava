using DNService as service from '../../srv/DNService';
annotate service.OutbDeliveryHeader with @(
    UI.FieldGroup #GeneratedGroup : {
        $Type : 'UI.FieldGroupType',
        Data : [
            {
                $Type : 'UI.DataField',
                Label : 'DeliveryDocument',
                Value : DeliveryDocument,
            },
            {
                $Type : 'UI.DataField',
                Label : 'DeliveryDate',
                Value : DeliveryDate,
            },
            {
                $Type : 'UI.DataField',
                Label : 'ActualDeliveryRoute',
                Value : ActualDeliveryRoute,
            },
            {
                $Type : 'UI.DataField',
                Label : 'ActualGoodsMovementDate',
                Value : ActualGoodsMovementDate,
            },
            {
                $Type : 'UI.DataField',
                Label : 'BillingDocumentDate',
                Value : BillingDocumentDate,
            },
            {
                $Type : 'UI.DataField',
                Label : 'BillOfLading',
                Value : BillOfLading,
            },
            {
                $Type : 'UI.DataField',
                Label : 'CreationDate',
                Value : CreationDate,
            },
            {
                $Type : 'UI.DataField',
                Label : 'CreatedByUser',
                Value : CreatedByUser,
            },
            {
                $Type : 'UI.DataField',
                Label : 'DocumentDate',
                Value : DocumentDate,
            },
            {
                $Type : 'UI.DataField',
                Label : 'HeaderGrossWeight',
                Value : HeaderGrossWeight,
            },
            {
                $Type : 'UI.DataField',
                Label : 'HeaderNetWeight',
                Value : HeaderNetWeight,
            },
            {
                $Type : 'UI.DataField',
                Label : 'HeaderVolume',
                Value : HeaderVolume,
            },
            {
                $Type : 'UI.DataField',
                Label : 'HeaderVolumeUnit',
                Value : HeaderVolumeUnit,
            },
            {
                $Type : 'UI.DataField',
                Label : 'HeaderWeightUnit',
                Value : HeaderWeightUnit,
            },
            {
                $Type : 'UI.DataField',
                Value : ActualGoodsMovementDate,
                Label : 'ActualGoodsMovementDate',
            },
            {
                $Type : 'UI.DataField',
                Value : BillingDocumentDate,
                Label : 'BillingDocumentDate',
            },
            {
                $Type : 'UI.DataField',
                Value : CreationDate,
                Label : 'CreationDate',
            },
            {
                $Type : 'UI.DataField',
                Value : DeliveryDate,
                Label : 'DeliveryDate',
            },
            {
                $Type : 'UI.DataField',
                Value : DocumentDate,
                Label : 'DocumentDate',
            },
        ],
    },
    UI.Facets : [
        {
            $Type : 'UI.ReferenceFacet',
            ID : 'GeneratedFacet1',
            Label : 'General Information',
            Target : '@UI.FieldGroup#GeneratedGroup',
        },
        {
            $Type : 'UI.ReferenceFacet',
            Label : 'Items',
            ID : 'Items',
            Target : 'Items/@UI.LineItem#Items',
        },
    ],
    UI.LineItem : [
        {
            $Type : 'UI.DataField',
            Label : 'DeliveryDocument',
            Value : DeliveryDocument,
        },
        {
            $Type : 'UI.DataField',
            Label : 'DeliveryDate',
            Value : DeliveryDate,
        },
        {
            $Type : 'UI.DataField',
            Label : 'ActualDeliveryRoute',
            Value : ActualDeliveryRoute,
        },
        {
            $Type : 'UI.DataField',
            Label : 'ActualGoodsMovementDate',
            Value : ActualGoodsMovementDate,
        },
        {
            $Type : 'UI.DataField',
            Label : 'BillingDocumentDate',
            Value : BillingDocumentDate,
        },
        {
            $Type : 'UI.DataField',
            Value : ActualGoodsMovementDate,
            Label : 'ActualGoodsMovementDate',
        },
        {
            $Type : 'UI.DataField',
            Value : BillingDocumentDate,
            Label : 'BillingDocumentDate',
        },
        {
            $Type : 'UI.DataField',
            Value : BillOfLading,
            Label : 'BillOfLading',
        },
        {
            $Type : 'UI.DataField',
            Value : DeliveryDate,
            Label : 'DeliveryDate',
        },
        {
            $Type : 'UI.DataField',
            Value : DocumentDate,
            Label : 'DocumentDate',
        },
        {
            $Type : 'UI.DataField',
            Value : HeaderGrossWeight,
            Label : 'HeaderGrossWeight',
        },
        {
            $Type : 'UI.DataField',
            Value : HeaderNetWeight,
            Label : 'HeaderNetWeight',
        },
        {
            $Type : 'UI.DataField',
            Value : HeaderVolume,
            Label : 'HeaderVolume',
        },
        {
            $Type : 'UI.DataField',
            Value : HeaderVolumeUnit,
            Label : 'HeaderVolumeUnit',
        },
        {
            $Type : 'UI.DataField',
            Value : HeaderWeightUnit,
            Label : 'HeaderWeightUnit',
        },
    ],
);

annotate service.OutbDeliveryItem with @(
    UI.LineItem #Items : [
        {
            $Type : 'UI.DataField',
            Value : DeliveryDocument,
            Label : 'DeliveryDocument',
        },
        {
            $Type : 'UI.DataField',
            Value : DeliveryDocumentItem,
            Label : 'DeliveryDocumentItem',
        },
        {
            $Type : 'UI.DataField',
            Value : DeliveryDocumentItemCategory,
            Label : 'DeliveryDocumentItemCategory',
        },
        {
            $Type : 'UI.DataField',
            Value : DeliveryDocumentItemText,
            Label : 'DeliveryDocumentItemText',
        },
        {
            $Type : 'UI.DataField',
            Value : DeliveryGroup,
            Label : 'DeliveryGroup',
        },
        {
            $Type : 'UI.DataField',
            Value : Division,
            Label : 'Division',
        },
        {
            $Type : 'UI.DataField',
            Value : DistributionChannel,
            Label : 'DistributionChannel',
        },
        {
            $Type : 'UI.DataField',
            Value : ActualDeliveredQtyInBaseUnit,
            Label : 'ActualDeliveredQtyInBaseUnit',
        },
        {
            $Type : 'UI.DataField',
            Value : ActualDeliveryQuantity,
            Label : 'ActualDeliveryQuantity',
        },
        {
            $Type : 'UI.DataField',
            Value : BaseUnit,
            Label : 'BaseUnit',
        },
        {
            $Type : 'UI.DataField',
            Value : Batch,
            Label : 'Batch',
        },
        {
            $Type : 'UI.DataField',
            Value : CreatedByUser,
            Label : 'CreatedByUser',
        },
        {
            $Type : 'UI.DataField',
            Value : CreationDate,
            Label : 'CreationDate',
        },
        {
            $Type : 'UI.DataField',
            Value : DeliveryQuantityUnit,
            Label : 'DeliveryQuantityUnit',
        },
        {
            $Type : 'UI.DataField',
            Value : GoodsMovementReasonCode,
            Label : 'GoodsMovementReasonCode',
        },
        {
            $Type : 'UI.DataField',
            Value : GoodsMovementStatus,
            Label : 'GoodsMovementStatus',
        },
        {
            $Type : 'UI.DataField',
            Value : InspectionLot,
            Label : 'InspectionLot',
        },
        {
            $Type : 'UI.DataField',
            Value : ItemGrossWeight,
            Label : 'ItemGrossWeight',
        },
        {
            $Type : 'UI.DataField',
            Value : ItemNetWeight,
            Label : 'ItemNetWeight',
        },
        {
            $Type : 'UI.DataField',
            Value : ItemVolume,
            Label : 'ItemVolume',
        },
        {
            $Type : 'UI.DataField',
            Value : ItemVolumeUnit,
            Label : 'ItemVolumeUnit',
        },
        {
            $Type : 'UI.DataField',
            Value : ItemWeightUnit,
            Label : 'ItemWeightUnit',
        },
        {
            $Type : 'UI.DataField',
            Value : ManufactureDate,
            Label : 'ManufactureDate',
        },
        {
            $Type : 'UI.DataField',
            Value : Material,
            Label : 'Material',
        },
        {
            $Type : 'UI.DataField',
            Value : MaterialByCustomer,
            Label : 'MaterialByCustomer',
        },
        {
            $Type : 'UI.DataField',
            Value : ProfitCenter,
            Label : 'ProfitCenter',
        },
    ],
    UI.Facets : [
        {
            $Type : 'UI.ReferenceFacet',
            Label : 'ItemDetails',
            ID : 'ItemDetails',
            Target : '@UI.FieldGroup#ItemDetails',
        },
    ],
    UI.FieldGroup #ItemDetails : {
        $Type : 'UI.FieldGroupType',
        Data : [
            {
                $Type : 'UI.DataField',
                Value : DeliveryDocument,
                Label : 'DeliveryDocument',
            },
            {
                $Type : 'UI.DataField',
                Value : DeliveryDocumentItem,
                Label : 'DeliveryDocumentItem',
            },
            {
                $Type : 'UI.DataField',
                Value : DeliveryDocumentItemCategory,
                Label : 'DeliveryDocumentItemCategory',
            },
            {
                $Type : 'UI.DataField',
                Value : DeliveryDocumentItemText,
                Label : 'DeliveryDocumentItemText',
            },
            {
                $Type : 'UI.DataField',
                Value : DeliveryGroup,
                Label : 'DeliveryGroup',
            },
            {
                $Type : 'UI.DataField',
                Value : DeliveryQuantityUnit,
                Label : 'DeliveryQuantityUnit',
            },
            {
                $Type : 'UI.DataField',
                Value : DistributionChannel,
                Label : 'DistributionChannel',
            },
            {
                $Type : 'UI.DataField',
                Value : Division,
                Label : 'Division',
            },
            {
                $Type : 'UI.DataField',
                Value : GoodsMovementReasonCode,
                Label : 'GoodsMovementReasonCode',
            },
            {
                $Type : 'UI.DataField',
                Value : GoodsMovementStatus,
                Label : 'GoodsMovementStatus',
            },
            {
                $Type : 'UI.DataField',
                Value : GoodsMovementType,
                Label : 'GoodsMovementType',
            },
            {
                $Type : 'UI.DataField',
                Value : InspectionLot,
                Label : 'InspectionLot',
            },
            {
                $Type : 'UI.DataField',
                Value : ItemGrossWeight,
                Label : 'ItemGrossWeight',
            },
            {
                $Type : 'UI.DataField',
                Value : ItemNetWeight,
                Label : 'ItemNetWeight',
            },
            {
                $Type : 'UI.DataField',
                Value : ItemVolume,
                Label : 'ItemVolume',
            },
            {
                $Type : 'UI.DataField',
                Value : ItemVolumeUnit,
                Label : 'ItemVolumeUnit',
            },
            {
                $Type : 'UI.DataField',
                Value : ItemWeightUnit,
                Label : 'ItemWeightUnit',
            },
            {
                $Type : 'UI.DataField',
                Value : ManufactureDate,
                Label : 'ManufactureDate',
            },
            {
                $Type : 'UI.DataField',
                Value : Material,
                Label : 'Material',
            },
            {
                $Type : 'UI.DataField',
                Value : MaterialByCustomer,
                Label : 'MaterialByCustomer',
            },
            {
                $Type : 'UI.DataField',
                Value : NumberOfSerialNumbers,
                Label : 'NumberOfSerialNumbers',
            },
            {
                $Type : 'UI.DataField',
                Value : OrderID,
                Label : 'OrderID',
            },
            {
                $Type : 'UI.DataField',
                Value : OrderItem,
                Label : 'OrderItem',
            },
            {
                $Type : 'UI.DataField',
                Value : PackingStatus,
                Label : 'PackingStatus',
            },
            {
                $Type : 'UI.DataField',
                Value : PickingStatus,
                Label : 'PickingStatus',
            },
            {
                $Type : 'UI.DataField',
                Value : ProfitCenter,
                Label : 'ProfitCenter',
            },
            {
                $Type : 'UI.DataField',
                Value : ActualDeliveredQtyInBaseUnit,
                Label : 'ActualDeliveredQtyInBaseUnit',
            },
            {
                $Type : 'UI.DataField',
                Value : ActualDeliveryQuantity,
                Label : 'ActualDeliveryQuantity',
            },
            {
                $Type : 'UI.DataField',
                Value : BaseUnit,
                Label : 'BaseUnit',
            },
            {
                $Type : 'UI.DataField',
                Value : Batch,
                Label : 'Batch',
            },
            {
                $Type : 'UI.DataField',
                Value : CreatedByUser,
                Label : 'CreatedByUser',
            },
            {
                $Type : 'UI.DataField',
                Value : CreationDate,
                Label : 'CreationDate',
            },
        ],
    },
);

