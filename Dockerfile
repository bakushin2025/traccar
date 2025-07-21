FROM openjdk:17-jdk-slim

WORKDIR /opt/traccar

# tracker-server.jar と lib/ をコピー
COPY tracker-server.jar .
COPY lib ./lib

EXPOSE 8082

CMD ["java", "-cp", "tracker-server.jar:lib/*", "org.traccar.Main"]
