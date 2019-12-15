$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Features/TekSchoolScenario.feature");
formatter.feature({
  "line": 1,
  "name": "Tek School Scenarios",
  "description": "",
  "id": "tek-school-scenarios",
  "keyword": "Feature"
});
formatter.before({
  "duration": 5912921227,
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
  "name": "User is on TekSchool page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User Click on Test Environment link",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "User should see Test Environment page",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefinitions.user_is_on_TekSchool_page()"
});
formatter.result({
  "duration": 8730510632,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinitions.user_Click_on_Test_Environment_link()"
});
formatter.result({
  "duration": 2142726574,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinitions.user_should_see_Test_Environment_page()"
});
formatter.result({
  "duration": 11102747,
  "status": "passed"
});
formatter.scenario({
  "line": 80,
  "name": "SDET2019AUG_SDET_Register_Form_Test",
  "description": "",
  "id": "tek-school-scenarios;sdet2019aug-sdet-register-form-test",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 78,
      "name": "@SDET_RF_DBV"
    }
  ]
});
formatter.step({
  "line": 81,
  "name": "User click on my Account menu on top of the page",
  "keyword": "When "
});
formatter.step({
  "line": 82,
  "name": "User click on register my Account menu",
  "keyword": "And "
});
formatter.step({
  "line": 83,
  "name": "User fill register form with below information",
  "rows": [
    {
      "cells": [
        "Suzy",
        "Amini",
        "ricardo.meador@sakilacustomer.org",
        "2021234453",
        "test@123"
      ],
      "line": 84
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 85,
  "name": "User click on \u0027yes\u0027 radio button for subscribe",
  "keyword": "And "
});
formatter.step({
  "line": 86,
  "name": "User click on continue button",
  "keyword": "And "
});
formatter.step({
  "line": 87,
  "name": "User should see your \u0027Your Account Has Been Created!\u0027",
  "keyword": "Then "
});
formatter.step({
  "line": 88,
  "name": "User conncects to DataBase",
  "keyword": "When "
});
formatter.step({
  "line": 89,
  "name": "User sends Query \u0027select * from public.customer where email\u003d\u0027ricardo.meador@sakilacustomer.org\u0027\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 90,
  "name": "User verify account is created with email \u0027ricardo.meador@sakilacustomer.org\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "TekSchoolScenarioStepDef.user_click_on_my_Account_menu_on_top_of_the_page()"
});
formatter.result({
  "duration": 1865951177,
  "status": "passed"
});
formatter.match({
  "location": "TekSchoolScenarioStepDef.user_click_on_register_my_Account_menu()"
});
formatter.result({
  "duration": 1407937014,
  "status": "passed"
});
formatter.match({
  "location": "TekSchoolScenarioStepDef.user_fill_register_form_with_below_information(DataTable)"
});
formatter.result({
  "duration": 2053167856,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "yes",
      "offset": 15
    }
  ],
  "location": "TekSchoolScenarioStepDef.user_click_on_yes_radio_button_for_subscribe(String)"
});
formatter.result({
  "duration": 873529760,
  "status": "passed"
});
formatter.match({
  "location": "TekSchoolScenarioStepDef.user_click_on_continue_button()"
});
formatter.result({
  "duration": 815242528,
  "status": "passed"
});
formatter.match({
  "location": "TekSchoolScenarioStepDef.user_should_see_your_Your_Account_Has_Been_Created()"
});
formatter.result({
  "duration": 127910429,
  "status": "passed"
});
formatter.match({
  "location": "TekSchoolScenarioStepDef.user_conncects_to_DataBase()"
});
formatter.result({
  "duration": 7735437,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "select * from public.customer where email\u003d\u0027ricardo.meador@sakilacustomer.org\u0027",
      "offset": 18
    }
  ],
  "location": "TekSchoolScenarioStepDef.user_sends_Query(String)"
});
formatter.result({
  "duration": 1397717,
  "error_message": "java.lang.NullPointerException\n\tat utilities.DBUtilities.runQuery(DBUtilities.java:38)\n\tat stepDefinitions.TekSchoolScenarioStepDef.user_sends_Query(TekSchoolScenarioStepDef.java:138)\n\tat ✽.And User sends Query \u0027select * from public.customer where email\u003d\u0027ricardo.meador@sakilacustomer.org\u0027\u0027(Features/TekSchoolScenario.feature:89)\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "ricardo.meador@sakilacustomer.org",
      "offset": 43
    }
  ],
  "location": "TekSchoolScenarioStepDef.user_verify_account_is_created_with_email(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 780306598,
  "status": "passed"
});
});