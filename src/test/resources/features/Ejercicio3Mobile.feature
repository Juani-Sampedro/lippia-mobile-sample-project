Feature: As a potential client i want to interact with the mobile application

  Scenario Outline: The user starts the application and add a task to a project.
    Given The app is loaded correctly
    When The user logs in the application with: <email>, <password>
    And The user clicks on the plus icon
    And The user add the hour
    And The user selects the project
    And The user press on Tasks option with: <nombretarea>
    And The user clicks on Save button
    Then The task is created

    @Demo
    Examples:
      | email                | password | nombretarea |
      | juani@gmail.com | juani2112   | Tarea1 |

