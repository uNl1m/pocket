@favorite
Feature: I want to add/remove news to the favorite list and check multi-add and multi-remove
    Background:
             Given I open getpocket.com
            Then I sign in

@addToFavorite
    Scenario: I want to add news to the favorite list
    Then I add the first news in my list to the favorite
    And I check the news in my favorite list
    And I logout

@removeFromFavoriteList
    Scenario: I want to remove news from favorite list
    Then I remove first news from favorite list
    And I check the removed news is not displayed
    And I logout
@multiAdd
    Scenario: I want to multi-add news to favorite
    And I save numbers of news in favorites
    Then I go to bulk menu on my list news
    And I select the from 1 to 3 and add to favorite
    And I check the list of favorites
    And I logout
@multiRemove
    Scenario: I want to multi-remove news from favorite
    And I save numbers of news in favorites
    Then I open bulk menu
    And I select the from 1 to 3 and add to favorite
    And I check number of news in favorites

