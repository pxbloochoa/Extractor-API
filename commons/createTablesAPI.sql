CREATE TABLE IF NOT EXISTS cdmxlocation.location_metrobus(
row_id bigint,
vehicle_id int,
trip_start_date TEXT,
date_updated TEXT,
position_longitude TEXT,
trip_schedule_relationship TEXT,
position_speed TEXT,
vehicle_current_status TEXT,
trip_route_id TEXT,
position_odometer TEXT,
vehicle_label TEXT,
trip_id TEXT,
position_latitude TEXT,
geographic_point TEXT,
storeday timestamp);


CREATE TABLE IF NOT EXISTS cdmxlocation.town_hall(
row_id bigint,
geo_point_2d TEXT,
cve_mun TEXT,
cvegeo TEXT,
geo_shape_type TEXT,
geo_shape_coordinates Long,
cve_ent TEXT,
nomgeo TEXT,
geometry_type TEXT,
geometry_coordinates TEXT,
storeday TEXT);