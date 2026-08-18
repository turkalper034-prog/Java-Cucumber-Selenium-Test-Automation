# Cucumber Selenium Login Automation

A web UI test automation project developed using **Java, Selenium WebDriver, Cucumber, and JUnit 4**.

The project demonstrates **BDD (Behavior Driven Development)** principles by writing test scenarios in Gherkin syntax and implementing them with Selenium WebDriver.

## 🚀 Technologies

* Java
* Selenium WebDriver
* Cucumber
* JUnit 4
* Maven
* WebDriverManager
* Gherkin
* Page Object Model (POM)

## 📌 Project Features

* BDD-based test scenarios
* Cucumber Feature files
* Scenario Outline and Examples
* Selenium WebDriver automation
* Page Object Model structure
* Reusable WebDriver management
* Automated login test scenarios
* JUnit 4 test runner

## 🧪 Test Scenario

The project currently contains an automated login scenario covering:

1. Navigate to the login page
2. Enter username
3. Enter password
4. Click the login button
5. Verify the successful login message

Example Gherkin structure:

```gherkin
Feature: Login functionality

  Scenario Outline: Login with valid credentials
    Given go to login page
    And user types username as "<username>"
    And user types as password "<password>"
    When click button
    Then assert to success message

    Examples:
      | username | password |
      | testuser | password |
```

## 📂 Project Structure

```text
src
├── test
│   ├── java
│   │   ├── runner
│   │   ├── stepdefinitions
│   │   ├── pages
│   │   └── utils
│   │
│   └── resources
│       └── features
│           └── exampleScenario.feature
│
└── pom.xml
```

## ▶️ Running the Tests

Clone the repository:

```bash
git clone https://github.com/YOUR_USERNAME/Cucumber-Selenium-Login-Automation.git
```

Navigate to the project directory:

```bash
cd Cucumber-Selenium-Login-Automation
```

Run the tests with Maven:

```bash
mvn test
```

## 🎯 Purpose

The purpose of this project is to practice and demonstrate **test automation using Selenium and Cucumber with Java**, while applying BDD principles and a maintainable project structure.

## 👨‍💻 Author

**Alper Türk**

This project is part of my ongoing journey in **QA Automation and Software Testing**.
