$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("bkitest.feature");
formatter.feature({
  "line": 3,
  "name": "to validate login credentials",
  "description": "",
  "id": "to-validate-login-credentials",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@LoginTag"
    }
  ]
});
formatter.background({
  "line": 6,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 7,
  "name": "the browser chrome is open",
  "keyword": "Given "
});
formatter.match({
  "location": "BKILoginStep.the_browser_chrome_is_open()"
});
formatter.result({
  "duration": 8255633336,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "",
  "description": "",
  "id": "to-validate-login-credentials;",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "the details on the screen",
  "rows": [
    {
      "cells": [
        "companycode"
      ],
      "line": 11
    },
    {
      "cells": [
        "wfbknim"
      ],
      "line": 12
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "click on submit button",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "logged in sucessfully",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "goto homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "BKILoginStep.the_details_on_the_screen(DataTable)"
});
formatter.result({
  "duration": 3905337397,
  "status": "passed"
});
formatter.match({
  "location": "BKILoginStep.click_on_submit_button()"
});
formatter.result({
  "duration": 1390014108,
  "status": "passed"
});
formatter.match({
  "location": "BKILoginStep.logged_in_sucessfully()"
});
formatter.result({
  "duration": 79065058,
  "error_message": "java.lang.AssertionError: String mismatched for g9ursa\r\n\tat org.junit.Assert.fail(Assert.java:88)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat com.training.cucumber.steps.BKILoginStep.logged_in_sucessfully(BKILoginStep.java:66)\r\n\tat ✽.When logged in sucessfully(bkitest.feature:14)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "BKILoginStep.goto_homepage()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 3290840325,
  "status": "passed"
});
});