# Use an official Maven image as the base image
FROM maven:3.8.5-jdk-11 AS build

# Set the working directory in the container
WORKDIR /app

# Copy the Maven project's pom.xml file
COPY pom.xml .

# Download the Maven dependencies specified in pom.xml and cache them in a layer
RUN mvn dependency:go-offline -B

# Copy the entire project source code to the container
COPY src ./src

# Build the Maven project
RUN mvn package -DskipTests

# Use a lightweight JDK image as the base image for the runtime environment
FROM adoptopenjdk:11-jre-hotspot

# Set the working directory in the container
WORKDIR /app

# Copy the JAR file built in the previous stage to the container
COPY --from=build /app/target/*.jar app.jar

# Expose the port your application runs on (assuming it's 8080)
EXPOSE 8080

# Specify the command to run your application when the container starts
CMD ["java", "-jar", "app.jar"]
