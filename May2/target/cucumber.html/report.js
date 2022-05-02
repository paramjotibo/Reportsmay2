$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/Feature/login.feature");
formatter.feature({
  "line": 1,
  "name": "Report Testing",
  "description": "",
  "id": "report-testing",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "to check reports",
  "description": "",
  "id": "report-testing;to-check-reports",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user is on homage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user click jomage",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "all pops up",
  "keyword": "Then "
});
formatter.match({
  "location": "Def2.user_is_on_homage()"
});
formatter.result({
  "duration": 242567800,
  "status": "passed"
});
formatter.match({
  "location": "Def2.user_click_jomage()"
});
formatter.result({
  "duration": 208400,
  "status": "passed"
});
formatter.match({
  "location": "Def2.all_pops_up()"
});
formatter.result({
  "duration": 263300,
  "status": "passed"
});
});