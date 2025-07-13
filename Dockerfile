FROM openjdk:17-jdk
COPY target/student-survey.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]
EXPOSE 8080