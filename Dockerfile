FROM openjdk:latest
EXPOSE 8080
ADD target/dockerjenkins-0.0.1-SNAPSHOT.jar dockerjenkins-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/dockerjenkins-0.0.1-SNAPSHOT.jar"]
