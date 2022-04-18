
 Feature: Login functionality 
 Scenario: Verification of the Login 
Given open the browser
When enter the "http://www.quikr.com/"
Then Page is displayed



And user disagree the pop up
When click login link
When user clicks on <'google'> link 
And  user navigates to the google page 
And '<Email>' has to be entered as "allu38969@gmail,com"
And '<Password>' has to be entered as "Siva12345"
Then login must be successful