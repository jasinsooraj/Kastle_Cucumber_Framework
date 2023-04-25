#Author: akhil.tt@azentio.com
#Keywords Summary :
Feature: IIS Parameters Module -Target Miantenance Screen

  Scenario: CURD Testing of the Target Miantenance Screen
    Given User Navigate to IISP URL login
    Then log into IISP with valid credentials
    And Click on Parameters Root OPT
    Then Navigate to Target Maintenance Screen
    Given User Select Input Product class,country,year,Target Amount
    Then Save Target Maintenace
    And Retrieve Saved Target Maintenace
    Then Delete Target Maintenace Created
    And Close Target Maintenace Screen
