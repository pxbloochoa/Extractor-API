FROM openjdk:8-jdk-slim AS Extractor-CDMX
COPY ./target/extractor-0.0.1-SNAPSHOT.jar /usr/app/extractor.jar
WORKDIR /usr/app
EXPOSE 8081
ENTRYPOINT ["java","-jar","extractor.jar"]