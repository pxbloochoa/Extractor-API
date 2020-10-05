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
public class Records {

    private String datasetid;
    private String recordid;
    private Fields fields;
    private Geometry geometry;
    private String record_timestamp;

    @Override
    public String toString() {
        return "Records{" +
                "datasetid='" + datasetid + '\'' +
                ", recordid='" + recordid + '\'' +
                ", fields=" + fields +
                ", geometry=" + geometry +
                ", record_timestamp='" + record_timestamp + '\'' +
                '}';
    }
}
