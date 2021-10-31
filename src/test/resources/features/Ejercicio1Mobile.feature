Feature: As a potential client i want to interact with the mobile application

  Scenario Outline: The user starts the application and log in to the app.
    Given The app is loaded correctly
    When The user logs in the application with: <email>, <password>
    Then Home page is displayed

    @Demo
    Examples:
      | email                | password |
      | juani@gmail.com | juani2112   |
