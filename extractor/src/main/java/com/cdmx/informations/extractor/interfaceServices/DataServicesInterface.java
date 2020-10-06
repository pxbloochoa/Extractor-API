package com.cdmx.informations.extractor.interfaceServices;

import com.cdmx.informations.extractor.model.MetrobusData;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public interface DataServicesInterface {

    List<Object> listData();
    Optional<Object> listDataID(int id);
    int save(Object data);
    void delete(int ID);

}
