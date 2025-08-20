FROM maven:3.9-eclipse-temurin-21 AS build
WORKDIR /app
COPY . .
RUN mvn -q -DskipTests -f backend/pom.xml -pl payment-service -am package

FROM eclipse-temurin:21-jre
WORKDIR /app
COPY --from=build /app/backend/payment-service/target/*.jar app.jar
EXPOSE 8082
ENTRYPOINT ["java","-jar","/app/app.jar"]
