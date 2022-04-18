Feature:  debit card payment functionality
Scenario Outline: To check the user able to make a Debitcard payment
Given go to website
When enter the " http://www.Quikr.com/"
Then click on "<add to cart>" button
And select the "<items>"in the cart
Then navigate to "<payment page>"
And given valid "<details>" (ATM card number, CVV, Acunt holdername, valid date etc )
Then Click on"< submit>"
Then Redirect the after successful payment
Then payment should be done
Then Unique oreder_id also gereated

Examples:
| Debitcard number | Holder name|| CVV ||Card Expdate ||status |
| 5324xxxxxxx6545 | Ravikumar || 8xx ||25-08-2023 ||success |
| 4523xxxxxxx8696 | Srihari || 3xx || 11-04-2025|| Fail |