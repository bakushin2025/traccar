# ==============================================
# Traccar 公式リリースをダウンロードして実行する最小構成
# ==============================================

# 1) ベースとなる JDK17 イメージ
FROM openjdk:17-jdk-slim

# 2) Traccar のバージョン
ARG TRACCAR_VERSION=6.8.1

# 3) 作業ディレクトリを作成
WORKDIR /opt/traccar

# 4) 必要ツールを入れて Traccar を取得 → 展開 → クリーンアップ
RUN apt-get update \
 && apt-get install -y --no-install-recommends wget unzip ca-certificates \
 && wget -q https://github.com/traccar/traccar/releases/download/v${TRACCAR_VERSION}/traccar-linux-64-${TRACCAR_VERSION}.zip -O traccar.zip \
 && unzip traccar.zip \
 && rm traccar.zip \
 && mv traccar-linux-64-${TRACCAR_VERSION}/* . \
 && rmdir traccar-linux-64-${TRACCAR_VERSION} \
 && apt-get purge -y --auto-remove wget unzip \
 && apt-get clean

# 5) Web UI（8082）と GPS 受信（5000/udp）を公開
EXPOSE 8082
EXPOSE 5000/udp

# 6) コンテナ起動時に Traccar サーバを実行
ENTRYPOINT ["java", "-jar", "tracker-server.jar"]
