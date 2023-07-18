$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 2,
  "name": "Ensure user landing on correct platform",
  "description": "\nAs a customer\nI want to search in google about platform\nso I can select zdnet.com",
  "id": "ensure-user-landing-on-correct-platform",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@google"
    }
  ]
});
formatter.scenario({
  "line": 9,
  "name": "Searching in google",
  "description": "",
  "id": "ensure-user-landing-on-correct-platform;searching-in-google",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 8,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "Launch the google web page",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});