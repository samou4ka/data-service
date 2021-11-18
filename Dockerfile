FROM adoptopenjdk/openjdk11:alpine-jre
WORKDIR /home/app
COPY --from=build /home/app/build/layers/*.jar /home/app/app.jar
ENTRYPOINT ["java", "-jar", "/home/app/app.jar"]