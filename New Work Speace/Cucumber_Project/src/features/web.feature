# Author : Mamun Chowdhury
# Date : 04/24/2021


Feature: validating the login feature

Background:

Given user is on the login page

@regression
Scenario: positive testing for login

When user enters right user name
And user enters right password
And user click the login button
Then user should be able to login 

@regression
Scenario: negative testing for login

When user enters wrong user name
And user enters wrong password
And user click the login button
Then user should not be able to login 