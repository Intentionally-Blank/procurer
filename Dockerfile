FROM java:8-alpine
MAINTAINER Your Name <you@example.com>

ADD target/uberjar/procurer.jar /procurer/app.jar

EXPOSE 3000

CMD ["java", "-jar", "/procurer/app.jar"]
