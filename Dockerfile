FROM openjdk:17-jdk-slim             # ① ベースイメージ

WORKDIR /opt/traccar                 # ② 作業ディレクトリ

# ③ JAR とライブラリ・設定をコピー
COPY tracker-server.jar .
COPY lib   ./lib
COPY conf  ./conf                    # ← 追加行

EXPOSE 8082                          # ④ Web UI 用ポート

# ⑤ クラスパスに lib/* を含めて設定ファイルを渡す
CMD ["java", "-cp", "tracker-server.jar:lib/*", "org.traccar.Main", "conf/traccar.xml"]
