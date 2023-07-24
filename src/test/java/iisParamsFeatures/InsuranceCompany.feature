#Author: your.email@your.domain.com
#Keywords Summary :


Feature: IIS Parameters Module - Insurance Companies maintenance Screen


@CRUD @Regression
  Scenario: CRUD testing For Insurance Companies Maintenance Screen
    Given User Navigate to IISP URL login
    Then log into IISP with valid credentials
    And Click on Parameters Root OPT
    Then Navigate to Insurance Companies maintenance screen
    Given user input Code and Description 
    Then Save Insurance Companies Details
    And Retrieve Saved Insurance Companies details 
    Then Delete Insurance Companies Code Created
    And Close Insurance Companies maintenance Screen


