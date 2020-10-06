package com.cdmx.informations.extractor.consumers;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@AllArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class GeoShape {

    private String type;
    private String[][][] coordinates;

    public GeoShape(){

    }

    public String[][][] getCoordinates() {
        return coordinates;
    }

    @Override
    public String toString() {
        return "GeoShape{" +
                "type='" + type + '\'' +
                ", coordinates='" + coordinates.toString() + '\'' +
                '}';
    }
}
