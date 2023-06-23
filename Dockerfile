FROM openjdk:11
COPY target/hospital-management-system-spring-boot-rest-api-0.0.1-SNAPSHOT.jar hospital-management-system-spring-boot-rest-api-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/hospital-management-system-spring-boot-rest-api-0.0.1-SNAPSHOT.jar"]