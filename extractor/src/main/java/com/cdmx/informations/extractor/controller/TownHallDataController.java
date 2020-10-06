package com.cdmx.informations.extractor.controller;

import com.cdmx.informations.extractor.commons.Utilities;


import com.cdmx.informations.extractor.consumers.townhall.Records;
import com.cdmx.informations.extractor.consumers.townhall.TownHallData;
import com.cdmx.informations.extractor.interfaceServices.DataServicesInterface;
import com.cdmx.informations.extractor.model.TownHallDataModel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@ConfigurationProperties("app")
@Slf4j
@Service
public class TownHallDataController {
    @Autowired
    @Qualifier("TownHallDataServiceImpl")
    private DataServicesInterface iDataServices;

    public void getDataLocation(RestTemplate restTemplate){
        TownHallData townHallData = restTemplate.getForObject("https://datos.cdmx.gob.mx/api/records/1.0/search/?dataset=alcaldias&q=&start=0&facet=nomgeo&facet=cve_mun&facet=municipio", TownHallData.class);
        log.info(townHallData.toString());
        int totalRows = townHallData.getNhits();
        int start = townHallData.getParameters().getStart();//locationData.
        int numberRows = townHallData.getParameters().getRows();
        log.info("total Rows: {}",totalRows );
        do {
            log.info("start: {}",start );
            log.info("rows: {}",numberRows );
            townHallData = restTemplate.getForObject("https://datos.cdmx.gob.mx/api/records/1.0/search/?dataset=alcaldias&q=&start=+"+start+"0&facet=nomgeo&facet=cve_mun&facet=municipio=",TownHallData.class);
            insert(townHallData);
            log.info("save rows");
            start = start + numberRows;
        }while (start <= totalRows);
        return;
    }


    private void insert(TownHallData townHallData) {
        for (Records record : townHallData.getRecords()) {
            TownHallDataModel townHallDataModel = new TownHallDataModel();
            townHallDataModel.setGeo_point_2d(record.getFields().getGeo_point_2d()[0] + "," + record.getFields().getGeo_point_2d()[1]);
            townHallDataModel.setCve_mun(record.getFields().getCve_mun());
            townHallDataModel.setCvegeo(record.getFields().getCvegeo());
            townHallDataModel.setGeo_shape_type(record.getFields().getGeo_shape().getType());
            townHallDataModel.setGeo_shape_coordinates(Arrays.deepToString(record.getFields().getGeo_shape().getCoordinates()).toString());
            townHallDataModel.setCve_ent(record.getFields().getCve_ent());
            townHallDataModel.setNomgeo(record.getFields().getNomgeo());
            townHallDataModel.setGeometry_type(record.getGeometry().getType());
            townHallDataModel.setGeometry_coordinates(record.getGeometry().getCoordinates()[0] + "," + record.getGeometry().getCoordinates()[1]);
            townHallDataModel.setStoreday(Utilities.getTimeStamp());
            log.info(townHallDataModel.toString());
            iDataServices.save(townHallDataModel);
        }
    }

}
