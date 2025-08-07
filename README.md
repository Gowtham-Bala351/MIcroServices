 Spring Boot Microservices Architecture
This repository contains a complete microservices-based architecture built using Spring Boot. Each folder represents a distinct microservice or infrastructure component, designed to work together seamlessly.

 Microservices & Components
1. Eureka Server
Acts as the Service Registry.
All microservices register themselves here for service discovery.
2. API Gateway
Centralized entry point for all client requests.
Routes requests to appropriate microservices.
Handles cross-cutting concerns like authentication, logging, and rate limiting.
3. Feign Client
Declarative REST client used for inter-service communication.
Simplifies HTTP calls between microservices.
4. RestTemplate
Alternative to Feign for making synchronous HTTP requests.
Used in services where Feign is not preferred.
5. Load Balancing
Achieved using Spring Cloud LoadBalancer.
Distributes requests across multiple instances of a service.
6. Circuit Breaker
Implemented using Resilience4j.
Prevents cascading failures and improves fault tolerance.
7. Admin Server
Provides a UI dashboard to monitor Spring Boot applications.
Displays metrics, health checks, and environment details.
8. Zipkin Server
Distributed tracing system.
Helps visualize latency and trace request paths across microservices.
