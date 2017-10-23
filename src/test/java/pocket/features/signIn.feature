    @signIn
Feature: Sign In via Email and password
    Background:
        Given I open getpocket.com


    Scenario: Sign In via correct email address
        Then I sign in
        Then I see my user name
        And I logout

    Scenario: Check validation message with invalid user name
        Then I sign invalid user name
        And I should see the validation error message

    Scenario: Check validation message with invalid passwword
         Then I sign invalid password
         And I should see the validation error message

    Scenario: Check validation message with empty fields
        Then I sign in with empty fields
        And I should see the validation error messages

@content
    Scenario: I want to check that my list does't display after login by another user
        Then I sign in
        And I save numbers of the news
        And I logout
        When I login by another user
        Then I check news from first loginned user



