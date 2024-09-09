sap.ui.require(
    [
        'sap/fe/test/JourneyRunner',
        'ns/labelprintingj/test/integration/FirstJourney',
		'ns/labelprintingj/test/integration/pages/OutbDeliveryHeaderList',
		'ns/labelprintingj/test/integration/pages/OutbDeliveryHeaderObjectPage',
		'ns/labelprintingj/test/integration/pages/OutbDeliveryItemObjectPage'
    ],
    function(JourneyRunner, opaJourney, OutbDeliveryHeaderList, OutbDeliveryHeaderObjectPage, OutbDeliveryItemObjectPage) {
        'use strict';
        var JourneyRunner = new JourneyRunner({
            // start index.html in web folder
            launchUrl: sap.ui.require.toUrl('ns/labelprintingj') + '/index.html'
        });

       
        JourneyRunner.run(
            {
                pages: { 
					onTheOutbDeliveryHeaderList: OutbDeliveryHeaderList,
					onTheOutbDeliveryHeaderObjectPage: OutbDeliveryHeaderObjectPage,
					onTheOutbDeliveryItemObjectPage: OutbDeliveryItemObjectPage
                }
            },
            opaJourney.run
        );
    }
);