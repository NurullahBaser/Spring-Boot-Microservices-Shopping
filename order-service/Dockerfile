FROM openjdk:17-jdk AS build

COPY pom.xml mvnw ./
COPY .mvn .mvn
RUN ./mvnw dependency:resolve

COPY src src
RUN ./mvnw package

FROM openjdk:17-jdk-slim
WORKDIR order-service
COPY --from=build target/*.jar order-service.jar
ENTRYPOINT ["java", "-jar", "order-service.jar"]