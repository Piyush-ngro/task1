# Use an official Tomcat image to run the application
FROM tomcat:9.0.78-jdk11
 
# Copy the built WAR file from the build stage to the Tomcat webapps directory
COPY /drop/mvc_calc_app.war /usr/local/tomcat/webapps/
 
# Expose the default Tomcat port
EXPOSE 8080
 
# Start Tomcat
CMD ["catalina.sh", "run"]
