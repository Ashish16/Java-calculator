#!/bin/bash

# Java Calculator Build Script
# This script compiles and runs the Java calculator without Maven

echo "=== Java Calculator Build Script ==="
echo ""

# Create output directory
mkdir -p out/classes
mkdir -p out/test-classes

# Compile main source files
echo "Compiling source files..."
javac -d out/classes src/main/java/com/calculator/*.java

if [ $? -eq 0 ]; then
    echo "✓ Compilation successful"
else
    echo "✗ Compilation failed"
    exit 1
fi

# Create JAR file
echo ""
echo "Creating JAR file..."
cd out/classes
jar cfe ../../calculator.jar com.calculator.Main com/calculator/*.class
cd ../..

if [ $? -eq 0 ]; then
    echo "✓ JAR created: calculator.jar"
else
    echo "✗ JAR creation failed"
    exit 1
fi

# Run the application
echo ""
echo "=== Running Calculator ==="
java -jar calculator.jar

echo ""
echo "=== Build Complete ==="
echo ""
echo "To run with custom arguments:"
echo "  java -jar calculator.jar 10 20"
echo ""
echo "To run directly from classes:"
echo "  java -cp out/classes com.calculator.Main"

# Made with Bob
