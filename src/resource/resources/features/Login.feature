Feature: Login Functionality

Scenario: Login with valid credentials

Given   User navigates the login page
When    User enters the valid email id "TestingA123@gmail.com" in the mail id field
And     User enters the valid password "12345" in the password field
And     User clicks on the login button
Then    User should be login successfully


Scenario: Login with invalid credentials

Given   User navigates the login page
When    User enters the invalid email id "1234TestingA123@gmail.com" in the mail id field
And     User enters the valid password "1234554321" in the password field
And     User clicks on the login button
Then    User should get proper warning message

Scenario:  Login with invalid email id

Given   User navigates the login page
When    User enters the valid email id "123421TestingA123@gmail.com" in the mail id field
And     User enters the invalid password "12345" in the password field
And     User clicks on the login button
Then    User should get proper warning message

Scenario: Login with invalid password

Given   User navigates the login page
When    User enters the invalid email id "TestingA123@gmail.com" in the mail id field
And     User enters the invalid password "1234554321" in the password field
And     User clicks on the login button
Then    User should get proper warning message

Scenario: Login with without credentials
Given   User navigates the login page
When    User enters the do not email id "" in the mail id field
And     User enters the do not password "" in the password field
And     User clicks on the login button
Then    User should get proper warning message