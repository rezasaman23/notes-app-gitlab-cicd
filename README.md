# 📘 Notes App with GitLab CI/CD

## 📂 Project Structure

```
notes-app/
├── .gitlab-ci.yml          # GitLab CI/CD pipeline config
├── Dockerfile              # Docker image build file
├── pom.xml                 # Maven build file
├── src/
│   ├── main/
│   │   ├── java/com/example/notes/
│   │   │   ├── NotesApplication.java   # Main Spring Boot entry point
│   │   │   ├── controller/
│   │   │   │   └── NoteController.java
│   │   │   ├── entity/
│   │   │   │   └── Note.java
│   │   │   └── repository/
│   │   │       └── NoteRepository.java
│   │   └── resources/
│   │       └── application.properties  # DB & app configs
│   └── test/
│       └── java/com/example/notes/
│           └── NoteControllerTest.java # Sample unit test
```

---

## 🚀 Features

* **Java 21 + Spring Boot 3**
* **CRUD REST API** for managing notes
* **Maven** for build and dependency management
* **H2 Database** (in-memory, no setup required)
* **GitLab CI/CD pipeline** with stages: build → test → docker → deploy
* **Dockerized** for easy deployment

---

## ⚡ Quick Start

### 1. Run locally

```bash
# Build & run with Maven
mvn spring-boot:run
```

App will start at: [http://localhost:8080/api/notes](http://localhost:8080/api/notes)

---

### 2. Test API

Create a note:

```bash
curl -X POST http://localhost:8080/api/notes \
     -H "Content-Type: application/json" \
     -d '{"title":"First Note","content":"This is a sample note"}'
```

Get all notes:

```bash
curl http://localhost:8080/api/notes
```

---

### 3. Run with Docker

```bash
# Build jar
mvn clean package -DskipTests

# Build Docker image
docker build -t notes-app .

# Run container
docker run -p 8080:8080 notes-app
```

---

## 🔧 CI/CD Pipeline (`.gitlab-ci.yml`)

The GitLab pipeline automates:

1. **Build** → Compile project using Maven.
2. **Test** → Run unit tests with reports.
3. **Docker** → Build & push Docker image to GitLab Container Registry.
4. **Deploy** → Deploy to staging environment.

---

## 🏆 Interview Talking Points

* Shows experience with **Spring Boot REST APIs**.
* Demonstrates **GitLab CI/CD knowledge** (build → test → docker → deploy).
* Highlights ability to use **Docker for consistent deployments**.
* Simple, professional, **easy to explain in under 2 minutes**.

---
