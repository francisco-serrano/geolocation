FROM openjdk:8
RUN mkdir -p /opt/geolocation
ADD target/geolocation-0.0.1-SNAPSHOT.jar /opt/geolocation/
EXPOSE 8080
CMD ["java", "-jar", "/opt/geolocation/geolocation-0.0.1-SNAPSHOT.jar"]