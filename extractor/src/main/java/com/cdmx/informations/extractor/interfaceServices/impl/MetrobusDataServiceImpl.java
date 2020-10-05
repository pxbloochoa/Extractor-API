package com.cdmx.informations.extractor.interfaceServices.impl;

import com.cdmx.informations.extractor.interfaceServices.IMetrobusDataServices;
import com.cdmx.informations.extractor.repository.MetrobusDataRepository;
import com.cdmx.informations.extractor.model.MetrobusData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MetrobusDataServiceImpl implements IMetrobusDataServices {

    @Autowired
    MetrobusDataRepository repository;

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
        repository.save(data);
        return 0;
    }

    @Override
    public void delete(int ID) {

    }
}
