package com.cdmx.informations.extractor.controller;


import com.cdmx.informations.extractor.commons.Utilities;
import com.cdmx.informations.extractor.consumers.LocationData;
import com.cdmx.informations.extractor.consumers.Records;
import com.cdmx.informations.extractor.interfaceServices.IMetrobusDataServices;
import com.cdmx.informations.extractor.model.MetrobusData;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.sql.Timestamp;
@ConfigurationProperties("app")
@Slf4j
@Service
public class ExtractorController {



    @Autowired private IMetrobusDataServices iMetrobusDataServices;


    public void getDataLocation(RestTemplate restTemplate){



        LocationData locationData = restTemplate.getForObject("https://datos.cdmx.gob.mx/api/records/1.0/search/?dataset=prueba_fetchdata_metrobus&q=&rows=11&start=0",LocationData.class);
        log.info(locationData.toString());
        int totalRows = locationData.getNhits();
        int start = locationData.getParameters().getStart();//locationData.
        int numberRows = locationData.getParameters().getRows();
        log.info("total Rows: {}",totalRows );
        do {
            log.info("start: {}",start );
            log.info("rows: {}",numberRows );
            locationData = restTemplate.getForObject("https://datos.cdmx.gob.mx/api/records/1.0/search/?dataset=prueba_fetchdata_metrobus&q=&rows=11&start=" + start,LocationData.class);
            insert(locationData);
            log.info("save rows");
            start = start + numberRows;
        }while (start <= totalRows);
        return;
    }


    private void insert(LocationData locationData){
        for (Records record : locationData.getRecords()){
            MetrobusData locationMetrobus = new MetrobusData();
            locationMetrobus.setVehicleID(Integer.parseInt(record.getFields().getVehicle_id()));
            locationMetrobus.setTripStartDate(record.getFields().getTrip_start_date());
            locationMetrobus.setDateUpdated(record.getFields().getDate_updated());
            locationMetrobus.setPositionLongitude(record.getFields().getPosition_longitude());
            locationMetrobus.setTripScheduleRelationship(String.valueOf(record.getFields().getTrip_schedule_relationship()));
            locationMetrobus.setPositionSpeed(String.valueOf(record.getFields().getPosition_speed()));
            locationMetrobus.setVehicleCurrentStatus(record.getFields().getVehicle_current_status());
            locationMetrobus.setTripRouteID(record.getFields().getTrip_route_id());
            locationMetrobus.setPositionOdometer(String.valueOf(record.getFields().getPosition_odometer()));
            locationMetrobus.setVehicleLabel(record.getFields().getVehicle_label());
            locationMetrobus.setTripID(record.getFields().getTrip_id());
            locationMetrobus.setPositionLatitude(record.getFields().getPosition_latitude());
            locationMetrobus.setGeographicPoint(record.getFields().getGeographic_point()[0] + "," + record.getFields().getGeographic_point()[1]);
            locationMetrobus.setStoreday(Utilities.getTimeStamp());
            log.info(locationMetrobus.toString());
            iMetrobusDataServices.save(locationMetrobus);
        }



    }





}
