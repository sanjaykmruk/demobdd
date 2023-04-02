Feature: FizzBuzz Game

  Scenario: Play FizzBuzz for Fizz
    When user enters 3
    Then response from FizzBuzz is "Fizz"
  Scenario: Play FizzBuzz for Buzz
    When user enters 5
    Then response from FizzBuzz is "Buzz"
  Scenario: Play FizzBuzz for FizzBuzz
    When user enters 15
    Then response from FizzBuzz is "FizzBuzz"
  Scenario: Play FizzBuzz for EmptyResponse
    When user enters 4
    Then response from FizzBuzz is ""

  Scenario Outline: Play FizzBuzz by passing any number divisible by 3
    When user enters "<number>"
    Then response from FizzBuzz is "<response>"

    Examples:
      |number |response |
      |3      |Fizz     |
      |6      |Fizz     |
      |9      |Fizz     |
      |18     |Fizz     |