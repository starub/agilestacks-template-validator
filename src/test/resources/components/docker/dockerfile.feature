Feature: Dockerfile sanity check
  Check that required fields are not empty

  Scenario: FROM field is not empty
    Given Dockerfile with empty FROM field
    When Validating field FROM
    Then Mandatory validation should fail