    
    Feature: Login functionality
Scenario: Successful getting error message with inValid credientials
Given User navigates to the website "http://www.quikr.com/"
When user clicks on login button
And User logs in through login button by using '<Email>' as "Email"
And '<Password>' has to be entered as invalid "Password"
Then user  must be get error message successful