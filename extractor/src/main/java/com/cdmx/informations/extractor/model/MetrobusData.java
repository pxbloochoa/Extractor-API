package com.cdmx.informations.extractor.model;




import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "location_metrobus")
public class MetrobusData implements Serializable {
    


    @Id
    @Column(name = "vehicle_id")
    private int vehicleID;
    @Column(name = "trip_start_date")
    private String tripStartDate;
    @Column(name = "date_updated")
    private String dateUpdated;
    @Column(name = "position_longitude")
    private  String positionLongitude;
    @Column(name = "trip_schedule_relationship")
    private String tripScheduleRelationship;
    @Column(name = "position_speed")
    private String positionSpeed;
    @Column(name = "vehicle_current_status")
    private String vehicleCurrentStatus;
    @Column(name = "trip_route_id")
    private String tripRouteID;
    @Column(name = "position_odometer")
    private String positionOdometer;
    @Column(name = "vehicle_label")
    private String vehicleLabel;
    @Column(name = "trip_id")
    private String tripID;
    @Column(name = "position_latitude")
    private String positionLatitude;
    @Column(name = "geographic_point")
    private String geographicPoint;
    @Column(name = "storeday")
    private Timestamp storeday;


    @Override
    public String toString() {
        return "LocationMetrobus{" +
                "vehicleID=" + vehicleID +
                ", tripStartDate='" + tripStartDate + '\'' +
                ", dateUpdated='" + dateUpdated + '\'' +
                ", positionLongitude='" + positionLongitude + '\'' +
                ", tripScheduleRelationship='" + tripScheduleRelationship + '\'' +
                ", positionSpeed='" + positionSpeed + '\'' +
                ", vehicleCurrentStatus='" + vehicleCurrentStatus + '\'' +
                ", tripRouteID='" + tripRouteID + '\'' +
                ", positionOdometer='" + positionOdometer + '\'' +
                ", vehicleLabel='" + vehicleLabel + '\'' +
                ", tripID='" + tripID + '\'' +
                ", positionLatitude='" + positionLatitude + '\'' +
                ", geographicPoint='" + geographicPoint + '\'' +
                '}';
    }
}
