Feature: feature to test opening the login functionality



Scenario: Verification of the Login 
Given open the browser
When enter the "http://www.quikr.com/"
Then Page is displayed



And user disagree the pop up
When click login link
When user enters mobile number
When clicks on verification
Then page will display