package com.cdmx.informations.extractor.service;

import com.cdmx.informations.extractor.interfaceServices.IMetrobusDataServices;
import com.cdmx.informations.extractor.repository.MetrobusDataRepository;
import com.cdmx.informations.extractor.model.MetrobusData;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class MetrobusDataService implements IMetrobusDataServices {

    @Autowired private MetrobusDataRepository dataService;

    @Override
    public List<MetrobusData> listDataMetrobus() {
        return null;
    }

    @Override
    public Optional<MetrobusData> listMetrobusDataID(int id) {
        return Optional.empty();
    }

    @Override
    public int save(MetrobusData data) {
        int response = 0;
        MetrobusData metrobusData = this.dataService.save(data);
        if(!metrobusData.equals(null)){
            response = 1;
        }
        return 0;
    }

    @Override
    public void delete(int ID) {

    }
}
