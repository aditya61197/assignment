# Assignment — A/B Experimentation Service

A backend-driven A/B experimentation system built with Spring Boot.

## Prerequisites

- Java 25
- Maven 3.8
- Docker

## Getting Started

### 1. Build the application

```bash
mvn clean install
```

This compiles the source, runs tests, and packages the app into a `.jar` inside the `target/` directory.

### 2. Build the Docker image

```bash
sudo docker build -t assignment .
```

This uses the `Dockerfile` in the project root to create a Docker image tagged `assignment`.

### 3. Run the container

```bash
sudo docker run -p 8080:8080 assignment
```

The application will start and be accessible at `http://localhost:8080`.

The `-p 8080:8080` flag maps port `8080` on your machine to port `8080` inside the container.

## API Usage

Once running, the experiment assignment endpoint is available at:

```
http://localhost:8080/experiment?user_id=42
```

**Example:**

```bash
curl "http://localhost:8080/experiment?user_id=42"
```

**Response:**

```json
{"variant":"Variant_A","userId":"42"}
```
