package com.cdmx.informations.extractor.interfaceServices;

import com.cdmx.informations.extractor.model.MetrobusData;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public interface IMetrobusDataServices {

    List<MetrobusData> listDataMetrobus();
    Optional<MetrobusData> listMetrobusDataID(int id);
    int save(MetrobusData data);
    void delete(int ID);

}
