@myList
Feature: I want to save news to my list on dashboard
    Background:
        Given I open getpocket.com
        Then I sign in

    Scenario: Add the fifth news from the list
        Then go to recommended news
        And add news nr 5 from the list
        Then check title of added news on my list
        And I logout

    Scenario: I want to delete the first news from my list
        Then I delete the first news
        And I check that news is deleted from my list


