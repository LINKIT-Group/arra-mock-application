FROM java:8-alpine

LABEL vendor=LINKIT \
      nl.linkit.arra.is-beta="false" \
      nl.linkit.arra.is-production="true" \
      nl.linkit.arra.version="0.0.1" \
      nl.linkit.arra.release-date="31-10-2017"

ADD build/libs/stateful-*.jar /app.jar

EXPOSE 8080

ENV JAVA_OPTS=""

ENTRYPOINT ["sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar -Dserver.port=8080"]
