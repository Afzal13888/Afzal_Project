Feature: Report Application tests

Scenario: Login should be success

Given user enter the username as "mac870748"	
And user enter the password as "Mohammed@144"
When user click on the login button
Then Login should be success

#Scenario: Login should not be success
#
#Given user enter the username as mac870748	
#And user enter the password as laiba@11
#When user click on the login button
#But Login should not be success