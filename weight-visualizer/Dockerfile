FROM hypriot/rpi-java
// TODO: добать ссылку на .deb пакет с артефактом
ADD ./code
// подумать над этим
WORKDIR /code
// установить пакет
RUN pip install -r requirements.txt
// запустить приложение
CMD ["python", "app.py"]