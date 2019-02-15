$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("creditscore.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# this is my comment"
    }
  ],
  "line": 4,
  "name": "This feature is for testing saction of loan with validation credit score",
  "description": "",
  "id": "this-feature-is-for-testing-saction-of-loan-with-validation-credit-score",
  "keyword": "Feature",
  "tags": [
    {
      "line": 3,
      "name": "@Sanity"
    },
    {
      "line": 3,
      "name": "@Base"
    }
  ]
});
formatter.scenarioOutline({
  "line": 9,
  "name": "",
  "description": "",
  "id": "this-feature-is-for-testing-saction-of-loan-with-validation-credit-score;",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 10,
  "name": "the username and password",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "the SSN number",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "the credit score of user is \"\u003ccreditscore\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "keep the loan on \"\u003cstatus\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 15,
  "name": "",
  "description": "",
  "id": "this-feature-is-for-testing-saction-of-loan-with-validation-credit-score;;",
  "rows": [
    {
      "cells": [
        "creditscore",
        "status"
      ],
      "line": 16,
      "id": "this-feature-is-for-testing-saction-of-loan-with-validation-credit-score;;;1"
    },
    {
      "cells": [
        "450",
        "rejected"
      ],
      "line": 17,
      "id": "this-feature-is-for-testing-saction-of-loan-with-validation-credit-score;;;2"
    },
    {
      "cells": [
        "556",
        "hold"
      ],
      "line": 18,
      "id": "this-feature-is-for-testing-saction-of-loan-with-validation-credit-score;;;3"
    },
    {
      "cells": [
        "654",
        "approved"
      ],
      "line": 19,
      "id": "this-feature-is-for-testing-saction-of-loan-with-validation-credit-score;;;4"
    },
    {
      "cells": [
        "711",
        "approved"
      ],
      "line": 20,
      "id": "this-feature-is-for-testing-saction-of-loan-with-validation-credit-score;;;5"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 457847,
  "status": "passed"
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
  "name": "the browser is open",
  "keyword": "Given "
});
formatter.match({
  "location": "CreditScoreBackground.the_browser_is_open()"
});
formatter.result({
  "duration": 269620213,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "",
  "description": "",
  "id": "this-feature-is-for-testing-saction-of-loan-with-validation-credit-score;;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@Base"
    },
    {
      "line": 3,
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "the username and password",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "the SSN number",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "the credit score of user is \"450\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "keep the loan on \"rejected\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "CreditScoreStep.the_username_and_password()"
});
formatter.result({
  "duration": 554667,
  "status": "passed"
});
formatter.match({
  "location": "CreditScoreStep.the_SSN_number()"
});
formatter.result({
  "duration": 709334,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "450",
      "offset": 29
    }
  ],
  "location": "CreditScoreStep.the_credit_score_of_user_is_amount(int)"
});
formatter.result({
  "duration": 8302772,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "rejected",
      "offset": 18
    }
  ],
  "location": "CreditScoreStep.keep_the_loan_on_hold(String)"
});
formatter.result({
  "duration": 2916925,
  "status": "passed"
});
formatter.after({
  "duration": 3919181,
  "status": "passed"
});
formatter.before({
  "duration": 789333,
  "status": "passed"
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
  "name": "the browser is open",
  "keyword": "Given "
});
formatter.match({
  "location": "CreditScoreBackground.the_browser_is_open()"
});
formatter.result({
  "duration": 520206,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "",
  "description": "",
  "id": "this-feature-is-for-testing-saction-of-loan-with-validation-credit-score;;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@Base"
    },
    {
      "line": 3,
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "the username and password",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "the SSN number",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "the credit score of user is \"556\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "keep the loan on \"hold\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "CreditScoreStep.the_username_and_password()"
});
formatter.result({
  "duration": 188307,
  "status": "passed"
});
formatter.match({
  "location": "CreditScoreStep.the_SSN_number()"
});
formatter.result({
  "duration": 90257,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "556",
      "offset": 29
    }
  ],
  "location": "CreditScoreStep.the_credit_score_of_user_is_amount(int)"
});
formatter.result({
  "duration": 1046154,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "hold",
      "offset": 18
    }
  ],
  "location": "CreditScoreStep.keep_the_loan_on_hold(String)"
});
formatter.result({
  "duration": 149333,
  "status": "passed"
});
formatter.after({
  "duration": 125949,
  "status": "passed"
});
formatter.before({
  "duration": 491487,
  "status": "passed"
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
  "name": "the browser is open",
  "keyword": "Given "
});
formatter.match({
  "location": "CreditScoreBackground.the_browser_is_open()"
});
formatter.result({
  "duration": 715077,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "",
  "description": "",
  "id": "this-feature-is-for-testing-saction-of-loan-with-validation-credit-score;;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@Base"
    },
    {
      "line": 3,
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "the username and password",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "the SSN number",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "the credit score of user is \"654\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "keep the loan on \"approved\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "CreditScoreStep.the_username_and_password()"
});
formatter.result({
  "duration": 207590,
  "status": "passed"
});
formatter.match({
  "location": "CreditScoreStep.the_SSN_number()"
});
formatter.result({
  "duration": 205949,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "654",
      "offset": 29
    }
  ],
  "location": "CreditScoreStep.the_credit_score_of_user_is_amount(int)"
});
formatter.result({
  "duration": 861539,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "approved",
      "offset": 18
    }
  ],
  "location": "CreditScoreStep.keep_the_loan_on_hold(String)"
});
formatter.result({
  "duration": 329436,
  "status": "passed"
});
formatter.after({
  "duration": 328615,
  "status": "passed"
});
formatter.before({
  "duration": 195693,
  "status": "passed"
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
  "name": "the browser is open",
  "keyword": "Given "
});
formatter.match({
  "location": "CreditScoreBackground.the_browser_is_open()"
});
formatter.result({
  "duration": 1564309,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "",
  "description": "",
  "id": "this-feature-is-for-testing-saction-of-loan-with-validation-credit-score;;;5",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@Base"
    },
    {
      "line": 3,
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "the username and password",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "the SSN number",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "the credit score of user is \"711\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "keep the loan on \"approved\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "CreditScoreStep.the_username_and_password()"
});
formatter.result({
  "duration": 4144822,
  "status": "passed"
});
formatter.match({
  "location": "CreditScoreStep.the_SSN_number()"
});
formatter.result({
  "duration": 260103,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "711",
      "offset": 29
    }
  ],
  "location": "CreditScoreStep.the_credit_score_of_user_is_amount(int)"
});
formatter.result({
  "duration": 368821,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "approved",
      "offset": 18
    }
  ],
  "location": "CreditScoreStep.keep_the_loan_on_hold(String)"
});
formatter.result({
  "duration": 3878155,
  "status": "passed"
});
formatter.after({
  "duration": 798770,
  "status": "passed"
});
formatter.uri("login.feature");
formatter.feature({
  "line": 3,
  "name": "for login",
  "description": "",
  "id": "for-login",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Smoke"
    },
    {
      "line": 1,
      "name": "@Base"
    }
  ]
});
formatter.before({
  "duration": 234257,
  "status": "passed"
});
formatter.before({
  "duration": 291282,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "the the user credentials",
  "description": "",
  "id": "for-login;the-the-user-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@DBConnection"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "the user details",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 8
    },
    {
      "cells": [
        "venkat",
        "testing"
      ],
      "line": 9
    },
    {
      "cells": [
        "tripti",
        "hello"
      ],
      "line": 10
    },
    {
      "cells": [
        "mike",
        "secret"
      ],
      "line": 11
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "credentials are validated",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "take user to home page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStep.the_user_details(DataTable)"
});
formatter.result({
  "duration": 7058874,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.credentials_are_validated()"
});
formatter.result({
  "duration": 153436,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.take_user_to_home_page()"
});
formatter.result({
  "duration": 106256,
  "status": "passed"
});
formatter.after({
  "duration": 55384,
  "status": "passed"
});
});