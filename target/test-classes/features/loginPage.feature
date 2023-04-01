Feature: validating Adactin page
Scenario: Loign page validation with valid credential
Given user is on  Adcatin Hotel
When user enter the user name and password
When user search hotel in hotel page
When user select hotel in hotel page
When user book hotel in booking page
Then user verify the order 

|