# Quick Start Guide

## Build and Run (No Maven Required)

### macOS/Linux
```bash
# Make script executable (first time only)
chmod +x build.sh

# Build and run
./build.sh

# Run with custom numbers
java -jar calculator.jar 50 100
```

### Windows
```cmd
# Build and run
build.bat

# Run with custom numbers
java -jar calculator.jar 50 100
```

## What You Get

The calculator will:
1. Sum 10 + 20 = 30
2. Sum 15.5 + 24.5 = 40.0
3. Sum your custom arguments (if provided)

## Files Created

- `calculator.jar` - Executable JAR file
- `out/classes/` - Compiled class files

## Deploy to Any Environment

Just copy `calculator.jar` to any machine with Java installed:

```bash
# Copy to target machine
scp calculator.jar user@server:/path/to/app/

# Run on target machine
java -jar calculator.jar
```

## Requirements

- Java 11 or higher (check with `java -version`)
- No other dependencies needed!