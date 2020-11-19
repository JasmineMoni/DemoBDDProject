@tag
Feature: Validating Login Screen with multiple values
Scenario Outline: Validate succesful Login with multiple data
Given user should have launched the application & present on home screen
When valid username is "<username>" & password is "<password>" entered
And clicked on login link
Then home screen with username should be get displayed
Examples:
|username                | password   |
|manipal822@gmail.com    | manipal123 |
|manzoorrocks1@gmail.com | manzoor    |