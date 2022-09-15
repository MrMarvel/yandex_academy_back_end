FROM openjdk:17-oracle
ARG JAR_FILE=target/swagger-spring-1.0.0.jar
WORKDIR /opt/app
COPY ${JAR_FILE} app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","app.jar"]