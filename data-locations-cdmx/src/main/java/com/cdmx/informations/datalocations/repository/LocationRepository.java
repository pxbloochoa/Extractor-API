package com.cdmx.informations.datalocations.repository;

import com.cdmx.informations.datalocations.model.LocationMetrobus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository  extends JpaRepository<LocationMetrobus, Integer> {

}
