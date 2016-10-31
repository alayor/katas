Feature: Find the minimum number of steps to find the exit in a Maze

  Scenario: Exit is found at 0, 0
    Given The exit row 0 and exit column 0 with following maze:
      | 0 | 0 | 0 | 0 |
      | 1 | 0 | 1 | 0 |
      | 1 | 0 | 0 | 0 |
    Then the result should be 0

  Scenario: Exit is found at 1, 1
    Given The exit row 1 and exit column 1 with following maze:
      | 0 | 0 | 0 | 0 |
      | 1 | 0 | 1 | 0 |
      | 1 | 0 | 0 | 0 |
    Then the result should be 2

  Scenario: Exit is found at 2, 3
    Given The exit row 2 and exit column 3 with following maze:
      | 0 | 0 | 0 | 0 |
      | 1 | 1 | 1 | 0 |
      | 1 | 1 | 1 | 0 |
    Then the result should be 5

  Scenario: Exit not found
    Given The exit row 1 and exit column 1 with following maze:
      | 0 | 0 | 0 |
      | 0 | 1 | 0 |
      | 1 | 0 | 1 |
    Then the result should be -1
