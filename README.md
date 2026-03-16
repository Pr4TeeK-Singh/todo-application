<div align="center">

<img src="https://img.shields.io/badge/Spring%20Boot-3.x-6DB33F?style=for-the-badge&logo=springboot&logoColor=white" />
<img src="https://img.shields.io/badge/Java-17+-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" />
<img src="https://img.shields.io/badge/MySQL-8.x-4479A1?style=for-the-badge&logo=mysql&logoColor=white" />
<img src="https://img.shields.io/badge/Bootstrap-5-7952B3?style=for-the-badge&logo=bootstrap&logoColor=white" />
<img src="https://img.shields.io/badge/Maven-Build-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white" />

<br /><br />

# ✅ Todo Application

### *A clean, full-stack task manager built with Spring Boot — organize your day, your way.*

<br />

[🚀 Features](#-features) · [🛠️ Tech Stack](#%EF%B8%8F-tech-stack) · [⚙️ Getting Started](#%EF%B8%8F-getting-started) · [📸 Screenshots](#-screenshots) · [📁 Project Structure](#-project-structure)

<br />

</div>

---

## 📖 About

**Todo Application** is a secure, full-stack web application that helps you stay on top of your tasks. Built with **Spring Boot** on the backend and **Thymeleaf + Bootstrap** on the frontend, it offers a seamless experience for managing personal to-do lists — complete with user authentication, so your tasks stay private.

Whether you're tracking daily chores or managing project milestones, this app keeps things simple, fast, and reliable.

---

## 🚀 Features

| Feature | Description |
|---|---|
| 🔐 **User Authentication** | Secure registration & login via Spring Security |
| ➕ **Create Tasks** | Add new to-do items instantly |
| ✏️ **Edit Tasks** | Update task titles and details anytime |
| 🗑️ **Delete Tasks** | Remove tasks you no longer need |
| ✅ **Mark Complete** | Toggle tasks between complete and incomplete |
| 📱 **Responsive UI** | Works beautifully on desktop, tablet, and mobile |
| 🔒 **Private Lists** | Each user sees only their own tasks |

---

## 🛠️ Tech Stack

### Backend
- **Java 17+** — Core application logic
- **Spring Boot** — Fast, opinionated app framework
- **Spring Security** — Authentication & authorization
- **Spring Data JPA** — ORM & database abstraction
- **Hibernate** — Entity management

### Frontend
- **Thymeleaf** — Server-side templating engine
- **Bootstrap 5** — Responsive, mobile-first UI components

### Database
- **MySQL** — Relational database for persistent storage

### Build & Tools
- **Maven** — Dependency management & build automation
- **Maven Wrapper** — Ensures consistent builds across environments

---

## ⚙️ Getting Started

### Prerequisites

Make sure you have the following installed:
- ☕ Java 17 or higher
- 🗄️ MySQL 8.x
- 🐘 Maven 3.x (or use the included `mvnw` wrapper)

### 1. Clone the Repository

```bash
git clone https://github.com/Pr4TeeK-Singh/todo-application.git
cd todo-application
```

### 2. Configure the Database

Create a MySQL database:

```sql
CREATE DATABASE todo_db;
```

Update `src/main/resources/application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/todo_db
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
```

### 3. Run the Application

**On Linux/macOS:**
```bash
./mvnw spring-boot:run
```

**On Windows:**
```bash
mvnw.cmd spring-boot:run
```

### 4. Open in Browser

```
http://localhost:8080
```

That's it! 🎉 Register a new account and start adding tasks.

---

## 📁 Project Structure

```
todo-application/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/.../todo/
│   │   │       ├── controller/     # MVC Controllers
│   │   │       ├── model/          # JPA Entity classes
│   │   │       ├── repository/     # Spring Data repositories
│   │   │       ├── service/        # Business logic
│   │   │       └── security/       # Spring Security config
│   │   └── resources/
│   │       ├── templates/          # Thymeleaf HTML templates
│   │       ├── static/             # CSS, JS, images
│   │       └── application.properties
│   └── test/
├── pom.xml
└── README.md
```

---

## 🔐 Security

- Passwords are encrypted using **BCrypt** hashing
- Session-based authentication via **Spring Security**
- Each user's tasks are isolated — no cross-user data access
- CSRF protection enabled by default

---

## 🤝 Contributing

Contributions are welcome! Here's how to get started:

1. **Fork** the repository
2. Create a feature branch: `git checkout -b feature/your-feature-name`
3. Commit your changes: `git commit -m "Add: your feature description"`
4. Push to your branch: `git push origin feature/your-feature-name`
5. Open a **Pull Request**

---

## 📄 License

This project is open source and available under the [MIT License](LICENSE).

---

<div align="center">

Made with ❤️ by [Pr4TeeK-Singh](https://github.com/Pr4TeeK-Singh)

⭐ *If you found this helpful, consider giving it a star!* ⭐

</div>
