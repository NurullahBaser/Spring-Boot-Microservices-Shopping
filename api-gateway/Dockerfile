FROM openjdk:17-jdk AS build

COPY pom.xml mvnw ./
COPY .mvn .mvn
RUN ./mvnw dependency:resolve

COPY src src
RUN ./mvnw package

FROM openjdk:17-jdk-slim
WORKDIR api-gateway
COPY --from=build target/*.jar api-gateway.jar
ENTRYPOINT ["java", "-jar", "api-gateway.jar"]