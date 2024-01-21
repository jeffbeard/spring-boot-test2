FROM openjdk:8-jre-alpine

EXPOSE 8080

COPY ./build/libs/spring-boot-test2-1.0.0-SNAPSHOT.jar /usr/app/
WORKDIR /usr/app

ENTRYPOINT ["java", "-jar", "spring-boot-test2-1.0.0-SNAPSHOT.jar"]