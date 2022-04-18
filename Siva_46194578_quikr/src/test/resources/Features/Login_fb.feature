 Feature: Login functionality 
 Scenario: Verification of the Login 
Given open the browser
When enter the "http://www.quikr.com/"
Then Page is displayed



And user disagree the pop up
When click login link
When user clicks on <'facebook'> link 
And  user navigates to the facebook page 
And '<MobileNumber>' has to be entered as "7702783591"
And '<Password>' has to be entered as "Siva1234"
Then login must be successful