# TODO List

## Completed Tasks
- ✅ Added Spring Boot dependencies in build.gradle:
  - `spring-boot-starter-web` for MVC support
  - `spring-boot-starter-thymeleaf` for server-side templates
  - `spring-boot-starter-validation` for input validation

## Dependencies to Add
- Add additional Spring Boot dependencies in build.gradle:
  - `spring-boot-starter-data-jpa` for ORM and database operations
  - `postgresql` driver for database connectivity
  - `lombok` for reducing boilerplate code
  - `springdoc-openapi-starter-webmvc-ui` for API documentation

## Project Structure Updates (Partially Completed)
- ✅ Created web-related packages:
  - `org.firebyte.test.web.controller` for Web MVC controllers
  - `org.firebyte.test.web.exception` for exception handling
  - `org.firebyte.test.config` for application configuration

- Create additional packages:
  - `org.firebyte.test.service` for service interfaces
  - `org.firebyte.test.service.impl` for service implementations
  - `org.firebyte.test.repository` for data access interfaces
  - `org.firebyte.test.model` for entity classes
  - `org.firebyte.test.dto` for data transfer objects

## Configuration Files
- Update application.properties with:
  - Database connection settings
  - Server configuration
  - Logging settings
  - JPA/Hibernate properties

## Core Components to Implement
- ✅ Implemented simple web controller and view
- ✅ Implemented basic GlobalExceptionHandler for validation errors
- Create ApiResponse.java class for standardized API response format
- Add sample entity, repository, service, and REST controller

## Docker Updates
- Update Dockerfile to use JDK 17 (currently using JDK 8)
- Optimize Docker build with layering

## Testing Improvements
- ✅ Added unit tests for web controller
- Add unit tests for services and REST controllers
- Implement integration tests for repositories
- Set up test data fixtures

## Security Enhancements
- Add Spring Security configuration
- Implement basic authentication
- Set up CORS configuration

## DevOps Improvements
- Add health endpoints with Spring Actuator
- Configure database migration with Flyway or Liquibase
- Set up CI/CD pipeline configuration