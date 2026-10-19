# Job Portal REST API

A simple Job Portal REST API built using Java and Spring Boot.

## Features

- Retrieve all available jobs.
- Retrieve a job by its ID.
- Return a 404 error when a job ID does not exist.
- Sample job data for Java Developer, IT Support Engineer, and Spring Boot Developer roles.

## Technologies Used

- Java 23
- Spring Boot
- Maven
- REST API
- Git and GitHub

## How to Run

1. Install Java and ensure it is available in your terminal.
2. Open the project folder in VS Code.
3. Run the application:

   ```powershell
   .\mvnw.cmd spring-boot:run
   ```

4. Open the API endpoints in your browser.

## API Endpoints

| Method | Endpoint | Description |
|---|---|---|
| GET | `/api/jobs` | Get all jobs |
| GET | `/api/jobs/1` | Get a job by ID |

## Local URL

`http://localhost:8081/api/jobs`

## Note

This is a demo project using sample data. It does not yet use a database or include user authentication.
