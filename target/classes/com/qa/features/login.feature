Feature: Login Test

# Scenario: Successful Login Test
# Given User is on login page
# When Title of the page is Free CRM
# Then Enter Valid Username and Password
# And Click on Login button
# Then User is on Home page



Scenario: Create New Contacts
Given user is in login page
Then user enter "sbhadra" and "Test@123"
Then click on login button
Then validate home page title
Then validate logged in user