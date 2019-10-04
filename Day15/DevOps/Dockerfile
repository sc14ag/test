FROM ubuntu
MAINTAINER Aliki Gregoriou

ENV http_proxy http://192.168.101.52:8080
ENV https_proxy http://192.168.101.52:8080

RUN apt-get update && apt-get install -y default-jdk
RUN apt-get update && apt-get install -y git
RUN apt-get update && apt-get install -y maven

