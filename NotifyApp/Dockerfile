FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} ./
ENTRYPOINT ["java","-jar","./Notify-0.0.1-SNAPSHOT.jar"]
