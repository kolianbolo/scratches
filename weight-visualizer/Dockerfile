FROM hypriot/rpi-java
// TODO: добать ссылку на .deb пакет с артефактом
ADD ./code
// подумать над этим
WORKDIR /code
// установить пакет
RUN pip install -r requirements.txt
// запустить приложение
CMD /usr/bin/java \
    -Xms256m \
    -Xmx256m \
    -Xss256k \
    -XX:MaxDirectMemorySize=8m \
    -XX:MaxMetaspaceSize=70m \
    -XX:ReservedCodeCacheSize=40m \
    -XX:+UseSerialGC \
    -XX:+PrintFlagsFinal \
    -XX:CICompilerCount=1 \
    -XX:-TieredCompilation \
    -Djava.awt.headless=true \
    -jar weight-visualizer.jar