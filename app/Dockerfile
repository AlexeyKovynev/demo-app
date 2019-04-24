FROM java:8-jre

ADD target/app.jar /app/
CMD ["java", "-Xmx256m", "-jar", "/app/app.jar"]

EXPOSE 8080