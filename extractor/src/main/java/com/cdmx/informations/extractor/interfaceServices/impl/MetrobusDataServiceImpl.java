package com.cdmx.informations.extractor.interfaceServices.impl;

import com.cdmx.informations.extractor.interfaceServices.DataServicesInterface;
import com.cdmx.informations.extractor.repository.MetrobusDataRepository;
import com.cdmx.informations.extractor.model.MetrobusData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Qualifier("MetrobusDataServiceImpl")
public class MetrobusDataServiceImpl implements DataServicesInterface {

    @Autowired
    MetrobusDataRepository repository;

    @Override
    public List<Object> listData() {
        return null;
    }

    @Override
    public Optional<Object> listDataID(int id) {
        return Optional.empty();
    }

    @Override
    public int save(Object data) {
        repository.save((MetrobusData)data);
        return 0;
    }

    @Override
    public void delete(int ID) {

    }
}
