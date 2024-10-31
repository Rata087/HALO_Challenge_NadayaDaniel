# HALO Test Automation Challenge (Daniel Nadaya)


## How to Set up this Test Automation Environment
- Download and Install Java SE Development Kit 17.0.7 --> https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html
- Configure JAVA PATH --> https://www.java.com/en/download/help/path.html
- Download Maven --> https://maven.apache.org/download.cgi
- Install Maven --> https://maven.apache.org/install.html
- Configure Maven PATH --> https://stackoverflow.com/questions/45119595/how-to-add-maven-to-the-path-variable

--------------------------------------------------------------------------------------------------------
--------------------------------------------------------------------------------------------------------

# Challenge Objectives

### Let’s automate at least two scenarios for any page of your consideration:
 Selected Page: https://www.saucedemo.com/

## 1. Choose a framework and programming language(if you choose webdriverIO, we appreciate it if you choose to use cucumber framework).
   1. Java.
   2. Serenity.
   3. Cucumber.

--------------------------------------------------------------------------------------------------------

## 2. Identify which scenarios you want to automate and give an explanation of why and how you covered them.
   1. Login validations (3 scenarios).
      - Justification: The login process is critical for any application, and by testing different user types (valid, invalid, and locked-out), we ensure that authentication and access are managed properly. Automated login validations ensure consistent functionality of error messages and authentication flows.
   2. Verify that an item can be added to the cart and is visible on the cart page (1 scenario).
      - Justification: Adding an item to the cart is a core business functionality, and this test ensures that item selection and cart visibility logic work correctly. This scenario is frequently used in various flows (adding multiple items, editing the cart, etc.), making it ideal for automation, which quickly detects any changes in the cart functionality.
   3. Sorting inventory items (2 scenarios).
      - Justification: Sorting inventory is important but not critical for the user flow. This type of test may be subject to UI changes or data variations, which could affect test stability. Therefore, it is suitable for periodic manual review or automated testing that does not need to run every cycle. Automated sorting tests would be most effective in a controlled environment with static data.
   4. Ensure the user can complete the purchase/checkout process (1 scenario).
      - Justification: The purchase flow is one of the most critical parts of the system as it directly impacts the business. Automating this scenario allows for quick detection of issues, ensuring the integrity of the purchase flow. This test is ideal for each test cycle, validating that the payment, confirmation, and notification steps function as expected.

--------------------------------------------------------------------------------------------------------

## 3. Please do not forget to specify everything that we need to consider in order to run and understand the work you’ve done.

### Running the tests
You can use any IDE you want, such us IntelliJ IDEA, VSCode, etc...

To run this Test Automation project, you can either just run the TestRunner class (using this method the report will NOT be created), or run either mvn clean verify from the command line.

The test results will be recorded in the _target/site/serenity/index.html_ directory (The full path will be indicated at the end of the run in the SERENITY REPORTS section).

By default, the test will run using Chrome browser.

### Commands to run the tests through the console:
- To run the complete suite:
    -     mvn clean verify -Dcucumber.filter.tags="@HaloChallenge"

--------------------------------------------------------------------------------------------------------
--------------------------------------------------------------------------------------------------------
