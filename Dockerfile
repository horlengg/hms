# Use the official Gradle image as a build stage
FROM gradle:latest AS build
COPY . /home/gradle/src
WORKDIR /home/gradle/src
RUN gradle build --no-daemon

# Use the official OpenJDK image as a runtime stage
FROM openjdk:17.0.1-jdk-slim
COPY --from=build /home/gradle/src/build/libs/demo-0.0.1-SNAPSHOT.jar demo.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "demo.jar"]
