# Stage 1: Build the Spring Boot application
FROM maven:3.8-openjdk-17 AS build
RUN mkdir /project
COPY . /project
WORKDIR /project
RUN mvn clean package -DskipTests

# Stage 2: Create the final image
FROM eclipse-temurin:17-jre-jammy
RUN mkdir /app
COPY --from=build /project/target/student-survey-0.0.1-SNAPSHOT.jar /app/java-application.jar
WORKDIR /app
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "java-application.jar"]
