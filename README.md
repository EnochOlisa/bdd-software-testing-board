# bdd-software-testing-board
A test suite to test an app called Software Testing Board (https://magento.softwaretestingboard.com/). Uses the Selenium Framework and Cucumber to implement BDD.

**Testcases**
------
User Login Test Cases
------
Test Case 1: Valid Login
Pre-condition: The user must have an existing account.
Steps:
Navigate to the login page.
Enter valid email and password.
Click on the login button.
Expected Result: The user should be logged in successfully and redirected to the homepage.

Test Case 2: Invalid Login
Pre-condition: The user must have an existing account.
Steps:
Navigate to the login page.
Enter an invalid email or password.
Click on the login button.
Expected Result: An error message should appear indicating that the login credentials are incorrect.

Test Case 3: Empty Fields on Login
Pre-condition: N/A
Steps:
Navigate to the login page.
Leave the email and password fields empty.
Click on the login button.
Expected Result: The system should display an error message indicating that the fields cannot be empty.