# syntax=docker/dockerfile:1

# official image base
FROM openjdk:11

# default working directory
WORKDIR /tmp

# copy some files and dir into working dir
COPY .mvn/ .mvn
COPY mvnw pom.xml ./

# use mvn to install dependencies
RUN ./mvnw dependency:go-offline

# RUN ./mvnw package

# add source code to image
# COPY src ./src

# tell Docker what command we want to run when our image is exe inside a container
CMD ["./mvnw", "spring-boot:run"]



#  git clone https://github.com/allenlam369/spring_docker



