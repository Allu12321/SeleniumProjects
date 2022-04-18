Feature: feature to test selecting  the location area 



Scenario: Verify the appropriate Search location data should display
Given open the browser
When enter the "http://www.quikr.com/"
Then Page is displayed
And user disagree the pop up
When click login link
When user enters mobile number
When clicks on verification
Then Quikr page will display successfully
And click on search location bar
When user entered "Hyderabad"
Then the appropriate name displayed 
