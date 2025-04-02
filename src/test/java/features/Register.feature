Feature: Register Functionality

Scenario: User creates account with mandatory fields

Given     User navigates the register page
When      User enters the details below fields
|firstName          |TestingBaBa             |
|lastName           |A                       |
|emailId            |TestingBaba123@gmail.com|
|telephone          |9879879870              |
|password           |12345                   |
And       User click on the privacy policy
And       User click on the continue button
Then      User should get validation message accounts has created successfully
 
 
Scenario: User creates account with all  fields

Given      User navigates the register page
When       User enters the details below fields
|firstName       |TestingBaBa              |
|lastName        |B                        |
|emailId         |TestingBaba1234@gmail.com|
|telephone       |9879879870               |
|password        |12345                    |
And       User click on the privacy policy
And       User selects the yes button of the newsletters
And       User click on the continue button
Then      User should get validation message accounts has created successfully 