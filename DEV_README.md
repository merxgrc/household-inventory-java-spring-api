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

## Commit Message Conventions

This project follows [Conventional Commits](https://www.conventionalcommits.org/) for clear and consistent commit history.

### Common Types
- **feat**: a new feature for the user (e.g., new endpoint, new class)
    - `feat(controller): add GET /items endpoint`
- **fix**: a bug fix
    - `fix(service): correct null pointer in ItemService`
- **chore**: maintenance tasks that don’t affect functionality (refactors, moving files, updating configs)
    - `chore(structure): move ItemController into controller package`
- **test**: adding or updating tests only
    - `test(repository): add unit tests for ItemRepository`
- **docs**: documentation changes
    - `docs(readme): add commit convention guide`
- **refactor**: code changes that improve structure but don’t change behavior
    - `refactor(model): simplify Item constructor`
- **style**: formatting, whitespace, semicolons, etc. (no code logic changes)
    - `style: reformat code with Google Java Style`
- **build**: changes to build system, dependencies, or CI/CD
    - `build(ci): add GitHub Actions workflow for Maven`

### Format
<type>(optional scope): short description

### Examples
feat(controller): add GET /items endpoint
fix(service): correct bug in inventory calculation
chore(deps): update Spring Boot to 3.5.5