FROM eclipse-temurin:18-jdk
ENV PORT 8080
EXPOSE 8080
COPY build/libs/demo-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT exec java $JAVA_OPTS -jar app.jar