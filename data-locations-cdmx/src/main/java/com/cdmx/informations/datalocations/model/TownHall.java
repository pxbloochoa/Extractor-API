package com.cdmx.informations.datalocations.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "town_hall")
public class TownHall {
    @Id
    @Column(name = "row_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long rowID;
    @Column(name = "geo_point_2d")
    private String geo_point_2d;
    @Column(name = "cve_mun")
    private String cve_mun;
    @Column(name = "cvegeo")
    private String cvegeo;
    @Column(name = "geo_shape_type")
    private  String geo_shape_type;
    @Column(name = "geo_shape_coordinates")
    private  String geo_shape_coordinates;
    @Column(name = "cve_ent")
    private String cve_ent;
    @Column(name = "nomgeo")
    private String nomgeo;
    @Column(name = "geometry_type")
    private String geometry_type;
    @Column(name = "geometry_coordinates")
    private String geometry_coordinates;
    @Column(name = "storeday")
    private Timestamp storeday;



}
