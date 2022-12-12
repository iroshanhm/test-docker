FROM openjdk:17
ADD target/test-docker.jar test-docker.jar
EXPOSE 8081:8081
ENTRYPOINT ["java","-jar","/test-docker.jar"]