Feature:Login page application
  Description:orange HRM application
  @test
  Scenario:Login with valid username and password
    Given open url
    When enter username
    And enter password
    And click on login button
    Then user login success