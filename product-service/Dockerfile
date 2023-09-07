FROM openjdk:17-jdk AS build

COPY pom.xml mvnw ./
COPY .mvn .mvn
RUN ./mvnw dependency:resolve

COPY src src
RUN ./mvnw package

FROM openjdk:17-jdk-slim
WORKDIR product-service
COPY --from=build target/*.jar product-service.jar
ENTRYPOINT ["java", "-jar", "product-service.jar"]