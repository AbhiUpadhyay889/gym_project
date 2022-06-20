FROM openjdk:latest

COPY target/gymapp2-0.0.1-SNAPSHOT.jar  gymapp.jar
ENV MYSQL_HOST=localhost 
ENV MYSQL_DATABASE=gymapp2
ENV MYSQL_USER=root
ENV MYSQL_PASSWORD=Mysql_21
ENV MYSQL_PORT=3306

ENTRYPOINT ["java","-jar","/gymapp.jar"]