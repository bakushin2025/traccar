FROM openjdk:17-jdk-slim

WORKDIR /opt/traccar

COPY lib ./lib
COPY tracker-server.jar .

EXPOSE 8082

CMD ["java", "-cp", "tracker-server.jar:lib/*", "org.traccar.Main"]
