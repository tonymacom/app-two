FROM java:8-jre

MAINTAINER mabo <itmabo@163.com>

ADD ./target/app-two*.jar /app/app-two.jar
CMD ["java", "-jar", "/app/app-two.jar"]

EXPOSE 8080