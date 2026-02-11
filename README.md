📌 Employee CRUD REST API

A simple and industry-standard Spring Boot RESTful application to manage employee data using CRUD operations.

This project is built to understand REST APIs, Spring Boot, JPA, and MySQL and is suitable for freshers / beginners.

🚀 Features

Create Employee

Get All Employees

Update Employee

Delete Employee

Input Validation

Exception Handling

MySQL Database Integration

RESTful APIs with JSON

🛠️ Tech Stack

Java 17

Spring Boot

Spring Data JPA

Hibernate

MySQL

Maven

Postman (API Testing)

Git & GitHub

📂 Project Structure

com.example.employee
├── controller
│   └── EmployeeController.java
├── service
│   └── EmployeeService.java
├── repository
│   └── EmployeeRepository.java
├── entity
│   └── Employee.java
├── exception
│   ├── EmployeeNotFoundException.java
│   └── GlobalExceptionHandler.java
└── EmployeeApplication.java

🔗 API Endpoints

| HTTP Method | Endpoint              | Description       |
| ----------- | --------------------- | ----------------- |
| POST        | `/api/employees`      | Create employee   |
| GET         | `/api/employees`      | Get all employees |
| PUT         | `/api/employees/{id}` | Update employee   |
| DELETE      | `/api/employees/{id}` | Delete employee   |

