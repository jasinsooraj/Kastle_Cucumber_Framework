Feature: IIS Parameter Vendor Information

@CRUD @Regression
  Scenario: CURD testing of Vendor Information Screen
    Given User Navigate to IISP URL login
    Then log into IISP with valid credentials
    And Click on Parameters Root OPT
    Then User Click on Vendor Information Maitenance Link
    Then User Click on Add Option
    And User Inputs data
    Then User Save Vendor Information
    Then User Close Vendor Information Tab
