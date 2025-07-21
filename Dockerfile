FROM openjdk:17-jdk-slim

# 作業ディレクトリ
WORKDIR /opt/traccar

# すべてのファイルをコピー（libをinstallersからコピー）
COPY installers/lib ./lib
COPY tracker-server.jar .

# ポート開放（Web UI）
EXPOSE 8082

# 実行（lib内のjarをクラスパスに含める）
CMD ["java", "-cp", "tracker-server.jar:lib/*", "org.traccar.Main"]
