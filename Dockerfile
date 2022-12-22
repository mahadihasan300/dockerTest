FROM openjdk:17
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} dockertest.jar

ENTRYPOINT ["java","-jar","/dockertest.jar"]