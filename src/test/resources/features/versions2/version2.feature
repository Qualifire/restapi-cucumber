Feature: the version2 can be retrieved
  Scenario: client makes call to GET /version2
    When the secondclient calls
    Then the client receives status code2 of 200
    And the client receives server version2 2