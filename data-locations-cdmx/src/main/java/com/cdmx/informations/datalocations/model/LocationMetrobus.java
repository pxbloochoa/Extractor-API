package com.cdmx.informations.datalocations.model;


import lombok.Getter;
import lombok.Setter;

import javax.annotation.PostConstruct;
import javax.persistence.*;
import javax.transaction.Transactional;

@Getter
@Setter

@Entity
@Table(name = "location_metrobus")
public class LocationMetrobus {

    @Id
    @Column(name = "vehicle_id", nullable = false)
    private int vehicleID;

    @Column(name = "trip_start_date", nullable = false)
    private String tripStartDate;

    @Column(name = "date_updated", nullable = false)
    private String dateUpdated;

    @Column(name = "position_longitude", nullable = false)
    private  String positionLongitude;

    @Column(name = "trip_schedule_relationship",nullable = false)
    private String tripScheduleRelationship;

    @Column(name = "position_speed",nullable = false)
    private String positionSpeed;

    @Column(name = "vehicle_current_status", nullable = false)
    private String vehicleCurrentStatus;

    @Column(name = "trip_route_id", nullable = false)
    private String tripRouteID;

    @Column(name = "position_odometer", nullable = false)
    private String positionOdometer;

    @Column(name = "vehicle_label", nullable = false)
    private String vehicleLabel;

    @Column(name = "trip_id", nullable = false)
    private String tripID;

    @Column(name = "position_latitude", nullable = false)
    private String positionLatitude;

    @Column(name = "geographic_point", nullable = false)
    private String geographicPoint;

    public LocationMetrobus(int vehicleID, String tripStartDate, String dateUpdated, String positionLongitude, String tripScheduleRelationship, String positionSpeed, String vehicleCurrentStatus, String tripRouteID, String positionOdometer, String vehicleLabel, String tripID, String positionLatitude, String geographicPoint) {
        this.vehicleID = vehicleID;
        this.tripStartDate = tripStartDate;
        this.dateUpdated = dateUpdated;
        this.positionLongitude = positionLongitude;
        this.tripScheduleRelationship = tripScheduleRelationship;
        this.positionSpeed = positionSpeed;
        this.vehicleCurrentStatus = vehicleCurrentStatus;
        this.tripRouteID = tripRouteID;
        this.positionOdometer = positionOdometer;
        this.vehicleLabel = vehicleLabel;
        this.tripID = tripID;
        this.positionLatitude = positionLatitude;
        this.geographicPoint = geographicPoint;
    }
    public LocationMetrobus(){

    }



}
