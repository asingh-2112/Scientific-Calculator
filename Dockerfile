# Use OpenJDK 11 as base image
FROM openjdk:21

# Copy the built JAR file into the container
COPY target/scientific-calculator.jar /app.jar

# Command to run the application
CMD ["java", "-jar", "/app.jar"]

