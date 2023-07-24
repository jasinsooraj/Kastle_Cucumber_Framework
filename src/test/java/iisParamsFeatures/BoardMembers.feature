#Author: your.email@your.domain.com
#Keywords Summary :


Feature: IIS Parameters Module - Board Members maintenance Screen


@CRUD @Regression
  Scenario: CRUD testing For Board Members Maintenance Screen
    Given User Navigate to IISP URL login
    Then log into IISP with valid credentials
    And Click on Parameters Root OPT
    Then Navigate to BoardMembers maintenance screen
    Given user input MemberId and Cifno
    Then Save BoardMembers Details
    And Retrieve Saved BoardMembers details 
    Then Delete BoardMembers Code Created
    And Close BoardMembers maintenance Screen


