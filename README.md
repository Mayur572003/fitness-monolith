# 🏋️ Fitness Monolith Backend

![Java](https://img.shields.io/badge/Java-17-orange)
![Spring Boot](https://img.shields.io/badge/SpringBoot-4-green)
![Security](https://img.shields.io/badge/Spring%20Security-JWT-blue)
![Database](https://img.shields.io/badge/PostgreSQL-Neon-blue)
![Docker](https://img.shields.io/badge/Docker-Enabled-2496ED)
![Deployment](https://img.shields.io/badge/Deployed-Render-purple)
![Status](https://img.shields.io/badge/Status-Production%20Ready-brightgreen)

Production-ready Spring Boot backend for a Fitness Tracking Application with JWT Authentication, Role-Based Authorization, PostgreSQL (Neon), Swagger API documentation, Docker support, and cloud deployment on Render.

---

## 🚀 Live Demo

🔗 **Swagger UI**  
https://fitness-mono-mvfp.onrender.com/swagger-ui.html  

---

## 🛠 Tech Stack

- Java 17  
- Spring Boot  
- Spring Security (JWT Authentication)  
- Spring Data JPA (Hibernate)  
- PostgreSQL (Neon Cloud)  
- Swagger / OpenAPI  
- Docker  
- Render (Cloud Deployment)  
- Maven  

---

## 🔐 Key Features

- User Registration  
- User Login with JWT Token  
- Role-Based Authorization (USER / ADMIN)  
- Track Fitness Activities  
- Retrieve Activities  
- Generate Activity Recommendations  
- Retrieve User Recommendations  
- Global Exception Handling  
- Secure Password Hashing (BCrypt)  
- API Documentation via Swagger  

---

## 🏗️ Architecture Overview

This project follows a clean layered architecture:

```
Controller → Service → Repository → Database
```

### Layers

- **Controller Layer** → Handles HTTP requests and responses  
- **Service Layer** → Contains business logic  
- **Repository Layer** → Handles database interaction using Spring Data JPA  
- **Security Layer** → JWT-based authentication and authorization  
- **Database** → PostgreSQL (Neon Cloud)

### Security Flow

```
Client → JWT Filter → Authentication Manager → Controller → Service → Database
```

---

## 🔑 Authentication Flow

1. Register user → `/api/auth/register`  
2. Login user → `/api/auth/login`  
3. Receive JWT token  
4. Send token in header:

```
Authorization: Bearer <your_token>
```

---

## 📌 API Endpoints

### 🔓 Public APIs

| Method | Endpoint | Description |
|--------|----------|------------|
| POST | `/api/auth/register` | Register new user |
| POST | `/api/auth/login` | Login user |

### 🔒 Protected APIs (JWT Required)

| Method | Endpoint | Description |
|--------|----------|------------|
| POST | `/api/activities` | Track new activity |
| GET | `/api/activities` | Retrieve activities |
| POST | `/api/recommendation/generate` | Generate recommendation |
| GET | `/api/recommendation/user/{userId}` | Get user recommendations |

---

## 📘 Sample API Request

### Register User

**POST** `/api/auth/register`

```json
{
  "email": "user@gmail.com",
  "password": "Password123",
  "firstName": "Mayur",
  "lastName": "Patil"
}
```

### Login Response

```json
{
  "token": "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9..."
}
```

---

## 📂 Project Structure

```
com.project.fitness
│
├── controller
├── service
├── repository
├── model
├── dto
├── security
├── config
└── exceptions
```

---

## 🐳 Run with Docker

```bash
docker build -t fitness-monolith .
docker run -p 8080:8080 fitness-monolith
```

---

## ⚙️ Environment Variables

Configure the following environment variables:

```
DB_URL
DB_USER
DB_PWD
JWT_SECRET
```

⚠️ Never commit sensitive credentials to version control.

---

## 🧪 Run Locally

```bash
mvn clean install
mvn spring-boot:run
```

Application runs at:

```
http://localhost:8080
```

Swagger UI:

```
http://localhost:8080/swagger-ui.html
```

---

## 🎯 Why This Project?

This project demonstrates:

- Real-world backend architecture  
- Secure authentication system (JWT)  
- Cloud database integration  
- Docker containerization  
- Cloud deployment (Render)  
- Production-ready REST API design  

Designed as a portfolio-grade backend project to showcase Java & Spring Boot expertise.

---

## 👨‍💻 Author

**Mayur Patil**  
Backend Developer | Java & Spring Boot  
GitHub: https://github.com/Mayur572003  

---

⭐ If you found this project useful, consider giving it a star!
