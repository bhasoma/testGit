$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("E:/Sel_project/bddTest_POM/src/main/java/com/qa/features/login.feature");
formatter.feature({
  "line": 1,
  "name": "Login Test",
  "description": "",
  "id": "login-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 13145395037,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 3,
      "value": "# Scenario: Successful Login Test"
    },
    {
      "line": 4,
      "value": "# Given User is on login page"
    },
    {
      "line": 5,
      "value": "# When Title of the page is Free CRM"
    },
    {
      "line": 6,
      "value": "# Then Enter Valid Username and Password"
    },
    {
      "line": 7,
      "value": "# And Click on Login button"
    },
    {
      "line": 8,
      "value": "# Then User is on Home page"
    }
  ],
  "line": 12,
  "name": "Create New Contacts",
  "description": "",
  "id": "login-test;create-new-contacts",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 13,
  "name": "user is in login page",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "user enter \"sbhadra\" and \"Test@123\"",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "click on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "validate home page title",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "validate logged in user",
  "keyword": "Then "
});
formatter.match({
  "location": "loginStepDef.user_is_in_login_page()"
});
formatter.result({
  "duration": 233738367,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "sbhadra",
      "offset": 12
    },
    {
      "val": "Test@123",
      "offset": 26
    }
  ],
  "location": "loginStepDef.user_enter_and(String,String)"
});
formatter.result({
  "duration": 383033613,
  "status": "passed"
});
formatter.match({
  "location": "loginStepDef.click_on_login_button()"
});
formatter.result({
  "duration": 11316917242,
  "status": "passed"
});
formatter.match({
  "location": "loginStepDef.validate_home_page_title()"
});
formatter.result({
  "duration": 31067027,
  "status": "passed"
});
formatter.match({
  "location": "loginStepDef.validate_logged_in_user()"
});
formatter.result({
  "duration": 3111975208,
  "error_message": "java.lang.NullPointerException\r\n\tat com.qa.pages.HomePage.validateCorrectUserName(HomePage.java:42)\r\n\tat com.qa.stepdef.loginStepDef.validate_logged_in_user(loginStepDef.java:62)\r\n\tat ✽.Then validate logged in user(E:/Sel_project/bddTest_POM/src/main/java/com/qa/features/login.feature:17)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 817266207,
  "status": "passed"
});
});