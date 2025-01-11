Feature: Report Application tests

Scenario Outline: Login should success

Given user enter the1 "<username>"	
And user enter the "<password>"
When user click on the login button
Then Login should be success

Examples:
|username|password|
|mac870748|Mohammed@145|
|lac870748|Mohammed@143|

#Scenario: Login should not be success
#
#Given user enter the username as mac870748	
#And user enter the password as laiba@11
#When user click on the login button
#But Login should not be success