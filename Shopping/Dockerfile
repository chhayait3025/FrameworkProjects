FROM openjdk:8
EXPOSE 8080
ADD target/test-docker.jar
ENTRYPOINT ["java","-jar","/test-docker.jar"]