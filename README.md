# Assignment_Manual_Tester

# Project Overview

This project contains both automation and manual testing scripts for the given URL: https://testffc.nimapinfotech.com/

## Automation Testing

### Project Setup

1. Create a Maven Project:
    - Use an IDE like IntelliJ IDEA or Eclipse.
    - Create a new Maven project.
    - Add dependencies for Selenium, TestNG, and Cucumber (if you plan to use Cucumber).

### Steps Automated

1. **Automate Login Journey (by parametrization technique and Validate it)**
    - Implemented using TestNG and Cucumber frameworks.

2. **Verify the Toast/Popup message after the PunchIn**
    - Automated using Selenium WebDriver and TestNG.

3. **Add Customer (using parametrization and Validate it)**
    - Implemented using TestNG.

### File Structure

- `src/test/java/`
    - `LoginTest.java`: Contains test cases for login functionality.
    - `CustomerTest.java`: Contains test cases for adding a customer.
- `src/test/resources/`
    - `login.feature`: Cucumber feature file for login scenarios.

### How to Run

1. **Using TestNG**:
    - Run the `LoginTest.java` and `CustomerTest.java` files directly from your IDE or use the Maven command:
      ```sh
      mvn test
      ```

2. **Using Cucumber**:
    - Ensure the Cucumber feature file and step definitions are correctly set up.
    - Run the feature file from your IDE or use the Maven command:
      ```sh
      mvn test
      ```

## Manual Testing

### Modules and Test Cases

#### 1. Sign Up
- Test cases and validations for the sign-up process.
- Found bugs and validation issues.

#### 2. Forgot Password
- Test cases and validations for the forgot password process.
- Found bugs and validation issues.

#### 3. Sign with OTP
- Test cases and validations for the OTP sign-in process.
- Found bugs and validation issues.

#### 4. Login
- Test cases and validations for the login process.
- Found bugs and validation issues.

### File Structure

- `Manual/`
    - `SignUp_TestCases.txt`: Test cases, validations, and bugs for sign-up.
    - `ForgotPassword_TestCases.txt`: Test cases, validations, and bugs for forgot password.
    - `SignWithOTP_TestCases.txt`: Test cases, validations, and bugs for OTP sign-in.
    - `Login_TestCases.txt`: Test cases, validations, and bugs for login.

## How to Use

1. Navigate to the `Manual` directory to find detailed test cases and validations for each module.
2. Navigate to the `src/test/java` directory to find automation test scripts.
3. Follow the instructions in the project setup section to run automation tests.

## Dependencies

Ensure the following dependencies are included in your `pom.xml` file for the Maven project:

```xml
<dependencies>
    <!-- Selenium -->
    <dependency>
        <groupId>org.seleniumhq.selenium</groupId>
        <artifactId>selenium-java</artifactId>
        <version>4.1.0</version>
    </dependency>

    <!-- TestNG -->
    <dependency>
        <groupId>org.testng</groupId>
        <artifactId>testng</artifactId>
        <version>7.4.0</version>
        <scope>test</scope>
    </dependency>

    <!-- Cucumber -->
    <dependency>
        <groupId>io.cucumber</groupId>
        <artifactId>cucumber-java</artifactId>
        <version>6.10.4</version>
    </dependency>
    <dependency>
        <groupId>io.cucumber</groupId>
        <artifactId>cucumber-testng</artifactId>
        <version>6.10.4</version>
    </dependency>
</dependencies>
