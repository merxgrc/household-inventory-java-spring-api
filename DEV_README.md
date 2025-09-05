# Household Inventory – Java Spring API (Developer Docs)

This repository contains the **backend API**, built with **Java 21 (LTS)** and **Spring Boot 3.5.5**.

## Features
- Add, update, and delete inventory items
- Track quantities and categories (e.g., kitchen, bathroom, cleaning)
- Set thresholds for low-stock alerts (planned)
- RESTful API endpoints for integration with a frontend (Next.js planned)

## Tech Stack
- **Java 21 (LTS)**
- **Spring Boot 3.5.5**
- **Maven**
- **JUnit 5**
- Database: H2 (dev), PostgreSQL (planned for production)


## Getting Started

### Prerequisites
- Java 21
- Maven (or use included wrapper: `./mvnw`)

### Run the tests
```bash
./mvnw spring-boot:test
```

### Run the app
```bash
./mvnw spring-boot:run
```

## Example Endpoints (planned)

GET /api/items → Get all items

POST /api/items → Add a new item

PUT /api/items/{id} → Update an item

DELETE /api/items/{id} → Delete an item

## Next Steps

* Build a Next.js frontend that consumes this API

* Add authentication and user accounts

* Deploy to cloud (AWS/Azure/GCP/OCI)