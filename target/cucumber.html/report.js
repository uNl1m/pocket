$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("signIn.feature");
formatter.feature({
  "line": 2,
  "name": "Sign In via Email and password",
  "description": "",
  "id": "sign-in-via-email-and-password",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@signIn"
    }
  ]
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "I open getpocket.com",
  "keyword": "Given "
});
formatter.match({
  "location": "MyStepdefs.i_open_getpocket_com()"
});
formatter.result({
  "duration": 5568995153,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "Sign In via correct email address",
  "description": "",
  "id": "sign-in-via-email-and-password;sign-in-via-correct-email-address",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "I sign in",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "I see my user name",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "I logout",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefs.sign_in()"
});
formatter.result({
  "duration": 7431108944,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.i_see_my_user_name()"
});
formatter.result({
  "duration": 44655712,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.i_logout()"
});
formatter.result({
  "duration": 1183562450,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "I open getpocket.com",
  "keyword": "Given "
});
formatter.match({
  "location": "MyStepdefs.i_open_getpocket_com()"
});
formatter.result({
  "duration": 612024743,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Check validation message with invalid user name",
  "description": "",
  "id": "sign-in-via-email-and-password;check-validation-message-with-invalid-user-name",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 13,
  "name": "I sign invalid user name",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "I should see the validation error message",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefs.i_sign_invalid_user_name()"
});
formatter.result({
  "duration": 1092485250,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.i_should_see_the_validation_error_message()"
});
formatter.result({
  "duration": 514461486,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "I open getpocket.com",
  "keyword": "Given "
});
formatter.match({
  "location": "MyStepdefs.i_open_getpocket_com()"
});
formatter.result({
  "duration": 426181978,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Check validation message with invalid passwword",
  "description": "",
  "id": "sign-in-via-email-and-password;check-validation-message-with-invalid-passwword",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 17,
  "name": "I sign invalid password",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "I should see the validation error message",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefs.i_sign_invalid_password()"
});
formatter.result({
  "duration": 2423546531,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.i_should_see_the_validation_error_message()"
});
formatter.result({
  "duration": 924753787,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "I open getpocket.com",
  "keyword": "Given "
});
formatter.match({
  "location": "MyStepdefs.i_open_getpocket_com()"
});
formatter.result({
  "duration": 395821787,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "Check validation message with empty fields",
  "description": "",
  "id": "sign-in-via-email-and-password;check-validation-message-with-empty-fields",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 21,
  "name": "I sign in with empty fields",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "I should see the validation error messages",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefs.i_sign_in_with_empty_fields()"
});
formatter.result({
  "duration": 1394422411,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.i_should_see_the_validation_error_messages()"
});
formatter.result({
  "duration": 167668262,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "I open getpocket.com",
  "keyword": "Given "
});
formatter.match({
  "location": "MyStepdefs.i_open_getpocket_com()"
});
formatter.result({
  "duration": 513579262,
  "status": "passed"
});
formatter.scenario({
  "line": 25,
  "name": "I want to check that my list does\u0027t display after login by another user",
  "description": "",
  "id": "sign-in-via-email-and-password;i-want-to-check-that-my-list-does\u0027t-display-after-login-by-another-user",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 24,
      "name": "@content"
    }
  ]
});
formatter.step({
  "line": 26,
  "name": "I sign in",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "I save numbers of the news",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "I logout",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "I login by another user",
  "keyword": "When "
});
formatter.step({
  "line": 30,
  "name": "I check news from first loginned user",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.sign_in()"
});
formatter.result({
  "duration": 3663948412,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.i_save_numbers_of_the_news()"
});
formatter.result({
  "duration": 95771260,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.i_logout()"
});
formatter.result({
  "duration": 977868253,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.i_login_by_another_user()"
});
formatter.result({
  "duration": 2060119156,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.i_check_news_from_first_loginned_user()"
});
formatter.result({
  "duration": 14454783,
  "status": "passed"
});
});