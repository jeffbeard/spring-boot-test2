# Spring Boot Test Application

This is a simple Spring Boot application that demonstrates a Thymeleaf-based web frontend with Spring Web MVC.

## Features

- Java 23 with Spring Boot 3.3.0
- Thymeleaf templates for server-side rendering
- Input validation to prevent malicious code injection
- Simple greeting page with customizable name parameter

## Project Structure

- Controller: `HomeController` handles HTTP requests and manages the model
- View: Thymeleaf templates in `src/main/resources/templates`
- Configuration: `WebConfig` for method validation setup
- Exception Handling: `GlobalExceptionHandler` for validation errors

## Build and Run

To build the project:
```
./gradlew build
```

To run the application:
```
./gradlew bootRun
```

The application will be available at http://localhost:8080

## Web Interface

The web interface provides a simple greeting page:
- Default greeting: "Hello, World!"
- Customizable greeting by adding the `name` parameter: `http://localhost:8080/?name=YourName`
- Input validation prevents unsafe input like script tags

## Testing

To run tests:
```
./gradlew test
```

The test suite includes:
- Default message test
- Custom message test
- Input validation test
