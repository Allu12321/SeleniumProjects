Feature: feature to test the login/register page has loaded for valid details
	
Background:
   Given open the browser
   When enter "http://www.quikr.com/"
   And user clicks on register button
   
   
Scenario Outline: Verification of  Register page
And user enters valid mobile number '<mobilenumber>'
When user enters valid name '<name>'

And user enters valid email address '<Email>'
And user enters valid password  '<password>'
And user clicks on send otp button
And user  enters otp manually
And user clicks on register button
Then user Successful created account in applicaion and is redirected to home page of quikr

Examples:
   |name|mobilenumber|Email|Password|
   |Siva|7702783591|siva@gmail.com|Siva1234|
   