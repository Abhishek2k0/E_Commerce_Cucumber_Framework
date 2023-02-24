Feature: Account Login Test

Scenario: Login with valid username and password
Given Open browser
When Enter the url "https://practice.automationtesting.in/my-account/"
And Enter registered username and password
And Click on Login button
Then User must be logged in to webpage