FROM openjdk:8-jdk-slim
COPY "./target/data-locations-cdmx-0.0.1-SNAPSHOT" "data-locations-cdmx.jar"
EXPOSE 8082
ENTRYPOINT["java","-jar","data-locations-cdmx.jar"]