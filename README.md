
---

## Mortgage-Project

This repository contains a **Mortgage Calculator Project**, designed to help real estate agents, mortgage brokers, and homebuyers calculate mortgage payments and determine loan eligibility.

### Features
- **User-Friendly Interface**: A web-based application built with Bootstrap for input collection and result display.
- **Dynamic Calculations**: Backend service calculates monthly payments, total interest, and eligibility based on user-provided financial information.
- **Loan Eligibility Assessment**: Determines if a user qualifies for a loan based on their income and expenses.
- **RESTful API**: Backend service exposes endpoints for frontend integration.

---

### Technologies Used
- **Backend**: Java, Spring Boot
- **Frontend**: HTML, CSS (Bootstrap), JavaScript
- **Tools**: Maven for dependency management, Git for version control
- **Testing Environment**: Embedded Tomcat server

---

### How to Run

#### Prerequisites
1. Java 8 or later installed on your system.
2. Maven installed (if not using an IDE like IntelliJ IDEA).
3. Git installed.

#### Steps
1. Clone the repository:
   ```bash
   git clone https://github.com/Freedomshine/Mortgage-Project.git
   cd Mortgage-Project
   ```

2. Build the project:
   ```bash
   mvn clean install
   ```

3. Run the Spring Boot application:
   ```bash
   mvn spring-boot:run
   ```

4. Open the application in your browser:
    - Navigate to `http://localhost:8080/` to access the Mortgage Calculator.

---

### API Endpoints

- **POST** `/api/mortgage/calculate`
    - **Description**: Accepts user financial information and calculates mortgage details.
    - **Request Body**:
      ```json
      {
        "propertyValue": 500000,
        "downPayment": 100000,
        "interestRate": 5.0,
        "loanTermInYears": 30,
        "annualIncome": 120000,
        "otherDebts": 5000
      }
      ```
    - **Response**:
      ```json
      {
        "qualified": true,
        "monthlyPayment": 2147.29,
        "totalInterestPaid": 50000.25,
        "recommendationMessage": "You qualify for the mortgage."
      }
      ```

---

### Folder Structure

```plaintext
Mortgage-Project/
├── src/
│   ├── main/
│   │   ├── java/org/oop/mortgage/
│   │   │   ├── controller/
│   │   │   │   └── MortgageController.java
│   │   │   ├── model/
│   │   │   │   ├── MortgageInput.java
│   │   │   │   └── MortgageResult.java
│   │   │   └── service/
│   │   │       └── ExcelCalculationService.java
│   │   ├── resources/
│   │   │   ├── static/
│   │   │   │   └── index.html
│   │   │   └── application.properties
│   └── test/
├── .gitignore
├── pom.xml
└── README.md
```

---

### Contribution
Contributions are welcome! Please follow these steps:
1. Fork the repository.
2. Create a new branch for your feature/bug fix.
3. Commit your changes and submit a pull request.

---

### License
This project is licensed under the [MIT License](LICENSE).

---

### Author
Created by **Freedomshine**. For inquiries, please contact at [GitHub](https://github.com/Freedomshine).
