FROM ubuntu:20.04
ARG JAR_FILE=build/libs/hello-docker-vpn-0.0.1-SNAPSHOT.jar
WORKDIR /home/tony/docker-cont1
COPY ${JAR_FILE} app.jar
RUN apt-get -y update && apt-get -y upgrade
RUN apt-get -y install openjdk-17-jre
ENTRYPOINT ["java","-jar","app.jar"]