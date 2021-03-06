Feature: Login into application

  Scenario Outline: Positive test validating login
    Given Initialize driver with chrome browser
    And navigate to "https://www.rahulshettyacademy.com/#/index" site
    And click on Login link in Home page to landIn SignIn Page
    When userName enters <username> and <password> and logs in
    Then verify user is successfully logged in
    And close the browser

    Examples: 
      | username             | password  |
      | piyushmnit@gmail.com | Aabha@123 |
      | dd@gmail.com         | dd        |