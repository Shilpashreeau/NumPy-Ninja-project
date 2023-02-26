## NumPy-Ninja-project
## DsAlgo Project
###### Introduction 
Numpy Ninja’s “Data Structures and Algorithms(Ds Algo)” Project is learning tool It provides an excellent guide to implement algorithms from scratch like Arrays, Linked lists, Stack, Queue, Tree, Graph algorithms in Python
###### Techstacks
* Maven - Dependency management
* Java-Language used
* Selenium Webdriver
* Cucumber with Junit - BDD approach
* Allure-reports - Reporting
* Extent-reports-Reporting
###### Running Project
To run this project, Open Git bash or command prompt / power shell and navigate to the project directory type mvn clean test command to run features

$ cd Project Directory

$ mvn clean test
###### Features will be run :

Home.feature

Register.feature

Signin.feature

Array.feature

LinkedList.feature

Stack.feature

Queue.feature

Tree.feature

Graph.feature

###### HTML Report:
Report will be generated tо directory: target/

###### Extent report :
Report will be generated tо directory: test-output/

###### Develop automation scripts using BDD approach - Cucumber-Java 

Tests are written in the Cucumber framework using the Gherkin Syntax. More about Gherkin & Cucumber can be found at https://cucumber.io/docs/cucumber/

###### The Page Object Design Pattern (Selenium PageFactory) 

The Page Object Pattern technique provides a solution for working with multiple web pages and prevents unwanted code duplication and enables an uncomplicated solution for code maintenance. In general, every page application is represented by a unique class of its own and the page element inspection will be implemented in every class. When A test fails due to selector that is no longer valid/have changed, and that selector may be used by many other steps. By having all selectors at single place, fixing one selector on the page object could repair a number of failing tests that were affected by the same selector.

In this framwork we have used Selenium PageFactory : Page Factory is an inbuilt Page Object Model concept for Selenium WebDriver and it is very optimized.
