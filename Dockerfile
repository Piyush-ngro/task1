# Use an official Tomcat image to run the application
FROM tomcat:9.0.78-jdk11
 
# Copy the built WAR file from the build stage to the Tomcat webapps directory
# COPY /drop/maven_mvc.war /usr/local/tomcat/webapps/
COPY maven_mvc-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps/
 
# Expose the default Tomcat port
EXPOSE 8080
 
# Start Tomcat
CMD ["catalina.sh", "run"]
