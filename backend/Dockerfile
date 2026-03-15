# ---------- Build Stage ----------
# Use Maven image to compile the Spring Boot application
FROM maven:3.9.6-eclipse-temurin-17 AS build

WORKDIR /app

# Copy project files
COPY . .

# Build the application and skip tests
RUN mvn clean package -DskipTests

# ---------- Runtime Stage ----------
# Use lightweight JRE image to run the application
FROM eclipse-temurin:17

WORKDIR /app

# Copy compiled jar from build stage
COPY --from=build /app/target/*.jar app.jar

# Expose Spring Boot port
EXPOSE 8080

# Run the application
ENTRYPOINT ["java","-jar","/app.jar"]
