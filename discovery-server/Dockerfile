FROM openjdk:17-jdk AS build

COPY pom.xml mvnw ./
COPY .mvn .mvn
RUN ./mvnw dependency:resolve

COPY src src
RUN ./mvnw package

FROM openjdk:17-jdk-slim
WORKDIR discovery-server
COPY --from=build target/*.jar discovery-server.jar
ENTRYPOINT ["java", "-jar", "discovery-server.jar"]