# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Build Commands
- Build: `./gradlew build`
- Run: `./gradlew bootRun`
- Test all: `./gradlew test`
- Test single: `./gradlew test --tests "org.firebyte.test.ClassName.methodName"`
- Clean: `./gradlew clean`

## Code Style
- Follow SOLID, DRY, KISS, and YAGNI principles with OWASP security best practices
- Architecture: Clear separation between controllers, services, and repositories
- Entities: Use @Entity, @Data, @Id with proper validations, FetchType.LAZY for relationships
- Repositories: Interface with @Repository extending JpaRepository, use JPQL and @EntityGraph
- Services: Interface with ServiceImpl classes, return DTOs not entities, use @Transactional
- DTOs: Use Java record type with validation in canonical constructor
- Controllers: Use @RestController, appropriate HTTP method annotations, return ResponseEntity<ApiResponse>
- Error handling: Global exception handling with @RestControllerAdvice

## Tech Stack
- Java 17 with Spring Boot 3.2.2
- JUnit 5 for testing
- Gradle for build management