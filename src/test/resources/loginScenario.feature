Feature: Validating Login credentials for ExpleoSurance

  Scenario: Validation of Login using valid credentials
    Given User should be in login Page
    When User Enter Username and Password
    And User should click the LoginButton
    Then Login Should be successful