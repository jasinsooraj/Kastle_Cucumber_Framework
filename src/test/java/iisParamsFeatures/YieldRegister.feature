Feature: Yeild-Yeild Register

@CRUD @Regression
  Scenario: CURD Testing of Yeild Roster
    Given User Navigate to IISP URL login
    Then log into IISP with valid credentials
    And Click on Parameters Root OPT
    And User Click on Yeild Register Maintenance OPT
    When User Input  Yeild Register Details
    Then User Save Register Details
    And User Retrieve Saved  Yeild Register Data 
    Then User Delete Yeild Register
