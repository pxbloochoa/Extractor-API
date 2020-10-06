FROM openjdk:8-jdk-slim
COPY "./target/dextractor-0.0.1-SNAPSHOT.jar" "extractor.jar"
EXPOSE 8081
ENTRYPOINT["java","-jar","extractor.jar"]