@echo off
REM Java Calculator Build Script for Windows
REM This script compiles and runs the Java calculator without Maven

echo === Java Calculator Build Script ===
echo.

REM Create output directory
if not exist "out\classes" mkdir out\classes
if not exist "out\test-classes" mkdir out\test-classes

REM Compile main source files
echo Compiling source files...
javac -d out\classes src\main\java\com\calculator\*.java

if %ERRORLEVEL% EQU 0 (
    echo [32m✓ Compilation successful[0m
) else (
    echo [31m✗ Compilation failed[0m
    exit /b 1
)

REM Create JAR file
echo.
echo Creating JAR file...
cd out\classes
jar cfe ..\..\calculator.jar com.calculator.Main com\calculator\*.class
cd ..\..

if %ERRORLEVEL% EQU 0 (
    echo [32m✓ JAR created: calculator.jar[0m
) else (
    echo [31m✗ JAR creation failed[0m
    exit /b 1
)

REM Run the application
echo.
echo === Running Calculator ===
java -jar calculator.jar

echo.
echo === Build Complete ===
echo.
echo To run with custom arguments:
echo   java -jar calculator.jar 10 20
echo.
echo To run directly from classes:
echo   java -cp out\classes com.calculator.Main

@REM Made with Bob
