package com.cdmx.informations.extractor.consumers.townhall;

import com.cdmx.informations.extractor.consumers.GeoShape;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;

@Builder
@AllArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class Fields {

    private String [] geo_point_2d;
    private String cve_mun;
    private String cvegeo;
    private GeoShape geo_shape;
    private String cve_ent;
    private String nomgeo;
    private String municipio;


    @Override
    public String toString() {
        return "Fields{" +
                "geo_point_2d='" + geo_point_2d.toString() + '\'' +
                ", cve_mun='" + cve_mun + '\'' +
                ", cvegeo='" + cvegeo + '\'' +
                ", geo_shape='" + geo_shape.toString() + '\'' +
                ", cve_ent=" + cve_ent +
                ", nomgeo=" + nomgeo +
                ", municipio='" + municipio + '\'' +
                '}';
    }
}
