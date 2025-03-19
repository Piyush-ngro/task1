FROM openjdk:17
WORKDIR /app
COPY maven_mvc.war /app/maven_mvc.war
CMD ["java", "-jar", "/app/maven_mvc.war"]
EXPOSE 8080
