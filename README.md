# Calculator

Simple Calculator application using Maven and Java.

## Project Description

This project is a simple calculator application that demonstrates the use of Maven as a build tool, JUnit 5 for testing, and includes code quality tools like Checkstyle and JaCoCo for code coverage analysis.

## Build and Run

### Prerequisites

- Java JDK 11 or higher
- Maven 3.6.0 or higher

### Build the Project

```bash
mvn clean package
```

### Run the Application

```bash
# Run with JAR file
java -cp target/calculator-1.0-SNAPSHOT-jar-with-dependencies.jar com.App "add(5,5)"

# Run with Maven
mvn exec:java -Dexec.mainClass=com.App -Dexec.args="add(5,5)"
```

The second parameter can be "warn", "info", or "debug". If not provided, it will default to "debug".

## Testing and Code Quality

### Run Tests

```bash
mvn test
```

### Check Code Style (Checkstyle)

```bash
mvn checkstyle:check
```

### Generate Code Coverage Report (JaCoCo)

```bash
mvn jacoco:report
```

After running the JaCoCo report command, you can view the coverage report in your browser by opening:
`target/site/jacoco/index.html`

## Project Structure

- `src/main/java/` - Source code files
- `src/test/java/` - Test files
- `src/main/resources/` - Resource files
- `target/` - Compiled files (excluded from Git)
- `checkstyle.xml` - Google's Checkstyle rules
