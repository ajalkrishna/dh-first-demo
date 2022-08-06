FROM openjdk:8
VOLUME /tmp
ADD target/first-demo-0.0.1-SNAPSHOT.jar demo.jar
ENTRYPOINT ["java","-jar","/demo.jar"]