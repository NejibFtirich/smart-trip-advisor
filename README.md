# Smart Trip Advisor

Maven multi-module Spring Boot project skeleton based on Clean Architecture / Hexagonal Architecture, using Java 21.

## Module tree

```text
smart-trip-advisor
└── trip-advisor-service
    ├── trip-application
    ├── trip-container
    ├── trip-dataaccess
    ├── trip-domain
    │   ├── trip-application-service
    │   └── trip-domain-core
    ├── trip-external
    └── trip-messaging
```

## Architecture rules

- `trip-domain-core` is pure Java and must not depend on Spring, JPA, Kafka, WebClient, or REST.
- `trip-application-service` contains use cases and ports. It depends only on `trip-domain-core`.
- `trip-application` is a primary adapter for REST controllers.
- `trip-dataaccess` is a secondary adapter for persistence.
- `trip-messaging` is a secondary adapter for Kafka.
- `trip-external` is a secondary adapter for external APIs such as Open-Meteo and Frankfurter.
- `trip-container` assembles all modules and produces the runnable Spring Boot JAR.

## Build

```bash
mvn clean install
```

## Run

```bash
cd trip-advisor-service/trip-container
mvn spring-boot:run
```

## Java

This project uses Java 21.
