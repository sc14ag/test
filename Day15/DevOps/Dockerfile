FROM ubuntu
MAINTAINER Aliki Gregoriou

ENV http_proxy http://192.168.101.52:8080
ENV https_proxy http://192.168.101.52:8080
ENV no_proxy_hosts localhost,127.0.0.1,10.236.52.191

RUN apt-get update && apt-get install default-jdk git -y

COPY apache-maven-3.6.1-bin.tar.gz /root/apache-maven-3.6.1-bin.tar.gz


