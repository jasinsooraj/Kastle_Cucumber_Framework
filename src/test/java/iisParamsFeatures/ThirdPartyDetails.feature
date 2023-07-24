#Author: Akhil Lal akhil.tt@azentio.com
Feature: IIS Parameter-Third Party Maintenace M067MT

@CRUD @Regression
  Scenario: CURD Testing Of Third Party Maintenace M067MT
    Given User Navigate to IISP URL login
    Then log into IISP with valid credentials
    And Click on Parameters Root OPT
    And User Opened Third Party Maintenace M067MT OPT
    When User Input Data
    And User Save Third Party Maintenace M067MT
    And User Retrieve and Delate Third Party Maintenace Saved Data
    Then User validate the outcomes and Close Browse
