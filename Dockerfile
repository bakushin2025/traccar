FROM openjdk:17-jdk-slim

# 作業ディレクトリの作成
WORKDIR /opt/traccar

# すべてのファイルをコピー（tracker-server.jar, conf/, web/, etc.）
COPY . .

# ポート8082を開放（Web UI用）
EXPOSE 8082

# 起動コマンド（tracker-server.jar を実行）
CMD ["java", "-jar", "tracker-server.jar"]
