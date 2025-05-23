Feature: Login Function for Orange HRM Application

 # Scenario Outline: - to define multiple scenarios
 # Scenario: - to define only one scenario
  Scenario Outline: : TC-0001 Valid Login for Orange HRM
    Given user is on the login page
    And user enter "<username>" and "<password>"
    And user clicks the login button


    Examples:
     | username | password   |
     | Admin    | admin123   |
     | Invalid  | invalid123 |