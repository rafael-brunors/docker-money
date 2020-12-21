FROM openjdk:14
COPY ./target/docker-money-0.0.1-SNAPSHOT.jar /usr/app/
WORKDIR /usr/app
ENV PORT 8080
EXPOSE 8080
ENTRYPOINT exec java $JAVA_OPTS -jar docker-money-0.0.1-SNAPSHOT.jar