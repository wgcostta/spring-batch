# Spring Batch Example

This is a simple Spring Batch project for learning purposes. It demonstrates a batch job that:
- Reads data from a CSV file (`input.csv`).
- Processes the data by converting names to uppercase.
- Writes the processed data to an H2 in-memory database.

## Prerequisites
- Java 17 or higher
- Maven 3.6.3 or higher
- Git

## Project Structure
```
spring-batch-example/
├── src/
│   ├── main/
│   │   ├── java/com/example/
│   │   │   ├── BatchApplication.java
│   │   │   ├── config/BatchConfig.java
│   │   │   ├── model/Person.java
│   │   │   └── processor/PersonItemProcessor.java
│   │   ├── resources/
│   │       ├── application.properties
│   │       ├── data.sql
│   │       └── input.csv
├── pom.xml
├── README.md
```

## Setup
1. Clone the repository:
   ```bash
   git clone <repository-url>
   cd spring-batch-example
   ```

2. Build the project:
   ```bash
   mvn clean install
   ```

3. Run the application:
   ```bash
   mvn spring-boot:run
   ```

## How It Works
- The job reads data from `input.csv` (located in `src/main/resources`).
- The `PersonItemProcessor` converts the `firstName` and `lastName` fields to uppercase.
- The processed data is written to the `people` table in an H2 in-memory database.
- The chunk size is set to 10, meaning 10 records are processed per transaction.

## Verifying the Output
1. Access the H2 console at `http://localhost:8080/h2-console`.
2. Use the JDBC URL: `jdbc:h2:mem:testdb`, username: `sa`, password: (empty).
3. Run the query to check the data:
   ```sql
   SELECT * FROM people;
   ```

## Troubleshooting
- Ensure the `input.csv` file is correctly formatted.
- Check the H2 console to verify the database schema and data.
- Review the console logs for any errors during job execution.

## Learning Resources
- [Spring Batch Official Documentation](https://docs.spring.io/spring-batch/docs/current/reference/html/index.html)
- [Spring Boot Documentation](https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/)
- [H2 Database](http://www.h2database.com/html/main.html)

Feel free to explore and modify the code to learn more about Spring Batch!