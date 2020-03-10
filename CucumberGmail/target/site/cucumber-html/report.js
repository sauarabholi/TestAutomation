$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/com/selenium/gmail/Login.feature");
formatter.feature({
  "name": "Login into gmail",
  "description": "  I want to use this template for my feature file",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Login"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Logging into Rediff",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Login"
    }
  ]
});
formatter.step({
  "name": "I open \u003cBrowser\u003e",
  "keyword": "Given "
});
formatter.step({
  "name": "I go to gmaiUrl",
  "keyword": "And "
});
formatter.step({
  "name": "I Login inside application",
  "keyword": "And ",
  "rows": [
    {
      "cells": [
        "saurabholi.qa@gmail.com",
        "Test@123T"
      ]
    }
  ]
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Browser",
        "Result"
      ]
    },
    {
      "cells": [
        "Chrome",
        "success"
      ]
    },
    {
      "cells": [
        "Mozilla",
        "success"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Logging into Rediff",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Login"
    },
    {
      "name": "@Login"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I open Chrome",
  "keyword": "Given "
});
formatter.match({
  "location": "GenericSteps.openBrowser(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I go to gmaiUrl",
  "keyword": "And "
});
formatter.match({
  "location": "GenericSteps.navigate(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Login inside application",
  "rows": [
    {
      "cells": [
        "saurabholi.qa@gmail.com",
        "Test@123T"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "ApplicationSteps.login(String\u003e)"
});
formatter.result({
  "error_message": "java.lang.NullPointerException\r\n\tat com.selenium.webdriver.WebConnector.type(WebConnector.java:90)\r\n\tat com.selenium.webdriver.WebConnector.login(WebConnector.java:175)\r\n\tat com.selenium.steps.ApplicationSteps.login(ApplicationSteps.java:28)\r\n\tat ✽.I Login inside application(src/test/resources/com/selenium/gmail/Login.feature:28)\r\n",
  "status": "failed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Logging into Rediff",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Login"
    },
    {
      "name": "@Login"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I open Mozilla",
  "keyword": "Given "
});
formatter.match({
  "location": "GenericSteps.openBrowser(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I go to gmaiUrl",
  "keyword": "And "
});
formatter.match({
  "location": "GenericSteps.navigate(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Login inside application",
  "rows": [
    {
      "cells": [
        "saurabholi.qa@gmail.com",
        "Test@123T"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "ApplicationSteps.login(String\u003e)"
});
formatter.result({
  "error_message": "java.lang.NullPointerException\r\n\tat com.selenium.webdriver.WebConnector.type(WebConnector.java:90)\r\n\tat com.selenium.webdriver.WebConnector.login(WebConnector.java:175)\r\n\tat com.selenium.steps.ApplicationSteps.login(ApplicationSteps.java:28)\r\n\tat ✽.I Login inside application(src/test/resources/com/selenium/gmail/Login.feature:28)\r\n",
  "status": "failed"
});
formatter.after({
  "status": "passed"
});
});