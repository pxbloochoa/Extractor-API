package com.cdmx.informations.extractor.consumers.metrobus;


import com.cdmx.informations.extractor.consumers.Parameters;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;


@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class LocationData {

    private int nhits;
    private Parameters parameters;
    private Records[] records;

    public LocationData(){

    }


    @Override
    public String toString() {
        return "LocationData{" +
                "nhits=" + nhits +
                ", parameters=" + parameters +
                ", records=" + Arrays.toString(records) +
                '}';
    }
}
