  Feature: feature to test Login/Register functionality

Scenario: Check user should be able to get appropriate error message
Given user is on home page
When enter the "http://www.quikr.com/"
Then user click on <Register> link
And user enters invalid '<MobileNUmber>'
And User click on continue
Then the application throughs error message

Examples:

   |MobileNumber|
   |77027835|