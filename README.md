# ETL CMDX DATA
Esta aplicación permite realizar extracciones de datos abiertos de la ciudad de mexico, los objetivos son los siguientes:
- Extraer datos de las unidades de metrobus: Localización veiculos disponibles
- Extrae Datos de las alcaldias disponibles en la CDMX
- Ejecución de tareas de extracción dado un cron
- Consulta la información atravez de API Rest con GraphQL


[Datos Abiertos de la CDMX](https://datos.cdmx.gob.mx/pages/home/).


## Arquitectura del Proyecto
![picture](https://github.com/pxbloochoa/Extractor-API/blob/master/commons/Diagram-Arquitectura.jpg)


## Intalación de MySQL Docker
#### Instalación de imagen MySQL Docker
```
docker run --name some-mysql -p 6033:3306 -e MYSQL_ROOT_PASSWORD=admin1928! -e MYSQL_DATABASE=cdmxlocation -d mysql:8.0.21 --character-set-server=utf8mb4 --collation-server=utf8mb4_unicode_ci 

```
#### Agregar el archivo de base de datos al contenedor
```
docker cp commons/createTablesAPI.sql some-mysql:/tmp/createTablesAPI.sql
```
#### Ejecución de base de datos inicial
```
docker exec -i some-mysql sh -c 'exec mysql -uroot -p"admin1928!" < /tmp/createTablesAPI.sql'
```
#### Entrar a MySQL Docker
```
docker exec -it some-mysql bash
```


## Ejecucuón de la API 

#### URL de conexión

```
http://localhost:8081/graphql

```

#### Ejemplo query GraphQL

```

{
    getAllMetrobus{
        vehicleID
        tripStartDate
        dateUpdated
        positionLongitude
        positionLatitude
    }
}

```

#### Ejemplo de Datos

```

{
    "data": {
        "getAllMetrobus": [
            {
                "vehicleID": 170,
                "tripStartDate": null,
                "dateUpdated": "2020-10-05 15:00:06",
                "positionLongitude": "-99.18779754638672",
                "positionLatitude": "19.3174991607666"
            },
            {
                "vehicleID": 177,
                "tripStartDate": "20200428",
                "dateUpdated": "2020-10-05 15:00:06",
                "positionLongitude": "-99.17749786376953",
                "positionLatitude": "19.292600631713867"
            }
        ]
    }
}

```