Feature: Test login functionality

  @smoke
  Scenario Outline: Check login is successful with valid credentials
    Given user is on login page
    When user enters <username> and <password>
    And Clicks on Login button
    Then user is navigating to the Homepage

    @valid
    Examples: 
      | username | password |
      | Admin    | admin123 |

    @invalid
    Examples: 
      | username | password |
      | Admin123 | abc123   |
