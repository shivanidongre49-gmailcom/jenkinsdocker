FROM openjdk:latest
EXPOSE 8080
ADD target/dockerjenkins.jar dockerjenkins.jar
ENTRYPOINT ["java","-jar","/dockerjenkins.jar"]