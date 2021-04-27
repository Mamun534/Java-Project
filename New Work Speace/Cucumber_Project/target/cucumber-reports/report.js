$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("web.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# Author : Mamun Chowdhury"
    },
    {
      "line": 2,
      "value": "# Date : 04/24/2021"
    }
  ],
  "line": 5,
  "name": "validating the login feature",
  "description": "",
  "id": "validating-the-login-feature",
  "keyword": "Feature"
});
formatter.background({
  "line": 7,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 9,
  "name": "user is on the login page",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 12,
  "name": "positive testing for login",
  "description": "",
  "id": "validating-the-login-feature;positive-testing-for-login",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 11,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "user enters right user name",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "user enters right password",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "user click the login button",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "user should be able to login",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.background({
  "line": 7,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 9,
  "name": "user is on the login page",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 20,
  "name": "negative testing for login",
  "description": "",
  "id": "validating-the-login-feature;negative-testing-for-login",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 19,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 22,
  "name": "user enters wrong user name",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "user enters wrong password",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "user click the login button",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "user should not be able to login",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});