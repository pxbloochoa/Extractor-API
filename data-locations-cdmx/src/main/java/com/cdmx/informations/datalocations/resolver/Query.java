package com.cdmx.informations.datalocations.resolver;

import com.cdmx.informations.datalocations.model.LocationMetrobus;
import com.cdmx.informations.datalocations.repository.LocationRepository;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;

import java.util.List;

/**
 * This Class is Resolver queries GraphQL
 */
public class Query implements GraphQLQueryResolver {

    private LocationRepository locationRepository;

    public Query(LocationRepository locationRepository){
        this.locationRepository = locationRepository;
    }

    /**
     * This Method find one metrobus with id
     * @param id is vehicle_id from table
     * @return one vehicle from database
     */
    public LocationMetrobus getMetrobus(int id){
        return  locationRepository.getOne(id);
    }

    /**
     * This Method find all Metrobus in the database
     * @return list of metrobus from the table
     */
    public List<LocationMetrobus> getAllMetrobus(){
        return locationRepository.findAll();
    }

}
