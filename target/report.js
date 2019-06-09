$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Features/TekSchoolTest.feature");
formatter.feature({
  "line": 2,
  "name": "Tek School Test",
  "description": "",
  "id": "tek-school-test",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@TekSchoolTest"
    },
    {
      "line": 1,
      "name": "@alltest"
    }
  ]
});
formatter.scenarioOutline({
  "line": 20,
  "name": "Testing login with different user and pass",
  "description": "",
  "id": "tek-school-test;testing-login-with-different-user-and-pass",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 19,
      "name": "@test001"
    }
  ]
});
formatter.step({
  "line": 21,
  "name": "User click on myAccount",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "User select login from dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "User should see login page",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "User enter username \u003cuserName\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "User enter password \u003cpassword\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "Click continue button",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "User should be logged in successfully",
  "keyword": "Then "
});
formatter.examples({
  "line": 29,
  "name": "",
  "description": "",
  "id": "tek-school-test;testing-login-with-different-user-and-pass;",
  "rows": [
    {
      "cells": [
        "userName",
        "password"
      ],
      "line": 30,
      "id": "tek-school-test;testing-login-with-different-user-and-pass;;1"
    },
    {
      "cells": [
        "alihai001@gmail.com",
        "alihai001"
      ],
      "line": 31,
      "id": "tek-school-test;testing-login-with-different-user-and-pass;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 5501017971,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "User go to Tek School page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User click on test environment",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.user_go_to_Tek_School_page()"
});
formatter.result({
  "duration": 10571245957,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinitions.user_click_on_test_environment()"
});
formatter.result({
  "duration": 3045428874,
  "status": "passed"
});
formatter.scenario({
  "line": 31,
  "name": "Testing login with different user and pass",
  "description": "",
  "id": "tek-school-test;testing-login-with-different-user-and-pass;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@TekSchoolTest"
    },
    {
      "line": 1,
      "name": "@alltest"
    },
    {
      "line": 19,
      "name": "@test001"
    }
  ]
});
formatter.step({
  "line": 21,
  "name": "User click on myAccount",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "User select login from dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "User should see login page",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "User enter username alihai001@gmail.com",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "User enter password alihai001",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "Click continue button",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "User should be logged in successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.user_click_on_myAccount()"
});
formatter.result({
  "duration": 128984619,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinitions.user_select_login_from_dropdown()"
});
formatter.result({
  "duration": 577367636,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinitions.user_should_see_login_page()"
});
formatter.result({
  "duration": 29495785,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "alihai001@gmail.com",
      "offset": 20
    }
  ],
  "location": "stepDefinitions.user_enter_username_test_test_com(String)"
});
formatter.result({
  "duration": 5244621986,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "alihai001",
      "offset": 20
    }
  ],
  "location": "stepDefinitions.user_enter_password_test(String)"
});
formatter.result({
  "duration": 5167222289,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinitions.click_continue_button()"
});
formatter.result({
  "duration": 833043425,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinitions.user_should_be_logged_in_successfully()"
});
formatter.result({
  "duration": 15321127,
  "status": "passed"
});
formatter.after({
  "duration": 1092867017,
  "status": "passed"
});
});