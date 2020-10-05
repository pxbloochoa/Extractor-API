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
public class Parameters {

    private String dataset;
    private String timezone;
    private int rows;
    private int start;
    private String format;

    public Parameters(){
    }

    @Override
    public String toString() {
        return "Parameters{" +
                "dataset='" + dataset + '\'' +
                ", timezone='" + timezone + '\'' +
                ", rows=" + rows +
                ", start=" + start +
                ", format='" + format + '\'' +
                '}';
    }
}
