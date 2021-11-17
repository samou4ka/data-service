FROM adoptopenjdk/openjdk11:alpine-jre
ARG JAR_FILE=build/libs/data-service-0.0.1-SNAPSHOT.jar
COPY $JAR_FILE app.jar
CMD ["java", "-jar", "/app.jar"]