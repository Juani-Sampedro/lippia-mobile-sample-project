
Feature: As a potential client i want to interact with the mobile application

  Scenario Outline: The user starts the application and switch a toggle button.
    Given The app is loaded correctly
    When The user logs in the application with: <email>, <password>
    And The user clicks on the menu icon
    And The user press on Settings option
    And The user clicks on Enable dark mode toggle icon
    Then The dark mode is on

    @Demo
    Examples:
      | email                | password |
      | juani@gmail.com | juani2112   |
