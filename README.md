# jCucumberNG-Framework

## Overview
Allows automation testers to easily write feature files for Cucumber and implement step definitions in Java. ngWebDriver (Protractor) offers support for AngularJS/2 web applications.

## Features
Supports the following capabilities:
- API for commonly used web testing actions
- Cucumber PicoContainer for dependency injection
- Compatibile with IE11, Edge, Chrome, Firefox (extendable)
- Uses Maven for build and test execution via cmdline
- Uses Log4j2 (SLF4J) for logging mechanism with daily rolling file
- Automated test result generation in HTML, JSON, XML
- Embedded screenshots in pretty HTML/human-readable reports

## Prerequisites
The following are required:
- JDK 1.8+
- Eclipse IDE, VSCode, IntelliJ
- Git
- Maven

## Getting Started
This section will help you run the project for the first time. No further configurations are needed at this point. We will run the tests using the project's pre-defined settings.
1. Run the following commands in the cmdline:
~~~
$ cd /path/to/workspace/
$ git clone <https or ssh>
$ cd jcucumberng-framework
$ mvn clean install
~~~
2. The command below can be used for subsequent executions:
~~~
$ mvn verify
~~~

### Test Reports
Below is the generated dynamic HTML report in `/target/cucumber-html-reports/`:
![dynamic_report_1](https://user-images.githubusercontent.com/28589393/42504692-1cbd7e74-846f-11e8-9446-53abb66222fb.PNG)

![dynamic_report_2](https://user-images.githubusercontent.com/28589393/42504707-27a9054c-846f-11e8-9a07-2989b6af4436.PNG)

Below is the generated static (default) HTML report in `/target/cucumber-html-default`:
![static_report_1](https://user-images.githubusercontent.com/28589393/42506180-baa64b4e-8473-11e8-917d-604e85fe9f14.PNG)

### Logs
Below are the generated logs in `/target/report-logs/`:
~~~
[INFO ] 2018-07-10 15:12:43,100 ScenarioHook.beforeScenario() - BEGIN TEST -> Verify Page Title
[INFO ] 2018-07-10 15:12:58,053 ScenarioHook.beforeScenario() - Browser=CHROME32_NOHEAD
[INFO ] 2018-07-10 15:12:59,562 ScenarioHook.beforeScenario() - Screen Resolution (WxH)=1920x1080
[DEBUG] 2018-07-10 15:13:10,804 HomePageNavigationSteps.I_Am_At_The_Home_Page() - Base URL=http://simplydo.com/projector/
[DEBUG] 2018-07-10 15:13:12,004 HomePageNavigationSteps.I_Should_See_Page_Title() - Window Title=Simply Do - Balance Projector
[INFO ] 2018-07-10 15:13:12,322 ScenarioHook.afterScenario() - END TEST -> Verify Page Title - PASSED
~~~
