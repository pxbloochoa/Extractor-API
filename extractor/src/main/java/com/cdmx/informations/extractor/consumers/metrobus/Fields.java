package com.cdmx.informations.extractor.consumers.metrobus;


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

    private String vehicle_id;
    private String trip_start_date;
    private String date_updated;
    private String position_longitude;
    private int trip_schedule_relationship;
    private int position_speed;
    private String position_latitude;
    private String trip_route_id;
    private String vehicle_label;
    private int position_odometer;
    private String trip_id;
    private String vehicle_current_status;
    private String [] geographic_point;


    @Override
    public String toString() {
        return "Fields{" +
                "vehicle_id='" + vehicle_id + '\'' +
                ", trip_start_date='" + trip_start_date + '\'' +
                ", date_updated='" + date_updated + '\'' +
                ", position_longitude='" + position_longitude + '\'' +
                ", trip_schedule_relationship=" + trip_schedule_relationship +
                ", position_speed=" + position_speed +
                ", position_latitude='" + position_latitude + '\'' +
                ", trip_route_id='" + trip_route_id + '\'' +
                ", vehicle_label='" + vehicle_label + '\'' +
                ", position_odometer=" + position_odometer +
                ", trip_id='" + trip_id + '\'' +
                ", vehicle_current_status='" + vehicle_current_status + '\'' +
                ", geographic_point=" + Arrays.toString(geographic_point) +
                '}';
    }
}
