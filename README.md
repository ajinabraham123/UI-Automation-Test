# UI Automation Test: EbayAdvancedSearch

This project demonstrates UI automation testing using Cucumber and Selenium WebDriver. The project includes two test scenarios, `EbayHome.feature` and `EbayAdvancedSearch.feature`, to validate the functionality of eBay's homepage and advanced search page.

---

## **Project Structure**

```
uiautomation2024/
├── .idea/ # IntelliJ project files 
├── report/ # Test reports (if configured) 
├── src/ 
│ ├── test/ 
│ │ ├── features/ # Cucumber feature files 
│ │ │ ├── EbayHome.feature 
│ │ │ ├── EbayAdvancedSearch.feature 
│ │ ├── java/ 
│ │ │ ├── steps/ # Step definition files 
│ │ │ │ ├── EbayHomeSteps.java 
│ │ │ │ ├── EbayAdvancedSearchSteps.java 
│ │ │ ├── testRunner/ # Cucumber test runner (if applicable) 
├── webdrivers/ # Chromedriver executable 
│ ├── chromedriver 
├── pom.xml # Maven configuration file 
└── README.md # Project instructions
```
## **Setup Instructions**

### **1. Prerequisites**
- Ensure the following tools are installed on your system:
  - **Java** (OpenJDK 8 or higher)
  - **Maven** (3.6 or higher)
  - **Google Chrome** (Version 131.0.6778.139)
- Download the compatible Chromedriver for your system:
  [Chrome for Testing](https://googlechromelabs.github.io/chrome-for-testing/#stable).



### **2. Installation**
1. Clone this repository to your local machine.
2. Replace the Chromedriver in the `webdrivers/` folder:
   - Ensure it is executable:
     ```bash
     chmod +x webdrivers/chromedriver
     ```
3. Open the project in IntelliJ IDEA or your preferred IDE.

---

### **3. Running the Tests**
To execute the tests, follow these steps:

1. Navigate to the project directory in the terminal:
   ```bash
   cd uiautomation2024
   ```
Run the tests using Maven:

```bash

mvn test
```
View the results in the terminal. Successful execution will display:

```vbnet
Process finished with exit code 0
```
Feature Files
EbayHome.feature
Tests navigation to the Advanced Search page from the eBay home page.

```gherkin
@P1
Feature: Ebay Home Page Scenarios

  Scenario: Advanced Search Link
    Given I am on Ebay Home Page
    When I click on Advanced Link
    Then I navigate to the Advanced Search page
EbayAdvancedSearch.feature
Tests navigation to the eBay homepage by clicking on the logo from the Advanced Search page.
```

```gherkin

Feature: Ebay Advanced Search Page

  Scenario: Ebay Logo on Advanced Search Page
    Given I am on Ebay Advanced Search Page
    When I click on Ebay Logo
    Then I am navigated to Ebay Home Page
Troubleshooting
If Chromedriver fails to execute:
Verify its compatibility with your browser version.
Ensure it has the correct file permissions (chmod +x).
For CDP warnings, they can be ignored unless critical functionality is impacted.
```


## Author
Name: Ajin Abraham
Email: lnu.aj@northeastern.edu
Date: 10 December 2024

