# Java Calculator

A simple, well-tested Java calculator application that performs addition operations on integers and doubles. Built with Maven and JUnit 5, this project demonstrates clean code practices, comprehensive testing, and easy deployment.

## Features

- ✨ Addition operations for both integers and doubles
- 🧪 Comprehensive unit tests with JUnit 5
- 📦 Executable JAR packaging
- 🚀 No external dependencies (except testing)
- 🔧 Maven-based build system
- 💻 Cross-platform support (Windows, macOS, Linux)

## Requirements

- Java 11 or higher
- Maven 3.6+ (optional - build scripts included)

Check your Java version:
```bash
java -version
```

## Quick Start

### Option 1: Using Build Scripts (No Maven Required)

#### macOS/Linux
```bash
# Make script executable (first time only)
chmod +x build.sh

# Build and run
./build.sh

# Run with custom numbers
java -jar calculator.jar 50 100
```

#### Windows
```cmd
# Build and run
build.bat

# Run with custom numbers
java -jar calculator.jar 50 100
```

### Option 2: Using Maven

```bash
# Compile the project
mvn clean compile

# Run tests
mvn test

# Package as JAR
mvn package

# Run the application
java -jar target/java-calculator-1.0.0.jar
```

## Usage Examples

The calculator demonstrates three types of operations:

1. **Integer addition**: `10 + 20 = 30`
2. **Double addition**: `15.5 + 24.5 = 40.0`
3. **Command-line arguments**: Custom numbers provided at runtime

### Running with Custom Arguments

```bash
# Add two integers
java -jar calculator.jar 42 58

# Add decimal numbers
java -jar calculator.jar 3.14 2.86

# Add negative numbers
java -jar calculator.jar -10 25
```

## Project Structure

```
Java-calculator/
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/
│   │           └── calculator/
│   │               ├── Calculator.java    # Core calculator logic
│   │               └── Main.java          # Application entry point
│   └── test/
│       └── java/
│           └── com/
│               └── calculator/
│                   └── CalculatorTest.java # Unit tests
├── pom.xml                 # Maven configuration
├── build.sh               # Unix build script
├── build.bat              # Windows build script
├── QUICK_START.md         # Quick start guide
└── README.md              # This file
```

## API Documentation

### Calculator Class

#### `int sum(int a, int b)`
Adds two integers and returns the sum.

**Parameters:**
- `a` - the first number
- `b` - the second number

**Returns:** the sum of a and b

**Example:**
```java
Calculator calc = new Calculator();
int result = calc.sum(10, 20); // returns 30
```

#### `double sum(double a, double b)`
Adds two double values and returns the sum.

**Parameters:**
- `a` - the first number
- `b` - the second number

**Returns:** the sum of a and b

**Example:**
```java
Calculator calc = new Calculator();
double result = calc.sum(15.5, 24.5); // returns 40.0
```

## Testing

The project includes comprehensive unit tests covering:
- ✅ Positive integers
- ✅ Negative integers
- ✅ Mixed positive/negative integers
- ✅ Zero values
- ✅ Positive doubles
- ✅ Negative doubles
- ✅ Mixed positive/negative doubles
- ✅ Large numbers

Run tests with:
```bash
mvn test
```

## Deployment

The application is packaged as a standalone JAR file that can be deployed to any environment with Java installed.

### Deploy to Remote Server

```bash
# Copy JAR to target machine
scp calculator.jar user@server:/path/to/app/

# Run on target machine
ssh user@server
java -jar /path/to/app/calculator.jar
```

### Docker Deployment (Optional)

```dockerfile
FROM openjdk:11-jre-slim
COPY calculator.jar /app/calculator.jar
WORKDIR /app
ENTRYPOINT ["java", "-jar", "calculator.jar"]
```

## Development

### Building from Source

```bash
# Clone the repository
git clone <repository-url>
cd Java-calculator

# Build the project
mvn clean install

# Run the application
java -jar target/java-calculator-1.0.0.jar
```

### Adding New Features

1. Add new methods to [`Calculator.java`](src/main/java/com/calculator/Calculator.java)
2. Write corresponding tests in [`CalculatorTest.java`](src/test/java/com/calculator/CalculatorTest.java)
3. Update [`Main.java`](src/main/java/com/calculator/Main.java) to demonstrate the new functionality
4. Run tests to ensure everything works: `mvn test`

## Technologies Used

- **Java 11** - Programming language
- **Maven 3.11.0** - Build automation and dependency management
- **JUnit 5.9.3** - Testing framework

## License

This project is open source and available for educational purposes.

## Contributing

Contributions are welcome! Please feel free to submit a Pull Request.

## Support

For questions or issues, please open an issue in the repository.

---

**Made with Bob** 🤖