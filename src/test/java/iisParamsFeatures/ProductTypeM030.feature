#Author: your.email@your.domain.com
#Keywords Summary :


Feature: IIS Parameters Module -Product type Screen



  Scenario: CRUD testing For Product Type  Maintenance Screen
    Given User Navigate to IISP URL login
    Then log into IISP with valid credentials
    And Click on Parameters Root OPT
    Given  Open product type maintenance
    And Input product Type Values and save
    And Retrieve Saved Product Type details
    Then Delete Product Type Created
    And Close Product Type maintenance Screen

