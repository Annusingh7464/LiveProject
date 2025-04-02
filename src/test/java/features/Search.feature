Feature: Search Functionality

Scenario: User search a valid product

Given     User opens the  web application
When      User enter  valid product "HP" in the search fields
And       User clicks on the search button
Then      User should get displayed valid product



Scenario: User search a invalid product

Given     User opens the  web application
When      User enter invalid product "Honda" in the search fields
And       User clicks on the search button
Then      User should get proper message about product



#Scenario: User search a  product without enter the product name

#Given     User opens the  web applicationWhen      User enter " " in the search fields
#And       User clicks on the search button
#Then      User should get proper message about product




