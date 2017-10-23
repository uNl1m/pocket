@archive
Feature: I want to check archive functional
    Background:
        Given I open getpocket.com
        Then I sign in

    Scenario: I want to archive some news from my list
        Then I arhive news nr 2 from my list
        And I check it in my list
        And I check it in arhive list
        And I logout

@archive
    Scenario: I want to remove news from archive
        Then I remove first news from archive list
        And I check the removed news is not displayed
        And I logout
@multiArchive
    Scenario: I want to multi-add news to archive
    And I save numbers of news in archive
    Then I go to bulk menu on my list news
    And I select the from 1 to 3 and add to archive
    And I check the list of archives
    And I logout
@multiArchive
    Scenario: I want to multi-remove news from archives
    And I save numbers of news in archive
    Then I open bulk menu
    And I select the from 1 to 3 and add to archive
    And I check number of news in archives

