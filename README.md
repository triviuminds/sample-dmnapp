# Sample DMN Application

This is a sample dmn application that demonstrates the integration of Decision Model and Notation (DMN) with Spring Boot using Kogito. The application provides a REST API for executing DMN decisions.

## Prerequisites

- Java 17 or higher
- Maven 3.9.x or higher
- Gradle 10.x or higher (optional, for Gradle users only)

## Visual Studio Code Extensions

- Extension Pack for Java
- BAMOE
- Gradle for Java
- Maven for Java
- REST Client


## Technology Stack

- Spring Boot 3.4.4
- Kogito 10.0.0
- SpringDoc OpenAPI (Swagger UI)
- Rest Assured (for testing)

## Building the Project

### Using Maven

```bash
mvn clean verify
```

### Using Gradle

```bash
./gradlew build
```

**Note for Gradle Users**: Since Kogito provides only Maven plugin support, the Gradle build is implemented as a wrapper around Maven commands. This means that the Gradle build will execute Maven commands under the hood, and it only works in a terminal environment where Maven is installed and accessible.

## Running the Application

### Using Maven

```bash
mvn spring-boot:run
```

### Using Gradle

```bash
./gradlew bootRun
```

## API Documentation

Once the application is running, you can access the Swagger UI at:
```
http://localhost:8080/swagger-ui.html
```

The OpenAPI specification is available at:
```
http://localhost:8080/v3/api-docs
```

## Testing

The project includes:
- Unit tests
- Integration tests using Kogito Scenario Simulation
- REST Assured tests for API endpoints

Run tests using:
```bash
mvn test
```

## Build Output

The build process generates two JAR files:
1. `sample-dmnapp-{version}.jar` - The main application JAR
2. `sample-dmnapp-{version}-dmnapp.jar` - A special JAR containing only DMN files and related resources (called dmnapp)

 